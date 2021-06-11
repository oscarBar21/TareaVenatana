package CDM1_Oscar.ejercicio2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;

public class Botones {
	private Panel panelBotones = new Panel(new FlowLayout());

	public Botones(String nombre1, String nombre2) {
		panelBotones.add(new Button(nombre1));
		panelBotones.add(new Button(nombre2));
	}
	
	public Panel getPanel() {
		return panelBotones;
	}
}
