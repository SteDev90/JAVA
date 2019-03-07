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
public class TestMazzoDiCarte {

	public static void main(String[] args) {
		MazzoDiCarte nuovoMazzo = new MazzoDiCarte();
		
		nuovoMazzo.vediMazzo();

	}

}
