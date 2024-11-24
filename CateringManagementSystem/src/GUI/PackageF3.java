/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PackageF3 extends javax.swing.JFrame {

    /**
     * Creates new form FuneralPackagesFrame
     */
    public PackageF3() {
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

        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        prev1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Sort");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1080, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(210, 180, 140));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("The Premium Tribute Package elevates the catering experience, offering an \nexceptional blend of rich flavors and refined elegance, designed to honor a loved \none with the utmost respect and sophistication.\n\nFood Menu:\nLechon de Leche: Roasted whole suckling pig with crispy skin and tender meat, a centerpiece of indulgence.\nKare-Kare: A creamy peanut stew with oxtail, tripes, and vegetables, served with bagoong (shrimp paste) on the side.\nBaked Salmon: Perfectly baked salmon with lemon and herbs, offering a delicate and flavorful touch.\nBaked Macaroni: Creamy pasta with cheese, baked to perfection for a comforting, savory dish.\nLumpiang Sariwa: Fresh spring rolls with vegetables, shrimp, and a garlic-peanut sauce.\n\nSnacks:\nMaja Blanca: Creamy coconut pudding with corn kernels, a sweet traditional dessert.\nPineapple Tarts: Buttery tarts filled with sweet pineapple jam, perfect for a light snack.\nBeverages:\n\nCoffee Station: Specialty coffee options with premium blends and flavored syrups.\nAssorted Tea: A selection of premium teas like Earl Grey, chamomile, and oolong.\nFresh Fruit Juices: Mango, watermelon, and citrus juices, offering a refreshing variety.\n\nSetting & Decor:\nElegant Table Setting: Luxurious white silk tablecloths, gold and silver accents, fine china, crystal glassware, and polished silver cutlery.\nFloral Centerpieces: Exquisite arrangements of white roses, orchids, and greenery.\nCandles & Lighting: Soft, warm candlelight and ambient lighting for a sophisticated and serene environment.\nThe Premium Tribute Package offers an extraordinary experience, blending luxurious food, exquisite decor, and a refined atmosphere to honor a loved one in the most elegant way possible.\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 540, 290));

        jLabel3.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel3.setText("Palates & Plates Packages");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 620, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Package Id: 3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("₱700 per guest");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, 50));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, -40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(210, 180, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.setBackground(new java.awt.Color(205, 133, 63));
        next.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        next.setText("->");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel2.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 420, -1, 40));

        prev1.setBackground(new java.awt.Color(205, 133, 63));
        prev1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prev1.setText("<-");
        prev1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prev1ActionPerformed(evt);
            }
        });
        jPanel2.add(prev1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 40));

        jLabel2.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel2.setText("Opulent Remembrance Package");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 750, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/funeralThree.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 410));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextActionPerformed

    private void prev1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prev1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prev1ActionPerformed

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
            java.util.logging.Logger.getLogger(PackageF3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PackageF3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PackageF3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PackageF3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PackageF3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton next;
    private javax.swing.JButton prev1;
    // End of variables declaration//GEN-END:variables
}
