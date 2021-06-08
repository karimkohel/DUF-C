package packageFacebook;

import java.util.InvalidPropertiesFormatException;

public class Client extends User{

    private String email;
    private int age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidPropertiesFormatException{
        if(email.contains("@") && email.contains(".com"))
            this.email = email;
        else{
            throw new InvalidPropertiesFormatException("Invalid email");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidPropertiesFormatException{
        if(age < 16 || age > 100){
            throw new InvalidPropertiesFormatException("Invalid age");
        }
        else{
            this.age = age;
        }
    }

    public Client(String username, String password) throws InvalidPropertiesFormatException{
        super(username, password);
    }

    public Client(String username, String password, String email, int age) throws InvalidPropertiesFormatException{
        super(username, password);
        this.setEmail(email);
        this.setAge(age);
    }
}
