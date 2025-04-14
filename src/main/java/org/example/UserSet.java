package org.example;

import java.util.*;

public class UserSet {

    private final HashSet<String> users = new HashSet<>();

    public boolean containsUser(String username){
        return users.contains(username);
    }
    public boolean removeUser(String username){
        try{
            if(users.contains(username)){
                users.remove(username);
                return true;
            }
            return false;

        }catch(Exception e){
            System.out.println(e.toString());
            return false;
        }
    }
    public int getUserCount(){
        return users.size();
    }
    public List<String> getUsersWithPrefix(String prefix){
        if (prefix == null) {
            throw new IllegalArgumentException("prefix cannot be null");
        }
        List<String> ret = new ArrayList<>();
        for(String user : users){
            if(user.startsWith(prefix)){
                ret.add(user);
            }
        }
        return ret;
    }
    public boolean addUser(String username){
        if(username == null){
            throw new IllegalArgumentException("username cannot be null");
        }

        if(username.trim().isEmpty()){
            throw new IllegalArgumentException("username cannot be empty");
        }

        try {
            if(!users.contains(username)){
                users.add(username);
                return true;
            }
            return false;

        }catch (Exception e){
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean areAllUsersUnique(String[] arr){
        if (arr == null) {
            throw new IllegalArgumentException("arr cannot be null");
        }
        Set<String> nameSet = new HashSet<>(Arrays.asList(arr));
        return arr.length == nameSet.size();
    }
}
