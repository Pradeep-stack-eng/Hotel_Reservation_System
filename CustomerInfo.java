package Hotle.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame {

    CustomerInfo(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(Color.black);
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,40,900,450);
        table.setBackground(Color.black);
        table.setForeground(Color.white);
        panel.add(table);

        try {
            Con c = new Con();
            String Q = "select * from customer";
            ResultSet resultSet = c.statement.executeQuery(Q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel id = new JLabel("ID");
        id.setBounds(31,11,100,14);
        id.setForeground(Color.white);
        id.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(id);

        JLabel idnumber = new JLabel(" Number");
        idnumber.setBounds(150,11,100,14);
        idnumber.setForeground(Color.white);
        idnumber.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(idnumber);

        JLabel name = new JLabel("Name");
        name.setBounds(270,11,100,14);
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(name);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(360,11,100,14);
        gender.setForeground(Color.white);
        gender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gender);

        JLabel country = new JLabel("Country");
        country.setBounds(480,11,100,18);
        country.setForeground(Color.white);
        country.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(country);

        JLabel roomno = new JLabel("RoomNO:");
        roomno.setBounds(590,11,100,14);
        roomno.setForeground(Color.white);
        roomno.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(roomno);

        JLabel date = new JLabel("CheckIn Time");
        date.setBounds(695,11,120,14);
        date.setForeground(Color.white);
        date.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(date);

        JLabel deposit = new JLabel("Deposit");
        deposit.setBounds(810,11,100,18);
        deposit.setForeground(Color.white);
        deposit.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(deposit);

        JButton back = new JButton("Back");
        back.setBounds(450,510,120,30);
        back.setBackground(Color.lightGray);
        back.setForeground(Color.black);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });








        setUndecorated(true);
        setLayout(null);
        setLocation(500,100);
        setSize(900,600);
        setVisible(true);


    }

    public static void main(String[] args) {
        new CustomerInfo();

    }
}
