package repositories;

import enums.SpotStatus;
import enums.VehicleType;
import models.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotRepository {

    List<ParkingSpot> parkingSpots = new ArrayList<>();

    public ParkingSpot save(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
        return parkingSpot;
    }

    public ParkingSpot findParkingSpot(VehicleType type) {
        for(ParkingSpot spot : parkingSpots) {
            if(spot.getSpotStatus() == SpotStatus.AVAILABLE && spot.getVehicleType() == type) {
                return spot;
            }
        }
        return null;
    }
}
