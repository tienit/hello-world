/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciseDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author tiennu
 */
public class Exercise03 extends javax.swing.JFrame {

    /**
     * Creates new form Exercise03
     */
    public Exercise03() {
        initComponents();
        
        btnConvert.addActionListener((ActionEvent ae) -> {
            if (txtSeconds.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập số giây.", "JAVA WORLD", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int input = Integer.parseInt(txtSeconds.getText());
            int hour_2_seconds = 3600;
            int minute_2_seconds = 60;
            int total_hours = Math.floorDiv(input, hour_2_seconds);
            int total_minutes = Math.floorDiv((input - (total_hours * hour_2_seconds)), minute_2_seconds);
            int total_seconds = input - total_hours * hour_2_seconds - total_minutes * minute_2_seconds;
            lblResult.setText(String.format("%02d:%02d:%02d", total_hours, total_minutes, total_seconds));
        });
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
        lblInt = new javax.swing.JLabel();
        txtSeconds = new javax.swing.JTextField();
        lblInt1 = new javax.swing.JLabel();
        btnConvert = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Exercise 03");

        lblInt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInt.setText("Nhập số giây");

        txtSeconds.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtSeconds.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSecondsKeyTyped(evt);
            }
        });

        lblInt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInt1.setText("0 --> 68399");

        btnConvert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConvert.setText("Chuyển đổi");

        lblResult.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblResult.setForeground(new java.awt.Color(255, 0, 51));
        lblResult.setText("00:00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblInt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSeconds)
                            .addComponent(btnConvert, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblResult)
                                    .addComponent(lblInt1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInt)
                    .addComponent(txtSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInt1)
                .addGap(18, 18, 18)
                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblResult)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSecondsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecondsKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        if (Character.isDigit(vchar)
            || vchar == KeyEvent.VK_DELETE
            || vchar == KeyEvent.VK_BACK_SPACE) {
            //do anything
//            if (!txtSeconds.getText().trim().equals("")) {
//                if (Integer.parseInt(txtSeconds.getText()) < 0) {
//                txtSeconds.setText("0");
//            }
//            else if(Integer.parseInt(txtSeconds.getText()) > 68399)
//            {
//                txtSeconds.setText("68399");
//            }
//            }
        }
        else {
            evt.consume();
        }
    }//GEN-LAST:event_txtSecondsKeyTyped

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
            java.util.logging.Logger.getLogger(Exercise03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercise03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercise03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercise03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercise03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblInt;
    private javax.swing.JLabel lblInt1;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtSeconds;
    // End of variables declaration//GEN-END:variables
}
