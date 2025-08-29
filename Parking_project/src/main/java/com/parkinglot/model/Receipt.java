package com.parkinglot.model;

import java.time.LocalDateTime;

public class Receipt {
    private final int ticketId;
    private final LocalDateTime exitTime;
    private final long hoursBilled;
    private final double amount;

    public Receipt(int ticketId, LocalDateTime exitTime, long hoursBilled, double amount) {
        this.ticketId = ticketId;
        this.exitTime = exitTime;
        this.hoursBilled = hoursBilled;
        this.amount = amount;
    }

    public int getTicketId() { return ticketId; }
    public LocalDateTime getExitTime() { return exitTime; }
    public long getHoursBilled() { return hoursBilled; }
    public double getAmount() { return amount; }

}
