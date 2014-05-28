/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yaka.tp1.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.yaka.tp1.models.Users;
import com.yaka.tp1.models.UsersDAO;

/**
 *
 * @author beneul_a
 */
public class IndexAction extends ActionSupport {

    public String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    @Override
    public String execute() throws Exception {
        UsersDAO coorDAO = new UsersDAO();
        
        Users coord = coorDAO.getFirstUser();
        
        String tmp = coord.getFirstname()+ " " + coord.getLastname();
        setMessage(tmp);
        return SUCCESS;
    }
}
