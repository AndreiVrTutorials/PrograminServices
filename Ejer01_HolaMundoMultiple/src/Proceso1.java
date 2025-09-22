
public class Proceso1 extends Thread{
	public Proceso1() {
		super();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i =0; i< 1000; i++) { 
			System.out.println("Soy el proceso hijo111 " + i);
		}
	}
	
}
