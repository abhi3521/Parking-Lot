package models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Gate extends BaseModel {
    private int gateNumber;

    private List<Operator> operator = new ArrayList<>();
}
