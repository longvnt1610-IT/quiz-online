/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longvnt.Utill;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


/**
 *
 * @author PC
 */
public class DBHelper implements Serializable{
     public static Connection makeConnection()
    throws  SQLException, NamingException{
        Context contex = new InitialContext();
        Context tomCatContex = (Context) contex.lookup("java:comp/env");
        DataSource ds = (DataSource) tomCatContex.lookup("SE1418DS");
        Connection con = ds.getConnection();
        
        return con;
        
    }
     
    
}
