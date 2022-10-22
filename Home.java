
package employee.managemnet.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home  extends JFrame implements ActionListener{
    JButton view,add,update,remove;
    Home(){
        setLayout(null);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));//its go to filedirectory in filediretcory where there is a 
     // address which we have given on that address what the image is there that is retrieved
     Image i2 = i1.getImage().getScaledInstance(1120, 630,Image.SCALE_DEFAULT);//here we are not croping our image just scaling the image that means size big or samll 
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(0,0,1120,630);
     add(image);
     JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
     heading.setForeground(Color.darkGray);
     heading.setBounds(620,20,400,40);
      heading.setFont(new Font("TAHOMA",Font.BOLD,22));
      image.add(heading);
      
       add = new JButton("Add Employee");
      add.addActionListener(this);
      add.setBounds(820,80,150,40);
      add.setBackground(Color.BLACK);
      add.setForeground(Color.WHITE);
      image.add(add);
      
       view = new JButton("View Employees");
        view.addActionListener(this);
      view.setBounds(651,80,150,40);
      view.setBackground(Color.BLACK);
      view.setForeground(Color.WHITE);
      image.add(view);
      
       update = new JButton("Update Employee");
      update.addActionListener(this);
      update.setBounds(650,140,150,40);
      update.setBackground(Color.BLACK);
      update.setForeground(Color.WHITE);
      image.add(update);
      
      
       remove = new JButton("Remove Employee");
      remove.addActionListener(this);
      remove.setBounds(820,140,150,40);
      remove.setBackground(Color.BLACK);
      remove.setForeground(Color.WHITE);
      image.add(remove);
      
      
      
        setSize(1120,630);
      setLocation(250,100);
      setVisible(true);
    
}
    public static void main(String[] args) {
        new Home();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == add){
            setVisible(false);
              new AddEmployee();
            
        }else if(ae.getSource() == view){
            setVisible(false);
           new ViewEmployee();
        }
        else if(ae.getSource() == remove){
            
            new RemoveEmployee();
        }
        else if(ae.getSource() == update){
            setVisible(false);
              new  ViewEmployee();
        }

       
    }
    
}
