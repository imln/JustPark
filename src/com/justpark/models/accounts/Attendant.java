package com.justpark.models.accounts;

import com.justpark.models.parking.interfaces.IssuesTicket;
import com.justpark.models.parking.interfaces.PaymentEnabled;
import com.justpark.models.parking.ticket.Ticket;
import com.justpark.models.people.Person;

public class Attendant extends Account implements IssuesTicket, PaymentEnabled {
    public Attendant(String username, String saltedPasswordHash, Person person) {
        super(username, saltedPasswordHash, person);
    }

    @Override
    public Ticket giveTicket() {
        return null;
    }

    @Override
    public void processTicket(Ticket ticket) {

    }

    @Override
    public void processPayment() {

    }
}
