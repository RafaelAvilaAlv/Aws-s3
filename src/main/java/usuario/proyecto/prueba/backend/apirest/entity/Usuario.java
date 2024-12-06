package usuario.proyecto.prueba.backend.apirest.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	private String nombre;
	private String clave;
	private String email;
	private boolean estado;

	@Transient
	private String imagen_Url;
	private String imagen_Path;
	
	@Transient
	private String pdf_Url;
	private String pdf_Path;
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getImagen_Url() {
		return imagen_Url;
	}
	public void setImagen_Url(String imagen_Url) {
		this.imagen_Url = imagen_Url;
	}
	public String getImagen_Path() {
		return imagen_Path;
	}
	public void setImagen_Path(String imagen_Path) {
		this.imagen_Path = imagen_Path;
	}
	public String getPdf_Url() {
		return pdf_Url;
	}
	public void setPdf_Url(String pdf_Url) {
		this.pdf_Url = pdf_Url;
	}
	public String getPdf_Path() {
		return pdf_Path;
	}
	public void setPdf_Path(String pdf_Path) {
		this.pdf_Path = pdf_Path;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
