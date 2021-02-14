/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;


import com.sr.spring.hospital.dao.impl.IChatingDoctorDaoImpl;
import com.sr.spring.hospital.model.ChatingDoctor;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Siddiquer Rahman
 */

@Repository(value = "doctorChatingDao")
@Transactional
public class ChatingDoctorDAO implements IChatingDoctorDaoImpl{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public ChatingDoctor save(ChatingDoctor t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public ChatingDoctor update(ChatingDoctor t) {
       sessionFactory.getCurrentSession().saveOrUpdate(t);
       sessionFactory.getCurrentSession().flush();
        return t; 
    
    }

    @Override
    public ChatingDoctor delete(int id) {
        ChatingDoctor p =(ChatingDoctor) sessionFactory.getCurrentSession().load(ChatingDoctor.class, id);
        sessionFactory.getCurrentSession().delete(p);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public ChatingDoctor getById(int id) {
        ChatingDoctor p = (ChatingDoctor) sessionFactory.getCurrentSession().get(ChatingDoctor.class, id);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public List<ChatingDoctor> getList() {
        List<ChatingDoctor> pList = sessionFactory.getCurrentSession().createCriteria(ChatingDoctor.class).list();
        sessionFactory.getCurrentSession().flush();
        return pList;
    }
    
}
