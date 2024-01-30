package org.example.splitwise.expense.split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
    @Override
    public boolean validate(List<Split> splits, double totalAmount) {
        double amountOwnBySinglePerson = totalAmount / splits.size();
        for(Split split : splits){
            if(split.amountOwn != amountOwnBySinglePerson){
                return  false;
            }
        }
        return true;
    }
}
