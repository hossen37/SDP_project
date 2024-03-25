
package bloodmanagementsystem;

import java.awt.Desktop;
import java.net.URI;

public class Home extends javax.swing.JFrame {

    
    public Home() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LowerPanel = new javax.swing.JPanel();
        UpperPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BloodBankL = new javax.swing.JLabel();
        search_button = new javax.swing.JButton();
        donate_button = new javax.swing.JButton();
        blood_button = new javax.swing.JButton();
        Request_button = new javax.swing.JButton();
        AdviceLabel3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AdviceLabel1 = new javax.swing.JLabel();
        AdviceLabel2 = new javax.swing.JLabel();
        LearnAboutButton = new javax.swing.JButton();
        ImageDonor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LowerPanel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        UpperPanel.setBackground(new java.awt.Color(255, 51, 51));
        UpperPanel.setForeground(new java.awt.Color(255, 51, 51));

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        BloodBankL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Blood bank management.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BloodBankL, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BloodBankL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        search_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        search_button.setText("Search Blood");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        donate_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        donate_button.setText("Donate Blood");
        donate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donate_buttonActionPerformed(evt);
            }
        });

        blood_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        blood_button.setText("Blood Bank");
        blood_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blood_buttonActionPerformed(evt);
            }
        });

        Request_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Request_button.setText("Request Blood");
        Request_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Request_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpperPanelLayout = new javax.swing.GroupLayout(UpperPanel);
        UpperPanel.setLayout(UpperPanelLayout);
        UpperPanelLayout.setHorizontalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(donate_button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(blood_button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(Request_button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        UpperPanelLayout.setVerticalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blood_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Request_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donate_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        AdviceLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        AdviceLabel3.setForeground(new java.awt.Color(153, 0, 51));
        AdviceLabel3.setText("\"Every Drop Counts: Be a Lifesaver, Donate Blood.\"");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("DONATE  BLOOD !!!");

        AdviceLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        AdviceLabel1.setForeground(new java.awt.Color(153, 0, 51));
        AdviceLabel1.setText("\"Donate Blood, Save Lives.\"");

        AdviceLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        AdviceLabel2.setForeground(new java.awt.Color(153, 0, 51));
        AdviceLabel2.setText("\"Be a Hero – Donate Blood Today.\"");

        LearnAboutButton.setBackground(new java.awt.Color(255, 51, 0));
        LearnAboutButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LearnAboutButton.setForeground(new java.awt.Color(255, 255, 255));
        LearnAboutButton.setText("LEARN ABOUT DONATION →");
        LearnAboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LearnAboutButtonActionPerformed(evt);
            }
        });

        ImageDonor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/donation pic.jpg"))); // NOI18N

        javax.swing.GroupLayout LowerPanelLayout = new javax.swing.GroupLayout(LowerPanel);
        LowerPanel.setLayout(LowerPanelLayout);
        LowerPanelLayout.setHorizontalGroup(
            LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpperPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LowerPanelLayout.createSequentialGroup()
                .addGroup(LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LowerPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(AdviceLabel3)
                            .addComponent(AdviceLabel2)
                            .addComponent(AdviceLabel1)))
                    .addGroup(LowerPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(LearnAboutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageDonor)
                .addGap(98, 98, 98))
        );
        LowerPanelLayout.setVerticalGroup(
            LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LowerPanelLayout.createSequentialGroup()
                .addComponent(UpperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LowerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(AdviceLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdviceLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdviceLabel3)
                        .addGap(35, 35, 35)
                        .addComponent(LearnAboutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ImageDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(LowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LearnAboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LearnAboutButtonActionPerformed
      try {
            Desktop.getDesktop().browse(new URI("https://badhan.org/"));
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_LearnAboutButtonActionPerformed

    private void Request_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Request_buttonActionPerformed
        Request r = new Request();
      r.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_Request_buttonActionPerformed

    private void blood_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blood_buttonActionPerformed
     BloodBank bnk = new BloodBank();
      bnk.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_blood_buttonActionPerformed

    private void donate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donate_buttonActionPerformed
        Donor d = new Donor();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_donate_buttonActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
          Search s = new Search();
          s.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_search_buttonActionPerformed

   
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdviceLabel1;
    private javax.swing.JLabel AdviceLabel2;
    private javax.swing.JLabel AdviceLabel3;
    private javax.swing.JLabel BloodBankL;
    private javax.swing.JLabel ImageDonor;
    private javax.swing.JButton LearnAboutButton;
    private javax.swing.JPanel LowerPanel;
    private javax.swing.JButton Request_button;
    private javax.swing.JPanel UpperPanel;
    private javax.swing.JButton blood_button;
    private javax.swing.JButton donate_button;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton search_button;
    // End of variables declaration//GEN-END:variables
}
