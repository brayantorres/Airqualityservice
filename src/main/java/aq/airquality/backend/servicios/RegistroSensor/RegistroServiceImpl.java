package aq.airquality.backend.servicios.RegistroSensor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import aq.airquality.backend.entidades.Registrodelsensor;
import aq.airquality.backend.repositorios.RegistroRepository;

@Service("registroService")
public class RegistroServiceImpl implements RegistroService{
	
	@Autowired
	@Qualifier("registroRepository")
	private RegistroRepository registroService;
	
	@Override
	public Registrodelsensor saveRegistroService(Registrodelsensor registrodelsensor) {
		return registroService.save(registrodelsensor);
	}

}
