package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

public class Signup extends JFrame implements ActionListener {

    private JTextField firstName, lastName, eMail;
    private JPanel panel, panel1,panel3;
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6;
    private JPasswordField passwordField;
    private JButton loginBtn, signUpBtn;
    private JCheckBox iAccept;

    public Signup(){
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(500,50,500, 680);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(new Color(0,0,0));
        panel.setBounds(0,0,500,680);
        panel.setLayout(null);
        setContentPane(panel);

        panel1 = new JPanel();
        panel1.setBounds(30,30,420,580);
        panel1.setBackground(new Color(12,12,13));
        panel1.setLayout(null);
        panel.add(panel1);

        panel3 = new JPanel();
        panel3.setBounds(0,0,420,8);
        panel3.setBackground(new Color(41,128,185));
        panel3.setLayout(null);
        panel1.add(panel3);

        jLabel1 = new JLabel();
        jLabel1.setBounds(30,20,150,50);
        jLabel1.setFont(new Font("Tahoma", 0, 28));
        jLabel1.setForeground(new Color(41, 128, 185));
        jLabel1.setText("Sign Up");
        panel1.add(jLabel1);

        jLabel2 = new JLabel();
        jLabel2.setBounds(30,70,300,40);
        jLabel2.setFont(new Font("Tahoma", 0, 14));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Create a new account");
        panel1.add(jLabel2);

        jLabel3 = new JLabel();
        jLabel3.setBounds(30,100,200,50);
        jLabel3.setFont(new Font("Tahoma", 0, 14));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("First Name");
        panel1.add(jLabel3);

        firstName = new JTextField();
        firstName.setBorder(null);
        firstName.setFont(new Font("Tahoma", 0, 14));
        firstName.setBounds(30,140,360,40);
        firstName.setBackground(new java.awt.Color(23, 23, 25));
        firstName.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(firstName);

        jLabel5 = new JLabel();
        jLabel5.setBounds(30,180,200,50);
        jLabel5.setFont(new Font("Tahoma", 0, 14));
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Last Name");
        panel1.add(jLabel5);

        lastName = new JTextField();
        lastName.setBorder(null);
        lastName.setFont(new Font("Tahoma", 0, 14));
        lastName.setBounds(30,220,360,40);
        lastName.setBackground(new java.awt.Color(23, 23, 25));
        lastName.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(lastName);


        jLabel6 = new JLabel();
        jLabel6.setBounds(30,270,200,50);
        jLabel6.setFont(new Font("Tahoma", 0, 14));
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Email or Username");
        panel1.add(jLabel6);

        eMail = new JTextField();
        eMail.setBorder(null);
        eMail.setFont(new Font("Tahoma", 0, 14));
        eMail.setBounds(30,310,360,40);
        eMail.setBackground(new java.awt.Color(23, 23, 25));
        eMail.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(eMail);

        jLabel4 = new JLabel();
        jLabel4.setBounds(30,360,200,50);
        jLabel4.setFont(new Font("Tahoma", 0, 14));
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Password");
        panel1.add(jLabel4);

        passwordField = new JPasswordField();
        passwordField.setBorder(null);
        passwordField.setEchoChar('*');
        passwordField.setFont(new Font("Tahoma", 0, 14));
        passwordField.setBounds(30,400,360,40);
        passwordField.setBackground(new java.awt.Color(23, 23, 25));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(passwordField);

        iAccept = new JCheckBox("I accept all terms and condition..!!");
        iAccept.setBounds(30,450,300,20);
        iAccept.setBackground(new Color(12,12,13));
        iAccept.setForeground(new Color(204,204,204));
        iAccept.setFocusPainted(false);
        iAccept.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                JCheckBox cb = (JCheckBox) event.getSource();
                if (cb.isSelected())
                {
                   signUpBtn.setEnabled(true);
                } else {
                    signUpBtn.setEnabled(false);
                }
            }
        });
        panel1.add(iAccept);

        signUpBtn = new JButton("Register");
        signUpBtn.setBounds(30,480,360,40);
        signUpBtn.setBackground(new Color(41,128,185));
        signUpBtn.setForeground(new Color(204,204,204));
        signUpBtn.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        signUpBtn.setFocusPainted(false);
        signUpBtn.setEnabled(false);
        signUpBtn.addActionListener(this);
        panel1.add(signUpBtn);

        loginBtn = new JButton("Already have account?Login");
        loginBtn.setBackground(Color.WHITE);
        loginBtn.setForeground(new Color(41,128,185));
        loginBtn.setBounds(30,525,360,40);
        loginBtn.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        loginBtn.setFocusPainted(false);
        loginBtn.addActionListener(this);
        panel1.add(loginBtn);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            conn con = new conn();

            if (ae.getSource() == signUpBtn){
                String sql = "insert into signup(fname, lname, email, password) values(?, ?, ?, ?)";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, firstName.getText());
                st.setString(2, lastName.getText());
                st.setString(3, eMail.getText());
                st.setString(4, passwordField.getText());

                int i = st.executeUpdate();
                if (i>0){
                    JOptionPane.showMessageDialog(null, "Successfully Created");
                }

            }
            if (ae.getSource()==loginBtn){
                this.setVisible(false);
                new Login_User().setVisible(true);
            }
        }catch (Exception e){

        }
    }

    public static void main(String[] args) {
        new Signup().setVisible(true);
    }
}
