import java.io.InputStream;
import java.util.Scanner;


/**
 * Progettare una classe ScacchieraTris che implementi la scacchiera del gioco del tris
 * la classe deve memorizzare la scacchiera i cui elementi possono essere:
 * " " se la casella non è stata ancora occupata
 * "X" - "O" secondo il giocatore che ha occupato la casella
 * La classe deve stampare in qualsiasi momento la situazione scacchiera
 * Deve permettere di occupare una casella solo con un simbolo
 * Progettare quindi una classe Tris che implementi il gioco utilizzando la scacchiera appena progettata.
 * 
 * @author anacletostefanopili
 * 
 *
 */
public class TestTris {
	
	
	public static void main(String[] args) {

		Scacchiera TrisGame = new Scacchiera();	             // Creo un oggetto TrisGame di tipo Scacchiera
		boolean inputValido = false;			             // Variabile per verificare se l'input delle coordinate inserite è valido
		int turno = 1;							             // Variabile che rappresenta il turno attuale
		int x = 0;								             // Varaibile per la coordinata X
		int y = 0;								   			 // Varaibile per la coordinata Y
		Scanner inputCoordinate = new Scanner(System.in);    // Oggetto ti tipo Scanner per leggere l'input delle coordinata da tastiera
		
		
		do {
			
			do {
				TrisGame.stampaScacchiera();												 // Stampo la scacchiera 
				if (TrisGame.giocatoreInTurno(turno) == 1) {  								 // Se è un turno dispari gioca il giocatore 01                                  
					System.out.println("Giocatore 01 inserisci le coordinate: ");
					System.out.print("X: ");											     // Acquisisco la coordinata X
					x = inputCoordinate.nextInt();
					System.out.print("Y: ");
					y = inputCoordinate.nextInt();											 // Acquisisco la coordinata Y
					if ((TrisGame.cellaVuota(x, y) && TrisGame.coordinateValide(x, y))) {    // Se la cella e vuota e le coordinate sono valide 
						inputValido = true;						                             // L'input è valido							 
					} else {															     // Altrimenti non lo è		
						inputValido = false;							
					}
				} else {
					System.out.println("Giocatore 02 inserisci le coordinate: ");
					System.out.print("X: ");
					x = inputCoordinate.nextInt();
					System.out.print("Y: ");
					y = inputCoordinate.nextInt();
					if ((TrisGame.cellaVuota(x, y) && TrisGame.coordinateValide(x, y))) {
						inputValido = true;
					} else {
						inputValido = false;
					}
				}
			} while(!inputValido);										    // Finche il giocatore non immette un input valido
			
			
			if (TrisGame.giocatoreInTurno(turno) == 1) {			        // Se il giocatore in turno è il numero 01
				TrisGame.setContenutoCella(x, y, Tris.GIOCATORE01);	        // Salvo nella cella selezionata il carattere del giocatore 01
			} else {        										        // Altrimenti
				TrisGame.setContenutoCella(x, y, Tris.GIOCATORE02);         // Salvo nella cella selezionata il carattere del giocatore 02
			}
			
			TrisGame.stampaScacchiera();									// Stampo la scacchiera aggiornata
			
			if (turno >= Tris.TURNI_CHECK) {								// Se sono in un turno in cui si può concludere il gioco
				if (TrisGame.vittoriaGiocatore(x, y)) {    					// Controllo se con il turno attuale si formano tre simboli uguali vicini
					if (TrisGame.giocatoreInTurno(turno) == 1) {	        // Se sta giocando il giocatore 01 significa che ha vinto 
						System.out.println("Giocatore 01 hai vinto !!");
						TrisGame.stampaScacchiera();						// Stampo la scacchiera aggiornata
						break;
					} else { 												// Altrimenti ha vinto il giocatore 02 
						System.out.println("Giocatore 02 hai vinto !!");	
						TrisGame.stampaScacchiera();	                    // Stampo la scacchiera aggiornata
						break;
					}
				}
			}
			
			x = 0;
			y = 0;
			turno++;														// Vado al turno successivo
		} while (turno <= Tris.TURNI_MAX);									// Finchè non arrivo al turno massimo

	}

}
