package aq.airquality.backend.servicios.RegistroUsuarios;

import java.util.List;

import aq.airquality.backend.entidades.Usuarios;


public interface UsuariosService {
	
	public Usuarios saveUsuariosService(Usuarios usuarios);
	
	public List<Usuarios> allusers();

}
