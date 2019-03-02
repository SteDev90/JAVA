public class RegistratoreDiCassa {
	private String nomeArticolo;
	private double prezzoArticolo;
	private double sommaPagata;
	private double restoDovuto;
	
	public RegistratoreDiCassa (String nomeArticolo) {
		this.nomeArticolo = nomeArticolo;
	}
	
	public void registraPrezzoArticolo (double prezzoArticolo) {
		this.prezzoArticolo = prezzoArticolo;
	}
	
	public void registraSommaPagata (double sommaPagata) {
		this.sommaPagata = sommaPagata;
	}
	
	public double calcolaResto () {
		return this.restoDovuto = this.sommaPagata - this.prezzoArticolo;
	}
}
