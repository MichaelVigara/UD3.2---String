import java.util.Scanner;

public class Eje1 {

	public static void main(String[] args) {
		// Invertir cadena. Crea un programa en Java que solicite al usuario la introducción de una cadena de caracteres y devuelva esta cadena invertida.
		
		//Pedir cadena
				Scanner sc = new Scanner (System.in);
				System.out.print("Introduce una cadena: ");
				String cadena = sc.nextLine();
				
				//Darle la vuelta
				StringBuilder aux = new StringBuilder(cadena);
				aux.reverse();
				String aux2 = aux.toString();
				
				//Imprimir resultado
				System.out.println(aux2);
				
				sc.close();
			}
	}


	
	
