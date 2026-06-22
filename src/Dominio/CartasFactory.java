package Dominio;

public class CartasFactory {
	
	public static Carta crearTipos(String nom, int rareza, String tipo, String[] partes)
	{
		if (tipo.equalsIgnoreCase("Pokemon"))
		{
			return new Pokemon(nom,rareza,tipo,Integer.parseInt(partes[3]),Integer.parseInt(partes[4]));
		}
		
		else if (tipo.equalsIgnoreCase("Item"))
		{
			return new Item(nom,rareza,tipo,Integer.parseInt(partes[3]));
		}
		
		else if (tipo.equalsIgnoreCase("Supporter"))
		{
			return new Supporter(nom,rareza,tipo,Integer.parseInt(partes[3]));
		}
		
		else
		{
			return new Energy(nom,rareza,tipo,partes[3]);
		}
	}
	
}
