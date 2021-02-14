/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IEmployeeControllerImpl;
import com.sr.spring.hospital.controller.impl.IChatingDoctorControllerImpl;
import com.sr.spring.hospital.dao.impl.IChatingDoctorDaoImpl;
import com.sr.spring.hospital.dao.impl.IChatingReceptionDAOImpl;
import com.sr.spring.hospital.model.ChatingDoctor;
import com.sr.spring.hospital.model.ChatingReception;
import java.time.LocalTime;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Siddiquer Rahman
 */
@RestController
@RequestMapping(value = "chatingDoctor")
public class ChatingController implements IChatingDoctorControllerImpl {

    @Autowired
    IChatingDoctorDaoImpl chatDaoImpl;
    @Autowired 
    IChatingReceptionDAOImpl chatRecepDao;

 
    @RequestMapping(value = "/chat", method = RequestMethod.GET)
    @Override
    public ModelAndView home() {
        return new ModelAndView("redirect:/chatingDoctor/getChat");
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public ModelAndView create(HttpServletRequest request) {
        String chat = request.getParameter("chating");
        System.out.println(chat);
        String time = LocalTime.now().toString();
        
        ChatingDoctor doctor = new ChatingDoctor();
        doctor.setChating(chat);
        doctor.setChatingTime(time);
        chatDaoImpl.save(doctor);
        
        return new ModelAndView("redirect:/chatingDoctor/getChat");
                
    }

    @Override
    public ModelAndView update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView edit(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/getChat", method = RequestMethod.GET)
    @Override
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<ChatingDoctor> ch = chatDaoImpl.getList();
        List<ChatingReception> chat = chatRecepDao.getList();
        map.put("ch", ch);
        map.put("chat", chat);
        return new ModelAndView("/doctor/chat", "map", map);
    }

    

}
