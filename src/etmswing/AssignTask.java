package etmswing;

import static etmswing.MainETM.Formicon;
import java.awt.Image;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.*;
//import static etmswing.MainETM.empsList;
import static etmswing.MainETM.*;
import java.awt.Color;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class AssignTask extends javax.swing.JFrame {

    private DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-M-d");
    String TaskTitle, AssignDate, EndDate, Descrption, PriorityString;
    int Priority;
    boolean SameTitle = false, PriorityLimit = false, AssignAfterEnd = false, AssignBeforeNow = false;
    LocalDate LocalDateAssignDate, localDateEndDate;
    LocalDate now = LocalDate.now();
    /**
     * Creates new form Test
     */
    String key;

    public AssignTask(String PassedKey) {
        key = PassedKey;
        initComponents();
        
        Image icon=new ImageIcon(this.getClass().getResource(Formicon)).getImage();
          this.setIconImage(icon);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add_btn = new javax.swing.JButton();
        TaskTittle_fld = new javax.swing.JTextField();
        Priority_fld = new javax.swing.JTextField();
        AssignDate_fld = new javax.swing.JTextField();
        EndDate_fld = new javax.swing.JTextField();
        TaskTItle_lbl = new javax.swing.JLabel();
        Priority_lbl = new javax.swing.JLabel();
        AssignDate_lbl = new javax.swing.JLabel();
        EndDate_lbl = new javax.swing.JLabel();
        Description_lbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Description_fld = new javax.swing.JTextField();
        TitleDublicateWarning_lbl = new javax.swing.JLabel();
        PriorityWarning_lbl = new javax.swing.JLabel();
        DescriptionWarning_lbl = new javax.swing.JLabel();
        AssignDateWarning_lbl = new javax.swing.JLabel();
        EndDateWarning_lbl = new javax.swing.JLabel();
        BackDashboard_btn = new javax.swing.JButton();
        priority_logo = new javax.swing.JLabel();
        endDate_logo = new javax.swing.JLabel();
        assignDate_logo = new javax.swing.JLabel();
        taskTitle_logo = new javax.swing.JLabel();
        description_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assign Task ");
        setMinimumSize(new java.awt.Dimension(705, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Add_btn.setBackground(new java.awt.Color(51, 51, 51));
        Add_btn.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        Add_btn.setForeground(new java.awt.Color(204, 204, 204));
        Add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        Add_btn.setText("Add");
        Add_btn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        Add_btn.setFocusPainted(false);
        Add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Add_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Add_btnMouseReleased(evt);
            }
        });
        Add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 230, 34));

        TaskTittle_fld.setBackground(new java.awt.Color(80, 80, 80));
        TaskTittle_fld.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        TaskTittle_fld.setForeground(new java.awt.Color(204, 204, 204));
        TaskTittle_fld.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        TaskTittle_fld.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(TaskTittle_fld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 230, 30));

        Priority_fld.setBackground(new java.awt.Color(80, 80, 80));
        Priority_fld.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        Priority_fld.setForeground(new java.awt.Color(204, 204, 204));
        Priority_fld.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        getContentPane().add(Priority_fld, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 230, 30));

        AssignDate_fld.setBackground(new java.awt.Color(80, 80, 80));
        AssignDate_fld.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        AssignDate_fld.setForeground(new java.awt.Color(204, 204, 204));
        AssignDate_fld.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        AssignDate_fld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignDate_fldActionPerformed(evt);
            }
        });
        getContentPane().add(AssignDate_fld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 230, 30));

        EndDate_fld.setBackground(new java.awt.Color(80, 80, 80));
        EndDate_fld.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        EndDate_fld.setForeground(new java.awt.Color(204, 204, 204));
        EndDate_fld.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        EndDate_fld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndDate_fldActionPerformed(evt);
            }
        });
        getContentPane().add(EndDate_fld, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 230, 30));

        TaskTItle_lbl.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        TaskTItle_lbl.setForeground(new java.awt.Color(204, 204, 204));
        TaskTItle_lbl.setText("Task Title");
        getContentPane().add(TaskTItle_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 30));

        Priority_lbl.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        Priority_lbl.setForeground(new java.awt.Color(204, 204, 204));
        Priority_lbl.setText("Priority");
        getContentPane().add(Priority_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 230, 30));

        AssignDate_lbl.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        AssignDate_lbl.setForeground(new java.awt.Color(204, 204, 204));
        AssignDate_lbl.setText("Assign Date");
        getContentPane().add(AssignDate_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 230, 30));

        EndDate_lbl.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        EndDate_lbl.setForeground(new java.awt.Color(204, 204, 204));
        EndDate_lbl.setText("End Date");
        getContentPane().add(EndDate_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 230, 30));

        Description_lbl.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        Description_lbl.setForeground(new java.awt.Color(204, 204, 204));
        Description_lbl.setText("Description");
        getContentPane().add(Description_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 590, 30));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/information_list_36.png"))); // NOI18N
        jLabel6.setText("Task Inforamtion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 420, 84));

        Description_fld.setBackground(new java.awt.Color(80, 80, 80));
        Description_fld.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        Description_fld.setForeground(new java.awt.Color(204, 204, 204));
        Description_fld.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        Description_fld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Description_fldActionPerformed(evt);
            }
        });
        getContentPane().add(Description_fld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 590, 30));

        TitleDublicateWarning_lbl.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        TitleDublicateWarning_lbl.setForeground(new java.awt.Color(153, 0, 0));
        TitleDublicateWarning_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(TitleDublicateWarning_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 230, 30));

        PriorityWarning_lbl.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        PriorityWarning_lbl.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(PriorityWarning_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 230, 30));

        DescriptionWarning_lbl.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        DescriptionWarning_lbl.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(DescriptionWarning_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 590, 30));

        AssignDateWarning_lbl.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        AssignDateWarning_lbl.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(AssignDateWarning_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 230, 30));

        EndDateWarning_lbl.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        EndDateWarning_lbl.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(EndDateWarning_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 230, 30));

        BackDashboard_btn.setBackground(new java.awt.Color(51, 51, 51));
        BackDashboard_btn.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        BackDashboard_btn.setForeground(new java.awt.Color(204, 204, 204));
        BackDashboard_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        BackDashboard_btn.setText("Back to Dashboard");
        BackDashboard_btn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        BackDashboard_btn.setFocusPainted(false);
        BackDashboard_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackDashboard_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackDashboard_btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackDashboard_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BackDashboard_btnMouseReleased(evt);
            }
        });
        BackDashboard_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackDashboard_btnActionPerformed(evt);
            }
        });
        getContentPane().add(BackDashboard_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 230, 34));

        priority_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priority_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/priority_30.png"))); // NOI18N
        getContentPane().add(priority_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 40, 30));

        endDate_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30.png"))); // NOI18N
        getContentPane().add(endDate_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 40, 30));

        assignDate_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30.png"))); // NOI18N
        getContentPane().add(assignDate_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 40, 30));

        taskTitle_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taskTitle_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tag_left2_30.png"))); // NOI18N
        getContentPane().add(taskTitle_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 40, 30));

        description_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        description_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document_30.png"))); // NOI18N
        getContentPane().add(description_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 40, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(705, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(705, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(705, 600));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EndDate_fldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndDate_fldActionPerformed
        // TODO add your handling code here:
        EndDate = EndDate_fld.getText().toString();
    }//GEN-LAST:event_EndDate_fldActionPerformed

    private void AssignDate_fldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignDate_fldActionPerformed
        // TODO add your handling code here:
        AssignDate = AssignDate_fld.getText().toString();
    }//GEN-LAST:event_AssignDate_fldActionPerformed

    private void Description_fldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Description_fldActionPerformed
        // TODO add your handling code here:
        Descrption = Description_fld.getText();
    }//GEN-LAST:event_Description_fldActionPerformed

    private void Add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_btnActionPerformed
        // TODO add your handling code here:
        Descrption = Description_fld.getText(); //isn't that redundunt with line 279? and so on...
        TaskTitle = TaskTittle_fld.getText();
        PriorityString = Priority_fld.getText();
        AssignDate = AssignDate_fld.getText().toString();
        EndDate = EndDate_fld.getText().toString();

        PriorityWarning_lbl.setText("");
        TitleDublicateWarning_lbl.setText("");
        DescriptionWarning_lbl.setText("");
        AssignDateWarning_lbl.setText("");
        EndDateWarning_lbl.setText("");
        
        SameTitle = false;
        AssignAfterEnd = false;
        PriorityLimit = false;
        AssignBeforeNow = false;
        
        // check if any field is empty 
        if (Descrption.equals("") || TaskTitle.equals("") || PriorityString.equals("") || AssignDate.equals("") || EndDate.equals("")) {
            if (Descrption.equals("")) {
                DescriptionWarning_lbl.setText("Descrption Field is required");
                description_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document_30_decline.png")));
            }
            else
            {
                description_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document_30_confirm.png")));
            }
            if (TaskTitle.equals("")) {
                TitleDublicateWarning_lbl.setText("Task Title Field is required");
                taskTitle_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tag_left2_30_decline.png")));
            }
            else
            {
                taskTitle_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tag_left2_30.png")));
            }
            if (AssignDate.equals("")) {
                AssignDateWarning_lbl.setText("Assign Date Field is required");
                assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));
            }
            else
            {
                assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30.png")));
            }
            if (EndDate.equals("")) {
                EndDateWarning_lbl.setText("End Date Field is required");
                endDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));
            }
            else
            {
                endDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30.png")));
            }
            if (PriorityString.equals("")) {
                PriorityWarning_lbl.setText("Priority Field is required");
                priority_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/priority_30_decline.png")));
            }
            else
            {
                priority_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/priority_30.png")));
            }
            return;
        }
        //-----------------------------------------------------------------------------------------------------//
        int k = -1;
        try {
            Priority = Integer.parseInt(PriorityString);
            PriorityLimit = false;
            if (Priority > 10 || Priority < 1) {// Prioroty Checker between 1 to 10---> in case priority is integer 
                PriorityWarning_lbl.setText("Priority Should be Between 1 : 10");
                Priority_fld.setText("");
                PriorityLimit = true;
                System.out.println("in priority check");
                priority_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/priority_30_decline.png")));
            }
            else
            {
                priority_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/priority_30_confirm.png")));
            }
            
            k = 0; // k = 0 if assign date  isn't  in date formate  
            LocalDateAssignDate = LocalDate.parse(AssignDate, dateFormat);
            AssignBeforeNow = false;
            if (LocalDateAssignDate.isBefore(now)) {
                AssignBeforeNow = true;
                assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));
                showMessageDialog(this, "Assign Date Before Today's Date !", "Alert", WARNING_MESSAGE);
                AssignDate_fld.setText("");
            }
            else
            {
                assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_confirm.png")));
            }
            
            k = 1;
            localDateEndDate = LocalDate.parse(EndDate, dateFormat);
            AssignAfterEnd = false;
            if (!AssignBeforeNow) {
                if (LocalDateAssignDate.isAfter(localDateEndDate)) {//check if localDate >endDate.
                    AssignDate_fld.setText("");
                    EndDate_fld.setText("");
                    AssignAfterEnd = true;
                    assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));
                    endDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));
                    showMessageDialog(this, "Assign Date greater than End Date!", "Alert", WARNING_MESSAGE);
                }
                else
                {
                    assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_confirm.png")));
                    endDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_confirm.png")));
                }
            }
            
            SameTitle = false;
            for (int i = 0; i < empsList.get(key).list.size(); i++) {
                if (TaskTitle.equals(empsList.get(key).list.get(i).title)) {
                    SameTitle = true; // check if the enterd task's title same as another task title.
                    break;
                }
            }
            //--------------------------------------------------------------------//
            if (SameTitle) {// check if entered task has the same title with another task
                TaskTittle_fld.setText("");
                TitleDublicateWarning_lbl.setText("This Task is Already Exist");
                taskTitle_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tag_left2_30_decline.png")));
                showMessageDialog(this, "This Task Already Exist", "Alert", WARNING_MESSAGE);
            }
            else
            {
                taskTitle_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tag_left2_30_confirm.png")));
            }
            
            if (!(SameTitle || AssignAfterEnd || PriorityLimit || AssignBeforeNow)) {
                addTask();
            }
            // all above code in case all input correct  
            //-------------------------------------------------------------------------------//

            // in case priority not in a number format
        } catch (NumberFormatException e1) {
            Priority_fld.setText("");
            PriorityWarning_lbl.setText("Priority Must Be an Integer Number");
                priority_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/priority_30_decline.png")));
            ///start new try catch mode here
            try {
                k = 0;
                LocalDateAssignDate = LocalDate.parse(AssignDate, dateFormat);
                AssignBeforeNow = false;
                if (LocalDateAssignDate.isBefore(now)) {
                    AssignBeforeNow = true;
                    showMessageDialog(this, "Assign Date Before Today's Date !", "Alert", WARNING_MESSAGE);
                    AssignDate_fld.setText("");
                    assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));
                }
                else
                {
                    assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_confirm.png")));
                }
                k = 1;
                localDateEndDate = LocalDate.parse(EndDate, dateFormat);
                if (!AssignBeforeNow) {
                    if (LocalDateAssignDate.isAfter(localDateEndDate)) {//check if localDate >endDate.
                        AssignDate_fld.setText("");
                        EndDate_fld.setText("");
                        AssignAfterEnd = true;
                        assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));
                        endDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));
                        showMessageDialog(this, "Assign Date greater than End Date!", "Alert", WARNING_MESSAGE);
                    }
                    else
                    {
                        assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_confirm.png")));
                        endDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_confirm.png")));
                    }
                }
            } catch (DateTimeParseException e2) {
                if (k == 0) {
                    AssignDateWarning_lbl.setText("Must Be in  Date Format (Year-Month-Day)");
                    AssignDate_fld.setText("");
                    assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));
                    try {
                        localDateEndDate = LocalDate.parse(EndDate, dateFormat);

                    } catch (DateTimeParseException e3) {
                        EndDateWarning_lbl.setText(" Must Be in  Date Format (Year-Month-Day) ");//here assign date and end date are fucked
                        EndDate_fld.setText("");
                        endDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));
                    }
                } else {
                    EndDateWarning_lbl.setText(" Must Be in  Date Format (Year-Month-Day) ");//here end date are fucked
                    EndDate_fld.setText("");
                    endDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));
                }
            }
        } catch (DateTimeParseException E) {
            if (k == 0) {
                AssignDateWarning_lbl.setText("Must Be in  Date Format (Year-Month-Day)");
                AssignDate_fld.setText("");
                assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));
                try {
                    localDateEndDate = LocalDate.parse(EndDate, dateFormat);
                } catch (DateTimeParseException e3) {
                    EndDateWarning_lbl.setText(" Must Be in  Date Format (Year-Month-Day) ");//here assign date and end date are fucked
                    EndDate_fld.setText("");
                    endDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));
                }
            } else {
                EndDateWarning_lbl.setText(" Must Be in  Date Format (Year-Month-Day) ");//here end date are fucked
                EndDate_fld.setText("");
                endDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_decline.png")));

            }
        }
    }//GEN-LAST:event_Add_btnActionPerformed

    private void BackDashboard_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackDashboard_btnActionPerformed
        // TODO add your handling code here:
        ManagerForm BackManagerForm = new ManagerForm(); //call new form
        BackManagerForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackDashboard_btnActionPerformed

    private void Add_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_btnMouseEntered
        setHoverColorConfirm(Add_btn);
        addBtn_over = true;
    }//GEN-LAST:event_Add_btnMouseEntered

    private void Add_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_btnMouseExited
        setResetColor(Add_btn);
        addBtn_over = false;
    }//GEN-LAST:event_Add_btnMouseExited

    private void Add_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_btnMousePressed
        setPressColor(Add_btn);
    }//GEN-LAST:event_Add_btnMousePressed

    private void Add_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_btnMouseReleased
        if (addBtn_over) {
            setHoverColorConfirm(Add_btn);
        }
        else
        {
            setResetColor(Add_btn);
        }
    }//GEN-LAST:event_Add_btnMouseReleased

    private void BackDashboard_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackDashboard_btnMouseEntered
        setHoverColor(BackDashboard_btn);
        backBtn_over = true;
    }//GEN-LAST:event_BackDashboard_btnMouseEntered

    private void BackDashboard_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackDashboard_btnMouseExited
        setResetColor(BackDashboard_btn);
        backBtn_over = false;
    }//GEN-LAST:event_BackDashboard_btnMouseExited

    private void BackDashboard_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackDashboard_btnMousePressed
        setPressColor(BackDashboard_btn);
    }//GEN-LAST:event_BackDashboard_btnMousePressed

    private void BackDashboard_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackDashboard_btnMouseReleased
        if (backBtn_over) {
            setHoverColor(BackDashboard_btn);
        }
        else
        {
            setResetColor(BackDashboard_btn);
        }
    }//GEN-LAST:event_BackDashboard_btnMouseReleased

    private void checkSameTitle() {
        for (int i = 0; i < empsList.get(key).list.size(); i++) {
            if (TaskTitle.equals(empsList.get(key).list.get(i).title)) {
                SameTitle = true; // check if the enterd task's title same as another task title.
                showMessageDialog(this, "This Task Already Exist", "Alert", WARNING_MESSAGE);
                break;
            }
        }
    }

    private void addTask() {
        Task t = new Task(TaskTitle, Descrption, Priority, AssignDate, EndDate);
        empsList.get(key).addTask(t);
        taskTitle_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tag_left2_30_confirm.png")));
        priority_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/priority_30_confirm.png")));
        assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_confirm.png")));
        endDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30_confirm.png")));
        description_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document_30_confirm.png")));
        showMessageDialog(this, "Task Add Successfully","Process Succeeded", JOptionPane.OK_OPTION, new javax.swing.ImageIcon(getClass().getResource("/icons/tick_ok_30_confirm.png")));
        taskTitle_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tag_left2_30.png")));
        priority_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/priority_30.png")));
        assignDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30.png")));
        endDate_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar_30.png")));
        description_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document_30.png")));
        Description_fld.setText("");
        TaskTittle_fld.setText("");
        Priority_fld.setText("");
        AssignDate_fld.setText("");
        EndDate_fld.setText("");
        PriorityWarning_lbl.setText("");
        TitleDublicateWarning_lbl.setText("");
        DescriptionWarning_lbl.setText("");
        AssignDateWarning_lbl.setText("");
        EndDateWarning_lbl.setText("");
        SameTitle = false;
        AssignAfterEnd = false;
        PriorityLimit = false;
        AssignBeforeNow = false;
        //convert String to LocalDate
    }

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
            java.util.logging.Logger.getLogger(AssignTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignTask(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_btn;
    private javax.swing.JLabel AssignDateWarning_lbl;
    private javax.swing.JTextField AssignDate_fld;
    private javax.swing.JLabel AssignDate_lbl;
    private javax.swing.JButton BackDashboard_btn;
    private javax.swing.JLabel DescriptionWarning_lbl;
    private javax.swing.JTextField Description_fld;
    private javax.swing.JLabel Description_lbl;
    private javax.swing.JLabel EndDateWarning_lbl;
    private javax.swing.JTextField EndDate_fld;
    private javax.swing.JLabel EndDate_lbl;
    private javax.swing.JLabel PriorityWarning_lbl;
    private javax.swing.JTextField Priority_fld;
    private javax.swing.JLabel Priority_lbl;
    private javax.swing.JLabel TaskTItle_lbl;
    private javax.swing.JTextField TaskTittle_fld;
    private javax.swing.JLabel TitleDublicateWarning_lbl;
    private javax.swing.JLabel assignDate_logo;
    private javax.swing.JLabel description_logo;
    private javax.swing.JLabel endDate_logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel priority_logo;
    private javax.swing.JLabel taskTitle_logo;
    // End of variables declaration//GEN-END:variables
}
