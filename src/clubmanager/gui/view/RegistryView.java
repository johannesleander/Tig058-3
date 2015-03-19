/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.gui.view;

/**
 *
 * @author johannes
 */
public class RegistryView extends javax.swing.JPanel {

    /**
     * Creates new form RegistryView
     */
    public RegistryView() {
        initComponents();
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
        idText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        surnameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        femaleRadio = new javax.swing.JRadioButton();
        maleRadio = new javax.swing.JRadioButton();
        birthdayText = new javax.swing.JTextField();
        memberSinceText = new javax.swing.JTextField();
        activeCheck = new javax.swing.JCheckBox();
        childCheck = new javax.swing.JCheckBox();
        coachCheck = new javax.swing.JCheckBox();
        parentCheck = new javax.swing.JCheckBox();
        teamCombo = new javax.swing.JComboBox();
        newTeamText = new javax.swing.JTextField();
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

        idText.setText("jTextField1");

        nameText.setText("jTextField1");

        surnameText.setText("jTextField1");

        emailText.setText("jTextField1");

        buttonGroup1.add(femaleRadio);
        femaleRadio.setText("Female");
        femaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(maleRadio);
        maleRadio.setText("Male");

        birthdayText.setText("jTextField1");

        memberSinceText.setText("jTextField1");

        childCheck.setText("Child");

        coachCheck.setText("Coach");

        parentCheck.setText("Parent");

        teamCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        newTeamText.setText("New Team");
        newTeamText.setMinimumSize(new java.awt.Dimension(80, 19));
        newTeamText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newTeamTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newTeamTextFocusLost(evt);
            }
        });
        newTeamText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTeamTextActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel)
                            .addComponent(nameLabel)
                            .addComponent(surnameLabel)
                            .addComponent(emailLabel)
                            .addComponent(genderLabel)
                            .addComponent(birthdayLabel)
                            .addComponent(memberSinceLabel)
                            .addComponent(activeLabel)
                            .addComponent(teamLabel)
                            .addComponent(roleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(activeCheck)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(femaleRadio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(maleRadio))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(memberSinceText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(birthdayText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(surnameText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(childCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(parentCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(coachCheck)))
                                .addGap(111, 111, 111))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(teamCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newTeamText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(addTeamBtn))))
                    .addComponent(submitBtn))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(femaleRadio)
                    .addComponent(maleRadio)
                    .addComponent(genderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdayLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberSinceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memberSinceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(activeCheck)
                    .addComponent(activeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childCheck)
                    .addComponent(parentCheck)
                    .addComponent(coachCheck)
                    .addComponent(roleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newTeamText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamLabel)
                    .addComponent(addTeamBtn)
                    .addComponent(orLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void femaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRadioActionPerformed

    private void addTeamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeamBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addTeamBtnActionPerformed

    private void newTeamTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTeamTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newTeamTextActionPerformed

    private void newTeamTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newTeamTextFocusGained
        newTeamText.setText("");                // TODO add your handling code here:
    }//GEN-LAST:event_newTeamTextFocusGained

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed

    private void newTeamTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newTeamTextFocusLost
        newTeamText.setText("New team...");    // TODO add your handling code here:
    }//GEN-LAST:event_newTeamTextFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activeCheck;
    private javax.swing.JLabel activeLabel;
    private javax.swing.JButton addTeamBtn;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JTextField birthdayText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox childCheck;
    private javax.swing.JCheckBox coachCheck;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idText;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JLabel memberSinceLabel;
    private javax.swing.JTextField memberSinceText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField newTeamText;
    private javax.swing.JLabel orLabel;
    private javax.swing.JCheckBox parentCheck;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField surnameText;
    private javax.swing.JComboBox teamCombo;
    private javax.swing.JLabel teamLabel;
    // End of variables declaration//GEN-END:variables
}
