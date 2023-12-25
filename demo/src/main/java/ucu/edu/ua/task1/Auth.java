package ucu.edu.ua.task1;

public class Auth {
    public MyUser login() {
        return new MyTwitterUser(new TwitterUser());
        // return new MyFacebookUser(new FacebookUser());
    }
}
