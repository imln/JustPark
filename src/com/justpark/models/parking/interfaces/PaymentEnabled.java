package com.justpark.models.parking.interfaces;

import com.justpark.models.parking.ticket.Ticket;

public interface PaymentEnabled {
    public void processTicket(Ticket ticket);
    public void processPayment();

}
