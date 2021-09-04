package houserent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.SQLException;

public class DBConnect {
    Connection conn;
    Connection getConnection()
    {
       String url="jdbc:mysql://localhost:3306/db_rent(2)";
       String user="root";
       String pass="";
       try{
        conn = DriverManager.getConnection(url,user,pass);
        if(conn==null)
        {
            return null;
        }
        else
        {
            return conn;
        }
       }
       catch (SQLException e)
       {
           System.out.println(e);
           return null;
       }
    }
}
