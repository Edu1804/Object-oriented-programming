
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeSupport;

/**
 * Implementación del Controlador.
 * Conceptos: 
 * 1) Controlador en el Modelo/Vista/Controlador.
 * 2) Eventos de teclado.
 * 3) Clase PropertyChangeSupport y su método firePropertyChange.
 */
public class Controlador implements KeyListener {  // Listener de las pulsaciones de teclado. Se puede usar la clase KeyAdapter
	
    private PropertyChangeSupport supportTeclado;
	
	/**
	 Se recoge el modelo para actualizar su temperatura a partir de los eventos entrantes.
	 */
	public Controlador (PropertyChangeSupport supportTeclado) {
      this.supportTeclado = supportTeclado; 
	}
	
	
	/**
	 * Evento de teclado.
	 */
	public void keyTyped(KeyEvent e) {   // Significa: pressed + released
	  int incremento=0;
	  if (e.getKeyChar()=='s') incremento = 2;
      if (e.getKeyChar()=='b') incremento = -2;
      supportTeclado.firePropertyChange("teclado", 0, incremento); // Datos enviados al Modelo
    }
	
	public void keyPressed(KeyEvent e) { } // Podríamos actuar cuando se pulsa una tecla
	
	public void keyReleased(KeyEvent e) { } // Podríamos actuar cuando se libera una tecla
      
}

