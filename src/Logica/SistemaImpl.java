package Logica;

import java.util.ArrayList;
import java.util.List;

import Dominio.*;

public class SistemaImpl implements Sistema{
	
	private static Sistema instance = null;
	
	private SistemaImpl() {}

	public static Sistema getInstance()
	{
		if (instance == null)
		{
			instance = new SistemaImpl();
		}
		return instance;
	}
	
	private List<Carta> cartas = new ArrayList<>();
	
	public void crearCartas(String linea)
	{
		String[] partes = linea.split(";");
		String nombre = partes[0];
		int rareza = Integer.parseInt(partes[1]);
		String tipo = partes[2];
		
		Carta c = CartasFactory.crearTipos(nombre,rareza,tipo,partes);
		
		cartas.add(c);
	}
	
	@Override
	public int calcularPuntaje(int index)
	{
		
	}
}
