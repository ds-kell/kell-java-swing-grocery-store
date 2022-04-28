/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.text.DecimalFormat;
import java.util.Date;
import Data.SachData;
import java.io.*;
/**
 *
 * @author Kell
 */
public class Sach {
    private String maSach, tenSach, tacGia, nhaXuatBan;
    private int giaMua, giaBan, soLuong, doanhSo, doanhThu;
    private Date ngayMua, ngayBan;
    public Sach(String tenSach, String tacGia, String nhaXuatBan, int giaMua, int giaBan, int soLuong) throws FileNotFoundException, IOException{
        int ma = SachData.MaSach();
        this.maSach = "S" + String.format("%03d", ma);
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.doanhSo=0;
        this.doanhThu=0;
    }

    public int getDoanhSo() {
        return doanhSo;
    }

    public int getDoanhThu() {
        return doanhThu;
    }
    public Sach(){}
    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public void setDoanhSo(int doanhSo) {
        this.doanhSo = doanhSo;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void setGiaMua(int giaMua) {
        this.giaMua = giaMua;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
