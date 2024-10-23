package Hotle.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Pickup extends JFrame {

    Pickup(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,590);
        panel.setBackground(Color.black);
        panel.setLayout(null);
        add(panel);

        JLabel pus = new JLabel("Pick Up Service");
        pus.setBounds(90,11,170,20);
        pus.setForeground(Color.white);
        pus.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(pus);

        JLabel TOC = new JLabel("Type of Car");
        TOC.setBounds(32,97,89,18);
        TOC.setForeground(Color.white);
        TOC.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(TOC);

        Choice c = new Choice();
        c.setBounds(123,94,150,25);
        c.setBackground(Color.black);
        c.setForeground(Color.white);
        panel.add(c);

        try {
            Con C = new Con();
            ResultSet resultSet = C.statement.executeQuery("select * from driver");
            while (resultSet.next()){
                c.add(resultSet.getString("carname"));
            }

        }catch (Exception E){
            E.printStackTrace();
        }

        JTable table = new JTable();
        table.setBounds(0,233,850,250);
        table.setBackground(Color.black);
        table.setForeground(Color.white);
        panel.add(table);

        try {
            Con C = new Con();
            String q = "select * from driver";
            ResultSet resultSet = C.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        }catch (Exception e){
            e.printStackTrace();

        }

        JLabel name = new JLabel("Name");
        name.setBounds(24,208,46,14);
        name.setForeground(Color.white);
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(165,208,46,14);
        age.setForeground(Color.white);
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(264,208,46,14);
        gender.setForeground(Color.white);
        panel.add(gender);

        JLabel company = new JLabel("Company");
        company.setBounds(376,208,100,14);
        company.setForeground(Color.white);
        panel.add(company);

        JLabel carname = new JLabel("CarName");
        carname.setBounds(496,208,80,14);
        carname.setForeground(Color.white);
        panel.add(carname);

        JLabel available = new JLabel("Available");
        available.setBounds(620,208,60,14);
        available.setForeground(Color.white);
        panel.add(available);

        JLabel location = new JLabel("Location");
        location.setBounds(750,208,100,14);
        location.setForeground(Color.white);
        panel.add(location);

        JButton display = new JButton("Display");
        display.setBounds(200,500,120,30);
        display.setBackground(Color.black);
        display.setForeground(Color.white);
        panel.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "select * from driver where carname = '"+c.getSelectedItem()+"'";

                try {
                    Con connection = new Con();
                    ResultSet resultSet = connection.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));

                }catch (Exception E){
                    E.printStackTrace();
                }

            }
        });


        JButton back = new JButton("Back");
        back.setBounds(420,500,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setLayout(null);
        setSize(850,600);
        setLocation(500,100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Pickup();
    }
}
