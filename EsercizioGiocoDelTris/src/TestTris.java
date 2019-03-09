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
 */
import java.util.Scanner;

public class TestTris {

	public static void main(String[] args) {
		Scanner inserisciCoordinate = new Scanner (System.in);
		int x = 0;
		int y = 0;
		ScacchieraTris nuovaScacchiera = new ScacchieraTris();
		int turno = 1;
		
		do {
			nuovaScacchiera.stampaScacchiera();		// Stampo la scacchiera ad ogni turno 
			// Finche il giocatore non inserisce delle coordinate valide le richiedo
			
			do {
				if (nuovaScacchiera.giocatoreInTurno(turno) == ScacchieraTris.TURNO_G1) {
					System.out.println("Giocatore 1 inserisci le coordinate...");
					System.out.println("Siamo al turno di gioco numero: " + turno);
					System.out.print("Coordinata X: ");
					x = inserisciCoordinate.nextInt();
					System.out.print("Coordinata Y: ");
					y = inserisciCoordinate.nextInt();
				} else {
					System.out.println("Giocatore 2 inserisci le coordinata: ");
					System.out.println("Siamo al turno di gioco numero: " + turno);
					System.out.print("Coordinata X: ");
					x = inserisciCoordinate.nextInt();
					System.out.print("Coordinata Y: ");
					y = inserisciCoordinate.nextInt();
				}
			}while((nuovaScacchiera.coordinateValide(x, y)) && !(nuovaScacchiera.casellaVuota(x, y)));
			
			// Controllo se la cella è giocabile: è vuota e senza simboli
			if(nuovaScacchiera.casellaVuota(x, y)) {
				nuovaScacchiera.inserisciSimbolo(y, x, turno);	// Inserisco il simbolo del giocatore in gioco
				if (turno >= Tris.TURNI_CHECK) {
					if (nuovaScacchiera.vittoriaGiocatore(x, y)) {
						if(nuovaScacchiera.giocatoreInTurno(turno) == ScacchieraTris.TURNO_G1) {
							System.out.println("Giocatore 1 HAI VINTO");
							nuovaScacchiera.stampaScacchiera();
							break;
						}
						if (nuovaScacchiera.giocatoreInTurno(turno) == ScacchieraTris.TURNO_G2) {
							System.out.println("Giocatore 2 HAI VINTO"); 
							nuovaScacchiera.stampaScacchiera();
							break;
						}
					}
				}
			} 
			
			nuovaScacchiera.stampaScacchiera();
			
			turno ++;	// Vado al turno successivo
		} while (turno <= Tris.NUMERO_TURNI_MAX);
		

	}

}
