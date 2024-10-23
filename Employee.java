package Hotle.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Employee extends JFrame {

    Employee(){


        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(Color.black);
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,34,980,450);
        table.setForeground(Color.white);
        table.setBackground(Color.black);
        panel.add(table);

        try {

            Con c = new Con();
            String EmployeeSQL = "select * from employee";
            ResultSet resultSet = c.statement.executeQuery(EmployeeSQL);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }

        JButton button = new JButton("Back");
        button.setBounds(350,500,120,30);
        button.setBackground(Color.lightGray);
        button.setForeground(Color.black);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel name = new JLabel("Name");
        name.setBounds(41,11,70,19);
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(159,11,70,19);
        age.setForeground(Color.white);
        age.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(age);

        JLabel gneder = new JLabel("Gender");
        gneder.setBounds(273,11,70,19);
        gneder.setForeground(Color.white);
        gneder.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(gneder);

        JLabel job = new JLabel("Job");
        job.setBounds(416,11,70,19);
        job.setForeground(Color.white);
        job.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(job);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(536,11,70,19);
        salary.setForeground(Color.white);
        salary.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(salary);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(656,11,70,19);
        phone.setForeground(Color.white);
        phone.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(phone);

        JLabel citizenship  = new JLabel("Citizenship No:");
        citizenship.setBounds(750,11,150,19);
        citizenship.setForeground(Color.white);
        citizenship.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(citizenship);

        JLabel gmail = new JLabel("Gmail");
        gmail.setBounds(900,11,70,19);
        gmail.setForeground(Color.white);
        gmail.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(gmail);




        setUndecorated(true);
        setLayout(null);
        setLocation(430,100);
        setSize(1000,600);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Employee();
    }
}
