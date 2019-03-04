/**
 * Scrivere un metodo che dato un intero N dispari e positivo stampi un triangolo isoscele
 * la cui base ha esattamente N caratteri.
 * 
 * @author anacletostefanopili
 *
 */
public class StampaTriangoloIsoscele {

	public void stampaTriangolo(int n) {
		
		int numeroStampe = 1;   // La prima riga avrà solo un carattere stampato
		int numeroSpazi = n/2;	// Nella prima riga il numero di spazi è uguale alla meta degli n caratteri totali della base
		char carattere = '1';   // Carattere che verrà stampato
		
		/* Doppio ciclo for, rappresento il triangolo come una "matrice"
		 * Il ciclo con la variabile i gestisce le righe che saranno la meta + 1 della base
		 * Il ciclo con la variabile j gestisce le colonne che saranno quante tante il numero inserito
		 */
		for(int i = 0; i<=n/2; i++) {
			/*
			 *  Per ogni riga ricalcolo il numero delle stampe da effettuare nella riga successiva alla prima che devono essere sempre dispari
			 */
			if (i>0) {
				numeroStampe = i * 2 + 1;	// In ogni riga avrò due stampe in più di caratteri
			}
			/*
			 * Per ogni colonna (Sono al massimo tante quante il numero inserito)
			 */
			for(int j=0; j<=n; j++) {
				if(j <= numeroSpazi && numeroStampe % 2 != 0) {    // Se ho ancora spazi da inserire e il numero di stampe è dispari
					System.out.print(" ");                         // Stampo spazi
				} else if (numeroStampe != 0){                     // Se non devo più inserire spazi e ho caratteri da inserire
					System.out.print(carattere);                   // Stampo il carattere
					numeroStampe --;                               // Diminuisco il numero delle stampe da effettuare
				}
				
			}
			
			numeroSpazi -= 1;       // Per ogni riga il numero degli spazi diminuisce di 1	 
			System.out.println();	// Per ogni riga vado a capo con la stampa
		}
		
	}
	
	public static void main(String[] args) {
		int n = 115;
		StampaTriangoloIsoscele triangolo = new StampaTriangoloIsoscele();
		
		triangolo.stampaTriangolo(n);
		

	}

}
