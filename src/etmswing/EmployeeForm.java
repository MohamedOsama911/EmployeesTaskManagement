/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etmswing;

import static etmswing.MainETM.postponedTasksList;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.table.DefaultTableModel;

public class EmployeeForm extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeForm
     */
    private DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-M-d");
    LocalDate localDateEndDate;
    Employee logedInEmployee;
    public EmployeeForm(Employee e) {
        logedInEmployee = new Employee(e.email, e.password, e.name, e.list, e.Finished_List);
        initComponents();
        for (int i = 0; i < logedInEmployee.Finished_List.size(); i++) {
            Task t = logedInEmployee.Finished_List.get(i);
        }
        addRowToTable(logedInEmployee);         //all tasks table
        addFinishedRowToTable(logedInEmployee); //finished tasks
        lbName.setText(" " + logedInEmployee.name);
        lbEmail.setText(" " +logedInEmployee.email);
        DateError.setText("");
        DateErrorMissing.setText("");
        jTable.getTableHeader().setFont(new Font("Segoe UI",Font.PLAIN,14));
        jTable.getTableHeader().setOpaque(false);
        jTable.getTableHeader().setBackground(new Color(51,51,51));
        jTable.getTableHeader().setForeground(new Color(204,204,204));
        jTableF.getTableHeader().setFont(new Font("Segoe UI",Font.PLAIN,14));
        jTableF.getTableHeader().setOpaque(false);
        jTableF.getTableHeader().setBackground(new Color(51,51,51));
        jTableF.getTableHeader().setForeground(new Color(204,204,204));
        getContentPane().setBackground(new Color(20,20,20));
        if(!logedInEmployee.list.isEmpty()){
            String NextTask= "A remainder for your next task { Task title: " + logedInEmployee.list.get(0).title + ", End date " + logedInEmployee.list.get(0).endDate + " }";
//                JOptionPane.showMessageDialog(this, NextTask);
            encouraging.setFont(new Font("Franklin Gothlic Meduim Cond",Font.PLAIN,24));
            encouraging.setForeground(new Color(0,153,153));
            encouraging.setText(NextTask);
        }
        else if(logedInEmployee.list.isEmpty() && !logedInEmployee.Finished_List.isEmpty()){
            encouraging.setFont(new Font("Segoe UI",Font.ITALIC,24));
            encouraging.setForeground(new Color(0,153,0));
            encouraging.setText("No one on his deathbed ever said, ‘I wish I had spent more time at the office.'");
        }
    }

    
    public final void addRowToTable(Employee e){
        tblModel = (DefaultTableModel) jTable.getModel();
        Object data[] = new Object[5];
        for(int i = 0; i < e.list.size(); i++){
            data[0] = e.list.get(i).title;
            data[1] = e.list.get(i).priority;
            data[2] = e.list.get(i).description;
            data[3] = e.list.get(i).assignedDate;
            data[4] = e.list.get(i).endDate;
            tblModel.addRow(data);
        }
    }
    public final void addFinishedRowToTable(Employee e){
        tblMode2= (DefaultTableModel) jTableF.getModel();
        Object[] FinishedData = new Object[5];
        for(int i = 0; i < e.Finished_List.size(); i++){
            FinishedData[0] = e.Finished_List.get(i).title;
            FinishedData[1] = e.Finished_List.get(i).priority;
            FinishedData[2] = e.Finished_List.get(i).description;
            FinishedData[3] = e.Finished_List.get(i).assignedDate;
            FinishedData[4] = e.Finished_List.get(i).endDate;
            tblMode2.addRow(FinishedData);
           
        }
            
    
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnFinish = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableF = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        btnPostpone = new javax.swing.JButton();
        txtEndDate = new javax.swing.JTextField();
        DateError = new javax.swing.JLabel();
        DateErrorMissing = new javax.swing.JLabel();
        encouraging = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1366, 780));
        setMaximumSize(new java.awt.Dimension(1070, 600));
        setMinimumSize(new java.awt.Dimension(1070, 600));
        setPreferredSize(new java.awt.Dimension(1070, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setAutoCreateRowSorter(true);
        jTable.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Priority", "Description", "Assigned Date", "End Date"
            }
        ));
        jTable.setFillsViewportHeight(true);
        jTable.setFocusable(false);
        jTable.setGridColor(new java.awt.Color(51, 51, 51));
        jTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable.setRowHeight(25);
        jTable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jTable.setShowVerticalLines(false);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 860, 180));

        btnFinish.setBackground(new java.awt.Color(51, 51, 51));
        btnFinish.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnFinish.setForeground(new java.awt.Color(204, 204, 204));
        btnFinish.setText("Finish");
        btnFinish.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        btnFinish.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFinish.setFocusPainted(false);
        btnFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFinishMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFinishMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFinishMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFinishMouseReleased(evt);
            }
        });
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinish, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, 150, 36));

        btnLogOut.setBackground(new java.awt.Color(51, 51, 51));
        btnLogOut.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(204, 204, 204));
        btnLogOut.setText("Log out");
        btnLogOut.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogOut.setFocusPainted(false);
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogOutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogOutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLogOutMouseReleased(evt);
            }
        });
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 150, 36));

        jTableF.setAutoCreateRowSorter(true);
        jTableF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTableF.setForeground(new java.awt.Color(0, 153, 0));
        jTableF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Priority", "Description", "Assigined Date", "End Date"
            }
        ));
        jTableF.setFillsViewportHeight(true);
        jTableF.setFocusable(false);
        jTableF.setGridColor(new java.awt.Color(51, 51, 51));
        jTableF.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableF.setRowHeight(25);
        jTableF.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTableF.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jTableF.setShowVerticalLines(false);
        jTableF.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableF);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 860, 170));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Finished Tasks");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 180, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Assigned Tasks");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, -1));

        lbName.setBackground(new java.awt.Color(80, 80, 80));
        lbName.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        lbName.setForeground(new java.awt.Color(0, 153, 153));
        lbName.setText(" asdasd");
        lbName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        lbName.setOpaque(true);
        getContentPane().add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 200, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Name : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 90, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 90, 40));

        lbEmail.setBackground(new java.awt.Color(80, 80, 80));
        lbEmail.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(0, 153, 153));
        lbEmail.setText(" asdasd");
        lbEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        lbEmail.setOpaque(true);
        getContentPane().add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 200, 40));

        btnPostpone.setBackground(new java.awt.Color(51, 51, 51));
        btnPostpone.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnPostpone.setForeground(new java.awt.Color(204, 204, 204));
        btnPostpone.setText("Postpone");
        btnPostpone.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        btnPostpone.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPostpone.setFocusPainted(false);
        btnPostpone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPostponeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPostponeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPostponeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPostponeMouseReleased(evt);
            }
        });
        btnPostpone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostponeActionPerformed(evt);
            }
        });
        getContentPane().add(btnPostpone, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 150, 36));

        txtEndDate.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        txtEndDate.setForeground(new java.awt.Color(51, 51, 51));
        txtEndDate.setText("Year-Month-Day");
        txtEndDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtEndDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEndDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEndDateFocusLost(evt);
            }
        });
        txtEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 310, 150, 30));

        DateError.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        DateError.setForeground(new java.awt.Color(153, 0, 0));
        DateError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(DateError, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 340, 30));

        DateErrorMissing.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        DateErrorMissing.setForeground(new java.awt.Color(153, 0, 0));
        DateErrorMissing.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(DateErrorMissing, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, 150, 30));

        encouraging.setBackground(new java.awt.Color(0, 0, 0));
        encouraging.setFont(new java.awt.Font("Segoe UI Emoji", 2, 24)); // NOI18N
        encouraging.setForeground(new java.awt.Color(0, 153, 0));
        encouraging.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(encouraging, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1040, 60));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 1080, 610));

        setSize(new java.awt.Dimension(1086, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    DefaultTableModel tblModel;
    DefaultTableModel tblMode2;
    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        // TODO add your handling code here:
        tblModel = (DefaultTableModel) jTable.getModel();
        tblMode2 = (DefaultTableModel) jTableF.getModel();
        int index = jTable.getSelectedRow();
        if(index>=0){
            logedInEmployee.Finished_List.add(logedInEmployee.list.get(index));
            Object[] FinishedData = new Object[5];
            for(int i = 0; i < logedInEmployee.Finished_List.size(); i++){
                FinishedData[0] = logedInEmployee.Finished_List.get(i).title;
                FinishedData[1] = logedInEmployee.Finished_List.get(i).priority;
                FinishedData[2] = logedInEmployee.Finished_List.get(i).description;
                FinishedData[3] = logedInEmployee.Finished_List.get(i).assignedDate;
                FinishedData[4] = logedInEmployee.Finished_List.get(i).endDate;   
            }
            tblMode2.addRow(FinishedData);
            if(!postponedTasksList.isEmpty()){
                for(int i=0;i<postponedTasksList.size();i++){
                    if(postponedTasksList.get(i).employeeEmail.equals(logedInEmployee.email) && postponedTasksList.get(i).pTask.equals(logedInEmployee.list.get(index))){
                        postponedTasksList.remove(i);
                    }
            
                }
            }
            logedInEmployee.list.remove(index);
            tblModel.removeRow(jTable.getSelectedRow());
            
            if(!logedInEmployee.list.isEmpty()){
                String NextTask= "A remainder for your next task { Task title: " + logedInEmployee.list.get(0).title + ", End date " + logedInEmployee.list.get(0).endDate + " }";
//                JOptionPane.showMessageDialog(this, NextTask);
                encouraging.setFont(new Font("Franklin Gothlic Meduim Cond",Font.PLAIN,24));
                encouraging.setForeground(new Color(0,153,153));
                encouraging.setText(NextTask);
            }
            else if(logedInEmployee.list.isEmpty() && !logedInEmployee.Finished_List.isEmpty()){
                encouraging.setFont(new Font("Segoe UI",Font.ITALIC,24));
                encouraging.setForeground(new Color(0,153,0));
                encouraging.setText("No one on his deathbed ever said, ‘I wish I had spent more time at the office.'");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Select Task");
        }
    }//GEN-LAST:event_btnFinishActionPerformed
    
    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        LoginForm l = new LoginForm();
        l.setResizable(false);
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnPostponeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostponeActionPerformed
        // TODO add your handling code here:
        int index = jTable.getSelectedRow();
        if(index >= 0){
            if(txtEndDate.getText().equals("Year-Month-Day") || txtEndDate.getText().equals("")){//changed from Day/month/year to Year/Month/Day
                DateErrorMissing.setText("End date required");
                DateError.setText("");
            }
            else{
                try {
                    localDateEndDate = LocalDate.parse(txtEndDate.getText(), dateFormat);
                    if (localDateEndDate.isBefore(logedInEmployee.list.get(index).endDate) || localDateEndDate.equals(logedInEmployee.list.get(index).endDate) ) { // added or equal to prevent entering same end date
                        DateErrorMissing.setText("Invalid end date");
                        DateError.setText("");
                    }
                    else
                    {
                        PostponedTask post = new PostponedTask(txtEndDate.getText(), logedInEmployee.email, logedInEmployee.list.get(index));
                        DateError.setText("");
                        DateErrorMissing.setText("");
                        if (!postponedTasksList.isEmpty()) {
                            for (int i = 0; i < postponedTasksList.size(); i++) {
                                if (postponedTasksList.get(i).employeeEmail.equals(logedInEmployee.email) && postponedTasksList.get(i).pTask == logedInEmployee.list.get(index)) { 
                                    postponedTasksList.remove(i);
                                    break;
                                }
                            }
                        }
                        postponedTasksList.add(post);
                        showMessageDialog(this, "Request Sended Successfully .. waiting for manager approve","Process Succeeded", JOptionPane.OK_OPTION, new javax.swing.ImageIcon(getClass().getResource("/icons/tick_ok_30_confirm.png")));
                        txtEndDate.setText("");
                    }
                } catch (DateTimeParseException e) {
                    DateError.setText("Requested End Date Must Be in Date Format (Year-Month-Day)");
                    DateErrorMissing.setText("");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Select Task","Error",JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/icons/information_30.png")));
        }
    }//GEN-LAST:event_btnPostponeActionPerformed

    private void txtEndDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEndDateFocusGained
         //TODO add your handling code here:
        if(txtEndDate.getText().equals("Year-Month-Day")){
            txtEndDate.setText("");
            txtEndDate.setForeground(new Color(51, 51, 51));
        }
    }//GEN-LAST:event_txtEndDateFocusGained

    private void txtEndDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEndDateFocusLost
        // TODO add your handling code here:
        if(txtEndDate.getText().equals("")){
            txtEndDate.setText("Year-Month-Day");
            txtEndDate.setForeground(new Color(51, 51, 51));
        }
    }//GEN-LAST:event_txtEndDateFocusLost

    private void txtEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndDateActionPerformed

    private void btnLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseEntered
        setHoverColorDecline(btnLogOut);
        logoutBtn_over = true;
    }//GEN-LAST:event_btnLogOutMouseEntered

    private void btnLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseExited
        setResetColor(btnLogOut);
        logoutBtn_over = false;
    }//GEN-LAST:event_btnLogOutMouseExited

    private void btnLogOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMousePressed
        setPressColor(btnLogOut);
    }//GEN-LAST:event_btnLogOutMousePressed

    private void btnLogOutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseReleased
        if (logoutBtn_over) {
            setHoverColorDecline(btnLogOut);
        }
        else
        {
            setResetColor(btnLogOut);
        }
    }//GEN-LAST:event_btnLogOutMouseReleased

    
    private void btnFinishMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMouseEntered
        setHoverColorConfirm(btnFinish);
        finishBtn_over = true;
    }//GEN-LAST:event_btnFinishMouseEntered

    private void btnFinishMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMouseExited
        setResetColor(btnFinish);
        finishBtn_over = false;
    }//GEN-LAST:event_btnFinishMouseExited

    private void btnFinishMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMousePressed
        setPressColor(btnFinish);
    }//GEN-LAST:event_btnFinishMousePressed

    private void btnFinishMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMouseReleased
        if (finishBtn_over) {
            setHoverColorConfirm(btnFinish);
        }
        else
        {
            setResetColor(btnFinish);
        }
    }//GEN-LAST:event_btnFinishMouseReleased

    
    private void btnPostponeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPostponeMouseEntered
        setHoverColor(btnPostpone);
        postponeBtn_over = true;
    }//GEN-LAST:event_btnPostponeMouseEntered

    private void btnPostponeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPostponeMouseExited
        setResetColor(btnPostpone);
        postponeBtn_over = false;
    }//GEN-LAST:event_btnPostponeMouseExited

    private void btnPostponeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPostponeMousePressed
        setPressColor(btnPostpone);
    }//GEN-LAST:event_btnPostponeMousePressed

    private void btnPostponeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPostponeMouseReleased
        if (postponeBtn_over) {
            setHoverColor(btnPostpone);
        }
        else
        {
            setResetColor(btnPostpone);
        }
    }//GEN-LAST:event_btnPostponeMouseReleased

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
    private void setHoverColorDecline(javax.swing.JButton b) {
        b.setBackground(new Color(153,0,0));
    }
    private boolean finishBtn_over;
    private boolean logoutBtn_over;
    private boolean postponeBtn_over;
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
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateError;
    private javax.swing.JLabel DateErrorMissing;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPostpone;
    private javax.swing.JLabel encouraging;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTableF;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbName;
    private javax.swing.JTextField txtEndDate;
    // End of variables declaration//GEN-END:variables
}
