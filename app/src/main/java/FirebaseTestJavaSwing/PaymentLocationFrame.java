/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FirebaseTestJavaSwing;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author shahi
 */
public class PaymentLocationFrame extends javax.swing.JFrame {

    DB_Functions dbFunctions;
    String priceValue;

    /**
     * Creates new form PaymentLocationFrame
     */
    public PaymentLocationFrame() {
        initComponents();
        dbFunctions = new DB_Functions();

        if (Common.bookingName != null) {
            nameLabel.setText("" + Common.bookingName);
        }
        if (Common.bookingPhone != null) {
            phoneLabel.setText("" + Common.bookingPhone);
        }

        Random random = new Random();
        priceValue = String.valueOf(random.nextInt()).substring(1, 5);
        System.out.println(priceValue);
        priceLabel.setText("" + priceValue + "tk");
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
        locationTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tranTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Location & Payment Process");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setText("Enter your destination location:");

        locationTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("Total cost:");

        priceLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        priceLabel.setText("0tk");

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jButton1.setText("Process booking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setText("Your name:");

        nameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel5.setText("Your name:");

        phoneLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel6.setText("Transection Id:");

        tranTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(priceLabel)
                            .addComponent(jLabel4)
                            .addComponent(nameLabel)
                            .addComponent(jLabel5)
                            .addComponent(phoneLabel)
                            .addComponent(jLabel6)
                            .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tranTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButton1)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tranTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String location = locationTextField.getText().toString();
        String trxId = tranTextField.getText().toString();
        if (location.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your destination location");
        } else if (trxId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Without payment id we can't process");
        } else {
            boolean result = dbFunctions.bookingAmbulance(Common.selectedAmbulanc.getId(), Common.bookingName, Common.bookingPhone, location, Integer.parseInt(priceValue), trxId);
            if (result) {
                JOptionPane.showMessageDialog(this, "Ambulance Booking Successfully done");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Ambulance Booking failed, try again");
            }
            System.out.println("Selected Ambulance Name: " + Common.selectedAmbulanc.getName());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentLocationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentLocationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentLocationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentLocationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentLocationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField tranTextField;
    // End of variables declaration//GEN-END:variables
}
