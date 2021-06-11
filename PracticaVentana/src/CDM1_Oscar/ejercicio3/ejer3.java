package CDM1_Oscar.ejercicio3;

/**
 * Este es el ejercicio3 
 * @author: Oscar Barragan Mateos
 * @version: 11/06/2021
 */

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import CDM1_Oscar.General.Ventana;

public class ejer3 {

	public static void main(String[] args) {

		Ventana ejer3 = new Ventana("Ejercicio3");
		Panel panel1 = new Panel(new GridLayout(1, 3));
		ejer3.add(panel1);

		Button boton1 = new Button("BOTON1");
		Button boton2 = new Button("BOTON2");
		Label etiqueta = new Label();
		etiqueta.setAlignment(Label.CENTER);

		panel1.add(boton1);
		panel1.add(etiqueta);
		panel1.add(boton2);

		boton1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				etiqueta.setText("BOTON1");
			}
		});
		boton2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				etiqueta.setText("BOTON2");
			}
		});
	}
}
