
package blood_management_system_final;

import java.io.FileWriter;
import javax.swing.JOptionPane;


public class SignUp extends javax.swing.JFrame {

   
    public SignUp() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Username_txt = new javax.swing.JTextField();
        Password_txt = new javax.swing.JTextField();
        OK_Button = new javax.swing.JButton();
        Login_Button = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel3.setForeground(java.awt.Color.decode("#FFFFFF"));
        jLabel3.setText("Username   :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.decode("#FF3333"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36));
        jLabel1.setForeground(java.awt.Color.decode("#FFFFFF"));
        jLabel1.setText("Sign Up");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel2.setForeground(java.awt.Color.decode("#FFFFFF"));
        jLabel2.setText("Username   :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel4.setForeground(java.awt.Color.decode("#FFFFFF"));
        jLabel4.setText("Password    :");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Login_Button)
                        .addGap(18, 18, 18)
                        .addComponent(OK_Button))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Password_txt))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OK_Button)
                    .addComponent(Login_Button))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Username_txtActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    private void OK_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        OpenLoginWindow();
    }

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton Login_Button, OK_Button;
private javax.swing.JTextField Password_txt, Username_txt;
private javax.swing.JLabel jLabel1, jLabel2, jLabel3, jLabel4;
private javax.swing.JPanel jPanel1;

private void showMassage(){  
  JOptionPane.showMessageDialog(null,"Registration Successfull");    
}

private void OpenLoginWindow(){
        LoginForm log = new LoginForm();
        log.setVisible(true);
        this.dispose(); 
}

}
