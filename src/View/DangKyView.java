/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Data.KhachData;
import Data.ViTienData;
import Object.Khach;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kell
 */
public class DangKyView extends javax.swing.JFrame {
    KhachData khachdata = new KhachData();
    /**
     * Creates new form DangKi
     */
    public DangKyView() {
        initComponents();
        this.setLocation(700, 200);
        setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTaiKhoan = new javax.swing.JTextField();
        jMatKhau1 = new javax.swing.JPasswordField();
        jMatKhau2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTen = new javax.swing.JTextField();
        jSDT = new javax.swing.JTextField();
        jDiaChi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jNam = new javax.swing.JRadioButton();
        jNu = new javax.swing.JRadioButton();
        jNgaySinh = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tài khoản");

        jLabel2.setText("Mật khẩu");

        jLabel3.setText("Nhập lại mật khẩu");

        jButton1.setText("Đăng kí");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("Đăng ký");

        jLabel5.setText("Họ và tên");

        jLabel6.setText("Giới tính");

        jLabel7.setText("Số điện thoại");

        jLabel8.setText("Địa chỉ");

        jLabel9.setText("Ngày sinh");

        jNam.setText("Nam");
        jNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNamActionPerformed(evt);
            }
        });

        jNu.setText("Nữ");
        jNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jMatKhau1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jTen)
                    .addComponent(jMatKhau2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jSDT)
                    .addComponent(jDiaChi)
                    .addComponent(jTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jNam)
                        .addGap(26, 26, 26)
                        .addComponent(jNu))
                    .addComponent(jNgaySinh))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jMatKhau2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jNam)
                        .addComponent(jNu)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String taiKhoan = jTaiKhoan.getText();
        String matKhau1 = new String(jMatKhau1.getPassword());
        String matKhau2 = new String(jMatKhau2.getPassword());
        String hoTen = jTen.getText();
        String gioiTinh = jNam.isSelected()?"Nam":"Nu";
        String sdt = jSDT.getText();
        String diaChi = jDiaChi.getText();
        String ngaySinh = jNgaySinh.getText();
        ngaySinh = ngaySinh.replaceAll("/", "-");
        String temp[] = ngaySinh.split("\\W+");
        if(taiKhoan.length()<6 || matKhau1.length()<6){
            JOptionPane.showMessageDialog(this, "Tài khoản và mật khẩu phải có độ dài từ 6-30 kí tự", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(!matKhau1.equals(matKhau2)){
                JOptionPane.showMessageDialog(this, "Mật khẩu không trùng khớp", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            else {
                boolean dk = KhachData.dangKi(taiKhoan, matKhau1, hoTen, gioiTinh, sdt, diaChi, ngaySinh);
                if(dk){
                    JOptionPane.showMessageDialog(this, "Đăng ký thành công");
                    boolean tmp = ViTienData.taoViTien(taiKhoan, matKhau2, 0);
                    if(!tmp){
                        JOptionPane.showMessageDialog(this, "Ví tiền của bạn chưa được tạo");
                    }
                    this.setVisible(false);
                }
                else 
                    JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNamActionPerformed
        // TODO add your handling code here:
        if(jNam.isSelected()){
            jNu.setSelected(false);
        }
    }//GEN-LAST:event_jNamActionPerformed

    private void jNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuActionPerformed
        // TODO add your handling code here:
        if(jNu.isSelected())
            jNam.setSelected(false);
    }//GEN-LAST:event_jNuActionPerformed

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
            java.util.logging.Logger.getLogger(DangKyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKyView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jDiaChi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jMatKhau1;
    private javax.swing.JPasswordField jMatKhau2;
    private javax.swing.JRadioButton jNam;
    private javax.swing.JTextField jNgaySinh;
    private javax.swing.JRadioButton jNu;
    private javax.swing.JTextField jSDT;
    private javax.swing.JTextField jTaiKhoan;
    private javax.swing.JTextField jTen;
    // End of variables declaration//GEN-END:variables
}
