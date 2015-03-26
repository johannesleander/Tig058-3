/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.gui.view;

import clubmanager.gui.controller.RegisterController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author johannes
 */
public class RegisterView extends javax.swing.JPanel {

    private RegisterController controller;
    public boolean updating;
    
    /**
     * Creates new form RegistryView
     */
    public RegisterView() {
        initComponents();   
        this.updating = true;        
    }
    
    /*
    @param t
    */
    public void setUpdateEvent(boolean t) {    
        this.updating = t;
    }
    
    
    /*
    @param c
    */
    public void setController(RegisterController c) {
        this.controller = c;
    }
   
    public void clearForm() {
        idField.setText("");
        nameField.setText("");
        surnameField.setText("");
        emailField.setText("");
        maleRadio.setSelected(true);
        femaleRadio.setSelected(false);
        birthdayField.setText("");
        joindateField.setText("");
        teamSelect.setSelectedItem("");
        playerCheck.setSelected(false);
        parentCheck.setSelected(false);
        coachCheck.setSelected(false);
        activeCheck.setSelected(false);        
    }
    
    
    /*
    @param text
    */
    public void displayError(String text) {
        JOptionPane.showMessageDialog(this, text, "Error", JOptionPane.ERROR_MESSAGE);        
    }
    
    /*
    @param ts
    */
    public void updateTeamSelect(ArrayList<String> ts) {
        teamSelect.removeAllItems();
        teamSelect.addItem("");
        for (String t : ts) {
            teamSelect.addItem(t);
        }
    }
    
    public void updateModel() throws Exception {
        this.controller.setModelId(idField.getText());        
        this.controller.setModelName(nameField.getText());
        this.controller.setModelSurname(surnameField.getText());
        this.controller.setModelEmail(emailField.getText());
        this.controller.setModelBirthdate(birthdayField.getText());
        this.controller.setModelJoindate(joindateField.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */ 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        idField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        femaleRadio = new javax.swing.JRadioButton();
        maleRadio = new javax.swing.JRadioButton();
        activeCheck = new javax.swing.JCheckBox();
        playerCheck = new javax.swing.JCheckBox();
        coachCheck = new javax.swing.JCheckBox();
        parentCheck = new javax.swing.JCheckBox();
        newTeamField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        memberSinceLabel = new javax.swing.JLabel();
        activeLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        teamLabel = new javax.swing.JLabel();
        addTeamBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        orLabel = new javax.swing.JLabel();
        teamSelect = new javax.swing.JComboBox();
        birthdayField = new javax.swing.JFormattedTextField(new SimpleDateFormat("yyyy-mm-dd"));
        joindateField = new javax.swing.JFormattedTextField(new SimpleDateFormat("yyyy-mm-dd"));

        setMinimumSize(new java.awt.Dimension(900, 400));
        setPreferredSize(new java.awt.Dimension(900, 510));

        buttonGroup1.add(femaleRadio);
        femaleRadio.setText("Female");
        femaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(maleRadio);
        maleRadio.setSelected(true);
        maleRadio.setText("Male");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        activeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeCheckActionPerformed(evt);
            }
        });

        playerCheck.setText("Player");
        playerCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerCheckActionPerformed(evt);
            }
        });

        coachCheck.setText("Coach");
        coachCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachCheckActionPerformed(evt);
            }
        });

        parentCheck.setText("Parent");
        parentCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentCheckActionPerformed(evt);
            }
        });

        newTeamField.setMinimumSize(new java.awt.Dimension(80, 24));

        idLabel.setText("ID");

        nameLabel.setText("Name");

        surnameLabel.setText("Surname");

        emailLabel.setText("Email");

        genderLabel.setText("Gender");

        birthdayLabel.setText("Birthday");

        memberSinceLabel.setText("Member since");

        activeLabel.setText("Active");

        roleLabel.setText("Role(s)");

        teamLabel.setText("Team");
        teamLabel.setPreferredSize(null);

        addTeamBtn.setText("Add Team");
        addTeamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeamBtnActionPerformed(evt);
            }
        });

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        orLabel.setText("or");

        teamSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(idLabel)
                                .addComponent(nameLabel)
                                .addComponent(surnameLabel)
                                .addComponent(emailLabel)
                                .addComponent(genderLabel)
                                .addComponent(birthdayLabel)
                                .addComponent(memberSinceLabel)
                                .addComponent(teamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(roleLabel)
                            .addComponent(activeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(activeCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                                .addGap(352, 352, 352))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(surnameField)
                                .addGap(210, 210, 210))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameField)
                                    .addComponent(idField))
                                .addGap(210, 210, 210))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(teamSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(orLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(newTeamField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addTeamBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(femaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(playerCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(parentCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(coachCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(joindateField))
                                .addGap(210, 210, 210))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(birthdayField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailField))
                                .addGap(210, 210, 210))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {activeLabel, birthdayLabel, emailLabel, genderLabel, idLabel, memberSinceLabel, nameLabel, roleLabel, surnameLabel, teamLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(femaleRadio)
                            .addComponent(maleRadio)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(birthdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(memberSinceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(joindateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(activeCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(activeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(playerCheck)
                            .addComponent(parentCheck)
                            .addComponent(coachCheck)
                            .addComponent(roleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teamSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(newTeamField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(addTeamBtn)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(orLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addComponent(submitBtn)
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void femaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed
        this.controller.setModelGender(1);
    }//GEN-LAST:event_femaleRadioActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        this.controller.setModelGender(0);
    }//GEN-LAST:event_maleRadioActionPerformed

    private void activeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeCheckActionPerformed
        this.controller.setModelActive(this.controller.isModelActive());
    }//GEN-LAST:event_activeCheckActionPerformed

    private void playerCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerCheckActionPerformed
        this.controller.toggleModelRoles(0);
    }//GEN-LAST:event_playerCheckActionPerformed

    private void parentCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentCheckActionPerformed
        this.controller.toggleModelRoles(1);
    }//GEN-LAST:event_parentCheckActionPerformed

    private void coachCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachCheckActionPerformed
        this.controller.toggleModelRoles(2);
    }//GEN-LAST:event_coachCheckActionPerformed

    private void addTeamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeamBtnActionPerformed
        try {                       
            this.controller.addTeam(newTeamField.getText());
            newTeamField.setText("");
        } catch (Exception e) {
            displayError(e.getMessage());
        }
    }//GEN-LAST:event_addTeamBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        try {
            this.updateModel();
            if (this.controller.validateModel()) {
                JOptionPane.showMessageDialog(this, "Success", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                displayError("All fields must have values!");
            }                
        } catch (Exception e) {
            displayError(e.getMessage());
        }        
    }//GEN-LAST:event_submitBtnActionPerformed

    private void teamSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamSelectActionPerformed
        if (!this.updating) {
            this.controller.addModelTeam( (String) teamSelect.getSelectedItem());
        }
    }//GEN-LAST:event_teamSelectActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activeCheck;
    private javax.swing.JLabel activeLabel;
    private javax.swing.JButton addTeamBtn;
    private javax.swing.JFormattedTextField birthdayField;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox coachCheck;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JFormattedTextField joindateField;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JLabel memberSinceLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField newTeamField;
    private javax.swing.JLabel orLabel;
    private javax.swing.JCheckBox parentCheck;
    private javax.swing.JCheckBox playerCheck;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JLabel teamLabel;
    private javax.swing.JComboBox teamSelect;
    // End of variables declaration//GEN-END:variables
}
