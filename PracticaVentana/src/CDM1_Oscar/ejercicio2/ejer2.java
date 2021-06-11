package CDM1_Oscar.ejercicio2;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import CDM1_Oscar.General.Ventana;

public class ejer2 {

	public static void main(String[] args) {

		Ventana ejercicio2 = new Ventana("Ejercicio 2");
		Panel panelEj2 = new Panel(new BorderLayout());
		ejercicio2.add(panelEj2);
		panelEj2.add(new Label("Formulario de registro", Label.CENTER), BorderLayout.NORTH);

		Panel panelGrid1 = new Panel();
		GridLayout grid = new GridLayout(1, 2);
		grid.setVgap(100);
		panelGrid1.setLayout(grid);
		panelEj2.add(panelGrid1);

		Panel panelGrid2 = new Panel(new GridLayout(7, 1));
		panelGrid1.add(panelGrid2);

		panelGrid2.add(new TextField("Nombre", 15).getPanel());
		panelGrid2.add(new TextField("Movil", 9).getPanel());
		panelGrid2.add(new CheckBox("Genero", "Masculino", "Femenino").getPanel());
		panelGrid2.add(new fecha("Fecha").getPanel());
		panelGrid2.add(new textArea("Direccion", 2, 15).getPanel());

		Panel panel7 = new Panel(new FlowLayout(FlowLayout.CENTER));
		panelGrid2.add(panel7);
		panel7.add(new Checkbox("Acepta los terminos y las condiciones", false));

		panelGrid2.add(new Botones("Enviar", "Limpiar").getPanel());

		panelGrid1.add(new TextArea());
	}
}
