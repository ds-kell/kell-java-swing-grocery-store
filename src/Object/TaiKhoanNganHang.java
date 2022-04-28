/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Kell
 */
public class TaiKhoanNganHang {
    private String hoTen;
    private String soThe;
    private String CCCD;
    private String ngayPhatHanh;
    private String nganHang;
    private String SDT;
    public TaiKhoanNganHang() {
        
    }
    public TaiKhoanNganHang(String hoTen, String soThe, String CCCD, String SDT, String ngayPhatHanh, String nganHang) {
        this.hoTen = hoTen;
        this.soThe = soThe;
        this.CCCD = CCCD;
        this.ngayPhatHanh = ngayPhatHanh;
        this.nganHang = nganHang;
        this.SDT = SDT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNganHang() {
        return nganHang;
    }

    public void setNganHang(String nganHang) {
        this.nganHang = nganHang;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}
