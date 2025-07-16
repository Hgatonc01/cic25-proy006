package es.cic.curso25.proy006.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cic.curso25.proy006.model.Empleado;
import es.cic.curso25.proy006.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping
    public long create(@RequestBody Empleado empleado) {
        long id = empleadoService.create(empleado);

        return id;
    }

    @GetMapping
    public List<Empleado> getLista(){
        List<Empleado> resultado = empleadoService.getLista();

        return resultado;
    }

    @GetMapping("/{id}")
    public Empleado get(@PathVariable long id){
        Empleado empleado1 = empleadoService.get(id);

        return empleado1;
    }

    @PutMapping
    public void update(@RequestBody Empleado empleado) {
    }

    @DeleteMapping ("/{id}")
    public void delete(@PathVariable long id) {
    }

}
