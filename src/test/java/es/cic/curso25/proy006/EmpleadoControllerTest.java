package es.cic.curso25.proy006;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmpleadoControllerTest {
    
    @Autowired
    private EmpleadoController empleadoController;
    
    @Test
    void testCreate() {
        long id = empleadoController.create(null);
        assertTrue(id > 0);
    }

    @Test
    void testDelete() {

    }

    @Test
    void testGet() {
        Empleado empleado = empleadoController.get(3);

        assertTrue(empleado != null);
    }

    @Test
    void testLista() {
        List<Empleado> resultado = empleadoController.getLista();

        int contador = resultado.size();
        assertTrue(contador > 1);
    }

    @Test
    void testUpdate() {

    }
}
