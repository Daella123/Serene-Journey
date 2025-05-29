/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Client;

/**
 *
 * @author daell
 */
public interface ClientService extends Remote {
    public String registerClient(Client client)throws RemoteException;
    public String UpdateClient(Client client)throws RemoteException;
    public String deleteClient(Client client)throws RemoteException;
    public List<Client> getAllClients()throws RemoteException;
    public Client getClientByID(Client client)throws RemoteException;
    public Client getClientByNameAndTrip(String clientName, String clientTrip)throws RemoteException;
    public List<Client> getClientsByName(String clientName)throws RemoteException;
    
}
