package file;


import com.mysql.cj.protocol.Resultset;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
@author Dasuni Geeganage
 */

public class MarksForm extends javax.swing.JFrame {

    
    private static void setContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void close(){
        WindowEvent winClose=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }
    
    public MarksForm() {
        initComponents();
        FrontPane.setBackground(new Color(255,255,255,150));
        BackPane.setBackground(new Color(255,255,255,0));
        BackSmallPane.setBackground(new Color(255,255,255,150));
        FillStudent();
        FillSubject();

        
    }
    
    //Database Connection
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/university";
    Connection conn=null;
    PreparedStatement pst = null;
    Resultset rs = null;
    
   private void databaseConnect(){
       try{
            conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("CONNECTED");
            
        }
        
        catch(SQLException e){
            System.err.print(e);
        }
   }
   
   public void FillStudent(){
       try{
          databaseConnect();
          Statement stat=conn.createStatement();
          String SelectSql1="SELECT `s_id` FROM `student`";
          ResultSet rs=stat.executeQuery(SelectSql1);
          while(rs.next()){
              StudentComboBox.addItem(rs.getString("s_id"));
           
        }
          
       }
          
        catch(Exception e){
           System.out.println(e);
        }
    }
   
   public void FillSubject(){
       try{
          databaseConnect();
          Statement stat=conn.createStatement();
          String SelectSql1="SELECT `s_code`, `name` FROM `subject`";
          ResultSet rs1=stat.executeQuery(SelectSql1);
          while(rs1.next()){
              SubjectComboBox.addItem(rs1.getString("s_code"));
              
           
        }
          
       }
          
        catch(Exception e){
           System.out.println(e);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackPane = new javax.swing.JPanel();
        BackSmallPane = new javax.swing.JPanel();
        FrontPane = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        InstructorImage = new javax.swing.JLabel();
        AddInstructor = new javax.swing.JButton();
        ShowInstructor = new javax.swing.JButton();
        Home = new javax.swing.JLabel();
        ShowPane = new javax.swing.JPanel();
        ShowTitle1 = new javax.swing.JLabel();
        ShowId1 = new javax.swing.JLabel();
        ShowIdLabel1 = new javax.swing.JTextField();
        OkButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        showInstructorsPane = new javax.swing.JScrollPane();
        MarksTable = new javax.swing.JTable();
        Back2 = new javax.swing.JLabel();
        Home2 = new javax.swing.JLabel();
        AddInstructorPane = new javax.swing.JPanel();
        AddTitle = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        Room = new javax.swing.JLabel();
        Home3 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        Marks = new javax.swing.JLabel();
        MarksLabel = new javax.swing.JTextField();
        StudentComboBox = new javax.swing.JComboBox<>();
        SubjectComboBox = new javax.swing.JComboBox<>();
        SubjectLabel = new javax.swing.JTextField();
        TypeComboBox = new javax.swing.JComboBox<>();
        Type = new javax.swing.JLabel();
        BackImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 440));
        getContentPane().setLayout(null);

        BackPane.setMinimumSize(new java.awt.Dimension(600, 400));
        BackPane.setLayout(new java.awt.CardLayout());

        BackSmallPane.setMinimumSize(new java.awt.Dimension(400, 300));
        BackSmallPane.setPreferredSize(new java.awt.Dimension(400, 300));
        BackSmallPane.setLayout(new java.awt.CardLayout());

        FrontPane.setMaximumSize(new java.awt.Dimension(600, 400));
        FrontPane.setMinimumSize(new java.awt.Dimension(600, 400));
        FrontPane.setPreferredSize(new java.awt.Dimension(600, 400));

        Title.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 153, 102));
        Title.setText("MARKS");

        InstructorImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fileMid.jpg"))); // NOI18N

        AddInstructor.setBackground(new java.awt.Color(153, 153, 153));
        AddInstructor.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        AddInstructor.setForeground(new java.awt.Color(0, 153, 102));
        AddInstructor.setText("Add Marks");
        AddInstructor.setToolTipText("");
        AddInstructor.setActionCommand("New Instructor");
        AddInstructor.setBorder(null);
        AddInstructor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddInstructorMouseClicked(evt);
            }
        });
        AddInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddInstructorActionPerformed(evt);
            }
        });

        ShowInstructor.setBackground(new java.awt.Color(153, 153, 153));
        ShowInstructor.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        ShowInstructor.setForeground(new java.awt.Color(0, 153, 102));
        ShowInstructor.setText("View");
        ShowInstructor.setBorder(null);
        ShowInstructor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowInstructorMouseClicked(evt);
            }
        });
        ShowInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowInstructorActionPerformed(evt);
            }
        });

        Home.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Home.setForeground(new java.awt.Color(0, 153, 102));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home.setText("Home");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FrontPaneLayout = new javax.swing.GroupLayout(FrontPane);
        FrontPane.setLayout(FrontPaneLayout);
        FrontPaneLayout.setHorizontalGroup(
            FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrontPaneLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                        .addComponent(Home)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                        .addComponent(InstructorImage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ShowInstructor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddInstructor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123))))
        );
        FrontPaneLayout.setVerticalGroup(
            FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrontPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home)
                .addGap(53, 53, 53)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InstructorImage, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FrontPaneLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Title)
                        .addGap(32, 32, 32)
                        .addComponent(ShowInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(AddInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        BackSmallPane.add(FrontPane, "card2");

        ShowPane.setBackground(new java.awt.Color(204, 255, 204));
        ShowPane.setMaximumSize(new java.awt.Dimension(600, 400));
        ShowPane.setMinimumSize(new java.awt.Dimension(600, 400));
        ShowPane.setPreferredSize(new java.awt.Dimension(600, 400));

        ShowTitle1.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        ShowTitle1.setForeground(new java.awt.Color(0, 153, 102));
        ShowTitle1.setText("VIEW MARKS");

        ShowId1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        ShowId1.setForeground(new java.awt.Color(102, 102, 102));
        ShowId1.setText("Student Id :");

        ShowIdLabel1.setBorder(null);
        ShowIdLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowIdLabel1ActionPerformed(evt);
            }
        });

        OkButton1.setBackground(new java.awt.Color(153, 153, 153));
        OkButton1.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        OkButton1.setForeground(new java.awt.Color(0, 153, 102));
        OkButton1.setText("OK");
        OkButton1.setBorder(null);
        OkButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OkButton1MouseClicked(evt);
            }
        });
        OkButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );

        MarksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Subject ID", "Marks", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        showInstructorsPane.setViewportView(MarksTable);

        Back2.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Back2.setForeground(new java.awt.Color(0, 153, 102));
        Back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        Back2.setText("Back");
        Back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back2MouseClicked(evt);
            }
        });

        Home2.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Home2.setForeground(new java.awt.Color(0, 153, 102));
        Home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home2.setText("Home");
        Home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ShowPaneLayout = new javax.swing.GroupLayout(ShowPane);
        ShowPane.setLayout(ShowPaneLayout);
        ShowPaneLayout.setHorizontalGroup(
            ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowPaneLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(ShowTitle1)
                .addGap(125, 125, 125)
                .addComponent(Home2)
                .addGap(18, 18, 18)
                .addComponent(Back2))
            .addGroup(ShowPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowPaneLayout.createSequentialGroup()
                        .addComponent(showInstructorsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShowPaneLayout.createSequentialGroup()
                        .addComponent(ShowId1)
                        .addGap(97, 97, 97)
                        .addComponent(ShowIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OkButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        ShowPaneLayout.setVerticalGroup(
            ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ShowTitle1)
                    .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Back2)
                        .addComponent(Home2)))
                .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowPaneLayout.createSequentialGroup()
                        .addGap(18, 244, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShowPaneLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ShowPaneLayout.createSequentialGroup()
                                .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ShowIdLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ShowId1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(9, 9, 9))
                            .addComponent(OkButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showInstructorsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        BackSmallPane.add(ShowPane, "card3");

        BackPane.add(BackSmallPane, "card2");

        AddInstructorPane.setBackground(new java.awt.Color(204, 255, 204));
        AddInstructorPane.setMaximumSize(new java.awt.Dimension(600, 400));
        AddInstructorPane.setMinimumSize(new java.awt.Dimension(600, 400));
        AddInstructorPane.setPreferredSize(new java.awt.Dimension(600, 400));

        AddTitle.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        AddTitle.setForeground(new java.awt.Color(0, 153, 102));
        AddTitle.setText("ADD MARKS");

        Name.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(102, 102, 102));
        Name.setText("Student ID:");

        Submit.setBackground(new java.awt.Color(153, 153, 153));
        Submit.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        Submit.setForeground(new java.awt.Color(0, 153, 102));
        Submit.setText("Submit");
        Submit.setBorder(null);
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Room.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Room.setForeground(new java.awt.Color(102, 102, 102));
        Room.setText("Subject :");

        Home3.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Home3.setForeground(new java.awt.Color(0, 153, 102));
        Home3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home3.setText("Home");
        Home3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home3MouseClicked(evt);
            }
        });

        Back.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 153, 102));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        Marks.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Marks.setForeground(new java.awt.Color(102, 102, 102));
        Marks.setText("Marks :");

        MarksLabel.setBorder(null);
        MarksLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarksLabelActionPerformed(evt);
            }
        });

        StudentComboBox.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        StudentComboBox.setForeground(new java.awt.Color(102, 102, 102));
        StudentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentComboBoxActionPerformed(evt);
            }
        });

        SubjectComboBox.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        SubjectComboBox.setForeground(new java.awt.Color(102, 102, 102));
        SubjectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectComboBoxActionPerformed(evt);
            }
        });

        SubjectLabel.setBorder(null);
        SubjectLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectLabelActionPerformed(evt);
            }
        });

        TypeComboBox.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        TypeComboBox.setForeground(new java.awt.Color(102, 102, 102));
        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Final Exam", "Assignment" }));
        TypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeComboBoxActionPerformed(evt);
            }
        });

        Type.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Type.setForeground(new java.awt.Color(102, 102, 102));
        Type.setText("Type");

        javax.swing.GroupLayout AddInstructorPaneLayout = new javax.swing.GroupLayout(AddInstructorPane);
        AddInstructorPane.setLayout(AddInstructorPaneLayout);
        AddInstructorPaneLayout.setHorizontalGroup(
            AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddInstructorPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home3)
                .addGap(18, 18, 18)
                .addComponent(Back)
                .addGap(21, 21, 21))
            .addGroup(AddInstructorPaneLayout.createSequentialGroup()
                .addGroup(AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddInstructorPaneLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddInstructorPaneLayout.createSequentialGroup()
                                .addComponent(SubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SubjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddInstructorPaneLayout.createSequentialGroup()
                                .addGroup(AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddInstructorPaneLayout.createSequentialGroup()
                                            .addGroup(AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Room)
                                                .addComponent(Name))
                                            .addGap(50, 50, 50))
                                        .addGroup(AddInstructorPaneLayout.createSequentialGroup()
                                            .addComponent(Marks)
                                            .addGap(34, 34, 34)))
                                    .addGroup(AddInstructorPaneLayout.createSequentialGroup()
                                        .addComponent(Type)
                                        .addGap(89, 89, 89)))
                                .addGroup(AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TypeComboBox, 0, 171, Short.MAX_VALUE)
                                    .addGroup(AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(StudentComboBox, 0, 171, Short.MAX_VALUE)
                                        .addComponent(MarksLabel))))))
                    .addGroup(AddInstructorPaneLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(AddTitle)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        AddInstructorPaneLayout.setVerticalGroup(
            AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddInstructorPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Home3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(AddTitle)
                .addGap(29, 29, 29)
                .addGroup(AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(StudentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Marks, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddInstructorPaneLayout.createSequentialGroup()
                        .addGroup(AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Room)
                            .addComponent(SubjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(MarksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(AddInstructorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Type)
                    .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        BackPane.add(AddInstructorPane, "card3");

        getContentPane().add(BackPane);
        BackPane.setBounds(0, 0, 600, 400);

        BackImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        BackImage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        getContentPane().add(BackImage);
        BackImage.setBounds(0, 0, 600, 405);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void AddInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddInstructorActionPerformed
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();
        
        BackPane.add(AddInstructorPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_AddInstructorActionPerformed

    private void AddInstructorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddInstructorMouseClicked
        //ImageIcon click=new ImageIcon(getClass().getResource(""));
     
        //AddStudent.setIcon(null);
       
        
    }//GEN-LAST:event_AddInstructorMouseClicked

   
    private void ShowInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowInstructorActionPerformed
        BackSmallPane.removeAll();
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
        
        BackSmallPane.add(ShowPane);
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
    }//GEN-LAST:event_ShowInstructorActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_HomeMouseClicked

    private void ShowInstructorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowInstructorMouseClicked
        //DeleteStudent.setIcon(null);
        
    }//GEN-LAST:event_ShowInstructorMouseClicked

    private void ShowIdLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowIdLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowIdLabel1ActionPerformed

    private void OkButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OkButton1MouseClicked

    private void OkButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButton1ActionPerformed

        int id=Integer.parseInt(ShowIdLabel1.getText());
        databaseConnect();

       ArrayList<Marks> marksData= new ArrayList<>();
        
        try
        {
            String sql = "SELECT * FROM marks where s_id="+id+"";
            Statement stmt=conn.createStatement();
            
            ResultSet rS =stmt.executeQuery(sql);
            Marks input;
            
        
        while (rS.next())
        {
            input = new Marks();
            input.setStudentId(rS.getInt("s_id"));
            input.setS_code(rS.getInt("s_code"));
            input.setMark(rS.getInt("mark"));
            input.setType(rS.getString("type"));

            marksData.add(input);
 
        }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

        ArrayList<Marks> list = marksData;
        DefaultTableModel model = (DefaultTableModel)MarksTable.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[4];
        for (int i = 0; i < list.size(); i++)
        {
            
            row[0] = list.get(i).getStudentId();
            row[1] = list.get(i).getS_code();
            row[2] = list.get(i).getMark();
            row[3] = list.get(i).getType();
            model.addRow(row);
        }
    
    }//GEN-LAST:event_OkButton1ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

       databaseConnect();

        Marks m=new Marks();

            m.setStudentId(Integer.parseInt((String) StudentComboBox.getSelectedItem()));
            m.setS_code(Integer.parseInt((String) SubjectComboBox.getSelectedItem()));
            m.setMark(Integer.parseInt(MarksLabel.getText()));
            m.setType((String)TypeComboBox.getSelectedItem());

            try{
            String insert="INSERT INTO `marks`(`s_id`, `s_code`, `mark`, `type`) VALUES(?,?,?,?)";
            pst = conn.prepareStatement(insert);
            pst.setInt(1,m.getStudentId());
            pst.setInt(2,m.getS_code());
            pst.setInt(3,m.getMark());
            pst.setString(4,m.getType());
          
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this,"Data row is successfully inserted to the table .");
            }
        
            catch(SQLException e){
                System.err.print(e);
            }

    }//GEN-LAST:event_SubmitActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();
       
        FrontPane.setBackground(new Color(204,255,204));
        BackPane.add(FrontPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_BackMouseClicked

    private void Back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back2MouseClicked
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();
       
        FrontPane.setBackground(new Color(204,255,204));
        BackPane.add(FrontPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_Back2MouseClicked

    private void Home2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home2MouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_Home2MouseClicked

    private void Home3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home3MouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_Home3MouseClicked

    private void MarksLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarksLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarksLabelActionPerformed

    private void StudentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentComboBoxActionPerformed

    private void SubjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectComboBoxActionPerformed
        String s=(String) SubjectComboBox.getSelectedItem();

        try{
            Statement stat=conn.createStatement();
            String SelectSql2="SELECT `name` FROM `subject` where s_code="+s+"";

            ResultSet rs2=stat.executeQuery(SelectSql2);

            if(rs2.next()){
                SubjectLabel.setText((rs2.getString("name")));

            }

        }
        catch(SQLException e){
            System.err.print(e);
        }
    }//GEN-LAST:event_SubjectComboBoxActionPerformed

    private void SubjectLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubjectLabelActionPerformed

    private void TypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(MarksForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarksForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarksForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarksForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarksForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddInstructor;
    private javax.swing.JPanel AddInstructorPane;
    private javax.swing.JLabel AddTitle;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Back2;
    private javax.swing.JLabel BackImage;
    private javax.swing.JPanel BackPane;
    private javax.swing.JPanel BackSmallPane;
    private javax.swing.JPanel FrontPane;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home2;
    private javax.swing.JLabel Home3;
    private javax.swing.JLabel InstructorImage;
    private javax.swing.JLabel Marks;
    private javax.swing.JTextField MarksLabel;
    private javax.swing.JTable MarksTable;
    private javax.swing.JLabel Name;
    private javax.swing.JButton OkButton1;
    private javax.swing.JLabel Room;
    private javax.swing.JLabel ShowId1;
    public javax.swing.JTextField ShowIdLabel1;
    private javax.swing.JButton ShowInstructor;
    private javax.swing.JPanel ShowPane;
    private javax.swing.JLabel ShowTitle1;
    private javax.swing.JComboBox<String> StudentComboBox;
    private javax.swing.JComboBox<String> SubjectComboBox;
    private javax.swing.JTextField SubjectLabel;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Type;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane showInstructorsPane;
    // End of variables declaration//GEN-END:variables
}
