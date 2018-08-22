package file;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;

public class DatabaseConnect {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/university";
    
    public static void main (String agrs[]){
        Connection conn=null;
        
        try{
            conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("CONNECTED");
            Statement stmt=(Statement)conn.createStatement();
            String fName="Dasuni";
            String lName="Geeganage";
            int age=90;
            String city="Kandy";
            String insert="INSERT INTO `student`(`firstName`, `lastName`,age,`city`) VALUES ('"+fName+"','"+lName+"','"+age+"','"+city+"')" ;

            stmt.executeUpdate(insert);
            System.out.println("CO");
        }
        
        catch(SQLException e){
            System.err.print(e);
        }
    }
    
   
}

