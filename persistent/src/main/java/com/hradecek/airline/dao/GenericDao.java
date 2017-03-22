package com.hradecek.airline.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ivo Hradek <ivohradek@gmail.com>
 */
interface GenericDao<T, K extends Serializable> {
    /**
     *
     * @param id
     * @return
     */
    T find(K id);

    /**
     *
     * @return
     */
    List<T> find();

    /**
     *
     * @param example
     * @return
     */
    List<T> find(T example);

    /**
     *
     * @param object
     * @return
     */
    K save(T object);

    /**
     *
     * @param object
     */
    void update(T object);

    /**
     *
     * @param object
     */
    void delete(T object);
}
