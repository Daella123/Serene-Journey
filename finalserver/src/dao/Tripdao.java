/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Trip;
import org.hibernate.*;

/**
 *
 * @author daell
 */
public class Tripdao {
     public String registerTrip(Trip trip){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.save(trip);
        tr.commit();
        ss.close();
        
        return "Data saved successfully";
    }
    
     public String updateTrip(Trip trip){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.update(trip);
        tr.commit();
        ss.close();
        
        return "Data updated successfully";
    }
     
      public String deleteTrip(Trip trip){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.delete(trip);
        tr.commit();
        ss.close();
        
        return "Trip deleted successfully";
    }
      
      public List<Trip> allTrips(){
          Session ss= HibernateUtil.getSessionFactory().openSession();
          List<Trip> tripslist=ss.createQuery("select trip from Trip trip").list();
          ss.close();
          return tripslist;
      }
      
      public Trip getTripBYid(Trip trip){
          Session ss= HibernateUtil.getSessionFactory().openSession();
          Trip tri=(Trip)ss.get(Trip.class, trip.getTrip_id());
          ss.close();
          return tri;
      }
      
      public Trip getTripBYdestination(Trip trip){
          Session ss= HibernateUtil.getSessionFactory().openSession();
          Trip tri=(Trip)ss.get(Trip.class, trip.getDestination());
          ss.close();
          return tri;
      }
}
