/*
fff

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bus2;

import java.awt.Color;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author mehdi
 */
public class home extends javax.swing.JPanel {
 private client c;
    /**
     * Creates new form home
     */
    public home(client c) {
        initComponents();
             this.c=c;    
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new Dashboard.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        roundPanel2 = new Dashboard.swing.RoundPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        roundPanel3 = new Dashboard.swing.RoundPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        roundPanel4 = new Dashboard.swing.RoundPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        roundPanel5 = new Dashboard.swing.RoundPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        roundPanel6 = new Dashboard.swing.RoundPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new Color(255,224,25,179));
        roundPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel1MouseClicked(evt);
            }
        });
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 224, 25));
        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(159, 161, 159));
        jLabel6.setText("les lignes");
        roundPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 90, -1));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/icons8-driveway-60.png"))); // NOI18N
        roundPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 60));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 230, 110));

        roundPanel2.setBackground(new Color(255,224,25,179));
        roundPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel2MouseClicked(evt);
            }
        });
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 224, 25));
        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(159, 161, 159));
        jLabel11.setText("les quartiers");
        roundPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/icons8-company-60.png"))); // NOI18N
        roundPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 230, 110));

        roundPanel3.setBackground(new Color(255,224,25,179));
        roundPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel3MouseClicked(evt);
            }
        });
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 224, 25));
        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(159, 161, 159));
        jLabel10.setText("tarif par ligne");
        roundPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 120, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/icons8-driveway-60-price.png"))); // NOI18N
        roundPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        add(roundPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 230, 110));

        roundPanel4.setBackground(new Color(255,224,25,179));
        roundPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel4MouseClicked(evt);
            }
        });
        roundPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 224, 25));
        jLabel13.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(159, 161, 159));
        jLabel13.setText("nos offres");
        roundPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/icons8-discount-60.png"))); // NOI18N
        roundPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add(roundPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 230, 110));

        roundPanel5.setBackground(new Color(255,224,25,179));
        roundPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel5MouseClicked(evt);
            }
        });
        roundPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 224, 25));
        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(159, 161, 159));
        jLabel12.setText("demandez ");
        roundPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/icons8-demand-60.png"))); // NOI18N
        roundPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        add(roundPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 230, 110));

        roundPanel6.setBackground(new Color(255,224,25,179));
        roundPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel6MouseClicked(evt);
            }
        });
        roundPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 224, 25));
        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(159, 161, 159));
        jLabel9.setText("station ");
        roundPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 90, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/icons8-bus-station-60.png"))); // NOI18N
        roundPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add(roundPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 230, 110));

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void roundPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel5MouseClicked
   
     try {
         this.c.showForm(new demande());
     } catch (Exception ex) {
         Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
     }

    }//GEN-LAST:event_roundPanel5MouseClicked

    private void roundPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel2MouseClicked
            this.c.showForm(new quartier());
    }//GEN-LAST:event_roundPanel2MouseClicked

    private void roundPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel6MouseClicked
        this.c.showForm(new station());
    }//GEN-LAST:event_roundPanel6MouseClicked

    private void roundPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel1MouseClicked
 this.c.showForm(new ligne());
    }//GEN-LAST:event_roundPanel1MouseClicked

    private void roundPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel3MouseClicked
       this.c.showForm(new tarif_par_ligne());
    }//GEN-LAST:event_roundPanel3MouseClicked

    private void roundPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel4MouseClicked
       this.c.showForm(new offres());
    }//GEN-LAST:event_roundPanel4MouseClicked
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Dashboard.swing.RoundPanel roundPanel1;
    private Dashboard.swing.RoundPanel roundPanel2;
    private Dashboard.swing.RoundPanel roundPanel3;
    private Dashboard.swing.RoundPanel roundPanel4;
    private Dashboard.swing.RoundPanel roundPanel5;
    private Dashboard.swing.RoundPanel roundPanel6;
    // End of variables declaration//GEN-END:variables
}
