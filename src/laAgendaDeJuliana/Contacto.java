package laAgendaDeJuliana;

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
	
}
