
/**
 * Implementación de la clase Semaforo con giro a la derecha.
 * Conceptos: 
 * 1) Herencia en interfaces y en clases.
 * 2) Redefinición.
 * 3) super() y super.
 * 4) Polimorfismo en el paso de parámetros.
 */
public class SemaforoDcha extends Semaforo implements ISemaforoDcha {
	
	private int colorDcha;

	public SemaforoDcha() {
	  super();  // Lo pone automáticamente el compilador
	  setColorDcha(ROJO);
	}
	
	public SemaforoDcha(int colorDcha) {
	  super();   // o this();
	  setColorDcha(colorDcha);
	}
	
	public SemaforoDcha(int colorCentral, int colorDcha) {
	  super(colorCentral);
	  // this(colorDcha); No es posible, solo puede haber un this() o un super() como primera instr. del constructor.
	  setColorDcha(colorDcha);	  
	}
	
	public int getColorDcha() {
	  return colorDcha;
	}
	  
	public void setColorDcha(int colorDcha) {
	  this.colorDcha = colorDcha;	  	
	}
	  
	public boolean equals(ISemaforoDcha s) {
	  return super.equals(s) && colorDcha == s.getColorDcha(); // Polimorfismo: argumento SemaforoDcha se pasa a parametro Semaforo.
	}
	  
	public ISemaforoDcha clone() {
	  return new SemaforoDcha(getColorCentral(),getColorDcha());	  
	}
	
	public String toString() {
		return super.toString()+" ,Dcha: "+colorDcha; // Redefinición
	} 

}
