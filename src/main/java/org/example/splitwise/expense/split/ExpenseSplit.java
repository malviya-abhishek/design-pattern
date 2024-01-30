package org.example.splitwise.expense.split;

import java.util.List;

public interface ExpenseSplit {

    public boolean validate(List<Split> splits, double totalAmount);
}
