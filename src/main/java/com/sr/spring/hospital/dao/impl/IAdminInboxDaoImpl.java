/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sr.spring.hospital.dao.impl;

import com.sr.spring.hospital.common.IDAO;
import com.sr.spring.hospital.model.AdminInbox;
import com.sr.spring.hospital.model.ChatingDoctor;
import java.util.List;

/**
 *
 * @author Siddiquer Rahman
 */
public interface IAdminInboxDaoImpl extends IDAO<AdminInbox>{
    public List<AdminInbox> getList(String code);
}
