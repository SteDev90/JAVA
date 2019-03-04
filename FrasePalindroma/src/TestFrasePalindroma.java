
public class TestFrasePalindroma {

	public static void main(String[] args) {
		FrasePalindroma frase = new FrasePalindroma ("i topi non avevano nipoti");
		
		if(frase.verificaPalindroma()) {
			System.out.println("La frase: " + frase +  ", è palindroma");
		} else {
			System.out.println("La frase: " + frase + ", Non è palindroma");
		}
	}

}
