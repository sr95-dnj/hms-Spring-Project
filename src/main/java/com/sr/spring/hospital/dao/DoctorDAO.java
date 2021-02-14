/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;

import com.sr.spring.hospital.dao.impl.IDoctorDAOImpl;
import com.sr.spring.hospital.model.ApplyDoctor;
import com.sr.spring.hospital.model.Doctor;
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
@Repository(value = "doctor")
@Transactional
public class DoctorDAO implements IDoctorDAOImpl {

    @Autowired
    SessionFactory sessionFactory;
    

    @Override
    public Doctor save(Doctor t) {
        int id = (int) sessionFactory.getCurrentSession().save(t);
        System.out.println("................ " +id);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Doctor update(Doctor t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Doctor delete(int id) {
        Doctor d = (Doctor) sessionFactory.getCurrentSession().load(Doctor.class, id);
        sessionFactory.getCurrentSession().delete(d);
        sessionFactory.getCurrentSession().flush();
        return d;
    }

    @Override
    public Doctor getById(int id) {
        Doctor d = (Doctor) sessionFactory.getCurrentSession().get(Doctor.class, id);
        sessionFactory.getCurrentSession().flush();
        return d;
    }

    @Override
    public List<Doctor> getList() {
        List<Doctor> dList = sessionFactory.getCurrentSession().createCriteria(Doctor.class).list();
        sessionFactory.getCurrentSession().flush();
        return dList;
    }
    
    public ApplyDoctor applyDoctor(ApplyDoctor apply){
        sessionFactory.getCurrentSession().save(apply);
        sessionFactory.getCurrentSession().flush();
        return apply;
    }
    
    public List<ApplyDoctor> applyDoctorList() {
        List<ApplyDoctor> appList = sessionFactory.getCurrentSession().createCriteria(ApplyDoctor.class).list();
        sessionFactory.getCurrentSession().flush();
        return appList;
    }

    @Override
    public Doctor getLogin(String user_name, String password) {
//         String hqlQuery = "from doctor where user_name = :user_name and password = :password";
//    Query query = sessionFactory.getCurrentSession().createQuery(hqlQuery);
//    query.setParameter("user_name", user_name);
//    query.setParameter("password", password);
//    
//  Doctor d = (Doctor) query.uniqueResult();
//  if(d != null){
//      return d;
//  }else{
//      return null;
//  }
         String hqlQuery = "from doctor where user_name = :user_name";
    Query query = sessionFactory.getCurrentSession().createQuery(hqlQuery);
    query.setParameter("user_name", user_name);
    
  Doctor d = (Doctor) query.uniqueResult();
  if(d != null){
      return d;
  }else{
      return null;
  }
    
    }
    
    
    @Override
    public long getCount() {
        String hql = "select count(*) from doctor";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        long count=(long) q.uniqueResult();
        return count;
    }

    @Override
    public List<Doctor> getEmail() {
        String hql = "select email from doctor";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        
        System.out.println(q);
        List<Doctor> emails = q.list();
        sessionFactory.getCurrentSession().flush();
        return emails;
    
    }

    @Override
    public Doctor getDetails(String first_name) {
        String hql = "from doctor where first_name = :first_name";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("first_name", first_name);
        
        Doctor d = (Doctor) q.uniqueResult();
        return d;
    
    }

    @Override
    public Doctor getDetail(String email) {
        String hql = "from doctor where email = :email";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("email", email);
        
        Doctor d = (Doctor) q.uniqueResult();
        return d;
    }
    
    

    
    

}
