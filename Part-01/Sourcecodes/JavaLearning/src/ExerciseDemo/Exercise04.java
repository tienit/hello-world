/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciseDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author tiennu
 */
public class Exercise04 extends javax.swing.JFrame {

    /**
     * Creates new form Exercise04
     */
    public Exercise04() {
        initComponents();
        
        btnSearch.addActionListener((ActionEvent ae) -> {
            if (txt4.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập dữ liệu.", "JAVA WORLD", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String data = txt4.getText();
            String[] arr = data.split(",");
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                temp = Integer.parseInt(arr[i]);
                if (temp > max) {
                    max = temp;
                }
                
                if (temp < min) {
                    min = temp;
                }
            }
            lblMIN.setText(String.valueOf(min));
            lblMAX.setText(String.valueOf(max));
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

        lblInt = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblMIN = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblInt1 = new javax.swing.JLabel();
        lblInt2 = new javax.swing.JLabel();
        lblInt3 = new javax.swing.JLabel();
        lblMAX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInt.setText("Nhập 4 số nguyên");

        txt4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch.setText("Tìm kiếm");

        lblMIN.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMIN.setForeground(new java.awt.Color(255, 0, 51));
        lblMIN.setText("0");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Exercise 04");

        lblInt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInt1.setText("Ví dụ: 1, 2, 3, 4");

        lblInt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInt2.setText("Số lớn nhất");

        lblInt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInt3.setText("Số nhỏ nhất");

        lblMAX.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMAX.setForeground(new java.awt.Color(255, 0, 51));
        lblMAX.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInt3)
                            .addComponent(lblInt2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMIN)
                            .addComponent(lblInt1)
                            .addComponent(lblMAX))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(lblInt)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt4)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                    .addGap(26, 26, 26)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(lblInt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInt2)
                    .addComponent(lblMAX))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMIN)
                    .addComponent(lblInt3))
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblInt)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(51, 51, 51)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(175, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Exercise04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercise04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercise04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercise04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercise04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblInt;
    private javax.swing.JLabel lblInt1;
    private javax.swing.JLabel lblInt2;
    private javax.swing.JLabel lblInt3;
    private javax.swing.JLabel lblMAX;
    private javax.swing.JLabel lblMIN;
    private javax.swing.JTextField txt4;
    // End of variables declaration//GEN-END:variables
}
