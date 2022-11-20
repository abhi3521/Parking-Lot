package models;

import enums.PaymentStatus;
import enums.PaymentType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel {
    private String ticketId;
    private double amount;
    private PaymentType mode;
    private PaymentStatus status;
}
