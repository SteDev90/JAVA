/**
 * Progettare una classe Istogramma che rappresenta la distribuzione di dati (es voti degli studenti)
 * in un intervallo da i a j fornito in input (es. da 0 a 31 - trenta e lode)
 * La classe permette di incrementare il conteggio in corrispondenza di ciascun elemento dell'intervallo 
 * memorizzando così un nuovo voto di uno studente
 * La classe può stampare a video l'istogramma corrispondente (più facile in orizzontale)
 * @author anacletostefanopili
 *
 */
public class TestIstogramma {

	public static void main(String[] args) {
		Istogramma istogrammaVoti = new Istogramma();
		
		istogrammaVoti.aggiungiVoto(20);
		istogrammaVoti.aggiungiVoto(20);
		
		istogrammaVoti.aggiungiVoto(20);
		istogrammaVoti.aggiungiVoto(0);
		istogrammaVoti.aggiungiVoto(30);
		istogrammaVoti.aggiungiVoto(31);
		istogrammaVoti.aggiungiVoto(31);
		istogrammaVoti.aggiungiVoto(31);
		
		istogrammaVoti.stampaIstogramma();
		

	}

}
