/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.Tripdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Trip;
import service.TripService;

/**
 *
 * @author daell
 */
public class TripImpl extends UnicastRemoteObject implements TripService {
    public TripImpl()throws RemoteException{
        super();
    }
    
     public Tripdao dao= new Tripdao();

    @Override
    public String registerTrip(Trip trip) throws RemoteException {
       return dao.registerTrip(trip);
    }

    @Override
    public String UpdateTrip(Trip trip) throws RemoteException {
       return dao.updateTrip(trip);
    }

    @Override
    public String deleteTrip(Trip trip) throws RemoteException {
        return dao.deleteTrip(trip);
    }

    @Override
    public List<Trip> allTrips() throws RemoteException {
        return dao.allTrips();
    }

    @Override
    public Trip getTripByID(Trip trip) throws RemoteException {
        return dao.getTripBYid(trip);
    }

    @Override
    public Trip getTripByDestination(Trip trip) throws RemoteException {
       return dao.getTripBYdestination(trip);
    }

   
    
}
