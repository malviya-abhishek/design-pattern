package org.example.splitwise;

import org.example.splitwise.expense.split.Split;

import java.util.List;
import java.util.Map;

public class BalanceSheetController {
    public void  updateUserBalanceSheet(User paidByUser, List<Split> splits, double totalExpenseAmount){
        UserBalanceSheet paidByUserSheet = paidByUser.getUserBalanceSheet();
        paidByUserSheet.setTotalPayments(paidByUserSheet.getTotalPayments() + totalExpenseAmount);

        for(Split split : splits){
            if(split.getUser().id.equals(paidByUser.getId())){
                paidByUserSheet.setTotalExpenses(paidByUserSheet.getTotalExpenses() + split.getAmountOwn());
            }
            else{
                paidByUserSheet.setTotalYouGetBack(paidByUserSheet.getTotalYouGetBack() + split.getAmountOwn());

                // update in paidByUser
                Balance userOwnBalance;
                if(paidByUserSheet.getBalanceSheet().containsKey(split.getUser().id)){
                    userOwnBalance = paidByUser.getUserBalanceSheet().getBalanceSheet().get(split.getUser().getId());
                }
                else {
                    userOwnBalance = new Balance();
                    paidByUser.getUserBalanceSheet().getBalanceSheet().put(split.getUser().getId(), userOwnBalance);
                }
                userOwnBalance.setAmountGetBack(userOwnBalance.getAmountGetBack() + split.getAmountOwn());
                // update in own by user
                Balance userPaidBalance;
                if(split.getUser().getUserBalanceSheet().getBalanceSheet().containsKey(paidByUser.getId())){
                    userPaidBalance = split.getUser().getUserBalanceSheet().getBalanceSheet().get(paidByUser.getId());
                }
                else {
                    userPaidBalance = new Balance();
                    split.getUser().getUserBalanceSheet().getBalanceSheet().put(paidByUser.getId(), userPaidBalance);
                }
                userPaidBalance.setAmountOwn(userPaidBalance.getAmountOwn() + split.getAmountOwn());
            }
        }

    }

    public void showUserBalanceSheet(User user){
        System.out.println("---------------------------------------");
        System.out.println("Balance sheet of user : " + user.getId());
        UserBalanceSheet userBalanceSheet = user.getUserBalanceSheet();
        System.out.println("TotalYourExpense: " + userBalanceSheet.getTotalExpenses());
        System.out.println("TotalGetBack: " + userBalanceSheet.getTotalYouGetBack());
        System.out.println("TotalYourOwe: " + userBalanceSheet.getTotalYouOwn());
        System.out.println("TotalPaymnetMade: " + userBalanceSheet.getTotalPayments());
        for(Map.Entry<String, Balance> entry : userBalanceSheet.getBalanceSheet().entrySet()){

            String userID = entry.getKey();
            Balance balance = entry.getValue();

            System.out.println("userID:" + userID + " YouGetBack:" + balance.getAmountGetBack() + " YouOwe:" + balance.getAmountOwn());
        }
        System.out.println("---------------------------------------");
    }
}
