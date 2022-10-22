
 
package employee.managemnet.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class Login extends JFrame implements ActionListener {
    JTextField tfusername,tfpassword; 
  Login(){
      getContentPane().setBackground(Color.WHITE);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(null);
      
      
      
      JLabel lblUsername = new JLabel("Username");
      lblUsername.setBounds(40,20,100,30);
      add(lblUsername);
      
       tfusername = new JTextField();
      tfusername.setBounds( 150,20, 150, 30);
      add(tfusername);
      
       JLabel lblpassword  = new JLabel("Password");
      lblpassword.setBounds(40,70,100,30);
      add(lblpassword);
      
         tfpassword = new JTextField();
      tfpassword.setBounds( 150,70, 150, 30);
      add(tfpassword);
      
        JButton login = new JButton("LOGIN");
       login .setBounds(150,140,150,30);
       login .setBackground(Color.BLACK);
       login .setForeground(Color.WHITE);
       login.addActionListener(this);
      add( login );//add to the frame;//but here we are adding on the image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
     Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(350,0,200,200);
     add(image);
              
        setSize(600,300);
        setLocation(450,200);
        setVisible(true);
    }
  
  @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String username = tfusername.getText();
            String password = tfpassword.getText();
            Conn c = new Conn();//to use statement we need create conn object...
            String query = "Select * from login where username = '"+username+"' and password = '"+password+"'";
            //here we are storing the result
            
               ResultSet rs = (ResultSet) c.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Home();
            }else{
                JOptionPane.showMessageDialog(null,"INVALID USERNAME OR PASSWORD");
                setVisible(false);
            }
            
        }catch(Exception er){
            er.printStackTrace();
        }
       
    }
    public static void main(String[] args) {
        new Login();
    }

    
  
}

 
