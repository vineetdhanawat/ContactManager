
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * DB Connection handled seperately
 * @author workstation
 */
public class DBConnection {
    private Connection con = null;
    // Connection Settings for my workstation-x
    private final String connectionString = 
            "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=Contact_Manager;integratedSecurity=true";
    
    public Connection connectDB() throws SQLException, ClassNotFoundException
    {
       
            if(con !=null
            && !con.isClosed()
            && con.isValid(0)){
                return null;
            }
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionString);
            return con;
    }
}
