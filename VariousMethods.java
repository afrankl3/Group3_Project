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