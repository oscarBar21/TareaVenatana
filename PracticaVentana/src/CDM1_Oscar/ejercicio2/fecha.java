package CDM1_Oscar.ejercicio2;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;

public class fecha {
	private Panel panelFecha = new Panel(new FlowLayout());

	public fecha(String nombre) {
		panelFecha.add(new Label(nombre));

		Choice dia = new Choice();
		for (int i = 1; i < 32; i++) {
			dia.add("" + i);
		}
		panelFecha.add(dia);
		
		Choice mes = new Choice();
		for (int i = 1; i < 13; i++) {
			mes.add("" + i);
		}
		panelFecha.add(mes);
		
		Choice anio = new Choice();
		for (int i = 2021; i > 1970; i--) {
			anio.add("" + i);
		}
		panelFecha.add(anio);
		
	}
	
	public Panel getPanel() {
		return panelFecha;
	}
}
