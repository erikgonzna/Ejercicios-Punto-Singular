package modelo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Ingrese un número entero entre 1 y 1000");
		String num = new Scanner(System.in).nextLine();
		String romano = "";
		if(Integer.parseInt(num)<=1000) {
			if(Integer.parseInt(num) == 1000) {
				romano += "M";
			}else {
				if(Integer.parseInt(num)>=100) {
					romano+=calcularCentenas(Integer.parseInt(num.charAt(0)+"00"));
					romano+=calcularDecenas(Integer.parseInt(num.charAt(1)+"0"));
					romano+=calcularUnidades(Integer.parseInt(num.charAt(2)+""));
				}else if(Integer.parseInt(num)>=10) {
					romano+=calcularDecenas(Integer.parseInt(num.charAt(0)+"0"));
					romano+=calcularUnidades(Integer.parseInt(num.charAt(1)+""));
				}else if(Integer.parseInt(num)>=1) {
					romano+=calcularUnidades(Integer.parseInt(num.charAt(0)+""));
				}
			}
		}
		System.out.println("La conversión de "+num+" a Romano es "+romano);
	}
	public static String calcularCentenas(int numero) {
		String centenas = "";
		if(numero >= 900) {
			centenas+="CM";
		}else if(numero >= 800){	
			centenas+="DCCC";
		}else if(numero >= 700) {
			centenas+="DCC";
		}else if(numero >= 600) {
			centenas+="DC";
		}else if(numero >= 500) {
			centenas+="D";
		}else if(numero >= 400) {
			centenas+="CD";
		}else if(numero >= 300) {
			centenas+="CCC";
		}else if(numero >= 200) {
			centenas+="CC";
		}else if(numero >= 100) {
			centenas+="C";
		}
		return centenas;
	}
	public static String calcularDecenas(int numero) {
		String decenas = "";
		if(numero >= 90) {
			decenas+="XC";
		}else if(numero >= 80){	
			decenas+="LXXX";
		}else if(numero >= 70) {
			decenas+="LXX";
		}else if(numero >= 60) {
			decenas+="LX";
		}else if(numero >= 50) {
			decenas+="L";
		}else if(numero >= 40) {
			decenas+="XL";
		}else if(numero >= 30) {
			decenas+="XXX";
		}else if(numero >= 20) {
			decenas+="XX";
		}else if(numero >= 10) {
			decenas+="X";
		}
		return decenas;
	}
	public static String calcularUnidades(int numero) {
		String unidades = "";
		if(numero >= 9) {
			unidades+="IX";
		}else if(numero >= 8){	
			unidades+="VIII";
		}else if(numero >= 7) {
			unidades+="VII";
		}else if(numero >= 6) {
			unidades+="VI";
		}else if(numero >= 5) {
			unidades+="V";
		}else if(numero >= 4) {
			unidades+="IV";
		}else if(numero >= 3) {
			unidades+="III";
		}else if(numero >= 2) {
			unidades+="II";
		}else if(numero >= 1) {
			unidades+="I";
		}
		return unidades;
	}
}
