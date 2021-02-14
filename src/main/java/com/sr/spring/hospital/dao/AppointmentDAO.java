/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao;

import com.sr.spring.hospital.dao.impl.IAppointmentDAOImpl;

import com.sr.spring.hospital.model.Appointment;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Siddiquer Rahman
 */
@Repository(value = "appointmentDAO")
@Transactional
public class AppointmentDAO implements IAppointmentDAOImpl {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Appointment save(Appointment t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Appointment update(Appointment t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Appointment delete(int id) {
        Appointment d = (Appointment) sessionFactory.getCurrentSession().load(Appointment.class, id);
        sessionFactory.getCurrentSession().delete(d);
        sessionFactory.getCurrentSession().flush();
        return d;
    }

    @Override
    public Appointment getById(int id) {
        Appointment d = (Appointment) sessionFactory.getCurrentSession().get(Appointment.class, id);
        sessionFactory.getCurrentSession().flush();
        return d;
    }

    @Override
    public List<Appointment> getList() {
        List<Appointment> dList = sessionFactory.getCurrentSession().createCriteria(Appointment.class).list();
        sessionFactory.getCurrentSession().flush();
        return dList;
    }

}
