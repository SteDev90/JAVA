public class TestFiltro {

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 10, 2, 42, 7, 8};
		int[] arrayFiltro = new int[] {1, 7, 10};
		
		Filtro filtro = new Filtro(array);
		filtro.passaBasso(8);
		filtro.passaAlto(8);
		filtro.filtra(2);
		filtro.filtra(arrayFiltro);

	}

}
