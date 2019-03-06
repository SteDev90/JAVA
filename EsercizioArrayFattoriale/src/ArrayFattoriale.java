/**
 * Scrivere un metodo che dato un intero n in ingresso, restituisca un array di dimensione n
 * contente k! nella k-esima cella per ogni valore di k.
 * 
 * @author anacletostefanopili
 *
 */
import java.util.Arrays;

public class ArrayFattoriale {

	public static int[] getArrayFattoriali (int n) {
		int[] fattoriale = new int[n];
		
		fattoriale[0] = 1;
		for (int k = 1; k<n;k++) {
			fattoriale[k]= fattoriale[k-1] * k;
		}
		return fattoriale;
	}
	
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println(Arrays.toString(ArrayFattoriale.getArrayFattoriali(n)));
	}

}
