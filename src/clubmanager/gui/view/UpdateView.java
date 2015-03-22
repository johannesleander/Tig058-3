/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.gui.view;

import clubmanager.dao.domain.Member;
import clubmanager.gui.controller.UpdateController;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Johannes
 */
public class UpdateView extends javax.swing.JPanel {

    private UpdateController controller;
    
    /**
     * Creates new form UpdateView
     */
    public UpdateView() {
        initComponents();
    }
    
    public void setController(UpdateController uc) {
        this.controller = uc;
    }
    
    public void displayError(String text) {
        JOptionPane.showMessageDialog(this, text, "Error", JOptionPane.ERROR_MESSAGE);        
    }        
    
    public String genderTypeToString(int i) {
        switch (i) {
            case 0:
                return "Male";
            case 1:
                return "Female";
        }
        return "";
    }
    
    public String childrenNamesFromMember(List<Member> lst) {
        StringBuilder sb = new StringBuilder();
        
        for (Member c : lst) {
            sb.append(c.getName());
            sb.append(",");
        }
        
        return sb.toString();
    }
    
    public void defaultViewText() {
        idLabel.setText("ID");
        nameLabel.setText("Name");
        surnameLabel.setText("Surname");
        emailLabel.setText("Email");
        genderLabel.setText("Gender");
        birthDateLabel.setText("");
        joindateLabel.setText("");
        activeCheckbox.setSelected(false);
        playerCheckbox.setSelected(false);
        parentCheckbox.setSelected(false);
        coachCheckbox.setSelected(false);
        teamLabel.setText("");
        childrenLabel.setText("");
        
    }
    
    public void fillViewWithMember(Member m) {        
        // Set all values to the fields.
        idLabel.setText(m.getId());
        nameLabel.setText(m.getName());
        surnameLabel.setText(m.getSurname());
        emailLabel.setText(m.getEmail());
        genderLabel.setText(genderTypeToString(m.getGender()));
        birthDateLabel.setText(this.controller.parseDateTime(m.getBirthdate()));
        joindateLabel.setText(this.controller.parseDateTime(m.getBirthdate()));
        activeCheckbox.setSelected((m.getActive()== 1));
        playerCheckbox.setSelected((m.getRoles().indexOf(0) > -1));
        parentCheckbox.setSelected((m.getRoles().indexOf(1) > -1));
        coachCheckbox.setSelected((m.getRoles().indexOf(2) > -1));
        
        if (!m.getTeams().isEmpty()) {
            teamLabel.setText(m.getTeams().get(0));
        }
                
        childrenLabel.setText(childrenNamesFromMember(m.getChildren()));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        activeCheckbox = new javax.swing.JCheckBox();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        playerCheckbox = new javax.swing.JCheckBox();
        parentCheckbox = new javax.swing.JCheckBox();
        coachCheckbox = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        parentIdField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        childIdField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        memberTable = new clubmanager.gui.view.MemberTableView();
        emailField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        birthDateLabel = new javax.swing.JLabel();
        joindateLabel = new javax.swing.JLabel();
        teamLabel = new javax.swing.JLabel();
        childrenLabel = new javax.swing.JLabel();
        changeEmailButton = new javax.swing.JButton();
        updateRoleButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 510));

        jLabel1.setText("Member");

        jLabel2.setText("Active");

        activeCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeCheckboxActionPerformed(evt);
            }
        });

        idLabel.setText("ID");

        nameLabel.setText("Name");

        surnameLabel.setText("Surname");

        emailLabel.setText("Email");

        genderLabel.setText("Gender");

        jLabel7.setText("Birthdate");

        jLabel8.setText("Joindate");

        jLabel9.setText("Roles");

        jLabel10.setText("Team");

        jLabel11.setText("Children");

        playerCheckbox.setText("Player");
        playerCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerCheckboxActionPerformed(evt);
            }
        });

        parentCheckbox.setText("Parent");
        parentCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentCheckboxActionPerformed(evt);
            }
        });

        coachCheckbox.setText("Coach");
        coachCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachCheckboxActionPerformed(evt);
            }
        });

        jLabel12.setText("Create parent child relation");

        jLabel13.setText("Parent ID");

        jLabel14.setText("Child ID");

        memberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(memberTable);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        birthDateLabel.setPreferredSize(new java.awt.Dimension(50, 15));

        joindateLabel.setPreferredSize(new java.awt.Dimension(50, 15));
        joindateLabel.setRequestFocusEnabled(false);

        teamLabel.setPreferredSize(new java.awt.Dimension(50, 15));

        childrenLabel.setPreferredSize(new java.awt.Dimension(50, 15));

        changeEmailButton.setText("Change");
        changeEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEmailButtonActionPerformed1(evt);
            }
        });

        updateRoleButton.setText("Change");
        updateRoleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRoleButtonActionPerformed1(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
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
                        .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeEmailButton)
                        .addGap(137, 137, 137))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(surnameLabel)
                                .addComponent(genderLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(birthDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(joindateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(teamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(childrenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(activeCheckbox))
                                .addComponent(jLabel12)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(parentIdField)
                                        .addComponent(childIdField)))
                                .addComponent(deleteButton)
                                .addComponent(nameLabel)
                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerCheckbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(parentCheckbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coachCheckbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateRoleButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surnameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(changeEmailButton)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(genderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(birthDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(joindateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(activeCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(playerCheckbox)
                    .addComponent(parentCheckbox)
                    .addComponent(coachCheckbox)
                    .addComponent(updateRoleButton))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(teamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(childrenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton)
                .addGap(11, 11, 11)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(parentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(childIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton)
                .addGap(0, 48, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void activeCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeCheckboxActionPerformed
        this.controller.setModelActive(activeCheckbox.isSelected());
        try {
            this.controller.changeMemberActive();
        } catch (Exception e) {
            displayError(e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_activeCheckboxActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void changeEmailButtonActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailButtonActionPerformed1
        this.controller.setModelEmail(emailField.getText());
        try {
            this.controller.changeMemberEmail();
        } catch (Exception ex) {
            displayError(ex.getMessage());
        }
        emailField.setText("");
    }//GEN-LAST:event_changeEmailButtonActionPerformed1

    private void playerCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerCheckboxActionPerformed
        this.controller.toggleModelRole(0);
    }//GEN-LAST:event_playerCheckboxActionPerformed

    private void parentCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentCheckboxActionPerformed
        this.controller.toggleModelRole(1);
    }//GEN-LAST:event_parentCheckboxActionPerformed

    private void coachCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachCheckboxActionPerformed
        this.controller.toggleModelRole(2);
    }//GEN-LAST:event_coachCheckboxActionPerformed

    private void updateRoleButtonActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRoleButtonActionPerformed1
        try {
            this.controller.changeMemberRoles();
        } catch (Exception e) {
            displayError(e.getMessage());
        }
    }//GEN-LAST:event_updateRoleButtonActionPerformed1

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            this.controller.deleteMember();
        } catch (Exception e) {
            displayError(e.getMessage());
        }
            
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            this.controller.createParentChildRelation(parentIdField.getText(), childIdField.getText());
        } catch (Exception e) {
            displayError(e.getMessage());
        }
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activeCheckbox;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JButton changeEmailButton;
    private javax.swing.JTextField childIdField;
    private javax.swing.JLabel childrenLabel;
    private javax.swing.JCheckBox coachCheckbox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel joindateLabel;
    public clubmanager.gui.view.MemberTableView memberTable;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JCheckBox parentCheckbox;
    private javax.swing.JTextField parentIdField;
    private javax.swing.JCheckBox playerCheckbox;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JLabel teamLabel;
    private javax.swing.JButton updateRoleButton;
    // End of variables declaration//GEN-END:variables
}
