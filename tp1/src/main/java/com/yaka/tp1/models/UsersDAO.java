/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yaka.tp1.models;

/**
 *
 * @author vallee_a
 */
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsersDAO {
    
    public Users getFirstUser ()
    {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Criteria crit = session.createCriteria(Users.class);
        ArrayList<Users> list = (ArrayList<Users>) crit.list();
        transaction.commit();
        if (list.size() > 0)
            return list.get(0);
        else return null;
    }
}