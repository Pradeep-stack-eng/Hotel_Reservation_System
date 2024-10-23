package Hotle.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    Connection connection;
    Statement statement;

    public Con(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel__ms","root","Gitadevi1920#");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
