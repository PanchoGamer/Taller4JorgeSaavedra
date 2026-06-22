package Visitor;

import Dominio.Energy;
import Dominio.Item;
import Dominio.Pokemon;
import Dominio.Supporter;

public class PuntajeVisitor implements CartaVisitor {
	
	double puntaje = 0;
	
	@Override
	public int visitar(Energy e) 
	{
		return 1;
	}

	@Override
	public int visitar(Item i) 
	{
		int bonificacion = i.getBonificacion();
		puntaje = bonificacion*20;
		
		return (int) puntaje;
	}

	@Override
	public int visitar(Pokemon p) 
	{
		puntaje = ((double) p.getDamage() / (double) p.getCantEnergias()) * 100;
		return (int) puntaje;
	}

	@Override
	public int visitar(Supporter s) 
	{
		puntaje = s.getEfectosPorTurno() * 50;
		return (int) puntaje;
	}
}
