package Panels.MovieLibraryPackage;

import DEMOPack.DemoFrame;
import MainClasses.MoviePackage.Movie;
import Panels.HomePagePanel;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class MiniMoviePanel extends javax.swing.JPanel {
    
    Movie movie;
    
    public MiniMoviePanel() {
        initComponents();
        movie = new Movie(); //bs
//        generateFields();
//        generatePoster();
    }

    public MiniMoviePanel(Movie mov) {
       this.movie = mov;
       generatePoster();
       generateFields();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMovPoster = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonGotoMovie = new javax.swing.JButton();
        jLabelMovName = new javax.swing.JLabel();
        jLabelMovCast = new javax.swing.JLabel();
        jLabelMovProducer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 0));
        setMaximumSize(new java.awt.Dimension(590, 125));
        setMinimumSize(new java.awt.Dimension(590, 125));
        setPreferredSize(new java.awt.Dimension(590, 120));

        jLabelMovPoster.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelMovPoster.setForeground(new java.awt.Color(255, 102, 51));
        jLabelMovPoster.setText("Movie Poster");

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jButtonGotoMovie.setBackground(new java.awt.Color(0, 51, 51));
        jButtonGotoMovie.setText("Goto Page");
        jButtonGotoMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGotoMovieActionPerformed(evt);
            }
        });

        jLabelMovName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelMovName.setText("Sample Movie Name");

        jLabelMovCast.setText("aaaaaa, sssssss, ddd");

        jLabelMovProducer.setText("zzzzzzzzzz");

        jLabel1.setText("Cast:");

        jLabel2.setText("Producer: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMovCast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGotoMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMovName)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelMovProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(130, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelMovName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGotoMovie)
                    .addComponent(jLabelMovCast)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMovProducer)
                    .addComponent(jLabel2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelMovPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMovPoster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGotoMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGotoMovieActionPerformed
//        .getParent().getParent().removeAll();
        System.out.println(this.getParent());
        System.out.println(this.getParent().getParent());
        System.out.println(this.getParent().getParent().getParent());
        System.out.println(this.getParent().getParent().getParent().getParent());   //homePage
        System.out.println(this.getParent().getParent().getParent().getParent().getParent());   //MovieLibPanel
        System.out.println(this.getParent().getParent().getParent().getParent().getParent().getParent());
        System.out.println(this.getParent().getParent().getParent().getParent().getParent().getParent().getParent());

        if (this.getParent().getParent().getParent().getParent() instanceof HomePagePanel) {
            this.getParent().getParent().getParent().getParent().setVisible(false);
            this.getParent().getParent().getParent().getParent().getParent().add(new MoviePagePanel1());
            this.getParent().getParent().getParent().getParent().getParent().validate();
        } else if(this.getParent().getParent().getParent().getParent().getParent() instanceof MovieLibPanel) {
            this.getParent().getParent().getParent().getParent().getParent().setVisible(false);
            this.getParent().getParent().getParent().getParent().getParent().getParent().add(new MoviePagePanel1());
            this.getParent().getParent().getParent().getParent().getParent().getParent().validate();
        }
        
        
    }//GEN-LAST:event_jButtonGotoMovieActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGotoMovie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMovCast;
    private javax.swing.JLabel jLabelMovName;
    private javax.swing.JLabel jLabelMovPoster;
    private javax.swing.JLabel jLabelMovProducer;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void generateFields() {
        jLabelMovName.setText(movie.getMovieName());
        jLabelMovCast.setText(movie.getCast());
        jLabelMovCast.setText(movie.getProducer());
    }

    private void generatePoster() {
//        jLabelMovPoster.removeAll();
        try {
//                BufferedImage bufImg = ImageIO.read(new File(movie.getMoviePoster()));
//                
//                ImageIcon icon = new ImageIcon(bufImg);
//                Image img = icon.getImage();
//                
//                Image newImg = img.getScaledInstance(jLabelMovPoster.getWidth(),
//                        jLabelMovPoster.getHeight(), Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(movie.getMoviePoster());
//                Image scaledImg = icon.getImage().getScaledInstance(jLabelMovPoster.getWidth(),
//                        jLabelMovPoster.getHeight(), Image.SCALE_SMOOTH);
//                ImageIcon scaledIcon = new ImageIcon(scaledImg);
                
                jLabelMovPoster.removeAll();
                jLabelMovPoster.setIcon(icon);
                jLabelMovPoster.revalidate();
                jLabelMovPoster.repaint();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }
}
