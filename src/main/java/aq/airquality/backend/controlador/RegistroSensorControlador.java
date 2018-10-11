package aq.airquality.backend.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import aq.airquality.backend.entidades.Registrodelsensor;
import aq.airquality.backend.servicios.RegistroSensor.RegistroService;

@RestController
public class RegistroSensorControlador {
	
	@Autowired
	@Qualifier("registroService")
	private RegistroService registroService;
	
	@PostMapping("save/registrodelsensor")
	public Registrodelsensor saveRegistroService(@Valid @RequestBody Registrodelsensor registrodelsensor) {
		return registroService.saveRegistroService(registrodelsensor);
	}
	
	@GetMapping("traer/registrosdelsensor")
	public List<Registrodelsensor> allregistros(){
		return registroService.allregistros();
	}
}
