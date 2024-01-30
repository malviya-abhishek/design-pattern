package org.example.splitwise.group;

import org.example.splitwise.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Group> groups;

    public GroupController() {
        this.groups = new ArrayList<>();
    }

    public void addGroup(String id, String name, User createdByUser){
        Group group = new Group(id, name);
        group.addMember(createdByUser);
        groups.add(group);
    }
    public Group getGroup(String id){
        for(Group group : groups){
            if(group.getId().equals(id)){
                return group;
            }
        }
        return null;
    }

}
