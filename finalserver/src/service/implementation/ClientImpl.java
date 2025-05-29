/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.Clientdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Client;
import service.ClientService;

/**
 *
 * @author daell
 */
public class ClientImpl extends UnicastRemoteObject implements ClientService {
    public ClientImpl()throws RemoteException{
        super();
    }
    
    public Clientdao dao= new Clientdao();

    @Override
    public String registerClient(Client client) throws RemoteException {
        return dao.registerClient(client);
    }

    @Override
    public String UpdateClient(Client client) throws RemoteException {
       return dao.updateClient(client);
    }

    @Override
    public String deleteClient(Client client) throws RemoteException {
       return dao.deleteClient(client);
    }

    @Override
    public List<Client> getAllClients() throws RemoteException {
        return dao.allClients();
    }

    @Override
    public Client getClientByID(Client client) throws RemoteException {
        return dao.getClientBYid(client);
    }

    @Override
    public Client getClientByNameAndTrip(String clientName, String clientTrip) throws RemoteException {
       return dao.getClientByNameAndTrip(clientName,clientTrip);
    }
    
    @Override
    public List<Client> getClientsByName(String clientName)throws RemoteException{
        return dao.getClientsByName(clientName);
    }

    
}
