package aq.airquality.backend.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registro_sensor")
public class Registrodelsensor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8104587283528877190L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_resgitrosensor")
	private Integer id;
	
	private int  idSensor;
	private Double fecha;
	private Double humedad;
	private Double temperatura;
	private Double co2;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getIdSensor() {
		return idSensor;
	}
	public void setIdSensor(int idSensor) {
		this.idSensor = idSensor;
	}
	public Double getFecha() {
		return fecha;
	}
	public void setFecha(Double fecha) {
		this.fecha = fecha;
	}
	public Double getHumedad() {
		return humedad;
	}
	public void setHumedad(Double humedad) {
		this.humedad = humedad;
	}
	public Double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
	public Double getCo2() {
		return co2;
	}
	public void setCo2(Double co2) {
		this.co2 = co2;
	}
	
	
}
