/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bus2;


import Dashboard.form.Dashsql;
import java.awt.Color;
import bus2.sqlFun.*;
import java.io.EOFException;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;


public class demande extends javax.swing.JPanel {
private Connection c;
    /**
     * Creates new form demande
     */
    public demande() throws Exception {
        initComponents();
        
        roundPanel1.setBackground(new Color(0,0,0,128));
        try{

          Connection c = Dashsql.connection();

        java.sql.ResultSet ab;
            try {
                ab = Admin.affiche_abonement(c);  
                while(ab.next()){
            
                    type_abonne.addItem(ab.getString(4)+"-"+ab.getString(1));
                   
        } 
            } catch (Exception ex) {
                Logger.getLogger(demande.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(demande.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(demande.class.getName()).log(Level.SEVERE, null, ex);
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

        roundPanel1 = new Dashboard.swing.RoundPanel();
        jBtn1 = new Dashboard.component.jBtn();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        cin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        adresse = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        date_naissance = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        type_abonne = new bus2.combobox.ComboBoxSuggestion();
        tele = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 465));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtn1.setForeground(new java.awt.Color(255, 255, 255));
        jBtn1.setText("demandez");
        jBtn1.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });
        roundPanel1.add(jBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 180, -1));

        jLabel7.setBackground(new java.awt.Color(255, 224, 25));
        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 224, 25));
        jLabel7.setText("votre carte");
        roundPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 110, -1));

        jLabel8.setBackground(new java.awt.Color(255, 224, 25));
        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("demandez");
        roundPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("prenom");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("email");
        roundPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("cin");
        roundPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("nom");
        roundPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        prenom.setBackground(new Color(0,0,0,0));
        prenom.setForeground(new java.awt.Color(255, 224, 25));
        prenom.setBorder(null);
        roundPanel1.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 190, 20));

        email.setBackground(new Color(0,0,0,0));
        email.setForeground(new java.awt.Color(255, 224, 25));
        email.setBorder(null);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        roundPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 190, 20));

        nom.setBackground(new Color(0,0,0,0));
        nom.setForeground(new java.awt.Color(255, 224, 25));
        nom.setBorder(null);
        roundPanel1.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 190, 20));

        cin.setBackground(new Color(0,0,0,0));
        cin.setForeground(new java.awt.Color(255, 224, 25));
        cin.setBorder(null);
        roundPanel1.add(cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 190, 20));

        jLabel2.setForeground(new java.awt.Color(255, 224, 25));
        jLabel2.setText("_______________________________________");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 200, 30));

        jLabel11.setForeground(new java.awt.Color(255, 224, 25));
        jLabel11.setText("_______________________________________");
        roundPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 200, 30));

        jLabel12.setForeground(new java.awt.Color(255, 224, 25));
        jLabel12.setText("_______________________________________");
        roundPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 200, 30));

        jLabel13.setForeground(new java.awt.Color(255, 224, 25));
        jLabel13.setText("_______________________________________");
        roundPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 200, 30));

        adresse.setBackground(new Color(0,0,0,0));
        adresse.setForeground(new java.awt.Color(255, 224, 25));
        adresse.setBorder(null);
        roundPanel1.add(adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 190, 20));

        jLabel4.setForeground(new java.awt.Color(255, 224, 25));
        jLabel4.setText("_______________________________________");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 200, 30));

        jLabel15.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("adresse");
        roundPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        date_naissance.setBackground(new Color(0,0,0,0));
        date_naissance.setForeground(new java.awt.Color(255, 224, 25));
        date_naissance.setBorder(null);
        roundPanel1.add(date_naissance, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 190, 20));

        jLabel5.setForeground(new java.awt.Color(255, 224, 25));
        jLabel5.setText("_______________________________________");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 30));

        jLabel16.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("date naissance");
        roundPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel17.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("abonnement");
        roundPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        roundPanel1.add(type_abonne, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 190, -1));

        tele.setBackground(new Color(0,0,0,0));
        tele.setForeground(new java.awt.Color(255, 224, 25));
        tele.setBorder(null);
        roundPanel1.add(tele, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 190, 20));

        jLabel14.setForeground(new java.awt.Color(255, 224, 25));
        jLabel14.setText("_______________________________________");
        roundPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 200, 30));

        jLabel18.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("telephone");
        roundPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 316, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        // TODO add your handling code here:
        String cinA =cin.getText();
        String nomA=nom.getText();
        String prenomA=prenom.getText();
        String addressA=adresse.getText();
        String emailA=email.getText();
        LocalDate date=LocalDate.now();
        String tel=tele.getText();
        int selectedIndex = type_abonne.getSelectedIndex();
        String[] id_ab=((String)type_abonne.getItemAt(selectedIndex)).split("-",2);
        System.out.println();
    try {
        Admin.ajouter_personne(c, cinA, date, Integer.parseInt(tel), addressA, nomA, prenomA, emailA,Integer.parseInt(id_ab[1]));
    } catch (SQLException ex) {
        Logger.getLogger(demande.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        
    }//GEN-LAST:event_jBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse;
    private javax.swing.JTextField cin;
    private javax.swing.JTextField date_naissance;
    private javax.swing.JTextField email;
    private Dashboard.component.jBtn jBtn1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private Dashboard.swing.RoundPanel roundPanel1;
    private javax.swing.JTextField tele;
    private bus2.combobox.ComboBoxSuggestion type_abonne;
    // End of variables declaration//GEN-END:variables
}
