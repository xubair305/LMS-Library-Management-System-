package com.company;

import java.sql.*;

public class conn {
    Connection c;
    Statement s;

    public conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsdb", "root", "Aa12345678@");
            s = c.createStatement();
            if (c!=null){
                System.out.println("Database created");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}