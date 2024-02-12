
package blood_management_system_2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends JFrame{
    
    private JPanel upper_box,lower_box;
    private JLabel label1,label2,label3,label4,label5,label6;
    private Container c;
    private ImageIcon search,donate,hospital,about,blood_bank,blood_management;
   
    Home (){
        
        initComponents();
    }
    
     private void initComponents() {
      
         c= this.getContentPane();
         c.setLayout(null);
         
        
         upper_box= new JPanel();
         upper_box.setBounds(0,0,800,130);
         upper_box.setBackground(Color.red);
         upper_box.setLayout(new FlowLayout(FlowLayout.LEFT));
         c.add(upper_box);
         
         
         
        blood_management = new ImageIcon(getClass().getResource("Blood bank management.png")); 
        Image scaledImage =blood_management.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
        blood_management = new ImageIcon(scaledImage);
        label1= new JLabel(blood_management);
        upper_box.add(label1);
        
        
        search = new ImageIcon(getClass().getResource("Search Blood.png")); 
        Image scaledImage2 =search.getImage().getScaledInstance(100, 100,Image.SCALE_SMOOTH);
        search = new ImageIcon(scaledImage2);
        label2= new JLabel(search);
        upper_box.add(label2);
        
        donate = new ImageIcon(getClass().getResource("BloodDonate.png")); 
        Image scaledImage3 =donate.getImage().getScaledInstance(100, 100,Image.SCALE_SMOOTH);
        donate = new ImageIcon(scaledImage3);
        label3= new JLabel(donate);
        upper_box.add(label3);
        
        blood_bank = new ImageIcon(getClass().getResource("Blood Bank.png")); 
        Image scaledImage4 =blood_bank.getImage().getScaledInstance(100, 100,Image.SCALE_SMOOTH);
        blood_bank = new ImageIcon(scaledImage4);
        label4= new JLabel(blood_bank);
        upper_box.add(label4);
        
        hospital = new ImageIcon(getClass().getResource("Hospital.png")); 
        Image scaledImage5 =hospital.getImage().getScaledInstance(100, 100,Image.SCALE_SMOOTH);
        hospital = new ImageIcon(scaledImage5);
        label5= new JLabel(hospital);
        upper_box.add(label5);
        
        about = new ImageIcon(getClass().getResource("About us.png")); 
        Image scaledImage6 =about.getImage().getScaledInstance(100, 100,Image.SCALE_SMOOTH);
        about = new ImageIcon(scaledImage6);
        label6= new JLabel(about);
        upper_box.add(label6);
         
  
         
         
    }
    
    public static void main(String[] args) { 
        Home frame =  new Home();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,800,500);
        frame.setBackground(Color.white);
        frame.setTitle("This is Home "); 
    }

   
    
}
