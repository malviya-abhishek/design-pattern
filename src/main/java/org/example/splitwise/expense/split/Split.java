package org.example.splitwise.expense.split;

import org.example.splitwise.User;

public class Split {
    User user;
    double amountOwn;

    public Split(User user, double amountOwn) {
        this.user = user;
        this.amountOwn = amountOwn;
    }

    public User getUser() {
        return user;
    }

    public double getAmountOwn() {
        return amountOwn;
    }
}
