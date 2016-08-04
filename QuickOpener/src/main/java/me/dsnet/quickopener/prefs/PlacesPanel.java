/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.quickopener.prefs;

import me.dsnet.quickopener.QuickMessages;
import me.dsnet.quickopener.actions.popup.PropertyTableModel;
import java.io.File;
import java.util.List;
import java.util.prefs.BackingStoreException;
import javax.swing.JTable;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.Exceptions;
/**
 *
 * @author SessonaD
 */
public class PlacesPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlacesPanel
     */
    public PlacesPanel() {
        super();
        initComponents();
        jTable2.setModel(new PropertyTableModel("folder"));
        jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTable2.getColumnModel().getColumn(0).setMaxWidth(400);
        jTable2.getColumnModel().getColumn(0).setMinWidth(100);        
    }
    
    private boolean checkValidFolder(String path){
        File f=new File(path);
        return(f.exists() && f.isDirectory());
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
        jLabel2 = new javax.swing.JLabel();
        folderDescriptionTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        favoritePathTextField = new javax.swing.JTextField();
        addFolderButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel2.setLabelFor(folderDescriptionTextField);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(PlacesPanel.class, "PlacesPanel.jLabel2.text")); // NOI18N

        folderDescriptionTextField.setText(org.openide.util.NbBundle.getMessage(PlacesPanel.class, "PlacesPanel.folderDescriptionTextField.text")); // NOI18N

        jLabel3.setLabelFor(favoritePathTextField);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(PlacesPanel.class, "PlacesPanel.jLabel3.text")); // NOI18N

        favoritePathTextField.setText(org.openide.util.NbBundle.getMessage(PlacesPanel.class, "PlacesPanel.favoritePathTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(addFolderButton, org.openide.util.NbBundle.getMessage(PlacesPanel.class, "PlacesPanel.addFolderButton.text")); // NOI18N
        addFolderButton.setToolTipText(org.openide.util.NbBundle.getMessage(PlacesPanel.class, "PlacesPanel.addFolderButton.toolTipText")); // NOI18N
        addFolderButton.setFocusPainted(false);
        addFolderButton.setRequestFocusEnabled(false);
        addFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFolderButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButton3, org.openide.util.NbBundle.getMessage(PlacesPanel.class, "PlacesPanel.jButton3.text")); // NOI18N
        jButton3.setFocusPainted(false);
        jButton3.setRequestFocusEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButton5, org.openide.util.NbBundle.getMessage(PlacesPanel.class, "PlacesPanel.jButton5.text")); // NOI18N
        jButton5.setFocusPainted(false);
        jButton5.setRequestFocusEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setFillsViewportHeight(true);
        jTable2.setFocusable(false);
        jTable2.setGridColor(new java.awt.Color(204, 204, 204));
        jTable2.setRequestFocusEnabled(false);
        jTable2.setShowVerticalLines(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(folderDescriptionTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addFolderButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addComponent(favoritePathTextField))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(folderDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFolderButton)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(favoritePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFolderButtonActionPerformed
        String description = folderDescriptionTextField.getText();
        description =description.replaceAll(" ", "_");
        String value = favoritePathTextField.getText();
        if(! checkValidFolder(value) || description.isEmpty()){
            if(description.isEmpty()){
                NotifyDescriptor d = new NotifyDescriptor.Message(QuickMessages.DESCRIPTION_MANDATORY,NotifyDescriptor.WARNING_MESSAGE);
                DialogDisplayer.getDefault().notify(d);
            }else{
                NotifyDescriptor d = new NotifyDescriptor.Message(QuickMessages.FOLDER_INVALID,NotifyDescriptor.WARNING_MESSAGE);
                DialogDisplayer.getDefault().notify(d);
            }
            return;
        }
        PrefsUtil.store("folder" + description, value);
        NotifyDescriptor d = new NotifyDescriptor.Message(QuickMessages.FOLDER_ADDED);
        DialogDisplayer.getDefault().notify(d);
        jTable2.setModel(new PropertyTableModel("folder"));
    }//GEN-LAST:event_addFolderButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            PrefsUtil.remove("folder"+folderDescriptionTextField.getText().replaceAll(" ", "_"));
            jTable2.setModel(new PropertyTableModel("folder"));
        } catch (BackingStoreException ex) {
            //Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            PrefsUtil.removeAll("folder");
            jTable2.setModel(new PropertyTableModel("folder"));
        } catch (BackingStoreException ex) {
            //Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        if (evt.getClickCount() == 1) {
            final int thisrow = jTable2.getSelectedRow();
            if (-1 != thisrow) {
                final int row = jTable2.getRowSorter().convertRowIndexToModel(thisrow);
                String desc = (String) jTable2.getModel().getValueAt(row, 0);
                String path = (String) jTable2.getModel().getValueAt(row, 1);
                folderDescriptionTextField.setText(desc);
                favoritePathTextField.setText(path);
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFolderButton;
    private javax.swing.JTextField favoritePathTextField;
    private javax.swing.JTextField folderDescriptionTextField;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
