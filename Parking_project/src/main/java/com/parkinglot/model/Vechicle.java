package com.parkinglot.model;

public class Vechicle {
    private final String plate;
    private final VechicleType type;

    public Vechicle(String plate, VechicleType type) {
        this.plate = plate;
        this.type = type;
    }

    public String getPlate() { return plate;}
    public VechicleType getType() { return type; }

    @Override
    public String toString() {
        return plate + "(" + type + ")";
    }

}
