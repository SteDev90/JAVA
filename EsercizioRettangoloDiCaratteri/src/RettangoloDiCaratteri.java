/**
 * Progettare una classe RettangoloDiCaratteri che rappresenta un triangolo riempito di caratteri *
 * Un oggetto della classe viene costruito fornendo la posizione x,y e la lunghezza e altezza del rettangolo
 * Il metodo draw si occupa di stampare il rettangolo a video partendo dalla posizione (0,0)
 * Ad esempio dato il rettangolo (2,2,4,3) il metodo draw():
 * (x=0, y=0)	 -	       -	     -         -	     -         -
 * (x=0, y=1)    -         -         -         -         -         - 
 * (x=0, y=2)    -         -         *         *         *         *
 * (x=0, y=3)    -         -         *         *         *         *
 * (x=0, y=4)    -         -         *         *         *		   *
 *           (x=0, y=0)(x=1, y=0)(x=2, y=0)(x=3, y=0)(x=4, y=0)(x=5, y=0)
 * @author anacletostefanopili
 *
 */
public class RettangoloDiCaratteri {
	private char carattereRettangolo = '*';
	private int x1;
	private int y1;
	private int lunghezza;
	private int altezza;
	
	public RettangoloDiCaratteri (int x1, int y1, int lunghezza, int altezza) {
		this.x1 = x1;
		this.y1 = y1;
		this.lunghezza = lunghezza;
		this.altezza = altezza;
	
	}
	
	public void draw() {
		
		/*
		 * Ciclo for che considera il piano cartesiano con origine (0,0)
		 * che parte in alto a sinistra.
		 * Considero anche l'asse delle ascisse e delle ordintate pari a x=0 e y=0
		 * Il limite orizzontale è dato dalla posizione iniziale x1 piu la sua lunghezza
		 * Il limite verticale è dato dalla posizione iniziale y1 più la altezza
		 */
		for(int y = 0; y<y1+altezza; y++) {
			
			boolean stampa = false;     // Cariabile che abilita la stampa
			int stampaX = lunghezza;	// Variabile che conta il numero di caratteri * da stampare in orizzontale
			int stampaY = altezza;      // Variabile che conta il numero di caratteri * da stampare in verticale
			
			for(int x=0; x<x1+lunghezza; x++) {
				
				/*
				 * Se sono nel nelle coordinte (x1,y1) di partenza e ho ancora 
				 * carratteri da stampare in orizzontale o verticale abilito la stampa 
				 * altrimenti lascio la stampa disabilitata
				 */
				if((x>=x1 && y>=y1) && ((stampaX !=0) && (stampaY !=0))) {
					stampa = true;
				} else stampa = false;
				
				// Se la stampa + abilitata stampo il carattere per il rettangolo altrimenti un trattino
				if (stampa) {
					System.out.print(carattereRettangolo + " ");
					stampaX --;		//Ogni volta che stampo un carattere in orizzontale diminuisco la quantità da stampare	
				} else System.out.print('-' + " ");
			}
			stampaY --;		// Ogni volta che ho stampato una riga riminuisco la quantità in altezza da stampare
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		RettangoloDiCaratteri rettangolo = new RettangoloDiCaratteri(2,3,8,7);		//Creo un rettangolo impostando le coordintate di origine, lunghezza e altezza
		
		rettangolo.draw();
		
		

	}

}
