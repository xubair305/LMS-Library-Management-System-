package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login_User extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new Login_User().setVisible(true);

    }

    private JTextField username;
    private JPanel panel, panel1,panel3;
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4;
    private JPasswordField passwordField;
    private JButton loginBtn, signUpBtn;
    private JCheckBox showPassword;

    public Login_User(){
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(500,50,500, 630);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(new Color(0,0,0));
        panel.setBounds(0,0,500,630);
        panel.setLayout(null);
        setContentPane(panel);

        panel1 = new JPanel();
        panel1.setBounds(30,30,420,530);
        panel1.setBackground(new Color(12,12,13));
        panel1.setLayout(null);
        panel.add(panel1);

        panel3 = new JPanel();
        panel3.setBounds(0,0,420,8);
        panel3.setBackground(new Color(41,128,185));
        panel3.setLayout(null);
        panel1.add(panel3);

        jLabel1 = new JLabel();
        jLabel1.setBounds(30,30,150,50);
        jLabel1.setFont(new Font("Tahoma", 0, 28));
        jLabel1.setForeground(new Color(41, 128, 185));
        jLabel1.setText("Sign In");
        panel1.add(jLabel1);

        jLabel2 = new JLabel();
        jLabel2.setBounds(30,80,300,40);
        jLabel2.setFont(new Font("Tahoma", 0, 14));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Connect to your LMS Account...");
        panel1.add(jLabel2);

        jLabel3 = new JLabel();
        jLabel3.setBounds(30,145,200,50);
        jLabel3.setFont(new Font("Tahoma", 0, 14));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Username");
        panel1.add(jLabel3);

        username = new JTextField();
        username.setBorder(null);
        username.setFont(new Font("Tahoma", 0, 14));
        username.setBounds(30,190,360,40);
        username.setCaretColor(Color.WHITE);
        username.setBackground(new java.awt.Color(23, 23, 25));
        username.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(username);

        jLabel4 = new JLabel();
        jLabel4.setBounds(30,245,200,50);
        jLabel4.setFont(new Font("Tahoma", 0, 14));
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Password");
        panel1.add(jLabel4);

        passwordField = new JPasswordField();
        passwordField.setBorder(null);
        passwordField.setEchoChar('*');
        passwordField.setCaretColor(Color.WHITE);
        passwordField.setFont(new Font("Tahoma", 0, 14));
        passwordField.setBounds(30,290,360,40);
        passwordField.setBackground(new java.awt.Color(23, 23, 25));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(passwordField);

        showPassword = new JCheckBox("Show password..!!");
        showPassword.setBounds(30,350,300,20);
        showPassword.setBackground(new Color(12,12,13));
        showPassword.setForeground(new Color(204,204,204));
        showPassword.setFocusPainted(false);
        showPassword.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                JCheckBox cb = (JCheckBox) event.getSource();
                if (cb.isSelected())
                {
                    passwordField.setEchoChar((char)0);
                } else {
                    passwordField.setEchoChar('*');
                }
            }
        });
        panel1.add(showPassword);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(30,400,360,40);
        loginBtn.setBackground(new Color(41,128,185));
        loginBtn.setForeground(new Color(204,204,204));
        loginBtn.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        loginBtn.setFocusPainted(false);
        loginBtn.addActionListener(this);
        panel1.add(loginBtn);

        signUpBtn = new JButton("Sign Up");
        signUpBtn.setBounds(30,460,360,40);
        signUpBtn.setForeground(new Color(41,128,185));
        signUpBtn.setBackground(Color.WHITE);
        signUpBtn.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        signUpBtn.setFocusPainted(false);
        signUpBtn.addActionListener(this);
        panel1.add(signUpBtn);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==loginBtn){
            Boolean status = false;
            try{
                conn connection = new conn();
                String sql = "select * from signup where email=? and password=?";
                PreparedStatement st = connection.c.prepareStatement(sql);

                st.setString(1, username.getText());
                st.setString(2, passwordField.getText());

                ResultSet rs = st.executeQuery();
                if (rs.next()){
                    this.dispose();
                    new Loading().setVisible(true);
                }else
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password..!!");
            }catch (Exception ae2){
                ae2.printStackTrace();
            }
        }
        if (ae.getSource() == signUpBtn){
            dispose();
            new Signup().setVisible(true);
        }
        }
    }

