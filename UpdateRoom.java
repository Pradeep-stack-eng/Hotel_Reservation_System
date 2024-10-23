package Hotle.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateRoom extends JFrame {

    UpdateRoom(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,940,440);
        panel.setBackground(Color.black);
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);

        JLabel label1 = new JLabel("Update Room Status");
        label1.setBounds(124,11,222,25);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        label1.setForeground(Color.white);
        panel.add(label1);

        JLabel label2 = new JLabel("ID: ");
        label2.setBounds(25,88,46,14);
        label2.setFont(new Font("Tahoma",Font.PLAIN,14));
        label2.setForeground(Color.white);
        panel.add(label2);

        Choice c = new Choice();
        c.setBounds(248,85,140,20);
        c.setBackground(Color.black);
        c.setForeground(Color.white);
        c.setFont(new Font("Tahoma",Font.PLAIN,12));
        panel.add(c);

        try {
            Con C = new Con();
            ResultSet resultSet = C.statement.executeQuery("select * from customer");
            while (resultSet.next()){
                c.add(resultSet.getString("Number"));

            }

        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel label3 = new JLabel("Room Number:");
        label3.setBounds(25,129,107,14);
        label3.setFont(new Font("Tahoma",Font.PLAIN,14));
        label3.setForeground(Color.white);
        panel.add(label3);
        JTextField textField3 = new JTextField();
        textField3.setBounds(248,129,140,20);
        textField3.setBackground(Color.black);
        textField3.setForeground(Color.white);
        textField3.setFont(new Font("Tahoma",Font.PLAIN,12));
        panel.add(textField3);


        JLabel label4 = new JLabel("Availability:");
        label4.setBounds(25,174,97,14);
        label4.setFont(new Font("Tahoma",Font.PLAIN,14));
        label4.setForeground(Color.white);
        panel.add(label4);
        JTextField textField4 = new JTextField();
        textField4.setBounds(248,174,140,20);
        textField4.setBackground(Color.black);
        textField4.setForeground(Color.white);
        textField4.setFont(new Font("Tahoma",Font.PLAIN,12));
        panel.add(textField4);


        JLabel label5 = new JLabel("Clean Status");
        label5.setBounds(25,216,97,14);
        label5.setFont(new Font("Tahoma",Font.PLAIN,14));
        label5.setForeground(Color.white);
        panel.add(label5);
        JTextField textField5 = new JTextField();
        textField5.setBounds(248,216,140,20);
        textField5.setBackground(Color.black);
        textField5.setForeground(Color.white);
        textField5.setFont(new Font("Tahoma",Font.PLAIN,12));
        panel.add(textField5);




        JButton update = new JButton("Update");
        update.setBounds(120,315,89,23);
        update.setBackground(Color.lightGray);
        update.setForeground(Color.black);
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Con C = new Con();

                    String status = textField5.getText();
                    C.statement.executeUpdate("update room set cleaning_statuse = '"+status+"' where roomnumber =" +textField3.getText() );
                    JOptionPane.showMessageDialog(null,"updated successfully");
                    setVisible(false);

                }catch (Exception E){
                    E.printStackTrace();
                }

            }
        });

        JButton back = new JButton("Back");
        back.setBounds(180,355,89,23);
        back.setBackground(Color.lightGray);
        back.setForeground(Color.black);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JButton check = new JButton("Check");
        check.setBounds(60,355,89,23);
        check.setBackground(Color.lightGray);
        check.setForeground(Color.black);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = c.getSelectedItem();
                String Q = "select * from customer where number = '"+id+"'";
                try {
                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery(Q);

                    while (resultSet.next()){
                        textField3.setText(resultSet.getString("room"));

                    }
                    ResultSet resultSet1  = c.statement.executeQuery("select * from room where roomnumber = '"+textField3.getText()+"'");

                    while (resultSet1.next()){
                        textField4.setText(resultSet1.getString("availability"));
                        textField5.setText(resultSet1.getString("cleaning_statuse"));



                    }

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        setUndecorated(true);
        setLayout(null);
        setSize(950,450);
        setLocation(400,200);
        setVisible(true);


    }

    public static void main(String[] args) {
        new UpdateRoom();
    }
}
