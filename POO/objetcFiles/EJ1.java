package POO.objetcFiles;

class EJ1 {
    public static void main(String[] args) {
        // Create an array of Alumnos
        Alumnos[] arr = new Alumnos[10];
        Alumnos[] arrOrdenado = new Alumnos[10];

        // Crear 10 alumnos y almacenarlos en el array
        arr[0] = new Alumnos(1951, "Juan", "Perez");
        arr[1] = new Alumnos(2189, "Maria", "Lopez");
        arr[2] = new Alumnos(3907, "Pedro", "Gomez");
        arr[3] = new Alumnos(4451, "Ana", "Garcia");
        arr[4] = new Alumnos(5785, "Luis", "Fernandez");
        arr[5] = new Alumnos(6519, "Carmen", "Rodriguez");
        arr[6] = new Alumnos(8159, "Javier", "Sanchez");
        arr[7] = new Alumnos(5293, "Rosa", "Martin");
        arr[8] = new Alumnos(4294, "Sergio", "Jimenez");
        arr[9] = new Alumnos(1582, "Elena", "Perez");

        arrOrdenado = Alumnos.ordenarAlumnos(arr);
        Alumnos.guardarAlumnos(arrOrdenado);
    }
}
