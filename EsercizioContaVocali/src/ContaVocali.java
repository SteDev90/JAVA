/**
 * Scrivere un metodo che riceve una stringa e stampa a video il conteggio delle
 * vocali in essa contenute.
 * 
 * @author anacletostefanopili
 *
 */
public class ContaVocali {
		
	public static int contaVocale (String s, char lettera) {
		int counter = 0;
		for (int i=0; i < s.length(); i++) {
			if(s.charAt(i) == lettera) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		
		String stringa = "Conta quante vocali";
		System.out.println("Le a sono: " + ContaVocali.contaVocale(stringa, 'a'));
		System.out.println("Le e sono: " + ContaVocali.contaVocale(stringa, 'e'));
		System.out.println("Le i sono: " + ContaVocali.contaVocale(stringa, 'i'));
		System.out.println("Le o sono: " + ContaVocali.contaVocale(stringa, 'o'));
		System.out.println("Le u sono: " + ContaVocali.contaVocale(stringa, 'u'));
		

	}

}
