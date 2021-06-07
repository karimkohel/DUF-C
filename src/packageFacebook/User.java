package packageFacebook;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    protected String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
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

    public User(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

}
