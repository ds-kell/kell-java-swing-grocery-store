/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Data.Connect;
import Data.HoaDonData;
import Data.KhachData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Data.SachData;
import Object.HoaDon;
import Object.Khach;
import Object.Sach;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Kell
 */
public class QuanTriView extends javax.swing.JFrame {
    /**
     * Creates new form QuanTriView
     */
    private static DefaultTableModel model;
    public QuanTriView() {
        initComponents();
        this.setLocation(700, 200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtTimSach = new javax.swing.JTextField();
        btnTimSach = new javax.swing.JButton();
        btnThemSach = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        btnTuyChonSach = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboTKSach = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        txtTimKhach = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhach = new javax.swing.JTable();
        btnThemKhach = new javax.swing.JButton();
        btnTuyChonKhach = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboSXKhach = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        comboThang = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDoanhSo = new javax.swing.JTextField();
        txtDoanhThu = new javax.swing.JTextField();
        txtLoiNhuan = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTimSach.setText("Nhập tên sách, tác giả hoặc nhà xuất bản");
        txtTimSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimSachMouseClicked(evt);
            }
        });

        btnTimSach.setText("Tìm kiếm");
        btnTimSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSachActionPerformed(evt);
            }
        });

        btnThemSach.setText("Thêm");
        btnThemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSachActionPerformed(evt);
            }
        });

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Nhà xuất bản", "Giá mua", "Giá bán", "Số lượng", "Doanh số", "Doanh thu"
            }
        ));
        jScrollPane3.setViewportView(tblSach);

        btnTuyChonSach.setText("Tùy chọn");
        btnTuyChonSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTuyChonSachActionPerformed(evt);
            }
        });

        jLabel1.setText("Sắp xếp theo");

        comboTKSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doanh thu 0-9", "Doanhthu 9-0", "Doanh số 0-9", "Doanh số 9-0", "Giá sách 0-9", "Giá sách 9-0", "Số lượng 0-9", "Số lượng 9-0", "Tên sách a-z", "Tên sách z-a", "Tác giả a-z", "Tác giả z-a", "Nhà xuất bản a-z", "Nhà xuất bản z-a" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnThemSach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTuyChonSach))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(txtTimSach, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(comboTKSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(42, 42, 42)
                .addComponent(btnTimSach)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimSach)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboTKSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTuyChonSach)
                    .addComponent(btnThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Quản lý sách", jPanel1);

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        txtTimKhach.setText("Nhập thông tin để tìm kiếm");
        txtTimKhach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimKhachMouseClicked(evt);
            }
        });

        tblKhach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài khoản", "Mật khẩu", "Họ tên", "Giới tính", "Số điện thoại", "Địa chỉ", "Ngày sinh", "Tiền đã chi", "Sách đã mua"
            }
        ));
        tblKhach.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblKhach);

        btnThemKhach.setText("Thêm");
        btnThemKhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKhachActionPerformed(evt);
            }
        });

        btnTuyChonKhach.setText("Tùy chọn");
        btnTuyChonKhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTuyChonKhachActionPerformed(evt);
            }
        });

        jLabel2.setText("Sắp xếp theo");

        comboSXKhach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền đã chi 0-9", "Tiền đã chi 9-0", "Số sách đã mua 0-9", "Số sách đã mua 9-0", "Tài khoản 0-9", "Tìa khoản 9-0", "Họ tên 0-9", "Họ tên 9-0", "Giới tính 0-9", "Giới tính 9-0", "Số điện thoại 0-9", "Số điện thoại 9-0", "Địa chỉ 0-9", "Địa chỉ 9-0", "Ngày sinh 0-9", "Ngày sinh 9-0", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(comboSXKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThemKhach)
                        .addGap(208, 208, 208)
                        .addComponent(btnTuyChonKhach))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTimKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnTimKiem)))
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem)
                    .addComponent(txtTimKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTuyChonKhach)
                            .addComponent(btnThemKhach)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(comboSXKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý khách hàng", jPanel2);

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "sMaHD", "sTK", "sTenKH", "sMaSach", "sTenSach", "iGiaSach", "iSoLuong", "iTien", "dNgayMua", "Lọi nhuận"
            }
        ));
        jScrollPane2.setViewportView(tblHoaDon);

        comboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" }));
        comboThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboThangActionPerformed(evt);
            }
        });

        jLabel3.setText("Doanh số ");

        jLabel4.setText("Doanh thu");

        jLabel5.setText("Lợi nhuận");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(comboThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(85, 85, 85)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(txtLoiNhuan)
                    .addComponent(txtDoanhSo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(txtDoanhSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(comboThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLoiNhuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Thống kê tháng", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimSachActionPerformed
        // TODO add your handling code here:
        int i = comboTKSach.getSelectedIndex();
        String ndTimKiem = txtTimSach.getText();
        boolean kq = SachData.timSach(ndTimKiem, tblSach, i);
        if(!kq)
            JOptionPane.showMessageDialog(this, "Không tìm thấy sách", "Thông báo", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnTimSachActionPerformed

    private void btnThemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSachActionPerformed
        // TODO add your handling code here:
        new ThemSachView().setVisible(true);
    }//GEN-LAST:event_btnThemSachActionPerformed

    private void txtTimSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimSachMouseClicked
        // TODO add your handling code here:
        txtTimSach.setText("");
    }//GEN-LAST:event_txtTimSachMouseClicked

    private void txtTimKhachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKhachMouseClicked
        // TODO add your handling code here:
        txtTimKhach.setText("");
    }//GEN-LAST:event_txtTimKhachMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        int i = comboSXKhach.getSelectedIndex();
        String ndTimKiem = txtTimKhach.getText();
        boolean kq = KhachData.timKhach(ndTimKiem, tblKhach, i);
        if(!kq)
            JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin", "Thông báo", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThemKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKhachActionPerformed
        new ThemKhachView().setVisible(true);
    }//GEN-LAST:event_btnThemKhachActionPerformed

    private void btnTuyChonSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTuyChonSachActionPerformed
        // TODO add your handling code here:
        int row = tblSach.getSelectedRow();
        String idRow="";
        Sach sach = new Sach();
        String sql;
        if(row!=-1){
            idRow = (String) tblSach.getModel().getValueAt(row, 0);
            sql = "SELECT * FROM Sach WHERE sMaSach = '" + idRow+"'";
            try {
                PreparedStatement ps = Connect.getConnect().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                if(rs.next()) {
                    sach.setMaSach(rs.getString("sMaSach"));
                    sach.setTenSach(rs.getString("sTenSach"));
                    sach.setTacGia(rs.getString("sTacGia"));
                    sach.setNhaXuatBan(rs.getString("sNhaXB"));
                    sach.setGiaMua(rs.getInt("iGiaMua"));
                    sach.setGiaBan(rs.getInt("iGiaBan"));
                    sach.setSoLuong(rs.getInt("iSoLuong"));
                    sach.setDoanhSo(rs.getInt("iDoanhSo"));
                    sach.setDoanhThu(rs.getInt("iDoanhThu"));
                    SuaSachView ssv = new SuaSachView();
                    ssv.setInfor(sach);
                    ssv.setVisible(true);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Đã có lỗi xảy ra", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnTuyChonSachActionPerformed

    private void btnTuyChonKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTuyChonKhachActionPerformed
        // TODO add your handling code here:
        int row = tblKhach.getSelectedRow();
        String idRow="";
        Khach khach = new Khach();
        String sql;
        if(row!=-1){
            idRow = (String) tblKhach.getModel().getValueAt(row, 0);
            sql = "SELECT * FROM Khach WHERE sTK = '" + idRow+"'";
            try {
                PreparedStatement ps = Connect.getConnect().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()) {
                    khach.setTaiKhoan(rs.getString("sTK"));
                    khach.setMatKhau(rs.getString("sMK"));
                    khach.setTenKhach(rs.getString("sTenKH"));
                    khach.setGioiTinh(rs.getString("sGT"));
                    khach.setSdt(rs.getString("sSDT"));
                    khach.setDiaChi(rs.getString("sDC"));
                    khach.setNgaySinh(rs.getString("dNgaySinh"));
                    
                    SuaKhachView skv = new SuaKhachView();
                    skv.setInfor(khach);
                    skv.setVisible(true);
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, khach.getMatKhau(), "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnTuyChonKhachActionPerformed

    private void comboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboThangActionPerformed
        // TODO add your handling code here:
        int thang = comboThang.getSelectedIndex();
        boolean kq = HoaDonData.HienThi(tblHoaDon, thang);
        int doanhSo = HoaDonData.getDoanhSo(thang);
        int doanhThu = HoaDonData.getDoanhThu(thang);
        int loiNhuan = HoaDonData.getLoiNhuan(thang);
        if(doanhSo!=0){
            txtDoanhSo.setText(String.valueOf(doanhSo));
            txtDoanhThu.setText(String.valueOf(doanhThu));
            txtLoiNhuan.setText(String.valueOf(loiNhuan));
        }
    }//GEN-LAST:event_comboThangActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(QuanTriView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanTriView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanTriView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanTriView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanTriView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemKhach;
    private javax.swing.JButton btnThemSach;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTimSach;
    private javax.swing.JButton btnTuyChonKhach;
    private javax.swing.JButton btnTuyChonSach;
    private javax.swing.JComboBox<String> comboSXKhach;
    private javax.swing.JComboBox<String> comboTKSach;
    private javax.swing.JComboBox<String> comboThang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblKhach;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtDoanhSo;
    private javax.swing.JTextField txtDoanhThu;
    private javax.swing.JTextField txtLoiNhuan;
    private javax.swing.JTextField txtTimKhach;
    private javax.swing.JTextField txtTimSach;
    // End of variables declaration//GEN-END:variables
}
