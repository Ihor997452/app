package com.example.app.service;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public abstract class ServiceImpl<T, ID> implements Service<T, ID> {
    CrudRepository<T, ID> repository;

    ServiceImpl(CrudRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public void save(T entity) {
        repository.save(entity);
    }

    @Override
    public List<T> findAll() {
        return (List<T>) repository.findAll();
    }

    @Override
    public T getById(ID id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(T entity) {
        repository.delete(entity);
    }
}
