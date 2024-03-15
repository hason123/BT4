
package com.mycompany.bai4;

import java.util.Scanner;


public class NhanVien{
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double luongMax;
    private double luongMoi;
    NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double luongMax){
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.luongMax = luongMax;
    }
    public String getTenNV(){
        return tenNhanVien;
    }
    public double getLuong(){
        return luongCoBan;
    }
    public double getLuongMax(){
        return luongMax;
    }
    public double getHSL(){
        return heSoLuong;
    }
    
    
    public boolean tangLuong (double heSo){
        luongMoi = luongCoBan * (heSo + heSoLuong);
        return luongMoi <= luongMax;
    }
    public void inTTin(){
        System.out.println("Ten Nhan Vien: " + tenNhanVien);
        System.out.println("Luong co ban: " + luongCoBan);
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
            //.out.print("Tham so truyen vao: ");
            input[i] = new NhanVien(name,LCB,HSL,MAX);
            
            
        }
        for (int i = 0; i < 2; i++){
            
            //input[i].getTenNV();
            //input[i].getLuong();
            //input[i].getLuongMax();
            //input[i].getHSL();
            input[i].inTTin();
        }  
    }
}
