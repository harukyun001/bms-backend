package constant;

public enum TransactionType {
    PURCHASE(1),
    CREDIT(2),
    REMITTANCE(3),
    TRANSFER(4);
    TransactionType(int transactionCode){}
}
