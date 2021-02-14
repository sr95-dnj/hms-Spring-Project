/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;



import com.sr.spring.hospital.dao.impl.IPrescriptionDAOImpl;
import com.sr.spring.hospital.model.Prescription;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Siddiquer Rahman
 */
@Repository(value = "prescriptionDAO")
@Transactional
public class PrescriptionDAO implements IPrescriptionDAOImpl{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Prescription save(Prescription t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Prescription update(Prescription t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Prescription delete(int id) {
        Prescription d = (Prescription) sessionFactory.getCurrentSession().load(Prescription.class, id);
        sessionFactory.getCurrentSession().delete(d);
        sessionFactory.getCurrentSession().flush();
        return d;
    }

    @Override
    public Prescription getById(int id) {
        Prescription d = (Prescription) sessionFactory.getCurrentSession().get(Prescription.class, id);
        sessionFactory.getCurrentSession().flush();
        return d;
    
    }

    @Override
    public List<Prescription> getList() {
        List<Prescription> prescription = sessionFactory.getCurrentSession().createCriteria(Prescription.class).list();
        sessionFactory.getCurrentSession().flush();
        return prescription;
    }

    @Override
    public List<Prescription> getList(String code) {
         String hql = "from patient where doctorCode = '"+code+"'";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        List<Prescription> pList = sessionFactory.getCurrentSession().createQuery(hql).list();
        sessionFactory.getCurrentSession().flush();
        return pList;
    }
    
}
