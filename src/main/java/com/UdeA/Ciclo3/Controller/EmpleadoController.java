package com.UdeA.Ciclo3.Controller;


import com.UdeA.Ciclo3.Entity.Empleado;
import com.UdeA.Ciclo3.Entity.Empresa;
import com.UdeA.Ciclo3.Service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping
    private ResponseEntity<List<Empleado>> GetallEmpleado() {
        List<Empleado> empleados = empleadoService.findAll();
        return ResponseEntity.ok(empleados);
}
    @RequestMapping(value = ("{id}"))
    private ResponseEntity<Empleado> GetEmpleadoById(@PathVariable("id") Integer id) {
        Optional<Empleado> optionalempleado = empleadoService.findById(id);
        if (optionalempleado.isPresent()) {
            return ResponseEntity.ok(optionalempleado.get());
        } else {
            return ResponseEntity.noContent().build();
        }
    }
    @PostMapping
    public ResponseEntity<Empleado> CreateEmpleado(@RequestBody Empleado empleado ) {
        Empleado NewEmpleado = empleadoService.save(empleado);
        return ResponseEntity.ok(NewEmpleado);
    }

    @DeleteMapping(value = ("{id}"))
    public ResponseEntity<Void> DeleteEmpleado(@PathVariable("id") Integer id) {
        empleadoService.deleteById(id);
        return ResponseEntity.ok(null);
    }
    @PutMapping
    public ResponseEntity<Empleado> UpdateEmpleado(@RequestBody Empleado empleado ){
        Optional<Empleado> optionalEmpleado = empleadoService.findById(empleado.getId());
        if (optionalEmpleado.isPresent()) {
            Empleado UpdateEmpleado= optionalEmpleado.get();
            UpdateEmpleado.setNombre(empleado.getNombre());
            UpdateEmpleado.setCorreo(empleado.getCorreo());
            UpdateEmpleado.setPassword(empleado.getPassword());
            UpdateEmpleado.setRol(empleado.getRol());
            UpdateEmpleado.setEstado(empleado.getEstado());
            empleadoService.save(UpdateEmpleado);
            return ResponseEntity.ok(UpdateEmpleado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}