/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author daell
 */
public class HibernateTest {
   




    public static void main(String[] args) {
        try {
            SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            Session session = factory.openSession();
            System.out.println("Hibernate is connected to the database!");
            session.close();
            factory.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


