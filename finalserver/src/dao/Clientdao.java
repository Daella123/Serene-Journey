/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import model.Client;
import org.hibernate.*;

/**
 *
 * @author daell
 */
public class Clientdao {
    public String registerClient(Client client){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.save(client);
        tr.commit();
        ss.close();
        
        return "Data saved successfully";
    }
    
     public String updateClient(Client client){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.update(client);
        tr.commit();
        ss.close();
        
        return "Data updated successfully";
    }
     
      public String deleteClient(Client client){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.delete(client);
        tr.commit();
        ss.close();
        
        return "Client deleted successfully";
    }
      
      public List<Client> allClients(){
          Session ss= HibernateUtil.getSessionFactory().openSession();
          List<Client> clientslist=ss.createQuery("select client from Client client").list();
          ss.close();
          return clientslist;
      }
      
      public Client getClientBYid(Client client){
          Session ss= HibernateUtil.getSessionFactory().openSession();
          Client cli=(Client)ss.get(Client.class, client.getId());
          ss.close();
          return cli;
      }
      
     public Client getClientByNameAndTrip(String clientName, String clientTrip) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Client client = null;
    try {
        // Use appropriate Query class based on your Hibernate version
        Query query = session.createQuery("FROM Client WHERE client_name = :name AND client_trip = :trip");
        query.setParameter("name", clientName);
        query.setParameter("trip", clientTrip);
        client = (Client) query.uniqueResult(); // Retrieve the single result
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        session.close();
    }
    return client;
}
public List<Client> getClientsByName(String clientName) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    List<Client> clients = null;
    try {
        // Raw Query for older Hibernate versions
        Query query = session.createQuery("FROM Client WHERE LOWER(client_name) LIKE :name");
        query.setParameter("name", "%" + clientName.toLowerCase() + "%");
        clients = query.list(); // Cast to List<Client> if needed
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        session.close();
    }
    return clients;
}
}
