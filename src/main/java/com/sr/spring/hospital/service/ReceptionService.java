/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.service;

import com.sr.spring.hospital.model.Reception;
import com.sr.spring.hospital.service.impl.IReceptionServiceImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sr.spring.hospital.dao.impl.IReceptionDAOImpl;



/**
 *
 * @author Siddiquer Rahman
 */
@Service(value = "receptionService")
public class ReceptionService implements IReceptionServiceImpl{

    @Autowired
    IReceptionDAOImpl receptionDao;
    
    @Override
    public Reception save(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        
        Reception r = new Reception();
        r.setName(map.get("name")[0]);
        r.setRcode(map.get("rcode")[0]);
        r.setDepartment(map.get("department")[0]);
        r.setReceptionist(map.get("receptionist")[0]);
        return receptionDao.save(r);
    }

    @Override
    public Reception update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reception delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reception getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Reception> getList() {
        List<Reception> rList = receptionDao.getList();
        return rList;
    }
    
}
