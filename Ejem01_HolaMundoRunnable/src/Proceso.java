
public class Proceso implements Runnable{
	//de esta forma liberamos la limitacion a no poder heredar de otra clase
	
	private Thread proceso;
	public Proceso() {
		super();
		proceso= new Thread(this);
		proceso.start();
	}
	@Override
	public void run() {
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Soy Proceso hijo: "+i) ;
		}
	}
	
	

}
