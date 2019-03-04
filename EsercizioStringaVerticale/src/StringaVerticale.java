/**
 * Scrivere un metodo che legge una stringa da console e la stampa in 
 * verticale un carattere per linea.
 * 
 * @author anacletostefanopili
 *
 */

import java.util.Scanner;	// Importo la classe Scanner per leggere la stringa

public class StringaVerticale {

	public static void main(String[] args) {
		
		// Creo l'oggetto scanner per leggere la stringa
		java.util.Scanner leggiStringa = new Scanner(System.in);
		
		// Faccio inserire la stringa da stampare in verticale
		System.out.println("Digitare la stringa che si vuole stampare in verticale: ");
		String stringa = leggiStringa.nextLine();
		
		// Ciclo for per la stampa della stringa un carattere per linea
		for (int i = 0; i < (int)stringa.length(); i++) {
			System.out.println(stringa.charAt(i));
		}

	}

}