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
public class PhongThucHanh extends PhongHoc {

    private int soMayTinh;

    public PhongThucHanh() {
    }

    public PhongThucHanh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    public PhongThucHanh(int soMayTinh, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    @Override
    public String danhGia() {
        double duMayTinh = (double) dienTich / soMayTinh;
        double chuan = (double) 1.5 / soMayTinh;
        if (duMayTinh >= chuan) {
            return "Dat Chuan";
        } else {
            return "Khong Dat Chuan";
        }
    }

    @Override
    public PhongHoc taoPhongHoc() {
        System.out.print("Nhap ma Phong: ");
        String ma = Menu.input.nextLine();
        System.out.print("Nhap day nha: ");
        String day = Menu.input.nextLine();
        System.out.print("Nhap Dien Tich: ");
        double dien = Menu.input.nextDouble();
        System.out.print("Nhap so bong den: ");
        int so = Menu.input.nextInt();
        System.out.print("Nhap vao so may tinh ");
        int s = Menu.input.nextInt();
        Menu.input.nextLine();
        PhongHoc tamPh = new PhongThucHanh(s, ma, day, dien, so);
        return tamPh;
    }

    @Override
    public String toString() {
        return "PhongThucHanh{" + super.toString() + "soMayTinh=" + soMayTinh + '}';
    }

    public Object[] toArray() {
        return new Object[]{soMayTinh, maPhong, dayNha, dienTich, soBongDen};
    }
}
