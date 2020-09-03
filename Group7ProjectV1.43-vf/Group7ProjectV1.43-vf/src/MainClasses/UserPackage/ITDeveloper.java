package MainClasses.UserPackage;

import java.io.File;
import java.time.Duration;

public class ITDeveloper extends Employee {

    public ITDeveloper(Integer salary, EmployeeDepartment employeeDepartment,
            String cv, String photo, String name, String encryptedPassword, String email, char gender, String phoneNumber) {
        
        super(salary, employeeDepartment, cv, photo, name, encryptedPassword, email, gender, phoneNumber);
    }

    public ITDeveloper() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//    File dataCollection;

    //+checkPassword(){…};
    void requestImplementation(){}
    void secureData(){}
    void storeData(){}
    void developData(){}

    
}
