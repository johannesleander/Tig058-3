/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.gui.view;

import clubmanager.gui.controller.MainController;

/**
 *
 * @author johannes
 */
public class MainView extends javax.swing.JFrame {

    private MainController controller;
    
    /**
     * Creates new form MainView
     */
    public MainView(MainController controller) {
        this.controller = controller;
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

        updateView1 = new clubmanager.gui.view.UpdateView();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        registryView1 = new clubmanager.gui.view.RegisterView();
        searchView2 = new clubmanager.gui.view.SearchView();
        updateView2 = new clubmanager.gui.view.UpdateView();

        javax.swing.GroupLayout updateView1Layout = new javax.swing.GroupLayout(updateView1);
        updateView1.setLayout(updateView1Layout);
        updateView1Layout.setHorizontalGroup(
            updateView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        updateView1Layout.setVerticalGroup(
            updateView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));

        registryView1.setController(this.controller.rc);
        registryView1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                registryView1FocusGained(evt);
            }
        });
        jTabbedPane1.addTab("Registry", registryView1);
        jTabbedPane1.addTab("Search", searchView2);
        jTabbedPane1.addTab("Update", updateView2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registryView1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registryView1FocusGained
                // TODO add your handling code here:
    }//GEN-LAST:event_registryView1FocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    public clubmanager.gui.view.RegisterView registryView1;
    private clubmanager.gui.view.SearchView searchView2;
    private clubmanager.gui.view.UpdateView updateView1;
    public clubmanager.gui.view.UpdateView updateView2;
    // End of variables declaration//GEN-END:variables
}
