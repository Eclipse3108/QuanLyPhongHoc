/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vy746
 */
public class DanhSachPhongHoc {

    List<PhongHoc> danhSachPH = new ArrayList<>();

    public DanhSachPhongHoc() {
        danhSachPH.add(new PhongLyThuyet(1, "PM01", "C", 10, 8));
        //danhSachPH.add(new PhongLyThuyet(2, "PLT02", "5B", 12, 4));
        //danhSachPH.add(new PhongLyThuyet(2, "PLT03", "5C", 10, 18));
        //danhSachPH.add(new PhongThucHanh(100, "TH01", "10A", 50, 10));
        //danhSachPH.add(new PhongThucHanh(50, "TH02", "10F", 10, 2));
    }

    public List<PhongHoc> getDanhSachPH() {
        return danhSachPH;
    }

    public void setDanhSachPH(List<PhongHoc> danhSachPH) {
        this.danhSachPH = danhSachPH;
    }

    public boolean createTH(PhongThucHanh tamPH) {

        if (tamPH != null) {
            danhSachPH.add(tamPH);
            return true;
        }
        return false;

    }

    public boolean createLT(PhongLyThuyet tamPH) {
        if (tamPH != null) {
            danhSachPH.add(tamPH);
            return true;
        }
        return false;
    }

    public void create() {
        String nhapNho;
        PhongHoc tamPH = new PhongHoc();
        while (true) {

            System.out.println("Nhap TH: Tao Phong Thuc Hanh");
            System.out.println("Nhap LT: Tao Phong Ly Thuyet");
            System.out.println("Nhap Thoat: Thoat");
            System.out.println("Ban muon nhap gi: ");
            nhapNho = Menu.input.nextLine();
            switch (nhapNho) {
                case "TH":
                    tamPH = new PhongThucHanh();
                    tamPH = tamPH.taoPhongHoc();
                    danhSachPH.add(tamPH);
                    break;
                case "LT":
                    tamPH = new PhongLyThuyet();
                    tamPH = tamPH.taoPhongHoc();
                    danhSachPH.add(tamPH);
                    break;
                case "Thoat":

                    return;
                default:
                    System.out.println("Khong Hop Le");
            }
        }

    }

    public void display() {
        //fore tab
        for (PhongHoc myFinger : danhSachPH) {
            System.out.println("" + myFinger.toString());
            System.out.println("" + myFinger.danhGia());
        }
    }

    public PhongHoc timPhongHocTheoMa(String ma) {
        PhongHoc ph = null;

        for (PhongHoc myFinger : danhSachPH) {
            if (myFinger.maPhong.equals(ma)) {
                ph = myFinger;
                return ph;
            }
        }
        return ph;
    }

    public void update(String ma) {

        for (PhongHoc myFinger : danhSachPH) {
            if (myFinger.maPhong.equals(ma)) {
                myFinger.setDayNha("11Tran");
                myFinger.setSoBongDen(7);
                return;

            }
        }
    }

    public int soPhongHoc() {
        return danhSachPH.size();
    }

    public void inDSPhongHocDatChuan() {
        for (PhongHoc phongHoc : danhSachPH) {
            if (phongHoc.danhGia().equals("Dat Chuan")) {
                System.out.println("" + phongHoc.toString());
            }
        }

    }

    public List<PhongHoc> inDSPHDatChuan() {
        List<PhongHoc> list = new ArrayList<>();
        for (PhongHoc phongHoc : danhSachPH) {
            if (phongHoc.danhGia().equals("Dat Chuan")) {
                list.add(phongHoc);
            }
        }
        return list;
    }

    public void inDSPhongHocMay40() {
        PhongThucHanh tmp = new PhongThucHanh();
        for (PhongHoc phongHoc : danhSachPH) {
            if (phongHoc instanceof PhongThucHanh) {
                tmp = (PhongThucHanh) phongHoc;
                if (tmp.getSoMayTinh() > 40) {
                    System.out.println("" + phongHoc.toString());
                }

            }
        }
    }

    public void txtDayActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
}
