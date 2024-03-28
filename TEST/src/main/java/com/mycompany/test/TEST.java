/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;
import java.util.Scanner;


/**
 *
 * @author ACER
 */
public class TEST {
    public void string(){
        long startTime = System.currentTimeMillis();
        String s = "Hello! ";
        for (int i = 1; i <= 10000; i++){
            s += "Hello! ";
        }
        System.out.println(s);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Thoi gian chay : " + totalTime + "ms");
        
    }
    public void stringBuffer(){
        long startTime = System.currentTimeMillis();
        StringBuffer s1 = new StringBuffer("Hello! ");
        for (int i = 1; i <= 10000; i++){
            s1.append("Hello! ");
        }
        System.out.println(s1);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Thoi gian chay : " + totalTime + "ms");
    }
    
    public static void main(String[] args) {
        TEST test = new TEST();
        test.string();
        test.stringBuffer();
    }
}
    
