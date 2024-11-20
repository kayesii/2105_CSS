
package GUI;

// Import necessary classes
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingProcess extends JFrame {
    
    // Constructor and other methods
    public BookingProcess() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClientNum = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTimeEnds = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        GuessCount = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        txtTheme = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtTimeStart1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        PackagesPick = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtAddOns = new java.awt.TextArea();
        BookBtn = new javax.swing.JButton();
        RecordBtn = new javax.swing.JButton();
        txtSearchCustomer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        RequestPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtRequest = new java.awt.TextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        DrinkPanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        barakoCoffee = new javax.swing.JCheckBox();
        bukoJuice = new javax.swing.JCheckBox();
        tsokolateTablea = new javax.swing.JCheckBox();
        calamansiJuice = new javax.swing.JCheckBox();
        cucumberLemonade = new javax.swing.JCheckBox();
        dalandanJuice = new javax.swing.JCheckBox();
        fruitPunch = new javax.swing.JCheckBox();
        guyabanoJuice = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        icedTea = new javax.swing.JCheckBox();
        mangoShake = new javax.swing.JCheckBox();
        melonJuice = new javax.swing.JCheckBox();
        pandanIcedTea = new javax.swing.JCheckBox();
        sagoTGulaman = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        MainDishesPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        beefCaldereta = new javax.swing.JCheckBox();
        bicolExpress = new javax.swing.JCheckBox();
        tinola = new javax.swing.JCheckBox();
        bulalo = new javax.swing.JCheckBox();
        chickenAdobo = new javax.swing.JCheckBox();
        chickenInasal = new javax.swing.JCheckBox();
        crispyPata = new javax.swing.JCheckBox();
        grilledBangus = new javax.swing.JCheckBox();
        grilledPorkBelly = new javax.swing.JCheckBox();
        kareKare = new javax.swing.JCheckBox();
        laing = new javax.swing.JCheckBox();
        lechonKawali = new javax.swing.JCheckBox();
        pinakbet = new javax.swing.JCheckBox();
        porkSisig = new javax.swing.JCheckBox();
        porkSinigang = new javax.swing.JCheckBox();
        seafoodKareKare = new javax.swing.JCheckBox();
        sinigangNaHipon = new javax.swing.JCheckBox();
        sweetAndSourLapuLapu = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        SideDishesPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        atchara = new javax.swing.JCheckBox();
        binagoonganRice = new javax.swing.JCheckBox();
        butteredCornAndCarrots = new javax.swing.JCheckBox();
        ensaladangLato = new javax.swing.JCheckBox();
        ensaladangTalong = new javax.swing.JCheckBox();
        freshLumpiaShanghai = new javax.swing.JCheckBox();
        garlicRice = new javax.swing.JCheckBox();
        ginisangAmpalaya = new javax.swing.JCheckBox();
        greenMangoSalad = new javax.swing.JCheckBox();
        lumpiangSariwa = new javax.swing.JCheckBox();
        macaroniSalad = new javax.swing.JCheckBox();
        pancitCanton = new javax.swing.JCheckBox();
        roastedMixedVegetables = new javax.swing.JCheckBox();
        pickCateringStyle = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Host = new javax.swing.JSpinner();
        WaitStaff = new javax.swing.JSpinner();
        jPanel8 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        ViewReceipt = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        PaymentStatus = new javax.swing.JComboBox<>();
        Save = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BtnCalendar = new javax.swing.JButton();
        BtnPackages = new javax.swing.JButton();
        BtnBooking = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnLaborer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 222, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(210, 180, 140));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Phone Number");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 20));

        txtClientNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNumActionPerformed(evt);
            }
        });
        jPanel3.add(txtClientNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 280, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Client Information");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 20));

        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 330, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 410, 150));

        jPanel4.setBackground(new java.awt.Color(210, 180, 140));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Guess Count");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 90, -1));

        txtTimeEnds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeEndsActionPerformed(evt);
            }
        });
        jPanel4.add(txtTimeEnds, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 140, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("Theme");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        jPanel4.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 230, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Event Details");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("Date");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 40, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setText("Time start");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 80, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel15.setText("Location");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, 20));
        jPanel4.add(GuessCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 80, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Time ends");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 70, -1));

        txtTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThemeActionPerformed(evt);
            }
        });
        jPanel4.add(txtTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 38, 240, -1));

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jPanel4.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 250, -1));

        txtTimeStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeStart1ActionPerformed(evt);
            }
        });
        jPanel4.add(txtTimeStart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 140, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 550, 150));

        jPanel5.setBackground(new java.awt.Color(210, 180, 140));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Package");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        PackagesPick.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose", "Funeral 1", "Funeral 2", "Funeral 3", "Birthday 1", "Birthday 2", "Birthday 3", "Baptism 1", "Baptism 2", "Baptism 3", "Wedding 1", "Weding 2", "Wedding 3" }));
        jPanel5.add(PackagesPick, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setText("Add ons:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 20));
        jPanel5.add(txtAddOns, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, 120));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 240, 210));

        BookBtn.setBackground(new java.awt.Color(205, 133, 63));
        BookBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BookBtn.setText("Book");
        BookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 220, 50));

        RecordBtn.setBackground(new java.awt.Color(210, 180, 140));
        RecordBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RecordBtn.setText("Records");
        RecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RecordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 50));

        txtSearchCustomer.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtSearchCustomer.setText("Enter Booking ID");
        txtSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(txtSearchCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 290, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Search Customer");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 160, 30));

        jPanel6.setBackground(new java.awt.Color(210, 180, 140));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RequestPanel.setBackground(new java.awt.Color(189, 158, 118));
        RequestPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel17.setText("Request");
        RequestPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));
        RequestPanel.add(txtRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 160, 100));

        jPanel6.add(RequestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 180, 140));

        DrinkPanel.setBackground(new java.awt.Color(189, 158, 118));
        DrinkPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel19.setText("& Desserts");
        DrinkPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, -1));

        barakoCoffee.setText("Barako Coffee");
        barakoCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barakoCoffeeActionPerformed(evt);
            }
        });
        DrinkPanel.add(barakoCoffee, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        bukoJuice.setText("Buko Juice");
        DrinkPanel.add(bukoJuice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        tsokolateTablea.setText("Tsokolate Tablea");
        DrinkPanel.add(tsokolateTablea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        calamansiJuice.setText("Calamansi Juice");
        DrinkPanel.add(calamansiJuice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        cucumberLemonade.setText("Cucumber Lemonade");
        DrinkPanel.add(cucumberLemonade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        dalandanJuice.setText("Dalandan Juice");
        DrinkPanel.add(dalandanJuice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        fruitPunch.setText("Fruit Punch");
        DrinkPanel.add(fruitPunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        guyabanoJuice.setText("Guyabano Juice");
        DrinkPanel.add(guyabanoJuice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel29.setText("Drink Refreshment");
        DrinkPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        icedTea.setText("Iced Tea");
        DrinkPanel.add(icedTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        mangoShake.setText("Mango Shake");
        DrinkPanel.add(mangoShake, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        melonJuice.setText("Melon Juice");
        DrinkPanel.add(melonJuice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        pandanIcedTea.setText("Pandan Iced Tea");
        DrinkPanel.add(pandanIcedTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        sagoTGulaman.setText("Sago’t Gulaman");
        DrinkPanel.add(sagoTGulaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jScrollPane1.setViewportView(DrinkPanel);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 150, 170));

        MainDishesPanel.setBackground(new java.awt.Color(189, 158, 118));
        MainDishesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel20.setText("Main Dishes");
        MainDishesPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, -1));

        beefCaldereta.setText("Beef Caldereta");
        beefCaldereta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beefCalderetaActionPerformed(evt);
            }
        });
        MainDishesPanel.add(beefCaldereta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        bicolExpress.setText("Bicol Express");
        MainDishesPanel.add(bicolExpress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        tinola.setText("Tinola");
        MainDishesPanel.add(tinola, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        bulalo.setText("Bulalo");
        bulalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulaloActionPerformed(evt);
            }
        });
        MainDishesPanel.add(bulalo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        chickenAdobo.setText("Chicken Adobo");
        MainDishesPanel.add(chickenAdobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        chickenInasal.setText("Chicken Inasal");
        MainDishesPanel.add(chickenInasal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        crispyPata.setText("Crispy Pata");
        crispyPata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crispyPataActionPerformed(evt);
            }
        });
        MainDishesPanel.add(crispyPata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        grilledBangus.setText("Grilled Bangus");
        MainDishesPanel.add(grilledBangus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        grilledPorkBelly.setText("Grilled Pork Belly");
        MainDishesPanel.add(grilledPorkBelly, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        kareKare.setText("Kare-Kare");
        MainDishesPanel.add(kareKare, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        laing.setText("Laing");
        MainDishesPanel.add(laing, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        lechonKawali.setText("Lechon Kawali");
        MainDishesPanel.add(lechonKawali, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        pinakbet.setText("Pinakbet");
        MainDishesPanel.add(pinakbet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        porkSisig.setText("Pork Sisig");
        MainDishesPanel.add(porkSisig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        porkSinigang.setText("Pork Sinigang");
        MainDishesPanel.add(porkSinigang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        seafoodKareKare.setText("Seafood Kare-Kare");
        MainDishesPanel.add(seafoodKareKare, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        sinigangNaHipon.setText("Sinigang na Hipon");
        MainDishesPanel.add(sinigangNaHipon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        sweetAndSourLapuLapu.setText("Sweet and Sour Lapu-Lapu");
        MainDishesPanel.add(sweetAndSourLapuLapu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jScrollPane2.setViewportView(MainDishesPanel);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 170));

        SideDishesPanel.setBackground(new java.awt.Color(189, 158, 118));
        SideDishesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel21.setText("Side Dishes");
        SideDishesPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, -1));

        atchara.setText("Atchara");
        atchara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atcharaActionPerformed(evt);
            }
        });
        SideDishesPanel.add(atchara, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        binagoonganRice.setText("Binagoongan Rice");
        SideDishesPanel.add(binagoonganRice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        butteredCornAndCarrots.setText("Buttered Corn and Carrots");
        SideDishesPanel.add(butteredCornAndCarrots, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        ensaladangLato.setText("Ensaladang Lato");
        SideDishesPanel.add(ensaladangLato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        ensaladangTalong.setText("Ensaladang Talong");
        SideDishesPanel.add(ensaladangTalong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        freshLumpiaShanghai.setText("Fresh Lumpia Shanghai");
        SideDishesPanel.add(freshLumpiaShanghai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        garlicRice.setText("Garlic Rice");
        SideDishesPanel.add(garlicRice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        ginisangAmpalaya.setText("Ginisang Ampalaya");
        SideDishesPanel.add(ginisangAmpalaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        greenMangoSalad.setText("Green Mango Salad");
        SideDishesPanel.add(greenMangoSalad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lumpiangSariwa.setText("Lumpiang Sariwa");
        SideDishesPanel.add(lumpiangSariwa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        macaroniSalad.setText("Macaroni Salad");
        SideDishesPanel.add(macaroniSalad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        pancitCanton.setText("Pancit Canton");
        SideDishesPanel.add(pancitCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        roastedMixedVegetables.setText("Roasted Mixed Vegetables");
        SideDishesPanel.add(roastedMixedVegetables, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jScrollPane3.setViewportView(SideDishesPanel);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 150, 170));

        pickCateringStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buffet catering", "Plated catering" }));
        jPanel6.add(pickCateringStyle, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 120, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Menu Selection");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 20));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel25.setText("Catering Style:");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, 20));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 680, 210));

        jPanel7.setBackground(new java.awt.Color(210, 180, 140));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel22.setText("No. of Waitstaff");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("Labor");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 20));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel24.setText("Host or Emcee");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 20));
        jPanel7.add(Host, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel7.add(WaitStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, 150, 150));

        jPanel8.setBackground(new java.awt.Color(210, 180, 140));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Payment");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel27.setText("Total Amount:");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, -1));

        txtTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAmountActionPerformed(evt);
            }
        });
        jPanel8.add(txtTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, -1));

        ViewReceipt.setText("View Receipt");
        jPanel8.add(ViewReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel28.setText("Payment Status:");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        PaymentStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Complete", "Cancelled" }));
        jPanel8.add(PaymentStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, 190, 210));

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1160, 470));

        jPanel2.setBackground(new java.awt.Color(210, 180, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCalendar.setBackground(new java.awt.Color(210, 180, 140));
        BtnCalendar.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        BtnCalendar.setText("CALENDAR");
        BtnCalendar.setBorder(null);
        BtnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalendarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 140, 40));

        BtnPackages.setBackground(new java.awt.Color(210, 180, 140));
        BtnPackages.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        BtnPackages.setText("PACKAGES");
        BtnPackages.setBorder(null);
        BtnPackages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPackagesActionPerformed(evt);
            }
        });
        jPanel2.add(BtnPackages, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 140, 40));

        BtnBooking.setBackground(new java.awt.Color(210, 180, 140));
        BtnBooking.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        BtnBooking.setText("BOOKING");
        BtnBooking.setBorder(null);
        BtnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBookingActionPerformed(evt);
            }
        });
        jPanel2.add(BtnBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 140, 40));

        BtnHome.setBackground(new java.awt.Color(205, 133, 63));
        BtnHome.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        BtnHome.setText("HOME");
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(BtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 140, 40));

        jLabel8.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel8.setText("PALATES  ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 280, 60));

        jLabel6.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel6.setText("&   plates");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 60));

        BtnLaborer.setBackground(new java.awt.Color(210, 180, 140));
        BtnLaborer.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        BtnLaborer.setText("LABOR");
        BtnLaborer.setBorder(null);
        BtnLaborer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLaborerActionPerformed(evt);
            }
        });
        jPanel2.add(BtnLaborer, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 140, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClientNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNumActionPerformed

    private void txtTimeEndsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeEndsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeEndsActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCustomerActionPerformed

    private void txtTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAmountActionPerformed

    private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBtnActionPerformed
        BookBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                BookingProcess booking = new BookingProcess();
                booking.setVisible(true);
                booking.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BookBtnActionPerformed

    private void RecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordBtnActionPerformed
        RecordBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                BookingFrame records = new BookingFrame();
                records.setVisible(true);
                records.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_RecordBtnActionPerformed

    private void txtThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThemeActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void BtnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalendarActionPerformed
        BtnCalendar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Calendar calendar = new Calendar();
                calendar.setVisible(true);
                calendar.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BtnCalendarActionPerformed

    private void BtnPackagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPackagesActionPerformed
        BtnPackages.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                PackagesFrame packages = new PackagesFrame();
                packages.setVisible(true);
                packages.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BtnPackagesActionPerformed

    private void BtnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBookingActionPerformed
        BtnBooking.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                BookingFrame bookingF = new BookingFrame();
                bookingF.setVisible(true);
                bookingF.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BtnBookingActionPerformed

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        BtnHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                HomeFrame home = new HomeFrame();
                home.setVisible(true);
                home.setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BtnHomeActionPerformed

    private void BtnLaborerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLaborerActionPerformed
        BtnLaborer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                LaborersFrame laborer = new LaborersFrame();
                laborer.setVisible(true);
                laborer .setLocationRelativeTo(null); // Center the SignUP frame
            }
        });
    }//GEN-LAST:event_BtnLaborerActionPerformed

    private void barakoCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barakoCoffeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barakoCoffeeActionPerformed

    private void beefCalderetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beefCalderetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beefCalderetaActionPerformed

    private void atcharaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atcharaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atcharaActionPerformed

    private void txtTimeStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeStart1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeStart1ActionPerformed

    private void bulaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulaloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bulaloActionPerformed

    private void crispyPataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crispyPataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crispyPataActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
                                
    String clientName = txtClientName.getText().trim();
    String clientNum = txtClientNum.getText().trim();

    // Validate client information
    if (clientName.isEmpty() || clientNum.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all client details.", "Client Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int clientID = -1;
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
        // Step 2: Check if client exists, insert if not
        String checkClientQuery = "SELECT ClientID FROM client WHERE ClientName = ? AND ClientNumber = ?";
        try (PreparedStatement ps = con.prepareStatement(checkClientQuery)) {
            ps.setString(1, clientName);
            ps.setString(2, clientNum);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                clientID = rs.getInt("ClientID");
            } else {
                // Insert new client if doesn't exist
                String insertClientQuery = "INSERT INTO client (ClientName, ClientNumber) VALUES (?, ?)";
                try (PreparedStatement insertClientStmt = con.prepareStatement(insertClientQuery, PreparedStatement.RETURN_GENERATED_KEYS)) {
                    insertClientStmt.setString(1, clientName);
                    insertClientStmt.setString(2, clientNum);
                    int rowsInserted = insertClientStmt.executeUpdate();
                    if (rowsInserted > 0) {
                        ResultSet generatedKeys = insertClientStmt.getGeneratedKeys();
                        if (generatedKeys.next()) {
                            clientID = generatedKeys.getInt(1);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to register the client.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
        }

        // Step 3: Get event details
        String theme = txtTheme.getText().trim();
        String date = txtDate.getText().trim();
        String location = txtLocation.getText().trim();
        String timeStart = txtTimeStart1.getText().trim();
        String timeEnd = txtTimeEnds.getText().trim();
        int guestCount = (Integer) GuessCount.getValue();
        int laborCount = (Integer) WaitStaff.getValue();
        String cateringStyle = (String) pickCateringStyle.getSelectedItem();

        // Validate event details
        if (theme.isEmpty() || date.isEmpty() || location.isEmpty() || timeStart.isEmpty() || timeEnd.isEmpty() || cateringStyle == null || cateringStyle.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please fill in all event details.", "Event Error", JOptionPane.ERROR_MESSAGE);
    return;
}

        // Step 4: Get package and menu information
        int selectedPackageId = (Integer) PackagesPick.getSelectedItem();
        double menuTotalPrice = 0;
        StringBuilder menuItems = new StringBuilder();

        if (atchara.isSelected()) {
            menuItems.append("Atchara, ");
            menuTotalPrice += getMenuPrice(1); // Assuming menu ID for Atchara
        }
        if (barakoCoffee.isSelected()) {
            menuItems.append("Barako Coffee, ");
            menuTotalPrice += getMenuPrice(2); // Assuming menu ID for Barako Coffee
        }
        // Remove trailing comma and space
        if (menuItems.length() > 0) {
            menuItems.setLength(menuItems.length() - 2);
        }

        // Step 5: Calculate total amount
        double totalAmount = calculateTotalAmount(selectedPackageId, menuTotalPrice, laborCount);

        // Step 6: Payment status
        String paymentStatus = (String) PaymentStatus.getSelectedItem();

        // Step 7: Insert booking details into the database
        String bookingQuery = "INSERT INTO booking (ClientID, PackageId, EventDate, NumberOfGuests, TotalPrice, Status, Theme, Location, TimeStart, TimeEnd, NumberOfLaborers, CateringStyle) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(bookingQuery)) {
            pst.setInt(1, clientID);
            pst.setInt(2, selectedPackageId);
            pst.setString(3, date);
            pst.setInt(4, guestCount);
            pst.setDouble(5, totalAmount);
            pst.setString(6, paymentStatus);
            pst.setString(7, theme);
            pst.setString(8, location);
            pst.setString(9, timeStart);
            pst.setString(10, timeEnd);
            pst.setInt(11, laborCount);
            pst.setString(12, cateringStyle);

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Booking saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to save the booking.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_SaveActionPerformed
// Method to fetch the price for a menu item
private double getMenuPrice(int menuId) {
    double price = 0;
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
        String menuQuery = "SELECT price FROM menu WHERE menuId = ?";
        try (PreparedStatement ps = con.prepareStatement(menuQuery)) {
            ps.setInt(1, menuId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                price = rs.getDouble("price");
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error fetching menu price: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return price;
}
private double calculateTotalAmount(int selectedPackageId, double menuTotalPrice, int laborCount) {
    double packagePrice = getPackagePrice(selectedPackageId); // Fetch package price from database
    double laborCost = laborCount * 1000; // Assuming labor cost is 1000 per laborer
    return packagePrice + menuTotalPrice + laborCost; // Calculate total amount
}



// Method to fetch the price for a package
private double getPackagePrice(int packageId) {
    double price = 0;
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/css_db", "root", "")) {
        String packageQuery = "SELECT Price FROM packages WHERE PackageId = ?";
        try (PreparedStatement ps = con.prepareStatement(packageQuery)) {
            ps.setInt(1, packageId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                price = rs.getDouble("Price");
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error fetching package price: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return price; }
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
            java.util.logging.Logger.getLogger(BookingProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new BookingProcess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookBtn;
    private javax.swing.JButton BtnBooking;
    private javax.swing.JButton BtnCalendar;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnLaborer;
    private javax.swing.JButton BtnPackages;
    private javax.swing.JPanel DrinkPanel;
    private javax.swing.JSpinner GuessCount;
    private javax.swing.JSpinner Host;
    private javax.swing.JPanel MainDishesPanel;
    private javax.swing.JComboBox<String> PackagesPick;
    private javax.swing.JComboBox<String> PaymentStatus;
    private javax.swing.JButton RecordBtn;
    private javax.swing.JPanel RequestPanel;
    private javax.swing.JButton Save;
    private javax.swing.JPanel SideDishesPanel;
    private javax.swing.JButton ViewReceipt;
    private javax.swing.JSpinner WaitStaff;
    private javax.swing.JCheckBox atchara;
    private javax.swing.JCheckBox barakoCoffee;
    private javax.swing.JCheckBox beefCaldereta;
    private javax.swing.JCheckBox bicolExpress;
    private javax.swing.JCheckBox binagoonganRice;
    private javax.swing.JCheckBox bukoJuice;
    private javax.swing.JCheckBox bulalo;
    private javax.swing.JCheckBox butteredCornAndCarrots;
    private javax.swing.JCheckBox calamansiJuice;
    private javax.swing.JCheckBox chickenAdobo;
    private javax.swing.JCheckBox chickenInasal;
    private javax.swing.JCheckBox crispyPata;
    private javax.swing.JCheckBox cucumberLemonade;
    private javax.swing.JCheckBox dalandanJuice;
    private javax.swing.JCheckBox ensaladangLato;
    private javax.swing.JCheckBox ensaladangTalong;
    private javax.swing.JCheckBox freshLumpiaShanghai;
    private javax.swing.JCheckBox fruitPunch;
    private javax.swing.JCheckBox garlicRice;
    private javax.swing.JCheckBox ginisangAmpalaya;
    private javax.swing.JCheckBox greenMangoSalad;
    private javax.swing.JCheckBox grilledBangus;
    private javax.swing.JCheckBox grilledPorkBelly;
    private javax.swing.JCheckBox guyabanoJuice;
    private javax.swing.JCheckBox icedTea;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox kareKare;
    private javax.swing.JCheckBox laing;
    private javax.swing.JCheckBox lechonKawali;
    private javax.swing.JCheckBox lumpiangSariwa;
    private javax.swing.JCheckBox macaroniSalad;
    private javax.swing.JCheckBox mangoShake;
    private javax.swing.JCheckBox melonJuice;
    private javax.swing.JCheckBox pancitCanton;
    private javax.swing.JCheckBox pandanIcedTea;
    private javax.swing.JComboBox<String> pickCateringStyle;
    private javax.swing.JCheckBox pinakbet;
    private javax.swing.JCheckBox porkSinigang;
    private javax.swing.JCheckBox porkSisig;
    private javax.swing.JCheckBox roastedMixedVegetables;
    private javax.swing.JCheckBox sagoTGulaman;
    private javax.swing.JCheckBox seafoodKareKare;
    private javax.swing.JCheckBox sinigangNaHipon;
    private javax.swing.JCheckBox sweetAndSourLapuLapu;
    private javax.swing.JCheckBox tinola;
    private javax.swing.JCheckBox tsokolateTablea;
    private java.awt.TextArea txtAddOns;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtClientNum;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtLocation;
    private java.awt.TextArea txtRequest;
    private javax.swing.JTextField txtSearchCustomer;
    private javax.swing.JTextField txtTheme;
    private javax.swing.JTextField txtTimeEnds;
    private javax.swing.JTextField txtTimeStart1;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables
}
