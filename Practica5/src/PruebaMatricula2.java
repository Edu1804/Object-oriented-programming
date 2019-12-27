

/**
 * 
 * Conceptos:
 * 1) Cómo recoger excepciones.
 * 2) Cómo usar enumerados.
 *
 */
public class PruebaMatricula2 {

	// Obtenemos la antigüedad de la matrícula, si su longitud es correcta y también su primera letra lo es.
	public static void main(String[] args) {
		Matricula2 m1 = new Matricula2("9312G8V");

		try {
         m1.valida();
		} catch (ExMatricula2 e) {
			System.out.println("Error en la matrícula: "+e.getFallo());
	        if (e.getFallo()!=ExMatricula2.Fallo.LONGITUD &&
	        	e.getFallo()!=ExMatricula2.Fallo.LETRA_UNO)
		      System.out.println(m1.año());	   
		}	
	}
}
