/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Steve
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        blockItems();
        showUserType();
        
    }

    public static void showLogIn(){
        
        LogInView oLogInView = new LogInView();
        oLogInView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        oLogInView.setLocationRelativeTo(null);
        oLogInView.setVisible(true);
    
    }
    
    public static void showCreateAccount(){
        
        CreateClientAccountView oCreateAccount = new CreateClientAccountView();
        oCreateAccount.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        oCreateAccount.setLocationRelativeTo(null);
        oCreateAccount.setVisible(true);
    
    }
    
    public static void showUserView(){
        
        UserView oUserView = new UserView();
        oUserView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        oUserView.setLocationRelativeTo(null);
        oUserView.setVisible(true);
    
    }
    
    public static void showCreateHotel(){
        
        CreateHotel oCreateHotel = new CreateHotel();
        oCreateHotel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        oCreateHotel.setLocationRelativeTo(null);
        oCreateHotel.setVisible(true);
    
    }
    
    public void blockItems(){
        
        roomAmountTextField.setEditable(false);
        adultAmountTextField.setEditable(false);
        childremAmountTextField.setEditable(false);
        searchButton.setEnabled(false);
        seeHotelButton.setEnabled(false);
        selectHotelButton.setEnabled(false);
        
        userProfileViewMenu.setEnabled(false);
        modifyUserMenu.setEnabled(false);
        createHotelMenu.setEnabled(false);
        
        entryDateLabel.setText("HN Hotels");
        exitDateLabel.setText("HN Hotels");
        roomAmountLabel.setText("HN Hotels");
        adultAmountjLabel.setText("HN Hotels");
        childremAmountjLabel.setText("HN Hotels");
        
    }
    
    public void enableItems(){
        
        roomAmountTextField.setEditable(true);
        adultAmountTextField.setEditable(true);
        childremAmountTextField.setEditable(true);
        searchButton.setEnabled(true);
        seeHotelButton.setEnabled(true);
        selectHotelButton.setEnabled(true);
        
        entryDateLabel.setText("Entry Date");
        exitDateLabel.setText("Exit Date");
        roomAmountLabel.setText("Room Amount");
        adultAmountjLabel.setText("Adult Amount");
        childremAmountjLabel.setText("Children Amount");
        
    }
    
    public void cleanTextFields() {

        adultAmountTextField.setText("");
        childremAmountTextField.setText("");
        
    }
       
    public void showUserType(){
        
        ImageIcon userNormal = new ImageIcon(getClass().getResource("../images/normalUser.png"));
        Icon iconUserNormal = new ImageIcon(userNormal.getImage().getScaledInstance(userTypeMenu.getWidth(), userTypeMenu.getHeight(), Image.SCALE_DEFAULT));
        
        ImageIcon userAdmin = new ImageIcon(getClass().getResource("../images/adminUser.png"));
        Icon iconUserAdmin = new ImageIcon(userAdmin.getImage().getScaledInstance(userTypeMenu.getWidth(), userTypeMenu.getHeight(), Image.SCALE_DEFAULT));
        
        
        userTypeMenu.setIcon(iconUserNormal);
        
//        userTypeMenu.setIcon(iconUserAdmin);
   
    }
    
    
    
    
    
    public void searchHotels(){
        
        if (roomAmountTextField.getText().equals("")){
            
            JOptionPane.showMessageDialog(this, "You must define an amount of rooms to search hotels",
                    "Problem creating user account", JOptionPane.ERROR_MESSAGE);
            this.roomAmountTextField.requestFocus();
            return;
            
        }
        
        if (adultAmountTextField.getText().equals("")){
            
            JOptionPane.showMessageDialog(this, "You must define an amount of adults to search hotels",
                    "Problem creating user account", JOptionPane.ERROR_MESSAGE);
            this.adultAmountTextField.requestFocus();
            return;
            
        }
        
        if (childremAmountTextField.getText().equals("")){
            
            JOptionPane.showMessageDialog(this, "You must define an amount of childrem to search hotels",
                    "Problem creating user account", JOptionPane.ERROR_MESSAGE);
            this.childremAmountTextField.requestFocus();
            return;
            
        }
        
        
        
        
        
        
    }

                
    
    
    
    

    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        entryDateLabel = new javax.swing.JLabel();
        exitDateLabel = new javax.swing.JLabel();
        roomAmountLabel = new javax.swing.JLabel();
        adultAmountjLabel = new javax.swing.JLabel();
        childremAmountjLabel = new javax.swing.JLabel();
        roomAmountTextField = new javax.swing.JTextField();
        adultAmountTextField = new javax.swing.JTextField();
        childremAmountTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        cal_entrydate = new com.toedter.calendar.JDateChooser();
        cal_exitdate = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        seeHotelButton = new javax.swing.JButton();
        selectHotelButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        searchMenu = new javax.swing.JMenu();
        searchHotelMenuItem = new javax.swing.JMenuItem();
        logInMenu = new javax.swing.JMenu();
        logInMenuItem = new javax.swing.JMenuItem();
        createAccountMenu = new javax.swing.JMenu();
        createUserAccountMenuItem = new javax.swing.JMenuItem();
        userProfileViewMenu = new javax.swing.JMenu();
        userProfileMenuItem = new javax.swing.JMenuItem();
        modifyUserMenu = new javax.swing.JMenu();
        editUserMenuItem = new javax.swing.JMenuItem();
        createHotelMenu = new javax.swing.JMenu();
        createHotelMenuItem = new javax.swing.JMenuItem();
        userTypeMenu = new javax.swing.JMenu();
        userActiveInactiveMenu = new javax.swing.JMenu();
        closeMenu = new javax.swing.JMenu();
        closeProgramMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));

        entryDateLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        entryDateLabel.setText("Entry Date");

        exitDateLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        exitDateLabel.setText("Exit Date");

        roomAmountLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        roomAmountLabel.setText("Room Amount");

        adultAmountjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        adultAmountjLabel.setText("Adult Amount");

        childremAmountjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        childremAmountjLabel.setText("Children Amount");

        roomAmountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomAmountTextFieldActionPerformed(evt);
            }
        });
        roomAmountTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                roomAmountTextFieldKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                roomAmountTextFieldKeyPressed(evt);
            }
        });

        adultAmountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultAmountTextFieldActionPerformed(evt);
            }
        });
        adultAmountTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adultAmountTextFieldKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adultAmountTextFieldKeyPressed(evt);
            }
        });

        childremAmountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childremAmountTextFieldActionPerformed(evt);
            }
        });
        childremAmountTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                childremAmountTextFieldKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                childremAmountTextFieldKeyPressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchHotel.png"))); // NOI18N

        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        searchButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(exitDateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(entryDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(childremAmountTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roomAmountTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adultAmountTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roomAmountLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adultAmountjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(childremAmountjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addComponent(searchButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cal_entrydate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cal_exitdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entryDateLabel)
                .addGap(11, 11, 11)
                .addComponent(cal_entrydate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitDateLabel)
                .addGap(12, 12, 12)
                .addComponent(cal_exitdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roomAmountLabel)
                .addGap(18, 18, 18)
                .addComponent(roomAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adultAmountjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adultAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(childremAmountjLabel)
                .addGap(18, 18, 18)
                .addComponent(childremAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hotel Name", "Price Per Night", "Number of Stars", "Lodging Type"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchHotel.png"))); // NOI18N

        seeHotelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seeHotel.png"))); // NOI18N
        seeHotelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeHotelButtonActionPerformed(evt);
            }
        });

        selectHotelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selectHotel.png"))); // NOI18N
        selectHotelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectHotelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seeHotelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectHotelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(seeHotelButton)
                        .addGap(18, 18, 18)
                        .addComponent(selectHotelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        searchMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/serch.png"))); // NOI18N

        searchHotelMenuItem.setText("Search Hotel");
        searchHotelMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchHotelMenuItemActionPerformed(evt);
            }
        });
        searchMenu.add(searchHotelMenuItem);

        jMenuBar1.add(searchMenu);

        logInMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_login.png"))); // NOI18N

        logInMenuItem.setText("User Log-In");
        logInMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInMenuItemActionPerformed(evt);
            }
        });
        logInMenu.add(logInMenuItem);

        jMenuBar1.add(logInMenu);

        createAccountMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/create-an-account.png"))); // NOI18N

        createUserAccountMenuItem.setText("Create User Account");
        createUserAccountMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserAccountMenuItemActionPerformed(evt);
            }
        });
        createAccountMenu.add(createUserAccountMenuItem);

        jMenuBar1.add(createAccountMenu);

        userProfileViewMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N

        userProfileMenuItem.setText("User Profile");
        userProfileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userProfileMenuItemActionPerformed(evt);
            }
        });
        userProfileViewMenu.add(userProfileMenuItem);

        jMenuBar1.add(userProfileViewMenu);

        modifyUserMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UserEdit.png"))); // NOI18N

        editUserMenuItem.setText("Edit User");
        editUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserMenuItemActionPerformed(evt);
            }
        });
        modifyUserMenu.add(editUserMenuItem);

        jMenuBar1.add(modifyUserMenu);

        createHotelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/887169_home_512x512.png"))); // NOI18N

        createHotelMenuItem.setText("Create Hotel");
        createHotelMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createHotelMenuItemActionPerformed(evt);
            }
        });
        createHotelMenu.add(createHotelMenuItem);

        jMenuBar1.add(createHotelMenu);

        userTypeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normalUser.png"))); // NOI18N
        jMenuBar1.add(userTypeMenu);

        userActiveInactiveMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inactiveUser.png"))); // NOI18N
        jMenuBar1.add(userActiveInactiveMenu);

        closeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N

        closeProgramMenuItem.setText("Close the Program");
        closeProgramMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeProgramMenuItemActionPerformed(evt);
            }
        });
        closeMenu.add(closeProgramMenuItem);

        jMenuBar1.add(closeMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void searchHotelMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchHotelMenuItemActionPerformed
        
        enableItems();
        
    }//GEN-LAST:event_searchHotelMenuItemActionPerformed

    private void logInMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInMenuItemActionPerformed
        
        showLogIn();
        
    }//GEN-LAST:event_logInMenuItemActionPerformed

    private void editUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserMenuItemActionPerformed
        
        
        
    }//GEN-LAST:event_editUserMenuItemActionPerformed

    private void userProfileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userProfileMenuItemActionPerformed
        
        showUserView();
        
    }//GEN-LAST:event_userProfileMenuItemActionPerformed

    private void closeProgramMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProgramMenuItemActionPerformed
        
        
        
        
    }//GEN-LAST:event_closeProgramMenuItemActionPerformed

    private void createUserAccountMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserAccountMenuItemActionPerformed
        
        showCreateAccount();
        
    }//GEN-LAST:event_createUserAccountMenuItemActionPerformed

    private void createHotelMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createHotelMenuItemActionPerformed
        
//        if (){
//            
//            
//            
//        }
        
        
        showCreateHotel();
        
        
    }//GEN-LAST:event_createHotelMenuItemActionPerformed

    private void adultAmountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultAmountTextFieldActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_adultAmountTextFieldActionPerformed

    private void childremAmountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childremAmountTextFieldActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_childremAmountTextFieldActionPerformed

    private void seeHotelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeHotelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seeHotelButtonActionPerformed

    private void selectHotelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectHotelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectHotelButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        searchHotels();
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void roomAmountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomAmountTextFieldActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_roomAmountTextFieldActionPerformed

    private void roomAmountTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roomAmountTextFieldKeyTyped

        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
         
    }//GEN-LAST:event_roomAmountTextFieldKeyTyped

    private void adultAmountTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adultAmountTextFieldKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
        
    }//GEN-LAST:event_adultAmountTextFieldKeyTyped

    private void childremAmountTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_childremAmountTextFieldKeyTyped

        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
        
    }//GEN-LAST:event_childremAmountTextFieldKeyTyped

    private void roomAmountTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roomAmountTextFieldKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            this.adultAmountTextField.requestFocus();
            
        }
        
    }//GEN-LAST:event_roomAmountTextFieldKeyPressed

    private void adultAmountTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adultAmountTextFieldKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            this.childremAmountTextField.requestFocus();
            
        }
  
    }//GEN-LAST:event_adultAmountTextFieldKeyPressed

    private void childremAmountTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_childremAmountTextFieldKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            this.searchButton.requestFocus();
            
        }
  
    }//GEN-LAST:event_childremAmountTextFieldKeyPressed

    private void searchButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchButtonKeyPressed
        
        searchHotels();
        
        
        
        
        
    }//GEN-LAST:event_searchButtonKeyPressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adultAmountTextField;
    private javax.swing.JLabel adultAmountjLabel;
    private com.toedter.calendar.JDateChooser cal_entrydate;
    private com.toedter.calendar.JDateChooser cal_exitdate;
    private javax.swing.JTextField childremAmountTextField;
    private javax.swing.JLabel childremAmountjLabel;
    private javax.swing.JMenu closeMenu;
    private javax.swing.JMenuItem closeProgramMenuItem;
    private javax.swing.JMenu createAccountMenu;
    private javax.swing.JMenu createHotelMenu;
    private javax.swing.JMenuItem createHotelMenuItem;
    private javax.swing.JMenuItem createUserAccountMenuItem;
    private javax.swing.JMenuItem editUserMenuItem;
    private javax.swing.JLabel entryDateLabel;
    private javax.swing.JLabel exitDateLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu logInMenu;
    private javax.swing.JMenuItem logInMenuItem;
    private javax.swing.JMenu modifyUserMenu;
    private javax.swing.JLabel roomAmountLabel;
    private javax.swing.JTextField roomAmountTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JMenuItem searchHotelMenuItem;
    private javax.swing.JMenu searchMenu;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JButton seeHotelButton;
    private javax.swing.JButton selectHotelButton;
    private javax.swing.JMenu userActiveInactiveMenu;
    private javax.swing.JMenuItem userProfileMenuItem;
    private javax.swing.JMenu userProfileViewMenu;
    private javax.swing.JMenu userTypeMenu;
    // End of variables declaration//GEN-END:variables
}