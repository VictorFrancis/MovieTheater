package DEMOPack;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


public class DemoFrame extends javax.swing.JFrame {

    
    public DemoFrame() {
        try {
            initComponents();
            showTime();
            File f = new File("CaveWaterfall.jpg");
            ImageIcon icon = new ImageIcon(ImageIO.read(f));
            Image img = icon.getImage();
            Image img2 = img.getScaledInstance(img.getWidth(rootPane), img.getHeight(rootPane), Image.SCALE_SMOOTH);
            jLabelBackground.setIcon(new ImageIcon(img2));
            jLabelBackground.validate();
            
//            jLabelBackground.repaint();
//            BufferedImage buf = ImageIO.read(f);
//            Image anImage = buf.getScaledInstance(buf.getWidth(), buf.getHeight(), Image.SCALE_SMOOTH);
//            jLabelBackground.setIcon(new ImageIcon(anImage));
//            jLabelBackground.revalidate();
//            jLabelBackground.repaint();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        if(jPasswordField1.getPassword().length == 0){
            System.out.println("lol");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonRemove = new javax.swing.JButton();
        jButtonBackground = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonHash = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 2, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAdd.setText("Add");
        jButtonAdd.setAutoscrolls(true);
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 150, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 151, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setAutoscrolls(true);
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 140, -1));

        jButtonRemove.setText("Remove");
        jButtonRemove.setAutoscrolls(true);
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 140, -1));

        jButtonBackground.setText("Change Backgroung");
        jButtonBackground.setAutoscrolls(true);
        jButtonBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackgroundActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 270, -1));

        jButtonHash.setText("Hash it!");
        jButtonHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHashActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHash, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 160, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 610, 120));

        jLabelBackground.setBackground(new java.awt.Color(0, 200, 114));
        jLabelBackground.setMaximumSize(new java.awt.Dimension(1200, 700));
        jLabelBackground.setMinimumSize(new java.awt.Dimension(1200, 700));
        jLabelBackground.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showTime(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime tomorrow = LocalDateTime.now().plusDays(1);
        Month month = now.getMonth();
        if(month != Month.JANUARY){
            System.out.println("Not Jan!");
        }
        int dayHash = LocalDateTime
                .now()
                .getDayOfWeek()
                .hashCode();
        System.out.println("Day hash = " + dayHash);
        
        LocalDate date = LocalDate.of(1997, Month.JANUARY, 3);
        System.out.println("Birthday date\n"
                + "Year: " + date.getYear()
                + "\tMonth: " + date.getMonth().toString()
                + "\tDay: " + date.getDayOfMonth());
        
        LocalTime time = now.toLocalTime();
        date = LocalDate.now();
        LocalDate date2 = now.toLocalDate().plusDays(30);
        if(date2.isAfter(date)){
            System.out.println("Date 2 is afterwards!");
        } else{
            System.out.println("It's not afterwards.");
        }
        LocalDateTime firstDayOfNextYear = LocalDateTime.now().with(TemporalAdjusters.firstDayOfNextYear());
        Duration tillNextYear = Duration.between(LocalDateTime.now(), firstDayOfNextYear);
        System.out.println("Days till next year = " + tillNextYear.toDays());
        
    }
    
    
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
                
        String str = jTextField1.getText();
        jComboBox1.addItem(str);
        jComboBox1.setSelectedIndex(jComboBox1.getItemCount() - 1);
        jTextField1.setText("");
        
    }//GEN-LAST:event_jButtonAddActionPerformed
    
    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        if(jComboBox1.getItemCount() != 0){
            jComboBox1.removeItemAt(jComboBox1.getSelectedIndex());
//            jComboBox1.setSelectedIndex(0);
        } else JOptionPane.showMessageDialog(rootPane, "The Combo Box has no more elements to be removed",
                "Title", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackgroundActionPerformed
        
        JFileChooser fc = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpeg", "png");
        String dir = "C:\\Users\\hp\\Desktop\\Aesthetic Themes";
        fc.setCurrentDirectory(new File(dir));
        fc.setFileFilter(filter);
        int res = fc.showOpenDialog(jPanel1);
        String s;
        if(res == JFileChooser.APPROVE_OPTION){
            s = fc.getSelectedFile().getAbsolutePath();
            try {
                BufferedImage bufImg = ImageIO.read(new File(s));
                
                ImageIcon icon = new ImageIcon(bufImg);
                Image img = icon.getImage();
                
                Image newImg = img.getScaledInstance(jLabelBackground.getWidth(), jLabelBackground.getHeight(), Image.SCALE_SMOOTH);
                
                jLabelBackground.setIcon(new ImageIcon(newImg));                
                jLabelBackground.validate();
            } catch (IOException ex) {
                Logger.getLogger(DemoFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonBackgroundActionPerformed

    private void jButtonHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHashActionPerformed
        
        char[] password = jPasswordField1.getPassword();
        if(password.length == 0){
            System.out.println("no Password entered!");
            return;
        }
        
//        String str2 = password.toString();      //address - don't use this as inconsistent!
//        String str3 = Arrays.toString(password);    //string representation of array with '[]' ','
        String s4 = String.valueOf(password);   
        String s5 = new String(password);   //smarter
        
        
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        
        s4 = s5 = s4 + "pepper";
        
        System.out.println("s4.l = " + s4.length());
        System.out.println("s5.l = " + s5.length());
        
        System.out.println("");
        
        String h1 = Integer.toString(s4.hashCode());
        String h2 = Integer.toString(s5.hashCode());
        String h3 = Integer.toString((new String(password) + "pepper").hashCode());

        
        System.out.println("s4 = " + h1);
        System.out.println("s5 = " + h2);
        System.out.println("h3 = " + h3);

//        h3 to be stored and to be compared while letting user access account        
        if(h1.equals(h3)){
            System.out.println("Voila! Successful login.");
        }
        

//        System.out.println("Arrays.hashCode(password): " + Arrays.hashCode(password));  //of contents of char[]        
//        System.out.println("password.hash: "+password.hashCode());    //of adress 
//        System.out.println("str2.hash: "+str2.hashCode());     //of str
//        System.out.println("str3.hash: "+str3.hashCode());     //of str
        
    }//GEN-LAST:event_jButtonHashActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBackground;
    private javax.swing.JButton jButtonHash;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
