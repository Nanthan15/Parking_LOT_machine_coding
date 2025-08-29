package com.parkinglot.repo;
import com.parkinglot.model.ParkingSpot;
import com.parkinglot.model.Ticket;
import java.util.*;

public class InMemoryRepository {
    private final Map<String, ParkingSpot> spotsById = new HashMap<>();
    private final Map<Integer, Ticket> ticketsById = new HashMap<>();

    //repo operation for spots - add,getspot,allspot
    public void addSpot(ParkingSpot s) {
        spotsById.put(s.getId(), s);
    }
    public Optional<ParkingSpot> getSpot(String id) {
        return Optional.ofNullable(spotsById.get(id));
    }
    public Collection<ParkingSpot> allSpots() {
        return spotsById.values();
    }


    // repo for mainting the ticket
    public void saveTicket(Ticket t) {
        ticketsById.put(t.getId(), t);
    }
    public Optional<Ticket> getTicket(String id) {
        return Optional.ofNullable(ticketsById.get(id));
    }

}
