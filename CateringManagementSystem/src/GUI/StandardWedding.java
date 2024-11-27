/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Ivan
 */
public class StandardWedding extends javax.swing.JFrame {

    /**
     * Creates new form StandardWedding
     */
    public StandardWedding() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        prev1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(210, 180, 140));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel3.setText("Palates & Plates Packages");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 620, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("₱500 per guest");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, 50));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(210, 180, 140));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Food Menu\nAppetizers:\nCaprese skewers\nShrimp cocktail\nMain Dishes:\nHerb-crusted roast beef\nGrilled chicken breast with a light sauce\nBaked salmon with dill sauce\nRoasted vegetables\nMashed potatoes or rice pilaf\nSalads:\nCaesar salad\nFresh fruit salad\n\nSnacks\nCheese and cracker platter\nMini quiches\nAssorted bread rolls with butter\n\nBeverages\nSoft drinks\nSparkling water\nWine \nCoffee and tea\n\nSetting\nSeating:  chairs with elegant chair covers and ribbons\nTables:  tables with white or colored tablecloths\nBuffet-style or plated service\n\nDecor\nFloral centerpieces (moderate size, with seasonal blooms)\nElegant lighting\nTable settings with premium dinnerware and glassware\nLinen napkins in the wedding colors\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 540, 290));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("STANDARD WEDDING");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, 50));

        prev1.setBackground(new java.awt.Color(205, 133, 63));
        prev1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prev1.setText("<-");
        prev1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prev1ActionPerformed(evt);
            }
        });
        jPanel1.add(prev1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 40));

        jLabel2.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel2.setText("Elegant Romance Package");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 650, 60));

        next.setBackground(new java.awt.Color(205, 133, 63));
        next.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        next.setText("->");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 420, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/standard wedding.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prev1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prev1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prev1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(StandardWedding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StandardWedding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StandardWedding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StandardWedding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StandardWedding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton next;
    private javax.swing.JButton prev1;
    // End of variables declaration//GEN-END:variables
}
