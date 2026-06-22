package Dominio;

import Visitor.CartaVisitor;

public class Supporter extends Carta {
	private int efectosPorTurno;

	public Supporter(String nombre, int rareza, String tipo,  int efectosPorTurno) 
	{
		super(nombre, rareza, tipo);
		this.efectosPorTurno = efectosPorTurno;
	}

	public int getEfectosPorTurno() 
	{
		return efectosPorTurno;
	}
	
	@Override
	public int accept(CartaVisitor visitor) 
	{
		return visitor.visitar(this);
	}
}
