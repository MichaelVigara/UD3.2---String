import java.util.Scanner;

public class Eje4 {

	public static void main(String[] args) {
		/* Cadena espejo. Crea un programa que reciba una cadena de caracteres y la devuelva invertida con efecto espejo, esto es, se concatena a la palabra original su
		inversa, compartiendo la última letra, que hará de espejo, por lo que la palabra obtenida se lee igual hacia adelante que hacia atrás. Por ejemplo, al introducir
		“teclado” devolverá “tecladodalcet” y al introducir “goma” devolverá “gomamog” */

		
		//Pedir cadena
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce una cadena: ");
		String cadena = sc.nextLine();
						
		//Darle la vuelta
		StringBuilder aux = new StringBuilder(cadena);
		aux.reverse();
		String aux2 = aux.toString();
						
		//Imprimir resultado
		System.out.println(cadena + aux.substring(1, aux2.length()));
						
		sc.close();
	}
}

