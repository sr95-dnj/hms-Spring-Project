/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.controller;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Siddiquer Rahman
 */
@Controller
public class ProjectController {
    @RequestMapping("/helloworld")
    public ModelAndView hello(ModelMap model, Principal principal) {

        String loggedInUserName = principal.getName();
//        System.out.println(loggedInUserName + "''''[");
        return new ModelAndView("home/index", "userName", loggedInUserName);
    }

    @RequestMapping("/admin")
    public ModelAndView helloAdmin(ModelMap model, Principal principal) {

        String loggedInUserName = principal.getName();

        return new ModelAndView("home/index", "userName", loggedInUserName);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "login/login";
    }

    @RequestMapping(value = "/loginError", method = RequestMethod.GET)
    public String loginError(ModelMap model) {
        model.addAttribute("error", "true");
        return "login/login";
    }

    // for 403 access denied page
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView accesssDenied(Principal user) {

        ModelAndView model = new ModelAndView();
        if (user != null) {
            model.addObject("msg", "Hi " + user.getName()
                    + ", You can not access this page!");
        } else {
            model.addObject("msg",
                    "You can not access this page!");
        }

        model.setViewName("403");
        return model;
    }
}
