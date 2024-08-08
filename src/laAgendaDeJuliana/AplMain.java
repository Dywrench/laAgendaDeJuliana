package laAgendaDeJuliana;

public class AplMain {

	public static void main(String[] args) {
		
		Contacto objContacto = new Contacto("Judy",123456,"judym.morenoo@konradlorenz.edu.co","Konrad Lorenz");
		
		String confirmacion = objContacto.enviarMensaje("Eres la mejor profe");
		System.out.println(confirmacion);
	}

}
