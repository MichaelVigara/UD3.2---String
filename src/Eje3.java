import java.util.Scanner;
import java.util.StringTokenizer;

public class Eje3 {

	public static void main(String[] args) {
		// Realiza una funci�n que reciba una frase e imprima cada una de las palabras en una l�nea independiente. Se considera que las palabras se separan �nicamente por espacios.
		
		//Pedir frase
		Scanner sc = new Scanner (System.in);
		StringTokenizer str;
		System.out.print("Introduce una frase: ");
		String cadena = sc.nextLine();
		str = new StringTokenizer(cadena);
		while (str.hasMoreTokens())
		System.out.println(str.nextToken());
		
		sc.close();
	}
}