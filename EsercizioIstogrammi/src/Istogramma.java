/**
 * Progettare una classe Istogramma che rappresenta la distribuzione di dati (es voti degli studenti)
 * in un intervallo da i a j fornito in input (es. da 0 a 31 - trenta e lode)
 * La classe permette di incrementare il conteggio in corrispondenza di ciascun elemento dell'intervallo 
 * memorizzando così un nuovo voto di uno studente
 * La classe può stampare a video l'istogramma corrispondente (più facile in orizzontale)
 * @author anacletostefanopili
 *
 */
public class Istogramma {
	private final int NumeroVoti = 32;
	private static int maxNumeroVoti = 10;
	private final char carattereVoto = '1';
	private int[][] istogrammaVoti;
	
	public Istogramma () {
		this.istogrammaVoti = new int[NumeroVoti][maxNumeroVoti];
	}
	
	public void aggiungiVoto (int voto) {
		boolean inserire = true;
		for (int i=0; i<NumeroVoti; i++) {
			for (int j=0; j<maxNumeroVoti; j++) {
				if ((i==voto) && (istogrammaVoti[i][j] == 0) && (inserire)) {	// Aggiunge un voto a quel voto se non è stato ancora inserito
					istogrammaVoti[i][j] = 1;
					inserire = false;
				}
				//System.out.println(i + " " + j + " " + istogrammaVoti[i][j]);
			}
		}
	}
	
	public void stampaIstogramma () {
		for (int i=0; i<NumeroVoti; i++) {
			if(i<10) {
				System.out.print(i + ") ");
			} else {
				System.out.print(i + ")");
			}
			for (int j=0; j<maxNumeroVoti; j++) {
				if (istogrammaVoti[i][j] == 1) {
					System.out.print(carattereVoto + " ");	// Stampo il carattere che rappresenta 1 voto per quel voto
				} else System.out.print("- ");
			} 
			System.out.println();
		}
	}
	
}
