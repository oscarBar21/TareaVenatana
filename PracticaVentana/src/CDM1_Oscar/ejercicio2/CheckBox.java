package CDM1_Oscar.ejercicio2;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;

public class CheckBox {
	private Panel panelSeleccion = new Panel(new FlowLayout());

	public CheckBox(String nombre, String opcion1, String opcion2) {
		panelSeleccion.add(new Label(nombre));
		
		CheckboxGroup grupo = new CheckboxGroup();
		
		Checkbox male = new Checkbox("Masculino", false, grupo);
		panelSeleccion.add(male);
		
		Checkbox female = new Checkbox("Femenino", false, grupo);
		panelSeleccion.add(female);
		
	}
	
	public Panel getPanel() {
		return panelSeleccion;
	}
}
