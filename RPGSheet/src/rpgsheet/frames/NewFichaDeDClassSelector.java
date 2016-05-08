/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.frames;

import java.awt.Dimension;
import java.awt.Toolkit;
import rpgsheet.elements.Data;
import rpgsheet.elements.DungeonsAndDragons.*;

/**
 *
 * @author Tiago
 */
public class NewFichaDeDClassSelector extends javax.swing.JDialog {
    String criador,sistema;
    public NewFichaDeDClassSelector(String a,String b) {
        this();
        this.criador=a;
        this.sistema=b;
    }
    public NewFichaDeDClassSelector() {
        
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
        this.setModal(true);        
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

        warrior = new javax.swing.JButton();
        Thief = new javax.swing.JButton();
        Ranger = new javax.swing.JButton();
        Mage = new javax.swing.JButton();
        Paladin = new javax.swing.JButton();

        warrior.setText("Warrior");
        warrior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warriorActionPerformed(evt);
            }
        });

        Thief.setText("Thief");
        Thief.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThiefActionPerformed(evt);
            }
        });

        Ranger.setText("Ranger");
        Ranger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RangerActionPerformed(evt);
            }
        });

        Mage.setText("Mage");
        Mage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MageActionPerformed(evt);
            }
        });

        Paladin.setText("Paladin");
        Paladin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaladinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warrior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ranger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Paladin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Thief)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(warrior)
                    .addComponent(Ranger)
                    .addComponent(Mage)
                    .addComponent(Paladin)
                    .addComponent(Thief))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void warriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warriorActionPerformed
        // TODO add your handling code here:        
        Main.ficha=new DungeonsAndDragonsWarrior(criador,sistema,new Data());
        Main.refresh();
        dispose();
    }//GEN-LAST:event_warriorActionPerformed

    private void ThiefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThiefActionPerformed
        // TODO add your handling code here:
        Main.ficha=new DungeonsAndDragonsThief(criador,sistema,new Data());
        Main.refresh();
        dispose();
    }//GEN-LAST:event_ThiefActionPerformed

    private void RangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RangerActionPerformed
        // TODO add your handling code here:
        Main.ficha=new DungeonsAndDragonsRanger(criador,sistema,new Data());
        Main.refresh();
        dispose();
    }//GEN-LAST:event_RangerActionPerformed

    private void MageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MageActionPerformed

    private void PaladinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaladinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaladinActionPerformed

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
            java.util.logging.Logger.getLogger(NewFichaDeDClassSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewFichaDeDClassSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewFichaDeDClassSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewFichaDeDClassSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewFichaDeDClassSelector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mage;
    private javax.swing.JButton Paladin;
    private javax.swing.JButton Ranger;
    private javax.swing.JButton Thief;
    private javax.swing.JButton warrior;
    // End of variables declaration//GEN-END:variables
}
