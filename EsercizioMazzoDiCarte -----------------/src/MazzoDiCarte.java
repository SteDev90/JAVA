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
public class MazzoDiCarte {
	private final int numeroMaxCarte = 52;
	private final int numeroMaxSemi = 4;
	public static final String[] semi = {"Fiori","Denari","Picche","Fiori"};
	public static final String[] valori = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private Carta[] mazzo = new Carta[numeroMaxCarte];
	
	public MazzoDiCarte() {
		
		int cartePerSeme = numeroMaxCarte / numeroMaxSemi;
		
		for (int i=0; i<numeroMaxSemi; i++) {
			for (int j=1; j<=cartePerSeme; j++) {
				this.mazzo[i*cartePerSeme+j-1] = new Carta(j,i);
				System.out.println(mazzo[i]);
			}
		}
	}
	
	
	public void vediMazzo () {
		
	}
	
	
}
