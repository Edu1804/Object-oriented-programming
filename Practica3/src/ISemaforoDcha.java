/**
 * Descripción del interfaz: Semáforo de circulación con giro a la derecha.
 * Conceptos: 
 * Herencia en interfaces y en clases.
 */
public interface ISemaforoDcha extends ISemaforo{
	
	  /**
	   * 
	   * @return color derecha que tiene el semáforo.
	   */
	  int getColorDcha();
	  
	  /**
	   * 
	   * @param colorCentral derecha que se le pone al semáforo.
	   */
	  void setColorDcha(int colorCentral);
	  
	  /**
	   * Compara la instancia del semáforo con el semáforo que se pasa por parámetro.
	   * Dos semáforos son iguales si se encuentran en el mismo estado (tienen los mismos colores).
	   * @param s Semáforo a comparar con la instancia
	   * @return true si son iguales.
	   */
	  boolean equals(ISemaforoDcha s);
	  
	  /**
	   * Crea una copia del semáforo.
	   * @return La copia del semáforo.
	   */
	  ISemaforoDcha clone();

}
