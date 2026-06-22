package Dominio;

import Visitor.CartaVisitor;

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

	@Override
	public int accept(CartaVisitor visitor) 
	{
		return visitor.visitar(this);
	}
}
