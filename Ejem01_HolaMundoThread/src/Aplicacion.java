
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo"); //syso control + espacio
		
		Proceso proceso = new Proceso();
		
		proceso.start();// ejecucion concurrente (dr interpola con el main)
		//no es lo mismo que con run
		//proceso.run(); ejecucion secuencial, primero las del hijo y luego las del padre en este caso
		//USAR START SIEMPRE
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Soy Proceso PADRE: "+ i) ;
		}
	}

}
