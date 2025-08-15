
package librarymanagementsystem;

import java.sql.*;

public class Conn {
    Connection c=null;
    Statement s;
    public Conn(){
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://yamanote.proxy.rlwy.net:14347/librarydata","root","dWGBtNUSRfMgGPPCyByQJXbjxcMLpqRl");
            
//            c=DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12792208","sql12792208","2S5aU3b4Pt");
            
            s=c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
