package CDM1_Oscar.ejercicio2;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;

public class textArea {
	private Panel panelTexto = new Panel(new FlowLayout());

	public textArea(String nombre, int cols, int rows) {
		panelTexto.add(new Label(nombre));
		panelTexto.add(new TextArea(cols, rows));
	}
	
	public Panel getPanel() {
		return panelTexto;
	}
}
