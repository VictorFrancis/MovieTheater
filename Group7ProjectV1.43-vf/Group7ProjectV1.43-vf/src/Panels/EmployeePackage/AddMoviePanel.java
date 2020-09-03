package Panels.EmployeePackage;

import DEMOPack.DemoFrame;
import MainClasses.MoviePackage.Genre;
import MainClasses.MoviePackage.Movie;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AddMoviePanel extends javax.swing.JPanel {
    
    Movie mov;
    String poster;
    
    public AddMoviePanel() {
        initComponents();
        mov = null;
        poster = null;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDesc = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDirectors = new javax.swing.JTextField();
        jTextFieldProducer = new javax.swing.JTextField();
        jTextFieldCast = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonUploadPoster = new javax.swing.JButton();
        jButtonAddUpcomingMovie = new javax.swing.JButton();
        jTextFieldSubtitles = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldMovPrice = new javax.swing.JTextField();
        jTextFieldMovDuration = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jCheckBoxAction = new javax.swing.JCheckBox();
        jCheckBoxComedy = new javax.swing.JCheckBox();
        jCheckBoxRomantic = new javax.swing.JCheckBox();
        jCheckBoxHorror = new javax.swing.JCheckBox();
        jCheckBoxSciFi = new javax.swing.JCheckBox();
        jCheckBoxAdventure = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jCheckBoxMerchTShirt = new javax.swing.JCheckBox();
        jCheckBoxMerchMug = new javax.swing.JCheckBox();
        jComboBoxExpDay = new javax.swing.JComboBox<>();
        jComboBoxExpMonth = new javax.swing.JComboBox<>();
        jComboBoxExpYear = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add New Movie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jLabel1.setText("Movie Name: ");

        jLabel2.setText("Description: ");

        jTextAreaDesc.setColumns(20);
        jTextAreaDesc.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDesc);

        jLabel6.setText("Director(s) :");

        jLabel7.setText("Producer(s) :");

        jLabel8.setText("Cast (s):");

        jLabel3.setText("Poster: ");

        jButtonUploadPoster.setText("Upload");
        jButtonUploadPoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadPosterActionPerformed(evt);
            }
        });

        jButtonAddUpcomingMovie.setText("Add to Upcoming Movies");
        jButtonAddUpcomingMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUpcomingMovieActionPerformed(evt);
            }
        });

        jLabel12.setText("Subtitles");

        jLabel13.setText("Price of Movie License(TK):");

        jLabel14.setText("Enter lenth of movie in Minutes: ");

        jLabel15.setText("Select Genre(s):");

        jCheckBoxAction.setText("Action");

        jCheckBoxComedy.setText("Comedy");

        jCheckBoxRomantic.setText("Romantic");

        jCheckBoxHorror.setText("Horror");

        jCheckBoxSciFi.setText("Sci - Fi");
        jCheckBoxSciFi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSciFiActionPerformed(evt);
            }
        });

        jCheckBoxAdventure.setText("Adventure");

        jLabel4.setText("Merchandise availability: ");

        jCheckBoxMerchTShirt.setText("T - Shirt");

        jCheckBoxMerchMug.setText("Mug");
        jCheckBoxMerchMug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMerchMugActionPerformed(evt);
            }
        });

        jComboBoxExpDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxExpDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxExpDayActionPerformed(evt);
            }
        });

        jComboBoxExpMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBoxExpYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));

        jLabel9.setText("Select License expiry date: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCast, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldDirectors, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonUploadPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(56, 56, 56)
                        .addComponent(jTextFieldSubtitles, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldMovPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldMovDuration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxHorror)
                                            .addComponent(jCheckBoxAdventure))
                                        .addGap(92, 92, 92))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jCheckBoxAction)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBoxComedy)
                                        .addGap(8, 8, 8))
                                    .addComponent(jCheckBoxRomantic)
                                    .addComponent(jCheckBoxSciFi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonAddUpcomingMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxExpDay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jComboBoxExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxExpYear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBoxMerchTShirt)
                                        .addGap(92, 92, 92)
                                        .addComponent(jCheckBoxMerchMug, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)))
                        .addGap(106, 106, 106)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldMovDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextFieldSubtitles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldMovPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(26, 26, 26)
                                .addComponent(jCheckBoxAction)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxHorror)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxAdventure))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxComedy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxRomantic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxSciFi)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextFieldDirectors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBoxMerchTShirt)
                                    .addComponent(jCheckBoxMerchMug))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldProducer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldCast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jButtonUploadPoster))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxExpDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxExpYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddUpcomingMovie)
                        .addGap(28, 28, 28))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxSciFiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSciFiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxSciFiActionPerformed

    private void jCheckBoxMerchMugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMerchMugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMerchMugActionPerformed

    private void jComboBoxExpDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxExpDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxExpDayActionPerformed

    private void jButtonUploadPosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadPosterActionPerformed
        
        JFileChooser fc = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpeg", "png");
        String dir = "File Database\\Movie Library\\Movie Posters";
        
        fc.setCurrentDirectory(new File(dir));
        fc.setFileFilter(filter);
        int res = fc.showOpenDialog(this);
        
        if(res == JFileChooser.APPROVE_OPTION){
            poster = fc.getSelectedFile().getAbsolutePath();
            JOptionPane.showMessageDialog(jCheckBoxComedy, "Successfully uploaded poster.");
        } else{
            JOptionPane.showMessageDialog(jCheckBoxComedy, "Select a movie poster.");
        }   
    }//GEN-LAST:event_jButtonUploadPosterActionPerformed

    private void jButtonAddUpcomingMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddUpcomingMovieActionPerformed
        
        if(poster == null){
            JOptionPane.showMessageDialog(jCheckBoxComedy, "Select a Poster please");
            return;
        }
        String movName, cast, director, producer, desc, subtitles;
        boolean[] merch = new boolean[2];
        ArrayList<Genre> genre = new ArrayList<>();
        LocalDateTime expDate;
        int movPrice;
        Duration movDuration;
        
        movName = jTextFieldName.getText();
        cast = jTextFieldCast.getText();
        director = jTextFieldDirectors.getText();
        producer = jTextFieldProducer.getText();
        desc = jTextAreaDesc.getText();
        subtitles = jTextFieldSubtitles.getText();
        movPrice = Integer.parseInt(jTextFieldMovPrice.getText());
        
        if(jCheckBoxMerchTShirt.isSelected()) merch[0] = true;
        if(jCheckBoxMerchMug.isSelected()) merch[1] = true;
        genre = getGenre();        
        
        movDuration = Duration.ofMinutes(Integer.parseInt(jTextFieldMovDuration.getText()));
        
        int year, month, day;
        year = Integer.parseInt(jComboBoxExpYear.getSelectedItem().toString());
        month = Integer.parseInt(jComboBoxExpMonth.getSelectedItem().toString());
        day = Integer.parseInt(jComboBoxExpDay.getSelectedItem().toString());
        expDate = LocalDateTime.of(year, Month.of(month), day, 0, 0);
        
        if(poster != null){
            mov = new Movie(movName, movPrice, subtitles, desc, director, producer, movDuration, poster, expDate, cast, merch, genre);
            addMovToUpcomingFile();
            resetFields();
        }
        
        
    }//GEN-LAST:event_jButtonAddUpcomingMovieActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddUpcomingMovie;
    private javax.swing.JButton jButtonUploadPoster;
    private javax.swing.JCheckBox jCheckBoxAction;
    private javax.swing.JCheckBox jCheckBoxAdventure;
    private javax.swing.JCheckBox jCheckBoxComedy;
    private javax.swing.JCheckBox jCheckBoxHorror;
    private javax.swing.JCheckBox jCheckBoxMerchMug;
    private javax.swing.JCheckBox jCheckBoxMerchTShirt;
    private javax.swing.JCheckBox jCheckBoxRomantic;
    private javax.swing.JCheckBox jCheckBoxSciFi;
    private javax.swing.JComboBox<String> jComboBoxExpDay;
    private javax.swing.JComboBox<String> jComboBoxExpMonth;
    private javax.swing.JComboBox<String> jComboBoxExpYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDesc;
    private javax.swing.JTextField jTextFieldCast;
    private javax.swing.JTextField jTextFieldDirectors;
    private javax.swing.JTextField jTextFieldMovDuration;
    private javax.swing.JTextField jTextFieldMovPrice;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldProducer;
    private javax.swing.JTextField jTextFieldSubtitles;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Genre> getGenre() {
        ArrayList<Genre> list = new ArrayList<>();
        
        if(jCheckBoxAction.isSelected()) list.add(Genre.ACTION);
        if(jCheckBoxAdventure.isSelected()) list.add(Genre.ADVENTURE);
        if(jCheckBoxComedy.isSelected()) list.add(Genre.COMEDY);
        if(jCheckBoxHorror.isSelected()) list.add(Genre.HORROR);
        if(jCheckBoxRomantic.isSelected()) list.add(Genre.ROMANTIC);
        if(jCheckBoxSciFi.isSelected()) list.add(Genre.SCI_FI);
        
        return list;
    }

    private void addMovToUpcomingFile() {
        
        String filePath = "File Database\\Movie Library\\CurrentlyScreening.bin";
        File f = new File(filePath);
        ObjectOutputStream out;
        boolean canAppend = f.exists();
        
        try {
            if(canAppend){
                out = new MyOOS(new FileOutputStream(f, true));
            } else{
                out = new ObjectOutputStream(new FileOutputStream(f));
            }
            out.writeObject(mov);
            out.flush();
            JOptionPane.showMessageDialog(jCheckBoxComedy, "Successfully stored movie " + mov.getName() + " in library.");
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(jCheckBoxComedy, "Could not store movie successfully.");
        }
        
    }
    void resetFields(){
        jTextAreaDesc.setText("");
        jTextFieldCast.setText("");
        jTextFieldDirectors.setText("");
        jTextFieldMovDuration.setText("");
        jTextFieldMovPrice.setText("");
        jTextFieldName.setText("");
        jTextFieldProducer.setText("");
        jTextFieldSubtitles.setText("");
        poster = null;
        jCheckBoxSciFi.setSelected(false);
        jCheckBoxAction.setSelected(false);
        jCheckBoxAdventure.setSelected(false);
        jCheckBoxComedy.setSelected(false);
        jCheckBoxHorror.setSelected(false);
        jCheckBoxRomantic.setSelected(false);
        jCheckBoxMerchTShirt.setSelected(false);
        jCheckBoxMerchMug.setSelected(false);
    }
    
}

class MyOOS extends ObjectOutputStream{
    public MyOOS(OutputStream out) throws IOException {
        super(out);
    }
    @Override
    protected void writeStreamHeader() {}
}