
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo"); //syso control + espacio
		
		Proceso proceso = new Proceso();
		
		//proceso.start();//era de thread, no de runnable
		//si hacemos un run hace la ejecucion secuencial, no nos sirve
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Soy Proceso PADRE: "+ i) ;
		}
	}

}
