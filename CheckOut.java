package Hotle.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class CheckOut extends JFrame {
    CheckOut(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,790,390);
        panel.setBackground(Color.black);
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Check-Out");
        label.setBounds(100,20,100,30);
        label.setFont(new Font("Tahoma",Font.PLAIN,20));
        label.setForeground(Color.white);
        panel.add(label);

        JLabel UserId = new JLabel("Customer Id:");
        UserId.setBounds(30,80,100,30);
        UserId.setFont(new Font("Tahoma",Font.PLAIN,14));
        UserId.setForeground(Color.white);
        panel.add(UserId);

        Choice Customer = new Choice();
        Customer.setBounds(200,80,150,25);
        panel.add(Customer);

        JLabel roomNum = new JLabel("Room Number");
        roomNum.setBounds(30,130,100,30);
        roomNum.setFont(new Font("Tahoma",Font.PLAIN,14));
        roomNum.setForeground(Color.white);
        panel.add(roomNum);

        JLabel labelroomnumber = new JLabel();
        labelroomnumber.setBounds(200,130,100,30);
        labelroomnumber.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelroomnumber.setForeground(Color.white);
        panel.add(labelroomnumber);

        JLabel checkintime = new JLabel("Check-In Time");
        checkintime.setBounds(30,180,200,30);
        checkintime.setFont(new Font("Tahoma",Font.PLAIN,14));
        checkintime.setForeground(Color.white);
        panel.add(checkintime);

        JLabel labelcheckintime = new JLabel();
        labelcheckintime.setBounds(200,180,250,30);
        labelcheckintime.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelcheckintime.setForeground(Color.white);
        panel.add(labelcheckintime);

        JLabel checkouttime = new JLabel("Check-Out Time");
        checkouttime.setBounds(30,230,150,30);
        checkouttime.setFont(new Font("Tahoma",Font.PLAIN,14));
        checkouttime.setForeground(Color.white);
        panel.add(checkouttime);

        Date date = new Date();

        JLabel labelcheckouttime = new JLabel(""+date);
        labelcheckouttime.setBounds(200,230,250,30);
        labelcheckouttime.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelcheckouttime.setForeground(Color.white);
        panel.add(labelcheckouttime);

        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("Select * from customer");
            while (resultSet.next()){
                Customer.add(resultSet.getString("number"));
            }


        }catch (Exception E){
            E.printStackTrace();
        }

        JButton checkout = new JButton("Check-Out");
        checkout.setBounds(30,300,120,30);
        checkout.setForeground(Color.black);
        checkout.setBackground(Color.lightGray);
        panel.add(checkout);
        checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Con cv = new Con();
                    cv.statement.executeUpdate("delete from customer where number = '"+Customer.getSelectedItem()+"'");
                    cv.statement.executeUpdate("update room set availability = 'Available' where roomnumber = '"+labelroomnumber.getText()+"'");
                    JOptionPane.showMessageDialog(null, "Done");
                    setVisible(false);

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton check = new JButton("Check");
        check.setBounds(300,300,120,30);
        check.setForeground(Color.black);
        check.setBackground(Color.lightGray);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Con c = new Con();
                try {
                    ResultSet resultSet = c.statement.executeQuery("select * from customer where number = '"+Customer.getSelectedItem()+"'");
                    while (resultSet.next()){
                        labelroomnumber.setText(resultSet.getString("room"));
                        labelcheckintime.setText(resultSet.getString("checkintime"));
                    }

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton back = new JButton("Back");
        back.setBounds(170,300,120,30);
        back.setForeground(Color.black);
        back.setBackground(Color.lightGray);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });





        setUndecorated(true);
        setLayout(null);
        setSize(800,400);
        setLocation(500,210);
        setVisible(true);


    }

    public static void main(String[] args) {
        new CheckOut();
    }
}
