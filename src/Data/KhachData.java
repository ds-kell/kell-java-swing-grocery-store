/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.Khach;
import Object.Sach;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author Kell
 */
public class KhachData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    public Khach dangNhap(String taiKhoan, String pass) {
        Khach kh = null;
        try{
            ps = Connect.getConnect().prepareStatement("SELECT * FROM Khach where sTK = ? and sMK=?");
            ps.setString(1, "hiamkell");
            ps.setString(2, "123456");
            rs = ps.executeQuery();
            while(rs.next()) {
                kh = new Khach();
                kh.setTaiKhoan(taiKhoan);
                kh.setMatKhau(pass);
                kh.setTenKhach(rs.getString("sTenKH"));
                kh.setGioiTinh(rs.getString("sGT"));
                kh.setSdt(rs.getString("sSDT"));
//                kh.setDaLienKetNh(rs.getBoolean("DaLkTkNh"));
                kh.setDiaChi(rs.getString("sDC"));
                kh.setNgaySinh(rs.getString("dNgaySinh"));
                kh.setTien(rs.getInt("iTien"));
                kh.setSoSach(rs.getInt("iSoSach"));
            }
        }
        catch(Exception e) {
            return kh = null;
        }
        return kh;
    }
    public static void muaSach(Khach khach, Sach sach, int slMua) {
        try {
            ps = Connect.getConnect().prepareStatement("SELECT * FROM Khach WHERE sTK = '"+ khach.getTaiKhoan()+"'");
            rs = ps.executeQuery();
            if(rs.next()){
                int tien = rs.getInt(9);
                int soSach = rs.getInt(10);
                ps = Connect.getConnect().prepareStatement("UPDATE Khach SET iTien = ?, iSoSach = ? WHERE sTK = ?");
                ps.setString(1, String.valueOf(tien+slMua*sach.getGiaBan()));
                ps.setString(2, String.valueOf(soSach+slMua));
                ps.setString(3, khach.getTaiKhoan());
                ps.execute();
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static boolean dangKi(String taiKhoan, String matKhau, String ten, String gioiTinh, String sdt, String diaChi, String ngaySinh){
        try{
            ps = Connect.getConnect().prepareStatement("SELECT * FROM Khach WHERE sTK = ? ");
            ps.setString(1, taiKhoan);
            rs = ps.executeQuery();
            String ans = rs.getString(1);
            return false;
        }
        catch(SQLException e){
            try {
                ps = Connect.getConnect().prepareStatement("INSERT INTO Khach VALUES(?, ?, ?, ?, ?, ?, ?, ?,?, ?)");
                ps.setString(1, taiKhoan);
                ps.setString(2,matKhau);
                ps.setString(3, ten);
                ps.setString(4, gioiTinh);
                ps.setString(5, sdt);
                ps.setBoolean(6, false);
                ps.setString(7, diaChi);
                ps.setString(8, ngaySinh);
                ps.setString(9, "0");
                ps.setString(10, "0");
                ps.execute();
                return true;
            } catch (SQLException ex) {
                return false;
            }
        }
    }
    public static boolean timKhach(String ndTimKiem, JTable tblSach){
        String sql = "SELECT * FROM Khach WHERE sTK LIKE '%"+ ndTimKiem +"' OR sTenKH LIKE N'%"+ ndTimKiem +"%' OR sGT LIKE N'%"+ ndTimKiem +"%' OR sSDT LIKE '%"+ndTimKiem+"%' OR sDC LIKE '%"+ndTimKiem+"%' OR dNgaySinh LIKE '%"+ndTimKiem+"%'";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            rs = ps.executeQuery();
            tblSach.setModel((DbUtils.resultSetToTableModel(rs)));
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    public static boolean timKhach(String ndTimKiem, JTable tblSach, int i){
        String x[] = {" iTien ASC", " iTien DESC", " iSoSach", " iSoSach", " sTK ASC", " sTK DESC", " sTenKH", " sGT ASC", " sGT DESC", " sSDT ASC", " sSDT DESC", " sDC ASC", " sDC DESC", " dNgaySinh ASC", " dNgaySinh DESC"};
        String sql = "SELECT * FROM Khach WHERE sTK LIKE '%"+ ndTimKiem +"' OR sTenKH LIKE N'%"+ ndTimKiem +"%' OR sGT LIKE N'%"+ ndTimKiem +"%' OR sSDT LIKE '%"+ndTimKiem+"%' OR sDC LIKE '%"+ndTimKiem+"%' OR dNgaySinh LIKE '%"+ndTimKiem+"%' ORDER BY "+x[i];
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            rs = ps.executeQuery();
            tblSach.setModel((DbUtils.resultSetToTableModel(rs)));
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    public static boolean suaKhach(String TK, String MK, String HT, String GT, String SDT, String DC, String NS){
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE Khach SET sMK = ?, sTenKH = ?, sGT = ?, sSDT = ?, sDC = ?, dNgaySinh = ? WHERE sTK = ?");
            ps.setString(1, MK);
            ps.setString(2, HT);
            ps.setString(3, GT);
            ps.setString(4, SDT);
            ps.setString(5, DC);
            ps.setString(6, NS);
            ps.setString(7, TK);
            ps.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    public static boolean SuaTrangThaiLienKet(boolean lk, String tenTk) throws SQLException{
        // SELECT
        // LAY SO DU
        String sql = "SELECT * FROM ViTien WHERE TenDangNhap = '" + tenTk + "'";
        PreparedStatement  ps = Connect.getConnect().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            try {
                if(lk){
                    sql =  "UPDATE Khach SET DaLkTkNh = " + lk + "WHERE sTK = '" + tenTk + "'";
                    ps = Connect.getConnect().prepareStatement(sql);
                    ps.executeUpdate();
                    return true;
                }
                else
                    return false;
            } catch (SQLException e) {
                return false;
            }
        }   
        return false;
    }
    public static boolean xoaKhach(String IDrow){
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM Khach WHERE sTK=?");
            ps.setString(1, IDrow);
            ps.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
