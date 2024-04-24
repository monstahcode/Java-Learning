package POO.examen;

import java.util.ArrayList;
// En un arraylist se amacenarña inforamación referida a robots. Hay dos tipos de robots: Industrialles y de investigación.
// La información común que se antiene por cada robot es: indentificador, modelo, número de piezas.
// Los robots industriales guardan además el nombre del favricante.
// Los robors de investigación almacenan el número de horas de funcionamiendo.

// se pide que se introduzcan 10 robots. Luego se pedirá el indentificador.
// En caso de que no haya robots con ese indentifica dor se mostrará un mensaje de error.
// Si el identificador existe mostrará la información del robot. Se llama a un método que para todos los robots con el mismo número de piezas y buscará al robot que siendo del mismo ntipo tiene un nombre de modelo ordenado alfabeticamente mayor al resto.
public class ListaArray {
    ArrayList<Robot> robots = new ArrayList<Robot>(10);
    
    public ListaArray(ArrayList<Robot> robots) {
        this.robots = robots;
    }

	public ArrayList<Robot> getRobots() {
		return robots;
	}

	public void setRobots(ArrayList<Robot> robots) {
		this.robots = robots;
	}

    // Perdir el identificador de un robot y mostrar su información
    public void mostrarRobot(String identificador) {
        for (Robot robot : robots) {
            if (robot.getIdentificador().equals(identificador)) {
                System.out.println(robot);
                buscarRobot(robot.getNumPiezas());
            } else {
                System.out.println("No se ha encontrado el robot con el identificador " + identificador);
            }
        }
    }

    // Para todos los robots con el mismo número de piezas que el encontrado en el paso anterior buscar al robot que siendo del mismo tipo tiene un nombre de modelo ordenado alfabeticamente mayor al resto.
    public Robot buscarRobot(int numPiezas) {
        ArrayList<Robot> robotsMismoNumPiezas = new ArrayList<Robot>();
        for (Robot robot : robots) {
            if (robot.getNumPiezas() == numPiezas) {
                robotsMismoNumPiezas.add(robot);
            }
        }
        // Buscar robot del mismo tipo(Industrial o Investigación) con el nombre de modelo ordenado alfabeticamente mayor al resto.
        Robot robotMayor = robotsMismoNumPiezas.get(0);
        for (Robot robot : robotsMismoNumPiezas) {
            if (robot.getClass().equals(robotMayor.getClass())){
                if (robot.getModelo().compareTo(robotMayor.getModelo()) > 0) {
                    robotMayor = robot;
                }
            }
        }
        // mostrar todos los datos del robotMayor
        System.out.println(robotMayor);
        return robotMayor;
    }

    // Ordenar los robots por orden alfabético de modelo y por número de puezs de mayor a menor.
    public void ordenarRobots() {
        robots.sort((robot1, robot2) -> {
            if (robot1.getModelo().compareTo(robot2.getModelo()) == 0) {
                return robot2.getNumPiezas() - robot1.getNumPiezas();
            } else {
                return robot1.getModelo().compareTo(robot2.getModelo());
            }
        });
        // Mostrar modelo, numero de piezas de los robot ordenardos
        for (Robot robot : robots) {
            System.out.println("Modelo: " + robot.getModelo() + ", Número de piezas: " + robot.getNumPiezas());
        }
    }
}

