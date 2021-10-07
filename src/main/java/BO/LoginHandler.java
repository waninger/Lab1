package BO;

import DB.DBUser;

public class LoginHandler {
    public static boolean login(String username, String password){
        User user = User.getUser(username, password);
        if(user.getName().compareTo(username) + user.getPassword().compareTo(password) == 0)return true;
        return false;
/*
        kod när user db funkar
        if(user != null) return true;
        return false;
 */

    }
}
