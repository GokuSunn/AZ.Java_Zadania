/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.przeliczaniejednostek_adrian.ziebowski;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adrik
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        az_buttonGroup1 = new javax.swing.ButtonGroup();
        az_buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        az_jTabbedPaneTemp = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        az_jLabelTemp = new javax.swing.JLabel();
        az_jTextFieldTemp = new javax.swing.JTextField();
        az_jRadioButtonfah = new javax.swing.JRadioButton();
        az_jRadioButtonKelvin = new javax.swing.JRadioButton();
        az_jRadioButtonCel = new javax.swing.JRadioButton();
        az_jButtonPrzel = new javax.swing.JButton();
        az_jTextFieldCel = new javax.swing.JTextField();
        az_jTextFieldFah = new javax.swing.JTextField();
        az_jTextFieldKel = new javax.swing.JTextField();
        az_jLabelFah = new javax.swing.JLabel();
        az_jLabelCel = new javax.swing.JLabel();
        az_jLabelKel = new javax.swing.JLabel();
        az_jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        az_jLabelOdleg = new javax.swing.JLabel();
        az_jTextFieldOdleg = new javax.swing.JTextField();
        az_jButtonPrzel2 = new javax.swing.JButton();
        az_jSeparator2 = new javax.swing.JSeparator();
        az_jRadioButtonMm = new javax.swing.JRadioButton();
        az_jRadioButtonCm = new javax.swing.JRadioButton();
        az_jRadioButtonM = new javax.swing.JRadioButton();
        az_jRadioButtonDm = new javax.swing.JRadioButton();
        az_jRadioButtonKm = new javax.swing.JRadioButton();
        az_jTextFieldMm = new javax.swing.JTextField();
        az_jTextFieldCm = new javax.swing.JTextField();
        az_jTextFieldDm = new javax.swing.JTextField();
        az_jTextFieldM = new javax.swing.JTextField();
        az_jTextFieldKm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        az_jLabelName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        az_jMenuItemHistory = new javax.swing.JMenuItem();
        az_jMenuItemClose = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        az_jLabelTemp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        az_jLabelTemp.setText("Podaj stopnie które chcesz przeliczyć");

        az_jTextFieldTemp.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        az_buttonGroup1.add(az_jRadioButtonfah);
        az_jRadioButtonfah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        az_jRadioButtonfah.setText("°F");

        az_buttonGroup1.add(az_jRadioButtonKelvin);
        az_jRadioButtonKelvin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        az_jRadioButtonKelvin.setText("°K");

        az_buttonGroup1.add(az_jRadioButtonCel);
        az_jRadioButtonCel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        az_jRadioButtonCel.setText("°C");

        az_jButtonPrzel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        az_jButtonPrzel.setText("Przelicz");
        az_jButtonPrzel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                az_jButtonPrzelActionPerformed(evt);
            }
        });

        az_jTextFieldCel.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        az_jTextFieldFah.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        az_jTextFieldKel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        az_jTextFieldKel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                az_jTextFieldKelActionPerformed(evt);
            }
        });

        az_jLabelFah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        az_jLabelFah.setText("Fah: ");

        az_jLabelCel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        az_jLabelCel.setText("Cel: ");

        az_jLabelKel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        az_jLabelKel.setText("Kel: ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(az_jLabelTemp)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(az_jButtonPrzel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(az_jTextFieldTemp)
                                .addGap(121, 121, 121)))
                        .addComponent(az_jRadioButtonCel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(az_jRadioButtonfah, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(az_jRadioButtonKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
            .addComponent(az_jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(az_jLabelCel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(az_jTextFieldCel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(az_jLabelFah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(az_jTextFieldFah, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(az_jLabelKel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(az_jTextFieldKel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(az_jLabelTemp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(az_jTextFieldTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(az_jRadioButtonfah)
                    .addComponent(az_jRadioButtonKelvin)
                    .addComponent(az_jRadioButtonCel))
                .addGap(18, 18, 18)
                .addComponent(az_jButtonPrzel)
                .addGap(76, 76, 76)
                .addComponent(az_jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(az_jTextFieldCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(az_jLabelCel)
                    .addComponent(az_jLabelFah)
                    .addComponent(az_jTextFieldFah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(az_jLabelKel)
                    .addComponent(az_jTextFieldKel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        az_jTabbedPaneTemp.addTab("Temperatura", jPanel6);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        az_jLabelOdleg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        az_jLabelOdleg.setForeground(new java.awt.Color(255, 255, 255));
        az_jLabelOdleg.setText("Podaj odległość którą chcesz przeliczyć");

        az_jTextFieldOdleg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        az_jTextFieldOdleg.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        az_jButtonPrzel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        az_jButtonPrzel2.setText("Przelicz");
        az_jButtonPrzel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                az_jButtonPrzel2ActionPerformed(evt);
            }
        });

        az_buttonGroup2.add(az_jRadioButtonMm);
        az_jRadioButtonMm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        az_jRadioButtonMm.setText("mm");

        az_buttonGroup2.add(az_jRadioButtonCm);
        az_jRadioButtonCm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        az_jRadioButtonCm.setText("cm");

        az_buttonGroup2.add(az_jRadioButtonM);
        az_jRadioButtonM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        az_jRadioButtonM.setText("m");

        az_buttonGroup2.add(az_jRadioButtonDm);
        az_jRadioButtonDm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        az_jRadioButtonDm.setText("dm");

        az_buttonGroup2.add(az_jRadioButtonKm);
        az_jRadioButtonKm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        az_jRadioButtonKm.setText("km");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("mm");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("cm");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("dm");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("m");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("km");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(az_jTextFieldMm, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(az_jTextFieldCm, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(az_jTextFieldDm, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(az_jButtonPrzel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addGap(109, 109, 109)
                                .addComponent(jLabel2)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel3)
                                .addGap(0, 20, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(az_jTextFieldOdleg)
                                    .addComponent(az_jLabelOdleg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(az_jRadioButtonMm)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(az_jRadioButtonCm)
                                .addGap(18, 18, 18)
                                .addComponent(az_jRadioButtonDm)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(az_jTextFieldM, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(az_jTextFieldKm, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(az_jRadioButtonM)
                                        .addGap(18, 18, 18)
                                        .addComponent(az_jRadioButtonKm)))
                                .addGap(37, 37, 37))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(az_jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(az_jLabelOdleg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(az_jTextFieldOdleg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(az_jRadioButtonMm)
                    .addComponent(az_jRadioButtonCm)
                    .addComponent(az_jRadioButtonM)
                    .addComponent(az_jRadioButtonDm)
                    .addComponent(az_jRadioButtonKm))
                .addGap(18, 18, 18)
                .addComponent(az_jButtonPrzel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(az_jTextFieldMm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(az_jTextFieldCm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(az_jTextFieldDm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(az_jTextFieldM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(az_jTextFieldKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(174, 174, 174)
                    .addComponent(az_jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(174, Short.MAX_VALUE)))
        );

        az_jTabbedPaneTemp.addTab("Odleglosc", jPanel2);

        az_jLabelName.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        az_jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        az_jLabelName.setText("Przelicznik jednostek");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(az_jTabbedPaneTemp)
            .addComponent(az_jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(az_jLabelName)
                .addGap(18, 18, 18)
                .addComponent(az_jTabbedPaneTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");

        az_jMenuItemHistory.setText("Pokaż Historie");
        az_jMenuItemHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                az_jMenuItemHistoryActionPerformed(evt);
            }
        });
        jMenu1.add(az_jMenuItemHistory);

        az_jMenuItemClose.setText("Zamknij");
        az_jMenuItemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                az_jMenuItemCloseActionPerformed(evt);
            }
        });
        jMenu1.add(az_jMenuItemClose);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About Program");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void az_jMenuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_az_jMenuItemCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_az_jMenuItemCloseActionPerformed

    private void az_jTextFieldKelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_az_jTextFieldKelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_az_jTextFieldKelActionPerformed

    private void az_jButtonPrzelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_az_jButtonPrzelActionPerformed
        PrzelicznikTemp();        
    }//GEN-LAST:event_az_jButtonPrzelActionPerformed

    private void az_jMenuItemHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_az_jMenuItemHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_az_jMenuItemHistoryActionPerformed

    private void az_jButtonPrzel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_az_jButtonPrzel2ActionPerformed
        PrzelicznikOdleg();
        
        Zapis();
    }//GEN-LAST:event_az_jButtonPrzel2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    private void PrzelicznikTemp(){        
        String text = az_jTextFieldTemp.getText();
        double d = Double.parseDouble(text);
        double c;
        double f1;
        double k;
        
        
        
        az_buttonGroup1.getSelection();
        
        if(az_jRadioButtonCel.isSelected()){
            c = d;
            f1 = 1.8 * d + 32;
            k = d + 273.15;
            az_jTextFieldFah.setText(""+f1);
            az_jTextFieldCel.setText(""+c);
            az_jTextFieldKel.setText(""+k);
        }else if(az_jRadioButtonKelvin.isSelected()){
            c = d - 273.15;
            f1 = (d * 1.8) - 459.67;
            k = d;
            az_jTextFieldFah.setText(""+f1);
            az_jTextFieldCel.setText(""+c);
            az_jTextFieldKel.setText(""+k);
        }else if(az_jRadioButtonfah.isSelected()){
            c = 0.5555555 * (d - 32);
            f1 = d;
            k = (d + 459.67) * 0.5555555;
            az_jTextFieldFah.setText(""+f1);
            az_jTextFieldCel.setText(""+c);
            az_jTextFieldKel.setText(""+k);
        }        
    }
    
    private void PrzelicznikOdleg(){
        String odleg = az_jTextFieldOdleg.getText();
        double o = Double.parseDouble(odleg);
        double Mm;
        double Cm;
        double Dm;
        double M;
        double Km;
        
        if(az_jRadioButtonMm.isSelected()){
            Mm = o;
            Cm = o * 0.1;
            Dm = o * 0.01;
            M = o * 0.001;
            Km = o * 0.0001;
            
            az_jTextFieldMm.setText(""+Mm);
            az_jTextFieldCm.setText(""+Cm);
            az_jTextFieldDm.setText(""+Dm);
            az_jTextFieldM.setText(""+M);
            az_jTextFieldKm.setText(""+Km);
            
        }else if(az_jRadioButtonCm.isSelected()){
            Mm = o * 10;
            Cm = o;
            Dm = o * 0.1;
            M = o * 0.01;
            Km = o * 0.001;
            
            az_jTextFieldMm.setText(""+Mm);
            az_jTextFieldCm.setText(""+Cm);
            az_jTextFieldDm.setText(""+Dm);
            az_jTextFieldM.setText(""+M);
            az_jTextFieldKm.setText(""+Km);
        }else if(az_jRadioButtonDm.isSelected()){
            Mm = o * 100;
            Cm = o * 10;
            Dm = o;
            M = o * 0.1;
            Km = o * 0.001;
            
            az_jTextFieldMm.setText(""+Mm);
            az_jTextFieldCm.setText(""+Cm);
            az_jTextFieldDm.setText(""+Dm);
            az_jTextFieldM.setText(""+M);
            az_jTextFieldKm.setText(""+Km);
        }else if(az_jRadioButtonM.isSelected()){
            Mm = o * 1000;
            Cm = o * 100;
            Dm = o * 10;
            M = o;
            Km = o * 0.01;
            
            az_jTextFieldMm.setText(""+Mm);
            az_jTextFieldCm.setText(""+Cm);
            az_jTextFieldDm.setText(""+Dm);
            az_jTextFieldM.setText(""+M);
            az_jTextFieldKm.setText(""+Km);
        }else if(az_jRadioButtonKm.isSelected()){
            Mm = o * 100000;
            Cm = o * 10000;
            Dm = o * 1000;
            M = o * 100;
            Km = o;
            
            az_jTextFieldMm.setText(""+Mm);
            az_jTextFieldCm.setText(""+Cm);
            az_jTextFieldDm.setText(""+Dm);
            az_jTextFieldM.setText(""+M);
            az_jTextFieldKm.setText(""+Km);
        }
    }
    
    private void Zapis(){
        try{
        
            File f = new File("zapis.txt");
            FileWriter fw = new FileWriter(f);
            String zapis1 = " ";
            String zapis2 = " ";
            String zapis3 = " ";
            
            String zapis4 = " ";
            String zapis5 = " ";
            String zapis6 = " ";
            String zapis7 = " ";
            String zapis8 = " ";
            
            String a = az_jTextFieldCel.getText();
            String b = az_jTextFieldFah.getText();
            String c = az_jTextFieldKel.getText();
            
            String a1 = az_jTextFieldMm.getText();
            String b1 = az_jTextFieldCm.getText();
            String c1 = az_jTextFieldDm.getText();
            String d1 = az_jTextFieldM.getText();
            String e1 = az_jTextFieldKm.getText();
            
            if(az_jRadioButtonCel.isSelected()){
                zapis1 = "Stopnie Cel "+a;
                zapis2 = "Stopnie Fah "+b;
                zapis3 = "Stopnie Kel "+c;                               
                
            }else if(az_jRadioButtonfah.isSelected()){
                zapis1 = "Stopnie Cel "+a;
                zapis2 = "Stopnie Fah "+b;
                zapis3 = "Stopnie Kel "+c;            
            }else if(az_jRadioButtonKelvin.isSelected()){
                zapis1 = "Stopnie Cel "+a;
                zapis2 = "Stopnie Fah "+b;
                zapis3 = "Stopnie Kel "+c;            
            } if(az_jRadioButtonMm.isSelected()){
                zapis4 = "Milimetry "+a1;
                zapis5 = "Centymetry "+b1;
                zapis6 = "Decymetry "+c1;
                zapis7 = "Metry "+d1;
                zapis8 = "Kilometry "+e1;
            }else if(az_jRadioButtonCm.isSelected()){
                zapis4 = "Milimetry "+a1;
                zapis5 = "Centymetry "+b1;
                zapis6 = "Decymetry "+c1;
                zapis7 = "Metry "+d1;
                zapis8 = "Kilometry "+e1;
            }else if(az_jRadioButtonDm.isSelected()){
                zapis4 = "Milimetry "+a1;
                zapis5 = "Centymetry "+b1;
                zapis6 = "Decymetry "+c1;
                zapis7 = "Metry "+d1;
                zapis8 = "Kilometry "+e1;
            }else if(az_jRadioButtonM.isSelected()){
                zapis4 = "Milimetry "+a1;
                zapis5 = "Centymetry "+b1;
                zapis6 = "Decymetry "+c1;
                zapis7 = "Metry "+d1;
                zapis8 = "Kilometry "+e1;
            }else if(az_jRadioButtonKm.isSelected()){
                zapis4 = "Milimetry "+a1;
                zapis5 = "Centymetry "+b1;
                zapis6 = "Decymetry "+c1;
                zapis7 = "Metry "+d1;
                zapis8 = "Kilometry "+e1;
            }
            
            fw.write(""+zapis1);
            fw.write("\n"+zapis2);
            fw.write("\n"+zapis3);
            fw.write("\n");
            fw.write("\n"+zapis4);
            fw.write("\n"+zapis5);
            fw.write("\n"+zapis6);
            fw.write("\n"+zapis7);
            fw.write("\n"+zapis8);
            fw.close();
        
        }catch(IOException e){
            System.out.println("BŁĄD");
        }
    }    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup az_buttonGroup1;
    private javax.swing.ButtonGroup az_buttonGroup2;
    private javax.swing.JButton az_jButtonPrzel;
    private javax.swing.JButton az_jButtonPrzel2;
    private javax.swing.JLabel az_jLabelCel;
    private javax.swing.JLabel az_jLabelFah;
    private javax.swing.JLabel az_jLabelKel;
    private javax.swing.JLabel az_jLabelName;
    private javax.swing.JLabel az_jLabelOdleg;
    private javax.swing.JLabel az_jLabelTemp;
    private javax.swing.JMenuItem az_jMenuItemClose;
    private javax.swing.JMenuItem az_jMenuItemHistory;
    private javax.swing.JRadioButton az_jRadioButtonCel;
    private javax.swing.JRadioButton az_jRadioButtonCm;
    private javax.swing.JRadioButton az_jRadioButtonDm;
    private javax.swing.JRadioButton az_jRadioButtonKelvin;
    private javax.swing.JRadioButton az_jRadioButtonKm;
    private javax.swing.JRadioButton az_jRadioButtonM;
    private javax.swing.JRadioButton az_jRadioButtonMm;
    private javax.swing.JRadioButton az_jRadioButtonfah;
    private javax.swing.JSeparator az_jSeparator1;
    private javax.swing.JSeparator az_jSeparator2;
    private javax.swing.JTabbedPane az_jTabbedPaneTemp;
    private javax.swing.JTextField az_jTextFieldCel;
    private javax.swing.JTextField az_jTextFieldCm;
    private javax.swing.JTextField az_jTextFieldDm;
    private javax.swing.JTextField az_jTextFieldFah;
    private javax.swing.JTextField az_jTextFieldKel;
    private javax.swing.JTextField az_jTextFieldKm;
    private javax.swing.JTextField az_jTextFieldM;
    private javax.swing.JTextField az_jTextFieldMm;
    private javax.swing.JTextField az_jTextFieldOdleg;
    private javax.swing.JTextField az_jTextFieldTemp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
