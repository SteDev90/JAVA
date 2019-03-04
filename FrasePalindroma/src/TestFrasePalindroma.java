
public class TestFrasePalindroma {

	public static void main(String[] args) {
		FrasePalindroma frase = new FrasePalindroma ("a");
		
		if(frase.verificaPalindroma()) {
			System.out.println(frase + "è palindroma");
		} else {
			System.out.println(frase + "Non è palindroma");
		}
	}

}
