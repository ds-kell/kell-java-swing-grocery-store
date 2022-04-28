/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author Kell
 */
public class ViTien {
    private String maKH, tenDN;
    private int soDu;
    private String matKhau;

    public ViTien() {
    
    }
    public ViTien( String tenDN, int soDu, String matKhau) {
        this.maKH = "";
        this.soDu = soDu;
        this.matKhau = matKhau;
        this.tenDN =  tenDN;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    
}
