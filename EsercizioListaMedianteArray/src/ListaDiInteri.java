/**
 * Una lista è una sequenza di oggetti.
 * Implementare una classe ListDiInteri che permette le seguenti operazioni
 * 1) RESTITUISCE l'elementoi-esimo della lista
 * 2) RESTITUISCE l'indice della posizione dell'intero fornito in input
 * 3) RESTITUISCE una stringa formattata contenente la lista di interi
 * 4) RESTITUISCE la dimensione della lista
 * 5) CONTIENE un determinato intero (true o false)
 * 6) AGGIUNGE un intero in coda alla lista
 * 7) AGGIUNGE un intero nella posizione specificata
 * 8) ELIMINA la prima occorrenza di un intero dalla lista
 * 9) ELIMINA l'elemento i-esimo della lista
 * 
 * @author anacletostefanopili
 *
 */

import java.util.Arrays;

public class ListaDiInteri {
	private int[] lista;
	
	
	public ListaDiInteri () {
		this.lista = new int[0];
	}
	
	public int elementoIesimo (int i) {
		int elementoIesimo = 0;
		for(int k=0; k<lista.length; k++) {
			if (k==i) {
				elementoIesimo = lista[k];
			} 
		}
		return elementoIesimo;
	}
	
	public int indiceElemento (int n) {
		int indiceElemento = 0;
		for (int k=0; k<lista.length; k++) {
			if(k == n) {
				indiceElemento = k;
			}
		}
		return indiceElemento;
	}
	
	public void stringaLista () {
		System.out.println(Arrays.toString(lista));
	}
	
	public int dimensioneLista () {
		return lista.length;
	}
	
	public boolean contieneElemento(int n) {
		
		for(int k=0; k<lista.length; k++) {
			if (lista[k] == n) {
				return true;
			} 
		}
		return false;
	}
	
	public void aggiungiCoda (int n) {
		int dimensioneLista = lista.length;						// Calcolo il numero di elementi presenti
		if(dimensioneLista >= 0) {
			lista = Arrays.copyOf(lista, dimensioneLista+1);	//Eseguo una "copia" per aumentare le dimensioni
			lista[dimensioneLista] = n;							// Aggiungo il valore passato come parametro alla lista
		} 
	}
	
	public void aggiungiInPosizione (int n, int posizione) {
		
		int posizioneLista = posizione - 1;		// Variabile contenente la posizione nell'array
		
		
		int [] array = new int[lista.length];	// Array di appoggio utilizzato per copiare i valori 
		
		// Caso in cui si voglia inserire l'elemento in prima posizione
		if(posizioneLista == 0) {
			array[0] = n;									// Salvo nell'array di appoggio il nuovo valore da inserire
			array = Arrays.copyOf(array, lista.length+1);	// Aumento la dimensione dell'array di appoggio
			for(int i=posizione; i<array.length; i++) {		
				array[i] = lista[i-1];						// Copio nell'array di appoggio i valori della lista
			}
			lista = Arrays.copyOf(array, array.length);		// Copio nella lista i valori dell'array di appoggio
		}
		
		// Caso in cui l'elemento è in mezzo alla lista
		if(posizioneLista < lista.length) {
			for(int i=0; i<posizioneLista; i++) {
				array[i] = lista[i];						// Copio nell'array di appoggio tutti i valori della lista a sinistra del nuovo elemento
			}
			array[posizioneLista] = n;						// Salvo nell'array di appoggio il nuovo elemento nella sua posizione
			array = Arrays.copyOf(array, lista.length+1);	// Aumento la dimensione dell'array di appoggio
			for(int k=posizioneLista+1; k<array.length; k++) {
				array[k] = lista[k-1];						// Copio nell'array di appoggio tutti i valori della listaa destra del nuovo elemento
			}	
			lista = Arrays.copyOf(array, array.length);		// Copio nella lista i valori dell'array di appoggio
		}
		
		// Caso in cui si aggiunge l'elemento dopo l'ultimo già presente (in coda)
		if(posizioneLista == lista.length) {
			for (int j=0; j<lista.length; j++) {			
				array[j] = lista[j];						// Copio nell'array di appoggio tutti i valori della lista 
			}
			array = Arrays.copyOf(array, lista.length+1);	// Aumento la dimensione dell'array di appoggio
			array[array.length-1] = n;						// Salvo il nuovo elemento nell'array di appoggio
			lista = Arrays.copyOf(array, array.length);		// Copio nella lista i valori dell'array di appoggio
		}
		
	}
	
	public void eliminaPrimaOccorrenza (int n) {
		int posizioneOccorrenza = 0;
		boolean occorrenzaPresente = false;
		int[] array = new int[lista.length-1];
				
		// Verifica se è presente l'occorrenza del numero e trova la sua posizione nella lista
		for (int i=0; i<lista.length; i++) {
			if (lista[i] == n) {
				posizioneOccorrenza = i;
				occorrenzaPresente = true;
				break;
			} 
			occorrenzaPresente = false;
		}
		
		if(occorrenzaPresente) {
			if(posizioneOccorrenza == 0) {
				for(int i=0; i<array.length; i++) {
					array[i] = lista[i+1];
				}
				lista = Arrays.copyOf(array, array.length);
				
			} 
			if (posizioneOccorrenza == lista.length-1) {
				for(int i=0; i<array.length; i++) {
					array[i] = lista[i];
				}
				lista = Arrays.copyOf(array, array.length);
			} 
			if (posizioneOccorrenza != 0 && posizioneOccorrenza != lista.length - 1){
				for(int i=0; i<posizioneOccorrenza; i++) {
					array[i] = lista[i];						// Copio nell'array di appoggio tutti i valori della lista a sinistra dell'elemento da eliminare
				}
				for(int i=posizioneOccorrenza; i<array.length; i++) {
					array[i] = lista[i+1];						// Copio nell'array di appoggio tutti i valori della lista a destra dell'elemento da eliminare
				}
				lista = Arrays.copyOf(array, array.length);
			}
			
		} else {
			System.out.println("Nella lista il numero " + n + " non è presente");
		}
	}
	
	public void eliminaIesimo (int n) {
		
		int[] array = new int[lista.length-1]; // Array di appoggio per copiare i valori
				
		// Caso in cui si voglia eliminare l'elemento in prima posizione
		if(n == 1) {
			for(int i=0; i<array.length; i++) {
				array[i] = lista[i+1];
			}
			lista = Arrays.copyOf(array, array.length);
		} 
		
		// Caso in cui si voglia eliminare l'elemento in mezzo alla lista
		if (n == lista.length-1) {
			for(int i=0; i<array.length; i++) {
				array[i] = lista[i];
			}
			lista = Arrays.copyOf(array, array.length);
		} 
			
		// Caso in cui si voglia eliminare l'ultimo elemento della lista
		if (n != 1 && n != lista.length - 1){
			for(int i=0; i<n-1; i++) {
				array[i] = lista[i];						// Copio nell'array di appoggio tutti i valori della lista a sinistra dell'elemento da eliminare
			}
			for(int i=n-1; i<array.length; i++) {
				array[i] = lista[i+1];						// Copio nell'array di appoggio tutti i valori della lista a destra dell'elemento da eliminare
			}
			lista = Arrays.copyOf(array, array.length);
			
		}
	}
	
}
