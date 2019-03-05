/**
 * Aggiungere alla classe RettangoloDiCaratteri i seguenti metodi:
 * 1) setCarattere( ) che permette d ispecificare il carattere da utilizzare per stampare i rettangoli
 * 2) drawVerticalStripes( ) stampa il rettangolo a strisce verticali usando anche un secondo carattere
 * 3) drawOrizzontalStripes( ) stampa il rettangolo a strisce orizzontali usando anche un secondo carattere
 * 4) drawChessboard( ) stampa il rettangolo a scacchiera
 * 5) setCarattere( ) versione 2.0 che permette di specificare entrambi i caratteri da utilizzare per la stampa
 * 6) un metodo che permette di modificare la posizione del rettangolo
 * 7) un metodo che permette di accedere ai due caratteri usati per la stampa
 * @author anacletostefanopili
 *
 */

import java.util.Scanner;

public class RettangoloDiCaratteri02 {
	private String carattereRettangolo;
	private String carattereSecondario;
	private int x1;
	private int y1;
	private int lunghezza;
	private int altezza;
	
	public RettangoloDiCaratteri02 (int x1, int y1, int lunghezza, int altezza) {
		this.x1 = x1;
		this.y1 = y1;
		this.lunghezza = lunghezza;
		this.altezza = altezza;
	}
	
	public void setCarattere (String carattereRettangolo) {
		this.carattereRettangolo = carattereRettangolo;
	}
	
	public String getCarattere () {
		return this.carattereRettangolo;
	}
	
	public void setCarattereSecondario (String carattereSecondario) {
		this.carattereSecondario = carattereSecondario;
	}
	
	public String getCarattereSecondario () {
		return this.carattereSecondario;
	}
	
	public void getCaratteri () {
		System.out.println(carattereRettangolo + " " + carattereSecondario);
	}
	
	public void modificaPosizione (int x2, int y2) {
		this.x1 = x2;
		this.y1 = y2;
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
				
				// Se la stampa è abilitata stampo il carattere per il rettangolo altrimenti un trattino
				if (stampa) {
					System.out.print(carattereRettangolo + " ");
					stampaX --;		//Ogni volta che stampo un carattere in orizzontale diminuisco la quantità da stampare	
				} else System.out.print(carattereSecondario + " ");
			}
			stampaY --;		// Ogni volta che ho stampato una riga riminuisco la quantità in altezza da stampare
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		RettangoloDiCaratteri02 rettangolo = new RettangoloDiCaratteri02(2,3,8,7);		//Creo un rettangolo impostando le coordintate di origine, lunghezza e altezza
		
		Scanner leggiCarattereRettangolo = new Scanner (System.in);
		System.out.println("Digitare il carattere che si vuole stampare per il rettangolo: ");
		rettangolo.setCarattere(leggiCarattereRettangolo.nextLine());
		
		Scanner leggiCarattereSecondario = new Scanner (System.in);
		System.out.println("Digitare il carattere che si vuole stampare per lo spazio intorno al rettangolo: ");
		rettangolo.setCarattereSecondario(leggiCarattereSecondario.nextLine());
		rettangolo.draw();
		
		//System.out.println("Per la stampa del rettangolo si è usato il carattere: " + rettangolo.getCarattere());
		System.out.println("Inserire le nuove coordinate di partenza per il rettangolo: ");
		int x2 = 0;
		int y2 = 0;
		
		Scanner leggiX2 = new Scanner (System.in);
		Scanner leggiY2 = new Scanner (System.in);
		x2 = leggiX2.nextInt();
		y2 = leggiY2.nextInt();
		rettangolo.modificaPosizione(x2,y2);
		rettangolo.draw();
		
		System.out.println("Sono stati usati i seguenti due caratteri: ");
		rettangolo.getCaratteri();
	}

}
