/**
 * Progettare una classe Carta che rappresenti una singola carta da gioco con seme e valore
 * La classe deve restituire su richiesta la propria rappresentazione sotto formadi stringa
 * Progettare quindi una classe MazzoDiCarte che rappresenti un intero mazzo da 52 carte
 * La classe deve implementare i seguenti metodi:
 * - mescola il mazzo di carte
 * - distribuisci la prossima carta
 * Infine si progetti una classe di collaudo che crea un mazzo, mescoli le carte e ne distribuisca carte fino ad esaurimento del mazzo
 * @author anacletostefanopili
 *
 */
public class Carta {
	public int valore;
	public int seme;
	public static final String[] semi = {"Fiori","Denari","Picche","Fiori"};
	public static final String[] valori = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public Carta(int valore, int seme) {
		this.valore = valore;
		this.seme = seme;
	}
	
	public int getValore() {
		return this.valore;
	}
	
	public int getSeme() {
		return this.seme;
	}
	
	public String toString() {
		return "La carta è un " + this.valore + " di " + this.seme;
	}
}
