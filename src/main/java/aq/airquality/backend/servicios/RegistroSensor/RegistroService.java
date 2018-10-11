package aq.airquality.backend.servicios.RegistroSensor;

import java.util.List;

import aq.airquality.backend.entidades.Registrodelsensor;

public interface RegistroService {

	public Registrodelsensor saveRegistroService(Registrodelsensor registrodelsensor);
	public List<Registrodelsensor> allregistros();
}
