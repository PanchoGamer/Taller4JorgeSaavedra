/// Nombre: Jorge Andrés Saavedra Sanchez  
/// Rut: 22.347.590-6  
/// Carrera: Ingenieria en Tecnologias de Informacion

package Logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import GUI.*;

public class App {
	
	private static Sistema sistema = SistemaImpl.getInstance();
	
	public static void main(String[] args) throws FileNotFoundException {
		
		GUI interfaz = new GUI();
		
		leerCartas();
		
		interfaz.imprimirGUI();
		
	}
	
	public static void leerCartas() throws FileNotFoundException
	{
		File f = new File("txts/Sobres.txt");
		Scanner s = new Scanner(f);
		
		while (s.hasNextLine())
		{
			String linea = s.nextLine();
			sistema.crearCartas(linea);
		}
		s.close();
	}
}
