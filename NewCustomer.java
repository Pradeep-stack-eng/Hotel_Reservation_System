package Hotle.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener {

    JComboBox comboBox;
    JTextField textFieldNumber, textFieldName, textFieldCountry, TextDeposit;
    JRadioButton r1,r2;
    Choice C1;
    JLabel date;
    JButton Add,Back;

    NewCustomer(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setLayout(null);
        panel.setBackground(Color.black);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imglabel = new JLabel(imageIcon1);
        imglabel.setBounds(550,150,200,200);
        panel.add(imglabel);

        JLabel labelname = new JLabel("NEW CUSTOMER FORM");
        labelname.setBounds(110,11,260,53);
        labelname.setFont(new Font("Tahoma",Font.BOLD,20));
        labelname.setForeground(Color.white);
        panel.add(labelname);

        JLabel labelID = new JLabel("ID :");
        labelID.setBounds(35,76,200,14);
        labelID.setForeground(Color.white);
        labelID.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(labelID);
        comboBox = new JComboBox(new String[] {"Passport", "Citizenship", "Driving Licence", "Voter ID"});
        comboBox.setBounds(271,73,150,20);
        comboBox.setForeground(Color.white);
        comboBox.setBackground(Color.black);
        comboBox.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(comboBox);

        JLabel labelnumber = new JLabel("Number:");
        labelnumber.setBounds(35, 111,200,14);
        labelnumber.setForeground(Color.white);
        labelnumber.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(labelnumber);
        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271,111,150,20);
        textFieldNumber.setBackground(Color.black);
        textFieldNumber.setForeground(Color.white);
        textFieldNumber.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(textFieldNumber);

        JLabel labelName = new JLabel("Name:");
        labelName.setBounds(35, 151,200,14);
        labelName.setForeground(Color.white);
        labelName.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(labelName);
        textFieldName = new JTextField();
        textFieldName.setBounds(271,151,150,20);
        textFieldName.setBackground(Color.black);
        textFieldName.setForeground(Color.white);
        textFieldName.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(textFieldName);

        JLabel labelGender = new JLabel("Gender:");
        labelGender.setBounds(35, 191,200,14);
        labelGender.setForeground(Color.white);
        labelGender.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(labelGender);
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma",Font.BOLD,14));
        r1.setBackground(Color.black);
        r1.setForeground(Color.white);
        r1.setBounds(271,191,80,12);
        panel.add(r1);
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma",Font.BOLD,14));
        r2.setBackground(Color.black);
        r2.setForeground(Color.white);
        r2.setBounds(350,191,80,12);
        panel.add(r2);

        JLabel labelCountry = new JLabel("Country:");
        labelCountry.setBounds(35, 231,200,14);
        labelCountry.setForeground(Color.white);
        labelCountry.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(labelCountry);
        textFieldCountry = new JTextField();
        textFieldCountry.setBounds(271,231,150,20);
        textFieldCountry.setBackground(Color.black);
        textFieldCountry.setForeground(Color.white);
        textFieldCountry.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(textFieldCountry);

        JLabel labelRoom = new JLabel("Allocated Room Number:");
        labelRoom.setBounds(35, 274,200,14);
        labelRoom.setForeground(Color.white);
        labelRoom.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(labelRoom);
        C1 = new Choice();
        try {

            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from room");
            while (resultSet.next()){
                C1.add(resultSet.getString("roomnumber"));
            }
        C1.setBounds(271,274,150,20);
        C1.setFont(new Font("Tahoma",Font.BOLD,14));
        C1.setForeground(Color.white);
        C1.setBackground(Color.black);
        panel.add(C1);


        JLabel labelCIS = new JLabel("Checked-In :");
        labelCIS.setBounds(35, 316,200,14);
        labelCIS.setForeground(Color.white);
        labelCIS.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(labelCIS);


        Date date1 = new Date();

        date = new JLabel(""+date1);
        date.setBounds(271, 316,230,14);
        date.setForeground(Color.white);
        date.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(date);

        JLabel labelDeposit = new JLabel("Deposit:");
        labelDeposit.setBounds(35, 359,200,14);
        labelDeposit.setForeground(Color.white);
        labelDeposit.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(labelDeposit);
        TextDeposit = new JTextField();
        TextDeposit.setBounds(271,359,150,20);
        TextDeposit.setBackground(Color.black);
        TextDeposit.setForeground(Color.white);
        TextDeposit.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(TextDeposit);

        Add = new JButton("ADD");
        Add.setBounds(100,430,120,30);
        Add.setForeground(Color.BLACK);
        Add.setBackground(Color.LIGHT_GRAY);
        Add.addActionListener(this);
        panel.add(Add);
        Back = new JButton("BACK");
        Back.setBounds(260,430,120,30);
        Back.setForeground(Color.BLACK);
        Back.setBackground(Color.LIGHT_GRAY);
        Back.addActionListener(this);
        panel.add(Back);






        }catch (Exception e){
            e.printStackTrace();
        }




        setUndecorated(true);
        setLayout(null);
        setLocation(500,150);
        setSize(850,550);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Add) {
            Con c = new Con();
            String radioBTN = null;
            if (r1.isSelected()){
                radioBTN = "Male";

            } else if (r2.isSelected()) {
                radioBTN = "Female";

            }
            String s1 = (String)comboBox.getSelectedItem();
            String s2 = textFieldNumber.getText();
            String s3 = textFieldName.getText();
            String s4 = radioBTN;
            String s5 = textFieldCountry.getText();
            String s6 = C1.getSelectedItem();
            String s7 = date.getText();
            String s8 = TextDeposit.getText();

            try {
                String q = "insert into customer values ('"+s1+"', '"+s2+"','"+s3+"', '"+s4+"', '"+s5+"', '"+s6+"', '"+s7+"', '"+s8+"')";
                String q1 = "update room set availability = 'Occupied' where roomnumber = "+s6;
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);
                JOptionPane.showMessageDialog(null,"added successfully");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }


        }else  {
            setVisible(false);
        }
    }

    public static void main(String[] args) {

        new NewCustomer();

    }
}
