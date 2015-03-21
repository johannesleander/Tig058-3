/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.gui.view;

import clubmanager.dao.domain.Member;
import clubmanager.gui.controller.SearchController;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author johannes
 */
public class SearchView extends javax.swing.JPanel {
 
    private SearchController controller;
    
    /**
     * Creates new form SearchView
     */
    public SearchView() {
        initComponents();
         
    }
    
    public void setController(SearchController c) {
        this.controller = c;
    }
    
     public void displayError(String text) {
        JOptionPane.showMessageDialog(this, text, "Error", JOptionPane.ERROR_MESSAGE);        
    }
     
     public void fillViewWithMember(Member m) {
        // Set all values to the fields.
    }
     
     public void updateTeamSelect(ArrayList<String> ts) {
        teamCombo.removeAllItems();
        listTeamCombo.removeAllItems();
        teamCombo.addItem("");
        listTeamCombo.addItem("");
        for (String t : ts) {
            teamCombo.addItem(t);
            listTeamCombo.addItem(t);
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

        jPanel2 = new javax.swing.JPanel();
        searchMebersBtn = new javax.swing.JButton();
        searchCoachBtn = new javax.swing.JButton();
        listTeamsBtn = new javax.swing.JButton();
        listMembersBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        memberTable = new clubmanager.gui.view.MemberTableView();
        cardPanel = new javax.swing.JPanel();
        searchMembersCard = new javax.swing.JPanel();
        searchMemberLabel = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        surnameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        searchCoachCard = new javax.swing.JPanel();
        searchCoachLabel = new javax.swing.JLabel();
        teamCombo = new javax.swing.JComboBox();
        searchBtn1 = new javax.swing.JButton();
        listTeamsCard = new javax.swing.JPanel();
        listTeamLabel = new javax.swing.JLabel();
        listTeamCombo = new javax.swing.JComboBox();
        searchBtn2 = new javax.swing.JButton();
        listMembersCard = new javax.swing.JPanel();
        listMembersLabel = new javax.swing.JLabel();
        sortId = new javax.swing.JButton();
        sortSurname = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 510));

        searchMebersBtn.setText("Search for Member");
        searchMebersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMebersBtnActionPerformed(evt);
            }
        });

        searchCoachBtn.setText("Search for Coach");
        searchCoachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCoachBtnActionPerformed(evt);
            }
        });

        listTeamsBtn.setText("List Team info");
        listTeamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listTeamsBtnActionPerformed(evt);
            }
        });

        listMembersBtn.setText("List all Members");
        listMembersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMembersBtnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(searchMebersBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchCoachBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(listTeamsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listMembersBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {listMembersBtn, listTeamsBtn, searchCoachBtn, searchMebersBtn});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchMebersBtn)
                            .addComponent(searchCoachBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listTeamsBtn)
                            .addComponent(listMembersBtn))
                        .addGap(0, 430, Short.MAX_VALUE)))
                .addContainerGap())
        );

        cardPanel.setLayout(new java.awt.CardLayout());

        searchMemberLabel.setText("Search for a member");

        idText.setText("Enter a person Number...");
        idText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idTextFocusLost(evt);
            }
        });
        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });

        surnameText.setText("Enter a surname...");
        surnameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                surnameTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                surnameTextFocusLost(evt);
            }
        });

        jLabel1.setText("Person Number");

        jLabel2.setText("Surname");

        jLabel3.setText("or");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchMembersCardLayout = new javax.swing.GroupLayout(searchMembersCard);
        searchMembersCard.setLayout(searchMembersCardLayout);
        searchMembersCardLayout.setHorizontalGroup(
            searchMembersCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchMembersCardLayout.createSequentialGroup()
                .addGroup(searchMembersCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchMembersCardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchMemberLabel))
                    .addGroup(searchMembersCardLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(searchMembersCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchMembersCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchMembersCardLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3))
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surnameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        searchMembersCardLayout.setVerticalGroup(
            searchMembersCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchMembersCardLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(searchMemberLabel)
                .addGap(18, 18, 18)
                .addGroup(searchMembersCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(searchMembersCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        cardPanel.add(searchMembersCard, "card1");
        searchMembersCard.getAccessibleContext().setAccessibleName("card1");

        searchCoachLabel.setText("Search for a coach");

        teamCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        teamCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamComboActionPerformed(evt);
            }
        });

        searchBtn1.setText("Search");
        searchBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchCoachCardLayout = new javax.swing.GroupLayout(searchCoachCard);
        searchCoachCard.setLayout(searchCoachCardLayout);
        searchCoachCardLayout.setHorizontalGroup(
            searchCoachCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchCoachCardLayout.createSequentialGroup()
                .addGroup(searchCoachCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchCoachCardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchCoachLabel))
                    .addGroup(searchCoachCardLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(teamCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn1)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        searchCoachCardLayout.setVerticalGroup(
            searchCoachCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchCoachCardLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(searchCoachLabel)
                .addGap(148, 148, 148)
                .addGroup(searchCoachCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn1))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        cardPanel.add(searchCoachCard, "card2");
        searchCoachCard.getAccessibleContext().setAccessibleName("card2");

        listTeamLabel.setText("List information on a team");

        listTeamCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        searchBtn2.setText("jButton1");

        javax.swing.GroupLayout listTeamsCardLayout = new javax.swing.GroupLayout(listTeamsCard);
        listTeamsCard.setLayout(listTeamsCardLayout);
        listTeamsCardLayout.setHorizontalGroup(
            listTeamsCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listTeamsCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listTeamLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listTeamsCardLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(listTeamCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBtn2)
                .addGap(77, 77, 77))
        );
        listTeamsCardLayout.setVerticalGroup(
            listTeamsCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listTeamsCardLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(listTeamLabel)
                .addGap(144, 144, 144)
                .addGroup(listTeamsCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listTeamCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn2))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        cardPanel.add(listTeamsCard, "card3");
        listTeamsCard.getAccessibleContext().setAccessibleName("card3");

        listMembersLabel.setText("List information on all members");

        sortId.setText("Sort by ID");

        sortSurname.setText("Sort by Surname");

        javax.swing.GroupLayout listMembersCardLayout = new javax.swing.GroupLayout(listMembersCard);
        listMembersCard.setLayout(listMembersCardLayout);
        listMembersCardLayout.setHorizontalGroup(
            listMembersCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listMembersCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listMembersCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(listMembersCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sortSurname)
                        .addComponent(sortId))
                    .addComponent(listMembersLabel))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        listMembersCardLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {sortId, sortSurname});

        listMembersCardLayout.setVerticalGroup(
            listMembersCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listMembersCardLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(listMembersLabel)
                .addGap(125, 125, 125)
                .addComponent(sortId)
                .addGap(18, 18, 18)
                .addComponent(sortSurname)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        cardPanel.add(listMembersCard, "card4");
        listMembersCard.getAccessibleContext().setAccessibleName("card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(713, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(104, Short.MAX_VALUE)
                    .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchMebersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMebersBtnActionPerformed
        CardLayout cl = (CardLayout)cardPanel.getLayout();       
        cl.show(cardPanel, "card1");
        cardPanel.repaint(); 
    }//GEN-LAST:event_searchMebersBtnActionPerformed

    private void searchCoachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCoachBtnActionPerformed
        CardLayout cl = (CardLayout)(cardPanel.getLayout());
        cl.show(cardPanel, "card2");
        cardPanel.repaint(); 
    }//GEN-LAST:event_searchCoachBtnActionPerformed

    private void listTeamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listTeamsBtnActionPerformed
        CardLayout cl = (CardLayout)(cardPanel.getLayout());
        cl.show(cardPanel, "card3");
        cardPanel.repaint(); 
    }//GEN-LAST:event_listTeamsBtnActionPerformed

    private void listMembersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listMembersBtnActionPerformed
        CardLayout cl = (CardLayout)(cardPanel.getLayout());
        cl.show(cardPanel, "card4");
        cardPanel.repaint(); 
    }//GEN-LAST:event_listMembersBtnActionPerformed

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if ((idText.getText().equals("Enter a person Number...")) || ((idText.getText().equals(""))) && 
           ((surnameText.getText().equals("Enter a surname...")) || ((surnameText.getText().equals(""))))) {
            
            displayError("No arguments in textfields.");
            return;
        } else if(!(idText.getText().equals("Enter a person Number...")) && (!(surnameText.getText().equals("Enter a surname...")))) {
            displayError("Search either by typing an ID or a surname, not both.");
            return;
        }
        
       // this.controller.setModelId(idField.getText());        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void idTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTextFocusGained
        if (idText.getText().equals("Enter a person Number...")) {
            idText.setText("");       
        }
    }//GEN-LAST:event_idTextFocusGained

    private void surnameTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameTextFocusGained
        if (surnameText.getText().equals("Enter a surname...")) {
            surnameText.setText("");       
        }        
    }//GEN-LAST:event_surnameTextFocusGained

    private void idTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTextFocusLost
        if (idText.getText().equals("")) {
            idText.setText("Enter a person Number...");
        }
    }//GEN-LAST:event_idTextFocusLost

    private void surnameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameTextFocusLost
        if (surnameText.getText().equals("")) {
            surnameText.setText("Enter a surname...");
        }     
    }//GEN-LAST:event_surnameTextFocusLost
    
    private void searchBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn1ActionPerformed
        //if (teamCombo.getText().equals("")) {
          //  displayError("Please pick a team to search from");
    }//GEN-LAST:event_searchBtn1ActionPerformed
    
    private void teamComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardPanel;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listMembersBtn;
    private javax.swing.JPanel listMembersCard;
    private javax.swing.JLabel listMembersLabel;
    private javax.swing.JComboBox listTeamCombo;
    private javax.swing.JLabel listTeamLabel;
    private javax.swing.JButton listTeamsBtn;
    private javax.swing.JPanel listTeamsCard;
    public clubmanager.gui.view.MemberTableView memberTable;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton searchBtn1;
    private javax.swing.JButton searchBtn2;
    private javax.swing.JButton searchCoachBtn;
    private javax.swing.JPanel searchCoachCard;
    private javax.swing.JLabel searchCoachLabel;
    private javax.swing.JButton searchMebersBtn;
    private javax.swing.JLabel searchMemberLabel;
    private javax.swing.JPanel searchMembersCard;
    private javax.swing.JButton sortId;
    private javax.swing.JButton sortSurname;
    private javax.swing.JTextField surnameText;
    private javax.swing.JComboBox teamCombo;
    // End of variables declaration//GEN-END:variables
}
