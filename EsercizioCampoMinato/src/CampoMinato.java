import java.util.Random;

/**
 * Progettare la classe CampoMinato che realizzi il gioco del campo minato.
 * Il costruttore deve inizializzare il campo N*M (dove N e M sono interi forniti in ingresso al costruttore insieme al numero m di mine) p
 * piazzando casualmente le m mine nel campo.
 * Implementare un metodo scopri( ) che, dati x e y in ingresso scopre la casella e restituisce un intero pari a:
 * - -1 se la casella contiene una mina
 * - La quantità di caselle adiacenti contenenti mine (incluse quelle in diagonale)
 * - 0 se le caselle adiacenti non contengono mine. 
 *   In quest'ultimo caso vengono scoperte anche le caselle adiacenti finchè non si incontra un numero > 0 (ricordiosne)
 *   Implementare un metodo toString() che restituisce la situazione attuale del gioco
 *   Implementare un metodo vinto ( ) che restituisce lo stato del gioco: vento, vinto, in gioco.
 */
public class CampoMinato {
	public static final char CARATTERE_MINA = '*';
	private int m;
	private int n;
	private int numero_mine;
	private int[][] campo_minato;
	
	public CampoMinato (int m, int n, int numero_mine) {
		this.m = m;
		this.n = n;
		this.numero_mine = numero_mine;
		this.campo_minato = new int[m][n];
	}
	
	public void generaMine () {
		Random random_mine = new Random();
		
		for (int i=0; i<this.m; i++) {
			for (int j=0; j<this.n; j++) {
				if (numero_mine > 0 ) {
					campo_minato[i][j] = random_mine.nextInt(2);
					if (campo_minato[i][j] == 1) {
						numero_mine --;
					}
				} else {
					campo_minato[i][j] = 0;
				}
				
			}
		}
	}
	
	public double scopri (int x, int y) {
		int presenza_mina = 0;
		for(int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if (x-1==j && y-1==i) {
					if (campo_minato[i][j] == 1) {
						presenza_mina = -1;
						break;
					} else {
						presenza_mina = 0;
					}
				}
			}
		}
		return presenza_mina;
	}
	
	
	public void stampaCampopMinato() {
		for (int i=0; i<this.m; i++) {
			for (int j=0; j<this.n; j++) {
				if (campo_minato[i][j] == 1) {
					System.out.print(" " + CARATTERE_MINA);
				} else {
					System.out.print(" " + campo_minato[i][j]);
				}
			} System.out.println();
		} System.out.println();
	}
}
