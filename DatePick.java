/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;

/**
 *
 * @author Anna
 */
public class DatePick {
   protected String month;
   protected int day;
   public static ArrayList<DatePick> dateList = new ArrayList<>(); 
    
public DatePick(String m, int d){
    m=month;
    d=day;
}           
   
public String getMonth(){
    return month;
}
public int getDay(){
    return day;
}
}
