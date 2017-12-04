/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import static com.Room.roomList;
import java.util.ArrayList;


public class Reservation {
protected User user;
protected DatePick date;
protected Room room;
public static ArrayList<Reservation> resList = new ArrayList<>();    


public Reservation(User u, DatePick d, Room r) {
    this.user=u;
    this.date=d;
    this.room=r;
} 

public deleteRes(){
    Iterator<Reservation> it = reservation.getReservation().iterator();
    while(it.hasNext()){
        if(Reservation res = it.next();
           if(res.getReservation().equals(reservation)){
               it.remove();
               break;
           }
           }
           break;
           }
public void viewReservation(){
    if(!room.isBooked()){
      room.setAvailability(true); 
        break;
}

public void viewAllReservation(){
    System.out.println(resList);
}
           
           }
