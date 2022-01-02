package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {

    private JPanel contentpane;
    private JButton b1,b2,b3,b4,b5,b6;
    private JLabel lHeading;

    public Home(){
        contentpane = new JPanel();
        setContentPane(contentpane);
        setBounds(100,50,1000,720);
        setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.DARK_GRAY);
        menuBar.setBounds(0,0,1000,35);
        contentpane.add(menuBar);

        JMenu mnExit = new JMenu("Exit");
        mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

        JMenuItem mntmLogout = new JMenuItem("Logout");
        mntmLogout.setBackground(new Color(211,211,211));
        mntmLogout.setForeground(new Color(105,105,105));
        mntmLogout.addActionListener(this);
        mnExit.add(mntmLogout);

        JMenuItem mntmExit = new JMenuItem("Exit");
        mntmLogout.setBackground(new Color(211,211,211));
        mntmLogout.setForeground(new Color(105,105,105));
        mntmLogout.addActionListener(this);
        mnExit.add(mntmExit);

        JMenu mnHelp = new JMenu("Help");
        mnHelp.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

        JMenuItem mntmReadme = new JMenuItem(" Readme");
        mntmReadme.setBackground(new Color(211,211,211));
        mntmReadme.setForeground(new Color(105,105,105));
        mntmReadme.addActionListener(this);
        mnHelp.add(mntmReadme);

        JMenuItem mntmAboutUs = new JMenuItem("About Us");
        mntmAboutUs.setBackground(new Color(211,211,211));
        mntmAboutUs.setForeground(new Color(105,105,105));
        mntmAboutUs.addActionListener(this);
        mnHelp.add(mntmAboutUs);

        JMenu mnRecord = new JMenu("Record");
        mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

        JMenuItem mntmBookDetails = new JMenuItem("Book Details");
        mntmBookDetails.setBackground(new Color(211,211,211));
        mntmBookDetails.setForeground(new Color(105,105,105));
        mntmBookDetails.addActionListener(this);
        mnRecord.add(mntmBookDetails);

        JMenuItem mntmStudentDetails = new JMenuItem("Student Details");
        mntmStudentDetails.setBackground(new Color(211,211,211));
        mntmStudentDetails.setForeground(new Color(105,105,105));
        mntmStudentDetails.addActionListener(this);
        mnRecord.add(mntmStudentDetails);

        lHeading = new JLabel("Library Management System");
        lHeading.setFont(new Font("Broadway", Font.PLAIN,44));
        lHeading.setForeground(new Color(255,0,127));
        lHeading.setBounds(120,60,700,70);
        contentpane.add(lHeading);

        JPanel panel1 = new JPanel();
        panel1.setForeground(new Color(34,139,34));
        panel1.setBorder(new TitledBorder(new LineBorder(new Color(128,128,0), 2),"Operation", TitledBorder.LEADING,
                TitledBorder.TOP, null, new Color(34,139,34)));
        panel1.setBounds(50,150,900,240);
        panel1.setBackground(Color.WHITE);
        panel1.setLayout(null);
        contentpane.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setForeground(new Color(34,139,34));
        panel2.setBorder(new TitledBorder(new LineBorder(new Color(128,128,0), 2),"Action", TitledBorder.LEADING,
                TitledBorder.TOP, null, new Color(34,139,34)));
        panel2.setBounds(50,410,900,240);
        panel2.setLayout(null);
        panel2.setBackground(Color.WHITE);
        contentpane.add(panel2);

        JLabel l1= new JLabel("");
        l1.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/add_book.png"));
        Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(0,10,159,152);
        panel1.add(l1);

        b1 = new JButton("Add Books");
        b1.setBounds(25, 170, 110, 35);
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel1.add(b1);



        JLabel l2= new JLabel("");
        l2.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/statistics.png"));
        Image ii2 = ii1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        l2 = new JLabel(ii3);
        l2.setBounds(200,10,159,152);
        panel1.add(l2);

        b2 = new JButton("Statistics");
        b2.setBounds(230, 170, 110, 35);
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel1.add(b2);

        JLabel l3= new JLabel("");
        l3.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/add_student.png"));
        Image iii2 = iii1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        l3 = new JLabel(iii3);
        l3.setBounds(400,10,159,152);
        panel1.add(l3);

        b3 = new JButton("Add Student");
        b3.setBounds(425, 170, 110, 35);
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        panel1.add(b3);

        JLabel lb1= new JLabel("");
        lb1.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/issue_book.png"));
        Image i21 = i11.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i31 = new ImageIcon(i21);
        lb1 = new JLabel(i31);
        lb1.setBounds(0,10,159,152);
        panel2.add(lb1);

        b4 = new JButton("Issue Books");
        b4.setBounds(25, 170, 110, 35);
        b4.setBackground(Color.GRAY);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        panel2.add(b4);


        JLabel lb2= new JLabel("");
        lb2.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon ii11 = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/return_book.png"));
        Image ii21 = ii11.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon ii31 = new ImageIcon(ii21);
        lb2 = new JLabel(ii31);
        lb2.setBounds(200,10,159,152);
        panel2.add(lb2);

        b5 = new JButton("Return Book");
        b5.setBounds(230, 170, 110, 35);
        b5.setBackground(Color.GRAY);
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        panel2.add(b5);

        JLabel lb3= new JLabel("");
        lb3.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon iii11 = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/aboutus.png"));
        Image iii21 = iii11.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon iii31 = new ImageIcon(iii21);
        lb3 = new JLabel(iii31);
        lb3.setBounds(400,10,159,152);
        panel2.add(lb3);

        b6 = new JButton("About Us");
        b6.setBounds(425, 170, 110, 35);
        b6.setBackground(Color.GRAY);
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        panel2.add(b6);

        menuBar.add(mnRecord);
        menuBar.add(mnHelp);
        menuBar.add(mnExit);
    }

    public static void main(String[] args) {
        new Home().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Logout")){
            setVisible(false);
            new Login_User().setVisible(true);
        }else if (msg.equals("Exit")){
            System.exit(ABORT);
        }else if (msg.equals("Read Me")){
            new ReadMe().setVisible(true);
        }else if (msg.equals("About Us")){
            new aboutUs().setVisible(true);
        }else if (msg.equals("Book Details")){
            setVisible(false);
            new BookDetails().setVisible(true);
        }else if (msg.equals("Student Details")){
            setVisible(false);
            new StudentDetails().setVisible(true);
        }

        if (ae.getSource()==b1){
            this.setVisible(false);
            new AddBook().setVisible(true);
        }
        if (ae.getSource()==b2){
            this.setVisible(false);
            new Statistics().setVisible(true);
        }
        if (ae.getSource()==b3){
            this.setVisible(false);
            new AddStudent().setVisible(true);
        }
        if (ae.getSource()==b4){
            this.setVisible(false);
            new IssueBook().setVisible(true);
        }
        if (ae.getSource()==b5){
            this.setVisible(false);
            new ReturnBook().setVisible(true);
        }
        if (ae.getSource()==b6){
            this.setVisible(false);
            new aboutUs().setVisible(true);
        }

    }
}
