package javaapplication26;
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
import net.proteanit.sql.DbUtils;

public class ui_sipbentor extends javax.swing.JFrame {
    public String tgl, update_tgl;
    ResultSet rs,rs1,rs2,rs3,rs4;
    public ui_sipbentor() {
        initComponents();
        tampil_staff();
        tampil_kendaraan();
        tampil_service();
        tampil_detil();
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
        kendaraan = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        insert_staff = new javax.swing.JButton();
        edit_staff = new javax.swing.JButton();
        delete_staff = new javax.swing.JButton();
        btn_cari_staff = new javax.swing.JButton();
        reset_staff = new javax.swing.JButton();
        main_kendaraan = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        scrollpane_kendaraan = new javax.swing.JScrollPane();
        tabel_kendaraan = new javax.swing.JTable();
        combo_kendaraan = new javax.swing.JComboBox<>();
        cari_kendaraan = new javax.swing.JTextField();
        edit_kendaraan = new javax.swing.JButton();
        delete_kendaraan = new javax.swing.JButton();
        reset_kendaraan = new javax.swing.JButton();
        btn_cari_kendaraan = new javax.swing.JButton();
        riwayat_transaksi = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        scrollpane_service = new javax.swing.JScrollPane();
        tabel_service = new javax.swing.JTable();
        combo_service = new javax.swing.JComboBox<>();
        cari_service = new javax.swing.JTextField();
        edit_service = new javax.swing.JButton();
        delete_service = new javax.swing.JButton();
        scrollpane_detail = new javax.swing.JScrollPane();
        tabel_detail = new javax.swing.JTable();
        combo_detail = new javax.swing.JComboBox<>();
        cari_detail = new javax.swing.JTextField();
        edit_detail = new javax.swing.JButton();
        delete_detail = new javax.swing.JButton();
        back_riwayat = new javax.swing.JButton();
        btn_cari_service = new javax.swing.JButton();
        reset_service = new javax.swing.JButton();
        reset_detail = new javax.swing.JButton();
        btn_cari_detail = new javax.swing.JButton();
        insert_detail = new javax.swing.JButton();
        reset_biaya = new javax.swing.JButton();
        input_staff = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        id_staff = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        nama_staff = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        alamat_staff = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        posisi_staff = new javax.swing.JTextField();
        simpan_staff = new javax.swing.JButton();
        back_staff = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        keterangan_staff = new javax.swing.JTextArea();
        update_staff = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        update_id_staff = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        update_nama_staff = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        update_alamat_staff = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        update_posisi_staff = new javax.swing.JTextField();
        update_simpan_staff = new javax.swing.JButton();
        update_back_staff = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        update_keterangan_staff = new javax.swing.JTextArea();
        update_kendaraan = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        update_id_kendaraan = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        update_pemilik = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        update_merk = new javax.swing.JTextField();
        update_simpan_kendaraan = new javax.swing.JButton();
        update_back_kendaraan = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        update_keterangan_kendaraan = new javax.swing.JTextArea();
        update_service = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        update_id_service = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        update_simpan_service = new javax.swing.JButton();
        update_back_service = new javax.swing.JButton();
        update_tanggal_service = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        update_id_staff_pelayan = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        update_plat_nomor = new javax.swing.JTextField();
        update_detail = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        update_id_service_detail = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        update_id_detail = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        update_part = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        update_harga = new javax.swing.JTextField();
        update_simpan_detail = new javax.swing.JButton();
        update_back_detail = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        update_ongkos = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        update_keterangan_detail = new javax.swing.JTextArea();
        jLabel65 = new javax.swing.JLabel();
        transaksi_baru_kendaraan = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        id_kendaraan = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        pemilik = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        merk = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        simpan_transaksi_kendaraan = new javax.swing.JButton();
        back_transaksi_kendaraan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        keterangan_kendaraan = new javax.swing.JTextArea();
        transaksi_baru_service = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        id_kendaraan_service = new javax.swing.JTextField();
        simpan_transaksi_service = new javax.swing.JButton();
        back_transaksi_service = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        tgl_service = new com.toedter.calendar.JDateChooser();
        jLabel76 = new javax.swing.JLabel();
        id_staff_transaksi = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        id_service_transaksi = new javax.swing.JTextField();
        transaksi_baru_detail = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        id_service_detil = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        part = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        ongkos_service = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        combo_jenis = new javax.swing.JComboBox<>();
        jLabel88 = new javax.swing.JLabel();
        id_detail = new javax.swing.JTextField();
        simpan_transaksi_detail = new javax.swing.JButton();
        back_transaksi_detail = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        keterangan_detail = new javax.swing.JTextArea();
        transaksi_baru = new javax.swing.JPanel();
        btn_kendaraan_terdaftar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btn_kendaraan_baru = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        back_transaksi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(java.awt.Color.red);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIPBENTOR");

        beranda.setBackground(new java.awt.Color(255, 102, 102));
        beranda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                berandaMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Beranda");

        javax.swing.GroupLayout berandaLayout = new javax.swing.GroupLayout(beranda);
        beranda.setLayout(berandaLayout);
        berandaLayout.setHorizontalGroup(
            berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, berandaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(23, 23, 23))
        );
        berandaLayout.setVerticalGroup(
            berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        transaksi.setBackground(new java.awt.Color(255, 102, 102));
        transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transaksiMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Transaksi");

        javax.swing.GroupLayout transaksiLayout = new javax.swing.GroupLayout(transaksi);
        transaksi.setLayout(transaksiLayout);
        transaksiLayout.setHorizontalGroup(
            transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transaksiLayout.setVerticalGroup(
            transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        staff.setBackground(new java.awt.Color(255, 102, 102));
        staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                staffMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Staff");

        javax.swing.GroupLayout staffLayout = new javax.swing.GroupLayout(staff);
        staff.setLayout(staffLayout);
        staffLayout.setHorizontalGroup(
            staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        staffLayout.setVerticalGroup(
            staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        kendaraan.setBackground(new java.awt.Color(255, 102, 102));
        kendaraan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kendaraanMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kendaraan");

        javax.swing.GroupLayout kendaraanLayout = new javax.swing.GroupLayout(kendaraan);
        kendaraan.setLayout(kendaraanLayout);
        kendaraanLayout.setHorizontalGroup(
            kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kendaraanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        kendaraanLayout.setVerticalGroup(
            kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Database");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(beranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kendaraan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(32, 32, 32))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(66, 66, 66)
                .addComponent(beranda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new java.awt.CardLayout());

        main_beranda.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Kendaraan");

        total_kendaraan.setEditable(false);
        total_kendaraan.setBackground(new java.awt.Color(255, 102, 102));
        total_kendaraan.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        total_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        total_kendaraan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_kendaraan.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(68, 68, 68))
            .addComponent(total_kendaraan)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Pendapatan");

        total_pendapatan.setEditable(false);
        total_pendapatan.setBackground(new java.awt.Color(255, 102, 102));
        total_pendapatan.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        total_pendapatan.setForeground(new java.awt.Color(255, 255, 255));
        total_pendapatan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_pendapatan.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(51, 51, 51))
            .addComponent(total_pendapatan)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_pendapatan, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Staff");

        total_staff.setEditable(false);
        total_staff.setBackground(new java.awt.Color(255, 102, 102));
        total_staff.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(51, 51, 51))
            .addComponent(total_staff)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 102, 102));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Transaksi");

        total_transaksi.setEditable(false);
        total_transaksi.setBackground(new java.awt.Color(255, 102, 102));
        total_transaksi.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(51, 51, 51))
            .addComponent(total_transaksi)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setText("BERANDA");

        refresh.setBackground(java.awt.Color.red);
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
                .addGroup(main_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_berandaLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel11))
                    .addGroup(main_berandaLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(main_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(main_berandaLayout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(main_berandaLayout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(main_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(refresh)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        main_berandaLayout.setVerticalGroup(
            main_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_berandaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(52, 52, 52)
                .addGroup(main_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_berandaLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_berandaLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(refresh)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        main.add(main_beranda, "card2");

        main_transaksi.setBackground(new java.awt.Color(255, 255, 255));

        btn_riwayat_transaksi.setBackground(new java.awt.Color(255, 102, 102));
        btn_riwayat_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_riwayat_transaksiMousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Riwayat Transaksi");

        javax.swing.GroupLayout btn_riwayat_transaksiLayout = new javax.swing.GroupLayout(btn_riwayat_transaksi);
        btn_riwayat_transaksi.setLayout(btn_riwayat_transaksiLayout);
        btn_riwayat_transaksiLayout.setHorizontalGroup(
            btn_riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_riwayat_transaksiLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(51, 51, 51))
        );
        btn_riwayat_transaksiLayout.setVerticalGroup(
            btn_riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_riwayat_transaksiLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel13)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btn_transaksi_baru.setBackground(new java.awt.Color(255, 102, 102));
        btn_transaksi_baru.setForeground(new java.awt.Color(255, 255, 255));
        btn_transaksi_baru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_transaksi_baruMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Transaksi Baru");

        javax.swing.GroupLayout btn_transaksi_baruLayout = new javax.swing.GroupLayout(btn_transaksi_baru);
        btn_transaksi_baru.setLayout(btn_transaksi_baruLayout);
        btn_transaksi_baruLayout.setHorizontalGroup(
            btn_transaksi_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_transaksi_baruLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(49, 49, 49))
        );
        btn_transaksi_baruLayout.setVerticalGroup(
            btn_transaksi_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_transaksi_baruLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel15)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel16.setText("TRANSAKSI");

        javax.swing.GroupLayout main_transaksiLayout = new javax.swing.GroupLayout(main_transaksi);
        main_transaksi.setLayout(main_transaksiLayout);
        main_transaksiLayout.setHorizontalGroup(
            main_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_transaksiLayout.createSequentialGroup()
                .addGroup(main_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_transaksiLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btn_transaksi_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btn_riwayat_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_transaksiLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel16)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        main_transaksiLayout.setVerticalGroup(
            main_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(159, 159, 159)
                .addGroup(main_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_transaksi_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_riwayat_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        main.add(main_transaksi, "card2");

        main_staff.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
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

        combo_staff.setBackground(java.awt.Color.red);
        combo_staff.setForeground(new java.awt.Color(255, 255, 255));
        combo_staff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cari berdasarkan", "ID Staff", "Nama", "Alamat", "Posisi", "Keterangan", "Dihapus" }));

        insert_staff.setBackground(java.awt.Color.red);
        insert_staff.setForeground(new java.awt.Color(255, 255, 255));
        insert_staff.setText("Tambah");
        insert_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_staffActionPerformed(evt);
            }
        });

        edit_staff.setBackground(java.awt.Color.red);
        edit_staff.setForeground(new java.awt.Color(255, 255, 255));
        edit_staff.setText("Edit");
        edit_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_staffActionPerformed(evt);
            }
        });

        delete_staff.setBackground(java.awt.Color.red);
        delete_staff.setForeground(new java.awt.Color(255, 255, 255));
        delete_staff.setText("Hapus");
        delete_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_staffActionPerformed(evt);
            }
        });

        btn_cari_staff.setBackground(java.awt.Color.red);
        btn_cari_staff.setForeground(new java.awt.Color(255, 255, 255));
        btn_cari_staff.setText("Cari");
        btn_cari_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari_staffActionPerformed(evt);
            }
        });

        reset_staff.setBackground(java.awt.Color.red);
        reset_staff.setForeground(new java.awt.Color(255, 255, 255));
        reset_staff.setText("Reset");
        reset_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_staffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_staffLayout = new javax.swing.GroupLayout(main_staff);
        main_staff.setLayout(main_staffLayout);
        main_staffLayout.setHorizontalGroup(
            main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpane_staff, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
            .addGroup(main_staffLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(combo_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cari_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btn_cari_staff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insert_staff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_staff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete_staff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset_staff)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_staffLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(282, 282, 282))
        );
        main_staffLayout.setVerticalGroup(
            main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_staffLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(main_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert_staff)
                    .addComponent(edit_staff)
                    .addComponent(delete_staff)
                    .addComponent(btn_cari_staff)
                    .addComponent(reset_staff))
                .addGap(160, 160, 160))
        );

        main.add(main_staff, "card2");

        main_kendaraan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel19.setText("KENDARAAN");

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

        combo_kendaraan.setBackground(java.awt.Color.red);
        combo_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        combo_kendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cari berdasarkan", "IDKendaraan", "Pemilik", "Merk", "Keterangan", "Deleted" }));

        edit_kendaraan.setBackground(java.awt.Color.red);
        edit_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        edit_kendaraan.setText("Edit");
        edit_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_kendaraanActionPerformed(evt);
            }
        });

        delete_kendaraan.setBackground(java.awt.Color.red);
        delete_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        delete_kendaraan.setText("Hapus");
        delete_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_kendaraanActionPerformed(evt);
            }
        });

        reset_kendaraan.setBackground(java.awt.Color.red);
        reset_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        reset_kendaraan.setText("Reset");
        reset_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_kendaraanActionPerformed(evt);
            }
        });

        btn_cari_kendaraan.setBackground(java.awt.Color.red);
        btn_cari_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        btn_cari_kendaraan.setText("Cari");
        btn_cari_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari_kendaraanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_kendaraanLayout = new javax.swing.GroupLayout(main_kendaraan);
        main_kendaraan.setLayout(main_kendaraanLayout);
        main_kendaraanLayout.setHorizontalGroup(
            main_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpane_kendaraan, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_kendaraanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(main_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_kendaraanLayout.createSequentialGroup()
                        .addComponent(combo_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btn_cari_kendaraan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_kendaraan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_kendaraan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset_kendaraan)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_kendaraanLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(247, 247, 247))))
        );
        main_kendaraanLayout.setVerticalGroup(
            main_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_kendaraanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(main_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_kendaraan)
                    .addComponent(delete_kendaraan)
                    .addComponent(reset_kendaraan)
                    .addComponent(btn_cari_kendaraan))
                .addGap(169, 169, 169))
        );

        main.add(main_kendaraan, "card2");

        riwayat_transaksi.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel20.setText("RIWAYAT TRANSAKSI");

        tabel_service.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_service.setGridColor(java.awt.Color.red);
        scrollpane_service.setViewportView(tabel_service);

        combo_service.setBackground(java.awt.Color.red);
        combo_service.setForeground(new java.awt.Color(255, 255, 255));
        combo_service.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cari berdasarkan", "IDService", "Tanggal Service", "Total Biaya", "IDStaf", "IDKendaraan" }));

        edit_service.setBackground(java.awt.Color.red);
        edit_service.setForeground(new java.awt.Color(255, 255, 255));
        edit_service.setText("Edit");
        edit_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_serviceActionPerformed(evt);
            }
        });

        delete_service.setBackground(java.awt.Color.red);
        delete_service.setForeground(new java.awt.Color(255, 255, 255));
        delete_service.setText("Hapus");
        delete_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_serviceActionPerformed(evt);
            }
        });

        tabel_detail.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_detail.setGridColor(java.awt.Color.red);
        scrollpane_detail.setViewportView(tabel_detail);

        combo_detail.setBackground(java.awt.Color.red);
        combo_detail.setForeground(new java.awt.Color(255, 255, 255));
        combo_detail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cari berdasarkan", "IDDetil", "Part", "Harga", "OngkosService", "Keterangan", "IDService" }));

        edit_detail.setBackground(java.awt.Color.red);
        edit_detail.setForeground(new java.awt.Color(255, 255, 255));
        edit_detail.setText("Edit");
        edit_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_detailActionPerformed(evt);
            }
        });

        delete_detail.setBackground(java.awt.Color.red);
        delete_detail.setForeground(new java.awt.Color(255, 255, 255));
        delete_detail.setText("Hapus");
        delete_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_detailActionPerformed(evt);
            }
        });

        back_riwayat.setBackground(java.awt.Color.red);
        back_riwayat.setForeground(new java.awt.Color(255, 255, 255));
        back_riwayat.setText("Kembali");
        back_riwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                back_riwayatMousePressed(evt);
            }
        });
        back_riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_riwayatActionPerformed(evt);
            }
        });

        btn_cari_service.setBackground(java.awt.Color.red);
        btn_cari_service.setForeground(new java.awt.Color(255, 255, 255));
        btn_cari_service.setText("Cari");
        btn_cari_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari_serviceActionPerformed(evt);
            }
        });

        reset_service.setBackground(java.awt.Color.red);
        reset_service.setForeground(new java.awt.Color(255, 255, 255));
        reset_service.setText("Reset");
        reset_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_serviceActionPerformed(evt);
            }
        });

        reset_detail.setBackground(java.awt.Color.red);
        reset_detail.setForeground(new java.awt.Color(255, 255, 255));
        reset_detail.setText("Reset");
        reset_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_detailActionPerformed(evt);
            }
        });

        btn_cari_detail.setBackground(java.awt.Color.red);
        btn_cari_detail.setForeground(new java.awt.Color(255, 255, 255));
        btn_cari_detail.setText("Cari");
        btn_cari_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari_detailActionPerformed(evt);
            }
        });

        insert_detail.setBackground(java.awt.Color.red);
        insert_detail.setForeground(new java.awt.Color(255, 255, 255));
        insert_detail.setText("Tambah");
        insert_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_detailActionPerformed(evt);
            }
        });

        reset_biaya.setBackground(java.awt.Color.red);
        reset_biaya.setForeground(new java.awt.Color(255, 255, 255));
        reset_biaya.setText("Update Total Biaya");
        reset_biaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_biayaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout riwayat_transaksiLayout = new javax.swing.GroupLayout(riwayat_transaksi);
        riwayat_transaksi.setLayout(riwayat_transaksiLayout);
        riwayat_transaksiLayout.setHorizontalGroup(
            riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpane_service)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, riwayat_transaksiLayout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(187, 187, 187))
            .addComponent(scrollpane_detail)
            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                        .addComponent(combo_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari_service, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cari_service)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_service)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_service)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset_biaya)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset_service)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                        .addComponent(combo_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(insert_detail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cari_detail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_detail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_detail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset_detail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(back_riwayat)
                        .addGap(21, 21, 21))))
        );
        riwayat_transaksiLayout.setVerticalGroup(
            riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(riwayat_transaksiLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane_service, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_service)
                    .addComponent(delete_service)
                    .addComponent(btn_cari_service)
                    .addComponent(reset_service)
                    .addComponent(reset_biaya))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edit_detail)
                        .addComponent(delete_detail))
                    .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_cari_detail)
                        .addComponent(reset_detail))
                    .addGroup(riwayat_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cari_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(back_riwayat)
                        .addComponent(insert_detail)))
                .addGap(25, 25, 25))
        );

        main.add(riwayat_transaksi, "card2");

        input_staff.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel31.setText("STAFF");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel36.setText("Keterangan");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel37.setText("ID Staff");

        id_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_staffActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel38.setText("Nama");

        nama_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nama_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_staffActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel39.setText("Alamat");

        alamat_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        alamat_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamat_staffActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel40.setText("Posisi");

        posisi_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        posisi_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posisi_staffActionPerformed(evt);
            }
        });

        simpan_staff.setBackground(java.awt.Color.red);
        simpan_staff.setForeground(new java.awt.Color(255, 255, 255));
        simpan_staff.setText("Simpan");
        simpan_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_staffActionPerformed(evt);
            }
        });

        back_staff.setBackground(java.awt.Color.red);
        back_staff.setForeground(new java.awt.Color(255, 255, 255));
        back_staff.setText("Kembali");
        back_staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                back_staffMousePressed(evt);
            }
        });
        back_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_staffActionPerformed(evt);
            }
        });

        keterangan_staff.setColumns(20);
        keterangan_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        keterangan_staff.setRows(5);
        jScrollPane3.setViewportView(keterangan_staff);

        javax.swing.GroupLayout input_staffLayout = new javax.swing.GroupLayout(input_staff);
        input_staff.setLayout(input_staffLayout);
        input_staffLayout.setHorizontalGroup(
            input_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(input_staffLayout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, input_staffLayout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addGroup(input_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37)
                    .addComponent(jLabel39))
                .addGap(54, 54, 54)
                .addGroup(input_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(input_staffLayout.createSequentialGroup()
                        .addComponent(simpan_staff)
                        .addGap(118, 118, 118)
                        .addComponent(back_staff))
                    .addGroup(input_staffLayout.createSequentialGroup()
                        .addGroup(input_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama_staff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alamat_staff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(input_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel40))
                        .addGap(18, 18, 18)
                        .addGroup(input_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posisi_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
        );
        input_staffLayout.setVerticalGroup(
            input_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(input_staffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(71, 71, 71)
                .addGroup(input_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(id_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(posisi_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(input_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(input_staffLayout.createSequentialGroup()
                        .addGroup(input_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(input_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nama_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36))
                            .addComponent(jLabel38))
                        .addGap(25, 25, 25)
                        .addGroup(input_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alamat_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(input_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan_staff)
                    .addComponent(back_staff))
                .addGap(121, 121, 121))
        );

        main.add(input_staff, "card2");

        update_staff.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel33.setText("STAFF");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel41.setText("Keterangan");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel42.setText("ID Staff");

        update_id_staff.setEditable(false);
        update_id_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_id_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_id_staffActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel43.setText("Nama");

        update_nama_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_nama_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_nama_staffActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel44.setText("Alamat");

        update_alamat_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_alamat_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_alamat_staffActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel45.setText("Posisi");

        update_posisi_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_posisi_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_posisi_staffActionPerformed(evt);
            }
        });

        update_simpan_staff.setBackground(java.awt.Color.red);
        update_simpan_staff.setForeground(new java.awt.Color(255, 255, 255));
        update_simpan_staff.setText("Simpan");
        update_simpan_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_simpan_staffActionPerformed(evt);
            }
        });

        update_back_staff.setBackground(java.awt.Color.red);
        update_back_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_back_staff.setForeground(new java.awt.Color(255, 255, 255));
        update_back_staff.setText("Kembali");
        update_back_staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                update_back_staffMousePressed(evt);
            }
        });
        update_back_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_back_staffActionPerformed(evt);
            }
        });

        update_keterangan_staff.setColumns(20);
        update_keterangan_staff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_keterangan_staff.setRows(5);
        jScrollPane4.setViewportView(update_keterangan_staff);

        javax.swing.GroupLayout update_staffLayout = new javax.swing.GroupLayout(update_staff);
        update_staff.setLayout(update_staffLayout);
        update_staffLayout.setHorizontalGroup(
            update_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_staffLayout.createSequentialGroup()
                .addGroup(update_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(update_staffLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(update_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(update_staffLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(update_alamat_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208))
                            .addGroup(update_staffLayout.createSequentialGroup()
                                .addGroup(update_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(update_staffLayout.createSequentialGroup()
                                        .addGroup(update_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(update_staffLayout.createSequentialGroup()
                                                .addComponent(jLabel42)
                                                .addGap(29, 29, 29)
                                                .addComponent(update_id_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(update_staffLayout.createSequentialGroup()
                                                .addComponent(jLabel43)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(update_nama_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel41))
                                    .addGroup(update_staffLayout.createSequentialGroup()
                                        .addGap(315, 315, 315)
                                        .addComponent(jLabel45)))
                                .addGap(43, 43, 43)))
                        .addGroup(update_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_posisi_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(update_staffLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel33))
                    .addGroup(update_staffLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(update_simpan_staff)
                        .addGap(118, 118, 118)
                        .addComponent(update_back_staff)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        update_staffLayout.setVerticalGroup(
            update_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_staffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addGap(75, 75, 75)
                .addGroup(update_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(update_id_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(update_posisi_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(update_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, update_staffLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(update_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update_alamat_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, update_staffLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(update_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(update_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel41)
                                .addComponent(update_nama_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel43)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(update_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_simpan_staff)
                    .addComponent(update_back_staff))
                .addGap(134, 134, 134))
        );

        main.add(update_staff, "card2");

        update_kendaraan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel34.setText("KENDARAAN");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel46.setText("Keterangan");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel47.setText("Plat Nomor");

        update_id_kendaraan.setEditable(false);
        update_id_kendaraan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_id_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_id_kendaraanActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel48.setText("Pemilik");

        update_pemilik.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_pemilik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_pemilikActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel49.setText("Merk");

        update_merk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_merk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_merkActionPerformed(evt);
            }
        });

        update_simpan_kendaraan.setBackground(java.awt.Color.red);
        update_simpan_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        update_simpan_kendaraan.setText("Simpan");
        update_simpan_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_simpan_kendaraanActionPerformed(evt);
            }
        });

        update_back_kendaraan.setBackground(java.awt.Color.red);
        update_back_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        update_back_kendaraan.setText("Kembali");
        update_back_kendaraan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                update_back_kendaraanMousePressed(evt);
            }
        });
        update_back_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_back_kendaraanActionPerformed(evt);
            }
        });

        update_keterangan_kendaraan.setColumns(20);
        update_keterangan_kendaraan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_keterangan_kendaraan.setRows(5);
        jScrollPane5.setViewportView(update_keterangan_kendaraan);

        javax.swing.GroupLayout update_kendaraanLayout = new javax.swing.GroupLayout(update_kendaraan);
        update_kendaraan.setLayout(update_kendaraanLayout);
        update_kendaraanLayout.setHorizontalGroup(
            update_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_kendaraanLayout.createSequentialGroup()
                .addGroup(update_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(update_kendaraanLayout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(update_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, update_kendaraanLayout.createSequentialGroup()
                            .addGap(240, 240, 240)
                            .addComponent(jLabel34))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, update_kendaraanLayout.createSequentialGroup()
                            .addGap(200, 200, 200)
                            .addGroup(update_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel48)
                                .addComponent(jLabel47)
                                .addComponent(jLabel49)
                                .addComponent(jLabel46)
                                .addComponent(update_simpan_kendaraan))
                            .addGroup(update_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(update_kendaraanLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(update_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(update_id_kendaraan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(update_pemilik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(update_kendaraanLayout.createSequentialGroup()
                                    .addGap(94, 94, 94)
                                    .addComponent(update_merk, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_kendaraanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(update_back_kendaraan)
                .addGap(269, 269, 269))
        );
        update_kendaraanLayout.setVerticalGroup(
            update_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_kendaraanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addGap(56, 56, 56)
                .addGroup(update_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(update_id_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(update_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_pemilik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(38, 38, 38)
                .addGroup(update_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(update_merk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(update_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(update_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_back_kendaraan)
                    .addComponent(update_simpan_kendaraan))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        main.add(update_kendaraan, "card2");

        update_service.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel35.setText("SERVICE");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel51.setText("ID Service");

        update_id_service.setEditable(false);
        update_id_service.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_id_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_id_serviceActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel52.setText("Tanggal Service");

        update_simpan_service.setBackground(java.awt.Color.red);
        update_simpan_service.setForeground(new java.awt.Color(255, 255, 255));
        update_simpan_service.setText("Simpan");
        update_simpan_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_simpan_serviceActionPerformed(evt);
            }
        });

        update_back_service.setBackground(java.awt.Color.red);
        update_back_service.setForeground(new java.awt.Color(255, 255, 255));
        update_back_service.setText("Kembali");
        update_back_service.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                update_back_serviceMousePressed(evt);
            }
        });
        update_back_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_back_serviceActionPerformed(evt);
            }
        });

        update_tanggal_service.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_tanggal_service.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                update_tanggal_servicePropertyChange(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("ID Staff Pelayan");

        update_id_staff_pelayan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("Plat Nomor");

        update_plat_nomor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout update_serviceLayout = new javax.swing.GroupLayout(update_service);
        update_service.setLayout(update_serviceLayout);
        update_serviceLayout.setHorizontalGroup(
            update_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_serviceLayout.createSequentialGroup()
                .addGroup(update_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(update_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, update_serviceLayout.createSequentialGroup()
                            .addGap(283, 283, 283)
                            .addComponent(jLabel35))
                        .addGroup(update_serviceLayout.createSequentialGroup()
                            .addGroup(update_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel52)
                                .addComponent(jLabel51)
                                .addComponent(jLabel12)
                                .addComponent(jLabel22))
                            .addGap(29, 29, 29)
                            .addGroup(update_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(update_id_service, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(update_tanggal_service, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(update_id_staff_pelayan)
                                .addComponent(update_plat_nomor))))
                    .addGroup(update_serviceLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(update_simpan_service)
                        .addGap(113, 113, 113)
                        .addComponent(update_back_service)))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        update_serviceLayout.setVerticalGroup(
            update_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_serviceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addGap(62, 62, 62)
                .addGroup(update_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(update_id_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(update_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(update_tanggal_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(update_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(update_id_staff_pelayan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(update_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(update_plat_nomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(update_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_back_service)
                    .addComponent(update_simpan_service))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        main.add(update_service, "card2");

        update_detail.setBackground(new java.awt.Color(255, 255, 255));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel54.setText("DETAIL SERVICE");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel55.setText("Keterangan");

        update_id_service_detail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_id_service_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_id_service_detailActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel56.setText("ID Detail Service");

        update_id_detail.setEditable(false);
        update_id_detail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_id_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_id_detailActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel57.setText("Part yang diganti");

        update_part.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_part.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_partActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel58.setText("Harga");

        update_harga.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_hargaActionPerformed(evt);
            }
        });

        update_simpan_detail.setBackground(java.awt.Color.red);
        update_simpan_detail.setForeground(new java.awt.Color(255, 255, 255));
        update_simpan_detail.setText("Simpan");
        update_simpan_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_simpan_detailActionPerformed(evt);
            }
        });

        update_back_detail.setBackground(java.awt.Color.red);
        update_back_detail.setForeground(new java.awt.Color(255, 255, 255));
        update_back_detail.setText("Kembali");
        update_back_detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                update_back_detailMousePressed(evt);
            }
        });
        update_back_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_back_detailActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel59.setText("Ongkos Service");

        update_ongkos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_ongkos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ongkosActionPerformed(evt);
            }
        });

        update_keterangan_detail.setColumns(20);
        update_keterangan_detail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_keterangan_detail.setRows(5);
        jScrollPane6.setViewportView(update_keterangan_detail);

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel65.setText("ID Service");

        javax.swing.GroupLayout update_detailLayout = new javax.swing.GroupLayout(update_detail);
        update_detail.setLayout(update_detailLayout);
        update_detailLayout.setHorizontalGroup(
            update_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_detailLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(update_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(update_detailLayout.createSequentialGroup()
                        .addGroup(update_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58))
                        .addGap(72, 72, 72)
                        .addGroup(update_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(update_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(update_detailLayout.createSequentialGroup()
                                    .addComponent(update_part, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel55))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, update_detailLayout.createSequentialGroup()
                                    .addComponent(update_id_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel59)))
                            .addComponent(update_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(update_detailLayout.createSequentialGroup()
                                .addComponent(update_simpan_detail)
                                .addGap(118, 118, 118)
                                .addComponent(update_back_detail))
                            .addComponent(jLabel54)))
                    .addComponent(jLabel65))
                .addGap(57, 57, 57)
                .addGroup(update_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_ongkos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_id_service_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        update_detailLayout.setVerticalGroup(
            update_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_detailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addGap(70, 70, 70)
                .addGroup(update_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(update_id_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(update_ongkos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(update_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(update_detailLayout.createSequentialGroup()
                        .addGroup(update_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57)
                            .addComponent(update_part, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55))
                        .addGap(32, 32, 32)
                        .addGroup(update_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58))
                        .addGap(39, 39, 39)
                        .addGroup(update_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(update_id_service_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(update_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update_simpan_detail)
                            .addComponent(update_back_detail)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        main.add(update_detail, "card2");

        transaksi_baru_kendaraan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel50.setText("KENDARAAN");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel53.setText("Plat Nomor");

        id_kendaraan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_kendaraanActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel60.setText("Nama");

        pemilik.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pemilik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemilikActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel61.setText("Merk");

        merk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        merk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merkActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel62.setText("Keterangan Kendaraan");

        simpan_transaksi_kendaraan.setBackground(java.awt.Color.red);
        simpan_transaksi_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        simpan_transaksi_kendaraan.setText("Simpan");
        simpan_transaksi_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_transaksi_kendaraanActionPerformed(evt);
            }
        });

        back_transaksi_kendaraan.setBackground(java.awt.Color.red);
        back_transaksi_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
        back_transaksi_kendaraan.setText("Kembali");
        back_transaksi_kendaraan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                back_transaksi_kendaraanMousePressed(evt);
            }
        });
        back_transaksi_kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_transaksi_kendaraanActionPerformed(evt);
            }
        });

        keterangan_kendaraan.setColumns(20);
        keterangan_kendaraan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        keterangan_kendaraan.setRows(5);
        jScrollPane1.setViewportView(keterangan_kendaraan);

        javax.swing.GroupLayout transaksi_baru_kendaraanLayout = new javax.swing.GroupLayout(transaksi_baru_kendaraan);
        transaksi_baru_kendaraan.setLayout(transaksi_baru_kendaraanLayout);
        transaksi_baru_kendaraanLayout.setHorizontalGroup(
            transaksi_baru_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transaksi_baru_kendaraanLayout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addGroup(transaksi_baru_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(transaksi_baru_kendaraanLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(231, 231, 231))
                    .addGroup(transaksi_baru_kendaraanLayout.createSequentialGroup()
                        .addGroup(transaksi_baru_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62)
                            .addComponent(jLabel60)
                            .addComponent(jLabel53))
                        .addGap(29, 29, 29)
                        .addGroup(transaksi_baru_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(merk, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(172, 172, 172))))
            .addGroup(transaksi_baru_kendaraanLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(simpan_transaksi_kendaraan)
                .addGap(118, 118, 118)
                .addComponent(back_transaksi_kendaraan)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        transaksi_baru_kendaraanLayout.setVerticalGroup(
            transaksi_baru_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksi_baru_kendaraanLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel50)
                .addGap(65, 65, 65)
                .addGroup(transaksi_baru_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(id_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(transaksi_baru_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(pemilik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(transaksi_baru_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(merk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(transaksi_baru_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(transaksi_baru_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan_transaksi_kendaraan)
                    .addComponent(back_transaksi_kendaraan))
                .addGap(47, 47, 47))
        );

        main.add(transaksi_baru_kendaraan, "card2");

        transaksi_baru_service.setBackground(new java.awt.Color(255, 255, 255));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel63.setText("SERVICE");

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel64.setText("Plat Nomor");

        id_kendaraan_service.setEditable(false);
        id_kendaraan_service.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_kendaraan_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_kendaraan_serviceActionPerformed(evt);
            }
        });

        simpan_transaksi_service.setBackground(java.awt.Color.red);
        simpan_transaksi_service.setForeground(new java.awt.Color(255, 255, 255));
        simpan_transaksi_service.setText("Simpan");
        simpan_transaksi_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_transaksi_serviceActionPerformed(evt);
            }
        });

        back_transaksi_service.setBackground(java.awt.Color.red);
        back_transaksi_service.setForeground(new java.awt.Color(255, 255, 255));
        back_transaksi_service.setText("Kembali");
        back_transaksi_service.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                back_transaksi_serviceMousePressed(evt);
            }
        });
        back_transaksi_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_transaksi_serviceActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel75.setText("Tanggal");

        tgl_service.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tgl_service.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tgl_servicePropertyChange(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel76.setText("ID Staff Pelayan");

        id_staff_transaksi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_staff_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_staff_transaksiActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel91.setText("ID Service");

        id_service_transaksi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_service_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_service_transaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transaksi_baru_serviceLayout = new javax.swing.GroupLayout(transaksi_baru_service);
        transaksi_baru_service.setLayout(transaksi_baru_serviceLayout);
        transaksi_baru_serviceLayout.setHorizontalGroup(
            transaksi_baru_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transaksi_baru_serviceLayout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addGroup(transaksi_baru_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transaksi_baru_serviceLayout.createSequentialGroup()
                        .addComponent(simpan_transaksi_service)
                        .addGap(118, 118, 118)
                        .addComponent(back_transaksi_service))
                    .addGroup(transaksi_baru_serviceLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel75)
                        .addGap(51, 51, 51)
                        .addComponent(tgl_service, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transaksi_baru_serviceLayout.createSequentialGroup()
                        .addGroup(transaksi_baru_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(transaksi_baru_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel64)
                                .addComponent(jLabel76))
                            .addComponent(jLabel91))
                        .addGap(51, 51, 51)
                        .addGroup(transaksi_baru_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_service_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_kendaraan_service, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_staff_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(213, 213, 213))
            .addGroup(transaksi_baru_serviceLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel63)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transaksi_baru_serviceLayout.setVerticalGroup(
            transaksi_baru_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksi_baru_serviceLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel63)
                .addGap(35, 35, 35)
                .addGroup(transaksi_baru_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_service_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(transaksi_baru_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_staff_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76))
                .addGap(51, 51, 51)
                .addGroup(transaksi_baru_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(id_kendaraan_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(transaksi_baru_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75)
                    .addComponent(tgl_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(transaksi_baru_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan_transaksi_service)
                    .addComponent(back_transaksi_service))
                .addGap(100, 100, 100))
        );

        main.add(transaksi_baru_service, "card2");

        transaksi_baru_detail.setBackground(new java.awt.Color(255, 255, 255));

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel77.setText("DETAIL SERVICE");

        jLabel82.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel82.setText("Keterangan Transaksi");

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel83.setText("ID Service");

        id_service_detil.setEditable(false);
        id_service_detil.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_service_detil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_service_detilActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel84.setText("Part");

        part.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        part.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partActionPerformed(evt);
            }
        });

        jLabel85.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel85.setText("Harga");

        harga.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel86.setText("Ongkos Service");

        ongkos_service.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ongkos_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ongkos_serviceActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel87.setText("Jenis Transaksi");

        combo_jenis.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        combo_jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jenis", "Pembelian", "Service", "Pembelian dan Service" }));
        combo_jenis.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_jenisItemStateChanged(evt);
            }
        });
        combo_jenis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                combo_jenisMousePressed(evt);
            }
        });
        combo_jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_jenisActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel88.setText("ID Detail Service");

        id_detail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_detailActionPerformed(evt);
            }
        });

        simpan_transaksi_detail.setBackground(java.awt.Color.red);
        simpan_transaksi_detail.setForeground(new java.awt.Color(255, 255, 255));
        simpan_transaksi_detail.setText("Simpan");
        simpan_transaksi_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_transaksi_detailActionPerformed(evt);
            }
        });

        back_transaksi_detail.setBackground(java.awt.Color.red);
        back_transaksi_detail.setForeground(new java.awt.Color(255, 255, 255));
        back_transaksi_detail.setText("Kembali");
        back_transaksi_detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                back_transaksi_detailMousePressed(evt);
            }
        });
        back_transaksi_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_transaksi_detailActionPerformed(evt);
            }
        });

        keterangan_detail.setColumns(20);
        keterangan_detail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        keterangan_detail.setRows(5);
        jScrollPane2.setViewportView(keterangan_detail);

        javax.swing.GroupLayout transaksi_baru_detailLayout = new javax.swing.GroupLayout(transaksi_baru_detail);
        transaksi_baru_detail.setLayout(transaksi_baru_detailLayout);
        transaksi_baru_detailLayout.setHorizontalGroup(
            transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksi_baru_detailLayout.createSequentialGroup()
                .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transaksi_baru_detailLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel77))
                    .addGroup(transaksi_baru_detailLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(simpan_transaksi_detail)
                        .addGap(118, 118, 118)
                        .addComponent(back_transaksi_detail)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transaksi_baru_detailLayout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transaksi_baru_detailLayout.createSequentialGroup()
                        .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel84)
                            .addComponent(jLabel87)
                            .addComponent(jLabel88)
                            .addComponent(jLabel83))
                        .addGap(29, 29, 29)
                        .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(part, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transaksi_baru_detailLayout.createSequentialGroup()
                        .addComponent(id_service_detil, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel85)
                    .addComponent(jLabel86)
                    .addComponent(jLabel82))
                .addGap(29, 29, 29)
                .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ongkos_service, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        transaksi_baru_detailLayout.setVerticalGroup(
            transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksi_baru_detailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel77)
                .addGap(91, 91, 91)
                .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transaksi_baru_detailLayout.createSequentialGroup()
                        .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(combo_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(id_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(id_service_detil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(part, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(transaksi_baru_detailLayout.createSequentialGroup()
                        .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(ongkos_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82))))
                .addGap(117, 117, 117)
                .addGroup(transaksi_baru_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan_transaksi_detail)
                    .addComponent(back_transaksi_detail))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        main.add(transaksi_baru_detail, "card2");

        transaksi_baru.setBackground(new java.awt.Color(255, 255, 255));

        btn_kendaraan_terdaftar.setBackground(new java.awt.Color(255, 102, 102));
        btn_kendaraan_terdaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_kendaraan_terdaftarMousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Kendaraan Terdaftar");

        javax.swing.GroupLayout btn_kendaraan_terdaftarLayout = new javax.swing.GroupLayout(btn_kendaraan_terdaftar);
        btn_kendaraan_terdaftar.setLayout(btn_kendaraan_terdaftarLayout);
        btn_kendaraan_terdaftarLayout.setHorizontalGroup(
            btn_kendaraan_terdaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_kendaraan_terdaftarLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(51, 51, 51))
        );
        btn_kendaraan_terdaftarLayout.setVerticalGroup(
            btn_kendaraan_terdaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_kendaraan_terdaftarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel14)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btn_kendaraan_baru.setBackground(new java.awt.Color(255, 102, 102));
        btn_kendaraan_baru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_kendaraan_baruMousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Kendaraan Baru");

        javax.swing.GroupLayout btn_kendaraan_baruLayout = new javax.swing.GroupLayout(btn_kendaraan_baru);
        btn_kendaraan_baru.setLayout(btn_kendaraan_baruLayout);
        btn_kendaraan_baruLayout.setHorizontalGroup(
            btn_kendaraan_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_kendaraan_baruLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(49, 49, 49))
        );
        btn_kendaraan_baruLayout.setVerticalGroup(
            btn_kendaraan_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_kendaraan_baruLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel17)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel21.setText("TRANSAKSI BARU");

        back_transaksi.setBackground(java.awt.Color.red);
        back_transaksi.setForeground(new java.awt.Color(255, 255, 255));
        back_transaksi.setText("Kembali");
        back_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_transaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transaksi_baruLayout = new javax.swing.GroupLayout(transaksi_baru);
        transaksi_baru.setLayout(transaksi_baruLayout);
        transaksi_baruLayout.setHorizontalGroup(
            transaksi_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksi_baruLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btn_kendaraan_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btn_kendaraan_terdaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(transaksi_baruLayout.createSequentialGroup()
                .addGroup(transaksi_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transaksi_baruLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel21))
                    .addGroup(transaksi_baruLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(back_transaksi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transaksi_baruLayout.setVerticalGroup(
            transaksi_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksi_baruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(159, 159, 159)
                .addGroup(transaksi_baruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_kendaraan_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kendaraan_terdaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(back_transaksi)
                .addGap(139, 139, 139))
        );

        main.add(transaksi_baru, "card2");

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
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        main.add(main_transaksi);
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
    private void kendaraanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kendaraanMousePressed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(main_kendaraan);
        main.repaint();
        main.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_kendaraanMousePressed
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
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(transaksi_baru);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_btn_transaksi_baruMousePressed
    private void back_riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_riwayatActionPerformed
    }//GEN-LAST:event_back_riwayatActionPerformed
    private void back_riwayatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_riwayatMousePressed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(main_transaksi);
        main.repaint();
        main.revalidate();          
    }//GEN-LAST:event_back_riwayatMousePressed
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
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
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
    private void back_staffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_staffMousePressed
    }//GEN-LAST:event_back_staffMousePressed
    private void back_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_staffActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(main_staff);
        main.repaint();
        main.revalidate(); 
    }//GEN-LAST:event_back_staffActionPerformed
    private void insert_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_staffActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(input_staff);
        main.repaint();
        main.revalidate(); 
    }//GEN-LAST:event_insert_staffActionPerformed

    private void delete_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_staffActionPerformed
        try {
            String sql1 = "update staf set Deleted = 1 where IDStaf = '" +cari_staff.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
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
                    String sql="select * from staf where IDStaf like '%" + cari_staff.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
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
                    String sql="select * from staf where NamaStaf like '%" + cari_staff.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
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
                    String sql="select * from staf where Alamat like '%" + cari_staff.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
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
                    String sql="select * from staf where Posisi like '%" + cari_staff.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
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
                    String sql="select * from staf where Keterangan like '%" + cari_staff.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_staff.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            case 6:
                try{
                    String sql="select * from staf where Deleted like '%" + cari_staff.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_staff.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn_cari_staffActionPerformed

    private void reset_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_staffActionPerformed
        tampil_staff();
        cari_staff.setText("");
        combo_staff.setSelectedIndex(0);
    }//GEN-LAST:event_reset_staffActionPerformed

    private void btn_cari_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari_kendaraanActionPerformed
        switch (combo_kendaraan.getSelectedIndex()) {
            case 1:
                try{
                    String sql="select * from kendaraan where IDKendaraan like '%" + cari_kendaraan.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
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
                    String sql="select * from kendaraan where Pemilik like '%" + cari_kendaraan.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_kendaraan.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 3:
                try{
                    String sql="select * from kendaraan where Merk like '%" + cari_kendaraan.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_kendaraan.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 4:
                try{
                    String sql="select * from kendaraan where Keterangan like '%" + cari_kendaraan.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_kendaraan.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 5:
                try{
                    String sql="select * from staf where Deleted like '%" + cari_kendaraan.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
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
    }//GEN-LAST:event_reset_kendaraanActionPerformed

    private void btn_cari_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari_serviceActionPerformed
        switch (combo_service.getSelectedIndex()) {
            case 1:
                try{
                    String sql="select * from service where IDService like '%" + cari_service.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_service.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 2:
                try{
                    String sql="select * from service where TglService like '%" + cari_service.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_service.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 3:
                try{
                    String sql="select * from service where TotalBiaya like '%" + cari_service.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_service.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 4:
                try{
                    String sql="select * from service where IDStaf like '%" + cari_service.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_service.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 5:
                try{
                    String sql="select * from service where IDKendaraan like '%" + cari_service.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_service.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn_cari_serviceActionPerformed

    private void reset_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_serviceActionPerformed
        tampil_service();
        cari_service.setText("");
        combo_service.setSelectedIndex(0);
    }//GEN-LAST:event_reset_serviceActionPerformed

    private void btn_cari_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari_detailActionPerformed
        switch (combo_detail.getSelectedIndex()) {
            case 1:
                try{
                    String sql="select * from detilservice where IDDetil like '%" + cari_detail.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_detail.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 2:
                try{
                    String sql="select * from detilservice where Part like '%" + cari_detail.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_detail.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 3:
                try{
                    String sql="select * from detilservice where Harga like '%" + cari_detail.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_detail.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 4:
                try{
                    String sql="select * from detilservice where OngkosService like '%" + cari_detail.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_detail.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case 5:
                try{
                    String sql="select * from detilservice where Keterangan like '%" + cari_detail.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_detail.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            case 6:
                try{
                    String sql="select * from detilservice where IDService like '%" + cari_detail.getText() + "%'";
                    java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tabel_detail.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn_cari_detailActionPerformed

    private void update_id_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_id_staffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_id_staffActionPerformed

    private void update_nama_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_nama_staffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_nama_staffActionPerformed

    private void update_alamat_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_alamat_staffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_alamat_staffActionPerformed

    private void update_posisi_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_posisi_staffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_posisi_staffActionPerformed

    private void update_simpan_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_simpan_staffActionPerformed
        try{
            String sql_nama = "update staf set NamaStaf='" + update_nama_staff.getText() + "'where IDStaf='" + update_id_staff.getText() + "'";
            String sql_alamat = "update staf set Alamat='" + update_alamat_staff.getText() + "'where IDStaf='" + update_id_staff.getText() + "'";
            String sql_posisi = "update staf set Posisi='" + update_posisi_staff.getText() + "'where IDStaf='" + update_id_staff.getText() + "'";
            String sql_keterangan = "update staf set Keterangan='" + update_keterangan_staff.getText() + "'where IDStaf='" + update_id_staff.getText() + "'";
            
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
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
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_update_simpan_staffActionPerformed

    private void update_back_staffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_back_staffMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_back_staffMousePressed

    private void update_back_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_back_staffActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(main_staff);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_update_back_staffActionPerformed

    private void edit_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_staffActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(update_staff);
        main.repaint();
        main.revalidate();
        update_id_staff.setText(cari_staff.getText());
    }//GEN-LAST:event_edit_staffActionPerformed

    private void update_id_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_id_kendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_id_kendaraanActionPerformed

    private void update_pemilikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_pemilikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_pemilikActionPerformed

    private void update_merkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_merkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_merkActionPerformed

    private void update_simpan_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_simpan_kendaraanActionPerformed
        try{
            String sql_pemilik = "update kendaraan set Pemilik='" + update_pemilik.getText() + "'where IDKendaraan='" + update_id_kendaraan.getText() + "'";
            String sql_merk = "update kendaraan set Merk='" + update_merk.getText() + "'where IDKendaraan='" + update_id_kendaraan.getText() + "'";
            String sql_keterangan = "update kendaraan set Keterangan='" + update_keterangan_kendaraan.getText() + "'where IDKendaraan='" + update_id_kendaraan.getText() + "'";
            
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql_pemilik);
            java.sql.PreparedStatement pst2=conn.prepareStatement(sql_merk);
            java.sql.PreparedStatement pst4=conn.prepareStatement(sql_keterangan);
            pst1.executeUpdate();
            pst2.executeUpdate();
            pst4.executeUpdate();
            pst1.close();
            pst2.close();
            pst4.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_update_simpan_kendaraanActionPerformed

    private void update_back_kendaraanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_back_kendaraanMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_back_kendaraanMousePressed

    private void update_back_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_back_kendaraanActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(main_kendaraan);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_update_back_kendaraanActionPerformed

    private void edit_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_kendaraanActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(update_kendaraan);
        main.repaint();
        main.revalidate();
        update_id_kendaraan.setText(cari_kendaraan.getText());
    }//GEN-LAST:event_edit_kendaraanActionPerformed

    private void update_id_service_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_id_service_detailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_id_service_detailActionPerformed

    private void update_id_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_id_detailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_id_detailActionPerformed

    private void update_partActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_partActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_partActionPerformed

    private void update_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_hargaActionPerformed

    private void update_simpan_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_simpan_detailActionPerformed
        int h=Integer.parseInt(update_harga.getText());
        int o=Integer.parseInt(update_ongkos.getText());
        try{
            String sql_part = "update detilservice set Part='" + update_part.getText() + "'where IDDetil='" + update_id_detail.getText() + "'";
            String sql_harga = "update detilservice set Harga='" + h + "'where IDDetil='" + update_id_detail.getText() + "'";
            String sql_ongkos = "update detilservice set OngkosService='" + o + "'where IDDetil='" + update_id_detail.getText() + "'";
            String sql_keterangan = "update detilservice set Keterangan='" + update_keterangan_detail.getText() + "'where IDDetil='" + update_id_detail.getText() + "'";
            String sql_service = "update detilservice set IDService='" + update_id_service_detail.getText() + "'where IDDetil='" + update_id_detail.getText() + "'";
            
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql_part);
            java.sql.PreparedStatement pst2=conn.prepareStatement(sql_harga);
            java.sql.PreparedStatement pst3=conn.prepareStatement(sql_ongkos);
            java.sql.PreparedStatement pst4=conn.prepareStatement(sql_keterangan);
            java.sql.PreparedStatement pst5=conn.prepareStatement(sql_service);
            pst1.executeUpdate();
            pst2.executeUpdate();
            pst3.executeUpdate();
            pst4.executeUpdate();
            pst5.executeUpdate();
            pst1.close();
            pst2.close();
            pst3.close();
            pst4.close();
            pst5.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_update_simpan_detailActionPerformed

    private void update_back_detailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_back_detailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_back_detailMousePressed

    private void update_back_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_back_detailActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();

        //menambah panel
        main.add(riwayat_transaksi);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_update_back_detailActionPerformed

    private void edit_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_serviceActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(update_service);
        main.repaint();
        main.revalidate();
        update_id_service.setText(cari_service.getText());
    }//GEN-LAST:event_edit_serviceActionPerformed

    private void update_back_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_back_serviceActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();

        //menambah panel
        main.add(riwayat_transaksi);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_update_back_serviceActionPerformed

    private void update_back_serviceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_back_serviceMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_back_serviceMousePressed

    private void update_simpan_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_simpan_serviceActionPerformed
        try{
            String sql_tanggal = "update service set TglService='" + update_tgl + "'where IDService='" + update_id_service.getText() + "'";
            String sql_pelayan = "update service set IDStaf='" + update_id_staff_pelayan.getText() + "'where IDService='" + update_id_service.getText() + "'";
            String sql_plat = "update service set IDKendaraan='" + update_plat_nomor.getText() + "'where IDService='" + update_id_service.getText() + "'";
//            update_totalbiaya();
//            String sql2="update service set TotalBiaya="+String.valueOf(rs1.getString(1))+" where IDService='"+update_id_service.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql_tanggal);
//            java.sql.PreparedStatement pst2=conn.prepareStatement(sql2);
            java.sql.PreparedStatement pst3=conn.prepareStatement(sql_pelayan);
            java.sql.PreparedStatement pst4=conn.prepareStatement(sql_plat);
            pst1.executeUpdate();
//            pst2.executeUpdate(sql2);
            pst3.executeUpdate();
            pst4.executeUpdate();
            pst1.close();
//            pst2.close();
            pst3.close();
            pst4.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_update_simpan_serviceActionPerformed

    private void update_id_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_id_serviceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_id_serviceActionPerformed

    private void update_tanggal_servicePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_update_tanggal_servicePropertyChange
       if (update_tanggal_service.getDate()!=null){
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            update_tgl=format.format(update_tanggal_service.getDate());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_update_tanggal_servicePropertyChange

    private void update_ongkosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ongkosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_ongkosActionPerformed

    private void edit_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_detailActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();

        //menambah panel
        main.add(update_detail);
        main.repaint();
        main.revalidate();
        update_id_detail.setText(cari_detail.getText());
    }//GEN-LAST:event_edit_detailActionPerformed

    private void reset_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_detailActionPerformed
       tampil_detil();
       cari_detail.setText("");
       combo_detail.setSelectedIndex(0);
    }//GEN-LAST:event_reset_detailActionPerformed

    private void delete_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_kendaraanActionPerformed
        try {
            String sql1 = "update kendaraan set Deleted = 1 where IDKendaraan = '" +cari_kendaraan.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            pst1.executeUpdate();
            pst1.close();
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_delete_kendaraanActionPerformed

    private void delete_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_serviceActionPerformed
        try {
            String sql1 = "delete from service where IDService = '" +cari_service.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            pst1.executeUpdate();
            pst1.close();
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Gagal Dihapus/n Hapus Detail Service Dahulu");
        }
    }//GEN-LAST:event_delete_serviceActionPerformed

    private void delete_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_detailActionPerformed
        try {
            String sql1 = "delete from detilservice where IDDetil = '" +cari_detail.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            pst1.executeUpdate();
            pst1.close();
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Gagal Dihapus");
        }
    }//GEN-LAST:event_delete_detailActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        total();
    }//GEN-LAST:event_refreshActionPerformed

    private void id_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_kendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_kendaraanActionPerformed

    private void pemilikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemilikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pemilikActionPerformed

    private void merkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_merkActionPerformed

    private void simpan_transaksi_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_transaksi_kendaraanActionPerformed
        try{
            String sql="insert into kendaraan values('"
                    +id_kendaraan.getText()+"','"
                    +pemilik.getText()+"','"
                    +merk.getText()+"','"
                    +keterangan_kendaraan.getText()+"','"
                    +0+"')";
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampil_kendaraan();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan\n Mohon dicek kembali pengisiannya");
            System.out.println(e.getMessage());
        }
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(transaksi_baru_service);
        main.repaint();
        main.revalidate();
        id_kendaraan_service.setText(id_kendaraan.getText());
        id_kendaraan_service.setEditable(false);
    }//GEN-LAST:event_simpan_transaksi_kendaraanActionPerformed

    private void back_transaksi_kendaraanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_transaksi_kendaraanMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_back_transaksi_kendaraanMousePressed

    private void id_kendaraan_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_kendaraan_serviceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_kendaraan_serviceActionPerformed

    private void simpan_transaksi_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_transaksi_serviceActionPerformed
        try{
            String sql="insert into service values('"
                    +id_service_transaksi.getText()+"','"
                    +tgl+"','"
                    +0+"','"
                    +id_staff_transaksi.getText()+"','"
                    +id_kendaraan_service.getText()+"')";
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampil_service();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan\n Mohon dicek kembali pengisiannya");
            System.out.println(e.getMessage());
        }
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(transaksi_baru_detail);
        main.repaint();
        main.revalidate();
        id_service_detil.setText(id_service_transaksi.getText());
        id_service_detil.setEditable(false);
    }//GEN-LAST:event_simpan_transaksi_serviceActionPerformed

    private void back_transaksi_serviceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_transaksi_serviceMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_back_transaksi_serviceMousePressed

    private void tgl_servicePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tgl_servicePropertyChange
        if (tgl_service.getDate()!=null){
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            tgl=format.format(tgl_service.getDate());
        }   
    }//GEN-LAST:event_tgl_servicePropertyChange

    private void id_staff_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_staff_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_staff_transaksiActionPerformed

    private void id_service_detilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_service_detilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_service_detilActionPerformed

    private void partActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void ongkos_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ongkos_serviceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ongkos_serviceActionPerformed

    private void combo_jenisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_jenisItemStateChanged
        switch(combo_jenis.getSelectedIndex()){
            case 1:
                ongkos_service.setText("0");
                ongkos_service.setEditable(false);
                harga.setText("");
                harga.setEditable(true);
            break;
            case 2:
                ongkos_service.setText("");
                ongkos_service.setEditable(true);
                harga.setText("0");
                harga.setEditable(false);
            break;
            case 3:
                ongkos_service.setText("");
                ongkos_service.setEditable(true);
                harga.setText("");
                harga.setEditable(true);
            break;
            default:
                ongkos_service.setText("");
                ongkos_service.setEditable(true);
                harga.setText("");
                harga.setEditable(true);
            break;
        }
    }//GEN-LAST:event_combo_jenisItemStateChanged

    private void combo_jenisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_jenisMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_jenisMousePressed

    private void combo_jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_jenisActionPerformed

    private void id_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_detailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_detailActionPerformed

    private void simpan_transaksi_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_transaksi_detailActionPerformed
        int h=Integer.parseInt(harga.getText());
        int o=Integer.parseInt(ongkos_service.getText());
        try{
            String sql="insert into detilservice values('"
                    +id_detail.getText()+"','"
                    +part.getText()+"','"
                    +h+"','"
                    +o+"','"
                    +keterangan_detail.getText()+"','"
                    +id_service_detil.getText()+"')";
            String update1="update service set TotalBiaya = TotalBiaya+" + (h+o) + " where IDService=(select IDService from detilservice where IDDetil = '" + id_detail.getText() + "')";
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql);
            java.sql.PreparedStatement pst2=conn.prepareStatement(update1);
            pst1.execute();
            pst2.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampil_detil();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan\n Mohon dicek kembali pengisiannya");
            System.out.println(e.getMessage());
        }
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(riwayat_transaksi);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_simpan_transaksi_detailActionPerformed

    private void back_transaksi_detailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_transaksi_detailMousePressed
    }//GEN-LAST:event_back_transaksi_detailMousePressed

    private void id_service_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_service_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_service_transaksiActionPerformed

    private void back_transaksi_kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_transaksi_kendaraanActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(main_transaksi);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_back_transaksi_kendaraanActionPerformed

    private void back_transaksi_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_transaksi_serviceActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(transaksi_baru);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_back_transaksi_serviceActionPerformed

    private void btn_kendaraan_terdaftarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kendaraan_terdaftarMousePressed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(transaksi_baru_service);
        main.repaint();
        main.revalidate();
        id_kendaraan_service.setEditable(true);
        id_kendaraan_service.setText("");
    }//GEN-LAST:event_btn_kendaraan_terdaftarMousePressed

    private void btn_kendaraan_baruMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kendaraan_baruMousePressed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(transaksi_baru_kendaraan);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_btn_kendaraan_baruMousePressed

    private void back_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_transaksiActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(main_transaksi);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_back_transaksiActionPerformed

    private void back_transaksi_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_transaksi_detailActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(transaksi_baru);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_back_transaksi_detailActionPerformed

    private void insert_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_detailActionPerformed
         main.removeAll();
        main.repaint();
        main.revalidate();
        
        //menambah panel
        main.add(transaksi_baru_detail);
        main.repaint();
        main.revalidate();
        id_service_detil.setEditable(true);
        id_service_detil.setText("");
    }//GEN-LAST:event_insert_detailActionPerformed

    private void reset_biayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_biayaActionPerformed
        try{
            update_totalbiaya();
            String sql2="update service set TotalBiaya="+String.valueOf(rs1.getString(1))+" where IDService='"+cari_service.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
            java.sql.PreparedStatement pst2=conn.prepareStatement(sql2);
            pst2.executeUpdate();
            pst2.close();
            
            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_reset_biayaActionPerformed
    public void tampil_staff(){
    DefaultTableModel tabel=new DefaultTableModel();
    tabel.addColumn("ID Staff");
    tabel.addColumn("Nama");
    tabel.addColumn("Alamat");
    tabel.addColumn("Posisi");
    tabel.addColumn("Keterangan");
    tabel.addColumn("Dihapus");
    try {
        java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
        String sql="select * from staf";
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
            rs.getString(6)});
        }
        tabel_staff.setModel(tabel);
        }
    catch (Exception e){
                    JOptionPane.showMessageDialog(null, e);

    }
}
    public void tampil_kendaraan(){
    DefaultTableModel tabel=new DefaultTableModel();
    tabel.addColumn("ID Kendaraan");
    tabel.addColumn("Pemilik");
    tabel.addColumn("Merk");
    tabel.addColumn("Keterangan");
    tabel.addColumn("Dihapus");
    try {
        java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
        String sql="select * from kendaraan";
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
        tabel_kendaraan.setModel(tabel);
        }
    catch (Exception e){
    }
}
    public void tampil_service(){
    DefaultTableModel tabel=new DefaultTableModel();
    tabel.addColumn("ID Service");
    tabel.addColumn("Tanggal Service");
    tabel.addColumn("Total Biaya");
    tabel.addColumn("Staff Pelayan");
    tabel.addColumn("ID Kendaraan");
    try {
        java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
        String sql="select * from service";
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
        tabel_service.setModel(tabel);
        }
    catch (Exception e){
    }
}
    public void tampil_detil(){
    DefaultTableModel tabel=new DefaultTableModel();
    tabel.addColumn("ID Detil");
    tabel.addColumn("Part Diganti");
    tabel.addColumn("Harga Pembelian");
    tabel.addColumn("Ongkos Service");
    tabel.addColumn("Keterangan");
    tabel.addColumn("ID Service");
    try {
        java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
        String sql="select * from detilservice";
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
            rs.getString(6)});
        }
        tabel_detail.setModel(tabel);
        }
    catch (Exception e){
    }
}
    public void total(){
        try {
            String sql1 = "select sum(TotalBiaya) from service";
            String sql2 = "select count(IDService) from service";
            String sql3 = "select count(IDStaf) from staf where Deleted=0";
            String sql4 = "select count(IDKendaraan) from kendaraan where Deleted=0";
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
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
            String sql1 = "select sum(Harga+OngkosService) from detilservice where IDService='"+cari_service.getText()+"'";
            java.sql.Connection conn=(java.sql.Connection)javaapplication26.koneksi.getKoneksi();
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
                new ui_sipbentor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat_staff;
    private javax.swing.JButton back_riwayat;
    private javax.swing.JButton back_staff;
    private javax.swing.JButton back_transaksi;
    private javax.swing.JButton back_transaksi_detail;
    private javax.swing.JButton back_transaksi_kendaraan;
    private javax.swing.JButton back_transaksi_service;
    private javax.swing.JPanel beranda;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_cari_detail;
    private javax.swing.JButton btn_cari_kendaraan;
    private javax.swing.JButton btn_cari_service;
    private javax.swing.JButton btn_cari_staff;
    private javax.swing.JPanel btn_kendaraan_baru;
    private javax.swing.JPanel btn_kendaraan_terdaftar;
    private javax.swing.JPanel btn_riwayat_transaksi;
    private javax.swing.JPanel btn_transaksi_baru;
    private javax.swing.JTextField cari_detail;
    private javax.swing.JTextField cari_kendaraan;
    private javax.swing.JTextField cari_service;
    private javax.swing.JTextField cari_staff;
    private javax.swing.JComboBox<String> combo_detail;
    private javax.swing.JComboBox<String> combo_jenis;
    private javax.swing.JComboBox<String> combo_kendaraan;
    private javax.swing.JComboBox<String> combo_service;
    private javax.swing.JComboBox<String> combo_staff;
    private javax.swing.JButton delete_detail;
    private javax.swing.JButton delete_kendaraan;
    private javax.swing.JButton delete_service;
    private javax.swing.JButton delete_staff;
    private javax.swing.JButton edit_detail;
    private javax.swing.JButton edit_kendaraan;
    private javax.swing.JButton edit_service;
    private javax.swing.JButton edit_staff;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField id_detail;
    private javax.swing.JTextField id_kendaraan;
    private javax.swing.JTextField id_kendaraan_service;
    private javax.swing.JTextField id_service_detil;
    private javax.swing.JTextField id_service_transaksi;
    private javax.swing.JTextField id_staff;
    private javax.swing.JTextField id_staff_transaksi;
    private javax.swing.JPanel input_staff;
    private javax.swing.JButton insert_detail;
    private javax.swing.JButton insert_staff;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel kendaraan;
    private javax.swing.JTextArea keterangan_detail;
    private javax.swing.JTextArea keterangan_kendaraan;
    private javax.swing.JTextArea keterangan_staff;
    private javax.swing.JPanel main;
    private javax.swing.JPanel main_beranda;
    private javax.swing.JPanel main_kendaraan;
    private javax.swing.JPanel main_staff;
    private javax.swing.JPanel main_transaksi;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField merk;
    private javax.swing.JTextField nama_staff;
    private javax.swing.JTextField ongkos_service;
    private javax.swing.JTextField part;
    private javax.swing.JTextField pemilik;
    private javax.swing.JTextField posisi_staff;
    private javax.swing.JButton refresh;
    private javax.swing.JButton reset_biaya;
    private javax.swing.JButton reset_detail;
    private javax.swing.JButton reset_kendaraan;
    private javax.swing.JButton reset_service;
    private javax.swing.JButton reset_staff;
    private javax.swing.JPanel riwayat_transaksi;
    private javax.swing.JScrollPane scrollpane_detail;
    private javax.swing.JScrollPane scrollpane_kendaraan;
    private javax.swing.JScrollPane scrollpane_service;
    private javax.swing.JScrollPane scrollpane_staff;
    private javax.swing.JButton simpan_staff;
    private javax.swing.JButton simpan_transaksi_detail;
    private javax.swing.JButton simpan_transaksi_kendaraan;
    private javax.swing.JButton simpan_transaksi_service;
    private javax.swing.JPanel staff;
    private javax.swing.JTable tabel_detail;
    private javax.swing.JTable tabel_kendaraan;
    private javax.swing.JTable tabel_service;
    private javax.swing.JTable tabel_staff;
    private com.toedter.calendar.JDateChooser tgl_service;
    private javax.swing.JTextField total_kendaraan;
    private javax.swing.JTextField total_pendapatan;
    private javax.swing.JTextField total_staff;
    private javax.swing.JTextField total_transaksi;
    private javax.swing.JPanel transaksi;
    private javax.swing.JPanel transaksi_baru;
    private javax.swing.JPanel transaksi_baru_detail;
    private javax.swing.JPanel transaksi_baru_kendaraan;
    private javax.swing.JPanel transaksi_baru_service;
    private javax.swing.JTextField update_alamat_staff;
    private javax.swing.JButton update_back_detail;
    private javax.swing.JButton update_back_kendaraan;
    private javax.swing.JButton update_back_service;
    private javax.swing.JButton update_back_staff;
    private javax.swing.JPanel update_detail;
    private javax.swing.JTextField update_harga;
    private javax.swing.JTextField update_id_detail;
    private javax.swing.JTextField update_id_kendaraan;
    private javax.swing.JTextField update_id_service;
    private javax.swing.JTextField update_id_service_detail;
    private javax.swing.JTextField update_id_staff;
    private javax.swing.JTextField update_id_staff_pelayan;
    private javax.swing.JPanel update_kendaraan;
    private javax.swing.JTextArea update_keterangan_detail;
    private javax.swing.JTextArea update_keterangan_kendaraan;
    private javax.swing.JTextArea update_keterangan_staff;
    private javax.swing.JTextField update_merk;
    private javax.swing.JTextField update_nama_staff;
    private javax.swing.JTextField update_ongkos;
    private javax.swing.JTextField update_part;
    private javax.swing.JTextField update_pemilik;
    private javax.swing.JTextField update_plat_nomor;
    private javax.swing.JTextField update_posisi_staff;
    private javax.swing.JPanel update_service;
    private javax.swing.JButton update_simpan_detail;
    private javax.swing.JButton update_simpan_kendaraan;
    private javax.swing.JButton update_simpan_service;
    private javax.swing.JButton update_simpan_staff;
    private javax.swing.JPanel update_staff;
    private com.toedter.calendar.JDateChooser update_tanggal_service;
    // End of variables declaration//GEN-END:variables
}