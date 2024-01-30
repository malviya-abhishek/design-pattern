package org.example.splitwise.expense;

import org.example.splitwise.expense.split.*;

public class ExpenseSplitFactory {
    public  static ExpenseSplit getExpenseSplit(ExpenseSplitType expenseSplitType){
        switch (expenseSplitType){
            case EQUAL -> {
                return new EqualExpenseSplit();
            }
            case UNQUAL -> {
                return new UnequalExpenseSplit();
            }
            case PERCENTAGE -> {
                return new PercentageExpenseSplit();
            }

            default -> {
                return null;
            }
        }
    }
}
