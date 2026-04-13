package request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ExpenseAddRequest {
    private LocalDate transactionDate;
    private short transactionCode;
    private Integer amount;
    private int installmentFrequency;
    private String description;
    private String remarks;
}
