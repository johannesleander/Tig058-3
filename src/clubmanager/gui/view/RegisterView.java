/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.gui.view;

import clubmanager.gui.controller.RegisterController;
import java.text.ParseException;
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
    
    public void setUpdateEvent(boolean t) {    
        this.updating = t;
    }
    
   public void setController(RegisterController c) {
        this.controller = c;
    }
    
    public void displayError(String text) {
        JOptionPane.showMessageDialog(this, text, "Error", JOptionPane.ERROR_MESSAGE);        
    }
    
    public void updateTeamSelect(ArrayList<String> ts) {
        teamSelect.removeAllItems();
        teamSelect.addItem("");
        for (String t : ts) {
            teamSelect.addItem(t);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        idField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        femaleRadio = new javax.swing.JRadioButton();
        maleRadio = new javax.swing.JRadioButton();
        birthdayField = new javax.swing.JTextField();
        memberSinceField = new javax.swing.JTextField();
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
        updateExistingBtn = new javax.swing.JButton();
        teamSelect = new javax.swing.JComboBox();

        setMinimumSize(new java.awt.Dimension(900, 400));
        setPreferredSize(new java.awt.Dimension(900, 510));

        idField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFieldFocusLost(evt);
            }
        });

        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFieldFocusLost(evt);
            }
        });

        surnameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                surnameFieldFocusLost(evt);
            }
        });

        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });

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

        birthdayField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                birthdayFieldFocusLost(evt);
            }
        });

        memberSinceField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                memberSinceFieldFocusLost(evt);
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

        updateExistingBtn.setText("Update exisiting member");

        teamSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(teamSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newTeamField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addTeamBtn)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(activeCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(352, 352, 352))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(memberSinceField)
                                .addGap(210, 210, 210))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(birthdayField)
                                .addGap(210, 210, 210))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailField)
                                .addGap(210, 210, 210))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(surnameField)
                                .addGap(210, 210, 210))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(femaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(playerCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(parentCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(coachCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameField)
                                    .addComponent(idField))
                                .addGap(210, 210, 210))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateExistingBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {activeLabel, birthdayLabel, emailLabel, genderLabel, idLabel, memberSinceLabel, nameLabel, roleLabel, surnameLabel, teamLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(birthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberSinceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memberSinceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(activeCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(playerCheck)
                    .addComponent(parentCheck)
                    .addComponent(coachCheck)
                    .addComponent(roleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teamSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(newTeamField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addTeamBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(orLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateExistingBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFieldFocusLost
        if (idField.getText().equals("")) {
            displayError("ID field cannot be empty");
            return;
        }
        this.controller.setModelId(idField.getText());        
    }//GEN-LAST:event_idFieldFocusLost

    private void nameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusLost
        if (nameField.getText().equals("")) {
            displayError("Name field cannot be empty");
            return;
        }
        this.controller.setModelName(nameField.getText());
    }//GEN-LAST:event_nameFieldFocusLost

    private void surnameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameFieldFocusLost
        if (surnameField.getText().equals("")) {
            displayError("Surname field cannot be empty");
            return;
        }
        this.controller.setModelSurname(surnameField.getText());
    }//GEN-LAST:event_surnameFieldFocusLost

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        if (emailField.getText().equals("")) {
            displayError("Email field cannot be empty");
            return;
        }
        this.controller.setModelEmail(emailField.getText());
    }//GEN-LAST:event_emailFieldFocusLost

    private void femaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed
        this.controller.setModelGender(1);
    }//GEN-LAST:event_femaleRadioActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        this.controller.setModelGender(0);
    }//GEN-LAST:event_maleRadioActionPerformed

    private void birthdayFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_birthdayFieldFocusLost
        try {
            this.controller.setModelBirthdate(birthdayField.getText());
        } catch (ParseException e) {
            displayError("Invalid date format, format is: yyyy-mm-dd");
        }
    }//GEN-LAST:event_birthdayFieldFocusLost

    private void memberSinceFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_memberSinceFieldFocusLost
        try {
            this.controller.setModelJoindate(memberSinceField.getText());
        } catch (ParseException e) {
            displayError("Invalid date format, format is: yyyy-mm-dd");
        }
    }//GEN-LAST:event_memberSinceFieldFocusLost

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
        } catch (Exception e) {
            displayError(e.getMessage());
        }
    }//GEN-LAST:event_addTeamBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        if (this.controller.validateModel()) {
            try {
                this.controller.submit();
            } catch (Exception e) {
                displayError(e.getMessage());
            }
        } else {
            displayError("All fields must have values!");
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
    private javax.swing.JTextField birthdayField;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox coachCheck;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField memberSinceField;
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
    private javax.swing.JButton updateExistingBtn;
    // End of variables declaration//GEN-END:variables
}
