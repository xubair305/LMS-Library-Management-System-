package com.company;
import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable {

    public JPanel panel, panel1, panel2, panel3, panel4;
    public JProgressBar progressBar;
    private JLabel mainlable, jLabel, jLabel1;
    int s = 0;
    Thread thread;

    public Loading(){
        thread = new Thread((Runnable) this);
        setLayout(null);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setBounds(500,180,660, 410);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(new Color(0,0,0));
        panel.setBounds(0,0,660,410);
        panel.setLayout(null);
        setContentPane(panel);

        panel1 = new JPanel();
        panel1.setBounds(35,30,580,345);
        panel1.setBackground(new Color(12,12,13));
        panel1.setLayout(null);
        panel.add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(100,150,400,60);
        panel2.setBackground(new Color(41,128,185));
        panel2.setLayout(null);
        panel1.add(panel2);

        mainlable = new JLabel("Smart Library v1.4");
        mainlable.setForeground(new Color(253, 252, 252));
        mainlable.setFont(new Font("Trebuchet MS", Font.BOLD, 44));
        mainlable.setBounds(100, 70, 500,50);
        panel1.add(mainlable);

        jLabel = new JLabel("Please Wait....");
        jLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
        jLabel.setBounds(210,225,300,20);
        jLabel.setForeground(new Color(160,82,45));
        panel1.add(jLabel);

        panel3 = new JPanel();
        panel3.setBounds(10,10,45,40);
        panel3.setBackground(new Color(18, 97, 146));
        panel3.setLayout(null);
        panel2.add(panel3);

        jLabel1 = new JLabel("");
        jLabel1.setBounds(8,2,45,40);
        jLabel1.setForeground(new Color(246, 246, 246));
        jLabel1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        panel3.add(jLabel1);

        panel4 = new JPanel();
        panel4.setBounds(0,0,580,8);
        panel4.setBackground(new Color(41,128,185));
        panel4.setLayout(null);
        panel1.add(panel4);

        progressBar = new JProgressBar();
        progressBar.setFont(new Font("Tahoma", Font.BOLD, 20));
        progressBar.setStringPainted(false);
        progressBar.setBorderPainted(false);
        progressBar.setBackground(new Color(18, 97, 146));
        progressBar.setForeground(Color.WHITE);
        progressBar.setBounds(65,25,320,10);
        panel2.add(progressBar);

        setUploading();

    }
    public void setUploading(){
        thread.start();
    }

    public void run() {
        try{
            for (int i = 0; i<200; i++){
                s=s+1;
                int m = progressBar.getMaximum();
                int v = progressBar.getValue();
                jLabel1.setText(String.valueOf(i)+"%");
                if (v<m){
                    progressBar.setValue(progressBar.getValue()+1);
                }else {
                    i=201;
                    setVisible(false);
                    new Home1().setVisible(true);
                }
                if (i==10){
                    jLabel.setText("Turning On Modules...");
                }
                if (i==20){
                    jLabel.setText("Loading Modules...");
                }
                if (i==50){
                    jLabel.setText("Connecting to Database...");
                }
                if (i==70){
                    jLabel.setText("Connection Successful...");
                }
                if (i==80){
                    jLabel.setText("Launching Application...");
                }
                Thread.sleep(80);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Loading().setVisible(true);
    }
}
