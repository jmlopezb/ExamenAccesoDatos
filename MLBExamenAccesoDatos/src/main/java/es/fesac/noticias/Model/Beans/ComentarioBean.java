package es.fesac.noticias.Model.Beans;

import es.fesac.noticias.Model.Mensaje;
import es.fesac.noticias.Model.Usuario;

public class ComentarioBean {

	private String contenido;
	private Usuario usuario;
	private Mensaje mensaje;
	
	
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Mensaje getMensaje() {
		return mensaje;
	}
	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
}
