/**
 * Implementare un metodo statico copyOf che analogamente a java.util.Array.copyOf
 * copi un array in un nuovo array delle dimensioni specificate 
 * (troncando l'array in input se è più grande)
 * @author anacletostefanopili
 *
 */

import java.util.Arrays;

public class ReimplementaCopyOf {

	public static void copyOf(int[] array, int n) {
		int[] nuovoArray = new int[n];
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
				nuovoArray[i]= array[j];
				}
			}
			
		}
		System.out.println(Arrays.toString(nuovoArray));
		
		
		
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {0,1,2,3,4,5,6,7,8,9};
		
		copyOf(array, 5);
		System.out.println(Arrays.toString(array));

	}

}
