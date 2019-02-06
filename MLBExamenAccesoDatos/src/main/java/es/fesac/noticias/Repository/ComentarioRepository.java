package es.fesac.noticias.Repository;

import org.springframework.data.repository.CrudRepository;

import es.fesac.noticias.Model.Comentario;

public interface ComentarioRepository extends CrudRepository<Comentario, Long> {

}
