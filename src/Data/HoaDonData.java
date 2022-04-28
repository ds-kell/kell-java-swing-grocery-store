/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import static Data.SachData.rs;
import Object.HoaDon;
import Object.Khach;
import Object.Sach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author Kell
 */
public class HoaDonData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    private ArrayList<HoaDon> list;
    public static int getDoanhThu(int i){
        String x[] = {"01/2021", "02/2021", "03/2021", "04/2021", "05/2021", "06/2021", "07/2021", "08/2021", "09/2021", "10/2021", "11/2021", "12/2021"};
        String sql = "SELECT SUM(iTien) FROM HoaDon WHERE sNgayMua LIKE '%"+ x[i] + "'";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
    public static int getLoiNhuan(int i){
        String x[] = {"01/2021", "02/2021", "03/2021", "04/2021", "05/2021", "06/2021", "07/2021", "08/2021", "09/2021", "10/2021", "11/2021", "12/2021"};
        String sql = "SELECT SUM(iLoiNhuan) FROM HoaDon WHERE sNgayMua LIKE '%"+ x[i] + "'";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
    public static int getDoanhSo(int i){
        String x[] = {"01/2021", "02/2021", "03/2021", "04/2021", "05/2021", "06/2021", "07/2021", "08/2021", "09/2021", "10/2021", "11/2021", "12/2021"};
        String sql = "SELECT SUM(iSoLuong) FROM HoaDon WHERE sNgayMua LIKE '%"+ x[i] + "'";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
    public static boolean HienThi(JTable tblHoaDon, int i){
        String x[] = {"01/2021", "02/2021", "03/2021", "04/2021", "05/2021", "06/2021", "07/2021", "08/2021", "09/2021", "10/2021", "11/2021", "12/2021"};
        String sql = "SELECT * FROM HoaDon WHERE sNgayMua LIKE '%"+ x[i] + "'";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            rs = ps.executeQuery();
            tblHoaDon.setModel((DbUtils.resultSetToTableModel(rs)));
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    public static int maHoaDon(){
        try {
            ps = Connect.getConnect().prepareStatement("SELECT * FROM HoaDon ORDER BY sMaHD DESC");
            rs = ps.executeQuery();
            if(rs.next()){
                String maSach = rs.getString("sMaHD");
                int ma = Integer.parseInt(maSach.substring(2));
                return ma+1;
            }
        } catch (SQLException ex) {
            return 1;
        }
        return 1;
    }
    public static boolean themHoaDon(Khach khach, Sach sach, int soLuong) {
        HoaDon hd = new HoaDon(khach, sach, soLuong);
        try {
            ps = Connect.getConnect().prepareStatement("INSERT INTO HoaDon VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, hd.getMaHD());
            ps.setString(2, hd.getMaTK());
            ps.setString(3, hd.getTenKH());
            ps.setString(4, hd.getMaSach());
            ps.setString(5, hd.getTenSach());
            ps.setInt(6, hd.getGiaBan());
            ps.setInt(7, hd.getSoLuong());
            ps.setInt(8, hd.getTien());
            ps.setString(9, hd.getNgayMua());
            ps.setInt(10, hd.getTien()-hd.getGiaMua()*soLuong);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
