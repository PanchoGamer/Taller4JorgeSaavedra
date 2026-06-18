package Dominio;

public class CartasFactory {
	
	public static Carta crearTipos(String nom, String tipo, String[] partes)
	{
		if (tipo.equalsIgnoreCase("Pokemon"))
		{
			return new Pokemon(nom,tipo,Integer.parseInt(partes[2]),Integer.parseInt(partes[3]));
		}
	}
	
}
