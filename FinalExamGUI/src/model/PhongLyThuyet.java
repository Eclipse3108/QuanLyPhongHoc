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
public class PhongLyThuyet extends PhongHoc{
    private int soMayChieu;

    public PhongLyThuyet() {
    }

    public PhongLyThuyet(int soMayChieu) {
        this.soMayChieu = soMayChieu;
    }

    public PhongLyThuyet(int soMayChieu, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayChieu = soMayChieu;
    }


    public int getSoMayChieu() {
        return soMayChieu;
    }

    public void setSoMayChieu(int soMayChieu) {
        this.soMayChieu = soMayChieu;
    }

    @Override
    public String danhGia() {
     double duAnhSang = (double)dienTich/soBongDen;
     double chuanDanhGia = (double)10/soBongDen;
        if ((duAnhSang<=chuanDanhGia)&&soMayChieu>=0) {
            return "Dat Chuan";
        } else {
            return "Khong Dat Chuan";
        }
    }

    @Override
    public PhongHoc taoPhongHoc() {
        System.out.print("Nhap ma Phong: ");
        String ma= Menu.input.nextLine();
        System.out.print("Nhap day nha: ");
        String day= Menu.input.nextLine();
        System.out.print("Nhap Dien Tich: ");
        double dien= Menu.input.nextDouble();
        System.out.print("Nhap so bong den: ");
        int so= Menu.input.nextInt();
         System.out.print("Nhap vao so may chieu: ");
        int s = Menu.input.nextInt();
        Menu.input.nextLine();
        PhongHoc tamPh = new PhongLyThuyet(s, ma, day, dien, so);
        return tamPh;
    }

    
    
    @Override
    public String toString() {
        return "PhongLyThuyet{"+super.toString() + "soMayChieu=" + soMayChieu + '}';
    }
    
    
    public Object[] toArray()
    {
        return new Object[]{soMayChieu,maPhong, dayNha, dienTich,soBongDen};
    } 
}
