/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import com.sr.spring.hospital.controller.impl.IChatingReceptionControllerImpl;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Siddiquer Rahman
 */
@RestController
@RequestMapping(value = "chatingReception")
public class ChatingReceptionController implements IChatingReceptionControllerImpl {

    @Autowired
    IChatingReceptionDAOImpl chatDaoImpl;
    
    @Autowired
    IChatingDoctorDaoImpl chatDoctorDao;

 
    @RequestMapping(value = "/chat", method = RequestMethod.GET)
    @Override
    public ModelAndView home() {
        return new ModelAndView("redirect:/chatingReception/getChat");
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public ModelAndView create(HttpServletRequest request) {
        String chat = request.getParameter("chating");
        System.out.println(chat);
        String time = LocalTime.now().toString();
        
        ChatingReception chating = new ChatingReception();
        chating.setChating(chat);
        chating.setChatingTime(time);
        chatDaoImpl.save(chating);
        
        return new ModelAndView("redirect:/chatingReception/getChat");
                
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
        List<ChatingReception> ch = chatDaoImpl.getList();
        List<ChatingDoctor> chat = chatDoctorDao.getList();
        map.put("chat", ch);
        map.put("c", chat);
        return new ModelAndView("/reception/chat", "map", map);
    }

    

}
