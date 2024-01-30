package org.example.splitwise;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> users;

    public UserController() {
        this.users = new ArrayList<>();
    }


    public void addUser(User user){
        this.users.add(user);
    }

    public User getUser(String id){
        for(User user : users){
            if(user.getId().equals(id)){
                return  user;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }
}
