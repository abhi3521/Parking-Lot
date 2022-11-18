package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ParkingLot extends BaseModel {
    private String name;
    private String Address;
    
    @Builder.Default
    private List<ParkingFloor> floors = new ArrayList<>();
    
    @Builder.Default
    private List<EntryGate> entryGates = new ArrayList<>();

    @Builder.Default
    private List<ExitGate> exitGates = new ArrayList<>();


}
