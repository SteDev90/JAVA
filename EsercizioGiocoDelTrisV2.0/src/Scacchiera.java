import org.omg.PortableServer.THREAD_POLICY_ID;

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
public class Scacchiera {
	public static final int ALTEZZA_MAX = 3;		  // Campo che rappresenta l'altezza massima della scacchiera
	public static final int LARGHEZZA_MAX = 3;		  // Campo che rappresenta la larghezza massima della scacchiera
	private static final char CASELLA_VUOTA = ' ';    // Campo che rappresenta la costante per il carattere vuoto nella cella vuota della scacchiera
	private char[][] scacchiera;					  // Campo che rappresenta la matrice di caratteri della scacchiera
	
	
	/**
	 * Costruttore della classe Scacchiera
	 * @param nessuno
	 */
	public Scacchiera () {
		this.scacchiera = new char[ALTEZZA_MAX][LARGHEZZA_MAX];
		generaScacchieraVuota();
		
	}
	/**
	 * Metodo che genera la scacchiera con il valore CASELLA_VUOTA in ogni cella
	 * @parama nessuno
	 * @return void
	 */
	public void generaScacchieraVuota () {
		for (int y=0; y<ALTEZZA_MAX; y++) {
			for (int x=0; x<LARGHEZZA_MAX; x++) {
				scacchiera[y][x] = CASELLA_VUOTA;
			}
		}
	}
	
	/**
	 * Metodo che stampa il contenuro della scacchiera.
	 * @param nessuno
	 * @return void
	 */
	public void stampaScacchiera () {
		for (int y=0; y<ALTEZZA_MAX; y++) {
			for (int x=0; x<LARGHEZZA_MAX; x++) {
				System.out.print(scacchiera[y][x]);		// Stampa il contenuto di ogni cella della scacchiera riga per riga
			}
			System.out.println();    					// Va a capo a fine riga
		}
		System.out.println();    						// Va a capo a fine scacchiera
	}
	
	/**
	 * Metodo che ritorna il carattere contenuto nella scacchiera con coordinate ricevute in ingresso
	 * #param : x = larghezza nella scacchiera, y = altezza nella scacchiera
	 * @return scacchiera[y-1][x-1] : carattere contenuto in quelle coordinate
	 */
	public char getContenutoCella (int x, int y) {
		return scacchiera[y-1][x-1];
	}
	
	/**
	 * Metodo che ritorna il carattere contenuto nella scacchiera con coordinate ricevute in ingresso
	 * #param : x = larghezza nella scacchiera, y = altezza nella scacchiera, carattereCella = carattere sa salvare nella cella
	 */
	public void setContenutoCella (int x, int y, char carattereCella) {
		scacchiera[y-1][x-1] = carattereCella;
	}
	
	
	/**
	 * Metodo che controlla se la cella è vuota 
	 * @param x = larghezza nella scacchiera, y = altezza nella scacchiera
	 * @return true: se la cella è vuota, false: altrimenti
	 */
	public boolean cellaVuota (int x, int y) {
		if (scacchiera[y-1][x-1] == CASELLA_VUOTA) {
			return true;
		} else return false;
	}
	
	
	/**
	 * Metodo che controlla se le coordinate inserite sono valide 
	 * @param x = larghezza nella scacchiera, y = altezza nella scacchiera
	 * @return true: se le coordinate sono valide, false: altrimenti
	 */
	public boolean coordinateValide (int x, int y) {
		if ((x>0 && x<=LARGHEZZA_MAX) && (y>0 && y<=ALTEZZA_MAX)) {
			return true;
		} else return false;
	}
	
	/**
	 * 
	 * @param x Coordinata x attuale inserita dal giocatore
	 * @param y Coordinata y attuale inserita dal giocatore
	 * @return true se dopo l'inserimento c'è la vittoria (tris) da parte di un giocatore, false altrimenti
	 */
	public boolean vittoriaGiocatore (int x, int y) {
		
		if((getContenutoCella(1, y) == getContenutoCella(2, y) && getContenutoCella(1, y) == getContenutoCella(3, y)) ||  // Controllo orizzontale
		   (getContenutoCella(x, 1) == getContenutoCella(x, 2) && getContenutoCella(x, 1) == getContenutoCella(x, 3)) ||  // Controllo verticale
		   (getContenutoCella(1, 1) == getContenutoCella(2, 2) && getContenutoCella(1, 1) == getContenutoCella(3, 3)) ||  // Controllo obliquo sx -> dx
		   (getContenutoCella(3, 1) == getContenutoCella(2, 2) && getContenutoCella(3, 1) == getContenutoCella(1, 3))) {  // Controllo obliquo dx -> sx
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 * Metodo che restituisce il giocatore in turno in quel determinato momento
	 * @param turno riceve il ingresso il turno di gioco
	 * @return il giocatore attualmente in turno
	 */ 
	public int giocatoreInTurno (int turno) {
		if (turno % 2 == 1) {
			return Tris.TURNO_G1;
		} else return Tris.TURNO_G2;
	}
}
