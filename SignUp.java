
package bloodmanagementsystem;
import java.io.FileWriter;
import javax.swing.JOptionPane;


public class SignUp extends javax.swing.JFrame {

   
    public SignUp() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        SignUPlabel = new javax.swing.JPanel();
        SignupLabel = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        Username_txt = new javax.swing.JTextField();
        Password_txt = new javax.swing.JTextField();
        OK_Button = new javax.swing.JButton();
        Login_Button = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username   :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SignUPlabel.setBackground(new java.awt.Color(255, 51, 51));

        SignupLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SignupLabel.setForeground(new java.awt.Color(255, 255, 255));
        SignupLabel.setText("Sign Up");

        UserLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserLabel.setText("Username   :");

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Password    :");

        Username_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_txtActionPerformed(evt);
            }
        });

        OK_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        OK_Button.setText("Register");
        OK_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK_ButtonActionPerformed(evt);
            }
        });

        Login_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Login_Button.setText("Log in");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SignUPlabelLayout = new javax.swing.GroupLayout(SignUPlabel);
        SignUPlabel.setLayout(SignUPlabelLayout);
        SignUPlabelLayout.setHorizontalGroup(
            SignUPlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUPlabelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(SignUPlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SignUPlabelLayout.createSequentialGroup()
                        .addComponent(Login_Button)
                        .addGap(18, 18, 18)
                        .addComponent(OK_Button))
                    .addGroup(SignUPlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(SignUPlabelLayout.createSequentialGroup()
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Password_txt))
                        .addComponent(SignupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(SignUPlabelLayout.createSequentialGroup()
                            .addComponent(UserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        SignUPlabelLayout.setVerticalGroup(
            SignUPlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUPlabelLayout.createSequentialGroup()
                .addComponent(SignupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(SignUPlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserLabel)
                    .addComponent(Username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SignUPlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(Password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(SignUPlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OK_Button)
                    .addComponent(Login_Button))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUPlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUPlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Username_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_txtActionPerformed
      
    }//GEN-LAST:event_Username_txtActionPerformed
  private void SignUp()
  {
        String name = Username_txt.getText();
       String password = Password_txt.getText();
       
       
       try{
           
           FileWriter writer = new FileWriter("SignUpdata.txt",true);
           writer.write(""+name+","+password);
           writer.write(System.getProperty("line.separator"));
           writer.close();
           Username_txt.setText("");
           Password_txt.setText("");
           
            showMassage();
            OpenLoginWindow(); 
           
       }catch(Exception e)
       {
           
       }
  }
    private void OK_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_ButtonActionPerformed
     SignUp();
    }//GEN-LAST:event_OK_ButtonActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
           OpenLoginWindow(); 
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void showMassage(){  
  JOptionPane.showMessageDialog(null,"Registration Successfull");    
}

private void OpenLoginWindow(){
        LoginForm log = new LoginForm();
        log.setVisible(true);
        this.dispose(); 
}
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_Button;
    private javax.swing.JButton OK_Button;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField Password_txt;
    private javax.swing.JPanel SignUPlabel;
    private javax.swing.JLabel SignupLabel;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JTextField Username_txt;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
