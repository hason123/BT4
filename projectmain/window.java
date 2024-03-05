package projectmain;

import javax.swing.JFrame;

public class window extends JFrame {
       public window(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("tên project sửa ở đây");
        this.setLocationRelativeTo(null);// cửa sổ sẽ xuất hiện ở dưới màn hình
        this.setSize(600,600);
        this.setResizable(true);
        this.add(new windowextend());
        this.pack();
    }
    public static void main(String[] args) {
        new window();
    }
    
}