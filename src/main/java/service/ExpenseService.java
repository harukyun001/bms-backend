package service;

import org.springframework.stereotype.Service;
import request.ExpenseAddRequest;

@Service
public interface ExpenseService {
    void recordTransaction(ExpenseAddRequest request);
}
