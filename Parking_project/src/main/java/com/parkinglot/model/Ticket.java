package com.parkinglot.model;
import java.time.LocalDateTime;


public class Ticket {
    private final int id;
    private final String spotId;
    private final String vehiclePlate;
    private final VechicleType vehicleType;
    private final LocalDateTime entryTime;
    private TicketStatus status;

    public Ticket(int id, String spotId, String vehiclePlate, VechicleType vehicleType, LocalDateTime entryTime){
        this.id = id;
        this.spotId = spotId;
        this.vehiclePlate = vehiclePlate;
        this.vehicleType = vehicleType;
        this.entryTime = entryTime;
        this.status = TicketStatus.OPEN;
    }

    public int getId() { return id; }
    public String getSpotId() { return spotId; }
    public String getVehiclePlate() { return vehiclePlate; }
    public VechicleType getVehicleType() { return vehicleType; }
    public LocalDateTime getEntryTime() { return entryTime; }
    public TicketStatus getStatus() { return status; }

    public void close() {
        this.status = TicketStatus.CLOSED;
    }

}
