
package com.mycompany.bai4;

import java.util.Scanner;


public class NhanVien{
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double luongMax;
    private double luongMoi;
    private double luongHienTai;
    NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double luongMax){
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.luongMax = luongMax;
    }
    public String getTenNV(){
        return this.tenNhanVien;
    }
    public double getLCB(){
        return this.luongCoBan;
    }
    public double getLuongMax(){
        return this.luongMax;
    }
    public double getHSL(){
        return this.heSoLuong;
    }
    public double getLuongHT(){
        luongHienTai = this.luongCoBan * this.heSoLuong;
        return luongHienTai;
    }
    public boolean tangLuong (double heSo){
        luongMoi = this.luongCoBan * (heSo + this.heSoLuong);
        return luongMoi <= luongMax;
    }
    public void inTTin(){
        luongHienTai = this.luongCoBan * this.heSoLuong;
        System.out.println("Ten Nhan Vien: " + tenNhanVien);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("Luong hien tai: " + luongHienTai);
        System.out.println("He so luong " + heSoLuong);
        System.out.println("Luong toi da: " + luongMax);  
    }
}
class TestNV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien[] input = new NhanVien[100];
        for (int i = 0; i < 2; i++){
            System.out.println("Nhap NV thu " + (i+1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("LCB: ");
            double LCB = scanner.nextDouble();
            System.out.print("HSL: ");
            double HSL = scanner.nextDouble();
            System.out.print("MAX: ");
            double MAX = scanner.nextDouble();
            System.out.print("Tham so truyen vao: ");
            double heSo = scanner.nextDouble();
            input[i] = new NhanVien(name,LCB,HSL,MAX);
            input[i].inTTin();
            if (input[i].tangLuong(heSo)){
                System.out.println("Tang Luong: TRUE");
                System.out.println("Luong moi: " + (input[i].getLCB() * (input[i].getHSL() + heSo)));
            }
            else {
                System.out.println("Tang Luong: FALSE");
            }
        }  
    }
}
