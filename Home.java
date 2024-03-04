
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
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Home extends JFrame { 
    private JPanel upper_box,lower_box ,banner,left,right,A_pos,B_pos,O_pos,Ab_pos,A_neg,B_neg,O_neg,AB_neg;;
    private JLabel label1,label2,label3,label4,label5,label6,label7,label8,aplabel,bplabel,oplabel,abplabel,anlabel,bnlabel,onlabel,abnlabel;;
    private Container c,c2,c3;
    private ImageIcon search,donate,hospital,about,blood_bank,blood_management,ap,bp,op,abp,an,bn,on,abn;;
    private Font font ,font1;
    public String [][] database;
    public int count = 0;
   
   
    Home(){
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        initComponents();
        
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
        Image scaledImage =blood_management.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
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
        
         // for click event 
        
          label3.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                openNewFrame2();
            }
        });
        upper_box.add(label3);
        
        

        ImageIcon request = new ImageIcon(getClass().getResource("Blood_Request.png")); 
        Image scaledImage112 =request.getImage().getScaledInstance(100, 100,Image.SCALE_SMOOTH);
        request = new ImageIcon(scaledImage112);
        JLabel r_label = new JLabel(request);
        upper_box.add(r_label);
        
        
        
        blood_bank = new ImageIcon(getClass().getResource("Blood Bank.png")); 
        Image scaledImage4 =blood_bank.getImage().getScaledInstance(100, 100,Image.SCALE_SMOOTH);
        blood_bank = new ImageIcon(scaledImage4);
        label4= new JLabel(blood_bank);
        
         // for click event 
        
          label4.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                openNewFrame();
            }
        });
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
           // for click event 
        
          A_pos.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                
            openNewTable();
              
            }

            private void openNewTable() {
                
        JTable blood_group_table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Email", "Phone", "Blood Group","Address"});
        blood_group_table.setModel(model);
        blood_group_table.setRowHeight(30);
        
        JScrollPane scroll = new JScrollPane(blood_group_table);
        scroll.setBounds(160, 300, 630, 300);
        right.add(scroll);
                
            }
        });
         right.add(A_pos);
         
         B_pos = new JPanel();
         B_pos.setBounds(320,40,150,70);
         B_pos.setBackground(Color.white);
         B_pos.setLayout(null);
                
         B_pos.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                
            openNewTable();
              
            }

                private void openNewTable() {
                
        JTable blood_group_table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Email", "Phone", "Blood Group","Address"});
        blood_group_table.setModel(model);
        blood_group_table.setRowHeight(30);
        
        JScrollPane scroll = new JScrollPane(blood_group_table);
        scroll.setBounds(160, 300, 630, 300);
        right.add(scroll);
                
            }

        });
         
         right.add(B_pos);
         
         Ab_pos = new JPanel();
         Ab_pos.setBounds(480,40,150,70);
         Ab_pos.setBackground(Color.white);
         Ab_pos.setLayout(null);
           Ab_pos.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                
            openNewTable();
              
            }

                private void openNewTable() {
                
        JTable blood_group_table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Email", "Phone", "Blood Group","Address"});
        blood_group_table.setModel(model);
        blood_group_table.setRowHeight(30);
        
        JScrollPane scroll = new JScrollPane(blood_group_table);
        scroll.setBounds(160, 300, 630, 300);
        right.add(scroll);
                
            }

        });
         right.add(Ab_pos);
         
         O_pos = new JPanel();
         O_pos.setBounds(640,40,150,70);
         O_pos.setBackground(Color.white);
         O_pos.setLayout(null);
          
         O_pos.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                
            openNewTable();
              
            }
                 private void openNewTable() {
                
        JTable blood_group_table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Email", "Phone", "Blood Group","Address"});
        blood_group_table.setModel(model);
        blood_group_table.setRowHeight(30);
        
        JScrollPane scroll = new JScrollPane(blood_group_table);
        scroll.setBounds(160, 300, 630, 300);
        right.add(scroll);
                
            }

        });
         right.add(O_pos);
    
         A_neg = new JPanel();
         A_neg.setBounds(160,120,150,70);
         A_neg.setBackground(Color.white);
         A_neg.setLayout(null);
           A_neg.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                
            openNewTable();
              
            }
                 private void openNewTable() {
                
        JTable blood_group_table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Email", "Phone", "Blood Group","Address"});
        blood_group_table.setModel(model);
        blood_group_table.setRowHeight(30);
        
        JScrollPane scroll = new JScrollPane(blood_group_table);
        scroll.setBounds(160, 300, 630, 300);
        right.add(scroll);
                
            }

        });
         right.add(A_neg);
         
         B_neg = new JPanel();
         B_neg.setBounds(320,120,150,70);
         B_neg.setBackground(Color.white);
         B_neg.setLayout(null);
         B_neg.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                
            openNewTable();
              
            }
                 private void openNewTable() {
                
        JTable blood_group_table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Email", "Phone", "Blood Group","Address"});
        blood_group_table.setModel(model);
        blood_group_table.setRowHeight(30);
        
        JScrollPane scroll = new JScrollPane(blood_group_table);
        scroll.setBounds(160, 300, 630, 300);
        right.add(scroll);
                
            }

        });
         right.add(B_neg);
         
         AB_neg = new JPanel();
         AB_neg.setBounds(480,120,150,70);
         AB_neg.setBackground(Color.white);
         AB_neg.setLayout(null);
          AB_neg.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                
            openNewTable();
              
            }
                 private void openNewTable() {
                
        JTable blood_group_table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Email", "Phone", "Blood Group","Address"});
        blood_group_table.setModel(model);
        blood_group_table.setRowHeight(30);
        
        JScrollPane scroll = new JScrollPane(blood_group_table);
        scroll.setBounds(160, 300, 630, 300);
        right.add(scroll);
                
            }

        });
         right.add(AB_neg);
         
         O_neg = new JPanel();
         O_neg.setBounds(640,120,150,70);
         O_neg.setBackground(Color.white);
         O_neg.setLayout(null);
         O_neg.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                
            openNewTable();
              
            }
                 private void openNewTable() {
                
        JTable blood_group_table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Email", "Phone", "Blood Group","Address"});
        blood_group_table.setModel(model);
        blood_group_table.setRowHeight(30);
        
        JScrollPane scroll = new JScrollPane(blood_group_table);
        scroll.setBounds(160, 300, 630, 300);
        right.add(scroll);
                
            }

        });
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
        
        
        
        //---------------------------
         JPanel total_donar = new JPanel();
         total_donar.setBounds(160,200,150,70);
         total_donar.setBackground(Color.white);
         total_donar.setLayout(null);
         right.add(total_donar);
         
         
        ImageIcon to_donar = new ImageIcon(getClass().getResource("total_donars.png")); 
        Image scaledImage9 =to_donar.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
        to_donar = new ImageIcon(scaledImage9);
        JLabel td_label = new JLabel(to_donar);
        td_label.setBounds(90, 5, 50, 35);
        total_donar.add(td_label);
        
        
        JLabel td_text = new JLabel("Total Donars "+count);
      //  td_text.setText("Total Donars "+database.length);
        td_text.setBounds(5,40,150,25);
        total_donar.add(td_text);
        
         
         JPanel total_requst = new JPanel();
         total_requst.setBounds(320,200,150,70);
         total_requst.setBackground(Color.white);
         total_requst.setLayout(null);
         right.add(total_requst);
         
        ImageIcon to_req = new ImageIcon(getClass().getResource("request.png")); 
        Image scaledImage10 =to_req.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
        to_req = new ImageIcon(scaledImage10);
        JLabel tr_label = new JLabel(to_req);
        tr_label.setBounds(90, 5, 50, 35);
        total_requst.add(tr_label);
        
        
        JLabel tr_text = new JLabel("Total Request:0");
        tr_text.setBounds(5,40,150,25);
        total_requst.add(tr_text);
        
         
         JPanel approve = new JPanel();
         approve.setBounds(480,200,150,70);
         approve.setBackground(Color.white);
         approve.setLayout(null);
         right.add(approve);
         
        ImageIcon app = new ImageIcon(getClass().getResource("approved.png")); 
        Image scaledImage11 =app.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
        app = new ImageIcon(scaledImage11);
        JLabel app_label = new JLabel(app);
        app_label.setBounds(90, 5, 100, 35);
        approve.add(app_label);
        
        
        JLabel app_text = new JLabel("Total Approved : 0");
        app_text.setBounds(5,40,150,25);
        approve.add(app_text);
        
         
        JPanel total_blood = new JPanel();
        total_blood.setBounds(640,200,150,70);
        total_blood.setBackground(Color.white);
        total_blood.setLayout(null);
        right.add(total_blood);
         
         
        ImageIcon tb_count = new ImageIcon(getClass().getResource("blood.png")); 
        Image scaledImage12 =tb_count.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
        tb_count = new ImageIcon(scaledImage12);
        JLabel tb_count_label = new JLabel(tb_count);
        tb_count_label.setBounds(90, 5, 50, 35);
        total_blood.add(tb_count_label);
        
        JLabel tb_text = new JLabel("Total Blood");
        tb_text.setBounds(5,40,150,25);
        total_blood.add(tb_text);
        
        
        
        
        
            
        
         
         
       
        
        
    
    
    }
        
      //----------------------------------------donar blood---
    
              private void openNewFrame2() {
                  
        JFrame Donate_frame =  new JFrame();
        Donate_frame.setVisible(true);
        Donate_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Donate_frame.setBounds(100,100,810,500);
        Donate_frame.setBackground(Color.pink);
        Donate_frame.setTitle("Donation"); 
        
         c3=Donate_frame.getContentPane();
          c3.setLayout(null);
         c3.setBackground(Color.pink);
        
        
        
                JLabel nameLabel = new JLabel("Name  : ");
        nameLabel.setBounds(10, 20, 150, 25);
        c3.add(nameLabel);

                JTextField nameText = new JTextField();
        nameText.setBounds(10, 50, 150, 25);
        c3.add(nameText);

                JLabel rollLabel = new JLabel("Email :");
        rollLabel.setBounds(10, 70, 150, 25);
        c3.add(rollLabel);

                JTextField mailText = new JTextField();
        mailText.setBounds(10, 100, 150, 25);
        c3.add(mailText);

                JLabel phoneLabel = new JLabel("Phone number :");
        phoneLabel.setBounds(10, 120, 150, 25);
        c3.add(phoneLabel);

                JTextField phoneText = new JTextField();
        phoneText.setBounds(10, 150, 150, 25);
        c3.add(phoneText);

                JLabel blood_group = new JLabel("Blood Group :");
        blood_group.setBounds(10, 170, 150, 25);
        c3.add(blood_group);

                JTextField blood_group_text = new JTextField();
        blood_group_text.setBounds(10, 200, 150, 25);
        c3.add(blood_group_text);
        
      JLabel adress = new JLabel("Address :");
        adress.setBounds(10, 230, 150, 25);
        c3.add(adress);

                JTextField adress_text = new JTextField();
        adress_text.setBounds(10, 250, 150, 25);
        c3.add(adress_text);

                JButton addButton = new JButton("ADD");
        addButton.setBounds(10, 300, 100, 25);
        c3.add(addButton);

                JButton clearButton = new JButton("Clear");
        clearButton.setBounds(10, 350, 100, 25);
        c3.add(clearButton);

                JLabel studentLabel = new JLabel("Donar");
        studentLabel.setBounds(400, 20, 150, 25);
        c3.add(studentLabel);

                JTable studentListTable = new JTable();
                DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Email", "Phone", "Blood Group","Address"});
        studentListTable.setModel(model);
        studentListTable.setRowHeight(30);
                JScrollPane scroll = new JScrollPane(studentListTable);
        scroll.setBounds(200, 50, 500, 350);
        c3.add(scroll);

       // addButton.addActionListener((ActionListener) this);
        //clearButton.addActionListener((ActionListener) this);
        
        
       //------------------------ 
        
        
       addButton.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                Add();
            }

            private void Add() {
                
                
                
                String mail, name, phone, blood_group,address;
                mail = mailText.getText();
                name = nameText.getText();
                phone = phoneText.getText();
                blood_group = blood_group_text.getText();
                address=adress_text.getText();
                
                
        
                
                     if (name.isEmpty() || mail.isEmpty() || phone.isEmpty() || blood_group.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Fill up ALl the Rows ", "Notice", HEIGHT);
            } else {
         
                String[] row = { name, mail,phone, blood_group ,address};
                model.addRow(row);
               
                for(int i=0;i<5;i++)
                {
                    database[count][i]= row[i];
                }
                count++;              
                
                mailText.setText("");
                nameText.setText("");
                phoneText.setText("");
                blood_group_text.setText("");
                adress_text.setText("");
            }
            }
        });
        
       
       
       clearButton.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                Clear();
            }

            private void Clear() {
                
    
                mailText.setText("");
                nameText.setText("");
                phoneText.setText("");
                blood_group_text.setText("");
                adress_text.setText("");
            
            }
        });
        
       
       
       
       
       
       
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