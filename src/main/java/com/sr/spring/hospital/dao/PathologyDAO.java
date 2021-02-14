/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;

import com.sr.spring.hospital.dao.impl.IPathologyDAOImpl;
import com.sr.spring.hospital.model.Pathology;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Siddiquer Rahman
 */

@Repository(value = "pathologyDAO")
@Transactional
public class PathologyDAO implements IPathologyDAOImpl{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Pathology save(Pathology t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Pathology update(Pathology t) {
       sessionFactory.getCurrentSession().saveOrUpdate(t);
       sessionFactory.getCurrentSession().flush();
        return t; 
    
    }

    @Override
    public Pathology delete(int id) {
        Pathology p =(Pathology) sessionFactory.getCurrentSession().load(Pathology.class, id);
        sessionFactory.getCurrentSession().delete(p);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public Pathology getById(int id) {
        Pathology p = (Pathology) sessionFactory.getCurrentSession().get(Pathology.class, id);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public List<Pathology> getList() {
        List<Pathology> pList = sessionFactory.getCurrentSession().createCriteria(Pathology.class).list();
        sessionFactory.getCurrentSession().flush();
        return pList;
    }
    
}
