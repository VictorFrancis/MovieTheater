package Panels.MovieLibraryPackage;

import MainClasses.MoviePackage.Movie;
import MainClasses.MoviePackage.MovieLibrary;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class MovieLibPanel extends javax.swing.JPanel {

    MovieLibrary movieLibrary;
    ArrayList<Movie> currentList;
    
    public MovieLibPanel() {
        initComponents();
        
//        movieLibrary = new MovieLibrary();
//        CurrentList = movieLibrary.getCurrentlyScreeningList();
        
        for (int i = 0; i < 10; i++) {
            jPanelChildOfScroll.add(new MiniMoviePanel());
        }
        jPanelChildOfScroll.revalidate();
        jPanelChildOfScroll.repaint();
        
        
    }
    
    public MovieLibPanel(MovieLibrary lib) {
        initComponents();
        
        this.movieLibrary = lib;
        currentList = movieLibrary.getCurrentlyScreeningList();
        
        updateCurrentList();
        
    }

    public MovieLibPanel(MovieLibrary movieLib, int i) {
        switch(i){
            case 0:
                currentList = movieLibrary.getCurrentlyScreeningList();
                break;
            case 1:
                currentList = movieLibrary.getUpcomingList();
                break;
            case 2:
                currentList = movieLibrary.getScreenHistoryList();
                break;
            default:
//                System.out.println("Not allowed!");
                currentList = movieLibrary.getCurrentlyScreeningList();
        }
        jComboBoxSelectLibrary.setSelectedIndex(i);
        updateCurrentList();
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxSelectLibrary = new javax.swing.JComboBox<>();
        jButtonLoadLib = new javax.swing.JButton();
        jPanelParentOfScroll = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelChildOfScroll = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movie Library", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jComboBoxSelectLibrary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Currently Screening", "Upcoming", "Screen History" }));

        jButtonLoadLib.setText("Load Library of");
        jButtonLoadLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadLibActionPerformed(evt);
            }
        });

        jPanelParentOfScroll.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane1.setBackground(new java.awt.Color(0, 51, 255));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(600, 480));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(600, 480));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 480));

        jPanelChildOfScroll.setBackground(new java.awt.Color(255, 51, 0));
        jPanelChildOfScroll.setLayout(new java.awt.GridLayout(15, 1, 1, 1));
        jScrollPane1.setViewportView(jPanelChildOfScroll);

        jPanelParentOfScroll.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelParentOfScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonLoadLib, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxSelectLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLoadLib)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jComboBoxSelectLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jPanelParentOfScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoadLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadLibActionPerformed

        int selectedIndex = jComboBoxSelectLibrary.getSelectedIndex();
        switch(selectedIndex){
            case 0:
                currentList = movieLibrary.getCurrentlyScreeningList();
                break;
            case 1:
                currentList = movieLibrary.getUpcomingList();
                break;
            case 2:
                currentList = movieLibrary.getScreenHistoryList();
                break;
            default:
                System.out.println("Not allowed!");
        }
        
        updateCurrentList();
        
    }//GEN-LAST:event_jButtonLoadLibActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLoadLib;
    private javax.swing.JComboBox<String> jComboBoxSelectLibrary;
    private javax.swing.JPanel jPanelChildOfScroll;
    private javax.swing.JPanel jPanelParentOfScroll;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void updateCurrentList() {
        jPanelChildOfScroll.removeAll();
        for (int i = 0; i < currentList.size(); i++) {
            jPanelChildOfScroll.add(new MiniMoviePanel(currentList.get(i)));
        }
        jPanelChildOfScroll.revalidate();
        jPanelChildOfScroll.repaint();
    }
}
