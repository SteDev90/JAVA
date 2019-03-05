/**
 * Scrivere un metodo che, dato un array di stringhe e una stringa in input, restituisca 
 * true se l'array contiene la stringa,
 * false altrimenti
 * 
 * @author anacletostefanopili
 *
 */
public class EsercizioArray01 {

	public static boolean stringaPresente (String[] array, String stringa) {
		for(int k = 0; k < array.length; k++) {
			if (array[k] == stringa) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String[] array = {"Ciao" , "Banana", "Gatto"};
		String stringaRicerca = "Ciao";

		//System.out.print(array.length);
		if (stringaPresente(array, stringaRicerca)) {
			System.out.println("La stringa " + stringaRicerca + ", è presente nell'array");
		} else System.out.println("La stringa " + stringaRicerca + ", non è presente nell'array");
		
	}

}
