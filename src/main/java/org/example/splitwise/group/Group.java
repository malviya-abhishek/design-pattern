package org.example.splitwise.group;

import org.example.splitwise.User;
import org.example.splitwise.expense.Expense;
import org.example.splitwise.expense.split.ExpenseController;
import org.example.splitwise.expense.split.ExpenseSplitType;
import org.example.splitwise.expense.split.Split;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String id;
    String name;
    List<User> members;
    List<Expense> expenses;

    ExpenseController expenseController;

    public Group(String id, String name) {
        this.id = id;
        this.name = name;
        this.expenses = new ArrayList<>();
        this.members = new ArrayList<>();
        expenseController = new ExpenseController();
    }
    public void addMember(User user){
        this.members.add(user);
    }
    public void createExpense(String id, String description, List<Split> splits, ExpenseSplitType expenseSplitType, User paidByUser, double expenseAmount) throws Exception {

        Expense expense  = expenseController.createExpense(id, description, splits, expenseSplitType, paidByUser, expenseAmount);
        this.expenses.add(expense);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<User> getMembers() {
        return members;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
}
