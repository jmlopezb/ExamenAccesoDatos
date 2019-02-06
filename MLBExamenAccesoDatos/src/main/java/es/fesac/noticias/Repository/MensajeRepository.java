package es.fesac.noticias.Repository;

import org.springframework.data.repository.CrudRepository;

import es.fesac.noticias.Model.Mensaje;

public interface MensajeRepository extends CrudRepository<Mensaje, Long> {

}
