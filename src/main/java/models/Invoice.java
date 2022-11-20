package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class Invoice extends BaseModel{
    private String invoiceId;
    private Date exitTime;
    private double amount;
    private String ticketId;
    private Ticket ticket;
    private String paymentId;
    private Payment payment;
}
