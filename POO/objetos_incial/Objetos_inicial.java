package POO.objetos_incial;
import java.util.Scanner;

public class Objetos_inicial {

	public static void main(String[] args) {

		Bicycle bici1,bici2,bici3;
		int gear,speed,cadence,cantidad,opcion,bici;

		Scanner teclado=new Scanner(System.in);

		//Output Bici1
		//Asignacion de valores
		System.out.println("Bici1:");
		System.out.println("Cadence:");
		cadence=teclado.nextInt();
		System.out.println("Speed:");
		speed=teclado.nextInt();
		System.out.println("Gear:");
		gear=teclado.nextInt();
		bici1=new Bicycle(cadence,speed,gear);
		System.out.println("bici1 creada");

		//Output Bici2
		//Asignacion de valores
		System.out.println("Bici2");
		System.out.println("Cadence");
		cadence=teclado.nextInt();
		System.out.println("Speed");
		speed=teclado.nextInt();
		System.out.println("Gear");
		gear=teclado.nextInt();
		bici2=new Bicycle(cadence,speed,gear);
		System.out.println("bici2 creada");

		System.out.println("1.Cambiar Marcha\n2.Acelerar\n3.Frenar\n4.Mostrar Datos\n5.Salir");
		opcion=teclado.nextInt();

		while(opcion != 5) {

			switch (opcion) {
				case 1:
				System.out.println("1.Bici1 o 2.Bici2");
				bici=teclado.nextInt();
				while (bici<1 || bici >2) {
					System.out.println("1.Bici1 o 2.Bici2");
					bici=teclado.nextInt();
				}
				System.out.println("Nueva Marcha:");
				cantidad=teclado.nextInt();
				
				if(bici==1) {
					bici1.setGear(cantidad);

				}else {
					bici2.setGear(cantidad);
				}
				break;

				case 2:
				System.out.println("1.Bici1 o 2.Bici2");
				bici=teclado.nextInt();
				while (bici<1 || bici >2) {
					System.out.println("1.Bici1 o 2.Bici2");
					bici=teclado.nextInt();
				}
				
				System.out.println("Acelarar:");
				cantidad=teclado.nextInt();

				if(bici==1) {
					bici1.speedUp(cantidad);
				}else {
					bici2.speedUp(cantidad);
				}
				break;

				case 3:
				System.out.println("1.Bici1 o 2.Bici2");
				bici=teclado.nextInt();
				while (bici<1 || bici >2) {
					System.out.println("1.Bici1 o 2.Bici2");
					bici=teclado.nextInt();
				}
				
				System.out.println("Frenar:");
				cantidad=teclado.nextInt();

				if(bici==1) {
					bici1.applyBrake(cantidad);
				}else {
					bici2.applyBrake(cantidad);
				}
				break;
				
				case 4:
				System.out.println("1.Bici1 o 2.Bici2");
				bici=teclado.nextInt();
				while (bici<1 || bici >2) {
					System.out.println("1.Bici1 o 2.Bici2");
					bici=teclado.nextInt();
				}
				if(bici==1) {
					bici2.showdata();
				}else {
					bici2.showdata();
				}
				break;

				case 5:
				System.out.println("Gracias por usar la bici");
				System.exit(0);
			}
		}
	}
}
