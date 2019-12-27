/**
 * 
 * Abstracción de conjunto matemático en el que pueden existir, o no, un número fijado de SIZE elementos.
 * 
 * Conceptos: 
 * 1) Repaso de Interfaz
 * 2) Diseño pensando en instancias: la union e interseccion se hacen entre la instancia y el Conjunto pasado como argumento
 * 3) Utilización de los interfaces como tipos: todavía no tenemos una clase para utilizar como tipo
 * 4) En los interfaces decimos qué hacer, y no cómo hacerlo: podríamos implementar el conjunto con array de booleanos o de otra forma
 * 5) En los interfaces no podemos indicar cómo inicializar los objetos. Ese nivel de detalle se deja a las clases, porque es dependiente
 *    de la implementación que se realice
 * 6) Propiedades de los interfaces: públicas, final y "estáticas" (estático, por ahora, su concepto general)
 *
 */
public interface IConjunto {
  
  /**
   * Número de elementos del conjunto.
   */
  int SIZE = 20;  // Conjuntos de 20 elementos
  
  /**
   * Añade o elimina el elemento 'posicion' en el conjunto.
   * @param posicion Elemento a añadir o eliminar.
   * @param valor 'true' para añadir y 'false' para eliminar.
   */
  void set(int posicion, boolean valor);
  
  /**
   * Indica si el elemento 'posicion' pertenece al conjunto.
   * @param posicion Elemento que se consulta.
   * @return 'true' si el elemento pertenece al conjunto; 'false' si el elemento no pertenece al conjunto.
   */
  boolean get(int posicion);
  
  /**
   * Devuelve el Conjunto completo.
   * @return La instancia del conjunto.
   */
  IConjunto get();
  
  /**
   * Realiza la unión matemática de conjuntos.
   * @param c Conjunto que se va a unir a nuestra instancia.
   * @return Unión del conjunto c con la instancia de la clase.
   */
  IConjunto union(IConjunto c);
  
  /**
   * Realiza la intersección matemática de conjuntos.
   * @param c Conjunto con el que se va a realizar la intersección a nuestra instancia.
   * @return Intersección del conjunto c con la instancia de la clase.
   */  
  IConjunto intersection(IConjunto c);
  
  /** 
   * Indica el tamaño del conjunto: su número de elementos, que siempre será menor o igual a SIZE.
   * @return Número de elementos del conjunto.
   */
  int size();

  @Override
  String toString();
  
}
