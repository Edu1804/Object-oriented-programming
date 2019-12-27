
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
* Conceptos: 
* 1) Modelo en el Modelo/Vista/Controlador.
* 2) Clase PropertyChangeSupport y su método firePropertyChange.
* 3) Interfaz PropertyChangeListener.
*/

public class Modelo implements PropertyChangeListener {   // Listener de los datos enviados por el controlador
    private int temperatura = 36;
    private PropertyChangeSupport supportTemperatura;  // Support de los datos enviados a la vista
  
    public Modelo(PropertyChangeSupport changeSupport) {
       this.supportTemperatura = changeSupport;     
    }
 
  
  /**
   * @return Temperatura del modelo.
   */
  public int getTemperatura() { return temperatura; }
  
  
  /**
   * Recoge los datos provenientes de supportTeclado; Calcula la temperatura que se asigna al modelo (entre 0 y 80 grados);
   * Notifica la temperatura a la vista.
   */
  public void propertyChange(PropertyChangeEvent evt) {   // Modelo Vista Controlador
	  temperatura = temperatura + (int) evt.getNewValue();
      if (temperatura>0 && temperatura<80) {  // de 0 a 80 grados
        supportTemperatura.firePropertyChange("temperatura", temperatura, temperatura+(int) evt.getNewValue()); // Datos enviados a la Vista
        temperatura = temperatura + (int) evt.getNewValue();
      }   
  }

}
