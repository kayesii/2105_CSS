/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Ivan
 */
public class BaptismPackages extends javax.swing.JFrame {

    /**
     * Creates new form BaptismPackagesFrame
     */
    public BaptismPackages() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBaptism = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();
        jButtonBooking = new javax.swing.JButton();
        jButtonCalendar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 150));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 222, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(205, 133, 63));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Baptism Packages");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1040, 30));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTableBaptism);

        jTableBaptism.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Food Menu", "Light Refreshments, Soft Drinks", "Refreshments, Custom Cake", "Refreshments, Custom Cake, Multi-course Meal"},
                {"Seating", "20 chairs, modest layout", "40 chairs, organized seating", "60 chairs, custom seating arrangements"},
                {"Tables", "20 chairs, modest layout", "6 tables, white linen covers", "8 tables, premium covers, floral centerpieces"},
                {"Decor", "Simple floral decor", "Floral decor, soft draping", "Full floral decor, custom draping, photo backdrop"},
                {"Tableware", "Disposable plates and cups", "Crockery, glassware", "Premium crockery, glassware, silverware"},
                {"Laborers", "2 service staff", "3 service staff", "5 service staff"},
                {"Amenities", "Basic linens", "Personalized table settings", "Personalized table settings, gift table"},
                {"Additional Options", "None", "Small gift area, guest book", "Full gift area, baptism candle stand, backdrop"},
                {"Price Estimate", "$250", "$450", "$750"}
            },
            new String [] {
                "Packages", "Basic Baptism", "Standard Baptism", "Premium Baptism"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBaptism.setCellSelectionEnabled(true);
        jTableBaptism.setFillsViewportHeight(true);
        jTableBaptism.setGridColor(new java.awt.Color(0, 0, 0));
        jTableBaptism.setMaximumSize(new java.awt.Dimension(2147483647, 360));
        jTableBaptism.setMinimumSize(new java.awt.Dimension(60, 360));
        jTableBaptism.setPreferredSize(new java.awt.Dimension(300, 342));
        jTableBaptism.setRowHeight(40);
        jTableBaptism.setSelectionBackground(new java.awt.Color(205, 133, 63));
        jTableBaptism.setShowGrid(true);
        jScrollPane1.setViewportView(jTableBaptism);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1040, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1080, 440));

        jPanel2.setBackground(new java.awt.Color(210, 180, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel1.setText("PALATES");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 280, 60));

        jLabel2.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel2.setText("&  PLATES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 280, 60));

        jButtonHome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonHome.setText("HOME");
        jPanel2.add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 160, 40));

        jButtonBooking.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonBooking.setText("BOOKING");
        jPanel2.add(jButtonBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 160, 40));

        jButtonCalendar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonCalendar.setText("CALENDAR");
        jPanel2.add(jButtonCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 160, 40));

        jButton4.setBackground(new java.awt.Color(205, 133, 63));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setText("PACKAGES");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 160, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 100));

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
            java.util.logging.Logger.getLogger(BaptismPackages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaptismPackages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaptismPackages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaptismPackages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* CreajTableBaptismdisplay the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaptismPackages().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonBooking;
    private javax.swing.JButton jButtonCalendar;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBaptism;
    // End of variables declaration//GEN-END:variables
}
