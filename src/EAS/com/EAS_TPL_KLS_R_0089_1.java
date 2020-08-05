package EAS.com;

import javax.swing.*;
import java.awt.*;

public class EAS_TPL_KLS_R_0089_1 {
    private JFrame frame = new JFrame("EAS_TPL_KLS_R_0089_1");
    private JLabel s1,s2,s3;
    public EAS_TPL_KLS_R_0089_1(){
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(650,200);
        frame.setLocation(200,200);
        frame.setVisible(true);
        s1=new JLabel("SURABAYA");
        s2=new JLabel("SURABAYA");
        s3=new JLabel("SURABAYA");
        frame.add(s1);
        s1.setBounds(50,50,120,30);
        s1.setForeground(Color.RED);
        s1.setFont(new Font("ARIAL",Font.BOLD,20));

        frame.add(s2);
        s2.setBounds(450,50,120,30);
        s2.setForeground(Color.GREEN);
        s2.setFont(new Font("ARIAL",Font.BOLD,20));

        frame.add(s3);
        s3.setBounds(250,50,120,30);
        s3.setForeground(Color.BLUE);
        s3.setFont(new Font("ARIAL",Font.BOLD,20));
    }
    public static void main(String[] args) {new EAS_TPL_KLS_R_0089_1();}
}
