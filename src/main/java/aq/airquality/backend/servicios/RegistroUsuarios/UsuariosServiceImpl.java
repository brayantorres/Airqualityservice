package aq.airquality.backend.servicios.RegistroUsuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import aq.airquality.backend.entidades.Usuarios;
import aq.airquality.backend.repositorios.UsuariosRepository;

@Service("usuariosService")
public class UsuariosServiceImpl implements UsuariosService {
	
	@Autowired
	@Qualifier("usuariosRepository")
	private UsuariosRepository usuariosRepository;
	
	@Override
	public Usuarios saveUsuariosService(Usuarios usuarios) {
		return usuariosRepository.save(usuarios);
	}

	@Override
	public List<Usuarios> allusers() {
		return usuariosRepository.findAll();
	}
}
