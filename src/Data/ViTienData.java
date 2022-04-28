/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.ViTien;
import View.taoMKViTien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kell
 */
public class ViTienData {
    
    public void Test() throws SQLException {
        PreparedStatement ps = Connect.getConnect().prepareStatement("SELECT * FROM SoLuongKhachHang");
        ResultSet rs = ps.executeQuery();
        int soLuong  =  rs.getInt("SoLuongKhachHang");
        
        
        try{
            ps = Connect.getConnect().prepareStatement("UPDATE SoLuongKhachHang SET SoLuongKhachHang = ? WHERE SoLuongKhachHang = ?");
            ps.setInt(1, soLuong);
        } catch (SQLException e) {
        }
    }
    public static boolean taoViTien(String tenDangNhap, String matKhau, int soDu){
        try {
            PreparedStatement ps = Connect.getConnect().prepareStatement("INSERT INTO ViTien (TenDangNhap, MatKhau, SoDu) "
                    + "VALUES(?, ?, ?)");
            ps.setString(1, tenDangNhap);
            ps.setString(2, matKhau);
            ps.setInt(3, soDu);
            return ps.executeUpdate() > 0;
        }catch (SQLException ex) {
              return false;
        }
    }
    public static ViTien dangNhap(String taiKhoan, String pass) {
        ViTien vi = null;
        String sql;
        sql = "SELECT * FROM ViTien WHERE TenDangNhap =? and MatKhau =?";
        try{
            PreparedStatement ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, taiKhoan);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                vi = new ViTien();
                vi.setTenDN(taiKhoan);
                vi.setMatKhau(pass);
                vi.setSoDu(rs.getInt("SoDu"));
            }
        }
        catch(SQLException e) {
            return vi = null;
        }
        return vi;
    }
    public static int tinhSoDu(String tenTk) throws SQLException{
        String sql = "SELECT * FROM ViTien WHERE TenDangNhap = '" + tenTk + "'";
        try{
            PreparedStatement  ps = Connect.getConnect().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt("SoDu");
            }
            else{
                return  0;
            }
        }catch (SQLException e) {
                return -1;
        }
    }
    public static boolean napTien(int soTien, String tenTk) throws SQLException{
        // SELECT
        // LAY SO DU
        String sql = "SELECT * FROM ViTien WHERE TenDangNhap = '" + tenTk + "'";
        PreparedStatement  ps = Connect.getConnect().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            int soDu = tinhSoDu(tenTk);
            try {
                if(soDu > -1){
                    sql =  "UPDATE ViTien SET SoDu = " + (soTien + soDu) + "WHERE TenDangNhap = '" + tenTk + "'";
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
}
