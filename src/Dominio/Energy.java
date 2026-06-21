package Dominio;

public class Energy extends Carta {
	private String element;

	public Energy(String nombre, int rareza, String tipo, String element) 
	{
		super(nombre, rareza, tipo);
		this.element = element;
	}

	public String getElement() 
	{
		return element;
	}
	
}
