/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.managemnet.system;

import java.awt.*;//in awt packge the color class is there so it is imported
import javax.swing.*;//frame import package
import java.awt.event.*;


/**
 *
 * @author ajaya
 */
public class Splash extends JFrame  implements ActionListener{// hey you have implemented actionlistener but you have not overided my method plzzz do that  OK...
    
    Splash(){
        //to change color frame
        //with the help of (function) getcontentpane we get the total acces of the frame  and we can change the color of the frame
        getContentPane().setBackground(Color.black);
        setLayout(null);//what iam saying here we are saying that hey  swing iam not gonna use your layout i will prepare my self own layout for me 
        //plzzz be calm...
  
        
        
        //to write something in frame for that we are gonna use JLABEL class
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");//this is the component 
        heading.setBounds(80,30,1200,60 );//here we are creating our layout  this is use to place  our label in  frame 
        heading.setFont(new Font("serif",Font.LAYOUT_RIGHT_TO_LEFT,55));//for setting font to our  heading
        heading.setForeground(Color.CYAN);//setting our text color 
        add(heading);//to add the component to frame we use add function 
        
     //here now we gonna add image to our frame with the help of image icon class
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
     Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(50,100,1050,500);
     add(image);
     
     //here iam taking button with the help of JButton
     JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
      clickhere.setBounds(400,400,300,70);
      clickhere.setBackground(Color.BLACK);
      clickhere.setForeground(Color.WHITE);
      clickhere.addActionListener(this);//here the actionlistener get to knoe that we have clicked the button or not if we click the button we have to give somr=e action so that we have do in action performed method 
      image.add(clickhere);//add to the frame;//but here we are adding on the image
      

//        setBackground(Color.YELLOW);
        setSize(1170,650);
        setLocation(200,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when we tap at the close button the jframe will close
        setVisible(true);//top left is by default location of the frame actually so we have to set the location of that
        
        
        while(true){
            heading.setVisible(false);
            try{
                Thread.sleep(500); //500 millisecond half second..
                //thread sleep is a java static method that suspends the code for
                //specific amount of time it pauses the execution and helps us to know
                //what has happening during the pause it accepts the time specified in milliseconds
    
            }catch(Exception e){
                
            }
            heading.setVisible(true);
            try{
                Thread.sleep(500); //500 millisecond half second..
            }catch(Exception e){
                
            }
        }
    }
    public void actionPerformed(ActionEvent ae){//here iam overided the actionperformed method
        setVisible(false);//here iam saying that hey close my current frame whenever the user tap the button of click here
        new Login();//here  when  the user clicks the button present frame will get close and login form will open...
        
        
    }
    public static void main(String[] args) {
          new Splash (); //there is no use of storing the object so thats y i taken like this
    }
    
}
