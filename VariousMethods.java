/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Anna
 */
public class VariousMethods extends Room {
    ArrayList<Room> roomList = new ArrayList<>();
    java.util.Scanner input = new java.util.Scanner(System.in);
    
    //Trinkle
    roomList.add("Trinkle Room1", 20, true, false);
    roomList.add("Trinkle Room2", 40, true, false);
    roomList.add("Trinkle Room3", 10, false, false);
    roomList.add("Trinkle Room4", 100, true, false);
    roomList.add("Trinkle Room5", 30, false, false);
    
    //HCC
    roomList.add("Convergence Center Room1", 20, true, false);
    roomList.add("Convergence Center Room2", 40, true, false);
    roomList.add("Convergence Center Room3", 10, true, false);
    roomList.add("Convergence Center Room4", 30, true, false);
    roomList.add("Convergence Center Room5", 100, true, false);
    
    //Combs
    roomList.add("Combs Room1", 40, true, false);
    roomList.add("Combs Room2", 10, true, false);
    roomList.add("Combs Room3", 20, false, false);
    roomList.add("Combs Room4", 50, true,false);
    roomList.add("Combs Room5", 30, false, false);
    
    //Woodard
    roomList.add("Woodard Room1", 15, false, false); 
    roomList.add("Woodard Room2", 20, true, false);
    roomList.add("Woodard Room3", 10, false, false);
    roomList.add("Woodard Room4", 75, true, false);
    roomList.add("Woodard Room5", 30, false, false);
    
    
    public void printAll(){
        
            for (int i=0; i<roomList.size(); i++){
                System.out.println("Room Name: "+roomList.get(i).getRName()+"Building: "+roomList.get(i).getBuilding()+"Seats: "+roomList.get(i).getSeats()+"Equiptment?: "+roomList.get(i).getEquip()+","+roomList.get(i).getAvailability());
            }
        }

    public void equiptmentSearch(){
    for (int i=0; i<roomList.size(); i++){
        if (roomList.get(i).getEquip()==true){
            System.out.println(roomList.get(i).getBuilding()+", "+roomList.get(i).getRName());
        }
    }
}
    public void availableRooms(){
        for (int i=0; i<roomList.size(); i++){
            if (roomList.get(i).getAvailability()==true){
                System.out.println("Room Name: "+roomList.get(i).getRName()+"Building: "+roomList.get(i).getBuilding()+"Seats: "+roomList.get(i).getSeats()+"Equiptment?: "+roomList.get(i).getEquip());
            }
    }

}
    public void seatCount(){
        int counter=input.nextInt();
        for (int i=0; i<roomList.size(); i++){
            Collections.sort(roomList,Comparator.comparing(Room::getSeats));
            if (counter>=roomList.get(i).getSeats()){
                System.out.println("Room Name: "+roomList.get(i).getRName()+"Building: "+roomList.get(i).getBuilding()+"Seats: "+roomList.get(i).getSeats()+"Equiptment?: "+roomList.get(i).getEquip());
            }
            
        }
    }
    
    
}