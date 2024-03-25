
package bloodmanagementsystem;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

   
    public LoginForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftBackLabel = new javax.swing.JPanel();
        ImageLabel = new javax.swing.JLabel();
        FormLabel = new javax.swing.JPanel();
        LoginLabel = new javax.swing.JLabel();
        HelloLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Visibility_check = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        PersonIconL = new javax.swing.JLabel();
        Login_Button = new javax.swing.JButton();
        AccounQlabel = new javax.swing.JLabel();
        UserName_Jtext = new javax.swing.JTextField();
        SignUp_button = new javax.swing.JButton();
        Password_Jtext = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LeftBackLabel.setBackground(new java.awt.Color(255, 255, 255));

        ImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bg-login.png"))); // NOI18N

        javax.swing.GroupLayout LeftBackLabelLayout = new javax.swing.GroupLayout(LeftBackLabel);
        LeftBackLabel.setLayout(LeftBackLabelLayout);
        LeftBackLabelLayout.setHorizontalGroup(
            LeftBackLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftBackLabelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        LeftBackLabelLayout.setVerticalGroup(
            LeftBackLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftBackLabelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(ImageLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FormLabel.setBackground(new java.awt.Color(255, 51, 51));

        LoginLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginLabel.setText("Login");

        HelloLabel.setForeground(new java.awt.Color(255, 255, 255));
        HelloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HelloLabel.setText("Hello! Let's get started");

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        Visibility_check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_eye_20px_1.png"))); // NOI18N

        UserLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserLabel.setText("Username");

        PersonIconL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_user_20px_1.png"))); // NOI18N

        Login_Button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Login_Button.setForeground(new java.awt.Color(51, 0, 255));
        Login_Button.setText("LOGIN");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        AccounQlabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AccounQlabel.setForeground(new java.awt.Color(255, 255, 255));
        AccounQlabel.setText("Dont have an account ?");

        UserName_Jtext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserName_Jtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserName_JtextActionPerformed(evt);
            }
        });

        SignUp_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SignUp_button.setForeground(new java.awt.Color(51, 51, 255));
        SignUp_button.setText("Sign Up");
        SignUp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_buttonActionPerformed(evt);
            }
        });

        Password_Jtext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Password_Jtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_JtextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormLabelLayout = new javax.swing.GroupLayout(FormLabel);
        FormLabel.setLayout(FormLabelLayout);
        FormLabelLayout.setHorizontalGroup(
            FormLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLabelLayout.createSequentialGroup()
                .addGroup(FormLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLabelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormLabelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(HelloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormLabelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(UserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormLabelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(UserName_Jtext, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(PersonIconL))
                    .addGroup(FormLabelLayout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(FormLabelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormLabelLayout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(AccounQlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(SignUp_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FormLabelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(FormLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormLabelLayout.createSequentialGroup()
                                .addComponent(Password_Jtext, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Visibility_check))
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        FormLabelLayout.setVerticalGroup(
            FormLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLabelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(LoginLabel)
                .addGap(4, 4, 4)
                .addComponent(HelloLabel)
                .addGap(39, 39, 39)
                .addComponent(UserLabel)
                .addGap(9, 9, 9)
                .addGroup(FormLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLabelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(UserName_Jtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormLabelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PersonIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(PasswordLabel)
                .addGap(15, 15, 15)
                .addGroup(FormLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Visibility_check)
                    .addComponent(Password_Jtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(FormLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccounQlabel)
                    .addComponent(SignUp_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LeftBackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(LeftBackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
       String username = UserName_Jtext.getText();
       String password = Password_Jtext.getText();
        int count =0;
       try{
           FileReader reader = new FileReader("SignUpdata.txt");
           Scanner scan = new Scanner(reader);
           scan.useDelimiter("[,\n]");
          
           while(scan.hasNext())
           {
               String un = scan.next();
               String pas = scan.next();
               if(username.equals(un.trim()) && password.equals(pas.trim()))
               {
                   scan.close();
                   count++;
               }              
                                  
           } 
        
       }
       catch(Exception e){
           
       }
       
          if(count==1)
               {
                  
                   JOptionPane.showMessageDialog(null, "successfully Log in");
                   Home home =new Home();
                   home.setVisible(true);
                   this.dispose();
                   
               } else
           {
                  JOptionPane.showMessageDialog(null,"Invalid Password"); 
           }
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void UserName_JtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserName_JtextActionPerformed
       
    }//GEN-LAST:event_UserName_JtextActionPerformed

    private void SignUp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_buttonActionPerformed
       
        SignUp sign = new SignUp();
        sign.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignUp_buttonActionPerformed

    private void Password_JtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_JtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_JtextActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccounQlabel;
    private javax.swing.JPanel FormLabel;
    private javax.swing.JLabel HelloLabel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JPanel LeftBackLabel;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JButton Login_Button;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField Password_Jtext;
    private javax.swing.JLabel PersonIconL;
    private javax.swing.JButton SignUp_button;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JTextField UserName_Jtext;
    private javax.swing.JLabel Visibility_check;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
