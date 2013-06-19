/**
 * 
 */
package com.apps.foto.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Provides implementation to common data access functions that could be reused by other entity types
 * 
 * @author parantap
 * 
 */
public class GenericDaoImpl<T, PK extends Serializable> implements GenericDAO<T, PK> {

    private Class<T> type;

    @PersistenceContext
    private EntityManager entityMgr;

    public GenericDaoImpl(Class<T> type) {
        this.type = type;
    }

    public void save(T t) {
        entityMgr.persist(t);
    }

    public T find(PK id) {
        return entityMgr.find(type, id);
    }

    public List<T> findAll() {
        return entityMgr.createQuery("from ", type).getResultList();
    }

    public void delete(PK id) {
        T entity = entityMgr.find(type, id);
        entityMgr.remove(entity);
    }

}
