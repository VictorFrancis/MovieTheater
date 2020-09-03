package MainClasses.UserPackage;

import java.io.Serializable;

public abstract class User implements Serializable{
    
    private final String name;
    private final String encryptedPassword;
    private final String email;
    private final char gender;
    private final String phoneNumber;
    
    
    
//    boolean checkPassword(){return false;}
//    abstract void setInfo();
//    abstract void getInfo();
//    abstract void saveToDatabase();
//    int buyTicket(){}   // Int for returning a purchase invoice no.
//    void requestPayment(){}
//    boolean grantAccess(){}
//    void getMovieList(){}
//    int buyProduct(){}   // Int for returning a purchase invoice no.

    public User(String name, String encryptedPassword, String email, char gender, String phoneNumber) {
        this.name = name;
        this.encryptedPassword = encryptedPassword;
        this.email = email;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public User() {
        this.name = null;
        this.encryptedPassword = null;
        this.email = null;
        this.gender = 0;
        this.phoneNumber = null;
    }
    

    public String getName() {
        return name;
    }
    public String getEmailAddress(){
        return email;
    }
    public boolean correctPassword(String pass) {
        return this.encryptedPassword.equals(pass);
    }
}
