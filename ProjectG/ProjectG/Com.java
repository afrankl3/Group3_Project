/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;


import javafx.application.Application;
import static com.Room.roomList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static com.DatePick.dateList;
/**
 *
 * @author Anna
 */
public class Com  {



    public static void main(String[] args) throws FileNotFoundException {
      Boolean isAdmin=false;
      File newFile = new File("rooms.txt"); 
      Scanner newInput =new Scanner (newFile);
        while (newInput.hasNextLine()){
            String newline =newInput.nextLine();
            String newspacing = " ";
            String[] newData =newline.split(newspacing);
            Room newRoom = new Room(newData[0],newData[1],Integer.parseInt(newData[2]),Boolean.parseBoolean(newData[3]),Boolean.parseBoolean(newData[4]));
            roomList.add(newRoom);

        }
      File dateFile = new File("dates.txt");
      Scanner dateInput = new Scanner (dateFile);
      while (dateInput.hasNextLine()){
          String dateline = dateInput.nextLine();
          String datespacing = " ";
          String[] dateData =dateline.split(datespacing);
          DatePick theDates= new DatePick(dateData[0],Integer.parseInt(dateData[1]));
          dateList.add(theDates);
      }
      //Search by eqiptment
      for (int i=0; i<roomList.size(); i++){
       
          System.out.println(roomList.get(i).getRName());  
        
      }
      
      
      
     Application.launch(MainMenuGUEST.class,args);

    }
}
