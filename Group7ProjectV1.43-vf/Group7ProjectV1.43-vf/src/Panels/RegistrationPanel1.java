package Panels;

import MainClasses.UserPackage.Employee;
import MainClasses.UserPackage.EmployeeDepartment;
import MainClasses.UserPackage.ITDeveloper;
import MainClasses.UserPackage.Management;
import MainClasses.UserPackage.SalesOperator;
import MainClasses.UserPackage.User;
import MainClasses.UserPackage.Viewer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class RegistrationPanel1 extends javax.swing.JPanel {
    ButtonGroup bgGender, bgUT;
    User user;
    
    public RegistrationPanel1() {
        initComponents();
        bgGender = new ButtonGroup();
        bgGender.add(jRadioButtonGenderOther);
        bgGender.add(jRadioButtonGenderFem);
        bgGender.add(jRadioButtonGenderMale);
        
        
        bgUT = new ButtonGroup();
        bgUT.add(jRadioButtonUTViewer);
        bgUT.add(jRadioButtonUTEmp);
        
        user = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonGenderOther = new javax.swing.JRadioButton();
        jRadioButtonGenderFem = new javax.swing.JRadioButton();
        jRadioButtonGenderMale = new javax.swing.JRadioButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButtonRegister = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButtonUTViewer = new javax.swing.JRadioButton();
        jRadioButtonUTEmp = new javax.swing.JRadioButton();
        jTextFieldEmpCode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24))); // NOI18N

        jLabel1.setText("Full Name :");

        jTextFieldName.setMinimumSize(new java.awt.Dimension(50, 24));

        jTextFieldEmail.setMinimumSize(new java.awt.Dimension(50, 24));

        jLabel2.setText("E-mail address :");

        jTextFieldPhone.setMinimumSize(new java.awt.Dimension(50, 24));
        jTextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneActionPerformed(evt);
            }
        });

        jLabel3.setText("Phone number :");

        jLabel4.setText("Gender :");

        jLabel5.setText("Enter a Password (at least 8 characters):");

        jLabel6.setText("Enter Password again :");

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setText("Please enter the necessary information for signing up");

        jRadioButtonGenderOther.setText("Other");

        jRadioButtonGenderFem.setText("Female");

        jRadioButtonGenderMale.setText("Male");

        jPasswordField1.setMinimumSize(new java.awt.Dimension(50, 24));

        jPasswordField2.setMinimumSize(new java.awt.Dimension(50, 24));

        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jLabel8.setText("Type of User: ");

        jRadioButtonUTViewer.setText("Viewer");

        jRadioButtonUTEmp.setText("Employee");

        jTextFieldEmpCode.setMinimumSize(new java.awt.Dimension(50, 24));

        jLabel9.setText("(if Employee) Insert Emp-Code:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addGap(159, 159, 159))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(129, 129, 129))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonGenderFem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonUTViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(5, 5, 5)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jRadioButtonUTEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addGap(27, 27, 27))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonGenderMale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(20, 20, 20)
                                        .addComponent(jRadioButtonGenderOther, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGap(114, 114, 114))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordField1, jPasswordField2, jTextFieldEmail, jTextFieldEmpCode, jTextFieldName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonGenderMale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonGenderOther, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonGenderFem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonUTViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonUTEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmpCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonRegister)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        
        boolean result = registerNow();
        if(result){    
            JOptionPane.showMessageDialog(jTextFieldName, "Successfully registered!");
            resetFields();
            
            this.setVisible(false);
            this.getParent().add(new LoginPanel1());
            this.getParent().validate();
            //take to login
        } else{
//            JOptionPane.showMessageDialog(jTextFieldName, "Unable to register. Please try again.");
//            resetFields();
        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButtonGenderFem;
    private javax.swing.JRadioButton jRadioButtonGenderMale;
    private javax.swing.JRadioButton jRadioButtonGenderOther;
    private javax.swing.JRadioButton jRadioButtonUTEmp;
    private javax.swing.JRadioButton jRadioButtonUTViewer;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmpCode;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables

    private boolean registerNow() {
        String name, email, phone, password1, password2;
        char gender;
        int typeUser;
        name = jTextFieldName.getText();
        email = jTextFieldEmail.getText();
        phone = jTextFieldPhone.getText();
        
        //check password
        if(new String(jPasswordField1.getPassword()).length() < 8){
            JOptionPane.showMessageDialog(jTextFieldName, "Password too small! Please enter everything from scratch lol.");
            resetFields();
            return false;
        }
        password1 = Integer.toString((new String(jPasswordField1.getPassword()) + "spicy").hashCode());
        password2 = Integer.toString((new String(jPasswordField2.getPassword()) + "spicy").hashCode());
        if(!password1.equals(password2)){
            JOptionPane.showMessageDialog(jTextFieldName, "Passwords don't match! Enter again");
            resetFields();
            return false;
        }
        
        //check gender
        gender = getGender();
        if(gender == 'e'){
            JOptionPane.showMessageDialog(jTextFieldName, "Invalid gender!");
            resetFields();
            return false;
        }
        
        //check usertype
        typeUser = getUserType();
        if(typeUser == -2){
            JOptionPane.showMessageDialog(jTextFieldName, "Invalid user type!");
            resetFields();
            return false;
        } else if(typeUser == -1) return false;
        
        //check other fields
        String cv, photo;
        if(!name.isEmpty() && !phone.isEmpty() && !email.isEmpty()){
            switch(typeUser){
                case 0:
                    user = new Viewer(name, password2, email, gender, phone);
                    break;
                case 1:
                    cv = getCVFromFile(email);
                    photo = getPhotoFromFile(email);
                    user = new SalesOperator(Employee.SALES_OPERATOR_SALARY, EmployeeDepartment.SALES_OPERATOR, cv, photo, name, password2, email, gender, phone);
                    break;
                case 2:
                    cv = getCVFromFile(email);
                    photo = getPhotoFromFile(email);
                    user = new ITDeveloper(Employee.SALES_OPERATOR_SALARY, EmployeeDepartment.SALES_OPERATOR, cv, photo, name, password2, email, gender, phone);
                    break;
                case 3:
                    cv = getCVFromFile(email);
                    photo = getPhotoFromFile(email);
                    user = new Management(Employee.SALES_OPERATOR_SALARY, EmployeeDepartment.SALES_OPERATOR, cv, photo, name, password2, email, gender, phone);
                    break;
            }
            
            boolean isViewer = (typeUser == 0 ? true : false);
            writeNewUserToFile(user, isViewer);
            
        } else{
            JOptionPane.showMessageDialog(jTextFieldName, "Some fields are missing.");
            return false;
        }
        
        return true;
    }

    private void resetFields() {
        jTextFieldName.setText("");
        jTextFieldPhone.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEmpCode.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        bgGender.clearSelection();
        bgUT.clearSelection();
    }

    private char getGender() {
        if(jRadioButtonGenderMale.isSelected()){
            return 'm';
        }else if(jRadioButtonGenderFem.isSelected()){
            return 'f';
        }else if(jRadioButtonGenderOther.isSelected()){
            return 'o';
        } else return 'e';
    }

    private int getUserType() {
        
        if(jRadioButtonUTViewer.isSelected()){
            return 0;   //Viewer
        } else if(jRadioButtonUTEmp.isSelected()){
            int code = Integer.parseInt(jTextFieldEmpCode.getText());
            switch(code){
                case 111:
                    return 1;   //S.O
                case 222:
                    return 2;   //IT
                case 333:
                    return 3;   //Mgmt
                default:
                    JOptionPane.showMessageDialog(jTextFieldName, "Entered wrong Emp-Code. Please contact your recruiter to receive the correct code.");
                    resetFields();
                    return -1;
            }
        } else return -2;
    }

    private String getPhotoFromFile(String email) {
        return "";
    }

    private String getCVFromFile(String email) {
        return "";
    }

    private void writeNewUserToFile(User user, boolean isViewer) {
        
        String filePath = isViewer ? "File Database\\Users\\Viewer.bin" : "File Database\\Users\\Employee.bin";
        File f = new File(filePath);
        ObjectOutputStream out;
        boolean canAppend = f.exists();
        
        try {
            if(canAppend){
                out = new MyOOS(new FileOutputStream(f, true));
            } else{
                out = new ObjectOutputStream(new FileOutputStream(f));
            }
            out.writeObject(user);
            out.flush();
            System.out.println("Successfully written user to file.");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Writing unsuccessful.");
        }
        
    }
    
}

class MyOOS extends ObjectOutputStream{
    public MyOOS(OutputStream out) throws IOException {
        super(out);
    }
    @Override
    protected void writeStreamHeader() {}
}