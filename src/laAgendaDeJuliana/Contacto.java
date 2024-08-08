package laAgendaDeJuliana;
import java.util.Scanner;
public class Contacto {
	
	private String nombre;
	private int numeroCelular;
	private String correo;
	private String empresa;
	
	
	public Contacto() {
		
	}
	
	
	public Contacto(String n, int nT, String correo, String emp) {
		nombre = n;
		numeroCelular = nT;
		this.correo = correo;
		empresa = emp;
	}
	
	
	Scanner sc= new Scanner (System.in);
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreoElectronico(String correo) {
		this.correo = correo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}




	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", numeroCelular=" + numeroCelular + ", correo=" + correo + ", empresa="
				+ empresa + "]";
	}
	
	public String enviarMensaje (String mensaje) {
		return "Mensaje enviado:"+mensaje;
	}
	
	public String llamada (String llamar) {
		return "llamando a:"+nombre;
	}
	
	public String eliminar (String eliminar) {
		return "se ha eliminado:"+nombre+" de su lista de contactos";
	}
	
	public String añadir (String agregar) {
		return "se ha agregado:"+nombre+" a su lista de contactos";
	}
	
	public String busqueda (String buscar) {
		return nombre+numeroCelular+correo+empresa;
	}
	
	public String modificacion (String modificar) {
		System.out.println("el nombre actual del contacto es: "+nombre);

		System.out.println("ingrese el nuevo nombre del contacto");
		nombre= sc.nextLine();
		return "el nuevo nombre del contacto es: "+nombre ;
		
	}
}
