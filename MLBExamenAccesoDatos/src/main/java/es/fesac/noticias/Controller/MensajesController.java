package es.fesac.noticias.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.fesac.noticias.Model.Mensaje;
import es.fesac.noticias.Repository.MensajeRepository;

public class MensajesController {
	
	
	 @Autowired
		MensajeRepository MensajeRepository;
	    
	    @Autowired
		private HttpSession httpSession;
	
	
	@GetMapping(path="/allMensajes")
	public @ResponseBody Iterable<Mensaje> getAllPost() {
		
		return MensajeRepository.findAll();
	}

}
