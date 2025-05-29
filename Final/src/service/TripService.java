/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Trip;

/**
 *
 * @author daell
 */
public interface TripService extends Remote{
    public String registerTrip(Trip trip)throws RemoteException;
    public String UpdateTrip(Trip trip)throws RemoteException;
    public String deleteTrip(Trip trip)throws RemoteException;
    public List<Trip> allTrips()throws RemoteException;
    public Trip getTripByID(Trip trip)throws RemoteException;
    public Trip getUserByDestination(Trip trip)throws RemoteException;
    
}
