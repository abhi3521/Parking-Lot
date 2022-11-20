package services;

import models.ParkingSpot;
import repositories.ParkingSpotRepository;

public class ParkingSpotService {

    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public void markSlotBooked(ParkingSpot parkingSpot) {
        parkingSpotRepository.save(parkingSpot);
    }
}
