package com.pluralsight;

public class Reservation {

    private String roomType;
    private double price;
    private boolean isWeekend;
    private int numberOfNights;

    public Reservation(String roomType, boolean isWeekend, int numberOfNights) {
        this.roomType = roomType;
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;

        if (roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        }
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        this.isWeekend = weekend;
    }

    public double getReservationTotal() {
        if (isWeekend) {
            return price * 1.10 * numberOfNights;
        }

        return price * numberOfNights;
    }
}