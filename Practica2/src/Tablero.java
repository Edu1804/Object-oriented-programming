
/**
 * Ejercicio de Prácticas.
 */
public class Tablero implements ITablero {

	private int [][] tablero; 
	private int tamanio;


	/**
	 * Tablero inicializado con el valor 0 en todas sus casillas.
	 * @param tamanio Tamaño del tablero (que será cuadrado).
	 */
	public Tablero(int tamanio) {
	  this.tamanio = tamanio;
	  tablero = new int[tamanio][tamanio]; 	
	}
				
    public int[][] getTablero() {
	  return tablero;
	}
		
	public void setTablero(int[][] tablero) {
	   this.tablero=tablero;
	}
	
	public int getTamanio() {
		return tamanio;
	}
	
	public int getPosicion(int x, int y) {
	  return tablero[x][y];
	}
	
	public void setPosicion(int x, int y, int valor) {
	  tablero[x][y]=valor;
	}
	
	public void borra() {
	  for (int y=0;y<tamanio;y++) 
		for (int x=0;x<tamanio;x++) 
		  tablero[x][y]	= 0;
	}
	
	public int ocupacion() {
	  int cont=0;
	  for (int y=0;y<tamanio;y++) 
		for (int x=0;x<tamanio;x++) 
		  if (tablero[x][y]==0)
			cont++;
	  return cont;
	}
	
	public String toString() {
	  String resultado="";
	  for (int y=0;y<tamanio;y++) {
		for (int x=0;x<tamanio;x++) 
		  resultado=resultado+tablero[x][y]+" ";	
		resultado=resultado+"\n";
	  }	
	  resultado=resultado+"\n\n";
	  return resultado;
	}
}

