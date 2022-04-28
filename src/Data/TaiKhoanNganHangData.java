/*"
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


import Object.TaiKhoanNganHang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kell
 */
public class TaiKhoanNganHangData {
    public TaiKhoanNganHang getTaiKhoan(String SoThe){
        TaiKhoanNganHang taiKhoan = new TaiKhoanNganHang();
        String sql = "SELECT * FROM TaiKhoanNH WHERE soThe = '"+SoThe+"'";
        try{
            PreparedStatement ps = Connect.getConnect().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                taiKhoan.setSoThe(rs.getString("SoThe"));
                taiKhoan.setHoTen(rs.getString("HoVaTen"));
                taiKhoan.setCCCD(rs.getString("CCCD"));
                taiKhoan.setNgayPhatHanh(rs.getString("NgayPhatHanh"));
                taiKhoan.setNganHang(rs.getString("TenNganHang"));
            }
            return taiKhoan;
        }catch (SQLException ex) {
            return taiKhoan;
        }
    }
    public static boolean themTaiKhoan(String soThe, String tk, String hoTen, String sdt, String cccd, String nganHang, String ngayPhatHanh){
        try {
              PreparedStatement ps = Connect.getConnect().prepareStatement("INSERT INTO TaiKhoanNganHang "
                    + "(SoThe, KhachHang, HoVaTen, SoDienThoai, CCCD, TenNganHang, NgayPhatHanh) " 
                    + "VALUES(?, ?, ?, ?, ?, ?, ?)");
//              TaiKhoanNganHang tknh = new TaiKhoanNganHang(hoTen, soThe, cccd, sdt, ngayPhatHanh, nganHang);
                ps.setString(1, soThe);
                ps.setString(2, tk);
                ps.setString(3, hoTen);
                ps.setString(4, sdt);
                ps.setString(5, cccd);
                ps.setString(6, nganHang);
                ps.setString(7, ngayPhatHanh);
              return ps.executeUpdate() > 0;
          } catch (SQLException ex) {
              return false;
          }
    }
 }
