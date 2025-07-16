package es.cic.curso25.proy006.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import es.cic.curso25.proy006.model.Motor;

@Repository
public class MotorRepository {

    private Map<Long, Motor> motores = new HashMap<>();

    public long create(Motor motor) {
        long mayor = getSiguienteIdConStreams();
        motor.setId(mayor);
        motores.put(motor.getId(), motor);
        return motor.getId();
    }

    private long getSiguienteIdConStreams() {
        long mayor =
            motores
                .keySet()
                .stream()
                .max(
                    (primero, segundo) -> (int) (segundo.longValue() - primero.longValue())
                ).get();
        return mayor + 1;
    }
}
