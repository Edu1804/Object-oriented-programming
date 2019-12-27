
public class PruebaSemaforo {

	public static void main(String[] args) {
	  ISemaforo s1;
	  Semaforo s2;
	  ISemaforoDcha sd1;
	  SemaforoDcha sd2;
	  ISemaforo sd3;
	  
	  s1 = new Semaforo(ISemaforo.AMBAR);
	  s2 = new Semaforo(ISemaforo.VERDE);	  
      sd1 = new SemaforoDcha(ISemaforo.VERDE);	
      sd2 = new SemaforoDcha(ISemaforo.ROJO,ISemaforo.AMBAR);	  
      sd3 = new SemaforoDcha(ISemaforo.AMBAR,ISemaforo.ROJO);	
      
      System.out.println("s1: "+s1+", s2: "+s2+", sd1: "+sd1+", sd2: "+sd2+", sd3: "+sd3);
      
      System.out.println(s1.equals(s2));
      
      System.out.println(sd1.getColorCentral()+", "+sd1.getColorDcha());
      
	}

}
