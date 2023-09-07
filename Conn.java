
package hotel.management.system;

import java.sql.*;


public class Conn {
    
    
    Connection c;
    Statement s;
    Conn(){
        try {
             Class.forName("com.mysql.cj.jdbc.Driver"); // 1st step is register the driver
             c = DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem", "root", "atul@7249" ); // 2nd creating the connections
             s = c.createStatement(); // 3rd creating statements
        
        }
       catch (Exception e) {
           e.printStackTrace(); 
       }
    
    }
}
