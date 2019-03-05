/**
 * Scrivere una seconda versione del metodo che restituisca la posizione della stringa trovata,
 * -1 altrimenti
 * 
 * @author anacletostefanopili
 *
 */
public class EsercizioArray02 {

	public static double stringaPresente (String[] array, String stringa) {
		for(int k = 0; k < array.length; k++) {
			if (array[k] == stringa) {
				return k;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String[] array = {"Ciao" , "Banana", "Gatto"};
		String stringaRicerca = "Sbagliato";

		//System.out.print(array.length);
		if (stringaPresente(array, stringaRicerca) != -1) {
			System.out.println("La stringa " + stringaRicerca + ", è presente nell'array in posizione: " + stringaPresente(array,stringaRicerca));
		} else System.out.println("La stringa " + stringaRicerca + ", non è presente nell'array");

	}

}
