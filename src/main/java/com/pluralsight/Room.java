package com.pluralsight;

public class Room {

    int getNumberOfBeds;
    double getPrice;
    boolean isOccupied;
    boolean isDirty;
    boolean isAvailable;

    public Room(int getNumberOfBeds, double getPrice, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.getNumberOfBeds = getNumberOfBeds;
        this.getPrice = getPrice;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }


    public int getGetNumberOfBeds() {
        return getNumberOfBeds;
    }

    public void setGetNumberOfBeds(int getNumberOfBeds) {
        this.getNumberOfBeds = getNumberOfBeds;
    }

    public double getGetPrice() {
        return getPrice;
    }

    public void setGetPrice(double getPrice) {
        this.getPrice = getPrice;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean setAvailable(boolean isDirty, boolean isOccupied) {

        if(!isDirty && !isOccupied);
        return isAvailable;

    }



    }
