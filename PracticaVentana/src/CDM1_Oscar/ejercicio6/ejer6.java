package CDM1_Oscar.ejercicio6;

/**
 * Este es el ejercicio6 
 * @author: Oscar Barragan Mateos
 * @version: 11/06/2021
 */

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import CDM1_Oscar.General.Ventana;

public class ejer6 {

	private static boolean llamar = false;

	public static void main(String[] args) {
		
		Ventana ejer6 = new Ventana("Ejercicio6");
		
		Panel panelTelefono = new Panel(new BorderLayout());
		ejer6.add(panelTelefono);
		
		Panel panelResultado = new Panel();
		TextArea Pantalla = new TextArea("",1,25, TextArea.SCROLLBARS_NONE);
		Pantalla.setEditable(false);
		panelResultado.add(Pantalla);
		panelTelefono.add(panelResultado, BorderLayout.NORTH);
		
		Button[] botones = new Button[10];
		Panel panelDigitos = new Panel(new GridLayout(4,3));
		for (int i = 0; i < 9; i++) {
			botones[i] = new Button("" + (i + 1));
			panelDigitos.add(botones[i]);
		}
		
		Button borrar = new Button("Borrar");
		botones[9] = new Button("0");
		Button llamarColgar = new Button("Llamar");
		panelDigitos.add(borrar);
		panelDigitos.add(botones[9]);
		panelDigitos.add(llamarColgar);
		panelTelefono.add(panelDigitos);
	
		botones[0].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Pantalla.append("" + 1);
			}
		});
		botones[1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Pantalla.append("" + 2);
			}
		});
		botones[2].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Pantalla.append("" + 3);
			}
		});
		botones[3].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Pantalla.append("" + 4);
			}
		});
		botones[4].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Pantalla.append("" + 5);
			}
		});
		botones[5].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Pantalla.append("" + 6);
			}
		});
		botones[6].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Pantalla.append("" + 7);
			}
		});
		botones[7].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Pantalla.append("" + 8);
			}
		});
		botones[8].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Pantalla.append("" + 9);
			}
		});
		botones[9].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Pantalla.append("" + 0);
			}
		});
		
		borrar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Pantalla.setText("");
			}
		});
		
		llamarColgar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (llamar == false) {
					llamar = true;
					llamarColgar.setLabel("COLGAR");
					Pantalla.setText("");
					Pantalla.append("Llamando......");
				}else {
					llamar = false;
					llamarColgar.setLabel("LLAMAR");
					Pantalla.setText("");
					Pantalla.append("Llamada Finalizada");
				}
			}
		});
		
	}

}
