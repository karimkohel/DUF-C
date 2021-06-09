package packageFacebook;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

public abstract class User {
    private String username;
    private String password;
    private final int id;
    private static int count = 0;
    public static List<User> users = new ArrayList<User>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws InvalidPropertiesFormatException{
        if(username.length() > 4)
            this.username = username;
        else{
            throw new InvalidPropertiesFormatException("Invalid username length");
        }
    }

    protected String getPassword() {
        return password;
    }

    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = null;
        md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] bytes = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte aByte : bytes) {
            sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    protected void setPassword(String password) throws InvalidPropertiesFormatException{
        if(password.length() > 8){
            try {
                this.password = User.hashPassword(password);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                this.password = null;
            }
        }
        else {
            throw new InvalidPropertiesFormatException("Invalid password");
        }
    }

    public User(String username, String password) throws InvalidPropertiesFormatException{
        this.setUsername(username);
        this.setPassword(password);
        this.id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID='" + id + '\'' +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(User original) {
        // never should anyone need to copy a user but here we are nonetheless
        this.id = original.getId();
        try {
            this.setUsername(original.getUsername());
            this.password = original.getPassword();
        }
        catch (Exception e){
            System.out.println("ERROR at user copy const.");
        }
    }
}
