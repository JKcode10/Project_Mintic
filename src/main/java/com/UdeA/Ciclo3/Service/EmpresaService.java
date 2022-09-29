package com.UdeA.Ciclo3.Service;

import com.UdeA.Ciclo3.Entity.Empresa;
import com.UdeA.Ciclo3.Repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class EmpresaService implements EmpresaRepository {
    @Autowired
    private EmpresaRepository empresaRepository;


    @Override
    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Empresa GetEmpresaById (Integer id) {
        Optional<Empresa> optionalEmpresa = empresaRepository.findById(id);
        if(optionalEmpresa.isPresent()){
            return optionalEmpresa.get();
        }
        return null;
    }

    @Override
    public List<Empresa> findAll(Sort sort) {
        return empresaRepository.findAll();
    }

    @Override
    public Page<Empresa> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Empresa> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Empresa entity) {

    }

    public boolean deleteEmpresa(Integer id){
        empresaRepository.deleteById(id);  //Eliminar

        if (empresaRepository.findById(id)!=null){  //Verificacion del servicio eliminacion
            return true;
        }
        return false;
    }


    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Empresa> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Empresa> S save(S entity) {
        return empresaRepository.save(entity);
    }

    @Override
    public <S extends Empresa> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Empresa> findById(Integer integer) {
        return empresaRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Empresa> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Empresa> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Empresa> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Empresa getOne(Integer integer) {
        return null;
    }

    @Override
    public Empresa getById(Integer integer) {
        return null;
    }

    @Override
    public Empresa getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Empresa> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Empresa> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Empresa> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Empresa> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Empresa> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Empresa> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Empresa, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
