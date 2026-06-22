package Dominio;

import Visitor.CartaVisitor;

public class Item extends Carta{
	private int bonificacion;

	public Item(String nombre, int rareza, String tipo, int bonificacion) 
	{
		super(nombre, rareza, tipo);
		this.bonificacion = bonificacion;
	}

	public int getBonificacion() 
	{
		return bonificacion;
	}

	@Override
	public int accept(CartaVisitor visitor) 
	{
		return visitor.visitar(this);
	}
}
