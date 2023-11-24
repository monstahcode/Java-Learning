package  POO.examen1;

public class Prueba {
    public static void main(String[] args) {
        Mago mago = new Mago("Ahajahck Ihabreh", 4, true);
        Dragon dragon = new Dragon('V', "Ciudad del Cabo de Oro", 5);

        Mago mago2 = new Mago("Ivan Arroyo", 4, true);
        Dragon dragon2 = new Dragon('R', "Ciudad del Cabo de Oro", 5);

        Mago mago3 = new Mago("Ahajahck Ihabreh", 11, false);
        Dragon dragon3 = new Dragon('N', "Ciudad del Cabo de Oro", 5);
        Dragon dragon4 = new Dragon('A', "Ciudad del Cabo de Oro", 5);

        //Comiezo de las pruebas
        System.out.println("Comprobación del método para combatir al dragon:\n" + "Se comprobará si el Mago gana la pelaa contra el dragon, devolviendo: 'True' si ha ganado y 'False' si el mago ha sido derrotado");
        System.out.println("Primera prueba:");
        System.out.println("En esta prueba el mago tiene los siguientes atributos:");
        System.out.println("Poder: " + mago.getPoder() + "\n" + "Nombre: "+ mago.getNombre() + "\n" + "Estado: "+ mago.getEstado());
        System.out.println("En este caso el mago tendría que devolver 'true' y a que cumple con todas las condiciones para ganar al dragon:");
        System.out.println(mago.combateDragon(dragon));
        
        System.out.println("Segunda prueba:");
        System.out.println("En esta prueba el mago tiene los siguientes atributos:");
        System.out.println("Poder: " + mago2.getPoder() + "\n" + "Nombre: "+ mago2.getNombre() + "\n" + "Estado: "+ mago2.getEstado());
        System.out.println("En este caso el mago tendría que devolver 'false' y a que el nombre NO cumple conlas condiciones para ganar al dragon:");
        System.out.println(mago.combateDragon(dragon));

        System.out.println("Tercera prueba:");
        System.out.println("En esta prueba el mago tiene los siguientes atributos:");
        System.out.println("Poder: " + mago3.getPoder() + "\n" + "Nombre: "+ mago3.getNombre() + "\n" + "Estado: "+ mago3.getEstado());
        System.out.println("En este caso el mago tendría que devolver 'false' y a que pese a que el nombre cumple con todas las condiciones para ganar al dragon el mago no esta activo:");
        System.out.println(mago.combateDragon(dragon));

        System.out.println("Comprobacion del método para promocionar al mago:\n" + "El mago es promocionado dependiento de si el mago esta activo y su poder es mayor a 10 y si su nombre tiene la suma de 'h' y 'j' mayor al poder en caso de promocinar el poder se duplica");
        System.out.println("Primera prueba:");
        System.out.println("En esta prueba el mago tiene los siguientes atributos:");
        System.out.println("Poder: " + mago.getPoder() + "\n" + "Nombre: "+ mago.getNombre() + "\n" + "Estado: "+ mago.getEstado());
        System.out.println("En este caso el mago tendría que devolver promocionar ya que cumple con todas las condiciones:");
        mago.promocionaMago();
        System.out.println("Poder: " + mago.getPoder() + "\n" + "Nombre: "+ mago.getNombre() + "\n" + "Estado: "+ mago.getEstado());
        
        System.out.println("Segunda prueba:");
        System.out.println("En esta prueba el mago tiene los siguientes atributos:");
        System.out.println("Poder: " + mago2.getPoder() + "\n" + "Nombre: "+ mago2.getNombre() + "\n" + "Estado: "+ mago2.getEstado());
        System.out.println("En este caso el mago NO promocionaría ya que el nombre NO cumple con las condiciones para promocionar:");
        mago2.promocionaMago();
        System.out.println("Poder: " + mago.getPoder() + "\n" + "Nombre: "+ mago.getNombre() + "\n" + "Estado: "+ mago.getEstado());

        System.out.println("Tercera prueba:");
        System.out.println("En esta prueba el mago tiene los siguientes atributos:");
        System.out.println("Poder: " + mago3.getPoder() + "\n" + "Nombre: "+ mago3.getNombre() + "\n" + "Estado: "+ mago3.getEstado());
        System.out.println("En este caso el mago NO promocionaría  ya que el poder es muy alto:");
        mago3.promocionaMago();
        System.out.println("Poder: " + mago.getPoder() + "\n" + "Nombre: "+ mago.getNombre() + "\n" + "Estado: "+ mago.getEstado());

        System.out.println("Comprobacion para promocionar al dragon:\n" + "El dragon promociana dependiendo de su color, si empezamos desde el color verde, promocionaría a rojo, de rojo a negro y si es negro su poder se duplica");
        System.out.println("Primera prueba:");
        System.out.println("El dragon tiene los siguientes atributos:");
        System.out.println("Color: " + dragon.getColor() + "\n" + "Fuerza: " + dragon.getFuerza() + "\n" + "Nombre Ciudad: "+ dragon.getNombreCiudad());
        dragon.promocionaDragon();
        System.out.println("En este caso el dragon como es verde promociona a rojo");
        System.out.println("Color: " + dragon.getColor() + "\n" + "Fuerza: " + dragon.getFuerza() + "\n" + "Nombre Ciudad: "+ dragon.getNombreCiudad());
        
        System.out.println("Segunda prueba:");
        System.out.println("El dragon tiene los siguientes atributos:");
        System.out.println("Color: " + dragon2.getColor() + "\n" + "Fuerza: " + dragon2.getFuerza() + "\n" + "Nombre Ciudad: "+ dragon2.getNombreCiudad());
        dragon2.promocionaDragon();
        System.out.println("En este caso el dragon como es rojo promociona a negro");
        System.out.println("Color: " + dragon2.getColor() + "\n" + "Fuerza: " + dragon2.getFuerza() + "\n" + "Nombre Ciudad: "+ dragon2.getNombreCiudad());
        
        System.out.println("Tercera prueba:");
        System.out.println("El dragon tiene los siguientes atributos:");
        System.out.println("Color: " + dragon3.getColor() + "\n" + "Fuerza: " + dragon3.getFuerza() + "\n" + "Nombre Ciudad: "+ dragon3.getNombreCiudad());
        dragon3.promocionaDragon();
        System.out.println("En este caso el dragon como es negro su poder se duplica:");
        System.out.println("Color: " + dragon3.getColor() + "\n" + "Fuerza: " + dragon3.getFuerza() + "\n" + "Nombre Ciudad: "+ dragon3.getNombreCiudad());
    
        System.out.println("Cuarta prueba:");
        System.out.println("El dragon tiene los siguientes atributos:");
        System.out.println("Color: " + dragon4.getColor() + "\n" + "Fuerza: " + dragon4.getFuerza() + "\n" + "Nombre Ciudad: "+ dragon4.getNombreCiudad());
        dragon4.promocionaDragon();
        System.out.println("En este caso el dragon como tiene un color erroneo se pone verde y se promociona al rojo");
        System.out.println("Color: " + dragon4.getColor() + "\n" + "Fuerza: " + dragon4.getFuerza() + "\n" + "Nombre Ciudad: "+ dragon4.getNombreCiudad());
    }
}
