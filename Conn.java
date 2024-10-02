package bank.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try {
//            Class.forName(com.mysql.cj.jdbc.Driver);  //Registering the driver {Now it is done by java itselft}
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Sheeron@45"); //creating connection jdbc:mysql;//localhost:3306 [dbname, username, password]
            s = c.createStatement(); //CRREATING STATEMENT
        } 
        catch (Exception e){
            System.out.println(e);
        }
    }
}
