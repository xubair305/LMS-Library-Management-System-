package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Home1 extends JFrame {
    public static void main(String[] args) {
        new Home1().setVisible(true);
    }

    private JPanel panel, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10, panel11, panel12, panel13;
    private JLabel welcome, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11;
    private JLabel icn1, icn2, icn3, icn4, icn5, icn6, userName;
    public Home1(){
        super("LMS (Library Management System)");
        setBounds(200,50,853,520);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(new Color(0,0,0));
        panel.setBounds(0,0,844,482);
        panel.setLayout(null);
        setContentPane(panel);

        panel2 = new JPanel();
        panel2.setBounds(30,26,784,430);
        panel2.setBackground(new Color(22,22,23));
        panel2.setLayout(null);
        panel.add(panel2);

        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(187,0,5,430);
        panel3.setBackground(new Color(41,128,185));
        panel2.add(panel3);

        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(0,110,186,45);
        panel4.setBackground(new Color(60,58,58));
        panel4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new BookDetails().setVisible(true);
            }
            public void mouseEntered(MouseEvent e) {
                setColor(panel4);
            }
            public void mouseExited(MouseEvent e) {
                resetColor(panel4);
            }
        });
        panel2.add(panel4);

        jLabel1 = new JLabel("Book Details");
        jLabel1.setBounds(45,10,120,21);
        jLabel1.setForeground(new Color(232,232,232));
        jLabel1.setFont(new Font("Segoe UI", Font.BOLD,16));
        panel4.add(jLabel1);

        panel5 = new JPanel();
        panel5.setLayout(null);
        panel5.setBounds(0,168,186,45);
        panel5.setBackground(new Color(60,58,58));
        panel5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new StudentDetails().setVisible(true);

            }
            public void mouseEntered(MouseEvent e) {
                setColor(panel5);
            }
            public void mouseExited(MouseEvent e) {
                resetColor(panel5);
            }
        });
        panel2.add(panel5);

        jLabel2 = new JLabel("Student Details");
        jLabel2.setBounds(35,10,120,21);
        jLabel2.setForeground(new Color(232,232,232));
        jLabel2.setFont(new Font("Segoe UI", Font.BOLD,16));
        panel5.add(jLabel2);

        panel6 = new JPanel();
        panel6.setLayout(null);
        panel6.setBounds(0,226,186,45);
        panel6.setBackground(new Color(60,58,58));
        panel6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new Login_User().setVisible(true);
            }
            public void mouseEntered(MouseEvent e) {
                setColor(panel6);
            }
            public void mouseExited(MouseEvent e) {
                resetColor(panel6);
            }
        });
        panel2.add(panel6);

        jLabel3 = new JLabel("Logout");
        jLabel3.setBounds(65,10,120,21);
        jLabel3.setForeground(new Color(232,232,232));
        jLabel3.setFont(new Font("Segoe UI", Font.BOLD,16));
        panel6.add(jLabel3);

        panel7 = new JPanel();
        panel7.setLayout(null);
        panel7.setBounds(0,284,186,45);
        panel7.setBackground(new Color(60,58,58));
        panel7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(ABORT);
            }
            public void mouseEntered(MouseEvent e) {
                setColor(panel7);
            }
            public void mouseExited(MouseEvent e) {
                resetColor(panel7);
            }
        });
        panel2.add(panel7);

        jLabel4 = new JLabel("Exit");
        jLabel4.setBounds(77,10,120,21);
        jLabel4.setForeground(new Color(232,232,232));
        jLabel4.setFont(new Font("Segoe UI", Font.BOLD,16));
        panel7.add(jLabel4);

        panel8 = new JPanel();
        panel8.setLayout(null);
        panel8.setBounds(241,72,122,121);
        panel8.setBackground(new Color(60,58,58));
        panel8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new AddBook().setVisible(true);
            }
            public void mouseEntered(MouseEvent e) {
                setColorMenu(panel8);
            }
            public void mouseExited(MouseEvent e) {
                resetColor(panel8);
            }
        });
        panel2.add(panel8);

        jLabel6 = new JLabel("Add Books");
        jLabel6.setBounds(23,90,80,21);
        jLabel6.setForeground(new Color(232,232,232));
        jLabel6.setFont(new Font("Segoe UI", Font.PLAIN,16));
        panel8.add(jLabel6);

        panel9 = new JPanel();
        panel9.setLayout(null);
        panel9.setBounds(427,72,122,121);
        panel9.setBackground(new Color(60,58,58));
        panel9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new Statistics().setVisible(true);
            }
            public void mouseEntered(MouseEvent e) {
                setColorMenu(panel9);
            }
            public void mouseExited(MouseEvent e) {
                resetColor(panel9);
            }
        });
        panel2.add(panel9);

        jLabel7 = new JLabel("Statistics");
        jLabel7.setBounds(29,90,80,21);
        jLabel7.setForeground(new Color(232,232,232));
        jLabel7.setFont(new Font("Segoe UI", Font.PLAIN,16));
        panel9.add(jLabel7);

        panel10 = new JPanel();
        panel10.setLayout(null);
        panel10.setBounds(622,72,122,121);
        panel10.setBackground(new Color(60,58,58));
        panel10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new AddStudent().setVisible(true);
            }
            public void mouseEntered(MouseEvent e) {
                setColorMenu(panel10);
            }
            public void mouseExited(MouseEvent e) {
                resetColor(panel10);
            }
        });
        panel2.add(panel10);

        jLabel8 = new JLabel("Add Student");
        jLabel8.setBounds(20,90,90,21);
        jLabel8.setForeground(new Color(232,232,232));
        jLabel8.setFont(new Font("Segoe UI", Font.PLAIN,16));
        panel10.add(jLabel8);

        panel11 = new JPanel();
        panel11.setLayout(null);
        panel11.setBounds(241,237,122,121);
        panel11.setBackground(new Color(60,58,58));
        panel11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new IssueBook().setVisible(true);
            }
            public void mouseEntered(MouseEvent e) {
                setColorMenu(panel11);
            }
            public void mouseExited(MouseEvent e) {
                resetColor(panel11);
            }
        });
        panel2.add(panel11);

        jLabel9 = new JLabel("Issue Book");
        jLabel9.setBounds(20,90,95,21);
        jLabel9.setForeground(new Color(232,232,232));
        jLabel9.setFont(new Font("Segoe UI", Font.PLAIN,16));
        panel11.add(jLabel9);

        panel12 = new JPanel();
        panel12.setLayout(null);
        panel12.setBounds(427,237,122,121);
        panel12.setBackground(new Color(60,58,58));
        panel12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new ReturnBook().setVisible(true);
            }
            public void mouseEntered(MouseEvent e) {
                setColorMenu(panel12);
            }
            public void mouseExited(MouseEvent e) {
                resetColor(panel12);
            }
        });
        panel2.add(panel12);

        jLabel10 = new JLabel("Return Book");
        jLabel10.setBounds(20,90,95,21);
        jLabel10.setForeground(new Color(232,232,232));
        jLabel10.setFont(new Font("Segoe UI", Font.PLAIN,16));
        panel12.add(jLabel10);

        panel13 = new JPanel();
        panel13.setLayout(null);
        panel13.setBounds(622,237,122,121);
        panel13.setBackground(new Color(60,58,58));
        panel13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new aboutUs().setVisible(true);
            }
            public void mouseEntered(MouseEvent e) {
                setColorMenu(panel13);
            }
            public void mouseExited(MouseEvent e) {
                resetColor(panel13);
            }
        });
        panel2.add(panel13);

        jLabel11 = new JLabel("About Us");
        jLabel11.setBounds(27,90,80,21);
        jLabel11.setForeground(new Color(232,232,232));
        jLabel11.setFont(new Font("Segoe UI", Font.PLAIN,16));
        panel13.add(jLabel11);

        welcome = new JLabel("Welcome");
        welcome.setBounds(61,5,80,21);
        welcome.setForeground(new Color(232,232,232));
        welcome.setFont(new Font("Segoe UI", Font.BOLD,16));
        panel2.add(welcome);

        jLabel5 = new JLabel("Library Management System");
        jLabel5.setBounds(263,8,500,42);
        jLabel5.setForeground(new Color(255,255,255));
        jLabel5.setFont(new Font("Harrington",Font.PLAIN,36));
        panel2.add(jLabel5);

        icn1= new JLabel();
        icn1.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/home1/addbook.png"));
        icn1 = new JLabel(i1);
        icn1.setBounds(28,20,66,66);
        panel8.add(icn1);

        icn2= new JLabel();
        icn2.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/home1/statistics.png"));
        icn2 = new JLabel(i2);
        icn2.setBounds(28,20,66,66);
        panel9.add(icn2);

        icn3= new JLabel();
        icn3.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/home1/student.png"));
        icn3 = new JLabel(i3);
        icn3.setBounds(28,20,66,66);
        panel10.add(icn3);

        icn4= new JLabel();
        icn4.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/home1/issue.png"));
        icn4 = new JLabel(i4);
        icn4.setBounds(28,20,66,66);
        panel11.add(icn4);

        icn5= new JLabel();
        icn5.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/home1/return.png"));
        icn5 = new JLabel(i5);
        icn5.setBounds(28,20,66,66);
        panel12.add(icn5);

        icn6= new JLabel();
        icn6.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i6 = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/home1/about.png"));
        icn6 = new JLabel(i6);
        icn6.setBounds(28,20,66,66);
        panel13.add(icn6);


        userName = new JLabel("Jubair");
        userName.setForeground(new Color(41,128,185));
        userName.setFont(new Font("Century Gothic (Headings)",Font.PLAIN,30));
        userName.setBounds(52,19,150,53);
        panel2.add(userName);
    }
    public void setColor(JPanel p){
        p.setBackground(new Color(41,128,185));
    }
    public void resetColor(JPanel p1){
        p1.setBackground(new Color(60,58,58));
    }
    public void setColorMenu(JPanel p){
        p.setBackground(new Color(38, 38, 38));
    }
}
