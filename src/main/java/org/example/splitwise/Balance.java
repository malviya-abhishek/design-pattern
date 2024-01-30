package org.example.splitwise;

public class Balance {
    double amountOwn;
    double amountGetBack;

    public Balance() {
        amountOwn = 0;
        amountGetBack =0;
    }

    public double getAmountOwn() {
        return amountOwn;
    }

    public void setAmountOwn(double amountOwn) {
        this.amountOwn = amountOwn;
    }

    public double getAmountGetBack() {
        return amountGetBack;
    }

    public void setAmountGetBack(double amountGetBack) {
        this.amountGetBack = amountGetBack;
    }
}
