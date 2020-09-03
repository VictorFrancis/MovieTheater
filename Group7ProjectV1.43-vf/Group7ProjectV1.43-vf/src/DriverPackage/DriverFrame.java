package DriverPackage;

import MainClasses.MoviePackage.Movie;
import MainClasses.MoviePackage.MovieLibrary;
import MainClasses.UserPackage.Employee;
import MainClasses.UserPackage.Management;
import Panels.MovieLibraryPackage.MoviePagePanel1;
import DEMOPack.MovieLibraryPanel;
import Panels.PaymentPackage.PaymentPanel1;
import Panels.MovieLibraryPackage.MovieLibPanel;
import Panels.ReportPackage.ReportGeneratorPanel;
import MainClasses.UserPackage.User;
import MainClasses.UserPackage.Viewer;
import Panels.*;
import Panels.EmployeePackage.AddMoviePanel;
import Panels.EmployeePackage.ManageJobApplicants;
import Panels.EmployeePackage.UpdateMovieDataPanel;
import Panels.EmployeePackage.UpdateRecruitmentPositionsPanel;
import Panels.HomePagePanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class DriverFrame extends javax.swing.JFrame {
    
    private GridBagLayout layout;
    GridBagConstraints c;
    User user;
    MovieLibrary movieLib;
    
    ArrayList<Viewer> viewers;
    ArrayList<Employee> employees;
    
    ArrayList<Movie> currentList;
    
    public DriverFrame() {
        initComponents();
        
        layout = new GridBagLayout();
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        jPanelDynamicPanel.setLayout(layout);
        user = null;
        
//        user = new Viewer();
//        user = new Management();
        
        updateCurrentlyScreeningList();
//        jPanelDynamicPanel.add(new HomePagePanel(currentList), c);
        
        jPanelDynamicPanel.add(new HomePagePanel(), c);

//        updateUserTypeAccess();
//        movieLib = loadMovieLibrary();
//        viewers = loadViewerList();
//        employees = loadEmployeeList();
        
//        jPanelDynamicPanel.add(new LoginPanel1(), c);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDynamicPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuNavigate = new javax.swing.JMenu();
        jMenuItemHome = new javax.swing.JMenuItem();
        jMenuItemBuyTickets = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuUser = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuItemLogout = new javax.swing.JMenuItem();
        jMenuItemRegister = new javax.swing.JMenuItem();
        jMenuMovies = new javax.swing.JMenu();
        jMenuItemCurrentlyScreening = new javax.swing.JMenuItem();
        jMenuItemUpcomingMovies = new javax.swing.JMenuItem();
        jMenuItemAllMovies = new javax.swing.JMenuItem();
        jMenuSinema = new javax.swing.JMenu();
        jMenuItemRecruitment = new javax.swing.JMenuItem();
        jMenuItemAboutCineplex = new javax.swing.JMenuItem();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuItemAddNewMovie = new javax.swing.JMenuItem();
        jMenuItemUpdateMovieInfo = new javax.swing.JMenuItem();
        jMenuItemUpdateJobPositions = new javax.swing.JMenuItem();
        jMenuItemManageREcruitmentForms = new javax.swing.JMenuItem();
        jMenuItemReports = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sineplex");
        setMinimumSize(new java.awt.Dimension(800, 700));

        javax.swing.GroupLayout jPanelDynamicPanelLayout = new javax.swing.GroupLayout(jPanelDynamicPanel);
        jPanelDynamicPanel.setLayout(jPanelDynamicPanelLayout);
        jPanelDynamicPanelLayout.setHorizontalGroup(
            jPanelDynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanelDynamicPanelLayout.setVerticalGroup(
            jPanelDynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );

        jMenuNavigate.setText("Navigate");

        jMenuItemHome.setText("Home");
        jMenuItemHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHomeActionPerformed(evt);
            }
        });
        jMenuNavigate.add(jMenuItemHome);

        jMenuItemBuyTickets.setText("Buy Movie Tickets");
        jMenuItemBuyTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuyTicketsActionPerformed(evt);
            }
        });
        jMenuNavigate.add(jMenuItemBuyTickets);

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuNavigate.add(jMenuItemExit);

        jMenuBar1.add(jMenuNavigate);

        jMenuUser.setText("User");

        jMenuItemLogin.setText("Login");
        jMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoginActionPerformed(evt);
            }
        });
        jMenuUser.add(jMenuItemLogin);

        jMenuItemLogout.setText("Logout");
        jMenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogoutActionPerformed(evt);
            }
        });
        jMenuUser.add(jMenuItemLogout);

        jMenuItemRegister.setText("Register");
        jMenuItemRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegisterActionPerformed(evt);
            }
        });
        jMenuUser.add(jMenuItemRegister);

        jMenuBar1.add(jMenuUser);

        jMenuMovies.setText("Movies");

        jMenuItemCurrentlyScreening.setText("Currently Showing Movies");
        jMenuItemCurrentlyScreening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCurrentlyScreeningActionPerformed(evt);
            }
        });
        jMenuMovies.add(jMenuItemCurrentlyScreening);

        jMenuItemUpcomingMovies.setText("Upcoming Movies");
        jMenuItemUpcomingMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUpcomingMoviesActionPerformed(evt);
            }
        });
        jMenuMovies.add(jMenuItemUpcomingMovies);

        jMenuItemAllMovies.setText("Screen History");
        jMenuItemAllMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAllMoviesActionPerformed(evt);
            }
        });
        jMenuMovies.add(jMenuItemAllMovies);

        jMenuBar1.add(jMenuMovies);

        jMenuSinema.setText("Tools");

        jMenuItemRecruitment.setText("Work at Sineplex");
        jMenuItemRecruitment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRecruitmentActionPerformed(evt);
            }
        });
        jMenuSinema.add(jMenuItemRecruitment);

        jMenuItemAboutCineplex.setText("About Sineplex");
        jMenuItemAboutCineplex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutCineplexActionPerformed(evt);
            }
        });
        jMenuSinema.add(jMenuItemAboutCineplex);

        jMenuBar1.add(jMenuSinema);

        jMenuAdmin.setText("Admin");

        jMenuItemAddNewMovie.setText("Add New Movie");
        jMenuItemAddNewMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddNewMovieActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemAddNewMovie);

        jMenuItemUpdateMovieInfo.setText("Update Movie Info");
        jMenuItemUpdateMovieInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUpdateMovieInfoActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemUpdateMovieInfo);

        jMenuItemUpdateJobPositions.setText("Update open Job positions");
        jMenuItemUpdateJobPositions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUpdateJobPositionsActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemUpdateJobPositions);

        jMenuItemManageREcruitmentForms.setText("Manage Recruitment forms");
        jMenuItemManageREcruitmentForms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManageREcruitmentFormsActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemManageREcruitmentForms);

        jMenuItemReports.setText("Reports");
        jMenuItemReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReportsActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemReports);

        jMenuBar1.add(jMenuAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemBuyTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuyTicketsActionPerformed
        
        jPanelDynamicPanel.removeAll();
        jPanelDynamicPanel.add(new MovieLibPanel(), c);
        jPanelDynamicPanel.revalidate();
        jPanelDynamicPanel.repaint();
    }//GEN-LAST:event_jMenuItemBuyTicketsActionPerformed

    private void jMenuItemHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHomeActionPerformed

        jPanelDynamicPanel.removeAll();
        jPanelDynamicPanel.add(new HomePagePanel(), c);
        jPanelDynamicPanel.revalidate();
        jPanelDynamicPanel.repaint();
        
    }//GEN-LAST:event_jMenuItemHomeActionPerformed

    private void jMenuItemRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegisterActionPerformed
        
        if(!(user instanceof User)){
            jPanelDynamicPanel.removeAll();
            jPanelDynamicPanel.add(new RegistrationPanel1(), c);
            jPanelDynamicPanel.revalidate();
            jPanelDynamicPanel.repaint();
        } else{
            JOptionPane.showMessageDialog(rootPane, "You are already a registered user.");
        }
        
        
    }//GEN-LAST:event_jMenuItemRegisterActionPerformed

    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoginActionPerformed
        
        if(!(user instanceof User)){
            jPanelDynamicPanel.removeAll();
            jPanelDynamicPanel.add(new LoginPanel1(), c);
            jPanelDynamicPanel.revalidate();
            jPanelDynamicPanel.repaint();
        } else{
            JOptionPane.showMessageDialog(rootPane, "You are already logged in.");
        }
        
    }//GEN-LAST:event_jMenuItemLoginActionPerformed

    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed
        if(user == null){
            JOptionPane.showMessageDialog(rootPane, "You are not logged in.");
        }else{
            int res = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to logout?");
            if(res == JOptionPane.YES_OPTION){
                user = null;
                JOptionPane.showMessageDialog(rootPane, "Successfully logged out.");
            }
        }
        
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit?"
                 , "Exit", JOptionPane.YES_NO_OPTION);
        if(res == JOptionPane.YES_OPTION)
            System.exit(0);
        
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemCurrentlyScreeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCurrentlyScreeningActionPerformed
        jPanelDynamicPanel.removeAll();
        jPanelDynamicPanel.add(new MovieLibPanel(), c);
        jPanelDynamicPanel.revalidate();
        jPanelDynamicPanel.repaint();
        
//        jPanelDynamicPanel.removeAll();
//        jPanelDynamicPanel.add(new MovieLibPanel(movieLib, 0), c);
//        jPanelDynamicPanel.revalidate();
//        jPanelDynamicPanel.repaint();
        
    }//GEN-LAST:event_jMenuItemCurrentlyScreeningActionPerformed

    private void jMenuItemUpcomingMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUpcomingMoviesActionPerformed
        jPanelDynamicPanel.removeAll();
        jPanelDynamicPanel.add(new MovieLibPanel(), c);
        jPanelDynamicPanel.revalidate();
        jPanelDynamicPanel.repaint();

//        jPanelDynamicPanel.removeAll();
//        jPanelDynamicPanel.add(new MovieLibPanel(movieLib, 1), c);
//        jPanelDynamicPanel.revalidate();
//        jPanelDynamicPanel.repaint();
    }//GEN-LAST:event_jMenuItemUpcomingMoviesActionPerformed

    private void jMenuItemAllMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAllMoviesActionPerformed
        jPanelDynamicPanel.removeAll();
        jPanelDynamicPanel.add(new MovieLibPanel(), c);
        jPanelDynamicPanel.revalidate();
        jPanelDynamicPanel.repaint();

//        jPanelDynamicPanel.removeAll();
//        jPanelDynamicPanel.add(new MovieLibPanel(movieLib, 2), c);
//        jPanelDynamicPanel.revalidate();
//        jPanelDynamicPanel.repaint();
    }//GEN-LAST:event_jMenuItemAllMoviesActionPerformed

    private void jMenuItemReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReportsActionPerformed
        jPanelDynamicPanel.removeAll();
        jPanelDynamicPanel.add(new ReportGeneratorPanel(), c);
        jPanelDynamicPanel.revalidate();
        jPanelDynamicPanel.repaint();
    }//GEN-LAST:event_jMenuItemReportsActionPerformed

    private void jMenuItemRecruitmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRecruitmentActionPerformed
        jPanelDynamicPanel.removeAll();
        jPanelDynamicPanel.add(new RecruitmentFormPanel(), c);
        jPanelDynamicPanel.revalidate();
        jPanelDynamicPanel.repaint();
    }//GEN-LAST:event_jMenuItemRecruitmentActionPerformed

    private void jMenuItemAddNewMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddNewMovieActionPerformed
        jPanelDynamicPanel.removeAll();
        jPanelDynamicPanel.add(new AddMoviePanel(), c);
        jPanelDynamicPanel.revalidate();
        jPanelDynamicPanel.repaint();
    }//GEN-LAST:event_jMenuItemAddNewMovieActionPerformed

    private void jMenuItemAboutCineplexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutCineplexActionPerformed
        // TODO add your handling code here:
        jPanelDynamicPanel.removeAll();
        jPanelDynamicPanel.add(new AboutSineplexPanel(), c);
        jPanelDynamicPanel.revalidate();
        jPanelDynamicPanel.repaint();
    }//GEN-LAST:event_jMenuItemAboutCineplexActionPerformed

    private void jMenuItemUpdateMovieInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUpdateMovieInfoActionPerformed
        jPanelDynamicPanel.removeAll();
        jPanelDynamicPanel.add(new UpdateMovieDataPanel(), c);
        jPanelDynamicPanel.revalidate();
        jPanelDynamicPanel.repaint();
    }//GEN-LAST:event_jMenuItemUpdateMovieInfoActionPerformed

    private void jMenuItemManageREcruitmentFormsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManageREcruitmentFormsActionPerformed
        // TODO add your handling code here:
        jPanelDynamicPanel.removeAll();
        jPanelDynamicPanel.add(new ManageJobApplicants(), c);
        jPanelDynamicPanel.revalidate();
        jPanelDynamicPanel.repaint();
        
    }//GEN-LAST:event_jMenuItemManageREcruitmentFormsActionPerformed

    private void jMenuItemUpdateJobPositionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUpdateJobPositionsActionPerformed
        // TODO add your handling code here:
        jPanelDynamicPanel.removeAll();
        jPanelDynamicPanel.add(new UpdateRecruitmentPositionsPanel(), c);
        jPanelDynamicPanel.revalidate();
        jPanelDynamicPanel.repaint();
    }//GEN-LAST:event_jMenuItemUpdateJobPositionsActionPerformed

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
            java.util.logging.Logger.getLogger(DriverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAboutCineplex;
    private javax.swing.JMenuItem jMenuItemAddNewMovie;
    private javax.swing.JMenuItem jMenuItemAllMovies;
    private javax.swing.JMenuItem jMenuItemBuyTickets;
    private javax.swing.JMenuItem jMenuItemCurrentlyScreening;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemHome;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemManageREcruitmentForms;
    private javax.swing.JMenuItem jMenuItemRecruitment;
    private javax.swing.JMenuItem jMenuItemRegister;
    private javax.swing.JMenuItem jMenuItemReports;
    private javax.swing.JMenuItem jMenuItemUpcomingMovies;
    private javax.swing.JMenuItem jMenuItemUpdateJobPositions;
    private javax.swing.JMenuItem jMenuItemUpdateMovieInfo;
    private javax.swing.JMenu jMenuMovies;
    private javax.swing.JMenu jMenuNavigate;
    private javax.swing.JMenu jMenuSinema;
    private javax.swing.JMenu jMenuUser;
    private javax.swing.JPanel jPanelDynamicPanel;
    // End of variables declaration//GEN-END:variables

//    private MovieLibrary loadMovieLibrary() {
//        
//        ArrayList<Movie> currentlyScr = getCurrentlyScreeningList();
////        ArrayList<Movie> upcoming = getUpcomingList();
////        ArrayList<Movie> screenHistory = getScreenHistoryList();
//        
//        return new MovieLibrary();
//        
//    }

    public User getCurrentUser() {
        return this.user;
    }
    public void setUser(User user){
        this.user = user;
    }

    private ArrayList<Viewer> loadViewerList() {
        
        ArrayList<Viewer> list = new ArrayList<>();
        
        try(ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("File Database\\Users\\Viewer.bin"))) {

            Viewer v;
            while(in.available() > 0){
                v = (Viewer) in.readObject();
                list.add(v);
            }
        }catch(EOFException e){
        }catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        
    }

    private ArrayList<Employee> loadEmployeeList() {
        
        ArrayList<Employee> list = new ArrayList<>();
        
        try(ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("File Database\\Users\\Viewer.bin"))) {

            Employee e;
            while(in.available() > 0){
                e = (Employee) in.readObject();
                list.add(e);
            }
        }catch(EOFException e){
        }catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    private void updateCurrentlyScreeningList() {
        
        
        
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>(){
            
            ArrayList<Movie> list = new ArrayList<>();
            
            @Override
            protected Void doInBackground() throws Exception {
                
                try(ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("File Database\\Movie Library\\CurrentlyScreening.bin"))) {

                    Movie mov;
                    while(true){        //why does in.available() > 0 , not work? no time to answer now :/
                        mov = (Movie) in.readObject();
                        list.add(mov);
                    }
                }catch(EOFException e){
                }catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void done() {
                currentList = this.list;
            }
            
        };
        worker.execute();
    }

    private ArrayList<Movie> getScreenHistoryList() {
        ArrayList<Movie> list = new ArrayList<>();
        
//        SwingWorker<ArrayList<Movie>, Void> worker = new SwingWorker<ArrayList<Movie>, Void>(){
//            @Override
//            protected ArrayList<Movie> doInBackground() throws Exception {
//                return null;
//            }
//            
//        };
//        worker.execute();
        
        try(ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("File Database\\Movie Library\\ScreenHistory.bin"))) {

            Movie mov;
            while(true){
                mov = (Movie) in.readObject();
                list.add(mov);
            }

        }catch(EOFException e){
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    private ArrayList<Movie> getUpcomingList() {
        ArrayList<Movie> list = new ArrayList<>();
        
//        SwingWorker<ArrayList<Movie>, Void> worker = new SwingWorker<ArrayList<Movie>, Void>(){
//            @Override
//            protected ArrayList<Movie> doInBackground() throws Exception {
//                
//                
//                return null;
//            }
//            
//        };
//        worker.execute();

        try(ObjectInputStream in = new ObjectInputStream(
                        new FileInputStream("File Database\\Movie Library\\UpcomingMovies.bin"))) {
                    
            Movie mov;
            while(true){
                mov = (Movie) in.readObject();
                list.add(mov);
            }

        }catch(EOFException e){
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    private void updateUserTypeAccess() {
        if(user instanceof Viewer || user == null){
            jMenuAdmin.setVisible(false);
        }
    }
    
}

abstract class MyWorker extends SwingWorker<Boolean, Void>{
    
    SwingWorker<Boolean, Void> worker = new SwingWorker<Boolean, Void>(){
        @Override
        protected Boolean doInBackground() throws Exception {
            //work to do
            return null;
        }

    };
    
}