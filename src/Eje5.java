import java.util.Scanner;

public class Eje5 {

	public static void main(String[] args) {
		// Escriba un programa que lea un NIF(largo == 9) y compruebe que su letra es correcta, es decir, la letra introducida por el usuario se corresponde con la calculada. Algoritmo para el cálculo del NIF:
		
		//Pedir DNI
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca su DNI: ");
		String dni = sc.nextLine();
		char [] codigo = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		// Separar la parte numérica de la ultima letra
		// String cadena2 = DNI.substring(0,DNI.leght()-1)
		String letra = dni.substring(0, dni.length()-1);
		
		// Convierte cadena 2 a int numero
		int numero = Integer.parseInt(letra);
		// Obtiene la letra del DNI con el resto
		// numero % 23
		int resto = numero %23;
		
		// Comprueba la letra calculada con la letra introducida DNI.charAT(DNI.leght()-1)
		// dni.charAt(dni.length()-1);
		
		// if (resto == dni.charAt(dni.length()-1));
		
		
		if (resto == dni.charAt(dni.length()-1))
			  System.out.println("El DNI " + dni + " con número " + numero + " y " + letra + " no son correctos");
		
			else
			  System.out.println("El DNI " + dni + " con número " + numero + " y " + letra + " son correctos");
		
		sc.close();
}

}
