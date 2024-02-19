
package blood_management_system_2;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class Home extends JFrame { 
    private JPanel upper_box,lower_box ,banner,left,right,A_pos,B_pos,O_pos,Ab_pos,A_neg,B_neg,O_neg,AB_neg;;
    private JLabel label1,label2,label3,label4,label5,label6,label7,label8,aplabel,bplabel,oplabel,abplabel,anlabel,bnlabel,onlabel,abnlabel;;
    private Container c,c2,c3;
    private ImageIcon search,donate,hospital,about,blood_bank,blood_management,ap,bp,op,abp,an,bn,on,abn;;
    private Font font ,font1;
   
    Home(){
        
        initComponents();
    }
    
     private void initComponents() {
      
          c2=this.getContentPane();
          c2.setLayout(null);
         
        
         upper_box= new JPanel();
         upper_box.setBounds(0,0,800,130);
         upper_box.setBackground(Color.red);
         upper_box.setLayout(new FlowLayout(FlowLayout.LEFT));
         c2.add(upper_box);
         
         
         
        blood_management = new ImageIcon(getClass().getResource("Blood bank management.png")); 
        Image scaledImage =blood_management.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
        blood_management = new ImageIcon(scaledImage);
        label1= new JLabel(blood_management);
        upper_box.add(label1);
        
        
        search = new ImageIcon(getClass().getResource("Search Blood.png")); 
        Image scaledImage2 =search.getImage().getScaledInstance(100, 100,Image.SCALE_SMOOTH);
        search = new ImageIcon(scaledImage2);
        label2= new JLabel(search);
        
        // for click event 
        
          label2.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                openNewFrame();
            }
        });
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
        
        
        
         lower_box= new JPanel();
         lower_box.setBounds(0,130,800,370);
         lower_box.setBackground(Color.white);
         lower_box.setLayout(null); 
         c2.add(lower_box);
        
        JLabel labelText = new JLabel("BLOOD DONATION ");
        labelText.setBounds(20,50,300, 30);
        labelText.setForeground(Color.red);
        font= new Font("Arial",Font.BOLD,30);
        labelText.setFont(font);  
        lower_box.add(labelText);
        
        JLabel labelText1 = new JLabel("Give the Gift of Life");
        labelText1.setBounds(20,100,300, 30);
        labelText1.setForeground(Color.red);
        font1= new Font("Arial",Font.BOLD,20);
        labelText1.setFont(font1);  
        lower_box.add(labelText1);
        
        JLabel labelText2 = new JLabel("Donate Blood Today!");
        labelText2.setBounds(20,130, 300, 30); 
        labelText2.setForeground(Color.red);
        //font1= new Font("Arial",Font.BOLD,36);
        labelText2.setFont(font1); 
        lower_box.add(labelText2);
        
        label7= new JLabel();
        label7.setText("Give the Gift of Life Donate Blood Today!");
        label7.setBounds(300,300,300,500);
        lower_box.add(label7);
        
        ImageIcon Blood_for_home = new ImageIcon(getClass().getResource("Blood_for_home.jpg")); 
        Image scaledImage7 =Blood_for_home.getImage().getScaledInstance(320, 200,Image.SCALE_SMOOTH);
        Blood_for_home = new ImageIcon(scaledImage7);
        label8= new JLabel(Blood_for_home);
        label8.setBounds(370,50, 320, 200);
        lower_box.add(label8);
                     
         
    }
   
     
        private void openNewFrame() {
        
        JFrame frame3 =  new JFrame();
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setBounds(100,100,810,500);
        frame3.setBackground(Color.pink);
        frame3.setTitle("List for java"); 
        
        
         banner= new JPanel();
         banner.setBounds(0,0,800,25);
         banner.setBackground(Color.red);
         banner.setLayout(null);
         frame3.add(banner);
         
        JLabel labelText = new JLabel("BLOOD BANK MANAGEMENT");
        labelText.setForeground(Color.white); 
        labelText.setBounds(10, 0, 800, 25); 
        banner.add(labelText);
     
        
         left= new JPanel();
         left.setBounds(0,25,150,475);
         left.setBackground(Color.pink);
         left.setLayout(null);
         frame3.add(left);
         
        String[] menuItems = {"Home", "Donor", "Blood Donation", "Request"};
        for (int i = 0; i < menuItems.length; i++) {
            JLabel menuItemLabel = new JLabel(menuItems[i]);
            menuItemLabel.setForeground(Color.white);
            menuItemLabel.setBackground(Color.gray);
            menuItemLabel.setBounds(10, 30 * i, 150, 25);
            left.add(menuItemLabel);
        }
         right= new JPanel();
         right.setBounds(150,25,650,475);
         right.setBackground(new Color(0xffdfdf));
         right.setLayout(null);
         frame3.add(right);
         
         A_pos = new JPanel();
         A_pos.setBounds(160,40,150,70);
         A_pos.setBackground(Color.white);
         A_pos.setLayout(null);
         right.add(A_pos);
         
         B_pos = new JPanel();
         B_pos.setBounds(320,40,150,70);
         B_pos.setBackground(Color.white);
         B_pos.setLayout(null);
         right.add(B_pos);
         
         Ab_pos = new JPanel();
         Ab_pos.setBounds(480,40,150,70);
         Ab_pos.setBackground(Color.white);
         Ab_pos.setLayout(null);
         right.add(Ab_pos);
         
         O_pos = new JPanel();
         O_pos.setBounds(640,40,150,70);
         O_pos.setBackground(Color.white);
         O_pos.setLayout(null);
         right.add(O_pos);
    
         A_neg = new JPanel();
         A_neg.setBounds(160,120,150,70);
         A_neg.setBackground(Color.white);
         A_neg.setLayout(null);
         right.add(A_neg);
         
         B_neg = new JPanel();
         B_neg.setBounds(320,120,150,70);
         B_neg.setBackground(Color.white);
         B_neg.setLayout(null);
         right.add(B_neg);
         
         AB_neg = new JPanel();
         AB_neg.setBounds(480,120,150,70);
         AB_neg.setBackground(Color.white);
         AB_neg.setLayout(null);
         right.add(AB_neg);
         
         O_neg = new JPanel();
         O_neg.setBounds(640,120,150,70);
         O_neg.setBackground(Color.white);
         O_neg.setLayout(null);
         right.add(O_neg);
         
        ap = new ImageIcon(getClass().getResource("A+.png")); 
        Image scaledImage =ap.getImage().getScaledInstance(50, 35, Image.SCALE_SMOOTH);
        ap = new ImageIcon(scaledImage);
        aplabel= new JLabel(ap);
        aplabel.setBounds(90, 5, 50, 35);
        A_pos.add(aplabel);
        
        
        bp = new ImageIcon(getClass().getResource("B+.png")); 
        Image scaledImage2 =bp.getImage().getScaledInstance(50, 35, Image.SCALE_SMOOTH);
        bp = new ImageIcon(scaledImage2);
        bplabel= new JLabel(bp);
        bplabel.setBounds(90, 5, 50, 35);
        B_pos.add(bplabel);
        
        abp = new ImageIcon(getClass().getResource("AB+.png")); 
        Image scaledImage3 =abp.getImage().getScaledInstance(50, 35, Image.SCALE_SMOOTH);
        abp = new ImageIcon(scaledImage3);
        abplabel= new JLabel(abp);
        abplabel.setBounds(90, 5, 50, 35);
        Ab_pos.add(abplabel);
        
        op = new ImageIcon(getClass().getResource("0+.png")); 
        Image scaledImage4 =op.getImage().getScaledInstance(50, 35, Image.SCALE_SMOOTH);
        op = new ImageIcon(scaledImage4);
        oplabel= new JLabel(op);
        oplabel.setBounds(90, 5, 50, 35);
        O_pos.add(oplabel);
        
        an = new ImageIcon(getClass().getResource("A-.png")); 
        Image scaledImage5 =an.getImage().getScaledInstance(50, 35, Image.SCALE_SMOOTH);
        an = new ImageIcon(scaledImage5);
        anlabel= new JLabel(an);
        anlabel.setBounds(90, 5, 50, 35);
        A_neg.add(anlabel);
        
       
        bn = new ImageIcon(getClass().getResource("B-.png")); 
        Image scaledImage6 =bn.getImage().getScaledInstance(50, 35, Image.SCALE_SMOOTH);
        bn = new ImageIcon(scaledImage6);
        bnlabel= new JLabel(bn);
        bnlabel.setBounds(90, 5, 50, 35);
        B_neg.add(bnlabel);
      
        abn = new ImageIcon(getClass().getResource("AB-.png")); 
        Image scaledImage7 =abn.getImage().getScaledInstance(50, 35, Image.SCALE_SMOOTH);
        abn = new ImageIcon(scaledImage7);
        abnlabel= new JLabel(abn);
        abnlabel.setBounds(90, 5, 50, 35);
        AB_neg.add(abnlabel);
        
        on = new ImageIcon(getClass().getResource("0-.png")); 
        Image scaledImage8 =on.getImage().getScaledInstance(50, 35, Image.SCALE_SMOOTH);
        on = new ImageIcon(scaledImage8);
        onlabel= new JLabel(on);
        onlabel.setBounds(90, 5, 50, 35);
        O_neg.add(onlabel);
    
    
    }
        
      
    
    public static void main(String[] args) { 


        Home frame2 =  new Home ();
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setBounds(100,100,800,500);
        frame2.setBackground(Color.white);
        frame2.setTitle("This is Home ");

      
    
}
}