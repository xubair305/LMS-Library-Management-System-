package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.Random;

public class AddBook extends JFrame implements ActionListener {

    private JPanel contentpane= new JPanel();;
    private JLabel l1,l2,l3,l4,l5,l6,l7,jLabel;
    private JTextField tf1,tf2,tf3,tf4,tf6,tf7;
    private JButton add,back;
    private JComboBox comboBox;

    public AddBook(){
        super("Add Book");
        setBounds(200,50,652,520);
        setContentPane(contentpane);
        setResizable(false);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,639,483);
        panel.setBackground(new Color(0,0,0));
        panel.setLayout(null);
        contentpane.add(panel);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(22,22,23));
        panel2.setBounds(30,30,579,422);
        panel2.setLayout(null);
        panel.add(panel2);

        JPanel panel3 = new JPanel();
        panel3.setBounds(0,0,579,8);
        panel3.setBackground(new Color(41,128,185));
        panel2.add(panel3);

        jLabel = new JLabel("Add Book");
        jLabel.setBounds(10,17,100,22);
        jLabel.setForeground(new Color(41,128,185));
        jLabel.setFont(new Font("Verdana",Font.PLAIN,18));
        panel2.add(jLabel);

        l1 = new JLabel("Book Id");
        l1.setBounds(60, 52, 120, 21);
        l1.setForeground(new Color(245,245,245));
        l1.setFont(new Font("Segoe UI", Font.BOLD,16));
        panel2.add(l1);

        l2 = new JLabel("Book Name");
        l2.setBounds(60, 95, 120, 21);
        l2.setForeground(new Color(245,245,245));
        l2.setFont(new Font("Segoe UI", Font.BOLD,16));
        panel2.add(l2);

        l3 = new JLabel("ISBN");
        l3.setBounds(60, 138, 120, 21);
        l3.setForeground(new Color(245,245,245));
        l3.setFont(new Font("Segoe UI", Font.BOLD,16));
        panel2.add(l3);

        l4 = new JLabel("Publisher");
        l4.setBounds(60, 181, 120, 21);
        l4.setForeground(new Color(245,245,245));
        l4.setFont(new Font("Segoe UI", Font.BOLD,16));
        panel2.add(l4);

        l5 = new JLabel("Edition");
        l5.setBounds(60, 224, 120, 21);
        l5.setForeground(new Color(245,245,245));
        l5.setFont(new Font("Segoe UI", Font.BOLD,16));
        panel2.add(l5);

        l6 = new JLabel("Price");
        l6.setBounds(60, 267, 120, 21);
        l6.setForeground(new Color(245,245,245));
        l6.setFont(new Font("Segoe UI", Font.BOLD,16));
        panel2.add(l6);

        l7 = new JLabel("Pages");
        l7.setBounds(60, 310, 120, 21);
        l7.setForeground(new Color(245,245,245));
        l7.setFont(new Font("Segoe UI", Font.BOLD,16));
        panel2.add(l7);

        tf1 = new JTextField();
        tf1.setBounds(232,49,326,33);
        tf1.setBackground(new Color(41,41,41));
        tf1.setForeground(Color.WHITE);
        tf1.setEditable(false);
        tf1.setBorder(null);
        panel2.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(232,92,326,33);
        tf2.setBackground(new Color(41,41,41));
        tf2.setForeground(Color.WHITE);
        tf2.setCaretColor(Color.WHITE);
        tf2.setBorder(null);
        panel2.add(tf2);

        tf3 = new JTextField();
        tf3.setBounds(232,135,326,33);
        tf3.setBackground(new Color(41,41,41));
        tf3.setForeground(Color.WHITE);
        tf3.setCaretColor(Color.WHITE);
        tf3.setBorder(null);
        panel2.add(tf3);

        tf4 = new JTextField();
        tf4.setBounds(232,178,326,33);
        tf4.setBackground(new Color(41,41,41));
        tf4.setForeground(Color.WHITE);
        tf4.setCaretColor(Color.WHITE);
        tf4.setBorder(null);
        panel2.add(tf4);

        comboBox = new JComboBox();
        comboBox.setBounds(232,221,326,33);
        comboBox.setBackground(new Color(41,41,41));
        comboBox.setForeground(Color.WHITE);
        comboBox.setBorder(null);
        comboBox.setModel(new DefaultComboBoxModel(new String[]{ "1","2","3","4","5","6","7","8","9","10"}) );
         panel2.add(comboBox);

        tf6 = new JTextField();
        tf6.setBounds(232,264,326,33);
        tf6.setBackground(new Color(41,41,41));
        tf6.setForeground(Color.WHITE);
        tf6.setCaretColor(Color.WHITE);
        tf6.setBorder(null);
        panel2.add(tf6);

        tf7 = new JTextField();
        tf7.setBounds(232,307,326,33);
        tf7.setBackground(new Color(41,41,41));
        tf7.setForeground(Color.WHITE);
        tf7.setCaretColor(Color.WHITE);
        tf7.setBorder(null);
        panel2.add(tf7);

        add = new JButton("Add");
        add.setBounds(85, 379, 159,31);
        add.setBackground(new Color(41,128,185));
        add.setBorder(null);
        add.setFocusPainted(false);
        add.setForeground(new Color(255,255,255));
        add.addActionListener(this);
        add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                add.setBackground(new Color(38,114,164));
            }
            public void mouseExited(MouseEvent e) {
                add.setBackground(new Color(41,128,185));
            }
        });
        panel2.add(add);

        back = new JButton("Back");
        back.setBounds(316, 379, 159,31);
        back.setBackground(new Color(255,48,48));
        back.setBorder(null);
        back.setFocusPainted(false);
        back.setForeground(new Color(255,255,255));
        back.addActionListener(this);
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                back.setBackground(new Color(155,5,5));
            }
            public void mouseExited(MouseEvent e) {
                back.setBackground(new Color(255,48,48));
            }
        });
        panel2.add(back);
        
        random();
    }

    private void random() {
        Random rd = new Random();
        tf1.setText(""+rd.nextInt(1000 + 1));
    }

    public static void main(String[] args) {
        new AddBook().setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try{
            conn con = new conn();

            if (ae.getSource()==add){
                String sql = "insert into addbook (book_id, name, isbn, publisher, edition, price, pages) values(?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1, tf1.getText());
                st.setString(2, tf2.getText());
                st.setString(3, tf3.getText());
                st.setString(4, tf4.getText());
                st.setString(5, (String) comboBox.getSelectedItem());
                st.setString(6, tf6.getText());
                st.setString(7, tf7.getText());

                int rs = st.executeUpdate();
                if (rs > 0 ) {
                    JOptionPane.showMessageDialog(null, "Successfully Added Book");
                }
                else
                    JOptionPane.showMessageDialog(null, "Error");
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf6.setText("");
                tf7.setText("");
                st.close();
            }
            if (ae.getSource()==back){
                this.setVisible(false);
                new Home1().setVisible(true);
            }
            con.c.close();
        }catch (Exception ae1){

        }
    }
}
