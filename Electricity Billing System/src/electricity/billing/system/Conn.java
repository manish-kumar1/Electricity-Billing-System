

package electricity.billing.system;

import java.sql.*;
import java.sql.Connection;
public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "manish");
            s = c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
