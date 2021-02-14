/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;



import com.sr.spring.hospital.dao.impl.IChatingReceptionDAOImpl;
import com.sr.spring.hospital.model.ChatingReception;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Siddiquer Rahman
 */

@Repository(value = "chatingReception")
@Transactional
public class ChatingReceptionDAO implements IChatingReceptionDAOImpl{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public ChatingReception save(ChatingReception t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public ChatingReception update(ChatingReception t) {
       sessionFactory.getCurrentSession().saveOrUpdate(t);
       sessionFactory.getCurrentSession().flush();
        return t; 
    
    }

    @Override
    public ChatingReception delete(int id) {
        ChatingReception p =(ChatingReception) sessionFactory.getCurrentSession().load(ChatingReception.class, id);
        sessionFactory.getCurrentSession().delete(p);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public ChatingReception getById(int id) {
        ChatingReception p = (ChatingReception) sessionFactory.getCurrentSession().get(ChatingReception.class, id);
        sessionFactory.getCurrentSession().flush();
        return p;
    }

    @Override
    public List<ChatingReception> getList() {
        List<ChatingReception> pList = sessionFactory.getCurrentSession().createCriteria(ChatingReception.class).list();
        sessionFactory.getCurrentSession().flush();
        return pList;
    }
    
}
