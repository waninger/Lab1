package BO;

import DB.DBUser;

public class LoginHandler {
    public static boolean login(String username, String password){
        User user = User.getUser(username, password);
        if(user != null) return true;

        return false;
    }
}
