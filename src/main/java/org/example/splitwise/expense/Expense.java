package org.example.splitwise.expense;

import org.example.splitwise.User;
import org.example.splitwise.expense.split.ExpenseSplitType;
import org.example.splitwise.expense.split.Split;

import java.util.List;

public class Expense {
    String id;
    String description;
    List<Split> splits;
    ExpenseSplitType expenseSplitType;
    User paidByUser;
    double expenseAmount;

    public Expense(String id, String description, List<Split> splits, ExpenseSplitType expenseSplitType, User paidByUser, double expenseAmount) {
        this.id = id;
        this.description = description;
        this.splits = splits;
        this.expenseSplitType = expenseSplitType;
        this.paidByUser = paidByUser;
        this.expenseAmount = expenseAmount;
    }
}
