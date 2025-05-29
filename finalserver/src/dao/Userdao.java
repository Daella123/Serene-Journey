/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.User;
import org.hibernate.*;

/**
 *
 * @author daell
 */
public class Userdao {
    public String registerUser(User user){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.save(user);
        tr.commit();
        ss.close();
        
        return "Data saved successfully your id is"+""+user.getUser_id();
    }
    
     public String updateUser(User user){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.update(user);
        tr.commit();
        ss.close();
        
        return "Data updated successfully";
    }
     
      public String deleteUser(User user){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.delete(user);
        tr.commit();
        ss.close();
        
        return "User deleted successfully";
    }
      
      public List<User> allUsers(){
          Session ss= HibernateUtil.getSessionFactory().openSession();
          List<User> userslist=ss.createQuery("select user from User user").list();
          ss.close();
          return userslist;
      }
      
      public User getUserBYid(User user){
          Session ss= HibernateUtil.getSessionFactory().openSession();
          User us=(User)ss.get(User.class, user.getUser_id());
          ss.close();
          return us;
      }
      
      public User getUserBYname(User user){
          Session ss= HibernateUtil.getSessionFactory().openSession();
          User us=(User)ss.get(User.class, user.getUser_name());
          ss.close();
          return us;
      }
}
