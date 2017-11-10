package com.room;

import com.event.Event;

public class Room extends Event {
    String RName;
    int seats;
    int capacity;
    boolean equiptment;
    boolean available;
    boolean full = false;

    public boolean isFull(){
        if (capacity == getNumAttending()){
            return full = true;
        }
        else{
            return full;
        }
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
    public int getSeats(){
        return seats;
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
        return equiptment;
    }
    public void setAvailability(boolean available){
        this.available=available;
    }
}
