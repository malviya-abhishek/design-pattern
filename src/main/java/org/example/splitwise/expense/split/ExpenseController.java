package org.example.splitwise.expense.split;

import org.example.splitwise.BalanceSheetController;
import org.example.splitwise.User;
import org.example.splitwise.expense.Expense;
import org.example.splitwise.expense.ExpenseSplitFactory;

import java.util.List;

public class ExpenseController {

    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        this.balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String id, String description, List<Split> splits, ExpenseSplitType expenseSplitType, User paidByUser, double expenseAmount) throws Exception {

        ExpenseSplit expenseSplit = ExpenseSplitFactory.getExpenseSplit(expenseSplitType);
        if( expenseSplit == null || !expenseSplit.validate(splits, expenseAmount)){
            throw new Exception("Invalid Splits");
        }
        Expense expense = new Expense(id, description, splits, expenseSplitType, paidByUser, expenseAmount);
        this.balanceSheetController.updateUserBalanceSheet(paidByUser, splits, expenseAmount);
        return  expense;
    }
}
