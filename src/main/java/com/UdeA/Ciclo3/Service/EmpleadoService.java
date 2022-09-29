package com.UdeA.Ciclo3.Service;

import com.UdeA.Ciclo3.Entity.Empleado;
import com.UdeA.Ciclo3.Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class EmpleadoService implements EmpleadoRepository {

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Override
    public ArrayList<Empleado> findByEmpresa(Integer id) {
        return empleadoRepository.findByEmpresa(id);
    }

    @Override
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public List<Empleado> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Empleado> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Empleado> findAllById(Iterable<Integer> integers) {
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
    public void delete(Empleado entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Empleado> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Empleado> S save(S entity) {
        return empleadoRepository.save(entity);
    }

    @Override
    public <S extends Empleado> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Empleado> findById(Integer integer) {
        return empleadoRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Empleado> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Empleado> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Empleado> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Empleado getOne(Integer integer) {
        return null;
    }

    @Override
    public Empleado getById(Integer integer) {
        return null;
    }

    @Override
    public Empleado getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Empleado> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Empleado> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Empleado> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Empleado> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Empleado> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Empleado> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Empleado, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    //Metodo para ver todos los empleados registrados

}