package CDM1_Oscar.ejercicio2;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;

public class TextField {
	private Panel panelTexto = new Panel(new FlowLayout());

	public TextField(String nombre, int tama�oTexto) {
		panelTexto.add(new Label(nombre));
	}
	
	public Panel getPanel() {
		return panelTexto;
	}
}
