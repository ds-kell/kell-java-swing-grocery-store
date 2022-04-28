/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.util.Date;

/**
 *
 * @author Kell
 */
public class Khach {
    private String tenKhach, gioiTinh, sdt, diaChi, taiKhoan, matKhau, ngaySinh;
    private int tien, soSach;
    private boolean daLienKetNh = false;
    public Khach(String taiKhoan, String matKhau, String tenKhach, String gioiTinh, String sdt, String diaChi, String ngaySinh){
        this.taiKhoan=taiKhoan;
        this.matKhau=matKhau;
        this.tenKhach=tenKhach;
        this.gioiTinh=gioiTinh;
        this.sdt=sdt;
        this.diaChi=diaChi;
        this.ngaySinh=ngaySinh;
        this.tien=0;
        this.soSach=0;
        this.daLienKetNh = false;
        
    }

    public void setSoSach(int soSach) {
        this.soSach = soSach;
    }

    public int getSoSach() {
        return soSach;
    }


    public void setTien(int tien) {
        this.tien = tien;
    }


    public int getTien() {
        return tien;
    }
    public Khach(){}
    public String getTenKhach() {
        return tenKhach;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getSdt() {
        return sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isDaLienKetNh() {
        return daLienKetNh;
    }

    public void setDaLienKetNh(boolean daLienKetNh) {
        this.daLienKetNh = daLienKetNh;
    }
    
}
