
package Panels;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AboutSineplexPanel extends javax.swing.JPanel {

    /**
     * Creates new form AboutSineplexPanel
     */
    public AboutSineplexPanel() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jButtonChangeBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabelBackground = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelTitle.setText("Welcome to the Sineplex PC App(Beta)");
        add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 430, 70));

        jButtonChangeBack.setText("Change Background");
        jButtonChangeBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeBackActionPerformed(evt);
            }
        });
        add(jButtonChangeBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 180, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Kalinga", 0, 16)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("An app full of bugs and promises and unfulfilling requirements because we \ncould not manage to meet the deadline. This is mostly because we underestimated\nthe time it takes to get a simple function going such as 'Login'.\nTo code, to debug to test and to make it synergize with the rest of the components \nrequires a great amount of perseverance, skill and passion as well.\nBut it was a great learning experience even though it didn't turn out the way we \nhoped. Thank you for giving us this opportunity!\n");
        jTextArea2.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 680, 220));

        jLabelBackground.setMaximumSize(new java.awt.Dimension(740, 520));
        jLabelBackground.setMinimumSize(new java.awt.Dimension(740, 520));
        jLabelBackground.setPreferredSize(new java.awt.Dimension(740, 520));
        add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChangeBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeBackActionPerformed
        JFileChooser fc = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpeg", "png");
        String dir = "File Database\\Backgrounds";
        fc.setCurrentDirectory(new File(dir));
        fc.setFileFilter(filter);
        int res = fc.showOpenDialog(this);
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
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonChangeBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangeBack;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
