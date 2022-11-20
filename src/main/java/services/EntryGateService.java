package services;

import dtos.GetTicketDTO;
import enums.SpotStatus;
import enums.VehicleType;
import models.ParkingSpot;
import models.Ticket;

public class EntryGateService {
    ParkingSpotService parkingSpotService = new ParkingSpotService();
    SlotAllocationService allocationService = new SlotAllocationService();
    TicketService ticketService = new TicketService();

    public GetTicketDTO createTicket(VehicleType vehicleType) {

        ParkingSpot parkingSpot = allocationService.allocateSlot(vehicleType);
        if(parkingSpot == null) {
            throw new RuntimeException("Slot not available");
        }

        parkingSpot.setSpotStatus(SpotStatus.BOOKED);
        parkingSpotService.markSlotBooked(parkingSpot);

        Ticket ticket = ticketService.createTicket(vehicleType, parkingSpot);

        return GetTicketDTO.
                builder().
                entryTime(ticket.getEntryTime()).
                vehicleType(ticket.getVehicleType()).
                build();
    }
}
