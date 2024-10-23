package Hotle.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {

    JTextField nameText, ageText, salaryText, phoneText, citizenText, emailText;

    JRadioButton radioButtonM , radioButtonF;

    JComboBox comboBox;

    JButton add, back;

    AddEmployee(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        add(panel);


        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("serif",Font.BOLD,17));
        name.setBackground(Color.LIGHT_GRAY);
        name.setForeground(Color.white);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(200,30,150,27);
        nameText.setBackground(Color.WHITE);
        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
        nameText.setForeground(Color.black);
        panel.add(nameText);


        JLabel Age = new JLabel("AGE");
        Age.setBounds(60,80,150,27);
        Age.setFont(new Font("serif",Font.BOLD,17));
        Age.setBackground(Color.LIGHT_GRAY);
        Age.setForeground(Color.white);
        panel.add(Age);
        ageText = new JTextField();
        ageText.setBounds(200,80,150,27);
        ageText.setBackground(Color.WHITE);
        ageText.setFont(new Font("Tahoma",Font.BOLD,14));
        ageText.setForeground(Color.black);
        panel.add(ageText);


        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60,120,150,27);
        gender.setFont(new Font("serif",Font.BOLD,17));
        gender.setBackground(Color.LIGHT_GRAY);
        gender.setForeground(Color.white);
        panel.add(gender);
        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(200,120,70,27);
        radioButtonM.setBackground(Color.BLACK);
        radioButtonM.setFont(new Font("tahoma",Font.BOLD,14));
        radioButtonM.setForeground(Color.LIGHT_GRAY);
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(280,120,100,27);
        radioButtonF.setBackground(Color.BLACK);
        radioButtonF.setFont(new Font("tahoma",Font.BOLD,14));
        radioButtonF.setForeground(Color.LIGHT_GRAY);
        panel.add(radioButtonF);

        JLabel job = new JLabel("JOB");
        job.setBounds(60,170,150,27);
        job.setFont(new Font("serif", Font.BOLD,17));
        job.setForeground(Color.WHITE);
        panel.add(job);

        comboBox = new JComboBox(new String[] {"Front Desk", "Housekeeping","Kitchen Staff", "Room Service", "Manager", "Accountant", "Chef"});
        comboBox.setBackground(Color.WHITE);
        comboBox.setBounds(200,170,150,30);
        comboBox.setFont(new Font("Tahoma", Font.BOLD,14));
        comboBox.setForeground(Color.black);
        panel.add(comboBox);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60,220,150,27);
        salary.setFont(new Font("serif",Font.BOLD,17));
        salary.setBackground(Color.LIGHT_GRAY);
        salary.setForeground(Color.white);
        panel.add(salary);
        salaryText = new JTextField();
        salaryText.setBounds(200,220,150,27);
        salaryText.setBackground(Color.WHITE);
        salaryText.setFont(new Font("Tahoma",Font.BOLD,14));
        salaryText.setForeground(Color.black);
        panel.add(salaryText);

        JLabel phone= new JLabel("PHONE");
        phone.setBounds(60,270,150,27);
        phone.setFont(new Font("serif",Font.BOLD,17));
        phone.setBackground(Color.LIGHT_GRAY);
        phone.setForeground(Color.white);
        panel.add(phone);
        phoneText = new JTextField();
        phoneText.setBounds(200,270,150,27);
        phoneText.setBackground(Color.WHITE);
        phoneText.setFont(new Font("Tahoma",Font.BOLD,14));
        phoneText.setForeground(Color.black);
        panel.add(phoneText);

        JLabel citizenship= new JLabel("CITIZENSHIP");
        citizenship.setBounds(60,320,150,27);
        citizenship.setFont(new Font("serif",Font.BOLD,17));
        citizenship.setBackground(Color.LIGHT_GRAY);
        citizenship.setForeground(Color.white);
        panel.add(citizenship);
        citizenText = new JTextField();
        citizenText.setBounds(200,320,150,27);
        citizenText.setBackground(Color.WHITE);
        citizenText.setFont(new Font("Tahoma",Font.BOLD,14));
        citizenText.setForeground(Color.black);
        panel.add(citizenText);

        JLabel email= new JLabel("EMAIL");
        email.setBounds(60,370,150,27);
        email.setFont(new Font("serif",Font.BOLD,17));
        email.setBackground(Color.LIGHT_GRAY);
        email.setForeground(Color.white);
        panel.add(email);
        emailText = new JTextField();
        emailText.setBounds(200,370,150,27);
        emailText.setBackground(Color.WHITE);
        emailText.setFont(new Font("Tahoma",Font.BOLD,14));
        emailText.setForeground(Color.black);
        panel.add(emailText);

        JLabel AED= new JLabel("ADD EMPLOYEE DETAILS");
        AED.setBounds(450,24,445,35);
        AED.setFont(new Font("Tahoma",Font.BOLD,31));
        AED.setBackground(Color.LIGHT_GRAY);
        AED.setForeground(Color.white);
        panel.add(AED);

        add = new JButton("ADD");
        add.setBounds(80,420,100,30);
        add.setBackground(Color.DARK_GRAY);
        add.setForeground(Color.black);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(200,420,100,30);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.black);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,100,300,300);
        panel.add(label);






        setUndecorated(true);
        setLocation(500,160);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String name = nameText.getText();
            String age  = ageText.getText();
            String salary = salaryText.getText();
            String phone  = phoneText.getText();
            String email = emailText.getText();
            String citizenship = citizenText.getText();
            String job = (String) comboBox.getSelectedItem();
            String gender = null;
            if(radioButtonM.isSelected()){
                gender = "Male";

            } else if (radioButtonF.isSelected()) {

                gender = "Female";

            }

            try {

                Con c = new Con();
                String q = "insert into employee values ('" + name + "', '" + age + "', '" + gender + "', '" + job + "', '" + salary + "', '" + phone + "', '" + citizenship + "', '" + email + "')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Employee Added");
                setVisible(false);



            }catch (Exception E){
                E.printStackTrace();
            }


        }else{
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        new AddEmployee();

    }
}

/*"INSERT INTO employee (name, age, gender, job, salary, phone, citizenship, email ) " +
        "VALUES ('" + name + "', " +
age + ", " +
        "'" + gender + "', " +
        "'" + job + "', " +
salary + ", " +
        "'" + phone + "', " +
        "'" + citizenship + "', " +
        "'" + email + "')";*/
