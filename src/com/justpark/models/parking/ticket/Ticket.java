package com.justpark.models.parking.ticket;

import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime issuedData;
    private TicketStatus ticketStatus;

    public LocalDateTime getIssuedData() {
        return issuedData;
    }

    public void setIssuedData(LocalDateTime issuedData) {
        this.issuedData = issuedData;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
}
