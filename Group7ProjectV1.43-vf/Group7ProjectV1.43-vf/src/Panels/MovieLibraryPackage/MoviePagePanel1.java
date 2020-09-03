package Panels.MovieLibraryPackage;

import DEMOPack.DemoFrame;
import MainClasses.MoviePackage.Movie;
import Panels.PaymentPackage.PaymentPanel1;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MoviePagePanel1 extends javax.swing.JPanel {

    Movie movie;
    
    public MoviePagePanel1() {
        initComponents();
        
    }
    
    public MoviePagePanel1(Movie mov) {
        initComponents();
        this.movie = mov;
        boolean available = movie.isAvailableNow();
        
        jPanelBooking.setVisible(available);
        initBasicComponents(available);
        initOtherComponents(available);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelmovPoster = new javax.swing.JLabel();
        jLabelMovName = new javax.swing.JLabel();
        jLabelSubtitiles = new javax.swing.JLabel();
        jPanelBooking = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonBuyTicket = new javax.swing.JButton();
        jComboBoxSelectShowtime = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jSpinnerTicketAmount = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonStandard = new javax.swing.JRadioButton();
        jRadioButtonPremium = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxDateForBooking = new javax.swing.JComboBox<>();
        jRadioButtonEconomy = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelMovDirectors = new javax.swing.JLabel();
        jLabelMovProducers = new javax.swing.JLabel();
        jLabelMovCast = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabelGenre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelDuration = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelmovPoster.setText("                          Movie Poster");
        jLabelmovPoster.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelMovName.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelMovName.setText("Movie Name");
        jLabelMovName.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelSubtitiles.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSubtitiles.setText("Subtitles");
        jLabelSubtitiles.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Theatre", "Timing", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonBuyTicket.setText("Buy Tickets");
        jButtonBuyTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuyTicketActionPerformed(evt);
            }
        });

        jComboBoxSelectShowtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Showtime 1 - Theatre A - 14:00 to 16:00", "Showtime 2", "Showtime 3", "Showtime 4" }));
        jComboBoxSelectShowtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectShowtimeActionPerformed(evt);
            }
        });

        jLabel9.setText("Number of Tickets");

        jLabel10.setText("Select ShowTime");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Show Time");

        jRadioButtonStandard.setText("Standard - 600tk");
        jRadioButtonStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonStandardActionPerformed(evt);
            }
        });

        jRadioButtonPremium.setText("Premium - 900tk");

        jLabel11.setText("Theatre Class");

        jLabel15.setText("Select Date (Booking available for next 7 days):");

        jComboBoxDateForBooking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Date of)Today", "Tomorrow", "Day after tomorrow" }));

        jRadioButtonEconomy.setText("Economy - 400tk");
        jRadioButtonEconomy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEconomyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBookingLayout = new javax.swing.GroupLayout(jPanelBooking);
        jPanelBooking.setLayout(jPanelBookingLayout);
        jPanelBookingLayout.setHorizontalGroup(
            jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBookingLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelBookingLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSpinnerTicketAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBuyTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelBookingLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(26, 26, 26)
                            .addComponent(jComboBoxSelectShowtime, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelBookingLayout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169))
                            .addGroup(jPanelBookingLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxDateForBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))))
                .addGap(27, 27, 27))
            .addGroup(jPanelBookingLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonPremium)
                    .addComponent(jRadioButtonStandard)
                    .addComponent(jRadioButtonEconomy))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelBookingLayout.setVerticalGroup(
            jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBookingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBoxDateForBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBookingLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBookingLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonPremium)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonStandard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonEconomy)))
                .addGap(18, 18, 18)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSelectShowtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerTicketAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuyTicket))
                .addGap(14, 14, 14))
        );

        jLabel6.setText("Director(s) :");

        jLabel7.setText("Producer(s) :");

        jLabel8.setText("Cast :");

        jLabelMovDirectors.setBackground(new java.awt.Color(51, 0, 0));
        jLabelMovDirectors.setText("aaaaaaaaaaaa");

        jLabelMovProducers.setBackground(new java.awt.Color(51, 0, 0));
        jLabelMovProducers.setText("bbbbbbb cccccccccc");

        jLabelMovCast.setBackground(new java.awt.Color(51, 0, 0));
        jLabelMovCast.setText("yyyyy, qqqqqqqq, iiiiii");

        jTextAreaDescription.setEditable(false);
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescription);

        jLabel1.setText("Genre(s): ");

        jLabelGenre.setText("...");

        jLabel2.setText("Movie Duration: ");

        jLabelDuration.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabelMovName, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelmovPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                            .addComponent(jLabelSubtitiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabelMovDirectors, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(jLabelMovProducers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelMovCast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addComponent(jLabelGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMovName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelmovPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSubtitiles, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMovDirectors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMovProducers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMovCast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelGenre)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDuration))
                    .addComponent(jPanelBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSelectShowtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectShowtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSelectShowtimeActionPerformed

    private void jRadioButtonStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonStandardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonStandardActionPerformed

    private void jRadioButtonEconomyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEconomyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonEconomyActionPerformed

    private void jButtonBuyTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuyTicketActionPerformed
        int ticketAmount = (int) jSpinnerTicketAmount.getValue();
        
        if(ticketAmount > 0 && ticketsCountAvailable(ticketAmount)){
            this.setVisible(false);
            this.getParent().add(new PaymentPanel1());
            this.getParent().validate();
        } else{
            JOptionPane.showMessageDialog(jPanelBooking, "Invalid ticket amount.");
        }
        
    }//GEN-LAST:event_jButtonBuyTicketActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuyTicket;
    private javax.swing.JComboBox<String> jComboBoxDateForBooking;
    private javax.swing.JComboBox<String> jComboBoxSelectShowtime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDuration;
    private javax.swing.JLabel jLabelGenre;
    private javax.swing.JLabel jLabelMovCast;
    private javax.swing.JLabel jLabelMovDirectors;
    private javax.swing.JLabel jLabelMovName;
    private javax.swing.JLabel jLabelMovProducers;
    private javax.swing.JLabel jLabelSubtitiles;
    private javax.swing.JLabel jLabelmovPoster;
    private javax.swing.JPanel jPanelBooking;
    private javax.swing.JRadioButton jRadioButtonEconomy;
    private javax.swing.JRadioButton jRadioButtonPremium;
    private javax.swing.JRadioButton jRadioButtonStandard;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerTicketAmount;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaDescription;
    // End of variables declaration//GEN-END:variables

    private void initBasicComponents(boolean isAvailable) {
        
        setMoviePoster();
        jLabelSubtitiles.setText(movie.getSubtitles());
        jLabelMovCast.setText(movie.getCast());
        jLabelMovDirectors.setText(movie.getDirectors());
        jLabelMovProducers.setText(movie.getProducer());
        jTextAreaDescription.setText(movie.getDescription());

        if (isAvailable) {
            jLabelMovName.setText(movie.getMovieName());
        } else {
            jLabelMovName.setText(movie.getMovieName() + " (Coming Soon!)");
        }
    }

    private void initOtherComponents(boolean available) {
        
    }

    private void setMoviePoster() {
        jLabelmovPoster.removeAll();
        try {
            BufferedImage bufImg = ImageIO.read(new File(movie.getMoviePoster()));

            ImageIcon icon = new ImageIcon(bufImg);
            Image img = icon.getImage();

            Image newImg = img.getScaledInstance(jLabelmovPoster.getWidth(), jLabelmovPoster.getHeight(), Image.SCALE_SMOOTH);
            
            jLabelmovPoster.removeAll();
            jLabelmovPoster.setIcon(new ImageIcon(newImg));                
            jLabelmovPoster.revalidate();
            jLabelmovPoster.repaint();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean ticketsCountAvailable(int ticketAmount) {
        //check seat availability from theatre in selected screening
        return true;
    }
}
