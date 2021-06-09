package packageFacebook;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

public class Admin extends Client implements HashableInterface{
    private long token;

    private static final List<Long> tokens = new ArrayList<Long>();

    private long getToken() {
        return token;
    }

    private void setToken() {
        // this is the equivalent of a random hash and a salt
        this.token = Math.round(Math.random() + 5);
        Admin.tokens.add(this.token);
    }

    public boolean checkAdmin(){
        return Admin.tokens.contains(this.token);
    }

    public Admin(String username, String password) throws InvalidPropertiesFormatException {
        super(username, password);
        this.setToken();
    }

    public Admin(String username, String password, String email, int age) throws InvalidPropertiesFormatException {
        super(username, password, email, age);
        this.setToken();
    }

    @Override
    public String toString() {
        return super.toString() + " Admin{" +
                "token='" + token + '\'' +
                '}';
    }

    @Override
    public Object showHashOrToken() {
        return this.getToken();
    }
}
