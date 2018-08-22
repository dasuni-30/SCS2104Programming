//Package
package file;

//Imports
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        FrontPane.setBackground(new Color(255,255,255,150));
        setDate(); 
    }
    
    //Close Window
    public void close(){
        WindowEvent winClose=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }
     //Display the Date and Time
    public void setDate(){
            ActionListener actionDate=new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Date myDate=new Date();
                    DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
                      
                    DateLabel.setText(df.format(myDate));
                    TimeLabel.setText(myDate.getHours()+":"+myDate.getMinutes()+":"+myDate.getSeconds());
                }
            };
     new javax.swing.Timer(0,actionDate).start();                 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrontPane = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        LogoImage = new javax.swing.JLabel();
        Admin = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        NumberOfStudents = new javax.swing.JLabel();
        NumberOfLecturers = new javax.swing.JLabel();
        Rank = new javax.swing.JLabel();
        Students = new javax.swing.JLabel();
        Lect = new javax.swing.JLabel();
        BottomLabel = new javax.swing.JLabel();
        Instructors = new javax.swing.JLabel();
        NumberOfInstructors = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        SidePane = new javax.swing.JLayeredPane();
        Mark = new javax.swing.JLabel();
        Labs = new javax.swing.JLabel();
        Payment = new javax.swing.JLabel();
        Log = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Name4 = new javax.swing.JLabel();
        BackImage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        StudentMenu = new javax.swing.JMenu();
        CourseMenu = new javax.swing.JMenu();
        SubjectMenu = new javax.swing.JMenu();
        LecturerMenu = new javax.swing.JMenu();
        InstructorMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NSBM Green University");
        setMinimumSize(new java.awt.Dimension(610, 530));
        getContentPane().setLayout(null);

        Title.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 153, 102));
        Title.setText("NSBM Green university");

        Title1.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        Title1.setForeground(new java.awt.Color(102, 102, 102));
        Title1.setText("COURSE ENROLLMENT SYSTEM");

        LogoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoNSBMUni.png"))); // NOI18N
        LogoImage.setToolTipText("");

        Admin.setFont(new java.awt.Font("Raleway SemiBold", 1, 14)); // NOI18N
        Admin.setForeground(new java.awt.Color(102, 102, 102));
        Admin.setText("Admin : Dasuni Geeganage");

        Username.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(102, 102, 102));
        Username.setText("University Rank : ");

        NumberOfStudents.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        NumberOfStudents.setForeground(new java.awt.Color(102, 102, 102));
        NumberOfStudents.setText("Number of students :");

        NumberOfLecturers.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        NumberOfLecturers.setForeground(new java.awt.Color(102, 102, 102));
        NumberOfLecturers.setText("Number of lectueres :");

        Rank.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Rank.setForeground(new java.awt.Color(102, 102, 102));
        Rank.setText("02");

        Students.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Students.setForeground(new java.awt.Color(102, 102, 102));
        Students.setText("50");

        Lect.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Lect.setForeground(new java.awt.Color(102, 102, 102));
        Lect.setText("20");

        BottomLabel.setBackground(new java.awt.Color(0, 153, 102));
        BottomLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Instructors.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Instructors.setForeground(new java.awt.Color(102, 102, 102));
        Instructors.setText("10");

        NumberOfInstructors.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        NumberOfInstructors.setForeground(new java.awt.Color(102, 102, 102));
        NumberOfInstructors.setText("Number of lnstructors :");

        Date.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(0, 153, 102));
        Date.setText("Date :");
        Date.setOpaque(true);

        Time.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        Time.setForeground(new java.awt.Color(0, 153, 102));
        Time.setText("Time :");
        Time.setOpaque(true);

        TimeLabel.setBackground(new java.awt.Color(255, 255, 255));
        TimeLabel.setFont(new java.awt.Font("Raleway Medium", 1, 18)); // NOI18N
        TimeLabel.setForeground(new java.awt.Color(102, 102, 102));
        TimeLabel.setOpaque(true);

        DateLabel.setBackground(new java.awt.Color(255, 255, 255));
        DateLabel.setFont(new java.awt.Font("Raleway Medium", 1, 18)); // NOI18N
        DateLabel.setForeground(new java.awt.Color(102, 102, 102));
        DateLabel.setOpaque(true);

        SidePane.setOpaque(true);

        Mark.setBackground(new java.awt.Color(255, 255, 255));
        Mark.setFont(new java.awt.Font("Raleway", 1, 10)); // NOI18N
        Mark.setForeground(new java.awt.Color(0, 153, 102));
        Mark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file.png"))); // NOI18N
        Mark.setText("MARKS");
        Mark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MarkMouseClicked(evt);
            }
        });

        Labs.setBackground(new java.awt.Color(255, 255, 255));
        Labs.setFont(new java.awt.Font("Raleway", 1, 10)); // NOI18N
        Labs.setForeground(new java.awt.Color(0, 153, 102));
        Labs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lab.png"))); // NOI18N
        Labs.setText("LABS");
        Labs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabsMouseClicked(evt);
            }
        });

        Payment.setFont(new java.awt.Font("Raleway", 1, 10)); // NOI18N
        Payment.setForeground(new java.awt.Color(0, 153, 102));
        Payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/money.png"))); // NOI18N
        Payment.setText("PAYMENT");
        Payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaymentMouseClicked(evt);
            }
        });

        SidePane.setLayer(Mark, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SidePane.setLayer(Labs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SidePane.setLayer(Payment, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout SidePaneLayout = new javax.swing.GroupLayout(SidePane);
        SidePane.setLayout(SidePaneLayout);
        SidePaneLayout.setHorizontalGroup(
            SidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
            .addGroup(SidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SidePaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(SidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Labs)
                        .addComponent(Mark)
                        .addComponent(Payment))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        SidePaneLayout.setVerticalGroup(
            SidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(SidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SidePaneLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(Mark)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Labs)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Payment)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Log.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        Log.setForeground(new java.awt.Color(0, 153, 102));
        Log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        Log.setText("Logout");
        Log.setOpaque(false);
        Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/email.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        Name4.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        Name4.setForeground(new java.awt.Color(0, 153, 102));
        Name4.setText("Email");

        javax.swing.GroupLayout FrontPaneLayout = new javax.swing.GroupLayout(FrontPane);
        FrontPane.setLayout(FrontPaneLayout);
        FrontPaneLayout.setHorizontalGroup(
            FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BottomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FrontPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrontPaneLayout.createSequentialGroup()
                        .addComponent(LogoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrontPaneLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(Title))
                            .addGroup(FrontPaneLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(Admin))
                            .addGroup(FrontPaneLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FrontPaneLayout.createSequentialGroup()
                                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Username)
                                            .addComponent(NumberOfStudents)
                                            .addComponent(NumberOfLecturers)
                                            .addComponent(NumberOfInstructors))
                                        .addGap(31, 31, 31)
                                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Students)
                                            .addComponent(Rank)
                                            .addComponent(Lect)
                                            .addComponent(Instructors)))
                                    .addComponent(Title1)))))
                    .addGroup(FrontPaneLayout.createSequentialGroup()
                        .addComponent(Date)
                        .addGap(18, 18, 18)
                        .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Time)
                        .addGap(18, 18, 18)
                        .addComponent(TimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                        .addComponent(Name4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(766, 766, 766))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SidePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Log, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(784, 784, 784))))
        );
        FrontPaneLayout.setVerticalGroup(
            FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrontPaneLayout.createSequentialGroup()
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FrontPaneLayout.createSequentialGroup()
                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrontPaneLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(LogoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrontPaneLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(Title)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Admin)
                                .addGap(37, 37, 37)
                                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Username)
                                    .addComponent(Rank))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NumberOfStudents)
                                    .addComponent(Students))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NumberOfLecturers)
                                    .addComponent(Lect))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Instructors)
                                    .addComponent(NumberOfInstructors))))
                        .addGap(82, 82, 82)
                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Date)
                            .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Time)
                            .addComponent(TimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FrontPaneLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                                .addComponent(Name4)
                                .addGap(9, 9, 9)))
                        .addGap(18, 18, 18)
                        .addComponent(SidePane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(Log, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BottomLabel))
        );

        getContentPane().add(FrontPane);
        FrontPane.setBounds(0, 0, 600, 320);

        BackImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        BackImage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        getContentPane().add(BackImage);
        BackImage.setBounds(0, 75, 600, 330);

        jMenuBar1.setBorder(null);
        jMenuBar1.setEnabled(false);
        jMenuBar1.setFont(new java.awt.Font("Raleway", 1, 8)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(600, 79));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(600, 79));

        StudentMenu.setBorder(null);
        StudentMenu.setForeground(new java.awt.Color(0, 153, 102));
        StudentMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/woman.png"))); // NOI18N
        StudentMenu.setText("STUDENT");
        StudentMenu.setFont(new java.awt.Font("Raleway", 1, 10)); // NOI18N
        StudentMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                StudentMenuMouseMoved(evt);
            }
        });
        StudentMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(StudentMenu);

        CourseMenu.setForeground(new java.awt.Color(0, 153, 102));
        CourseMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/presentation.png"))); // NOI18N
        CourseMenu.setText("COURSE");
        CourseMenu.setFont(new java.awt.Font("Raleway", 1, 10)); // NOI18N
        CourseMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourseMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(CourseMenu);

        SubjectMenu.setForeground(new java.awt.Color(0, 153, 102));
        SubjectMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book.png"))); // NOI18N
        SubjectMenu.setText("SUBJECT");
        SubjectMenu.setFont(new java.awt.Font("Raleway", 1, 10)); // NOI18N
        SubjectMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubjectMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(SubjectMenu);

        LecturerMenu.setForeground(new java.awt.Color(0, 153, 102));
        LecturerMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/man.png"))); // NOI18N
        LecturerMenu.setText("LECTURER");
        LecturerMenu.setFont(new java.awt.Font("Raleway", 1, 10)); // NOI18N
        LecturerMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LecturerMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(LecturerMenu);

        InstructorMenu.setForeground(new java.awt.Color(0, 153, 102));
        InstructorMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/people.png"))); // NOI18N
        InstructorMenu.setText("INSTRUCTOR");
        InstructorMenu.setFont(new java.awt.Font("Raleway", 1, 10)); // NOI18N
        InstructorMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InstructorMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(InstructorMenu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StudentMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentMenuMouseClicked
        close();
        StudentForm sForm=new StudentForm();
        sForm.setVisible(true);
    }//GEN-LAST:event_StudentMenuMouseClicked

    private void LecturerMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LecturerMenuMouseClicked
        close();
        LecturerForm lForm=new LecturerForm();
        lForm.setVisible(true);
    }//GEN-LAST:event_LecturerMenuMouseClicked

    private void InstructorMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InstructorMenuMouseClicked
        close();
        InstructorForm iForm=new InstructorForm();
        iForm.setVisible(true);
    }//GEN-LAST:event_InstructorMenuMouseClicked

    private void SubjectMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubjectMenuMouseClicked
        close();
        SubjectForm sForm=new SubjectForm();
        sForm.setVisible(true);
    }//GEN-LAST:event_SubjectMenuMouseClicked

    private void StudentMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentMenuMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentMenuMouseMoved

    private void LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogActionPerformed
        close();
        NSBMFirst n=new NSBMFirst();
        n.setVisible(true);

    }//GEN-LAST:event_LogActionPerformed

    private void CourseMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourseMenuMouseClicked
        close();
        CourseForm cForm=new CourseForm();
        cForm.setVisible(true);
    }//GEN-LAST:event_CourseMenuMouseClicked

    private void LabsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabsMouseClicked
       close();
       LabForm lForm=new LabForm();
       lForm.setVisible(true);
    }//GEN-LAST:event_LabsMouseClicked

    private void MarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MarkMouseClicked
       close();
       MarksForm mForm=new MarksForm();
       mForm.setVisible(true);
    }//GEN-LAST:event_MarkMouseClicked

    private void PaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymentMouseClicked
       close();
       PaymentForm pForm=new PaymentForm();
       pForm.setVisible(true);
    }//GEN-LAST:event_PaymentMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       close();
       EmailReportForm eForm=new EmailReportForm();
       eForm.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin;
    private javax.swing.JLabel BackImage;
    private javax.swing.JLabel BottomLabel;
    private javax.swing.JMenu CourseMenu;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JPanel FrontPane;
    private javax.swing.JMenu InstructorMenu;
    private javax.swing.JLabel Instructors;
    private javax.swing.JLabel Labs;
    private javax.swing.JLabel Lect;
    private javax.swing.JMenu LecturerMenu;
    private javax.swing.JButton Log;
    private javax.swing.JLabel LogoImage;
    private javax.swing.JLabel Mark;
    private javax.swing.JLabel Name4;
    private javax.swing.JLabel NumberOfInstructors;
    private javax.swing.JLabel NumberOfLecturers;
    private javax.swing.JLabel NumberOfStudents;
    private javax.swing.JLabel Payment;
    private javax.swing.JLabel Rank;
    private javax.swing.JLayeredPane SidePane;
    private javax.swing.JMenu StudentMenu;
    private javax.swing.JLabel Students;
    private javax.swing.JMenu SubjectMenu;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
