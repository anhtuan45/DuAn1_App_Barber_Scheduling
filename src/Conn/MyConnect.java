/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conn;

import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
    
public class MyConnect {
    public static java.sql.Connection ketnoi(String database)
    {
        try {
            String User = "sa"; //thông tin username
            String Pass = "12"; //thông tin password
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String Url = "jdbc:sqlserver://localhost:1433;databaseName="+database;
            java.sql.Connection cn = DriverManager.getConnection(Url, User, Pass);
            return cn;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
