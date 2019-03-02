public class TestContoCorrente {

	public static void main(String[] args) {
		ContoCorrente conto01 = new ContoCorrente (1);
		ContoCorrente conto02 = new ContoCorrente (2, 10000);
		
		System.out.println(conto01.getIdentificativoCliente());
		System.out.println(conto01.getImporto());
		
		System.out.println(conto02.getIdentificativoCliente());
		System.out.println(conto02.getImporto());

		conto02.versa(5000);
		System.out.println(conto02.getIdentificativoCliente());
		System.out.println(conto02.getImporto());
		
		conto02.svuota();
		System.out.println(conto02.getIdentificativoCliente());
		System.out.println(conto02.getImporto());
	}

}
