package com.example.app.service;

import java.util.List;

public interface Service<T, ID> {
    void save(T entity);
    List<T> findAll();
    T getById(ID id);
    void delete(T entity);
}
