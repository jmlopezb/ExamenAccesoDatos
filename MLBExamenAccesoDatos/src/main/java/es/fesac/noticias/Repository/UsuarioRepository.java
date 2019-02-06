package es.fesac.noticias.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import es.fesac.noticias.Model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	@Query(
			value="SELECT * FROM LOGIN WHERE EMAIL=:email AND PASSWORD= MD5(:password)", nativeQuery= true
			)
	public Usuario getByEmailAndPassword(String email, String password);

}
