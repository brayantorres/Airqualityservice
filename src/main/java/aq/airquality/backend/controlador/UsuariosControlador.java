package aq.airquality.backend.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aq.airquality.backend.entidades.Usuarios;
import aq.airquality.backend.servicios.UsuariosService;

@RestController
public class UsuariosControlador {
	

	@Autowired
	@Qualifier("usuariosService")
	private UsuariosService usuariosService;
	
	@RequestMapping("/")
	public String index() {
		return "airquality";
	}

	@PostMapping("save/usuario")
	public Usuarios saveUsuario(@Valid @RequestBody Usuarios usuarios) {
		return usuariosService.saveUsuariosService(usuarios);
	}
	
	@GetMapping("traer/usuarios")
	public List<Usuarios> allusers() {
		return usuariosService.allusers();
	}
	
	@GetMapping("traer/usuario/by/{id}")
	public Usuarios getUsuario(@PathVariable(value="id") Long id) {
		System.out.println("******************************************");
		System.out.println(id);
		return usuariosService.getUsuario(id);
	}
}
