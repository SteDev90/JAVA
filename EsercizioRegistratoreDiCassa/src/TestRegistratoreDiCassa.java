public class TestRegistratoreDiCassa {

	public static void main(String[] args) {
		RegistratoreDiCassa registratore1 = new RegistratoreDiCassa ("Limoni");
		registratore1.registraPrezzoArticolo(100);
		registratore1.registraSommaPagata(130);
		System.out.print(registratore1.calcolaResto());
		
	}

}
