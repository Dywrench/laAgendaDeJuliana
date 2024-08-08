package laAgendaDeJuliana;
import java.util.Scanner;
public class AplMain {

	public static void main(String[] args) {
		
		Contacto objContacto = new Contacto("Judy",123456,"judym.morenoo@konradlorenz.edu.co","Konrad Lorenz");
		
		String confirmacion = objContacto.enviarMensaje("Eres la mejor profe");
		System.out.println(confirmacion);
		
		
		String llamar = objContacto.llamada("");
		System.out.println(llamar);
		
		String eliminar = objContacto.eliminar("");
		System.out.println(eliminar);
		
		String agregar = objContacto.añadir("");
		System.out.println(agregar);
		
		String buscar = objContacto.busqueda("");
		System.out.println(buscar);
		
		String modificar=objContacto.modificacion("");
		System.out.println(modificar);

		


	}

}
