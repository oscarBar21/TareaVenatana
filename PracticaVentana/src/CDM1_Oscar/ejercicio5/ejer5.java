package CDM1_Oscar.ejercicio5;

/**
 * Este es el ejercicio5
 * @author: Oscar Barragan Mateos
 * @version: 11/06/2021
 */

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import CDM1_Oscar.General.Ventana;

public class ejer5 {

	static int cont = 0;
	
	public static void main(String[] args) {
		
		
			Ventana ejer5 = new Ventana("Ejercicio5");
			Panel panel1 = new Panel();
			ejer5.add(panel1);
			
			Button boton = new Button("Contar");
			Label contador = new Label("Contador:");
			TextField cuenta = new TextField();
			cuenta.setEditable(false);
			
			cont = 0;
			cuenta.setText("" + cont);
			
			panel1.add(contador);
			panel1.add(cuenta);
			panel1.add(boton);
			
			boton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					cont++;
					cuenta.setText("" + cont);
				}
			});
	}

}
