public class Terremoto {
	private double magnitudo;

	public Terremoto (double magnitudo) {
		this.magnitudo = magnitudo;
	}
	
	public String toString () {
		if (magnitudo == 12) return "Disastroso";
		else if (magnitudo == 11) return "Molto disastroso";
		else if (magnitudo == 10) return "Disastroso";
		else if (magnitudo == 9) return "Rovinoso";
		else if (magnitudo == 8) return "Distruttivo";
		else if (magnitudo == 7) return "Molto forte";
		else if (magnitudo == 6) return "Forte";
		else if (magnitudo == 5) return "Piuttosto forte";
		else if (magnitudo == 4) return "Moderato";
		else if (magnitudo == 3) return "Leggero";
		else if (magnitudo == 2) return "Debole";
		else if (magnitudo == 1) return "Strumentale";
		else return "Valore non ammesso";
	}
}
