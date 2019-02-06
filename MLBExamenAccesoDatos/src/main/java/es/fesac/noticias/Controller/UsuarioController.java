package es.fesac.noticias.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.fesac.noticias.Model.Usuario;
import es.fesac.noticias.Model.Beans.UsuarioBean;
import es.fesac.noticias.Repository.UsuarioRepository;



@Controller
public class UsuarioController {

	@Autowired
	private HttpSession httpSession;
			
	
	@Autowired
	UsuarioRepository loginRepository; 
	

	
	@GetMapping("/")
	public String bienvenida(Model model) {
		model.addAttribute("usuarioLogin", new UsuarioBean());
		
		
		return "index";}
	
	@PostMapping("/login")
	public String validarLogin(@ModelAttribute("usuarioLogin") UsuarioBean loginBean, Model model) 
	{
		Usuario U= loginRepository.getByEmailAndPassword(loginBean.getEmail(), loginBean.getPassword());
		
		if(U!=null) {
			
			httpSession.setAttribute("usuarioSesion", U);
			
		}
		
		return "redirect:/";
	}
}
