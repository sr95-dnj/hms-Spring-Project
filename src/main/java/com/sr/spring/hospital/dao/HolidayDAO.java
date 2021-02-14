/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;


import com.sr.spring.hospital.dao.impl.IHolidayDaoImpl;
import com.sr.spring.hospital.model.Holiday;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Siddiquer Rahman
 */

@Repository(value = "holidayDao")
@Transactional
public class HolidayDAO implements IHolidayDaoImpl{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Holiday save(Holiday t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Holiday update(Holiday t) {
       sessionFactory.getCurrentSession().saveOrUpdate(t);
       sessionFactory.getCurrentSession().flush();
        return t; 
    
    }

    @Override
    public Holiday delete(int id) {
        Holiday p =(Holiday) sessionFactory.getCurrentSession().load(Holiday.class, id);
        sessionFactory.getCurrentSession().delete(p);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public Holiday getById(int id) {
        Holiday p = (Holiday) sessionFactory.getCurrentSession().get(Holiday.class, id);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public List<Holiday> getList() {
        List<Holiday> pList = sessionFactory.getCurrentSession().createCriteria(Holiday.class).list();
        sessionFactory.getCurrentSession().flush();
        return pList;
    }
    
}
