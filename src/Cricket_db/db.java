/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cricket_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author chandru
 */
public class db {
    Connection conn=null;
    public static Connection java_db(){
        
        try{
            String driverName="oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String servername="DESKTOP-O2LG1JR";
            String serverport="1521";
            String sid="ORCL";
            String url="jdbc:oracle:thin:@"+servername+":"+serverport+":"+sid;
            //String url="jdbc:oracle:thin:@DESKTOP-O2LG1JR:1521:ORCL";
            String username="scott";
            String password="tiger";
            Connection conn;
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
            conn = DriverManager.getConnection(url,username,password);
      
            return conn;
           
            
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}