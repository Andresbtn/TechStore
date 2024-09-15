package co.edu.unbosque.model;

public class ContactoEmpleadorDTO {

    private String empresa;
    private String email;
    private String mensaje;
    private String fechaCierreVacante;

    public ContactoEmpleadorDTO(String empresa, String email, String mensaje, String fechaCierreVacante) {
        this.empresa = empresa;
        this.email = email;
        this.mensaje = mensaje;
        this.fechaCierreVacante = fechaCierreVacante;
    }

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getFechaCierreVacante() {
		return fechaCierreVacante;
	}

	public void setFechaCierreVacante(String fechaCierreVacante) {
		this.fechaCierreVacante = fechaCierreVacante;
	}
    
}

