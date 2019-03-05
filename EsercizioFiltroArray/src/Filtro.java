/**
 * Progettare una classe Filtro costruita con un array di interi.
 * La classe implementa operazioni che permettono di ottenere nuovi sotto-array  dall'array iniziale:
 * 
 * 1) passabasso( ) restituisce tutti gli elementi <= k nell'ordine iniziale
 * 2) passaAlto( ) restituisce tutti gli elementi >= k nell'ordine iniziale
 * 3) filtra( ) restituisce l'array iniziale da cui sono state eliminate tutte le occorrenze dell'intero passato in input
 * 4) filtra( ) seconda versione che restituisce l'array iniziale da cui vengono eliminate tutte le occorrenze di interi 
 *    presenti nell'array passato in input
 *    
 * Se Filtro viene costruito con l'array {1, 2, 10, 2, 42, 7, 8};
 * passoBase(8) restituisce {1, 2, 2, 7, 8}
 * passoAlto(8) restituisce {10, 42}
 * filtra(2) restituisce {1, 10, 42, 7, 8}
 * filtra(new int[] {2, 7, 42}) restituisce {1, 10, 8}
 * @author anacletostefanopili
 *
 */

import java.util.Arrays;

public class Filtro {
	private int[] array;
	
	public Filtro (int[] array) {
		this.array = array;
		
	}
	
	public void passaBasso (int n) {
		
		System.out.print("{ ");
		int [] arrayCopia = Arrays.copyOf(array, array.length);		// Creo un copia dell'array
		
		for (int k=0; k<arrayCopia.length; k++) {	                // Scorro tutto l'array
			
			if(arrayCopia[k] <= n) {								// Se il valore attuale nell'array è <= del valore passato n
				this.array[k] = arrayCopia[k];						// Salvo quel valore
				System.out.print(array[k]+" ");                     // Stampo il valore
			}
		}
		System.out.println("}");
		
	}
	
	public void passaAlto (int n) {
		
		System.out.print("{ ");
		
		int [] arrayCopia = Arrays.copyOf(array, array.length);		// Creo un copia dell'array
		
		for (int k=0; k<arrayCopia.length; k++) {					// Scorro tutto l'array
			
			if(arrayCopia[k] >= n) {								// Se il valore attuale nell'array è >= del valore passato n
				this.array[k] = arrayCopia[k];						// Salvo quel valore
				System.out.print(array[k]+" ");						// Stampo il valore
				
			}
		}
		System.out.println("} ");
		
	}
	
	public void filtra (int n) {
		
		int [] arrayCopia = Arrays.copyOf(array, array.length);		// Creo un copia dell'array
		
		System.out.print("{ ");
		
		for (int k=0; k<arrayCopia.length; k++) {					// Scorro tutto l'array
			if(arrayCopia[k] != n) {								// Se il valore attuale nell'array è != al valore passato n non devo toglierlo
				this.array[k] = arrayCopia[k];						// Salvo quel valore				
				System.out.print(array[k]+" ");						// Stampo il valore
			}
		}
		System.out.println("}");
	}
	
	/**
	 * Il seguente metodo restituisce un vettore che ha tutti gli elementi iniziali meno quelli passati in ingresso.
	 * @param n lista di elementi da eliminare dal vettore
	 */
	public void filtra (int[] n) {
		
		boolean valorePresente = true;	// Permette di capire se un valore è presente 
		int [] arrayCopia = Arrays.copyOf(array, array.length);		// Creo una copia del mio vettore
		
		System.out.print("{ ");
		
		for (int k=0; k<arrayCopia.length; k++) {	// Scorro il primo vettore
			for (int j=0; j<n.length; j++) {	    // Scorro il vettore passato al metodo
				if(arrayCopia[k] == n[j]) {         // Se l'elemnto del vettore originario è presente nel vettore passato
					valorePresente = true;          // Il valore è presente quindi non dovrò stamparlo
					break;                          // Esco alla prima occorrenza (altrimenti vado in false se non è più presente)
				} else valorePresente = false;      // Se il valore non è presente dovrò stamparlo
			}
			if(!valorePresente) {					// Se terminato il ciclo risulta che il valore non è presente
				this.array[k] = arrayCopia[k];		// Copio il valore
				System.out.print(array[k]+" ");     // Stampo il valore non presente
			}
	
		}
		System.out.println("}");
	}
}
