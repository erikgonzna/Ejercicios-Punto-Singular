package modelo;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cuadrado cuadrado = new Cuadrado();
		Cubo cubo = new Cubo();
		String menu="Opciones de C�lculos:\n"
				+ "1. Calcular �rea de un Cuadrado\n"
				+ "2. Calcular Per�metro de un Cuadrado\n"
				+ "3. Calcular Volumen de un Cubo\n"
				+ "4. Calcular Per�metro de un Cubo\n"
				+ "5. Ingresar nuevo lado\n"
				+ "6. Salir\n"
				+ "Digite su Opci�n:";
		float lado = 0;
		int opcion = 0;
		System.out.println("------------------------------------------");
		System.out.println("Ingrese el lado de su Cuadrado o Cubo en metros:");
		lado= scan.nextFloat();
		cuadrado.setLado(lado);
		cubo.setLado(lado);
		do {
			System.out.println("------------------------------------------");
			System.out.println("El valor del lado es: "+lado);
			System.out.println(menu);
			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("El �rea del cuadrado es: "+cuadrado.calcularArea()+" m2");
				System.out.println("Presione enter para continuar");
				break;
			case 2:
				System.out.println("El Per�metro del cuadrado es: "+cuadrado.calcularPerimetro()+" m");
				System.out.println("Presione enter para continuar");
				scan.nextLine();
				break;
			case 3:
				System.out.println("El Volumen del Cubo es: "+cubo.calcularVolumen()+" m3");
				System.out.println("Presione enter para continuar");
				scan.nextLine();
				break;
			case 4:
				System.out.println("El Perim�tro del cubo es: "+cubo.calcularPerimetro()+" m");
				System.out.println("Presione enter para continuar");
				scan.nextLine();
				break;
			case 5:
				System.out.println("Ingrese el lado de su Cuadrado o Cubo en metros:");
				lado= scan.nextFloat();
				cuadrado.setLado(lado);
				cubo.setLado(lado);
				System.out.println("Presione enter para continuar");
				break;
			}
			if(opcion != 6) {
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				System.out.println("�Hasta pronto!");
			}
		} while (opcion != 6);
	}
}
