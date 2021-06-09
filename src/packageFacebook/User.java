package packageFacebook;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.InvalidPropertiesFormatException;

public abstract class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws InvalidPropertiesFormatException{
        if(username.length() > 8)
            this.username = username;
        else{
            throw new InvalidPropertiesFormatException("Invalid username length");
        }
    }

    protected String getPassword() {
        return password;
    }

    protected void setPassword(String password) throws InvalidPropertiesFormatException{
        if(password.length() > 8){
            MessageDigest md = null;
            try {
                md = MessageDigest.getInstance("MD5");
                md.update(password.getBytes());
                byte[] bytes = md.digest();
                StringBuilder sb = new StringBuilder();
                for (byte aByte : bytes) {
                    sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
                }
                this.password = sb.toString();
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
    }

    public void post(String title, String content){
        // TODO
    }

}
