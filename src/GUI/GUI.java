package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
	public void imprimirGUI()
	{
		JFrame ventana = new JFrame();
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(500,500);
		
		ventana.getContentPane().add(createGUI());
		
		ventana.setVisible(true);
	}
	
	public JPanel createGUI()
	{
		JPanel mainPanel = new JPanel();
		
		JButton button1 = crearBoton1();
		JButton button2 = new JButton("Boton2");
		JButton button3 = new JButton("Boton3");
		
		mainPanel.add(button1);
		mainPanel.add(button2);
		mainPanel.add(button3);
		
		return mainPanel;
	}
	
	public JButton crearBoton1()
	{
		JButton b = new JButton("Boton1");
		b.addActionListener(e ->{
			
		});
		
		return b;
	}
}
