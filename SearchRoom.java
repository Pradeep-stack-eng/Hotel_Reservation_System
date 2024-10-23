package Hotle.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRoom extends JFrame implements ActionListener {

   JCheckBox checkbox;
   Choice choice;
   JTable table;
   JButton add, back;

    SearchRoom(){


        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);

        JLabel searchForRoom = new JLabel("Search For Room");
        searchForRoom.setBounds(250,11,186,31);
        searchForRoom.setForeground(Color.white);
        searchForRoom.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(searchForRoom);

        JLabel rbt = new JLabel("Room Bed Type:");
        rbt.setBounds(50,69,120,20);
        rbt.setForeground(Color.white);
        rbt.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(rbt);

        JLabel rn = new JLabel("Room Number:");
        rn.setBounds(18,169,120,20);
        rn.setForeground(Color.white);
        rn.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(rn);


        JLabel availability = new JLabel("Availability");
        availability.setBounds(160,169,120,20);
        availability.setForeground(Color.white);
        availability.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(availability);


        JLabel status = new JLabel("Status");
        status.setBounds(300,169,120,20);
        status.setForeground(Color.white);
        status.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(status);


        JLabel price = new JLabel("Price");
        price.setBounds(450,169,120,20);
        price.setForeground(Color.white);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);


        JLabel bedtype = new JLabel("Bed Type");
        bedtype.setBounds(565,169,120,20);
        bedtype.setForeground(Color.white);
        bedtype.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(bedtype);



        checkbox = new JCheckBox("Only Display Available");
        checkbox.setBounds(400,69,205,23);
        checkbox.setBackground(Color.black);
        checkbox.setForeground(Color.white);
        panel.add(checkbox);

        choice = new Choice();
        choice.add("Single bed");
        choice.add("Double bed");
        choice.add("Quad bed");
        choice.add("Master bed");
        choice.setBounds(170,70,120,20);
        choice.setBackground(Color.black);
        choice.setForeground(Color.white);
        panel.add(choice);

        table = new JTable();
        table.setBounds(0,187,700,180);
        table.setBackground(Color.black);
        table.setForeground(Color.white);
        panel.add(table);

        try {
            Con c = new Con();
            String q = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        }catch (Exception e){
            e.printStackTrace();
        }

        add = new JButton("Search");
        add.setBounds(200,400,120,30);
        add.setBackground(Color.lightGray);
        add.setForeground(Color.black);
        add.addActionListener(this);
        panel.add(add);


        back = new JButton("Back");
        back.setBounds(380,400,120,30);
        back.setBackground(Color.lightGray);
        back.setForeground(Color.black);
        back.addActionListener(this);
        panel.add(back);


        setUndecorated(true);
        setLocation(500,200);
        setLayout(null);
        setSize(700,500);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==add){
            String Q = "select * from Room where bed_type = '"+choice.getSelectedItem()+"'" ;
            String Q1 = "select * from Room where availability = 'Available' and bed_type = '"+choice.getSelectedItem()+"'" ;
            try {
                Con c = new Con();
                ResultSet resultSet = c.statement.executeQuery(Q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

                if (checkbox.isSelected()){
                    ResultSet resultSet1 = c.statement.executeQuery(Q1);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet1));

                }

            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }


    }

    public static void main(String[] args) {
        new SearchRoom();
    }
}
