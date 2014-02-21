/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author workstation
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ConnectMSSQLServer{
public static void main(String[] args)
{
    String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=Contact_Manager;integratedSecurity=true";
    try
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(url);
        System.out.println("connected");
        Statement statement = conn.createStatement();
        String queryString = "select * from Contact";
       
        ResultSet rs = statement.executeQuery(queryString);
        while (rs.next())
        {
            System.out.println(rs.getString(1));
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
}
}