package models;

import enums.SpotStatus;
import enums.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpot extends BaseModel {
    private int spotId;
    private int floorNumber;
    private VehicleType vehicleType;
    private SpotStatus spotStatus;
}
