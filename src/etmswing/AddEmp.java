/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package etmswing;

import static etmswing.MainETM.Formicon;
import static etmswing.MainETM.empsList;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import java.util.regex.*;
//import java.lang.Object.*;
/**
 *
 * @author dell
 */
public class AddEmp extends javax.swing.JFrame {

    /**
     * Creates new form AddEmp
     */
//    private static final String EMAIL_PATTERN  = "^[\\\\w!#$%&'*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$";
//    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    public AddEmp() {
        initComponents();
        setResizable(false);
        Image icon=new ImageIcon(this.getClass().getResource(Formicon)).getImage();
          this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Email_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JTextField();
        Name_txt = new javax.swing.JTextField();
        Empemail = new javax.swing.JLabel();
        Emppass = new javax.swing.JLabel();
        Empname = new javax.swing.JLabel();
        Name_error = new javax.swing.JLabel();
        Email_error = new javax.swing.JLabel();
        Password_error = new javax.swing.JLabel();
        name_logo = new javax.swing.JLabel();
        email_logo = new javax.swing.JLabel();
        password_logo = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        add_emp_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Add Forn");
        setMaximumSize(new java.awt.Dimension(371, 605));
        setMinimumSize(new java.awt.Dimension(371, 605));

        Email_txt.setBackground(new java.awt.Color(80, 80, 80));
        Email_txt.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        Email_txt.setForeground(new java.awt.Color(204, 204, 204));
        Email_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Email_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        password_txt.setBackground(new java.awt.Color(80, 80, 80));
        password_txt.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        password_txt.setForeground(new java.awt.Color(204, 204, 204));
        password_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        Name_txt.setBackground(new java.awt.Color(80, 80, 80));
        Name_txt.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        Name_txt.setForeground(new java.awt.Color(204, 204, 204));
        Name_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        Empemail.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        Empemail.setForeground(new java.awt.Color(204, 204, 204));
        Empemail.setText("Email");

        Emppass.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        Emppass.setForeground(new java.awt.Color(204, 204, 204));
        Emppass.setText("Password");

        Empname.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        Empname.setForeground(new java.awt.Color(204, 204, 204));
        Empname.setText("Name");

        Name_error.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        Name_error.setForeground(new java.awt.Color(153, 0, 0));

        Email_error.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        Email_error.setForeground(new java.awt.Color(153, 0, 0));

        Password_error.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        Password_error.setForeground(new java.awt.Color(153, 0, 0));

        name_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autograph_30.png"))); // NOI18N

        email_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mail_30.png"))); // NOI18N

        password_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_30.png"))); // NOI18N

        addBtn.setBackground(new java.awt.Color(51, 51, 51));
        addBtn.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(204, 204, 204));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        addBtn.setFocusPainted(false);
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addBtnMouseReleased(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(51, 51, 51));
        Back.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(204, 204, 204));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        Back.setText("Back");
        Back.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        Back.setFocusPainted(false);
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BackMouseReleased(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        add_emp_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_emp_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user menu  60.png"))); // NOI18N
        add_emp_logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(371, 605));
        jLabel1.setMinimumSize(new java.awt.Dimension(371, 605));
        jLabel1.setPreferredSize(new java.awt.Dimension(371, 605));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_emp_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Email_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Name_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Name_txt)
                            .addComponent(Empname)
                            .addComponent(Emppass)
                            .addComponent(Empemail)
                            .addComponent(password_txt)
                            .addComponent(Email_txt)
                            .addComponent(Password_error, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(password_logo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email_logo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_emp_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Empemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email_error, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Emppass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_logo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password_error, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Empname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_logo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name_error, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        Email_error.setText("");
        Password_error.setText("");
        Name_error.setText("");
//        Matcher matcher = pattern.matcher(Email_txt.getText());
//        System.out.println("match: "+matcher.matches());
        if(!Email_txt.getText().equals("") && empsList.get(Email_txt.getText())!=null){
            email_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mail_30_decline.png")));
            password_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_30_decline.png")));
            name_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autograph_30_decline.png")));
            JOptionPane.showMessageDialog(this, "The email already exists","Invalid Input",JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/icons/close_30_decline.png")));
            Email_txt.setText("");
            password_txt.setText("");
            Name_txt.setText("");
            email_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mail_30.png")));
            password_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_30.png")));
            name_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autograph_30.png")));
        }
        else if(Email_txt.getText().equals("") || password_txt.getText().equals("") || Name_txt.getText().equals("")){
            if(Email_txt.getText().equals("")){
                Email_error.setText("Email field is required");
                email_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mail_30_decline.png")));
            }
            else
            {
                email_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mail_30_confirm.png")));
            }
            if(password_txt.getText().equals("")){
                Password_error.setText("Password field is required");
                password_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_30_decline.png")));
            }
            else
            {
                password_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_30_confirm.png")));
            }
            if(Name_txt.getText().equals("")){
                Name_error.setText("Name field is required");
                name_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autograph_30_decline.png")));
            }
            else
            {
                name_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autograph_30_confirm.png")));
            }
        }
//        else if(!matcher.matches())
//        {
//            System.out.println("else if(matcher.matches())");
//            Email_error.setText("Email field is default format");
//            email_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mail_30_decline.png")));
//            Email_txt.setText("");
//        }
        else{
            email_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mail_30_confirm.png")));
            password_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_30_confirm.png")));
            name_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autograph_30_confirm.png")));
            ArrayList<Task> list1 = new ArrayList<>(); 
            ArrayList<Task> list2 = new ArrayList<>(); 
            Employee E=new Employee(Email_txt.getText(),password_txt.getText(),Name_txt.getText(),list1,list2);
            empsList.put(E.email, E);   //puting new employee in hashtable  
            JOptionPane.showMessageDialog(this, "Data Added Successfully","Process Succeeded", JOptionPane.OK_OPTION, new javax.swing.ImageIcon(getClass().getResource("/icons/tick_ok_30_confirm.png")));
            Email_txt.setText("");
            password_txt.setText("");
            Name_txt.setText("");
            email_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mail_30.png")));
            password_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_30.png")));
            name_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autograph_30.png")));
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
    ManagerForm BackManagerForm = new ManagerForm(); //call new form
       BackManagerForm.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    // addBtn actions
    private void addBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseEntered
        setHoverColorConfirm(addBtn);
        addBtn_over = true;
    }//GEN-LAST:event_addBtnMouseEntered

    private void addBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseExited
        setResetColor(addBtn);
        addBtn_over = false;
    }//GEN-LAST:event_addBtnMouseExited

    private void addBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMousePressed
        setPressColor(addBtn);
    }//GEN-LAST:event_addBtnMousePressed

    private void addBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseReleased
        if (addBtn_over) {
            setHoverColorConfirm(addBtn);
        } else {
            setResetColor(addBtn);
        }
    }//GEN-LAST:event_addBtnMouseReleased
    /////////////////////////////////////////////////////////////////////////

    // back btn actions
    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        setHoverColor(Back);
        backBtn_over = true;
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        setResetColor(Back);
        backBtn_over = false;
    }//GEN-LAST:event_BackMouseExited

    private void BackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMousePressed
        setPressColor(Back);
    }//GEN-LAST:event_BackMousePressed

    private void BackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseReleased
        if (backBtn_over) {
            setHoverColor(Back);
        } else {
            setResetColor(Back);
        }
    }//GEN-LAST:event_BackMouseReleased
    /////////////////////////////////////////////////////////////////////////
    
    private void setPressColor(javax.swing.JButton b) {
        b.setBackground(new Color(153, 153, 153));
    }
    private void setHoverColor(javax.swing.JButton b) {
            b.setBackground(new Color(102, 102, 102));
    }
    private void setResetColor(javax.swing.JButton b) {
            b.setBackground(new Color(51, 51, 51));
    }
    private void setHoverColorConfirm(javax.swing.JButton b) {
        b.setBackground(new Color(0,153,0));
    }
    private boolean addBtn_over;
    private boolean backBtn_over;

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
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Email_error;
    private javax.swing.JTextField Email_txt;
    private javax.swing.JLabel Empemail;
    private javax.swing.JLabel Empname;
    private javax.swing.JLabel Emppass;
    private javax.swing.JLabel Name_error;
    private javax.swing.JTextField Name_txt;
    private javax.swing.JLabel Password_error;
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel add_emp_logo;
    private javax.swing.JLabel email_logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name_logo;
    private javax.swing.JLabel password_logo;
    private javax.swing.JTextField password_txt;
    // End of variables declaration//GEN-END:variables
}