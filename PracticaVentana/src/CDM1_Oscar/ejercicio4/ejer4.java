package CDM1_Oscar.ejercicio4;

/**
 * Este es el ejercicio4 
 * @author: Oscar Barragan Mateos
 * @version: 11/06/2021
 */

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import CDM1_Oscar.General.Ventana;

public class ejer4 {

	public static void main(String[] args) {
		Ventana ejer4 = new Ventana("Ejercicio4");
		Panel panel1 = new Panel(new GridLayout(4,1));
		ejer4.add(panel1);
		
		TextField num1 = new TextField(10);
		TextField num2 = new TextField(10);
		Label resultado = new Label();
		resultado.setAlignment(Label.CENTER);
		Button Resultado = new Button("Mostrar Resultado");
		
		panel1.add(num1);
		panel1.add(num2);
		panel1.add(resultado);
		panel1.add(Resultado);
		
		Resultado.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int n1 = Integer.parseInt(num1.getText());
				int n2 = Integer.parseInt(num2.getText());
				resultado.setText("" +(Math.max(n1, n2)));
			}
		});

	}
	}

