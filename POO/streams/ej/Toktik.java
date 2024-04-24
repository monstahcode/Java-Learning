package POO.streams.ej;

import java.util.Scanner;
import java.io.*;

class Toktik {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nombreVideo, nombreUsuario, nombreUsuarioBuscar;
        int meGusta, comentarios, duracion;

        System.out.println("Hello, world!");

        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("toktik.bin")));

            for (int i = 0; i < 40; i++) {
                System.out.println("Ingrese el nombre del video: ");
                nombreVideo = sc.nextLine();
                System.out.println("Ingrese el nombre del usuario: ");
                nombreUsuario = sc.nextLine();
                System.out.println("Ingrese el número de me gusta: ");
                meGusta = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese el número de comentarios: ");
                comentarios = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese la duración del video: ");
                duracion = Integer.parseInt(sc.nextLine());

                out.writeUTF(nombreVideo);
                out.writeUTF(nombreUsuario);
                out.writeInt(meGusta);
                out.writeInt(comentarios);
                out.writeInt(duracion);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    private static void buscarUsuario(String nombreUsuarioBuscar) throws IOException {
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("toktik.bin")))) {
            while (true) {
                String nombreVideo = in.readUTF();
                String nombreUsuario = in.readUTF();
                int meGusta = in.readInt();
                int comentarios = in.readInt();
                int duracion = in.readInt();

                if (nombreUsuario.equals(nombreUsuarioBuscar)) {
                    System.out.println("Nombre del video: " + nombreVideo);
                    System.out.println("Nombre del usuario: " + nombreUsuario);
                    System.out.println("Número de me gusta: " + meGusta);
                    System.out.println("Número de comentarios: " + comentarios);
                    System.out.println("Duración del video: " + duracion);
                }
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Video con menos megusta
    private static void videoMenosMeGusta() throws IOException {
        int meGustaMin = -1;
        String nombreVideo = null;
        String nombreUsuario = null;
        int comentarios = -1;
        int meGusta = -1;
        int duracion = -1;

        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("toktik.bin")));) {
            String nombreVideoMenosMeGusta = in.readUTF();
            String nombreUsuarioMenosMeGusta = in.readUTF();
            meGustaMin = in.readInt();
            int comentariosMenosMeGusta = in.readInt();
            int duracionMenosMeGusta = in.readInt();
            while (true) {
                nombreVideo = in.readUTF();
                nombreUsuario = in.readUTF();
                comentarios = in.readInt();
                meGusta = in.readInt();
                duracion = in.readInt();
                
                if (meGusta < meGustaMin) {
                    meGustaMin = meGusta;
                    nombreVideoMenosMeGusta = nombreVideo;
                    nombreUsuarioMenosMeGusta = nombreUsuario;
                    comentariosMenosMeGusta = comentarios;
                    duracionMenosMeGusta = duracion;
                }
            }
        } catch (EOFException eof) {
            System.out.println("Fin de fichero");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("Nombre del video con menos me gusta: " + nombreVideo);
        System.out.println("Nombre del usuario: " + nombreUsuario);
        System.out.println("Número de me gusta: " + meGusta);
        System.out.println("Número de comentarios: " + comentarios);
        System.out.println("Duración del video: " + duracion);
    }
}
