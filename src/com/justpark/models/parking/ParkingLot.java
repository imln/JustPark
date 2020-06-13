package com.justpark.models.parking;

import com.justpark.models.Address;
import com.justpark.models.parking.floor.Floor;
import com.justpark.models.parking.gate.Gate;

import java.util.List;

public class ParkingLot {
    private List<Floor> floors;
    private List<Gate> gates;
    private Address address;

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
