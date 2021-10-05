package BO;

public class LoginHandler {
    public static boolean login(String username, String password){
        User user = DBUser.getUser(username, password);

        if(user!= null) return true;
        return false;
    }
}
