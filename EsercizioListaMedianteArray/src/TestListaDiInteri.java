
public class TestListaDiInteri {

	public static void main(String[] args) {
		ListaDiInteri listaInteri = new ListaDiInteri();
		
		listaInteri.aggiungiCoda(20);
		listaInteri.stringaLista();
		
		listaInteri.aggiungiCoda(2);
		listaInteri.stringaLista();
		
		listaInteri.aggiungiCoda(5);
		listaInteri.stringaLista();
		
		listaInteri.aggiungiCoda(7);
		listaInteri.stringaLista();
		
		listaInteri.aggiungiInPosizione(50, 5);
		listaInteri.stringaLista();
		
		listaInteri.eliminaPrimaOccorrenza(100);
		listaInteri.stringaLista();
		
		listaInteri.eliminaIesimo(3);
		listaInteri.stringaLista();
	}

}
