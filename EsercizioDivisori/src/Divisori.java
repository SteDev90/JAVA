/*Scrivere un metodo che dato un numero intero positivo n in ingresso stampi 
 * i divisori propri di n - ovvero i divisori < n.
 * 
 * @author anacletostefanopili
 */
public class Divisori {

	public static void divisori (int n) {
		for (int i=1; i<n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int n = 7;
		Divisori.divisori(n);
	}

}
