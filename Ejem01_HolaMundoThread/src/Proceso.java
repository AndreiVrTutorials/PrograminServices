
public class Proceso extends Thread{//hereda todo lo de la clase thread
	//implementa runable

	public Proceso() {
		super();
		// TODO Auto-generated constructor stub
		/*
		for (int i = 0; i < 1000; i++) {
			System.out.println("Soy Proceso hijo: "+i) ;
		}
		*/
	}
	//thread es la clase que nos va a permitir crear procesos
	//Para iniciar el hilo que llama al metodo start() que llama al metodo run()

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super objeto padre
		super.run();//llama al objeto padre del que se hereda
		//llamamos al metodo run del padre
		for (int i = 0; i < 1000; i++) {
			System.out.println("Soy Proceso hijo: "+i) ;
		}
	}
	
	

}
