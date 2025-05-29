/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 *
 * @author daell
 */
@Entity
public class Client implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id ;
    
    private String client_name;
    private String client_number;
    
    private String client_trip;
    private Date trip_date;

    public Client() {
    }

    public Client(Integer id, String client_name, String client_number, String client_trip, Date trip_date) {
        this.id = id;
        this.client_name = client_name;
        this.client_number = client_number;
        this.client_trip = client_trip;
        this.trip_date = trip_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_number() {
        return client_number;
    }

    public void setClient_number(String client_number) {
        this.client_number = client_number;
    }

    public String getClient_trip() {
        return client_trip;
    }

    public void setClient_trip(String client_trip) {
        this.client_trip = client_trip;
    }

    public Date getTrip_date() {
        return trip_date;
    }

    public void setTrip_date(Date trip_date) {
        this.trip_date = trip_date;
    }

   
}
