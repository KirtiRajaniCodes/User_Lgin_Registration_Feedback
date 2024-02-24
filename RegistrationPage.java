package project2;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class RegistrationPage extends javax.swing.JFrame {

    Connection con;
    PreparedStatement st;
    ResultSet rs;
    public RegistrationPage()  {
        initComponents();
        setVisible(true);
        
         
    
    }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender_bg = new javax.swing.ButtonGroup();
        lb_id = new javax.swing.JLabel();
        lb_name = new javax.swing.JLabel();
        lb_pass = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        lb_contact = new javax.swing.JLabel();
        lb_address = new javax.swing.JLabel();
        lb_gender = new javax.swing.JLabel();
        lb_qualification = new javax.swing.JLabel();
        lb_nationality = new javax.swing.JLabel();
        id_tf = new javax.swing.JTextField();
        name_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        contact_tf = new javax.swing.JTextField();
        Nationality_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_ta = new javax.swing.JTextArea();
        m_rb = new javax.swing.JRadioButton();
        f_rb = new javax.swing.JRadioButton();
        pass_tf = new javax.swing.JPasswordField();
        Login_btn = new javax.swing.JButton();
        Register_btn = new javax.swing.JButton();
        qualification_cb = new javax.swing.JComboBox();
        Others_rb = new javax.swing.JRadioButton();
        clr_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_id.setText("ID ");

        lb_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_name.setText("Name");

        lb_pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_pass.setText("Password");

        lb_email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_email.setText("Email");

        lb_contact.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_contact.setText("Contact");

        lb_address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_address.setText("Address");

        lb_gender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_gender.setText("Gender");

        lb_qualification.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_qualification.setText("Qualification");

        lb_nationality.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nationality.setText("Nationality");

        id_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tfActionPerformed(evt);
            }
        });

        name_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_tfActionPerformed(evt);
            }
        });

        Nationality_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nationality_tfActionPerformed(evt);
            }
        });

        address_ta.setColumns(20);
        address_ta.setRows(5);
        jScrollPane1.setViewportView(address_ta);

        gender_bg.add(m_rb);
        m_rb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        m_rb.setText("Male");

        gender_bg.add(f_rb);
        f_rb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        f_rb.setText("Female");

        Login_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Login_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/signin.png"))); // NOI18N
        Login_btn.setText("SignIn");
        Login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_btnActionPerformed(evt);
            }
        });

        Register_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Register_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/login_bv.png"))); // NOI18N
        Register_btn.setText("Sign Up");
        Register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_btnActionPerformed(evt);
            }
        });

        qualification_cb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qualification_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Senior Secondary", "UG", "PG", "Diploma", "PhD" }));
        qualification_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualification_cbActionPerformed(evt);
            }
        });

        gender_bg.add(Others_rb);
        Others_rb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Others_rb.setText("Others");

        clr_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/rename.png"))); // NOI18N
        clr_btn.setText("Clear");
        clr_btn.setMaximumSize(new java.awt.Dimension(65, 23));
        clr_btn.setMinimumSize(new java.awt.Dimension(65, 23));
        clr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_btnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                    REGISTRATION FORM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lb_name, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_email, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_address, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(110, 110, 110)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pass_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contact_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lb_qualification, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_gender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_nationality, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(m_rb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(f_rb)
                                                .addGap(29, 29, 29)
                                                .addComponent(Others_rb))
                                            .addComponent(Register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(qualification_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Nationality_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clr_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_id))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_name)
                    .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pass_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_pass))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_email)
                    .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_contact)
                    .addComponent(contact_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_address)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_rb)
                    .addComponent(f_rb)
                    .addComponent(Others_rb)
                    .addComponent(lb_gender))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_qualification)
                    .addComponent(qualification_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nationality_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nationality))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login_btn)
                    .addComponent(clr_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tfActionPerformed

    private void name_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_tfActionPerformed

    private void qualification_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualification_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qualification_cbActionPerformed

    private void Nationality_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nationality_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nationality_tfActionPerformed

    private void Login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_btnActionPerformed
       new LoginPage().setVisible(true);
    }//GEN-LAST:event_Login_btnActionPerformed

    private boolean isValidEmail(String email)
    {
        String emailRegex="^[A-Za-z0-9+_.]+@(.+)$";
        return email.matches(emailRegex);
    }
    private boolean isValidPassword(String pass)
    {
        String passRegex = "^[A-Za-z0-9+@.#$%&*]+[A-Za-z0-9]";
        return pass.matches(passRegex);
    }
    
    private void Register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_btnActionPerformed
        
        String id=id_tf.getText();
        String name=name_tf.getText();
        String password=new String(pass_tf.getPassword());
        String email=email_tf.getText();
        String address=address_ta.getText();
        String contact=contact_tf.getText();
        String nationality=Nationality_tf.getText();
        String qualification;
        qualification = (String) qualification_cb.getSelectedItem();
        String gender = null;
        if(m_rb.isSelected())
        {
            gender="Male";
        }
        if(f_rb.isSelected())
        {
            gender="Female";
        }
        if(Others_rb.isSelected())
        {
            gender="Others";
        }
        if(id.equals("")||name.equals("")||password.equals("")||email.equals("")||contact.equals("")||nationality.equals("")||qualification.equals("")||gender.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Enter all details");
        }
        else
        {
        try
        {
            if(id.length()>12)
        {
            JOptionPane.showMessageDialog(null,"ID length should not exceed more than 12 characters ");
        }
        if(password.length()<8)
        {
            JOptionPane.showMessageDialog(null,"Password should be greater than 8 characters.");            
        }
        if(!isValidPassword(password))
        {
            JOptionPane.showMessageDialog(null,"Your password should contain combination of alphabets,numbers and special characters");
        }
        if(!isValidEmail(email))
        {
            JOptionPane.showMessageDialog(null,"Invalid Email format.Please enter a valid email");
        }
        if (contact.length() > 10) {
                JOptionPane.showMessageDialog(null, "Contact number should not be greater than 10 digits.");
            }
        else
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment2","root","");
        
          //  PreparedStatement st1;
            st=con.prepareStatement("select u_id from usertb where u_id=?");
            st.setString(1, id);            
            rs=st.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Id already exist try something else!!!");
            }            
               
           else
            {
            //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment2","root","");
            st=con.prepareStatement("insert into usertb values(?,?,?,?,?,?,?,?,?)");
            st.setString(1,id);
            st.setString(2,name);
            st.setString(3,password);
            st.setString(4,email);
            st.setString(5,contact);
            st.setString(6,address);
            st.setString(7, gender);
            st.setString(8,qualification);
            st.setString(9,nationality);
            st.execute();
            con.close();       
            
            //when registration successful:)
            JOptionPane.showMessageDialog(null,"Registration Successful!!");
            }
            
        }
    } 
        catch (ClassNotFoundException e) {
            System.err.println("Error: Could not find the JDBC driver.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while registration. Please try again!");
        }
        }
        
        
    }//GEN-LAST:event_Register_btnActionPerformed

    private void clr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_btnActionPerformed
       
        id_tf.setText(null);
        name_tf.setText(null);
        pass_tf.setText(null);
        email_tf.setText(null);
        address_ta.setText(null);
        contact_tf.setText(null);
        Nationality_tf.setText(null);
        qualification_cb.setSelectedIndex(0);
    //   m_rb.setSelected(false);
    //   f_rb.setSelected(false);
    //   Others_rb.setSelected(false);
        gender_bg.clearSelection();
       // gender_bg.setText(null);
    }//GEN-LAST:event_clr_btnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_btn;
    private javax.swing.JTextField Nationality_tf;
    private javax.swing.JRadioButton Others_rb;
    private javax.swing.JButton Register_btn;
    private javax.swing.JTextArea address_ta;
    private javax.swing.JButton clr_btn;
    private javax.swing.JTextField contact_tf;
    private javax.swing.JTextField email_tf;
    private javax.swing.JRadioButton f_rb;
    private javax.swing.ButtonGroup gender_bg;
    private javax.swing.JTextField id_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_address;
    private javax.swing.JLabel lb_contact;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_gender;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_nationality;
    private javax.swing.JLabel lb_pass;
    private javax.swing.JLabel lb_qualification;
    private javax.swing.JRadioButton m_rb;
    private javax.swing.JTextField name_tf;
    private javax.swing.JPasswordField pass_tf;
    private javax.swing.JComboBox qualification_cb;
    // End of variables declaration//GEN-END:variables
}
