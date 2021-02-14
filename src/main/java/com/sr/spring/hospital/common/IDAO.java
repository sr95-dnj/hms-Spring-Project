/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.common;

import java.util.List;

/**
 *
 * @author Siddiquer Rahman
 */
public interface IDAO<T> {
    
    public T save(T t);
    public T update(T t);
    public T delete (int id);
    public T getById(int id);
    public List<T> getList();
    
}
