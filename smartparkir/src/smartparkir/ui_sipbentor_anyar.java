package smartparkir;
import java.sql.*;
import java.text.Format;
import javax.swing.*;
import javax.swing.table.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;
import java.util.Set;
//import static javaapplication26.random.generateRandomChars;
import net.proteanit.sql.DbUtils;

public class ui_sipbentor_anyar extends javax.swing.JFrame {
    public String tgl;
    ResultSet rs,rs1,rs2,rs3,rs4,rs5,rs6;
    public ui_sipbentor_anyar() {
        initComponents();
        tampil_staff();
        tampil_kendaraan();
        tampil_lokasi();
        tampil_parkir();
        total();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        beranda = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        transaksi = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        staff = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        main_beranda = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        total_kendaraan = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        total_pendapatan = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        total_staff = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        total_transaksi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        main_transaksi = new javax.swing.JPanel();
        btn_riwayat_transaksi = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_transaksi_baru = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        main_staff = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        scrollpane_staff = new javax.swing.JScrollPane();
        tabel_staff = new javax.swing.JTable();
        combo_staff = new javax.swing.JComboBox<>();
        cari_staff = new javax.swing.JTextField();
        edit_staff = new javax.swing.JButton();
        delete_staff = new javax.swing.JButton();
        btn_cari_staff = new javax.swing.JButton();
        reset_staff = new javax.swing.JButton();
        posisi_staff = new javax.swing.JTextField();
        simpan_staff = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        keterangan_staff = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        id_staff = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        nama_staff = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        alamat_staff = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        edit_staff1 = new javax.swing.JButton();
        riwayat_transaksi = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        scrollpane_service = new javax.swing.JScrollPane();
        tabel_lokasi = new javax.swing.JTable();
        combo_lokasi = new javax.swing.JComboBox<>();
        cari_lokasi = new javax.swing.JTextField();
        update_lokasi = new javax.swing.JButton();
        delete_lokasi = new javax.swing.JButton();
        scrollpane_detail = new javax.swing.JScrollPane();
        tabel_parkir = new javax.swing.JTable();
        combo_parkir = new javax.swing.JComboBox<>();
        cari_parkir = new javax.swing.JTextField();
        update_parkir = new javax.swing.JButton();
        delete_parkir = new javax.swing.JButton();
        btn_cari_lokasi = new javax.swing.JButton();
        reset_lokasi = new javax.swing.JButton();
        reset_parkir = new javax.swing.JButton();
        btn_cari_parkir = new javax.swing.JButton();
        insert_parkir = new javax.swing.JButton();
        edit_lokasi = new javax.swing.JButton();
        scrollpane_kendaraan = new javax.swing.JScrollPane();
        tabel_kendaraan = new javax.swing.JTable();
        combo_kendaraan = new javax.swing.JComboBox<>();
        btn_cari_kendaraan = new javax.swing.JButton();
        edit_kendaraan = new javax.swing.JButton();
        delete_kendaraan = new javax.swing.JButton();
        reset_kendaraan = new javax.swing.JButton();
        cari_kendaraan = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        simpan_transaksi_kendaraan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        keterangan_kendaraan = new javax.swing.JTextArea();
        jLabel53 = new javax.swing.JLabel();
        id_kendaraan = new javax.swing.JTextField();
        simpan_transaksi_lokasi = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        nama_lokasi = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        id_lokasi = new javax.swing.JTextField();
        tgl_parkir = new com.toedter.calendar.JDateChooser();
        jLabel84 = new javax.swing.JLabel();
        jam_keluar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        keterangan_lokasi = new javax.swing.JTextArea();
        jLabel85 = new javax.swing.JLabel();
        id_kendaraan_parkir = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jam_masuk = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        id_parkir = new javax.swing.JTextField();
        reset_kendaraan1 = new javax.swing.JButton();
        edit_parkir = new javax.swing.JButton();
        jLabel87 = new javax.swing.JLabel();
        id_staff_parkir = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(13, 13, 13));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SMARTPARKIR");
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, -1, -1));

        beranda.setBackground(new java.awt.Color(242, 185, 80));
        beranda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                berandaMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BERANDA");

        javax.swing.GroupLayout berandaLayout = new javax.swing.GroupLayout(beranda);
        beranda.setLayout(berandaLayout);
        berandaLayout.setHorizontalGroup(
            berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(berandaLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        berandaLayout.setVerticalGroup(
            berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        menu.add(beranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 141, 190, -1));

        transaksi.setBackground(new java.awt.Color(242, 185, 80));
        transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transaksiMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TRANSAKSI");

        javax.swing.GroupLayout transaksiLayout = new javax.swing.GroupLayout(transaksi);
        transaksi.setLayout(transaksiLayout);
        transaksiLayout.setHorizontalGroup(
            transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transaksiLayout.setVerticalGroup(
            transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        menu.add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 223, 190, -1));

        staff.setBackground(new java.awt.Color(242, 185, 80));
        staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                staffMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("STAFF");

        javax.swing.GroupLayout staffLayout = new javax.swing.GroupLayout(staff);
        staff.setLayout(staffLayout);
        staffLayout.setHorizontalGroup(
            staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        staffLayout.setVerticalGroup(
            staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        menu.add(staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 305, 190, -1));

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new java.awt.CardLayout());

        main_beranda.setBackground(new java.awt.Color(166, 72, 63));
        main_beranda.setPreferredSize(new java.awt.Dimension(735, 516));
        main_beranda.setRequestFocusEnabled(false);

        jPanel2.setBackground(new java.awt.Color(89, 21, 15));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Kendaraan");

        total_kendaraan.setEditable(false);
        total_kendaraan.setBackground(new java.awt.Color(89, 21, 15));
        total_kendaraan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        total_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        total_kendaraan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_kendaraan.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(total_kendaraan)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel10)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(total_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(89, 21, 15));

        jLabel8.setBackground(new java.awt.Color(89, 21, 15));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Pendapatan");

        total_pendapatan.setEditable(false);
        total_pendapatan.setBackground(new java.awt.Color(89, 21, 15));
        total_pendapatan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        total_pendapatan.setForeground(new java.awt.Color(255, 255, 255));
        total_pendapatan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_pendapatan.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(total_pendapatan)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(total_pendapatan, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(89, 21, 15));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Staff");

        total_staff.setEditable(false);
        total_staff.setBackground(new java.awt.Color(89, 21, 15));
        total_staff.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        total_staff.setForeground(new java.awt.Color(255, 255, 255));
        total_staff.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_staff.setBorder(null);
        total_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_staffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(total_staff, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(total_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(89, 21, 15));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Parkir");

        total_transaksi.setEditable(false);
        total_transaksi.setBackground(new java.awt.Color(89, 21, 15));
        total_transaksi.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        total_transaksi.setForeground(new java.awt.Color(255, 255, 255));
        total_transaksi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_transaksi.setBorder(null);
        total_transaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        total_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_transaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(total_transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(total_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BERANDA");

        refresh.setBackground(new java.awt.Color(242, 185, 80));
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_berandaLayout = new javax.swing.GroupLayout(main_beranda);
        main_beranda.setLayout(main_berandaLayout);
        main_berandaLayout.setHorizontalGroup(
            main_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_berandaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(main_berandaLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(main_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refresh)
                    .addGroup(main_berandaLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        main_berandaLayout.setVerticalGroup(
            main_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_berandaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel11)
                .addGap(65, 65, 65)
                .addGroup(main_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        main.add(main_beranda, "card2");

        main_transaksi.setBackground(new java.awt.Color(166, 72, 63));

        btn_riwayat_transaksi.setBackground(new java.awt.Color(89, 21, 15));
        btn_riwayat_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_riwayat_transaksiMousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Riwayat Transaksi");

        javax.swing.GroupLayout btn_riwayat_transaksiLayout = new javax.swing.GroupLayout(btn_riwayat_transaksi);
        btn_riwayat_transaksi.setLayout(btn_riwayat_transaksiLayout);
        btn_riwayat_transaksiLayout.setHorizontalGroup(
            btn_riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_riwayat_transaksiLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_riwayat_transaksiLayout.setVerticalGroup(
            btn_riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_riwayat_transaksiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(53, 53, 53))
        );

        btn_transaksi_baru.setBackground(new java.awt.Color(89, 21, 15));
        btn_transaksi_baru.setForeground(new java.awt.Color(255, 255, 255));
        btn_transaksi_baru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_transaksi_baruMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Transaksi Baru");

        javax.swing.GroupLayout btn_transaksi_baruLayout = new javax.swing.GroupLayout(btn_transaksi_baru);
        btn_transaksi_baru.setLayout(btn_transaksi_baruLayout);
        btn_transaksi_baruLayout.setHorizontalGroup(
            btn_transaksi_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_transaksi_baruLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(50, 50, 50))
        );
        btn_transaksi_baruLayout.setVerticalGroup(
            btn_transaksi_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_transaksi_baruLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(55, 55, 55))
        );

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TRANSAKSI");

        javax.swing.GroupLayout main_transaksiLayout = new javax.swing.GroupLayout(main_transaksi);
        main_transaksi.setLayout(main_transaksiLayout);
        main_transaksiLayout.setHorizontalGroup(
            main_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_transaksiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_transaksi_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_riwayat_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );
        main_transaksiLayout.setVerticalGroup(
            main_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_transaksiLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel16)
                .addGap(130, 130, 130)
                .addGroup(main_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_riwayat_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_transaksi_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main.add(main_transaksi, "card2");

        main_staff.setBackground(new java.awt.Color(166, 72, 63));

        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("STAFF");

        tabel_staff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_staff.setGridColor(java.awt.Color.red);
        scrollpane_staff.setViewportView(tabel_staff);

        combo_staff.setBackground(new java.awt.Color(242, 185, 80));
        combo_staff.setForeground(new java.awt.Color(255, 255, 255));
        combo_staff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cari berdasarkan", "ID Staff", "Nama", "Alamat", "Posisi", "Keterangan", "Dihapus" }));

        edit_staff.setBackground(new java.awt.Color(242, 185, 80));
        edit_staff.setForeground(new java.awt.Color(255, 255, 255));
        edit_staff.setText("Update");
        edit_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_staffActionPerformed(evt);
            }
        });

        delete_staff.setBackground(new java.awt.Color(242, 185, 80));
        delete_staff.setForeground(new java.awt.Color(255, 255, 255));
        delete_staff.setText("Hapus");
        delete_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_staffActionPerformed(evt);
            }
        });

        btn_cari_staff.setBackground(new java.awt.Color(242, 185, 80));
        btn_cari_staff.setForeground(new java.awt.Color(255, 255, 255));
        btn_cari_staff.setText("Cari");
        btn_cari_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari_staffActionPerformed(evt);
            }
        });

        reset_staff.setBackground(new java.awt.Color(242, 185, 80));
        reset_staff.setForeground(new java.awt.Color(255, 255, 255));
        reset_staff.setText("Refresh");
        reset_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_staffActionPerformed(evt);
            }
        });

        posisi_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        posisi_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posisi_staffActionPerformed(evt);
            }
        });

        simpan_staff.setBackground(new java.awt.Color(242, 185, 80));
        simpan_staff.setForeground(new java.awt.Color(255, 255, 255));
        simpan_staff.setText("Tambah");
        simpan_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_staffActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Keterangan");

        keterangan_staff.setColumns(20);
        keterangan_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        keterangan_staff.setRows(5);
        jScrollPane3.setViewportView(keterangan_staff);

        jLabel37.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("ID Staff");

        id_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_staffActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Nama");

        nama_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nama_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_staffActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Alamat");

        alamat_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        alamat_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamat_staffActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Posisi");

        edit_staff1.setBackground(new java.awt.Color(242, 185, 80));
        edit_staff1.setForeground(new java.awt.Color(255, 255, 255));
        edit_staff1.setText("Edit");
        edit_staff1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_staff1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_staffLayout = new javax.swing.GroupLayout(main_staff);
        main_staff.setLayout(main_staffLayout);
        main_staffLayout.setHorizontalGroup(
            main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_staffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpane_staff)
                    .addGroup(main_staffLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(main_staffLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_staffLayout.createSequentialGroup()
                        .addComponent(combo_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cari_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cari_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(simpan_staff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_staff1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_staff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset_staff))
                    .addGroup(main_staffLayout.createSequentialGroup()
                        .addGroup(main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(54, 54, 54)
                        .addGroup(main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama_staff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alamat_staff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel40))
                        .addGap(18, 18, 18)
                        .addGroup(main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(posisi_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        main_staffLayout.setVerticalGroup(
            main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_staffLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel18)
                .addGap(44, 44, 44)
                .addGroup(main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(id_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(posisi_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_staffLayout.createSequentialGroup()
                        .addGroup(main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel38))
                        .addGap(25, 25, 25)
                        .addGroup(main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alamat_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari_staff)
                    .addComponent(edit_staff)
                    .addComponent(delete_staff)
                    .addComponent(reset_staff)
                    .addComponent(cari_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpan_staff)
                    .addComponent(edit_staff1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollpane_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );

        main.add(main_staff, "card2");

        riwayat_transaksi.setBackground(new java.awt.Color(166, 72, 63));

        jLabel20.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("RIWAYAT TRANSAKSI DAN KENDARAAAN");

        tabel_lokasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_lokasi.setGridColor(java.awt.Color.red);
        scrollpane_service.setViewportView(tabel_lokasi);

        combo_lokasi.setBackground(new java.awt.Color(242, 185, 80));
        combo_lokasi.setForeground(new java.awt.Color(255, 255, 255));
        combo_lokasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cari berdasarkan", "ID Lokasi", "Nama Lokasi", "Status", "Keterangan" }));

        update_lokasi.setBackground(new java.awt.Color(242, 185, 80));
        update_lokasi.setForeground(new java.awt.Color(255, 255, 255));
        update_lokasi.setText("Update");
        update_lokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_lokasiActionPerformed(evt);
            }
        });

        delete_lokasi.setBackground(new java.awt.Color(242, 185, 80));
        delete_lokasi.setForeground(new java.awt.Color(255, 255, 255));
        delete_lokasi.setText("Hapus");
        delete_lokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_lokasiActionPerformed(evt);
            }
        });

        tabel_parkir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_parkir.setGridColor(java.awt.Color.red);
        scrollpane_detail.setViewportView(tabel_parkir);

        combo_parkir.setBackground(new java.awt.Color(242, 185, 80));
        combo_parkir.setForeground(new java.awt.Color(255, 255, 255));
        combo_parkir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cari berdasarkan", "ID Parkir", "Tanggal", "Plat Nomor", "ID Lokasi", "Jam Masuk", "Jam Keluar", "Staf Pelayan", "Biaya" }));

        update_parkir.setBackground(new java.awt.Color(242, 185, 80));
        update_parkir.setForeground(new java.awt.Color(255, 255, 255));
        update_parkir.setText("Update");
        update_parkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_parkirActionPerformed(evt);
            }
        });

        delete_parkir.setBackground(new java.awt.Color(242, 185, 80));
        delete_parkir.setForeground(new java.awt.Color(255, 255, 255));
        delete_parkir.setText("Hapus");
        delete_parkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_parkirActionPerformed(evt);
            }
        });

        btn_cari_lokasi.setBackground(new java.awt.Color(242, 185, 80));
        btn_cari_lokasi.setForeground(new java.awt.Color(255, 255, 255));
        btn_cari_lokasi.setText("Cari");
        btn_cari_lokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari_lokasiActionPerformed(evt);
            }
        });

        reset_lokasi.setBackground(new java.awt.Color(242, 185, 80));
        reset_lokasi.setForeground(new java.awt.Color(255, 255, 255));
        reset_lokasi.setText("Refresh");
        reset_lokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_lokasiActionPerformed(evt);
            }
        });

        reset_parkir.setBackground(new java.awt.Color(242, 185, 80));
        reset_parkir.setForeground(new java.awt.Color(255, 255, 255));
        reset_parkir.setText("Refresh");
        reset_parkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_parkirActionPerformed(evt);
            }
        });

        btn_cari_parkir.setBackground(new java.awt.Color(242, 185, 80));
        btn_cari_parkir.setForeground(new java.awt.Color(255, 255, 255));
        btn_cari_parkir.setText("Cari");
        btn_cari_parkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari_parkirActionPerformed(evt);
            }
        });

        insert_parkir.setBackground(new java.awt.Color(242, 185, 80));
        insert_parkir.setForeground(new java.awt.Color(255, 255, 255));
        insert_parkir.setText("Tambah");
        insert_parkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_parkirActionPerformed(evt);
            }
        });

        edit_lokasi.setBackground(new java.awt.Color(242, 185, 80));
        edit_lokasi.setForeground(new java.awt.Color(255, 255, 255));
        edit_lokasi.setText("Edit");
        edit_lokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_lokasiActionPerformed(evt);
            }
        });

        tabel_kendaraan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_kendaraan.setGridColor(java.awt.Color.red);
        scrollpane_kendaraan.setViewportView(tabel_kendaraan);

        combo_kendaraan.setBackground(new java.awt.Color(242, 185, 80));
        combo_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        combo_kendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cari berdasarkan", "Plat Nomor", "Keterangan" }));

        btn_cari_kendaraan.setBackground(new java.awt.Color(242, 185, 80));
        btn_cari_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        btn_cari_kendaraan.setText("Cari");
        btn_cari_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari_kendaraanActionPerformed(evt);
            }
        });

        edit_kendaraan.setBackground(new java.awt.Color(242, 185, 80));
        edit_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        edit_kendaraan.setText("Update");
        edit_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_kendaraanActionPerformed(evt);
            }
        });

        delete_kendaraan.setBackground(new java.awt.Color(242, 185, 80));
        delete_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        delete_kendaraan.setText("Hapus");
        delete_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_kendaraanActionPerformed(evt);
            }
        });

        reset_kendaraan.setBackground(new java.awt.Color(242, 185, 80));
        reset_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        reset_kendaraan.setText("Refresh");
        reset_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_kendaraanActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Keterangan Kendaraan");

        simpan_transaksi_kendaraan.setBackground(new java.awt.Color(242, 185, 80));
        simpan_transaksi_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        simpan_transaksi_kendaraan.setText("Tambah");
        simpan_transaksi_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_transaksi_kendaraanActionPerformed(evt);
            }
        });

        keterangan_kendaraan.setColumns(20);
        keterangan_kendaraan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        keterangan_kendaraan.setRows(5);
        jScrollPane1.setViewportView(keterangan_kendaraan);

        jLabel53.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Plat Nomor");

        id_kendaraan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_kendaraanActionPerformed(evt);
            }
        });

        simpan_transaksi_lokasi.setBackground(new java.awt.Color(242, 185, 80));
        simpan_transaksi_lokasi.setForeground(new java.awt.Color(255, 255, 255));
        simpan_transaksi_lokasi.setText("Tambah");
        simpan_transaksi_lokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_transaksi_lokasiActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Tanggal");

        jLabel76.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Nama Lokasi");

        nama_lokasi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nama_lokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_lokasiActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("ID Lokasi");

        id_lokasi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_lokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_lokasiActionPerformed(evt);
            }
        });

        tgl_parkir.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tgl_parkirPropertyChange(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(240, 240, 240));
        jLabel84.setText("Jam Keluar");

        jam_keluar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jam_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam_keluarActionPerformed(evt);
            }
        });

        keterangan_lokasi.setColumns(20);
        keterangan_lokasi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        keterangan_lokasi.setRows(5);
        jScrollPane2.setViewportView(keterangan_lokasi);

        jLabel85.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(240, 240, 240));
        jLabel85.setText("Plat Nomor");

        id_kendaraan_parkir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_kendaraan_parkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_kendaraan_parkirActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(240, 240, 240));
        jLabel86.setText("Jam Masuk");

        jam_masuk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jam_masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam_masukActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(240, 240, 240));
        jLabel82.setText("Keterangan");

        jLabel88.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(240, 240, 240));
        jLabel88.setText("ID Parkir");

        id_parkir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_parkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_parkirActionPerformed(evt);
            }
        });

        reset_kendaraan1.setBackground(new java.awt.Color(242, 185, 80));
        reset_kendaraan1.setForeground(new java.awt.Color(255, 255, 255));
        reset_kendaraan1.setText("Edit");
        reset_kendaraan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_kendaraan1ActionPerformed(evt);
            }
        });

        edit_parkir.setBackground(new java.awt.Color(242, 185, 80));
        edit_parkir.setForeground(new java.awt.Color(255, 255, 255));
        edit_parkir.setText("Edit");
        edit_parkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_parkirActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(240, 240, 240));
        jLabel87.setText("ID Staff");

        id_staff_parkir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_staff_parkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_staff_parkirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout riwayat_transaksiLayout = new javax.swing.GroupLayout(riwayat_transaksi);
        riwayat_transaksi.setLayout(riwayat_transaksiLayout);
        riwayat_transaksiLayout.setHorizontalGroup(
            riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpane_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollpane_service, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(id_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76)
                    .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel91)
                            .addComponent(id_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(93, 93, 93))
            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                        .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel20))
                            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(combo_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(cari_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btn_cari_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(simpan_transaksi_kendaraan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset_kendaraan1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edit_kendaraan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete_kendaraan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset_kendaraan))
                            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(combo_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cari_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cari_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(simpan_transaksi_lokasi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edit_lokasi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update_lokasi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete_lokasi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset_lokasi)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                                .addComponent(scrollpane_detail)
                                .addGap(33, 33, 33)
                                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel88)
                                    .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(id_parkir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel87)
                                            .addComponent(id_staff_parkir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel75)
                                    .addComponent(tgl_parkir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel85)
                                    .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel86)
                                            .addComponent(jLabel84)
                                            .addComponent(jam_masuk)
                                            .addComponent(jam_keluar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                            .addComponent(id_kendaraan_parkir))))
                                .addGap(71, 71, 71))
                            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                                .addComponent(combo_parkir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cari_parkir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn_cari_parkir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(insert_parkir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edit_parkir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update_parkir)
                                .addGap(8, 8, 8)
                                .addComponent(delete_parkir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset_parkir)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        riwayat_transaksiLayout.setVerticalGroup(
            riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel20)
                .addGap(6, 6, 6)
                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollpane_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(6, 6, 6)
                        .addComponent(id_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel62)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari_kendaraan)
                    .addComponent(simpan_transaksi_kendaraan)
                    .addComponent(edit_kendaraan)
                    .addComponent(delete_kendaraan)
                    .addComponent(reset_kendaraan)
                    .addComponent(reset_kendaraan1))
                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                                .addComponent(jLabel91)
                                .addGap(3, 3, 3)
                                .addComponent(id_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nama_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, riwayat_transaksiLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(scrollpane_service, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cari_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cari_lokasi)
                        .addComponent(simpan_transaksi_lokasi)
                        .addComponent(update_lokasi)
                        .addComponent(delete_lokasi)
                        .addComponent(reset_lokasi)
                        .addComponent(edit_lokasi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                        .addComponent(scrollpane_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cari_parkir)
                            .addComponent(insert_parkir)
                            .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(update_parkir)
                                .addComponent(edit_parkir))
                            .addComponent(delete_parkir)
                            .addComponent(reset_parkir)
                            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_parkir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cari_parkir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                        .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(jLabel75))
                        .addGap(6, 6, 6)
                        .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_kendaraan_parkir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgl_parkir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                                .addComponent(jLabel86)
                                .addGap(6, 6, 6)
                                .addComponent(jam_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel88)
                                .addGap(6, 6, 6)
                                .addComponent(id_parkir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(jLabel87))
                        .addGap(6, 6, 6)
                        .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jam_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_staff_parkir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        main.add(riwayat_transaksi, "card2");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void total_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_transaksiActionPerformed
    }//GEN-LAST:event_total_transaksiActionPerformed
    private void total_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_staffActionPerformed
    }//GEN-LAST:event_total_staffActionPerformed
    private void berandaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_berandaMousePressed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(main_beranda);
        main.repaint();
        main.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_berandaMousePressed
    private void transaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMousePressed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(riwayat_transaksi);
        main.repaint();
        main.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_transaksiMousePressed
    private void staffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffMousePressed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(main_staff);
        main.repaint();
        main.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_staffMousePressed
    private void btn_riwayat_transaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayat_transaksiMousePressed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(riwayat_transaksi);
        main.repaint();
        main.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_riwayat_transaksiMousePressed
    private void btn_transaksi_baruMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksi_baruMousePressed
   
    }//GEN-LAST:event_btn_transaksi_baruMousePressed
    private void id_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_staffActionPerformed
    }//GEN-LAST:event_id_staffActionPerformed
    private void nama_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_staffActionPerformed
    }//GEN-LAST:event_nama_staffActionPerformed
    private void alamat_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamat_staffActionPerformed
    }//GEN-LAST:event_alamat_staffActionPerformed
    private void posisi_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posisi_staffActionPerformed
    }//GEN-LAST:event_posisi_staffActionPerformed
    private void simpan_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_staffActionPerformed
        try{
            String sql="insert into staf values('"
                    +id_staff.getText()+"','"
                    +nama_staff.getText()+"','"
                    +alamat_staff.getText()+"','"
                    +posisi_staff.getText()+"','"
                    +keterangan_staff.getText()+"','"
                    +0+"')";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampil_staff();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan\n Mohon dicek kembali pengisiannya");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_simpan_staffActionPerformed

    private void delete_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_staffActionPerformed
        try {
            String sql1 = "update staf set Deleted = 1 where IDStaf = '" +cari_staff.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            pst1.executeUpdate();
            pst1.close();
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_delete_staffActionPerformed

    private void btn_cari_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari_staffActionPerformed
        switch (combo_staff.getSelectedIndex()) {
            case 1:
                try{
                    String sql="select IDStaf,NamaStaf,Alamat,Posisi,Keterangan from staf where Deleted=0 and IDStaf like '%" + cari_staff.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_staff.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 2:
                try{
                    String sql="select IDStaf,NamaStaf,Alamat,Posisi,Keterangan from staf where Deleted=0 and NamaStaf like '%" + cari_staff.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_staff.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 3:
                try{
                    String sql="select IDStaf,NamaStaf,Alamat,Posisi,Keterangan from staf where Deleted=0 and Alamat like '%" + cari_staff.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_staff.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 4:
                try{
                    String sql="select IDStaf,NamaStaf,Alamat,Posisi,Keterangan from staf where Deleted=0 and Posisi like '%" + cari_staff.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_staff.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 5:
                try{
                    String sql="select IDStaf,NamaStaf,Alamat,Posisi,Keterangan from staf where Deleted=0 and Keterangan like '%" + cari_staff.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_staff.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            default:
                break;
        }
    }//GEN-LAST:event_btn_cari_staffActionPerformed

    private void reset_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_staffActionPerformed
        tampil_staff();
        cari_staff.setText("");
        combo_staff.setSelectedIndex(0);
        id_staff.setText("");
        nama_staff.setText("");
        alamat_staff.setText("");
        posisi_staff.setText("");
        keterangan_staff.setText("");
    }//GEN-LAST:event_reset_staffActionPerformed

    private void btn_cari_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari_kendaraanActionPerformed
        switch (combo_kendaraan.getSelectedIndex()) {
            case 1:
                try{
                    String sql="select IDKendaraan,Keterangan from kendaraan where Deleted=0 and IDKendaraan like '%" + cari_kendaraan.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_kendaraan.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 2:
                try{
                    String sql="select IDKendaraan,Keterangan from kendaraan where Deleted=0 and Keterangan like '%" + cari_kendaraan.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_kendaraan.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn_cari_kendaraanActionPerformed

    private void reset_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_kendaraanActionPerformed
        tampil_kendaraan();
        cari_kendaraan.setText("");
        combo_kendaraan.setSelectedIndex(0);
        id_kendaraan.setText("");
        keterangan_kendaraan.setText("");
    }//GEN-LAST:event_reset_kendaraanActionPerformed

    private void btn_cari_lokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari_lokasiActionPerformed
        switch (combo_lokasi.getSelectedIndex()) {
            case 1:
                try{
                    String sql="select IDLokasi,NamaLokasi,Keterangan,Status from lokasiparkir where Deleted=0 and IDLokasi like '%" + cari_lokasi.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_lokasi.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 2:
                try{
                    String sql="select IDLokasi,NamaLokasi,Keterangan,Status from lokasiparkir where Deleted=0 and NamaLokasi like '%" + cari_lokasi.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_lokasi.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 3:
                try{
                    String sql="select IDLokasi,NamaLokasi,Keterangan,Status from lokasiparkir where Deleted=0 and Status like '%" + cari_lokasi.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_lokasi.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 4:
                try{
                    String sql="select IDLokasi,NamaLokasi,Keterangan,Status from lokasiparkir where Deleted=0 and Keterangan like '%" + cari_lokasi.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_lokasi.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn_cari_lokasiActionPerformed

    private void reset_lokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_lokasiActionPerformed
        tampil_lokasi();
        cari_lokasi.setText("");
        combo_lokasi.setSelectedIndex(0);
        id_lokasi.setText("");
        nama_lokasi.setText("");
        keterangan_lokasi.setText("");
    }//GEN-LAST:event_reset_lokasiActionPerformed

    private void btn_cari_parkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari_parkirActionPerformed
        switch (combo_parkir.getSelectedIndex()) {
            case 1:
                try{
                    String sql="select * from parkir where IDParkir like '%" + cari_parkir.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_parkir.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 2:
                try{
                    String sql="select * from parkir where TglParkir like '%" + cari_parkir.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_parkir.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 3:
                try{
                    String sql="select * from parkir where IDKendaraan like '%" + cari_parkir.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_parkir.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 4:
                try{
                    String sql="select * from parkir where IDLokasi like '%" + cari_parkir.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_parkir.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 5:
                try{
                    String sql="select * from parkir where JamMasuk like '%" + cari_parkir.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_parkir.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 6:
                try{
                    String sql="select * from parkir where JamKeluar like '%" + cari_parkir.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_parkir.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 7:
                try{
                    String sql="select * from parkir where IDStaf like '%" + cari_parkir.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_parkir.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 8:
                try{
                    String sql="select * from parkir where Biaya like '%" + cari_parkir.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_parkir.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn_cari_parkirActionPerformed

    private void edit_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_staffActionPerformed
        try{
            String sql_nama = "update staf set NamaStaf='" + nama_staff.getText() + "'where IDStaf='" + id_staff.getText() + "'";
            String sql_alamat = "update staf set Alamat='" + alamat_staff.getText() + "'where IDStaf='" + id_staff.getText() + "'";
            String sql_posisi = "update staf set Posisi='" + posisi_staff.getText() + "'where IDStaf='" + id_staff.getText() + "'";
            String sql_keterangan = "update staf set Keterangan='" + keterangan_staff.getText() + "'where IDStaf='" + id_staff.getText() + "'";
            
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql_nama);
            java.sql.PreparedStatement pst2=conn.prepareStatement(sql_alamat);
            java.sql.PreparedStatement pst3=conn.prepareStatement(sql_posisi);
            java.sql.PreparedStatement pst4=conn.prepareStatement(sql_keterangan);
            pst1.executeUpdate();
            pst2.executeUpdate();
            pst3.executeUpdate();
            pst4.executeUpdate();
            pst1.close();
            pst2.close();
            pst3.close();
            pst4.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Gagal diubah");
        }
    }//GEN-LAST:event_edit_staffActionPerformed

    private void edit_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_kendaraanActionPerformed
        try{
            String sql_keterangan = "update kendaraan set Keterangan='" + keterangan_kendaraan.getText() + "'where IDKendaraan='" + id_kendaraan.getText() + "'";
            
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst4=conn.prepareStatement(sql_keterangan);
            pst4.executeUpdate();
            pst4.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_edit_kendaraanActionPerformed

    private void update_lokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_lokasiActionPerformed
        try{
            String sql_tanggal = "update lokasiparkir set Keterangan='" + keterangan_lokasi.getText() + "'where IDLokasi='" + id_lokasi.getText() + "'";
            String sql_pelayan = "update lokasiparkir set NamaLokasi='" + nama_lokasi.getText() + "'where IDLokasi='" + id_lokasi.getText() + "'";
//            update_totalbiaya();
//            String sql2="update service set TotalBiaya="+String.valueOf(rs1.getString(1))+" where IDLokasi='"+cari_lokasi.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql_tanggal);
//            java.sql.PreparedStatement pst2=conn.prepareStatement(sql2);
            java.sql.PreparedStatement pst3=conn.prepareStatement(sql_pelayan);
            pst1.executeUpdate();
//            pst2.executeUpdate();
            pst3.executeUpdate();
            pst1.close();
//            pst2.close();
            pst3.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_update_lokasiActionPerformed

    private void update_parkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_parkirActionPerformed
        int k=Integer.parseInt(jam_keluar.getText());
        int m=Integer.parseInt(jam_masuk.getText());
        try{
            String sql_part = "update parkir set TglParkir='" + tgl + "'where IDParkir='" + id_parkir.getText() + "'";
            String sql_harga = "update parkir set JamKeluar='" + k + "'where IDParkir='" + id_parkir.getText() + "'";
            String sql_ongkos = "update parkir set JamMasuk='" + m + "'where IDParkir='" + id_parkir.getText() + "'";
            String sql_keterangan = "update parkir set IDKendaraan='" + id_kendaraan_parkir.getText() + "'where IDParkir='" + id_parkir.getText() + "'";
//            String sql_service = "update parkir set IDLokasi='" + id_lokasi_parkir.getText() + "'where IDParkir='" + id_parkir.getText() + "'";
            String sql_staf_parkir = "update parkir set IDStaf='" + id_staff_parkir.getText() + "'where IDParkir='" + id_parkir.getText() + "'";
            
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql_part);
            java.sql.PreparedStatement pst2=conn.prepareStatement(sql_harga);
            java.sql.PreparedStatement pst3=conn.prepareStatement(sql_ongkos);
            java.sql.PreparedStatement pst4=conn.prepareStatement(sql_keterangan);
//            java.sql.PreparedStatement pst5=conn.prepareStatement(sql_service);
            java.sql.PreparedStatement pst6=conn.prepareStatement(sql_staf_parkir);
            pst1.executeUpdate();
            pst2.executeUpdate();
            pst3.executeUpdate();
            pst4.executeUpdate();
//            pst5.executeUpdate();
            pst6.executeUpdate();
            pst1.close();
            pst2.close();
            pst3.close();
            pst4.close();
//            pst5.close();
            pst6.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_update_parkirActionPerformed

    private void reset_parkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_parkirActionPerformed
       tampil_parkir();
       cari_parkir.setText("");
       combo_parkir.setSelectedIndex(0);
       id_parkir.setText("");
//       id_lokasi_parkir.setText("");
       jam_keluar.setText("");
       id_kendaraan_parkir.setText("");
       jam_masuk.setText("");
//       id_lokasi_parkir.setText("");
       id_staff_parkir.setText("");
    }//GEN-LAST:event_reset_parkirActionPerformed

    private void delete_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_kendaraanActionPerformed
        try {
            String sql1 = "update kendaraan set Deleted = 1 where IDKendaraan = '" +cari_kendaraan.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            pst1.executeUpdate();
            pst1.close();
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_delete_kendaraanActionPerformed

    private void delete_lokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_lokasiActionPerformed
        try {
            String sql1 = "update lokasiparkir set Deleted = 1 where IDLokasi = '" +cari_lokasi.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            pst1.executeUpdate();
            pst1.close();
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Gagal Dihapus");
        }
    }//GEN-LAST:event_delete_lokasiActionPerformed

    private void delete_parkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_parkirActionPerformed
        try {
            String sql = "select IDLokasi from parkir where IDParkir = '" +cari_parkir.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            rs.next();
            String sql1 = "delete from parkir where IDParkir = '" +cari_parkir.getText()+"'";
            String sql2 = "update lokasiparkir set Status='Kosong' where IDLokasi = '" +String.valueOf(rs.getString(1))+"'";
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            pst1.executeUpdate();
            pst1.close();
            java.sql.PreparedStatement pst2=conn.prepareStatement(sql2);
            pst2.executeUpdate();
            pst2.close();
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_delete_parkirActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        total();
    }//GEN-LAST:event_refreshActionPerformed

    private void id_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_kendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_kendaraanActionPerformed

    private void simpan_transaksi_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_transaksi_kendaraanActionPerformed
        try{
            String sql="insert into kendaraan values('"
                    +id_kendaraan.getText()+"','"
                    +keterangan_kendaraan.getText()+"','"
                    +0+"')";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampil_kendaraan();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan\n Mohon dicek kembali pengisiannya");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_simpan_transaksi_kendaraanActionPerformed

    private void simpan_transaksi_lokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_transaksi_lokasiActionPerformed
        int p=Integer.parseInt(id_lokasi.getText());
        try{
            String sql="insert into lokasiparkir values('"
                    +p+"','"
                    +nama_lokasi.getText()+"','"
                    +keterangan_lokasi.getText()+"','"
                    +"Kosong"+"','"
                    +0+"')";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampil_lokasi();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan\n Mohon dicek kembali pengisiannya");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_simpan_transaksi_lokasiActionPerformed

    private void tgl_parkirPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tgl_parkirPropertyChange
        if (tgl_parkir.getDate()!=null){
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            tgl=format.format(tgl_parkir.getDate());
        }   
    }//GEN-LAST:event_tgl_parkirPropertyChange

    private void nama_lokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_lokasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_lokasiActionPerformed

    private void jam_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam_keluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jam_keluarActionPerformed

    private void id_kendaraan_parkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_kendaraan_parkirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_kendaraan_parkirActionPerformed

    private void jam_masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam_masukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jam_masukActionPerformed

    private void id_parkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_parkirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_parkirActionPerformed

    private void id_lokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_lokasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_lokasiActionPerformed

    private void insert_parkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_parkirActionPerformed
        int k=Integer.parseInt(jam_keluar.getText());
        int m=Integer.parseInt(jam_masuk.getText());
        int b = 0;
        if((k-m)>12){
            b = 20000+10000*(k-m-12);
        }else if((k-m)>8){
            b = 20000;
        }else if((k-m)>4){
            b = 15000;
        }else{
            b = 10000;
        }
        try{
            String parkir = "select min(IDLokasi) from lokasiparkir where Status='Kosong'";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement parkir_1=conn.prepareStatement(parkir);
            rs1=parkir_1.executeQuery();
            rs1.next();
            String sql="insert into parkir values('"
            +id_parkir.getText()+"','"
            +tgl+"','"
            +m+"','"
            +k+"','"
            +b+"','"
            +id_kendaraan_parkir.getText()+"','"
            +String.valueOf(rs1.getString(1))+"','"
            +id_staff_parkir.getText()+"')";
            String sql1 = "select IDLokasi from parkir where IDParkir = '"+id_parkir.getText()+"'";
//            String update1="update service set TotalBiaya = TotalBiaya+" + (h+o) + " where IDService=(select IDService from detilservice where IDDetil = '" + id_parkir.getText() + "')";
            
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql);
            java.sql.PreparedStatement pst2=conn.prepareStatement(sql1);
//            java.sql.PreparedStatement pst2=conn.prepareStatement(update1);
            pst1.execute();
            rs = pst2.executeQuery();
            rs.next();
            String sql2 = "update lokasiparkir set Status='Terisi' where IDLokasi = '" +String.valueOf(rs.getString(1))+"'";
            java.sql.PreparedStatement pst3=conn.prepareStatement(sql2);
            pst3.executeUpdate();
            pst3.close();
//            pst2.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampil_parkir();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan\n Mohon dicek kembali pengisiannya");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_insert_parkirActionPerformed

    private void edit_lokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_lokasiActionPerformed
        try{
            String sql1="select NamaLokasi from lokasiparkir where IDLokasi='"+cari_lokasi.getText()+"'";
            String sql2="select Status from lokasiparkir where IDLokasi='"+cari_lokasi.getText()+"'";
            String sql3="select Keterangan from lokasiparkir where IDLokasi='"+cari_lokasi.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            java.sql.PreparedStatement pst2=conn.prepareStatement(sql2);
            java.sql.PreparedStatement pst3=conn.prepareStatement(sql3);
            rs1=pst1.executeQuery();
            rs2=pst2.executeQuery();
            rs3=pst3.executeQuery();
            rs1.next();
            rs2.next();
            rs3.next();
            id_lokasi.setText(cari_lokasi.getText());
            nama_lokasi.setText(String.valueOf(rs1.getString(1)));
            keterangan_lokasi.setText(String.valueOf(rs3.getString(1)));
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_edit_lokasiActionPerformed

    private void reset_kendaraan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_kendaraan1ActionPerformed
        try{
            String sql3="select Keterangan from kendaraan where IDKendaraan='"+cari_kendaraan.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst3=conn.prepareStatement(sql3);
            rs3=pst3.executeQuery();
            rs3.next();
            id_kendaraan.setText(cari_kendaraan.getText());
            keterangan_kendaraan.setText(String.valueOf(rs3.getString(1)));
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_reset_kendaraan1ActionPerformed

    private void edit_parkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_parkirActionPerformed
        try{
            String sql1="select TglParkir from parkir where IDParkir='"+cari_parkir.getText()+"'";
            String sql2="select JamMasuk from parkir where IDParkir='"+cari_parkir.getText()+"'";
            String sql3="select JamKeluar from parkir where IDParkir='"+cari_parkir.getText()+"'";
            String sql4="select IDKendaraan from parkir where IDParkir='"+cari_parkir.getText()+"'";
            String sql5="select IDLokasi from parkir where IDParkir='"+cari_parkir.getText()+"'";
            String sql6="select IDStaf from parkir where IDParkir='"+cari_parkir.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            java.sql.PreparedStatement pst2=conn.prepareStatement(sql2);
            java.sql.PreparedStatement pst3=conn.prepareStatement(sql3);
            java.sql.PreparedStatement pst4=conn.prepareStatement(sql4);
            java.sql.PreparedStatement pst5=conn.prepareStatement(sql5);
            java.sql.PreparedStatement pst6=conn.prepareStatement(sql6);
            rs1=pst1.executeQuery();
            rs2=pst2.executeQuery();
            rs3=pst3.executeQuery();
            rs4=pst4.executeQuery();
            rs5=pst5.executeQuery();
            rs6=pst6.executeQuery();
            rs1.next();
            rs2.next();
            rs3.next();
            rs4.next();
            rs5.next();
            rs6.next();
            id_parkir.setText(cari_parkir.getText());
            jam_masuk.setText(String.valueOf(rs2.getString(1)));
            jam_keluar.setText(String.valueOf(rs3.getString(1)));
            id_kendaraan_parkir.setText(String.valueOf(rs4.getString(1)));
//            id_lokasi_parkir.setText(String.valueOf(rs5.getString(1)));
            id_staff_parkir.setText(String.valueOf(rs6.getString(1)));
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_edit_parkirActionPerformed

    private void edit_staff1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_staff1ActionPerformed
        try{
            String sql1="select NamaStaf from staf where IDStaf='"+cari_staff.getText()+"'";
            String sql2="select Alamat from staf where IDStaf='"+cari_staff.getText()+"'";
            String sql3="select Posisi from staf where IDStaf='"+cari_staff.getText()+"'";
            String sql4="select Keterangan from staf where IDStaf='"+cari_staff.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            java.sql.PreparedStatement pst2=conn.prepareStatement(sql2);
            java.sql.PreparedStatement pst3=conn.prepareStatement(sql3);
            java.sql.PreparedStatement pst4=conn.prepareStatement(sql4);
            rs1=pst1.executeQuery();
            rs2=pst2.executeQuery();
            rs3=pst3.executeQuery();
            rs4=pst4.executeQuery();
            rs1.next();
            rs2.next();
            rs3.next();
            rs4.next();
            id_staff.setText(cari_staff.getText());
            nama_staff.setText(String.valueOf(rs1.getString(1)));
            alamat_staff.setText(String.valueOf(rs2.getString(1)));
            posisi_staff.setText(String.valueOf(rs3.getString(1)));
            keterangan_staff.setText(String.valueOf(rs4.getString(1)));
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_edit_staff1ActionPerformed

    private void id_staff_parkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_staff_parkirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_staff_parkirActionPerformed
    public void tampil_staff(){
    DefaultTableModel tabel=new DefaultTableModel();
    tabel.addColumn("ID Staff");
    tabel.addColumn("Nama");
    tabel.addColumn("Alamat");
    tabel.addColumn("Posisi");
    tabel.addColumn("Keterangan");
    try {
        java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
        String sql="select * from staf where Deleted=0";
        java.sql.PreparedStatement pst =conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        while (rs.next())
        {
        tabel.addRow(new Object[]{
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5)});
        }
        tabel_staff.setModel(tabel);
        }
    catch (Exception e){
    }
}
    public void tampil_kendaraan(){
    DefaultTableModel tabel=new DefaultTableModel();
    tabel.addColumn("ID Kendaraan");
    tabel.addColumn("Keterangan");
    try {
        java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
        String sql="select * from kendaraan where Deleted=0";
        java.sql.PreparedStatement pst =conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        while (rs.next())
        {
        tabel.addRow(new Object[]{
            rs.getString(1),
            rs.getString(2)});
        }
        tabel_kendaraan.setModel(tabel);
        }
    catch (Exception e){
    }
}
    public void tampil_lokasi(){
    DefaultTableModel tabel=new DefaultTableModel();
    tabel.addColumn("ID Lokasi");
    tabel.addColumn("Nama Lokasi");
    tabel.addColumn("Keterangan");
    tabel.addColumn("Status");
    try {
        java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
        String sql="select * from lokasiparkir where Deleted=0";
        java.sql.PreparedStatement pst =conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        while (rs.next())
        {
        tabel.addRow(new Object[]{
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4)});
        }
        tabel_lokasi.setModel(tabel);
        }
    catch (Exception e){
    }
}
    public void tampil_parkir(){
    DefaultTableModel tabel=new DefaultTableModel();
    tabel.addColumn("ID Parkir");
    tabel.addColumn("Tanggal");
    tabel.addColumn("Jam Masuk");
    tabel.addColumn("Jam Keluar");
    tabel.addColumn("Biaya");
    tabel.addColumn("Plat Nomor");
    tabel.addColumn("ID Lokasi");
    tabel.addColumn("Staff Pelayan");
    try {
        java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
        String sql="select parkir.IDParkir, parkir.Tglparkir, parkir.JamMasuk, parkir.JamKeluar, parkir.Biaya, parkir.IDKendaraan, parkir.IDLokasi, staf.NamaStaf "
                + "from parkir, staf "
                + "where parkir.IDStaf=staf.IDStaf";
        java.sql.PreparedStatement pst =conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        while (rs.next())
        {
        tabel.addRow(new Object[]{
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5),
            rs.getString(6),
            rs.getString(7),
            rs.getString(8)});
        }
        tabel_parkir.setModel(tabel);
        }
    catch (Exception e){
    }
}
    public void total(){
        try {
            String sql1 = "select sum(Biaya) from parkir";
            String sql2 = "select count(IDParkir) from parkir";
            String sql3 = "select count(IDStaf) from staf where Deleted=0";
            String sql4 = "select count(IDKendaraan) from kendaraan where Deleted=0";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            java.sql.PreparedStatement pst2=conn.prepareStatement(sql2);
            java.sql.PreparedStatement pst3=conn.prepareStatement(sql3);
            java.sql.PreparedStatement pst4=conn.prepareStatement(sql4);
            rs1=pst1.executeQuery();
            rs2=pst2.executeQuery();
            rs3=pst3.executeQuery();
            rs4=pst4.executeQuery();
            rs1.next();
            rs2.next();
            rs3.next();
            rs4.next();
            total_pendapatan.setText(String.valueOf(rs1.getString(1)));
            total_transaksi.setText(String.valueOf(rs2.getString(1)));
            total_staff.setText(String.valueOf(rs3.getString(1)));
            total_kendaraan.setText(String.valueOf(rs4.getString(1)));
//          tabel.setValueAt("terjual", WIDTH, WIDTH);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void update_totalbiaya(){
        try {
            String sql1 = "select sum(Harga+OngkosService) from detilservice where IDService='"+cari_lokasi.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)smartparkir.koneksi_db.koneksiDB();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            rs1=pst1.executeQuery();
            rs1.next();
            
//          tabel.setValueAt("terjual", WIDTH, WIDTH);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ui_sipbentor_anyar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat_staff;
    private javax.swing.JPanel beranda;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_cari_kendaraan;
    private javax.swing.JButton btn_cari_lokasi;
    private javax.swing.JButton btn_cari_parkir;
    private javax.swing.JButton btn_cari_staff;
    private javax.swing.JPanel btn_riwayat_transaksi;
    private javax.swing.JPanel btn_transaksi_baru;
    private javax.swing.JTextField cari_kendaraan;
    private javax.swing.JTextField cari_lokasi;
    private javax.swing.JTextField cari_parkir;
    private javax.swing.JTextField cari_staff;
    private javax.swing.JComboBox<String> combo_kendaraan;
    private javax.swing.JComboBox<String> combo_lokasi;
    private javax.swing.JComboBox<String> combo_parkir;
    private javax.swing.JComboBox<String> combo_staff;
    private javax.swing.JButton delete_kendaraan;
    private javax.swing.JButton delete_lokasi;
    private javax.swing.JButton delete_parkir;
    private javax.swing.JButton delete_staff;
    private javax.swing.JButton edit_kendaraan;
    private javax.swing.JButton edit_lokasi;
    private javax.swing.JButton edit_parkir;
    private javax.swing.JButton edit_staff;
    private javax.swing.JButton edit_staff1;
    private javax.swing.JTextField id_kendaraan;
    private javax.swing.JTextField id_kendaraan_parkir;
    private javax.swing.JTextField id_lokasi;
    private javax.swing.JTextField id_parkir;
    private javax.swing.JTextField id_staff;
    private javax.swing.JTextField id_staff_parkir;
    private javax.swing.JButton insert_parkir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jam_keluar;
    private javax.swing.JTextField jam_masuk;
    private javax.swing.JTextArea keterangan_kendaraan;
    private javax.swing.JTextArea keterangan_lokasi;
    private javax.swing.JTextArea keterangan_staff;
    private javax.swing.JPanel main;
    private javax.swing.JPanel main_beranda;
    private javax.swing.JPanel main_staff;
    private javax.swing.JPanel main_transaksi;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField nama_lokasi;
    private javax.swing.JTextField nama_staff;
    private javax.swing.JTextField posisi_staff;
    private javax.swing.JButton refresh;
    private javax.swing.JButton reset_kendaraan;
    private javax.swing.JButton reset_kendaraan1;
    private javax.swing.JButton reset_lokasi;
    private javax.swing.JButton reset_parkir;
    private javax.swing.JButton reset_staff;
    private javax.swing.JPanel riwayat_transaksi;
    private javax.swing.JScrollPane scrollpane_detail;
    private javax.swing.JScrollPane scrollpane_kendaraan;
    private javax.swing.JScrollPane scrollpane_service;
    private javax.swing.JScrollPane scrollpane_staff;
    private javax.swing.JButton simpan_staff;
    private javax.swing.JButton simpan_transaksi_kendaraan;
    private javax.swing.JButton simpan_transaksi_lokasi;
    private javax.swing.JPanel staff;
    private javax.swing.JTable tabel_kendaraan;
    private javax.swing.JTable tabel_lokasi;
    private javax.swing.JTable tabel_parkir;
    private javax.swing.JTable tabel_staff;
    private com.toedter.calendar.JDateChooser tgl_parkir;
    private javax.swing.JTextField total_kendaraan;
    private javax.swing.JTextField total_pendapatan;
    private javax.swing.JTextField total_staff;
    private javax.swing.JTextField total_transaksi;
    private javax.swing.JPanel transaksi;
    private javax.swing.JButton update_lokasi;
    private javax.swing.JButton update_parkir;
    // End of variables declaration//GEN-END:variables
}