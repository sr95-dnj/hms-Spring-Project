/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;


import com.sr.spring.hospital.dao.impl.IInvoiceDaoImpl;
import com.sr.spring.hospital.model.Invoice;
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
@Repository(value = "invoice")
@Transactional
public class InvoiceDAO implements IInvoiceDaoImpl{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Invoice save(Invoice t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Invoice update(Invoice t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Invoice delete(int id) {
        Invoice d = (Invoice) sessionFactory.getCurrentSession().load(Invoice.class, id);
        sessionFactory.getCurrentSession().delete(d);
        sessionFactory.getCurrentSession().flush();
        return d;
    }

    @Override
    public Invoice getById(int id) {
        Invoice d = (Invoice) sessionFactory.getCurrentSession().get(Invoice.class, id);
        sessionFactory.getCurrentSession().flush();
        return d;
    
    }

    @Override
    public List<Invoice> getList() {
        List<Invoice> departments = sessionFactory.getCurrentSession().createCriteria(Invoice.class).list();
        sessionFactory.getCurrentSession().flush();
        return departments;
    }

    @Override
    public Invoice searchByMobile(String mobile) {
        String hql = "from invoice where mobile = :mobile";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("mobile", mobile);
        
        Invoice p = (Invoice) q.uniqueResult();
        if(p != null){
            return p;
        }else{
            return null;
        }
    }

    @Override
    public Invoice searchByMobileAndBloodGroup(String mobile, String email) {
        String hql = "from invoice where mobile = :mobile and email = : email";
        Query q = sessionFactory.getCurrentSession().createQuery(mobile);
        q.setParameter("mobile", mobile);
        q.setParameter("email", email);
        
        Invoice i = (Invoice) q.uniqueResult();
        if(i != null){
            return i;
        }
        else{
            return null;
        }
    }
    
}
