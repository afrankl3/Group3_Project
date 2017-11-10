package com.event;

import com.room.Room;

import java.util.Date;

public class Event {
    String location;
    int numAttending;
    Date day;
    Date time;

    public String getLocation() {
        return location;
    }

    public int getNumAttending() {
        return numAttending;
    }

    public Date getDay() {
        return day;
    }

    public Date getTime() {
        return time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumAttending(int numAttending) {
        this.numAttending = numAttending;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}
