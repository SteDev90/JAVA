/**
 * La classe crea l'oggetto frasePalindroma e verifica se tale è palindroma 
 * Tale versione non considera la presenza di spazi.
 * @author anacletostefanopili
 *
 */
public class FrasePalindroma {
	private boolean palindroma;
	private String frasePalindroma;
	
	
	public FrasePalindroma (String frasePalindroma) {
		this.frasePalindroma = frasePalindroma;
	}
	
	public boolean verificaPalindroma () {
		
		palindroma = true;
		int dimensione = frasePalindroma.length();
		int j = dimensione - 1;
		
		for (int i=0; i<dimensione-1; i++) {
			
			if (frasePalindroma.charAt(j) == frasePalindroma.charAt(i) ) {
				/* Per testare la palindromia stampo a video i valori ciclo per ciclo
				System.out.println(i + " " + j);
				System.out.println(frasePalindroma.charAt(j) + " " + frasePalindroma.charAt(i));
				*/
				palindroma = true;
				j--;
			} else {
				palindroma = false;
				break;
			}
		}
		
		return palindroma;
	}
	
	public String toString () {
		return this.frasePalindroma;
	}
	
}
