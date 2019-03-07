/**
 * Scrivere una classe che rappresenti la tavola pitagorica NxN (dove N è un parametro intero di costruzione della classe)
 * La classe deve su richiesta restituire il valore della tabella in corrispondenza della posizione (i,j)
 * La classe deve poter stampare l'intera tavola
 * 
 * @author anacletostefanopili
 *
 */
public class TavolaPitagorica {
	int n = 0;
	private int [][] tavolaPitagorica;
	
	public TavolaPitagorica(int n) {
		this.n = n;
		this.tavolaPitagorica = new int[n+1][n+1];
		generaTavola();
	}
	
	public void generaTavola() {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++) {
				tavolaPitagorica[i][j] = i*j;
			}
		}
	}
	
	public void restituisciElemento (int x, int y) {
		int elemento = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (y==i && x==j) {
					elemento = tavolaPitagorica[i][j];
				}
			}
		}
		System.out.println(x + "x" + y + "=" + elemento);
	}
	
	public void stampaTavolaPitagorica () {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++) {
				if(tavolaPitagorica[i][j] <10) {
					System.out.print(tavolaPitagorica[i][j] + "  ");
				} else {
					System.out.print(tavolaPitagorica[i][j] + " ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
	}

}
