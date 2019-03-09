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

public class Tris {
	//private ScacchieraTris tris;
	public static final int NUMERO_TURNI_MAX = ScacchieraTris.ALTEZZA_MAX * ScacchieraTris.LUNGHEZZA_MAX;		// Se la scacchiera è 3 x 3
	public static final int TURNI_CHECK = 5;
	
	public Tris () {
		//this.tris = new ScacchieraTris(); 
	}
	
	public void inserisciCoordinate(int x, int y) {
		for(int i=0; i<ScacchieraTris.ALTEZZA_MAX; i++) {
			for (int j=0; j<ScacchieraTris.LUNGHEZZA_MAX; j++) {
				
			}
		}
	}
	
	
 }
