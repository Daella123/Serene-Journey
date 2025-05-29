/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author daell
 */
public class Trip implements Serializable{
    private String trip_id;
    private String destination;
    private String amount;
    private String status;
    private Date trip_date;

    public Trip() {
    }

    public Trip(String trip_id) {
        this.trip_id = trip_id;
    }

    public Trip(String trip_id, String destination, String amount, String status, Date trip_date) {
        this.trip_id = trip_id;
        this.destination = destination;
        this.amount = amount;
        this.status = status;
        this.trip_date = trip_date;
    }

    public String getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(String trip_id) {
        this.trip_id = trip_id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTrip_date() {
        return trip_date;
    }

    public void setTrip_date(Date trip_date) {
        this.trip_date = trip_date;
    }
    
    
}
