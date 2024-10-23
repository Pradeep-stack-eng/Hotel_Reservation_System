package Hotle.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {

    JButton add_Employee, add_Room, add_Drivers, Logout, Back;

    Admin(){

        add_Employee = new JButton("ADD EMPLOYEE");
        add_Employee.setBounds(250,230,200,30);
        add_Employee.setBackground(Color.lightGray);
        add_Employee.setForeground(Color.BLACK);
        add_Employee.setFont(new Font("Thaoma",Font.BOLD,15));
        add_Employee.addActionListener(this);
        add(add_Employee);

        add_Room = new JButton("ADD ROOM");
        add_Room.setBounds(250,380,200,30);
        add_Room.setBackground(Color.lightGray);
        add_Room.setForeground(Color.BLACK);
        add_Room.setFont(new Font("Thaoma",Font.BOLD,15));
        add_Room.addActionListener(this);
        add(add_Room);


        add_Drivers = new JButton("ADD Drivers");
        add_Drivers .setBounds(250,530,200,30);
        add_Drivers .setBackground(Color.lightGray);
        add_Drivers .setForeground(Color.BLACK);
        add_Drivers .setFont(new Font("Thaoma",Font.BOLD,15));
        add_Drivers .addActionListener(this);
        add(add_Drivers );

        Logout = new JButton("Logout");
        Logout .setBounds(10,750,95,30);
        Logout .setBackground(Color.lightGray);
        Logout .setForeground(Color.BLACK);
        Logout .setFont(new Font("Thaoma",Font.BOLD,15));
        Logout .addActionListener(this);
        add(Logout );

        Back = new JButton("Back");
        Back .setBounds(110,750,95,30);
        Back .setBackground(Color.lightGray);
        Back .setForeground(Color.BLACK);
        Back .setFont(new Font("Thaoma",Font.BOLD,15));
        Back .addActionListener(this);
        add(Back );

        ImageIcon E1 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image E11 = E1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(E11);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);

        ImageIcon R1 = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image R11 = R1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(R11);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(70,340,120,120);
        add(label1);

        ImageIcon D1 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image D11 = D1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(D11);
        JLabel label2 = new JLabel(imageIcon2);
        label2.setBounds(70,500,120,120);
        add(label2);

        ImageIcon L1 = new ImageIcon(ClassLoader.getSystemResource("icon/royal1.gif"));
        Image L11 = L1.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 = new ImageIcon(L11);
        JLabel label3 = new JLabel(imageIcon3);
        label3.setBounds(1000,200,400,400);
        add(label3);







        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setSize(1950,1080);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add_Employee){
            new AddEmployee();


        } else if (e.getSource() == add_Room) {
            new AddRoom();

        } else if (e.getSource() == add_Drivers) {
            new AddDriver();

        } else if (e.getSource() == Logout) {
            System.exit(103);

        } else if (e.getSource() == Back) {
            new Dashboard();
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        new Admin();
    }
}
