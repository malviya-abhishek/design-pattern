package org.example.splitwise;

public class User {
    String id;
    String name;

    UserBalanceSheet userBalanceSheet;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.userBalanceSheet  = new UserBalanceSheet();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserBalanceSheet getUserBalanceSheet() {
        return userBalanceSheet;
    }

}
