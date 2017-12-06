
package com;

import static com.Reservation.resList;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;


public class Room  {
    protected String RName;
    protected int seats;
    protected boolean equiptment;
    protected boolean available;
    protected int capacity;
    protected int attendance;
    protected String building;
    protected boolean full;
    public static ArrayList<Room> roomList = new ArrayList<>();
    public static ObservableList<Room> viewRoom =FXCollections.observableArrayList(roomList);
    public Room (String b, String r, int s, boolean e, boolean t){
        seats=s;
        building=b;
        equiptment=e;
        available=t;
        RName=r;        
    }
            

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public String getRName(){
       return RName; 
    }
    public void setRName(String RName){
        this.RName=RName;
    }
    public void setBuilding(String building){
        this.building=building;
    }
    public int getSeats(){
        return seats;
    }
    public String getBuilding(){
        return building;
    }
    public void setSeats(int seats){
        this.seats=seats;
    }
    public boolean getEquip(){
        return equiptment;
    }
    public void setEquip(boolean equiptment){
        this.equiptment=equiptment;
    }
        public boolean getAvailability(){
        return available;
    }
    public void setAvailability(boolean available){
        this.available=available;
    }
    public void maxAttendance(int attendance){
        this.attendance=attendance;
    }
    

}
