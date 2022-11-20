package controllers;

import dtos.GetTicketDTO;
import enums.VehicleType;
import services.EntryGateService;

public class EntryGateController {

    EntryGateService entryGateService = new EntryGateService();

    public GetTicketDTO createTicket(VehicleType vehicleType) {
        return entryGateService.createTicket(vehicleType);
    }
}
