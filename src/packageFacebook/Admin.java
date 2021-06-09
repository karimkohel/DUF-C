package packageFacebook;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

public class Admin extends Client{
    private String token;

    private static final List<String> tokens = new ArrayList<>();

    public String getToken() {
        return token;
    }

    public void setToken() {
        // this is the equivalent of a random hash and a salt
        this.token = String.valueOf(Math.random() + 5);
        Admin.tokens.add(this.token);
    }

    public boolean checkAdmin(){
        return Admin.tokens.contains(this.token);
    }

    public Admin(String username, String password) throws InvalidPropertiesFormatException {
        super(username, password);
        this.setToken();
    }

    public Admin(String username, String password, String email, int age, String token) throws InvalidPropertiesFormatException {
        super(username, password, email, age);
        this.setToken();
    }
}
