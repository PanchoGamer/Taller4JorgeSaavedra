 package Dominio;

public class Pokemon extends Carta{
	private int damage;
	private int cantEnergias;
	
	public Pokemon(String nombre, String tipo, int damage, int cantEnergias) 
	{
		super(nombre, tipo);
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
}
