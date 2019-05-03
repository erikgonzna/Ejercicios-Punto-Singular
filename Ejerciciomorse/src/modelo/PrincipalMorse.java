package modelo;

import java.util.HashMap;
import java.util.Scanner;

public class PrincipalMorse {
	static HashMap<String, String> codigoMorse = new HashMap<>();
	static HashMap<String, String> texto = new HashMap<>();
	public static void main(String[] args) {
		texto.put("A",".-");
		texto.put("B","-...");
		texto.put("C","-.-.");
		texto.put("D","-..");
		texto.put("E",".");
		texto.put("F","..-.");
		texto.put("G","--.");
		texto.put("H","....");
		texto.put("I","..");
		texto.put("J",".---");
		texto.put("K","-.-");
		texto.put("L",".-..");
		texto.put("M","--");
		texto.put("N","-.");
		texto.put("O","---");
		texto.put("P",".--.");
		texto.put("Q","--.-");
		texto.put("R",".-.");
		texto.put("S","...");
		texto.put("T","-");
		texto.put("U","..-");
		texto.put("V","...-");
		texto.put("W",".--");
		texto.put("X","-..-");
		texto.put("Y","-.--");
		texto.put("Z","--..");
		texto.put("1",".----");
		texto.put("2","..---");
		texto.put("3","...--");
		texto.put("4","....-");
		texto.put("5",".....");
		texto.put("6","-....");
		texto.put("7","--...");
		texto.put("8","---..");
		texto.put("9","----.");
		texto.put("0","-----");

		codigoMorse.put(".-", "A");
		codigoMorse.put("-...", "B");
		codigoMorse.put("-.-.", "C");
		codigoMorse.put("-..", "D");
		codigoMorse.put(".", "E");
		codigoMorse.put("..-.", "F");
		codigoMorse.put("--.", "G");
		codigoMorse.put("....", "H");
		codigoMorse.put("..", "I");
		codigoMorse.put(".---", "J");
		codigoMorse.put("-.-", "K");
		codigoMorse.put(".-..", "L");
		codigoMorse.put("--", "M");
		codigoMorse.put("-.", "N");
		codigoMorse.put("---", "O");
		codigoMorse.put(".--.", "P");
		codigoMorse.put("--.-", "Q");
		codigoMorse.put(".-.", "R");
		codigoMorse.put("...", "S");
		codigoMorse.put("-", "T");
		codigoMorse.put("..-", "U");
		codigoMorse.put("...-", "V");
		codigoMorse.put(".--", "W");
		codigoMorse.put("-..-", "X");
		codigoMorse.put("-.--", "Y");
		codigoMorse.put("--..", "Z");
		codigoMorse.put(".----", "1");
		codigoMorse.put("..---", "2");
		codigoMorse.put("...--", "3");
		codigoMorse.put("....-", "4");
		codigoMorse.put(".....", "5");
		codigoMorse.put("-....", "6");
		codigoMorse.put("--...", "7");
		codigoMorse.put("---..", "8");
		codigoMorse.put("----.", "9");
		codigoMorse.put("-----", "0");
		//.... --- -.--   . ...
		String codigo = "";
		String palabra = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el código morse a decifrar o una palabra a codificar:");
		codigo = scan.nextLine();
		palabra = decodificar(codigo);
		if(palabra != null) {
			System.out.println("Su palabra es:\n"+palabra);
		}else {
			palabra = codificar(codigo);
			if(palabra != null) {
				System.out.println("Su codigo morse es:\n"+palabra);
			}else {
				System.out.println("Ha ingresado un símbolo inválido");
			}
		}
	}
	public static String decodificar(String cod) {
		String decod = "";
		String [] palabras = cod.split("   ");
		String [] letras;
		for (int i = 0; i < palabras.length; i++) {
			letras=palabras[i].split(" ");
			for (int j = 0; j < letras.length; j++) {
				String aux = codigoMorse.get(letras[j]);
				if(aux != null) {
					decod+=aux;
				}else {
					return null;
				}
			}
			decod+=" ";
		}
		return decod;
	}
	public static String codificar(String cod) {
		String decod = "";
		for (int i = 0; i < cod.length(); i++) {
			String aux = texto.get(cod.charAt(i)+"");
			if(aux != null) {
				decod += aux;
			}else if(cod.charAt(i) == ' '){
				decod += " ";
			}else {
				return null;
			}
		}
		return decod;
	}
}
