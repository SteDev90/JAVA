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
	public static final char CASELLA_VUOTA = '-';
	public static final char GIOCATORE1 = 'X';
	public static final char GIOCATORE2 = 'O';
	public static final int TURNO_G1 = 1;
	public static final int TURNO_G2 = 2;
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
				scacchiera[i][j] = CASELLA_VUOTA;
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
	
	public boolean casellaVuota (int x, int y) {
		if (scacchiera[y][x] == CASELLA_VUOTA) {
			return true;
		} else return false;
	}
	
	public int casellaGiocatore (int x, int y) {
		int turnoGiocatore = 0;
		if (scacchiera[y][x] != CASELLA_VUOTA) {
			if (scacchiera[y][x] == GIOCATORE1) {
				turnoGiocatore = 1;
			}
			if (scacchiera[y][x] == GIOCATORE2) {
				turnoGiocatore = 2;
			}
		}
		return turnoGiocatore;
	}
	
	public boolean vittoriaGiocatore (int x, int y) {
		
		if((scacchiera[y][0] == scacchiera[y][1]) && (scacchiera[y][0] == scacchiera[y][2])) {
			return true;
		}
		if((scacchiera[x][0] == scacchiera[x][1]) && (scacchiera[x][0] == scacchiera[x][2])) {
			return true;
		}
		if((scacchiera[0][0] == scacchiera[1][1]) && (scacchiera[0][0] == scacchiera[2][2])) {
			return true;
		}
		if((scacchiera[2][0] == scacchiera[1][1]) && (scacchiera[2][0] == scacchiera[0][2])) {
			return true;
		}
		return false;
	}
	
	public int giocatoreInTurno (int turno) {
		if (turno % 2 == 1) {
			return TURNO_G1;
		} else return TURNO_G2;
	}
	
	public boolean cellaGiocabile (int x, int y) {
		if(casellaVuota(x,y) && ((casellaGiocatore(x,y) != GIOCATORE1) && (casellaGiocatore(x,y) != GIOCATORE2))) {
			return true;
	 	} 
		return false;
	}
	
	public void inserisciSimbolo (int x, int y, int turno) {
		if (giocatoreInTurno (turno) == TURNO_G1 && cellaGiocabile(x, y)) {
			scacchiera[x][y] = GIOCATORE1;
		} else scacchiera[x][y] = GIOCATORE2;
	}
	
	public boolean coordinateValide (int x, int y) {
		if((x>=0 && x<ALTEZZA_MAX) && (y>=0 && y<LUNGHEZZA_MAX)) {
			return true;
		} else {
			System.out.println("Coordinate non valide!!");
			System.out.println();
			return false;
		}
	}
	
	public char simboloCella(int x, int y) {
		return scacchiera[y][x];
	}
	
	
	
	
}
