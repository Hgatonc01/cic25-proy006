package es.cic.curso25.proy006.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import es.cic.curso25.proy006.model.Empleado;

@Service
public class EmpleadoService {

    private long contador = 0;

    public long create(Empleado empleado) {
        return ++contador;
    }

    public List<Empleado> getLista() {
        List<Empleado> resultado = new ArrayList<>();

        Empleado empleado1 = new Empleado();
        empleado1.setId(1);
        empleado1.setNombre("Hugo");
        empleado1.setDepartamento("TELCO");
        empleado1.setNumero("11111111");
        resultado.add(empleado1);

        Empleado empleado2 = new Empleado();
        empleado2.setId(2);
        empleado2.setNombre("Pepe");
        empleado2.setDepartamento("RRHH");
        empleado2.setNumero("22222222");
        resultado.add(empleado2);

        return resultado;
    }

    public Empleado get(long id){

        Empleado empleado1 = new Empleado();
        empleado1.setId(id);
        empleado1.setNombre("Jorge");
        empleado1.setDepartamento("TELCO");
        empleado1.setNumero("33333333");

        return empleado1;
    }

}
