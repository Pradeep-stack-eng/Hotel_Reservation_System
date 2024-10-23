package Hotle.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login2 extends JFrame implements ActionListener {

    JTextField textField1;
    JPasswordField passwordField1;
    JButton b1,b2;


    Login2(){

        JLabel label1 = new JLabel("username");
        label1.setBounds(40,20,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        add(label1);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(40,70,100,30);
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        add(label2);

        textField1 = new JTextField();
        textField1.setBounds(150,20,150,30);
        textField1.setForeground(Color.BLACK);
        textField1.setFont(new Font("Tahoma",Font.PLAIN,15));
        textField1.setBackground(Color.WHITE);
        add(textField1);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        passwordField1.setForeground(Color.BLACK);
        passwordField1.setBackground(Color.WHITE);
        add(passwordField1);


        b1= new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);

        b2= new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.white);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);

        ImageIcon imageIcon = new ImageIcon((ClassLoader.getSystemResource("icon/hotel2.gif")));
        Image i1 = imageIcon.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(-150,-10,1200,350);
        add(label);





        setUndecorated(true);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setLocation(400,270);
        setSize(600,350);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            try {
                Con c = new Con();
                String user = textField1.getText();
                String pass = passwordField1.getText();

                String q = "select * from login2 where user_name='"+user+"' and password = '"+pass+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if(resultSet.next()){
                    new Admin();
                    setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null,"invalid");
                }



            }catch(Exception E){
                E.printStackTrace();
            }
        }else {
            new Dashboard();
            setVisible(false);
        }


    }

    public static void main(String[] args) {
       new Login2();

    }
}
