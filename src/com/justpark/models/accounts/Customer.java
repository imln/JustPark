package com.justpark.models.accounts;

import com.justpark.models.parking.ticket.Ticket;
import com.justpark.models.people.Person;

public class Customer extends Account{

    public Customer(String username, String saltedPasswordHash, Person person) {
        super(username, saltedPasswordHash, person);
    }

    public Ticket getTicket(){
        return null;
    }

    public void payForTicket(Ticket ticket){

    }
}
