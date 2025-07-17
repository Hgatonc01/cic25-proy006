package es.cic.curso25.proy006.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.cic.curso25.proy006.model.Motor;

public interface MotorRepository extends JpaRepository<Motor, Long> {

}
