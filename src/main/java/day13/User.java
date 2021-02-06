package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    List<String> subscriptions;

    public User(String username){
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public List<String> getSubscriptions() { return subscriptions; }
    public String getUsername() { return username; }

    public void subscribe(User user){
        if(!this.isSubscribed(user)) {
        this.subscriptions.add(user.username);
        }
    }

    public boolean isSubscribed(User user) {
        boolean b = false;
        for (String name : this.subscriptions) {
            if (user.username.equals(name)) {
                b = true;
                break;
            }
        }
        return b;
    }
    public boolean isFriend(User user){
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return this.username;
    }
}
