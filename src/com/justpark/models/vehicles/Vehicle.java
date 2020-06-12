package com.justpark.models.vehicles;

import com.justpark.models.parking.ticket.Ticket;

public abstract class Vehicle {
    private String plateNumber;
    private String color;
    private final VehicleType type;
    private Ticket ticket;

    public Vehicle(VehicleType type){
        this.type = type;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getType() {
        return type;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}

