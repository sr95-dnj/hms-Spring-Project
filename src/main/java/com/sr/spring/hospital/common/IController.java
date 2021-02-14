/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.common;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Siddiquer Rahman
 */
public interface IController {
    
    public ModelAndView home();
    
    public ModelAndView create(HttpServletRequest request);
    
    public ModelAndView update(HttpServletRequest request);
    
    public ModelAndView delete(int id);
    
    public ModelAndView edit(HttpServletRequest request);
     
    public ModelAndView getAll();
    
    
}
