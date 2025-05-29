/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import service.implementation.ClientImpl;
import service.implementation.TripImpl;
import service.implementation.UserImpl;

/**
 *
 * @author daell
 */
public class Server {
    private UserImpl userImpl;
    private TripImpl tripImpl;
    private ClientImpl clientImpl;
    public Server()throws RemoteException{
    this.userImpl=new UserImpl();
    this.tripImpl=new TripImpl();
    this.clientImpl=new ClientImpl();
}
    public static void main(String[] args){
        try{
            System.setProperty("java.rmi.Server.hostname","127.0.0.1");
            Registry registry= LocateRegistry.createRegistry(7000);
            registry.rebind("user", new Server().userImpl);
            registry.rebind("trip", new Server().tripImpl);
            registry.rebind("client", new Server().clientImpl);
            System.out.println("Server is running at port 7000");
            
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
