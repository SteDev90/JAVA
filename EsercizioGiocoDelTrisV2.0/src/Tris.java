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
public class Tris {
	public static final int TURNI_MAX = 9;          												// Campo che rappresenta i turni massimi in una partita di tris
	public static final int TURNI_CHECK = 5;														// Da tale turno è possibile la vincita di un giocatore
	public static final char GIOCATORE01 = 'X';    												    // Campo che rappresenta il carattere del giocatore 01 nella scacchiera
	public static final char GIOCATORE02 = 'O';    												    // Campo che rappresenta il carattere del giocatore 02 nella scacchiera
	public static final int TURNO_G1 = 1;															// Campo che rappresenta il giocatore in turno
	public static final int TURNO_G2 = 2;															// Campo che rappresenta il giocatore in turno
	private Scacchiera tris;																		// Campo che rappresenta un gioco tris di tipo scacchiera
	
	
	/**
	 * Costruttore della classe Tris
	 */
	public Tris () {
		
	}
	
	

}
