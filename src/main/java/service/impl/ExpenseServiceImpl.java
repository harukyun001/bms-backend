package service.impl;

import entity.ExpenseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ExpenseRepository;
import request.ExpenseAddRequest;
import service.ExpenseService;

public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public void recordTransaction(ExpenseAddRequest request) {
        int result = expenseRepository.recordTransaction(new ExpenseEntity());
    }
}
