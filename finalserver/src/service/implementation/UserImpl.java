/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.Userdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.User;
import service.UserService;

/**
 *
 * @author daell
 */
public class UserImpl extends UnicastRemoteObject implements UserService{
 
    public UserImpl()throws RemoteException{
        super();
    }
    
    public Userdao dao= new Userdao();

    @Override
    public String registerUser(User user) throws RemoteException {
        return dao.registerUser(user);
    }

    @Override
    public String UpdateUser(User user) throws RemoteException {
        return dao.updateUser(user);
    }

    @Override
    public String deleteUser(User user) throws RemoteException {
        return dao.deleteUser(user);
    }

    @Override
    public List<User> getAllUsers() throws RemoteException {
        return dao.allUsers();
    }

    @Override
    public User getUserByID(User user) throws RemoteException {
        return dao.getUserBYid(user);
    }

    @Override
    public User getUserByName(User user) throws RemoteException {
       return dao.getUserBYname(user);
    }
    
}
