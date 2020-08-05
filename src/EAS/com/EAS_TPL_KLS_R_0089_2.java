package EAS.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EAS_TPL_KLS_R_0089_2 {
    private JFrame frame = new JFrame("EAS_TPL_KLS_R_0089_2");
    JLabel t = new JLabel("SURABAYA");
    JButton dukur,ngisor,metu;
    int y=60;
    public EAS_TPL_KLS_R_0089_2(){
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(650,600);
        frame.setLocation(200,50);
        frame.setVisible(true);

        frame.add(t);
        t.setBounds(250,y,120,30);
        t.setFont(new Font("ARIAL",Font.BOLD,20));

        dukur = new JButton("Atas");
        frame.add(dukur);
        dukur.setSize(100,25);
        dukur.setLocation(180,500);

        ngisor = new JButton("Bawah");
        frame.add(ngisor);
        ngisor.setSize(100,25);
        ngisor.setLocation(300,500);

        metu = new JButton("Keluar");
        frame.add(metu);
        metu.setSize(100,25);
        metu.setLocation(420,500);

        dukur.addActionListener(this::atasklik);
        ngisor.addActionListener(this::bawahklik);
        metu.addActionListener(this::metus);
    }

    private void atasklik(ActionEvent e){
        if ((y-20)>=0){
            y-=20;
            t.setBounds(250,y,120,30);
        }else {
            JOptionPane.showMessageDialog(null,"Tidak Bisa Keatas Sudah Mentok!!");
        }
    }

    private void bawahklik(ActionEvent e){
        if ((y+20)<=540){
            y+=20;
            t.setBounds(250,y,120,30);
        }else {
            JOptionPane.showMessageDialog(null,"Tidak Bisa Kebawah Sudah Mentok!!");
        }
    }

    private void metus(ActionEvent e){
        System.exit(0);
    }

    public static void main(String[] args) {new EAS_TPL_KLS_R_0089_2();}
}
