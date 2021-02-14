/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.model;

/**
 *
 * @author Siddiquer Rahman
 */
public class AdminLogin {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AdminLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public AdminLogin() {
    }
    
    
    
}
