
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * Conceptos: 
 * 1) Vista en el Modelo/Vista/Controlador.
 * 2) Modo gráfico 2D en Java.
 * 3) Métodos paint y repaint. 
 * 4) Interface PropertyChangeListener y su método propertyChange.
 */

public class Vista extends Canvas implements PropertyChangeListener { // Listener de los datos enviados por el modelo

  private Graphics2D g2d;
  private int temperatura=36;
  
  /**
   * Método establecido en el modo gráfico 2D para dibujar en el Canvas.
   */
  public void paint(Graphics g) {	
	g2d = (Graphics2D) g;
	if (temperatura>=36)
	  g2d.setColor(java.awt.Color.RED); 
	else
	  g2d.setColor(java.awt.Color.BLUE); 		
    g2d.fillOval(50, 100, 30, 30);
    g2d.fillRect(59, 102-temperatura, 12, temperatura);
    g2d.drawString(""+temperatura, 74, 102-temperatura);
  } 
  
  /**
   * Actualiza la Vista, invocando al método paint, mediante el método repaint.
   */
    public void propertyChange(PropertyChangeEvent evt) {   // Modelo Vista Controlador
        temperatura = (int) evt.getNewValue();
        repaint();
    }
}

