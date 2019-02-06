package es.fesac.noticias.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="Comentarios")
public class Comentario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Lob
	private String contenido;
	private Usuario usuario;
	private Mensaje mensaje;
	
}
