package MainClasses.FormPackage;

import MainClasses.UserPackage.EmployeeDepartment;
import MainClasses.UserPackage.User;
import java.io.File;
import java.time.LocalDateTime;

public class RecruitmentForm {
    
    private User applicant;
    private EmployeeDepartment appliedForDept;
    private LocalDateTime dateOfBirth;
    private String bloodGroup;
    private String motivationEssay;
    private File cv, photo;

    public RecruitmentForm(User applicant, EmployeeDepartment appliedForDept, LocalDateTime dateOfBirth,
            String bloodGroup, String motivationEssay, File cv, File photo) {
        
        this.applicant = applicant;
        this.appliedForDept = appliedForDept;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.motivationEssay = motivationEssay;
        this.cv = cv;
        this.photo = photo;
    }

    
    
    
}
