package com.justpark.models.electronics;

import com.justpark.models.parking.interfaces.HasDisplay;
import com.justpark.models.parking.interfaces.IssuesTicket;
import com.justpark.models.parking.ticket.Ticket;

public class EntrancePanel extends Electronics implements HasDisplay, IssuesTicket {
    @Override
    public void showMessage(String message) {

    }

    @Override
    public Ticket giveTicket() {
        return null;
    }
}
