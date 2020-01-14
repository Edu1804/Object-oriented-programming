/**
 * Definición de la abstracción Persona.
 *
 */
public interface IPersona {
	  
	  /**
	   * Obtiene el DNI de la Persona.
	   * @return DNI.
	   */
	  public String getDNI();
	  
	  /**
	   * Obtiene el Nombre de la Persona.
	   * @return Nombre.
	   */
	  public String getNombre();
	  
	  /**
	   * Obtiene la Persona.
	   * @return Persona.
	   */
	  public IPersona get();
	  
	  public String toString(); 
	  
	  public boolean equals(IPersona p);
	   
	}
