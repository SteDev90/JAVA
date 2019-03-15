import java.util.Random;

/**
 * Progettare la classe CampoMinato che realizzi il gioco del campo minato.
 * Il costruttore deve inizializzare il campo N*M (dove N e M sono interi forniti in ingresso al costruttore insieme al numero m di mine) p
 * piazzando casualmente le m mine nel campo.
 * Implementare un metodo scopri( ) che, dati x e y in ingresso scopre la casella e restituisce un intero pari a:
 * - -1 se la casella contiene una mina
 * - La quantità di caselle adiacenti contenenti mine (incluse quelle in diagonale)
 * - 0 se le caselle adiacenti non contengono mine. 
 *   In quest'ultimo caso vengono scoperte anche le caselle adiacenti finchè non si incontra un numero > 0 (ricorsione)
 *   Implementare un metodo toString() che restituisce la situazione attuale del gioco
 *   Implementare un metodo vinto ( ) che restituisce lo stato del gioco: vento, vinto, in gioco.
 */

public class TestCampoMinato {

	public static void main(String[] args) {
		int N = 0;
		int M = 0;
		int m = 0;
		int x = 0;
		int y = 0;
		
		CampoMinato newGame = new CampoMinato(10, 10, 50);
		newGame.generaMine();
		newGame.stampaCampopMinato();
		
		if(newGame.scopri(1, 1) == 0) {
			System.out.println("Non è presente una mina");
		} else {
			System.out.println("E' presente una mina");
		}
	}

}
