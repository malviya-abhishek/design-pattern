package org.example.splitwise.expense.split;

import java.util.List;

public class UnequalExpenseSplit implements ExpenseSplit {
    @Override
    public boolean validate(List<Split> splits, double totalAmount) {
        double calulatedTotalAmount = 0;
        for(Split split : splits){
            calulatedTotalAmount += split.getAmountOwn();
        }
        return calulatedTotalAmount == totalAmount;
    }
}
