
/**
 * Exception que almacena un estado.
 * Excepciones como clases, con estados.
 */
public class ExMatricula2 extends Exception {

	/**
	 * Tipos de excepciones de Matricula.
	 *
	 */
	public static enum Fallo {LONGITUD, NUMERO_UNO, NUMERO_DOS, NUMERO_TRES, NUMERO_CUATRO, 
		                      LETRA_UNO, LETRA_DOS, LETRA_TRES}
	
	private Fallo e;
	
	public ExMatricula2(Fallo e) {
	  this.e = e;		
	}
	
	public Fallo getFallo() {
	  return e;
	}
}
