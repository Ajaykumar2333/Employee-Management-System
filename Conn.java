/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.managemnet.system;
import java.sql.*;//for the purpose of interface we imported this

/**
 *
 * @author ajaya
 */
public class Conn {
    Connection c;//creating the connection this is interface
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //register the driver class
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem","root","Aj*13723793");//creating the connection string
            s = c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
