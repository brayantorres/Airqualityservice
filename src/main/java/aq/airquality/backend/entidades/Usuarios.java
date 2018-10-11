package aq.airquality.backend.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios_entidad")
public class Usuarios implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String correo;
	private int altura;
	private int peso;
	private Double imc;
	private int cantidaddepasos;
	private int horasdesueño;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Double getImc() {
		return imc;
	}

	public void setImc(Double imc) {
		this.imc = imc;
	}

	public int getCantidaddepasos() {
		return cantidaddepasos;
	}

	public void setCantidaddepasos(int cantidaddepasos) {
		this.cantidaddepasos = cantidaddepasos;
	}

	public int getHorasdesueño() {
		return horasdesueño;
	}

	public void setHorasdesueño(int horasdesueño) {
		this.horasdesueño = horasdesueño;
	}

}
