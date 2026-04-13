package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import request.ExpenseAddRequest;
import service.ExpenseService;

@RestController
@RequestMapping(value="/expense")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/record-transaction")
    public void recordTransaction(@RequestBody ExpenseAddRequest request, Errors errors) {
        if (errors.hasErrors()) {
            throw new IllegalArgumentException("Invalid Request!");
        }
        expenseService.recordTransaction(request);
    }
}
