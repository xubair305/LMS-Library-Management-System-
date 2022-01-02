package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookDetails extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTable table;
    private JTextField search;
    private JButton searchBtn, deleteBtn, btnRefresh;

    /*Main Method*/

    public static void main(String[] args) {
        new BookDetails().setVisible(true);
    }
    /*Book method for show database on JTable*/
    public void Book(){
        try{
            conn con = new conn();
            String sql = "select * from addbook";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        }catch (Exception e){

        }
    }
    public BookDetails(){
        setBounds(100,50,1000,600);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(0,0,0));
        setContentPane(contentPane);



        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(79,133,830,350);
        scrollPane.setBackground(new Color(41,41,41));
        contentPane.add(scrollPane);

        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int row = table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row, 1).toString());
            }
        });
        table.setBackground(new Color(240,248,255));
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        scrollPane.setViewportView(table);

        searchBtn = new JButton("Search");
        searchBtn.setBounds(530,89,100,33);
        searchBtn.setBackground(new Color(41,128,185));
        searchBtn.setForeground(new Color(255,255,255));
        searchBtn.setFocusPainted(false);
        searchBtn.setBorder(null);
        searchBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                searchBtn.setBackground(new Color(38,114,164));
            }
            public void mouseExited(MouseEvent e) {
                searchBtn.setBackground(new Color(41,128,185));
            }
        });
        searchBtn.addActionListener(this);
        contentPane.add(searchBtn);

        deleteBtn = new JButton("Delete");
        deleteBtn.addActionListener(this);
        deleteBtn.setBounds(640, 89,100,33);
        deleteBtn.setBackground(new Color(255,48,48));
        deleteBtn.setBorder(null);
        deleteBtn.setFocusPainted(false);
        deleteBtn.setForeground(new Color(255,255,255));
        deleteBtn.addActionListener(this);
        deleteBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                deleteBtn.setBackground(new Color(155,5,5));
            }
            public void mouseExited(MouseEvent e) {
                deleteBtn.setBackground(new Color(255,48,48));
            }
        });
        contentPane.add(deleteBtn);

        btnRefresh = new JButton("Refresh");
        btnRefresh.addActionListener(this);
        btnRefresh.setBounds(750, 89,100,33);
        contentPane.add(btnRefresh);

        search = new JTextField();
        search.setBackground(new Color(255,240,245));
        search.setBorder(new LineBorder(new Color(255,105,180),2,true));
        search.setForeground(new Color(47,79,79));
        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        search.setBounds(159,89,357,33);
        search.setColumns(10);
        contentPane.add(search);

        JLabel backLabel = new JLabel("");
        backLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Home1().setVisible(true);
            }
        });
        ImageIcon backImg = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/backImg.png"));
        Image i8 = backImg.getImage().getScaledInstance(65,30,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        backLabel.setIcon(i9);
        backLabel.setBounds(80,89,72,33);
        contentPane.add(backLabel);

        JPanel panel = new JPanel();
        panel.setBounds(50,46,900,460);
        panel.setBackground(new Color(22,22,23));
//        panel.setLayout(null);
        contentPane.add(panel);

        Book();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            conn con = new conn();
            if(ae.getSource() == searchBtn){

                String sql = "select * from addbook where concat(name, book_id) like ?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, "%" + search.getText() + "%");
                ResultSet rs = st.executeQuery();

                table.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
                st.close();

            }
            if (ae.getSource()== deleteBtn ){
                String sql = "delete from addbook where name ='"+search.getText()+"'";
                PreparedStatement st = con.c.prepareStatement(sql);
                JDialog.setDefaultLookAndFeelDecorated(true);
                int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.NO_OPTION){

                }else if (response == JOptionPane.YES_OPTION){
                    int rs = st.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Deleted");
                }
                st.close();}
            con.c.close();
        }catch (Exception e){

        }
    }
}
