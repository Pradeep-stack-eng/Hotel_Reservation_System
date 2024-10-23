package Hotle.Management.System;

import javax.swing.*;

public class Splash extends JFrame {

    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/royal1.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,500,500);
        add(label);

        setUndecorated(true );
        setLayout(null);
        setLocation(470,210);
        setSize(500,500);
        setVisible(true);


        try{
            Thread.sleep(5000);
            new Login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Splash();
    }
}
