package CDM1_Oscar.General;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends Frame {

	public Ventana(String titulo, int ancho, int alto, int x, int y) {
		this.setSize(ancho, alto);
		this.setTitle(titulo);
		this.setVisible(true);
		this.setLocation(x, y);

		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
	}

	public Ventana(String titulo, int ancho, int alto) {
		this(titulo, ancho, alto, 0, 0);
	}

	public Ventana(String titulo) {
		this(titulo, 400, 200);
	}

	public Ventana() {
		this("Mi ventana", 400, 200);
	}
}
