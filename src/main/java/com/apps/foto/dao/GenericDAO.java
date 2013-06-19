/**
 * 
 */
package com.apps.foto.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Generic DAO to perform all data access operations that helps avoid repetitive
 * code and provides type-safety
 * 
 * @author parantap
 * 
 */
public interface GenericDAO<T, PK extends Serializable> {

    /**
     * Save changes made to an object
     * 
     * @param t
     * @return
     */
    void save(T t);

    /**
     * find the entity with this Id
     * 
     * @param id
     * @return the instance that matches this Id
     */
    T find(PK id);

    /**
     * find and return all entities of type
     * 
     * @return
     */
    List<T> findAll();

    /**
     * Delete the entity with this Id
     * 
     * @param id
     */
    void delete(PK id);

}
