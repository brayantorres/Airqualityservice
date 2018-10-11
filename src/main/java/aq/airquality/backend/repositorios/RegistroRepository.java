package aq.airquality.backend.repositorios;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aq.airquality.backend.entidades.Registrodelsensor;

@Repository("registroRepository")
public interface RegistroRepository extends JpaRepository<Registrodelsensor, Serializable>{

}
