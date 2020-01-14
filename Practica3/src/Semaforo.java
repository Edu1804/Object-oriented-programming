
/**
 * Implementación de la clase Semaforo.
 *
 */
public class Semaforo implements ISemaforo {
	
	private int colorCentral;

	public Semaforo() {
	  setColorCentral(ROJO);
	}
	
	public Semaforo(int colorCentral) {
	  setColorCentral(colorCentral);
	}
	
	public int getColorCentral() {
	  return colorCentral;
	}
	  
	public void setColorCentral(int colorCentral) {
	  this.colorCentral = colorCentral;	  	
	}
	  
	public boolean equals(ISemaforo s) {
		return colorCentral == s.getColorCentral();
	}
	  
	public ISemaforo clone() {
	  return new Semaforo(colorCentral);	  
	}
	
	public String toString() {
		return "Centro: "+colorCentral;
	} 

}
