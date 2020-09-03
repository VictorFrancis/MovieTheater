package MainClasses.UserPackage;

import java.io.File;
import java.time.Duration;

public class SalesOperator extends Employee {

    public SalesOperator(Integer salary, EmployeeDepartment employeeDepartment,
            String cv, String photo, String name, String encryptedPassword, String email, char gender, String phoneNumber) {
        
        super(salary, employeeDepartment, cv, photo, name, encryptedPassword, email, gender, phoneNumber);
    }

    public SalesOperator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

//    private File report;
//    private File record;
//    //+checkPassword(){…};
//    void buyTicketOffline() {
//    }
//    void getSalesRecord(){}
//    void setSalesRecord(){}
//    void evaluateDailySales(){}
//    void forecastSales(){}
//    void sendReport(){}
    //+requestSalesGraph(){..};

    
}
