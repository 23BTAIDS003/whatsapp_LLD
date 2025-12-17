package service;

import model.User;
import java.util.HashMap;
import java.util.Map;

public class WhatsAppService {

    private Map<String, User> users = new HashMap<>();

    public void registerUser(User user) {
        users.put(user.getName(), user);
        System.out.println(user.getName() + " registered successfully");
    }
}
