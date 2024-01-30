package org.example.splitwise;

import java.util.HashMap;
import java.util.Map;

public class UserBalanceSheet {
    Map<String, Balance> balanceSheet;

    double totalPayments;
    double totalExpenses;
    double totalYouOwn;
    double totalYouGetBack;

    public UserBalanceSheet() {
        this.balanceSheet = new HashMap<>();
        this.totalExpenses = 0;
        this.totalPayments = 0;
        this.totalYouOwn = 0;
        this.totalYouGetBack = 0;
    }

    public Map<String, Balance> getBalanceSheet() {
        return balanceSheet;
    }

    public double getTotalPayments() {
        return totalPayments;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public double getTotalYouOwn() {
        return totalYouOwn;
    }

    public double getTotalYouGetBack() {
        return totalYouGetBack;
    }

    public void setTotalPayments(double totalPayments) {
        this.totalPayments = totalPayments;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public void setTotalYouOwn(double totalYouOwn) {
        this.totalYouOwn = totalYouOwn;
    }

    public void setTotalYouGetBack(double totalYouGetBack) {
        this.totalYouGetBack = totalYouGetBack;
    }
}
