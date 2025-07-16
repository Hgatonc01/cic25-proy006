package es.cic.curso25.proy006;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.cic.curso25.proy006.model.Motor;
import es.cic.curso25.proy006.service.MotorService;

@SpringBootTest
public class MotorServiceIntegrationTest {

    @Autowired
    private MotorService motorService;

    @Test
    public void testCreate() {
        Motor motorACrear = new Motor();
        motorACrear.setEncendido(true);
        motorACrear.setMarca("Renault");
        motorACrear.setPotencia(2.1);

        long idAsiganado = motorService.create(motorACrear);

        assertTrue(idAsiganado > 0, "El id no debe ser no positivo");


    }

}
