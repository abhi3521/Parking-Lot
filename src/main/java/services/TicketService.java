package services;

import enums.VehicleType;
import models.ParkingSpot;
import models.Ticket;
import repositories.TicketRepository;

import java.time.LocalDateTime;

public class TicketService {

    private TicketRepository ticketRepository = new TicketRepository();

    public Ticket createTicket(VehicleType vehicleType, ParkingSpot parkingSpot) {
        Ticket ticket = Ticket
                .builder()
                .entryTime(LocalDateTime.now())
                .floorNumber(parkingSpot.getFloorNumber())
                .slotNumber(parkingSpot.getSpotId())
                .build();

        return ticketRepository.save(ticket);
    }
}
