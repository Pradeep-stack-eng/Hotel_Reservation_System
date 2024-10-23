package Hotle.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {

    Department(){


        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(Color.black);
        table.setForeground(Color.white);
        panel.add(table);

       try {

            Con c = new Con();
            String departmentinfo = "select * from department";
            ResultSet resultSet = c.statement.executeQuery(departmentinfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("Back");
        back.setBounds(400,400,120,30);
        back.setBackground(Color.lightGray);
        back.setForeground(Color.black);
        add(back);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel label1 = new JLabel("Department");
        label1.setBounds(145,11,105,20);
        label1.setBackground(Color.black);
        label1.setForeground(Color.white);
        panel.add(label1);

        JLabel label2 = new JLabel("Budget");
        label2.setBounds(431,11,105,20);
        label2.setBackground(Color.black);
        label2.setForeground(Color.white);
        panel.add(label2);



        setUndecorated(true);
        setLayout(null);
        setLocation(550,150);
        setSize(700,500);
        setVisible(true);

    }

    public static void main(String[] args) {

        new Department();

    }
}
