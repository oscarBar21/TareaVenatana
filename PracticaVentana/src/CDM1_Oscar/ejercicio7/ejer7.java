package CDM1_Oscar.ejercicio7;

/**
 * Este es el ejercicio7
 * @author: Oscar Barragan Mateos
 * @version: 11/06/2021
 */

import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import CDM1_Oscar.General.Ventana;

public class ejer7 {

		static int cont = 0;

		public static void main(String[] args) {
				
			Ventana ejercicio3 = new Ventana("Ejercicio 7");
			Panel panel1 = new Panel();
			ejercicio3.add(panel1);
			
			Button boton1 = new Button("Boton1");
			Button boton2 = new Button("Boton2");
			Label contador = new Label("Contador:");
			TextField cuenta = new TextField();
			cuenta.setEditable(false);
			
			cont = 0;
			cuenta.setText("" + cont);
			
			panel1.add(contador);
			panel1.add(cuenta);
			panel1.add(boton1);
			panel1.add(boton2);
			
			boton1.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					cont++;
					cuenta.setText("" + cont);
				}
			});
			
			boton2.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					cont++;
					cuenta.setText("" + cont);
				}
			});
			
		}

	}


