package Hotle.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    JButton add,rec;


    Dashboard(){
        super(" Annapurna Paradise Hotel");

        rec = new JButton("RECECPTION");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,16));
        rec.setBackground(Color.LIGHT_GRAY);
        rec.setForeground(Color.BLACK);
        rec.addActionListener(this);
        add(rec);

        add = new JButton("ADMIN");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("Tahoma",Font.BOLD,16));
        add.setBackground(Color.LIGHT_GRAY);
        add.setForeground(Color.BLACK);
        add.addActionListener(this);
        add(add);


        ImageIcon imageIconA = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i1A = imageIconA.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1A = new ImageIcon(i1A);
        JLabel labelA = new JLabel(imageIcon1A);
        labelA.setBounds(850,300,200,195);
        add(labelA);

        ImageIcon imageIconR = new ImageIcon(ClassLoader.getSystemResource("icon/REP.png"));
        Image i1R = imageIconR.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1R = new ImageIcon(i1R);
        JLabel labelR = new JLabel(imageIcon1R);
        labelR.setBounds(400,300,200,195);
        add(labelR);




        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard2.jpg"));
        Image i1 = imageIcon.getImage().getScaledInstance(1950,1090, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0,0,1950,1090);
        add(label);



        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rec){
             new Reception();
             setVisible(false);


        }else {
            new Login2();
            setVisible(false);


        }

    }

    public static void main(String[] args) {
        new Dashboard();
    }

}
