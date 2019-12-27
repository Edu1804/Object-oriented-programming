
/**
 *
 * Descripción del interfaz: Semáforo de circulación sin giro a la derecha.
 */
public interface ISemaforo {
  
  int ROJO=0;
  int AMBAR=1;
  int VERDE=2;
  int APAGADO=3;
  
  /**
   * 
   * @return color central que tiene el semáforo.
   */
  int getColorCentral();
  
  /**
   * 
   * @param colorCentral central que se le pone al semáforo.
   */
  void setColorCentral(int colorCentral);
  
  /**
   * Compara la instancia del semáforo con el semáforo que se pasa por parámetro.
   * Dos semáforos son iguales si se encuentran en el mismo estado (tienen el mismo color).
   * @param s Semáforo a comparar con la instancia
   * @return true si son iguales.
   */
  boolean equals(ISemaforo s);
  
  /**
   * Crea una copia del semáforo.
   * @return La copia del sem´foro.
   */
  ISemaforo clone();
  
  // String toString();  No es necesario ponerlo

}
