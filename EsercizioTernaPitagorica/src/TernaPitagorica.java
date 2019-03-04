/**
 * Una terna pitagorica è una tripla di numeri interi a,b,c tali che
 * 1 <= a <= b <= c e a^2 + b^2 = c^2. Ovvero:
 * a e b sono i lati di un triangolo rettangolo
 * c è l'ipotenusa
 * Scrivere un metodo che legge un intero N e stampa tutte le triple pitagoriche
 * con c <= N.
 * 
 * ESEMPIO: N=15 il metodo stampa
 * a = 3, b = 4, c = 5;
 * a = 6, b = 8, c = 10;
 * a = 5, b = 12, c = 13;
 * a = 9, b = 12, c = 15;
 * 
 * @author anacletostefanopili
 *
 */
import java.util.Scanner;

public class TernaPitagorica {
	
	public TernaPitagorica () {
		
	}
	
	public static void calcolaTerna (int n) {
		
		double aQuadro = 0;
		double bQuadro = 0;
		double cQuadro = 0;
		
		for (double a = 1; a <= n; a++) {
			for (double b = a; b <= n; b++) {
				for (double c = b; c <= n; c++) {
					aQuadro = Math.pow(a, 2);
					bQuadro = Math.pow(b, 2);
					cQuadro = Math.pow(c, 2);
					if (aQuadro + bQuadro == cQuadro) {
						System.out.println("La terna vale rispettivamente");
						System.out.println("a: " + a);
						System.out.println("b: " + b);
						System.out.println("c: " + c);
					}
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		int n = 0;
		TernaPitagorica terne = new TernaPitagorica();
		
		java.util.Scanner leggiN = new Scanner(System.in);
		
		System.out.println("Inserire il valore di N: " );
		
		n = leggiN.nextInt();
		
		terne.calcolaTerna(n);
		
		
		


	}

}
