package Hotle.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener {

    JTextField t2,t4;
    JComboBox t3,t5,t6;
    JButton b1,b2;

    AddRoom(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,846,490);
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("ADD Rooms");
        l1.setBounds(194,10,160,22);
        l1.setFont(new Font("Tahoma",Font.BOLD,22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);



        JLabel R2 = new JLabel(" Room Number ");
        R2.setBounds(64,70,152,22);
        R2.setFont(new Font("Tahoma",Font.BOLD,14));
        R2.setForeground(Color.WHITE);
        panel.add(R2);
        t2 = new JTextField();
        t2.setBounds(200,70,156,20);
        t2.setFont(new Font("Tahoma",Font.BOLD,14));
        t2.setForeground(Color.black);
        t2.setBackground(Color.WHITE);
        panel.add(t2);



        JLabel A2 = new JLabel(" Availability ");
        A2.setBounds(64,100,152,22);
        A2.setFont(new Font("Tahoma",Font.BOLD,14));
        A2.setForeground(Color.WHITE);
        panel.add(A2);
        t3 = new JComboBox(new String[] {"Available", "Occupied"});
        t3.setBounds(200,110,156,20);
        t3.setFont(new Font("Tahoma",Font.BOLD,14));
        t3.setForeground(Color.black);
        t3.setBackground(Color.WHITE);
        panel.add(t3);


        JLabel P2 = new JLabel(" Price ");
        P2.setBounds(64,150,152,22);
        P2.setFont(new Font("Tahoma",Font.BOLD,14));
        P2.setForeground(Color.WHITE);
        panel.add(P2);
        t4 = new JTextField();
        t4.setBounds(200,150,156,20);
        t4.setFont(new Font("Tahoma",Font.BOLD,14));
        t4.setForeground(Color.black);
        t4.setBackground(Color.WHITE);
        panel.add(t4);


        JLabel C2 = new JLabel(" Cleaning Status ");
        C2.setBounds(64,190,152,22);
        C2.setFont(new Font("Tahoma",Font.BOLD,14));
        C2.setForeground(Color.WHITE);
        panel.add(C2);
        t5 = new JComboBox(new String[] {"Cleaned","Dirty"});
        t5.setBounds(200,190,156,20);
        t5.setFont(new Font("Tahoma",Font.BOLD,14));
        t5.setForeground(Color.black);
        t5.setBackground(Color.WHITE);
        panel.add(t5);


        JLabel bt2 = new JLabel(" Bed Type ");
        bt2.setBounds(64,230,152,22);
        bt2.setFont(new Font("Tahoma",Font.BOLD,14));
        bt2.setForeground(Color.WHITE);
        panel.add(bt2);
        t6 = new JComboBox(new String[] {"Single","Double", "Quad", "Master"});
        t6.setBounds(200,230,156,20);
        t6.setFont(new Font("Tahoma",Font.BOLD,14));
        t6.setForeground(Color.black);
        t6.setBackground(Color.WHITE);
        panel.add(t6);

        b1 = new JButton("Add");
        b1.setBounds(64,321,111,33);
        b1.setFont(new Font("Tahoma",Font.BOLD,14));
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(198,321,111,33);
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icon/roomser.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);




        setUndecorated(true);
        setLocation(500,160);
        setLayout(null);
        setSize(855,500);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            String room = t2.getText();
            String ava = (String) t3.getSelectedItem();
            String status = (String) t5.getSelectedItem();
            String price = t4.getText();
            String type = (String) t6.getSelectedItem();

            if (room.isEmpty() || ava == null || status == null || price.isEmpty() || type == null) {
                // Show an error message if any field is empty
                JOptionPane.showMessageDialog(null, "Please fill all the fields before adding the room.", "Error", JOptionPane.ERROR_MESSAGE);
            } else


            try {
                Con c = new Con();
               /* String room = t2.getText();
                String ava = (String) t3.getSelectedItem();
                String status = (String) t5.getSelectedItem();
                String price = t4.getText();
                String type = (String) t6.getSelectedItem();*/



                String q = "insert into room values ('" + room + "', '" + ava + "', '" + status + "', '" + price + "', '" + type + "')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "Room Successfully Added");
                setVisible(false);

            } catch (Exception E) {
                E.printStackTrace();
            }

        }else{
            setVisible(false);
        }
    }

        public static void main (String[]args){
            new AddRoom();
        }

}
