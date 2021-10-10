package BO;

import DB.DBUser;

import java.util.Collection;

public class User {
    private String name;
    private String password;
    private int id;

    public User(String name, String password, int id){
        this.name = name;
        this.password = password;
        this.id = id;
    }

    public static User getUser(String name, String Password){
        return new User("janne", "1234",2);
        //när db funkar
        //return DBUser.getUser(name, Password);
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

}
