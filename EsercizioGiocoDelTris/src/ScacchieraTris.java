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
public class ScacchieraTris {
	public static final int LUNGHEZZA_MAX = 3;
	public static final int ALTEZZA_MAX = 3;
	private final char casellaVuota = '-';
	private final char giocatore1 = 'X';
	private final char giocatore2 = 'O';
	private char[][] scacchiera;
	
	public ScacchieraTris () {
		this.scacchiera = new char[ALTEZZA_MAX][LUNGHEZZA_MAX];
		generaScacchieraVuota();
	}
	
	public void getCoordinataX () {
		
	}
	
	public void getCoordinataY () {
		
	}
	
	public void generaScacchieraVuota () {
		for(int i=0; i<ALTEZZA_MAX; i++) {
			for (int j=0; j<LUNGHEZZA_MAX; j++) {
				scacchiera[i][j] = casellaVuota;
			}
		}
	}
	
	public void stampaScacchiera () {
		for(int i=0; i<ALTEZZA_MAX; i++) {
			for (int j=0; j<LUNGHEZZA_MAX; j++) {
				System.out.print(scacchiera[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
