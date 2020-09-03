package Panels;

import DriverPackage.DriverFrame;
import MainClasses.UserPackage.Employee;
import MainClasses.UserPackage.User;
import MainClasses.UserPackage.Viewer;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

public class LoginPanel1 extends javax.swing.JPanel {

    User user;
    public LoginPanel1() {
        initComponents();
    }

    public LoginPanel1(DriverFrame aThis) {
        initComponents();
        user = aThis.getCurrentUser();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxUserGroup = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24))); // NOI18N
        setName("LoginChildParent"); // NOI18N
        setPreferredSize(new java.awt.Dimension(450, 380));

        jLabel1.setText("E-mail ID :");

        jLabel2.setText("Password :");

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jLabel3.setText("Not a member?");

        jComboBoxUserGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Viewer", "Sales Operator", "IT / Developer", "Management" }));
        jComboBoxUserGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUserGroupActionPerformed(evt);
            }
        });

        jLabel4.setText("Group :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxUserGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldID)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxUserGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addComponent(jButtonLogin)
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegister)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
//        System.out.println(this);
//        System.out.println(this.getParent().getName());
//        System.out.println(this.getParent().getParent().getName());
//        System.out.println(this.getParent().getParent().getParent().getName());
//        System.out.println(this.getParent().getParent().getParent().getParent().getName());
//        System.out.println(this.getParent().getParent().getParent().getParent().getParent().getName());   //DriverFrame
////        System.out.println(this.getParent().getParent().getParent().getParent().getParent().getParent().getName());   //DriverFrame
////        this.getParent().setVisible(false);
////        this.getParent().getParent().add(new HomePagePanelDemo());
////        this.getParent().getParent().validate();
//
        
        this.setVisible(false);
        this.getParent().add(new RegistrationPanel1());
        this.getParent().validate();
        
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jComboBoxUserGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUserGroupActionPerformed
        
    }//GEN-LAST:event_jComboBoxUserGroupActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        
        if(!jTextFieldID.getText().isEmpty() || jPasswordField.getPassword().length >= 8){
            String mail = jTextFieldID.getText();
            String pass = Integer.toString((new String(jPasswordField.getPassword()) + "spicy").hashCode());
            if(jComboBoxUserGroup.getSelectedIndex() == 0){     //viewer
                user = (Viewer) validateViewerLogin(mail, pass);
            } else {
                user = (Employee) validateEmployeeLogin(mail, pass);
            }
        } else{
            JOptionPane.showMessageDialog(jButtonLogin, "Please enter the required fields.");
            return;
        }
        
        if(user == null){
            JOptionPane.showMessageDialog(jButtonLogin, "No such Id and password combination was found. Login unsuccessful!");
        } else{
            JOptionPane.showMessageDialog(jButtonLogin, "Successfully logged in. Welcome " + user.getName() + "!");
            this.setVisible(false);
            this.getParent().add(new HomePagePanel());
            this.getParent().validate();
//            this.getParent().setUser(user);
// TO DO ~return to homePage + update user @driverframe
        }
        
//        this.getParent().getParent().allowUserLogin(user);
    }//GEN-LAST:event_jButtonLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JComboBox<String> jComboBoxUserGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables

    private User validateViewerLogin(String mail, String pass) {
        try(ObjectInputStream in = new ObjectInputStream( new BufferedInputStream(new FileInputStream("File Database\\Users\\Viewer.bin")))) {
//            System.out.println(in.available());
            Viewer v;
            while(true){
                
                v = (Viewer) in.readObject();
//                System.out.println(v.toString());
                if(v.getEmailAddress().equals(mail) && v.correctPassword(pass)){
                    return v;
                }
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
        return null;
    }

    private User validateEmployeeLogin(String mail, String pass) {
        try(ObjectInputStream in = new ObjectInputStream( new BufferedInputStream(new FileInputStream("File Database\\Users\\Employee.bin")))) {
            
            Employee v;
            while(true){
                v =  (Employee) in.readObject();
                if(v.getEmailAddress().equals(mail) && v.correctPassword(pass)){
                    return v;
                }
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
        return null;
    }
}
