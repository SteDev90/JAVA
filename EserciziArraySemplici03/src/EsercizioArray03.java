/**
 * Scrivere un metodo che, dato un array di double restituisca il valore massimo dell'array
 * 
 * @author anacletostefanopili
 *
 */
public class EsercizioArray03 {

	public static double maxArray (double[] array) {
		double max = 0.0;
		for (int k=0; k < array.length; k++) {
			if (array[k] > max) {
				max = array[k];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		
		double[] array = {2.0, 5.0, 7.0, 40.0, 1.0};
		
		System.out.println("Il valore massimo nell'array è: " + maxArray(array));

	}

}
