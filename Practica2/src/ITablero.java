

/**
 * Tablero cuadrado de elementos de tipo int. Válido para albergar el estado de juegos tipo 'Barquitos' o ajedrez
 * Ejercicio de Prácticas.
 */

public interface ITablero {

  /**
   * Proporciona la estructura de datos del tablero.				
   * @return Array bidimensional de enteros, con los valores de cada casilla del tablero.
   */
  int[][] getTablero();

  /**
   * Actualiza el tablero con los valores de una estructura de datos.		
   * @param tablero Array bidimensional de enteros, con los valores de cada casilla del tablero.
   */
  void setTablero(int[][] tablero);

  /**
   * Tamaño del tablero.		
   * @return Número de elementos que componen ambas dimensiones del tablero; en ajedrez el tamaño es 8.
   */
  int getTamanio();

  /**
   * Proporciona el contenido de la casilla solicitada.		
   * @param x Índice x.
   * @param y Índice y
   * @return valor contenido en la casilla de posición (x,y).
   */
  int getPosicion(int x, int y);

  /**
   * Actualiza el contenido de la casilla solicitada.		
   * @param x Índice x.
   * @param y Índice y
   * @param valor Contenido a colocar en la casilla.
   */		
  void setPosicion(int x, int y, int valor);

  /**
   * Inicializa el tablero. Coloca un 0 en todas sus posiciones.	
   */
  void borra();

  /**
   * Indica la cantidad de casillas que están libres.		
   * @return Número de casillas a cero.
   */
  int ocupacion();

  /**
   * Representación de la instancia.		
   * @return Cadena de caracteres conteniendo una representación de la instancia.
   */
  String toString();

}
