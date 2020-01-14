/**
 * Conceptos: 
 * 1) Instanciación con el constructor vacío.
 * 2) Utilización de métodos de la propia clase.
 * 3) Uso de arrays unidimensionales.
 * 4) Sobrecarga de métodos.
 * Ejercicio de Prácticas.
 *
 */
public class Conjunto implements IConjunto {

	  private boolean[] conjunto;


	  public Conjunto(){
	  		conjunto = new boolean[SIZE]; // por defecto, la JVM lo rellena a falses
	  }
	
	  public void set(int posicion, boolean valor) {
	  	if(posicion<SIZE)
		 	conjunto[posicion] = valor;
	  }
	  
	  public boolean get(int posicion) {
		  if(posicion<SIZE)
			  return conjunto[posicion];
		  return false;
	  }
	  
	  public IConjunto get() {
		 return this; 
	  }
	  
	  public IConjunto union(IConjunto c) {
		 Conjunto auxiliar = new Conjunto();   // Instanciación con el constructor vacío
		 for (int i = 0; i < SIZE; i++)
		   auxiliar.set(i, c.get(i) || conjunto[i]); 
		 return auxiliar;	  
	  }

	  public IConjunto intersection(IConjunto c) {
		  Conjunto auxiliar = new Conjunto();   // Instanciación con el constructor vacío
		  for (int i = 0; i < SIZE; i++)
			 auxiliar.set(i, c.get(i) && conjunto[i]);
		  return auxiliar;	 		  
	  }
	  
	  public int size() {
		int size=0;
		for (int i=0;i<SIZE;i++)
		  if (conjunto[i])
			size++;
		return size;
	  }
	  
	  public String toString() {
		String res="";
		for (int i=0;i<SIZE;i++)
		   if (conjunto[i])
		     res=res+"T ";
		   else
			 res=res+"F ";			   
		return res;
	  }

}
