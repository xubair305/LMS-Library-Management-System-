package com.company.jar;

import java.sql.*;

public class ContactManager {
    public Connection co;
    public Statement statement;
    public ContactManager(){
        String databaseURL = "jdbc:ucanaccess://D:\\LMS (Library Management System)\\lmsdb.accdb";
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            co = DriverManager.getConnection(databaseURL);
            statement = co.createStatement();
            System.out.printf("Connected to MS Access Databases");

            PreparedStatement preparedStatement = co.prepareStatement("insert into add_book values(?,?)");
            preparedStatement.setString(1,"123");
            preparedStatement.setString(2,"Mehtab");

            System.out.println("Data Inserted Successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ContactManager();
    }

}
