package com.justpark.models.electronics;

import com.justpark.models.parking.interfaces.PaymentEnabled;
import com.justpark.models.parking.ticket.Ticket;

public class CustomerInfoPortal extends Electronics implements PaymentEnabled {
    @Override
    public void processTicket(Ticket ticket) {

    }

    @Override
    public void processPayment() {

    }
}
