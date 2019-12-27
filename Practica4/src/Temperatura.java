
import java.awt.Frame;
import java.beans.PropertyChangeSupport;

/**
 * Conceptos:
 * 1) Creación de las instancias Modelo/Vista/Controlador.
 * 2) Enlace del Controlador con la Vista.
 * 3) Establecimiento del Listener del teclado en el Frame de visualización.
 * 4) Añadir el Canvas al Frame.
 */

public class Temperatura {

	public Temperatura() {
		
		PropertyChangeSupport supportTemperatura = new PropertyChangeSupport(this);
		PropertyChangeSupport supportTeclado = new PropertyChangeSupport(this);		
		
		Controlador controlador = new Controlador(supportTeclado); // Crea el objeto que representa al Controlador y le pasa el ChangeSupport para que envíe las variaciones de temperatura al Modelo
		Modelo modelo = new Modelo(supportTemperatura); // Crea el objeto que representa al Modelo y le pasa el ChangeSupport para que envíe las temperaturas a la Vista	
		Vista vista = new Vista();  // Crea la vista	

		supportTeclado.addPropertyChangeListener(modelo);     // El Modelo escucha las variaciones de supportTeclado (provenientes del Controlador)
		supportTemperatura.addPropertyChangeListener(vista);  // La vista escucha las variaciones de supportTemperatura (provenientes del Modelo)
		vista.addKeyListener(controlador);  // El Canvas escucha las pulsaciones de teclado 
			
		Frame frame = new Frame();
		frame.add(vista);		
		frame.setSize(140, 200);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] a) {
		new Temperatura();
	}
}
