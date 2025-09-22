
public class Aplicacion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo"); //syso control + espacio
		
		Proceso1 proceso = new Proceso1();
		
		proceso.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Soy Proceso PADRE: "+ i) ;
		}
	}
}
