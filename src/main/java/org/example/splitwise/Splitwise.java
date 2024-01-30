package org.example.splitwise;

import org.example.splitwise.expense.split.ExpenseSplitType;
import org.example.splitwise.expense.split.Split;
import org.example.splitwise.group.Group;
import org.example.splitwise.group.GroupController;

import java.util.ArrayList;
import java.util.List;

public class Splitwise {

    UserController userController;
    GroupController groupController;
    BalanceSheetController balanceSheetController;

    public Splitwise() {
        this.userController = new UserController();
        this.groupController = new GroupController();
        this.balanceSheetController = new BalanceSheetController();

    }

    public void demo() throws Exception {
        addUserAndGroup();
        System.out.println("Split wise started");
        List<Split> splits1 = new ArrayList<>();
        splits1.add(new Split(userController.getUser("U000"), 200));
        splits1.add(new Split(userController.getUser("U001"), 200));
        splits1.add(new Split(userController.getUser("U002"), 200));
        Group group1 = groupController.getGroup("G000");
        group1.createExpense("EX000", "Went for a long tea", splits1, ExpenseSplitType.EQUAL, userController.getUser("U000"), 600);

        for(User user: userController.getUsers()){
            balanceSheetController.showUserBalanceSheet(user);
        }
    }


    private void addUserAndGroup(){
        addUsers();
        User user = userController.getUser("U000");
        groupController.addGroup("G000", "Office", user);
    }

    private void addUsers(){
        User user0 = new User("U000", "Joe");
        User user1 = new User("U001", "Rose");
        User user2 = new User("U002", "Jack");
        userController.addUser(user0);
        userController.addUser(user1);
        userController.addUser(user2);
    }


}
