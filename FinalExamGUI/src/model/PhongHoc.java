/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vy746
 */
public class PhongHoc implements IPhongHoc{

    protected String maPhong;
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;
    
    

    public PhongHoc() {
    }

    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }
    
    public PhongHoc taoPhongHoc()
    {
        
        return null;
                
    }
    @Override
    public String danhGia() {
      return "";  
    }

    @Override
    public String toString() {
        return "PhongHoc{" + "maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen=" + soBongDen + '}';
    }
     public Object[] toArray()
    {
        return new Object[]{maPhong, dayNha, dienTich,soBongDen};
    }
    
}
