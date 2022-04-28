/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Data.HoaDonData;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kell
 */
public class HoaDon {
    private String maHD, maTK, tenKH, maSach, tenSach, ngayMua;
    private int giaBan, giaMua, soLuong, tien;
    public HoaDon(Khach khach, Sach sach, int soLuong) {
        int ma = HoaDonData.maHoaDon();
        this.maHD= "HD" + new DecimalFormat("000").format(ma);
        this.maTK=khach.getTaiKhoan();
        this.tenKH=khach.getTenKhach();
        this.maSach=sach.getMaSach();
        this.tenSach=sach.getTenSach();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date(); 
        this.ngayMua = formatter.format(date);
        this.soLuong=soLuong;
        this.tien = sach.getGiaBan()*soLuong;
        this.giaBan=sach.getGiaBan();
        this.giaMua=sach.getGiaMua();
    }
     public HoaDon(){
         
     }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getMaHD() {
        return maHD;
    }

    public String getMaTK() {
        return maTK;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getTien() {
        return tien;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public void setGiaMua(int giaMua) {
        this.giaMua = giaMua;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setTien(int tien) {
        this.tien = tien;
    }
     
}