package POO.test;

public class test {

    public static void main(String[] args) {
        String texto, textoFinal;
        int longitud;
        char letra1, letra2, ocurrencias;
        texto=new String("uwu");
        
        textoFinal=texto.toLowerCase();
        System.out.println(textoFinal);
        textoFinal=texto.toUpperCase();
        System.out.println(textoFinal);
        longitud=texto.length() - 1;
        letra1 = texto.charAt(0);
        letra2 = texto.charAt(1);
        System.out.println(letra1 + "" + letra2);
        letra1=texto.charAt(texto.length() - 1);
        letra2=texto.charAt(texto.length() - 2);
        System.out.println(letra2 + "" + letra1);
        ocurrencias = texto.charAt(longitud);
        int contadorOcurrencia = 0;
        for (int i = longitud; i >= 0; i--) {
            char caracterActual = texto.charAt(i);
            if (caracterActual==ocurrencias) {
                contadorOcurrencia++;
            }
        }
        System.out.println("Se ha encontado: " + contadorOcurrencia + " Ocurrencias");
        if (texto.length() > 0) {
            char primerCaracter = texto.charAt(0);

            StringBuilder nuevaCadena = new StringBuilder();

            for (int i = 0; i < texto.length(); i++) {
                char caracterActual = texto.charAt(i);
                if(caracterActual == primerCaracter) {
                        nuevaCadena.append(Character.toUpperCase(caracterActual));
                } else {
                    nuevaCadena.append(caracterActual);
                }
            }
            System.out.println(nuevaCadena.toString());
        }
        System.out.println("***" + texto + "***");
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();
        String cadenaNumerica = "123456789";
        int intNumerico = Integer.parseInt(cadenaNumerica);
        System.out.println(intNumerico);
    }
}
