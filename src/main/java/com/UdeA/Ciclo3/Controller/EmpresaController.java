package com.UdeA.Ciclo3.Controller;

import com.UdeA.Ciclo3.Entity.Empresa;
import com.UdeA.Ciclo3.Service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/enterprises")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    private ResponseEntity<List<Empresa>> GetallEmpresa() {
        List<Empresa> Empresas = empresaService.findAll();
        return ResponseEntity.ok(Empresas);
    }
    @RequestMapping(value = ("{id}"))
    private ResponseEntity<Empresa> GetEmpresaById(@PathVariable("id") Integer id) {
        Optional<Empresa> optionalempresas = empresaService.findById(id);
        if (optionalempresas.isPresent()) {
            return ResponseEntity.ok(optionalempresas.get());
        } else {
            return ResponseEntity.noContent().build();
        }
    }
    @PostMapping
    public ResponseEntity<Empresa> CreateEmpresa(@RequestBody Empresa empresa) {
        Empresa NewEmpresa = empresaService.save(empresa);
        return ResponseEntity.ok(NewEmpresa);
    }

    @DeleteMapping(value = ("{id}"))
    public ResponseEntity<Void> DeleteEmpresa(@PathVariable("id") Integer id) {
        empresaService.deleteEmpresa(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping
    public ResponseEntity<Empresa> UpdateEmpresa(@RequestBody Empresa empresa ){
        Optional<Empresa> optionalempresas = empresaService.findById(empresa.getId());
        if (optionalempresas.isPresent()) {
           Empresa UpdateEmpresa= optionalempresas.get();
           UpdateEmpresa.setNombre(empresa.getNombre());
           UpdateEmpresa.setDireccion(empresa.getDireccion());
           UpdateEmpresa.setNIT(empresa.getNIT());
           UpdateEmpresa.setTelefono(empresa.getTelefono());
           empresaService.save(UpdateEmpresa);
            return ResponseEntity.ok(UpdateEmpresa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}