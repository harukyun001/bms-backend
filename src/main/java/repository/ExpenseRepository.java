package repository;

import entity.ExpenseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository {
    int recordTransaction(ExpenseEntity entity);
}
