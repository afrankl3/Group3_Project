
package com;


public class Room extends Event {
    String RName;
    int seats;
    boolean equiptment;
    boolean available;
    
    
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
