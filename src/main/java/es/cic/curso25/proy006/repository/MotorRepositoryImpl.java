package es.cic.curso25.proy006.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import es.cic.curso25.proy006.model.Motor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class MotorRepositoryImpl {

    @PersistenceContext
    private EntityManager em;

    private Map<Long, Motor> motores = new HashMap<>();

    public long create(Motor motor) {
        em.persist(motor);

        return motor.getId();

        /*
        long mayor = getSiguienteIdConStreams();
        motor.setId(mayor);
        motores.put(motor.getId(), motor);
        return motor.getId();
        */
    }

    private long getSiguienteIdConStreams() {
        long mayor = motores
                .keySet()
                .stream()
                .max(Long::compare)
                .orElse(0L) + 1;
        return mayor;
    }
}
