public class ContoCorrente {
	private int identificativoCliente;
	private double valoreConto;
	
	public ContoCorrente (int identificativoCliente)
	{
		this.identificativoCliente = identificativoCliente;
		this.valoreConto = 0;
	}
	
	public ContoCorrente (int identificativoCliente, double valoreConto)
	{
		this.identificativoCliente = identificativoCliente;
		this.valoreConto = valoreConto;
	}
	
	public double svuota ()
	{
		this.valoreConto = 0;
		return this.valoreConto;
	}
	
	public double getImporto ()
	{
		return this.valoreConto;
	}
	
	public int getIdentificativoCliente ()
	{
		return this.identificativoCliente;
	}
	
	public void preleva (double sommaPrelievo)
	{
		this.valoreConto -= sommaPrelievo;
	}
	
	public void versa (double sommaVersamento)
	{
		this.valoreConto += sommaVersamento;
	}
}
