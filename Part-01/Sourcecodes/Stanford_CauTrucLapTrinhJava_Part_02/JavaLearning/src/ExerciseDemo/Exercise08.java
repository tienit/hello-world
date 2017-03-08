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
public class Exercise08 extends javax.swing.JFrame {

    /** Creates new form Exercise08 */
    public Exercise08() {
        initComponents();
        
        btnFind.addActionListener((ActionEvent ae) -> {
            if (txtA.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập số a.", "JAVA WORLD", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtB.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập số b.", "JAVA WORLD", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtC.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập số c.", "JAVA WORLD", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int so_a = Integer.parseInt(txtA.getText());
            int so_b = Integer.parseInt(txtB.getText());
            int so_c = Integer.parseInt(txtC.getText());
            float delta = so_b * so_b - 4 * so_a * so_c;
            float nghiem_1 = (float) 0.0;
            float nghiem_2 = (float) 0.0;
            if (delta < 0) {
                lblResult.setText("Phương trình vô nghiệm.");
            }
            else if (delta == 0)
            {
                nghiem_1 = nghiem_2 = -so_b / (2 * so_a); 
                lblResult.setText(String.format("Nghiệm kép x1 = x2 = %.2f", nghiem_1));
            }
            else
            {
                nghiem_1 = (float) ((-so_b + Math.sqrt(delta)) / (2 * so_a));
                nghiem_2 = (float) ((-so_b - Math.sqrt(delta)) / (2 * so_a));
                lblResult.setText(String.format("x1 = %.2f \t\t x2 = %.2f", nghiem_1, nghiem_2));
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        lblInt2 = new javax.swing.JLabel();
        lblInt1 = new javax.swing.JLabel();
        lblInt = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Exercise 08");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Giải phương trình bậc 2: ax2 + bx + c = 0 ( a <> 0)");

        txtB.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        txtA.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        txtC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblInt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInt2.setText("c");

        lblInt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInt1.setText("b");

        lblInt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInt.setText("a");

        btnFind.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFind.setText("Tìm nghiệm");

        lblResult.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblResult.setForeground(new java.awt.Color(255, 0, 51));
        lblResult.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblInt2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblInt1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblInt)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtA)
                            .addComponent(txtB)
                            .addComponent(txtC)
                            .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                            .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInt1)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInt2)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblResult)
                .addContainerGap(92, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Exercise08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercise08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercise08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercise08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercise08().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblInt;
    private javax.swing.JLabel lblInt1;
    private javax.swing.JLabel lblInt2;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    // End of variables declaration//GEN-END:variables

}
