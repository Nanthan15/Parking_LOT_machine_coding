package com.parkinglot.model;

public class ParkingSpot {
    private final String id;
    private final int floor;
    private final SpotType type;
    private boolean occupied;
    private String currentPlate;

    public ParkingSpot(String id, int floor, SpotType type) {
        this.id = id;
        this.floor = floor;
        this.type = type;
        this.occupied = false;
        this.currentPlate = null;
    }

    public String getId() { return id; }
    public int getFloor() { return floor; }
    public SpotType getType() { return type; }
    public boolean isOccupied() { return occupied; }
    public String getCurrentPlate() { return currentPlate; }


    public void occupy(String plate){
        this.occupied = true;
        this.currentPlate = plate;
    }

    public void free(){
        this.occupied = false;
        this.currentPlate = null;
    }

}
