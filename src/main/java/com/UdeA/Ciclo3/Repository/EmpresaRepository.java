package com.UdeA.Ciclo3.Repository;

import com.UdeA.Ciclo3.Entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmpresaRepository extends JpaRepository <Empresa, Integer> {
}
