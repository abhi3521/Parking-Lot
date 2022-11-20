package services;

import enums.VehicleType;
import models.ParkingSpot;
import repositories.ParkingSpotRepository;

public class SlotAllocationService {

    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public ParkingSpot allocateSlot(VehicleType vehicleType) {
        return parkingSpotRepository.findParkingSpot(vehicleType);
    }
}
