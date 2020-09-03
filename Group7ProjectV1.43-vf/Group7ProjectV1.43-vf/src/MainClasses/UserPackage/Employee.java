package MainClasses.UserPackage;

import java.io.File;
import java.io.Serializable;
import java.time.Duration;


public abstract class Employee extends User implements Serializable{
    
    public static int SALES_OPERATOR_SALARY;
    public static int IT_SALARY;
    public static int MGMT_SALARY;
    
    private Integer salary;
    private EmployeeDepartment employeeDepartment;
    private String cv, photo;
    


    public Employee(Integer salary, EmployeeDepartment employeeDepartment, String cv, String photo, String name, 
            String encryptedPassword, String email, char gender, String phoneNumber) {
        
        super(name, encryptedPassword, email, gender, phoneNumber);
        this.salary = salary;
        this.employeeDepartment = employeeDepartment;
        this.cv = cv;
        this.photo = photo;
    }

    public Employee() {
    }
    
    

    
}
