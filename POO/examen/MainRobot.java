package POO.examen;

import java.util.ArrayList;

public class MainRobot {
    // Probar todos los métodos de la clase Robot
    public static void main(String[] args) {
        // Crear un objeto de la clase Robot
        Robot robot1 = new Robot("R1", "Modelo1", 10);
        // Crear un objeto de la clase RobotIndustrial
        RobotIndustrial robot2 = new RobotIndustrial("R2", "modelo2", 20, 335432);
        RobotIndustrial robot3 = new RobotIndustrial("R3", "modelo3", 18, 334189);
        RobotIndustrial robot4 = new RobotIndustrial("R4", "modelo4", 89, 33489);
        RobotIndustrial robot5 = new RobotIndustrial("R5", "modelo2", 57, 3348519);
        RobotIndustrial robot6 = new RobotIndustrial("R6", "modelo4", 48, 334891);
        // Crear un objeto de la clase RobotInvestigacion
        RobotInvestigacion robot7 = new RobotInvestigacion("R7", "modelo3", 481, "Investigación3");
        RobotInvestigacion robot8 = new RobotInvestigacion("R8", "modelo2", 489, "Investigación3");
        RobotInvestigacion robot9 = new RobotInvestigacion("R9", "modelo10",4289, "Investigación3");
        RobotInvestigacion robot10 = new RobotInvestigacion("R10", "modelo9", 489, "Investigación3");
        ArrayList<Robot> robots = new ArrayList<Robot>();
        robots.add(robot1);
        robots.add(robot2);
        robots.add(robot3);
        robots.add(robot4);
        robots.add(robot5);
        robots.add(robot6);
        robots.add(robot7);
        robots.add(robot8);
        robots.add(robot9);
        robots.add(robot10);
        ListaArray lista = new ListaArray(robots);

        lista.mostrarRobot("R2");
        lista.ordenarRobots();
    }
}
