 package Dominio;

import Visitor.CartaVisitor;

public class Pokemon extends Carta{
	private int damage;
	private int cantEnergias;
	
	public Pokemon(String nombre, int rareza, String tipo, int damage, int cantEnergias) 
	{
		super(nombre, rareza, tipo);
		this.damage = damage;
		this.cantEnergias = cantEnergias;
	}

	public int getDamage() 
	{
		return damage;
	}

	public int getCantEnergias() 
	{
		return cantEnergias;
	}
	
	@Override
	public int accept(CartaVisitor visitor) 
	{
		return visitor.visitar(this);
	}
}
