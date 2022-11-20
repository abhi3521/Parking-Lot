package models;

import enums.TicketStatus;
import enums.VehicleType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Ticket extends BaseModel {
    private String ticketId;
    private String vehicleId;
    private VehicleType vehicleType;
    private int floorNumber;
    private int slotNumber;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private TicketStatus ticketStatus;
}
