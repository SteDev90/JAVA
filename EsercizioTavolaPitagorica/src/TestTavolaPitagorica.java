/**
 * Scrivere una classe che rappresenti la tavola pitagorica NxN (dove N è un parametro intero di costruzione della classe)
 * La classe deve su richiesta restituire il valore della tabella in corrispondenza della posizione (i,j)
 * La classe deve poter stampare l'intera tavola
 * 
 * @author anacletostefanopili
 *
 */
public class TestTavolaPitagorica {

	public static void main(String[] args) {
		TavolaPitagorica tavola01 = new TavolaPitagorica(10);
		
		tavola01.stampaTavolaPitagorica();
		tavola01.restituisciElemento(7, 5);

	}

}
