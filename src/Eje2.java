import java.util.Scanner;

public class Eje2 {

	public static void main(String[] args) {
		// Diseña un programa en Java que solicite al usuario una cadena en la que buscará y otra que será la cadena buscada. El programa indicará cuántas veces aparece la segunda cadena en la primera.
		
		Scanner sc = new Scanner (System.in);
		
		// Pide una linea de caracteres
		String cadena;
		String cadena2;
		int pos = 0;
		int contar = 0;
	
		System.out.print("Introduzca la cadena: ");
		cadena = sc.nextLine();
		
		System.out.print("Introduzca la segunda cadena que quiera buscar: ");
		cadena2 = sc.nextLine();
		
		while (pos >= 0){				
			pos = cadena.indexOf(cadena2, pos);			
			
			if (pos >= 0){
				pos++;
				contar++;
							
			}
						
		}
		
		System.out.print("Tenemos en " + cadena.toUpperCase() + " aparece " + cadena2.toUpperCase() + " repetido " + contar + " veces");
		
		sc.close();
	}
}

					
				
				
				
				
	




