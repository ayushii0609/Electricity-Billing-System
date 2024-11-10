package electricity.billing.system;

//Conn class to establish jdbc connectivity
import java.sql.*;
public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{ 
            c= DriverManager.getConnection("jdbc:mysql:///ebs", "root", "ash#p@2005");   
            s=c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
