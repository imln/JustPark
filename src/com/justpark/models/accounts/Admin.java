package com.justpark.models.accounts;

import com.justpark.models.electronics.Electronics;
import com.justpark.models.parking.floor.Floor;
import com.justpark.models.parking.gate.Gate;
import com.justpark.models.parking.spot.Spot;
import com.justpark.models.people.Person;

public class Admin extends Account {
    public Admin(String username, String saltedPasswordHash, Person person) {
        super(username, saltedPasswordHash, person);
    }
    void addFloor(Floor floor){

    }

    void removeFloor(Floor floor){

    }

    void modifyFloor(Floor floor){

    }

    void addGate(Gate gate) {

    }
    void removeGate(Gate gate) {

    }
    void modifyGate(Gate gate) {

    }

    void addSpot(Floor floor, Spot spot) {

    }
    void removeSpot(Floor floor, Spot spot) {

    }
    void modifySpot(Floor floor, Spot spot) {

    }

    void addElectronics(Floor floor, Electronics panel) {

    }
    void removeElectronics(Floor floor, Electronics panel) {

    }
    void modifyElectronics(Floor floor, Electronics panel) {

    }

    void addAttendant(Floor floor, Attendant attendant) {

    }
    void removeAttendant(Floor floor, Attendant attendant) {

    }
    void modifyAttendant(Floor floor, Attendant attendant) {

    }
}
