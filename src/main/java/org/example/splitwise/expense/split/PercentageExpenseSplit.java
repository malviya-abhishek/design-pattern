package org.example.splitwise.expense.split;

import java.util.List;

public class PercentageExpenseSplit implements ExpenseSplit{
    @Override
    public boolean validate(List<Split> splits, double totalAmount) {
        double calculateTotalAmount = 0;
        for (Split split : splits){
            PercentageSplit percentageSplit = (PercentageSplit) split;
            calculateTotalAmount += percentageSplit.getAmountOwn();
            if( (totalAmount * percentageSplit.getPercentageOwn() / 100) != percentageSplit.getAmountOwn()){
                return false;
            }
        }
        return calculateTotalAmount == totalAmount;
    }
}
