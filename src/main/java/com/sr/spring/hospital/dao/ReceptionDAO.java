/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;

import com.sr.spring.hospital.dao.impl.IPathologyDAOImpl;
import com.sr.spring.hospital.model.Pathology;
import com.sr.spring.hospital.model.Reception;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.sr.spring.hospital.dao.impl.IReceptionDAOImpl;

/**
 *
 * @author Siddiquer Rahman
 */

@Repository(value = "receptionDAO")
@Transactional
public class ReceptionDAO implements IReceptionDAOImpl{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Reception save(Reception t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Reception update(Reception t) {
       sessionFactory.getCurrentSession().saveOrUpdate(t);
       sessionFactory.getCurrentSession().flush();
        return t; 
    
    }

    @Override
    public Reception delete(int id) {
        Reception p =(Reception) sessionFactory.getCurrentSession().load(Pathology.class, id);
        sessionFactory.getCurrentSession().delete(p);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public Reception getById(int id) {
        Reception p = (Reception) sessionFactory.getCurrentSession().get(Pathology.class, id);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public List<Reception> getList() {
        List<Reception> pList = sessionFactory.getCurrentSession().createCriteria(Reception.class).list();
        sessionFactory.getCurrentSession().flush();
        return pList;
    }

    
    
}
