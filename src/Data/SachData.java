/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.Sach;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author Kell
 */
public class SachData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static int MaSach(){
        try {
            ps = Connect.getConnect().prepareStatement("SELECT * FROM Sach ORDER BY sMaSach DESC");
            rs = ps.executeQuery();
            if(rs.next()){
                String maSach = rs.getString("sMaSach");
                int ma = Integer.parseInt(maSach.substring(1));
                return ma + 1;
            }
        } catch (SQLException ex) {
            return 1;
        }
        return 1;
    }
    public static Sach getSach(String sMaSach) {
        Sach sach = new Sach();
        String sql = "SELECT * FROM Sach WHERE sMaSach = '"+sMaSach+"'";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                sach.setMaSach(rs.getString("sMaSach"));
                sach.setTenSach(rs.getString("sTenSach"));
                sach.setTacGia(rs.getString("sTacGia"));
                sach.setNhaXuatBan(rs.getString("sNhaXB"));
                sach.setGiaMua(rs.getInt("iGiaMua"));
                sach.setGiaBan(rs.getInt("iGiaBan"));
                sach.setSoLuong(rs.getInt("iSoLuong"));
                sach.setDoanhSo(rs.getInt("iDoanhSo"));
                sach.setDoanhThu(rs.getInt("iDoanhThu"));
            }
            return sach;
        } catch (SQLException ex) {
            return sach;
        }
    }
    public static boolean timSach(String ndTimKiem, JTable jTblSach){
        String sql = "SELECT * FROM Sach WHERE sTenSach LIKE N'%"+ ndTimKiem +"' OR sTacGia LIKE N'%"+ ndTimKiem +"%' OR sNhaXB LIKE N'%"+ ndTimKiem +"%'";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            rs = ps.executeQuery();
            jTblSach.setModel((DbUtils.resultSetToTableModel(rs)));
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    public static boolean timSach(String ndTimKiem, JTable jTblSach, int i){
        String sx[] = {"iDoanhThu ASC", "iDoanhThu DESC", "iDoanhSo ASC", "iDoanhSo DESC", "iGiaBan ASC", "iGiaBan DESC", "iSoLuong ASC", "iSoLuong DESC", "sTenSach ASC", "sTenSach DESC", "sTacGia ASC", "sTacGia DESC", "sNhaXB ASC", "sNhaXB DESC"};
        String sql = "SELECT * FROM Sach WHERE sTenSach LIKE N'%"+ ndTimKiem +"' OR sTacGia LIKE N'%"+ ndTimKiem +"%' OR sNhaXB LIKE N'%"+ ndTimKiem +"%' ORDER BY " + sx[i];
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            rs = ps.executeQuery();
            jTblSach.setModel((DbUtils.resultSetToTableModel(rs)));
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    public static boolean themSach(String tenSach, String tacGia, String nhaXuatBan, int giaMua, int giaBan, int soLuong) throws IOException {
        try {
            ps = Connect.getConnect().prepareStatement("SELECT * FROM Sach WHERE sTenSach = '"+tenSach+"' and sTacGia = '"+tacGia+"' and sNhaXB = '"+nhaXuatBan+"'");
            rs = ps.executeQuery();
            if(!rs.next()){
                Sach sach = new Sach(tenSach, tacGia, nhaXuatBan, giaMua, giaBan, soLuong);
                ps = Connect.getConnect().prepareStatement("INSERT INTO Sach VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
                ps.setString(1, sach.getMaSach());
                ps.setString(2, sach.getTenSach());
                ps.setString(3, sach.getTacGia());
                ps.setString(4, sach.getNhaXuatBan());
                ps.setInt(5, sach.getGiaMua());
                ps.setInt(6, sach.getGiaBan());
                ps.setInt(7, sach.getSoLuong());
                ps.setInt(8, 0);
                ps.setInt(9, 0);
                ps.execute();
                return true;
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }
    public static boolean suaSach(Sach sach){
        try {
            ps = Connect.getConnect().prepareStatement("SELECT * FROM Sach WHERE sMaSach = ?");
            ps.setString(1, sach.getMaSach());
            rs = ps.executeQuery();
            ps = Connect.getConnect().prepareStatement("UPDATE Sach SET sTenSach = ?, sTacGia = ?, sNhaXB = ?, iGiaMua = ?, iGiaBan = ?, iSoLuong = ? WHERE sMaSach = ?");
            ps.setString(1, sach.getTenSach());
            ps.setString(2, sach.getTacGia());
            ps.setString(3, sach.getNhaXuatBan());
            ps.setInt(4, sach.getGiaMua());
            ps.setInt(5, sach.getGiaBan());
            ps.setInt(6, sach.getSoLuong());
            ps.setString(7, sach.getMaSach());
            ps.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    public static boolean banSach(Sach sach, int n){
        try {
            ps = Connect.getConnect().prepareStatement("SELECT * FROM Sach WHERE sMaSach = '"+sach.getMaSach()+"'");
            rs = ps.executeQuery();
            if(rs.next()){
                int doanhSo = rs.getInt("iDoanhSo");
                int doanhThu = rs.getInt("iDoanhThu");
                ps = Connect.getConnect().prepareStatement("UPDATE Sach SET iSoLuong = ?, iDoanhSo = ?, iDoanhThu = ? WHERE sMaSach = ?");
                ps.setString(1, String.valueOf(sach.getSoLuong()-n));
                ps.setString(2, String.valueOf(doanhSo+n));
                ps.setString(3, String.valueOf(doanhThu+sach.getGiaBan()*n));
                ps.setString(4, sach.getMaSach());
                ps.execute();
                return true;
            }
            return false;
        } catch (SQLException e) {
            return false;
        }
    }
    public static boolean xoaSach(String IDrow){
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM Sach WHERE sMaSach=?");
            ps.setString(1, IDrow);
            ps.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
