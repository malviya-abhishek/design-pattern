package org.example.splitwise.expense.split;

import org.example.splitwise.User;

public class PercentageSplit extends Split{
    double percentageOwn;
    public PercentageSplit(User user, double amountOwn, double percentageOwn) {
        super(user, amountOwn);
        this.percentageOwn = percentageOwn;
    }

    public double getPercentageOwn() {
        return percentageOwn;
    }
}
