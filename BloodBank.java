
package bloodmanagementsystem;
import java.io.FileReader;
import java.util.Scanner;


public class BloodBank extends javax.swing.JFrame {

    public BloodBank() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Log_Out = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Donate_button = new javax.swing.JButton();
        Request_button = new javax.swing.JButton();
        home_button = new javax.swing.JButton();
        Request_button1 = new javax.swing.JButton();
        Request_button2 = new javax.swing.JButton();
        B_Plus_Panel = new javax.swing.JPanel();
        b_pos_avail = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        B_plus = new javax.swing.JLabel();
        A_Plus_Panel = new javax.swing.JPanel();
        A_pos_avail = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        A_plus = new javax.swing.JLabel();
        AB_Plus_Panel = new javax.swing.JPanel();
        Ab_pos_avail = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        AB_plus = new javax.swing.JLabel();
        O_Plus_Panel = new javax.swing.JPanel();
        o_pos_avail = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        O_Plus = new javax.swing.JLabel();
        AB_Neg_Panel = new javax.swing.JPanel();
        ab_neg_avail = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        AB_neg = new javax.swing.JLabel();
        Total_Donars_Panel = new javax.swing.JPanel();
        totat_donars = new javax.swing.JLabel();
        Donor_icon = new javax.swing.JLabel();
        B_Neg_Panel = new javax.swing.JPanel();
        b_neg_avail = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        B_neg = new javax.swing.JLabel();
        O_Neg_Panel = new javax.swing.JPanel();
        o_neg_avail = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        O_neg = new javax.swing.JLabel();
        A_Neg_Panel = new javax.swing.JPanel();
        A_neg_avail = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        A_neg = new javax.swing.JLabel();
        Total_Approved_Panel = new javax.swing.JPanel();
        total_approved = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        Total_Requst_Panel = new javax.swing.JPanel();
        total_request = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        Total_Blood_Panel = new javax.swing.JPanel();
        total_blood = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        see_all_avail = new javax.swing.JButton();

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("12");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bloodicon.png"))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel29.setText("A+");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setText("12");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bloodicon.png"))); // NOI18N

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel38.setText("A+");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/love.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Blood Bank Management System");

        Log_Out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Screenshot 2024-03-08 220923.png"))); // NOI18N
        Log_Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_OutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Log_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Log_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        Donate_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/donatebtn.png"))); // NOI18N
        Donate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Donate_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(Donate_button)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(Donate_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        Request_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/requstbloodbtn.png"))); // NOI18N
        Request_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Request_buttonActionPerformed(evt);
            }
        });

        home_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/homebtn1.png"))); // NOI18N
        home_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_buttonActionPerformed(evt);
            }
        });

        Request_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hospitalsbtn.png"))); // NOI18N
        Request_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Request_button1ActionPerformed(evt);
            }
        });

        Request_button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/requesthistorybtn.png"))); // NOI18N
        Request_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Request_button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Request_button)
                            .addComponent(home_button)
                            .addComponent(Request_button1)
                            .addComponent(Request_button2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(home_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Request_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Request_button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(Request_button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(241, 241, 241))
        );

        B_Plus_Panel.setBackground(new java.awt.Color(255, 255, 255));

        b_pos_avail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_pos_avail.setText("00");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bloodicon.png"))); // NOI18N

        B_plus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        B_plus.setText("B+");

        javax.swing.GroupLayout B_Plus_PanelLayout = new javax.swing.GroupLayout(B_Plus_Panel);
        B_Plus_Panel.setLayout(B_Plus_PanelLayout);
        B_Plus_PanelLayout.setHorizontalGroup(
            B_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_Plus_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_plus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(B_Plus_PanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(b_pos_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        B_Plus_PanelLayout.setVerticalGroup(
            B_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_Plus_PanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(B_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B_plus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(b_pos_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        A_Plus_Panel.setBackground(new java.awt.Color(255, 255, 255));

        A_pos_avail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A_pos_avail.setText("00");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bloodicon.png"))); // NOI18N

        A_plus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        A_plus.setText("A+");

        javax.swing.GroupLayout A_Plus_PanelLayout = new javax.swing.GroupLayout(A_Plus_Panel);
        A_Plus_Panel.setLayout(A_Plus_PanelLayout);
        A_Plus_PanelLayout.setHorizontalGroup(
            A_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_Plus_PanelLayout.createSequentialGroup()
                .addGroup(A_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(A_Plus_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(A_pos_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, A_Plus_PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A_plus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        A_Plus_PanelLayout.setVerticalGroup(
            A_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, A_Plus_PanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(A_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A_plus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11)
                .addComponent(A_pos_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AB_Plus_Panel.setBackground(new java.awt.Color(255, 255, 255));

        Ab_pos_avail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ab_pos_avail.setText("00");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bloodicon.png"))); // NOI18N

        AB_plus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AB_plus.setText("AB+");

        javax.swing.GroupLayout AB_Plus_PanelLayout = new javax.swing.GroupLayout(AB_Plus_Panel);
        AB_Plus_Panel.setLayout(AB_Plus_PanelLayout);
        AB_Plus_PanelLayout.setHorizontalGroup(
            AB_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AB_Plus_PanelLayout.createSequentialGroup()
                .addGroup(AB_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AB_Plus_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Ab_pos_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AB_Plus_PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AB_plus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AB_Plus_PanelLayout.setVerticalGroup(
            AB_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AB_Plus_PanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(AB_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AB_plus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11)
                .addComponent(Ab_pos_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        O_Plus_Panel.setBackground(new java.awt.Color(255, 255, 255));

        o_pos_avail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        o_pos_avail.setText("00");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bloodicon.png"))); // NOI18N

        O_Plus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        O_Plus.setText("O+");

        javax.swing.GroupLayout O_Plus_PanelLayout = new javax.swing.GroupLayout(O_Plus_Panel);
        O_Plus_Panel.setLayout(O_Plus_PanelLayout);
        O_Plus_PanelLayout.setHorizontalGroup(
            O_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(O_Plus_PanelLayout.createSequentialGroup()
                .addGroup(O_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(O_Plus_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(o_pos_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, O_Plus_PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(O_Plus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        O_Plus_PanelLayout.setVerticalGroup(
            O_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, O_Plus_PanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(O_Plus_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(O_Plus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11)
                .addComponent(o_pos_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AB_Neg_Panel.setBackground(new java.awt.Color(255, 255, 255));

        ab_neg_avail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ab_neg_avail.setText("00");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bloodicon.png"))); // NOI18N

        AB_neg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AB_neg.setText("AB-");

        javax.swing.GroupLayout AB_Neg_PanelLayout = new javax.swing.GroupLayout(AB_Neg_Panel);
        AB_Neg_Panel.setLayout(AB_Neg_PanelLayout);
        AB_Neg_PanelLayout.setHorizontalGroup(
            AB_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AB_Neg_PanelLayout.createSequentialGroup()
                .addGroup(AB_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AB_Neg_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ab_neg_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AB_Neg_PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AB_neg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AB_Neg_PanelLayout.setVerticalGroup(
            AB_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AB_Neg_PanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(AB_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AB_neg, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11)
                .addComponent(ab_neg_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Total_Donars_Panel.setBackground(new java.awt.Color(255, 255, 255));

        totat_donars.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totat_donars.setText("Total Donars :");

        Donor_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/persons.png"))); // NOI18N

        javax.swing.GroupLayout Total_Donars_PanelLayout = new javax.swing.GroupLayout(Total_Donars_Panel);
        Total_Donars_Panel.setLayout(Total_Donars_PanelLayout);
        Total_Donars_PanelLayout.setHorizontalGroup(
            Total_Donars_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Total_Donars_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Donor_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(Total_Donars_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totat_donars, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        Total_Donars_PanelLayout.setVerticalGroup(
            Total_Donars_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Total_Donars_PanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(Donor_icon)
                .addGap(11, 11, 11)
                .addComponent(totat_donars, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        B_Neg_Panel.setBackground(new java.awt.Color(255, 255, 255));

        b_neg_avail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_neg_avail.setText("00");

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bloodicon.png"))); // NOI18N

        B_neg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        B_neg.setText("B-");

        javax.swing.GroupLayout B_Neg_PanelLayout = new javax.swing.GroupLayout(B_Neg_Panel);
        B_Neg_Panel.setLayout(B_Neg_PanelLayout);
        B_Neg_PanelLayout.setHorizontalGroup(
            B_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_Neg_PanelLayout.createSequentialGroup()
                .addGroup(B_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(B_Neg_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(b_neg_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_Neg_PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_neg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        B_Neg_PanelLayout.setVerticalGroup(
            B_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_Neg_PanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(B_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B_neg, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11)
                .addComponent(b_neg_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        O_Neg_Panel.setBackground(new java.awt.Color(255, 255, 255));

        o_neg_avail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        o_neg_avail.setText("00");

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bloodicon.png"))); // NOI18N

        O_neg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        O_neg.setText("O-");

        javax.swing.GroupLayout O_Neg_PanelLayout = new javax.swing.GroupLayout(O_Neg_Panel);
        O_Neg_Panel.setLayout(O_Neg_PanelLayout);
        O_Neg_PanelLayout.setHorizontalGroup(
            O_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(O_Neg_PanelLayout.createSequentialGroup()
                .addGroup(O_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(O_Neg_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(o_neg_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, O_Neg_PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(O_neg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        O_Neg_PanelLayout.setVerticalGroup(
            O_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, O_Neg_PanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(O_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(O_neg, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11)
                .addComponent(o_neg_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        A_Neg_Panel.setBackground(new java.awt.Color(255, 255, 255));

        A_neg_avail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A_neg_avail.setText("00");

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bloodicon.png"))); // NOI18N

        A_neg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        A_neg.setText("A-");

        javax.swing.GroupLayout A_Neg_PanelLayout = new javax.swing.GroupLayout(A_Neg_Panel);
        A_Neg_Panel.setLayout(A_Neg_PanelLayout);
        A_Neg_PanelLayout.setHorizontalGroup(
            A_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_Neg_PanelLayout.createSequentialGroup()
                .addGroup(A_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(A_Neg_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(A_neg_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, A_Neg_PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A_neg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        A_Neg_PanelLayout.setVerticalGroup(
            A_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, A_Neg_PanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(A_Neg_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A_neg, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11)
                .addComponent(A_neg_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Total_Approved_Panel.setBackground(new java.awt.Color(255, 255, 255));

        total_approved.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total_approved.setText("Total Approved :");

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/approved.png"))); // NOI18N

        javax.swing.GroupLayout Total_Approved_PanelLayout = new javax.swing.GroupLayout(Total_Approved_Panel);
        Total_Approved_Panel.setLayout(Total_Approved_PanelLayout);
        Total_Approved_PanelLayout.setHorizontalGroup(
            Total_Approved_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Total_Approved_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Total_Approved_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Total_Approved_PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(total_approved, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addContainerGap())
        );
        Total_Approved_PanelLayout.setVerticalGroup(
            Total_Approved_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Total_Approved_PanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(11, 11, 11)
                .addComponent(total_approved, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Total_Requst_Panel.setBackground(new java.awt.Color(255, 255, 255));

        total_request.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total_request.setText("Total Request :");

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/total req.png"))); // NOI18N

        javax.swing.GroupLayout Total_Requst_PanelLayout = new javax.swing.GroupLayout(Total_Requst_Panel);
        Total_Requst_Panel.setLayout(Total_Requst_PanelLayout);
        Total_Requst_PanelLayout.setHorizontalGroup(
            Total_Requst_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Total_Requst_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(Total_Requst_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_request, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        Total_Requst_PanelLayout.setVerticalGroup(
            Total_Requst_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Total_Requst_PanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel52)
                .addGap(11, 11, 11)
                .addComponent(total_request, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Total_Blood_Panel.setBackground(new java.awt.Color(255, 255, 255));

        total_blood.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total_blood.setText("Total Blood in unit");

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bloodicon.png"))); // NOI18N

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout Total_Blood_PanelLayout = new javax.swing.GroupLayout(Total_Blood_Panel);
        Total_Blood_Panel.setLayout(Total_Blood_PanelLayout);
        Total_Blood_PanelLayout.setHorizontalGroup(
            Total_Blood_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Total_Blood_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Total_Blood_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Total_Blood_PanelLayout.createSequentialGroup()
                        .addGap(0, 138, Short.MAX_VALUE)
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(total_blood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Total_Blood_PanelLayout.setVerticalGroup(
            Total_Blood_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Total_Blood_PanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(Total_Blood_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11)
                .addComponent(total_blood, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        see_all_avail.setBackground(new java.awt.Color(0, 204, 102));
        see_all_avail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        see_all_avail.setForeground(new java.awt.Color(255, 255, 255));
        see_all_avail.setText("SEE ALL AVAILABLE BLOOD");
        see_all_avail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                see_all_availActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Total_Donars_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(Total_Requst_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(A_Neg_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(B_Neg_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(A_Plus_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(B_Plus_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(O_Neg_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O_Plus_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Total_Approved_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AB_Plus_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AB_Neg_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Total_Blood_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(see_all_avail)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_Plus_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(O_Plus_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AB_Plus_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(A_Plus_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_Neg_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O_Neg_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AB_Neg_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A_Neg_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Total_Donars_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Total_Blood_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Total_Requst_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Total_Approved_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(see_all_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Log_OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_OutActionPerformed
        LoginForm log = new LoginForm();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Log_OutActionPerformed

    private void Donate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Donate_buttonActionPerformed
       Donor donor = new Donor();
       donor.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_Donate_buttonActionPerformed

    private void Request_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Request_buttonActionPerformed
     Request req = new Request();
       req.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_Request_buttonActionPerformed

    private void home_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_buttonActionPerformed
        Home home = new Home ();
        home.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_home_buttonActionPerformed

         
            
    private void see_all_availActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_see_all_availActionPerformed
       
            double unit=.45;
            int a_pos = 0, b_pos = 0, o_pos = 0, ab_pos = 0;
            int a_neg = 0, b_neg = 0, o_neg = 0, ab_neg = 0;
            int td = 0;
            int total_req = 0;
             
      
                                                   
                         try{
           FileReader read = new FileReader("data1.txt");
           Scanner scan1 = new Scanner(read);
           scan1.useDelimiter("[,\n]");
          
           while(scan1.hasNext())
           {
               String c = scan1.next();
              total_req++;           
                                  
           } 
        
       }
       catch(Exception e2){
           
       }
     
        total_request.setText("Total Request: "+total_req/5 );
        total_approved.setText("Total approved: "+total_req/5 );
        
          
              try{
           FileReader reader = new FileReader("data.txt");
           Scanner scan = new Scanner(reader);
           scan.useDelimiter("[,\n]");
            
           while (scan.hasNext()) {
         String bg = scan.next();
         switch (bg) {
        case "A+":
            a_pos++;
            td++;
            break;
        case "B+":
            b_pos++;
            td++;
            break;
        case "AB+":
            ab_pos++;
            td++;
            break;
        case "O+":
            o_pos++;
            td++;
            break;
        case "A-":
            a_neg++;
            td++;
            break;
        case "B-":
            b_neg++;
            td++;
            break;
        case "O-":
            o_neg++;
            td++;
            break;
        case "AB-":
            ab_neg++;
            td++;
            break;
        default:
            // Handle unexpected input here if needed
            break;
    }
}
    
       }
       catch(Exception e){
           
       }
        
        
      
        A_pos_avail.setText(""+a_pos);
        A_neg_avail.setText(""+a_neg);
        b_pos_avail.setText(""+b_pos);
        b_neg_avail.setText(""+b_neg);
        o_pos_avail.setText(""+o_pos);
        o_neg_avail.setText(""+o_neg);
        Ab_pos_avail.setText(""+ab_pos);
        ab_neg_avail.setText(""+ab_neg);
        totat_donars.setText("Total Donars :"+td);
        total_blood.setText("Total Blood: "+unit*td );
       
        
        
    }//GEN-LAST:event_see_all_availActionPerformed
  
    private void Request_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Request_button1ActionPerformed
      
    }//GEN-LAST:event_Request_button1ActionPerformed

    private void Request_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Request_button2ActionPerformed
    
    }//GEN-LAST:event_Request_button2ActionPerformed
   
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(BloodBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodBank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AB_Neg_Panel;
    private javax.swing.JPanel AB_Plus_Panel;
    private javax.swing.JLabel AB_neg;
    private javax.swing.JLabel AB_plus;
    private javax.swing.JPanel A_Neg_Panel;
    private javax.swing.JPanel A_Plus_Panel;
    private javax.swing.JLabel A_neg;
    private javax.swing.JLabel A_neg_avail;
    private javax.swing.JLabel A_plus;
    private javax.swing.JLabel A_pos_avail;
    private javax.swing.JLabel Ab_pos_avail;
    private javax.swing.JPanel B_Neg_Panel;
    private javax.swing.JPanel B_Plus_Panel;
    private javax.swing.JLabel B_neg;
    private javax.swing.JLabel B_plus;
    private javax.swing.JButton Donate_button;
    private javax.swing.JLabel Donor_icon;
    private javax.swing.JButton Log_Out;
    private javax.swing.JPanel O_Neg_Panel;
    private javax.swing.JLabel O_Plus;
    private javax.swing.JPanel O_Plus_Panel;
    private javax.swing.JLabel O_neg;
    private javax.swing.JButton Request_button;
    private javax.swing.JButton Request_button1;
    private javax.swing.JButton Request_button2;
    private javax.swing.JPanel Total_Approved_Panel;
    private javax.swing.JPanel Total_Blood_Panel;
    private javax.swing.JPanel Total_Donars_Panel;
    private javax.swing.JPanel Total_Requst_Panel;
    private javax.swing.JLabel ab_neg_avail;
    private javax.swing.JLabel b_neg_avail;
    private javax.swing.JLabel b_pos_avail;
    private javax.swing.JButton home_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel o_neg_avail;
    private javax.swing.JLabel o_pos_avail;
    private javax.swing.JButton see_all_avail;
    private javax.swing.JLabel total_approved;
    private javax.swing.JLabel total_blood;
    private javax.swing.JLabel total_request;
    private javax.swing.JLabel totat_donars;
    // End of variables declaration//GEN-END:variables
}
