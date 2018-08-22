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



public class SubjectForm extends javax.swing.JFrame {

    
    private static void setContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void close(){
        WindowEvent winClose=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }
    
    public SubjectForm() {
        initComponents();
        FrontPane.setBackground(new Color(255,255,255,150));
        BackPane.setBackground(new Color(255,255,255,0));
        BackSmallPane.setBackground(new Color(255,255,255,150));

        FillSubject();
        
        
    }
    
    //Database Connection
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/university";
    Connection conn=null;
    PreparedStatement pst,pst1 = null;
    ResultSet rs,rs1 = null;
    
    
   private void databaseConnect(){
       try{
            conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("CONNECTED");
            
        }
        
        catch(SQLException e){
            System.err.print(e);
        }
   }
   
   public void FillSubject(){
       try{
          databaseConnect();
          Statement stat=conn.createStatement();
          String SelectSql="SELECT name, credit FROM `subject` where type='Optional'";
          ResultSet rs2=stat.executeQuery(SelectSql);
          while(rs2.next()){
              CourseComboBox1.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
              CourseComboBox2.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
              CourseComboBox3.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
              CourseComboBox4.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
              CourseComboBox5.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
              CourseComboBox6.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
              CourseComboBox7.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
              CourseComboBox8.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));         
          }        
       }
       
       catch(SQLException e){
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
        SubjectImage = new javax.swing.JLabel();
        AddSubject = new javax.swing.JButton();
        DeleteSubject = new javax.swing.JButton();
        ShowSubject = new javax.swing.JButton();
        Home = new javax.swing.JLabel();
        AddSubjectPane = new javax.swing.JPanel();
        AddTitle = new javax.swing.JLabel();
        Home3 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        IDLabel = new javax.swing.JTextField();
        Sem1Pane = new javax.swing.JPanel();
        MainSubjects = new javax.swing.JLabel();
        MainSub1 = new javax.swing.JLabel();
        MainSub2 = new javax.swing.JLabel();
        MainSub3 = new javax.swing.JLabel();
        MainSub4 = new javax.swing.JLabel();
        Sem1 = new javax.swing.JLabel();
        MainSubjects3 = new javax.swing.JLabel();
        CourseComboBox1 = new javax.swing.JComboBox<>();
        CourseComboBox2 = new javax.swing.JComboBox<>();
        CourseComboBox3 = new javax.swing.JComboBox<>();
        CourseComboBox4 = new javax.swing.JComboBox<>();
        mainSem1Credit = new javax.swing.JTextField();
        optSem1Credit = new javax.swing.JTextField();
        Sem2Pane = new javax.swing.JPanel();
        MainSubjects1 = new javax.swing.JLabel();
        MainSub5 = new javax.swing.JLabel();
        MainSub6 = new javax.swing.JLabel();
        MainSub7 = new javax.swing.JLabel();
        MainSub8 = new javax.swing.JLabel();
        Sem2 = new javax.swing.JLabel();
        MainSubjects2 = new javax.swing.JLabel();
        CourseComboBox5 = new javax.swing.JComboBox<>();
        CourseComboBox6 = new javax.swing.JComboBox<>();
        CourseComboBox7 = new javax.swing.JComboBox<>();
        CourseComboBox8 = new javax.swing.JComboBox<>();
        mainSem2Credit = new javax.swing.JTextField();
        optSem2Credit = new javax.swing.JTextField();
        ID1 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        ID2 = new javax.swing.JLabel();
        totalCredits = new javax.swing.JTextField();
        Submit2 = new javax.swing.JButton();
        Submit3 = new javax.swing.JButton();
        AddNewSubjectPane = new javax.swing.JPanel();
        AddTitle1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        NameLabel = new javax.swing.JTextField();
        Submit1 = new javax.swing.JButton();
        CourseID = new javax.swing.JLabel();
        CourseIDLabel = new javax.swing.JTextField();
        Home4 = new javax.swing.JLabel();
        Back1 = new javax.swing.JLabel();
        Credit = new javax.swing.JLabel();
        CreditLabel = new javax.swing.JTextField();
        Fees = new javax.swing.JLabel();
        FeesLabel = new javax.swing.JTextField();
        TypeLabel = new javax.swing.JTextField();
        Type = new javax.swing.JLabel();
        SubjectIDLabel = new javax.swing.JTextField();
        Name1 = new javax.swing.JLabel();
        DeletePane = new javax.swing.JPanel();
        DeleteTitle = new javax.swing.JLabel();
        DeleteId = new javax.swing.JLabel();
        DeleteIdLabel = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        Back3 = new javax.swing.JLabel();
        Home1 = new javax.swing.JLabel();
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

        Title.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 153, 102));
        Title.setText("SUBJECTS");

        SubjectImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bookMid.jpg"))); // NOI18N

        AddSubject.setBackground(new java.awt.Color(153, 153, 153));
        AddSubject.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        AddSubject.setForeground(new java.awt.Color(0, 153, 102));
        AddSubject.setText("New Subject");
        AddSubject.setToolTipText("");
        AddSubject.setActionCommand("New Instructor");
        AddSubject.setBorder(null);
        AddSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddSubjectMouseClicked(evt);
            }
        });
        AddSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSubjectActionPerformed(evt);
            }
        });

        DeleteSubject.setBackground(new java.awt.Color(153, 153, 153));
        DeleteSubject.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        DeleteSubject.setForeground(new java.awt.Color(0, 153, 102));
        DeleteSubject.setText("Delete");
        DeleteSubject.setBorder(null);
        DeleteSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteSubjectMouseClicked(evt);
            }
        });
        DeleteSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSubjectActionPerformed(evt);
            }
        });

        ShowSubject.setBackground(new java.awt.Color(153, 153, 153));
        ShowSubject.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        ShowSubject.setForeground(new java.awt.Color(0, 153, 102));
        ShowSubject.setText("Select Subjects");
        ShowSubject.setBorder(null);
        ShowSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowSubjectMouseClicked(evt);
            }
        });
        ShowSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowSubjectActionPerformed(evt);
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
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                        .addComponent(Home)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                        .addComponent(SubjectImage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ShowSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddSubject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(FrontPaneLayout.createSequentialGroup()
                                .addComponent(Title)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(DeleteSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(120, 120, 120))))
        );
        FrontPaneLayout.setVerticalGroup(
            FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrontPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home)
                .addGap(53, 53, 53)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubjectImage, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FrontPaneLayout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(32, 32, 32)
                        .addComponent(ShowSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(AddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        BackSmallPane.add(FrontPane, "card2");

        AddSubjectPane.setBackground(new java.awt.Color(204, 255, 204));
        AddSubjectPane.setMaximumSize(new java.awt.Dimension(600, 400));
        AddSubjectPane.setMinimumSize(new java.awt.Dimension(600, 400));
        AddSubjectPane.setPreferredSize(new java.awt.Dimension(600, 400));

        AddTitle.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        AddTitle.setForeground(new java.awt.Color(0, 153, 102));
        AddTitle.setText("SELECT SUBJECTS");

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

        IDLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        IDLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDLabelActionPerformed(evt);
            }
        });

        Sem1Pane.setBackground(new java.awt.Color(255, 255, 255));
        Sem1Pane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        MainSubjects.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        MainSubjects.setForeground(new java.awt.Color(102, 102, 102));
        MainSubjects.setText("Main Subjects");

        MainSub1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        MainSub2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        MainSub3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        MainSub4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        Sem1.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        Sem1.setForeground(new java.awt.Color(0, 153, 102));
        Sem1.setText("Semester 01");

        MainSubjects3.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        MainSubjects3.setForeground(new java.awt.Color(102, 102, 102));
        MainSubjects3.setText("Optional Subjects");

        CourseComboBox1.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        CourseComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        CourseComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        CourseComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBox1ActionPerformed(evt);
            }
        });

        CourseComboBox2.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        CourseComboBox2.setForeground(new java.awt.Color(102, 102, 102));
        CourseComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        CourseComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBox2ActionPerformed(evt);
            }
        });

        CourseComboBox3.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        CourseComboBox3.setForeground(new java.awt.Color(102, 102, 102));
        CourseComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        CourseComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBox3ActionPerformed(evt);
            }
        });

        CourseComboBox4.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        CourseComboBox4.setForeground(new java.awt.Color(102, 102, 102));
        CourseComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        CourseComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBox4ActionPerformed(evt);
            }
        });

        mainSem1Credit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        mainSem1Credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainSem1CreditActionPerformed(evt);
            }
        });

        optSem1Credit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        optSem1Credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optSem1CreditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Sem1PaneLayout = new javax.swing.GroupLayout(Sem1Pane);
        Sem1Pane.setLayout(Sem1PaneLayout);
        Sem1PaneLayout.setHorizontalGroup(
            Sem1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sem1PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Sem1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sem1PaneLayout.createSequentialGroup()
                        .addComponent(CourseComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CourseComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Sem1PaneLayout.createSequentialGroup()
                        .addGroup(Sem1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sem1PaneLayout.createSequentialGroup()
                                .addComponent(CourseComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CourseComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Sem1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(Sem1PaneLayout.createSequentialGroup()
                                    .addComponent(MainSubjects3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(optSem1Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Sem1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Sem1PaneLayout.createSequentialGroup()
                                        .addComponent(MainSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MainSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Sem1PaneLayout.createSequentialGroup()
                                        .addComponent(MainSub4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MainSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sem1PaneLayout.createSequentialGroup()
                                        .addGroup(Sem1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MainSubjects)
                                            .addGroup(Sem1PaneLayout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(Sem1)))
                                        .addGap(30, 30, 30)
                                        .addComponent(mainSem1Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        Sem1PaneLayout.setVerticalGroup(
            Sem1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sem1PaneLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Sem1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Sem1PaneLayout.createSequentialGroup()
                        .addComponent(Sem1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MainSubjects))
                    .addComponent(mainSem1Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sem1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sem1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainSub4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Sem1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainSubjects3)
                    .addComponent(optSem1Credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Sem1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sem1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Sem2Pane.setBackground(new java.awt.Color(255, 255, 255));
        Sem2Pane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        Sem2Pane.setPreferredSize(new java.awt.Dimension(292, 211));

        MainSubjects1.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        MainSubjects1.setForeground(new java.awt.Color(102, 102, 102));
        MainSubjects1.setText("Main Subjects");

        MainSub5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        MainSub6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        MainSub7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        MainSub8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        Sem2.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        Sem2.setForeground(new java.awt.Color(0, 153, 102));
        Sem2.setText("Semester 02");

        MainSubjects2.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        MainSubjects2.setForeground(new java.awt.Color(102, 102, 102));
        MainSubjects2.setText("Optional Subjects");

        CourseComboBox5.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        CourseComboBox5.setForeground(new java.awt.Color(102, 102, 102));
        CourseComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        CourseComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBox5ActionPerformed(evt);
            }
        });

        CourseComboBox6.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        CourseComboBox6.setForeground(new java.awt.Color(102, 102, 102));
        CourseComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        CourseComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBox6ActionPerformed(evt);
            }
        });

        CourseComboBox7.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        CourseComboBox7.setForeground(new java.awt.Color(102, 102, 102));
        CourseComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        CourseComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBox7ActionPerformed(evt);
            }
        });

        CourseComboBox8.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        CourseComboBox8.setForeground(new java.awt.Color(102, 102, 102));
        CourseComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        CourseComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBox8ActionPerformed(evt);
            }
        });

        mainSem2Credit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        mainSem2Credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainSem2CreditActionPerformed(evt);
            }
        });

        optSem2Credit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        optSem2Credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optSem2CreditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Sem2PaneLayout = new javax.swing.GroupLayout(Sem2Pane);
        Sem2Pane.setLayout(Sem2PaneLayout);
        Sem2PaneLayout.setHorizontalGroup(
            Sem2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sem2PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Sem2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sem2PaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Sem2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sem2PaneLayout.createSequentialGroup()
                                .addGroup(Sem2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Sem2PaneLayout.createSequentialGroup()
                                        .addComponent(MainSub5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MainSub6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Sem2PaneLayout.createSequentialGroup()
                                        .addComponent(MainSub7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MainSub8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sem2PaneLayout.createSequentialGroup()
                                .addComponent(Sem2)
                                .addGap(90, 90, 90))))
                    .addGroup(Sem2PaneLayout.createSequentialGroup()
                        .addGroup(Sem2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sem2PaneLayout.createSequentialGroup()
                                .addComponent(MainSubjects1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mainSem2Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sem2PaneLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(Sem2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sem2PaneLayout.createSequentialGroup()
                                        .addComponent(CourseComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CourseComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sem2PaneLayout.createSequentialGroup()
                                        .addComponent(CourseComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CourseComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sem2PaneLayout.createSequentialGroup()
                                .addComponent(MainSubjects2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(optSem2Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        Sem2PaneLayout.setVerticalGroup(
            Sem2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sem2PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sem2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Sem2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sem2PaneLayout.createSequentialGroup()
                        .addComponent(MainSubjects1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Sem2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MainSub5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MainSub6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Sem2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MainSub7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MainSub8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Sem2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optSem2Credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MainSubjects2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Sem2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CourseComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Sem2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CourseComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mainSem2Credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ID1.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        ID1.setForeground(new java.awt.Color(102, 102, 102));
        ID1.setText("Student ID :");

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

        ID2.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        ID2.setForeground(new java.awt.Color(102, 102, 102));
        ID2.setText("Total Credits :");

        totalCredits.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        totalCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCreditsActionPerformed(evt);
            }
        });

        Submit2.setBackground(new java.awt.Color(153, 153, 153));
        Submit2.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        Submit2.setForeground(new java.awt.Color(0, 153, 102));
        Submit2.setText("OK");
        Submit2.setBorder(null);
        Submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit2ActionPerformed(evt);
            }
        });

        Submit3.setBackground(new java.awt.Color(153, 153, 153));
        Submit3.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        Submit3.setForeground(new java.awt.Color(0, 153, 102));
        Submit3.setText("Check");
        Submit3.setBorder(null);
        Submit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddSubjectPaneLayout = new javax.swing.GroupLayout(AddSubjectPane);
        AddSubjectPane.setLayout(AddSubjectPaneLayout);
        AddSubjectPaneLayout.setHorizontalGroup(
            AddSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSubjectPaneLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(AddSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSubjectPaneLayout.createSequentialGroup()
                        .addComponent(AddTitle)
                        .addGap(76, 76, 76)
                        .addComponent(Home3)
                        .addGap(18, 18, 18)
                        .addComponent(Back)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSubjectPaneLayout.createSequentialGroup()
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(AddSubjectPaneLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(AddSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddSubjectPaneLayout.createSequentialGroup()
                        .addComponent(ID1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Submit2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Sem1Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sem2Pane, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addGroup(AddSubjectPaneLayout.createSequentialGroup()
                        .addComponent(ID2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Submit3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        AddSubjectPaneLayout.setVerticalGroup(
            AddSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddSubjectPaneLayout.createSequentialGroup()
                .addGroup(AddSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddSubjectPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AddSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Back)
                            .addComponent(Home3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddSubjectPaneLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(AddTitle)))
                .addGap(18, 18, 18)
                .addGroup(AddSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ID1)
                        .addComponent(totalCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ID2)
                        .addComponent(Submit2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Submit3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IDLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Sem2Pane, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(Sem1Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        BackSmallPane.add(AddSubjectPane, "card3");

        AddNewSubjectPane.setBackground(new java.awt.Color(204, 255, 204));
        AddNewSubjectPane.setMaximumSize(new java.awt.Dimension(600, 400));
        AddNewSubjectPane.setMinimumSize(new java.awt.Dimension(600, 400));

        AddTitle1.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        AddTitle1.setForeground(new java.awt.Color(0, 153, 102));
        AddTitle1.setText("ADD NEW SUBJECTS");

        Name.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(102, 102, 102));
        Name.setText("Name :");

        NameLabel.setBorder(null);
        NameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameLabelActionPerformed(evt);
            }
        });

        Submit1.setBackground(new java.awt.Color(153, 153, 153));
        Submit1.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        Submit1.setForeground(new java.awt.Color(0, 153, 102));
        Submit1.setText("Submit");
        Submit1.setBorder(null);
        Submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit1ActionPerformed(evt);
            }
        });

        CourseID.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        CourseID.setForeground(new java.awt.Color(102, 102, 102));
        CourseID.setText("Course ID :");

        CourseIDLabel.setBorder(null);
        CourseIDLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseIDLabelActionPerformed(evt);
            }
        });

        Home4.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Home4.setForeground(new java.awt.Color(0, 153, 102));
        Home4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home4.setText("Home");
        Home4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home4MouseClicked(evt);
            }
        });

        Back1.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Back1.setForeground(new java.awt.Color(0, 153, 102));
        Back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        Back1.setText("Back");
        Back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back1MouseClicked(evt);
            }
        });

        Credit.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Credit.setForeground(new java.awt.Color(102, 102, 102));
        Credit.setText("Credit :");

        CreditLabel.setBorder(null);
        CreditLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditLabelActionPerformed(evt);
            }
        });

        Fees.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Fees.setForeground(new java.awt.Color(102, 102, 102));
        Fees.setText("Fees :");

        FeesLabel.setBorder(null);
        FeesLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeesLabelActionPerformed(evt);
            }
        });

        TypeLabel.setText("Optional");
        TypeLabel.setBorder(null);
        TypeLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeLabelActionPerformed(evt);
            }
        });

        Type.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Type.setForeground(new java.awt.Color(102, 102, 102));
        Type.setText("Type :");

        SubjectIDLabel.setBorder(null);
        SubjectIDLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectIDLabelActionPerformed(evt);
            }
        });

        Name1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Name1.setForeground(new java.awt.Color(102, 102, 102));
        Name1.setText("Subject ID :");

        javax.swing.GroupLayout AddNewSubjectPaneLayout = new javax.swing.GroupLayout(AddNewSubjectPane);
        AddNewSubjectPane.setLayout(AddNewSubjectPaneLayout);
        AddNewSubjectPaneLayout.setHorizontalGroup(
            AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNewSubjectPaneLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNewSubjectPaneLayout.createSequentialGroup()
                        .addComponent(AddTitle1)
                        .addGap(43, 43, 43)
                        .addComponent(Home4)
                        .addGap(18, 18, 18)
                        .addComponent(Back1)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNewSubjectPaneLayout.createSequentialGroup()
                        .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddNewSubjectPaneLayout.createSequentialGroup()
                                .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Type)
                                    .addComponent(Fees))
                                .addGap(80, 80, 80)
                                .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FeesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(AddNewSubjectPaneLayout.createSequentialGroup()
                                .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNewSubjectPaneLayout.createSequentialGroup()
                                        .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CourseID)
                                            .addComponent(Name))
                                        .addGap(50, 50, 50))
                                    .addGroup(AddNewSubjectPaneLayout.createSequentialGroup()
                                        .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Credit)
                                            .addComponent(Name1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CreditLabel)
                                    .addComponent(NameLabel)
                                    .addComponent(CourseIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SubjectIDLabel))))
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNewSubjectPaneLayout.createSequentialGroup()
                        .addComponent(Submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        AddNewSubjectPaneLayout.setVerticalGroup(
            AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewSubjectPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddNewSubjectPaneLayout.createSequentialGroup()
                        .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Back1)
                            .addComponent(Home4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNewSubjectPaneLayout.createSequentialGroup()
                        .addComponent(AddTitle1)
                        .addGap(26, 26, 26)))
                .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubjectIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Name)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Credit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNewSubjectPaneLayout.createSequentialGroup()
                        .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CourseIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseID))
                        .addGap(18, 18, 18)
                        .addComponent(CreditLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Fees)
                    .addComponent(FeesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddNewSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Type))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(Submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        BackSmallPane.add(AddNewSubjectPane, "card3");

        DeletePane.setBackground(new java.awt.Color(204, 255, 204));
        DeletePane.setMaximumSize(new java.awt.Dimension(600, 400));
        DeletePane.setMinimumSize(new java.awt.Dimension(600, 400));

        DeleteTitle.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        DeleteTitle.setForeground(new java.awt.Color(0, 153, 102));
        DeleteTitle.setText("DELETE SUBJECT");

        DeleteId.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        DeleteId.setForeground(new java.awt.Color(102, 102, 102));
        DeleteId.setText("Delete Id :");

        DeleteIdLabel.setBorder(null);
        DeleteIdLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteIdLabelActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(153, 153, 153));
        DeleteButton.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(0, 153, 102));
        DeleteButton.setText("OK");
        DeleteButton.setBorder(null);
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        Back3.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Back3.setForeground(new java.awt.Color(0, 153, 102));
        Back3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        Back3.setText("Back");
        Back3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back3MouseClicked(evt);
            }
        });

        Home1.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Home1.setForeground(new java.awt.Color(0, 153, 102));
        Home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home1.setText("Home");
        Home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DeletePaneLayout = new javax.swing.GroupLayout(DeletePane);
        DeletePane.setLayout(DeletePaneLayout);
        DeletePaneLayout.setHorizontalGroup(
            DeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeletePaneLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(DeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletePaneLayout.createSequentialGroup()
                        .addComponent(Home1)
                        .addGap(18, 18, 18)
                        .addComponent(Back3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletePaneLayout.createSequentialGroup()
                        .addGroup(DeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletePaneLayout.createSequentialGroup()
                                .addComponent(DeleteId)
                                .addGap(58, 58, 58)
                                .addComponent(DeleteIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(131, 131, 131))))
            .addGroup(DeletePaneLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(DeleteTitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DeletePaneLayout.setVerticalGroup(
            DeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletePaneLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(DeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back3)
                    .addComponent(Home1))
                .addGap(62, 62, 62)
                .addComponent(DeleteTitle)
                .addGap(65, 65, 65)
                .addGroup(DeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteId)
                    .addComponent(DeleteIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        BackSmallPane.add(DeletePane, "card5");

        BackPane.add(BackSmallPane, "card2");

        getContentPane().add(BackPane);
        BackPane.setBounds(0, 0, 600, 400);

        BackImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        BackImage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        getContentPane().add(BackImage);
        BackImage.setBounds(0, 0, 600, 405);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
   
    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();
       
        FrontPane.setBackground(new Color(204,255,204));
        BackPane.add(FrontPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_BackMouseClicked

    private void Home3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home3MouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_Home3MouseClicked

    private void IDLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDLabelActionPerformed

    private void CourseComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBox1ActionPerformed
//        String c=(String) CourseComboBox1.getSelectedItem();
//
//        if(c.equals("Bachelor Course")){
//            DetailPane.removeAll();
//            DetailPane.repaint();
//            DetailPane.revalidate();
//
//            DetailPane.add(UndergraduatePane);
//            DetailPane.repaint();
//            DetailPane.revalidate();
//        }
//        else if(c.equals("Master Course")){
//            DetailPane.removeAll();
//            DetailPane.repaint();
//            DetailPane.revalidate();
//
//            DetailPane.add(PostgraduatePane);
//            DetailPane.repaint();
//            DetailPane.revalidate();
//        }
    }//GEN-LAST:event_CourseComboBox1ActionPerformed

    private void CourseComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseComboBox2ActionPerformed

    private void CourseComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseComboBox3ActionPerformed

    private void CourseComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseComboBox4ActionPerformed

    private void CourseComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseComboBox5ActionPerformed

    private void CourseComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseComboBox6ActionPerformed

    private void CourseComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseComboBox7ActionPerformed

    private void CourseComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseComboBox8ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

        databaseConnect();
        String sql = "SELECT * FROM student WHERE s_id=?";
        String sql1 = "INSERT INTO student_subject (s_id, c_name, semester, subject1_main, subject2_main, subject3_main, subject4_main, subject1_op, subject2_op, subject3_op, subject4_op) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(IDLabel.getText()));
            rs = pst.executeQuery();
            if (rs.next())
            {
                if ("February Intake".equals(rs.getString("intake")))
                {
                    System.out.println("Feb");
                    pst1 = conn.prepareStatement(sql1);
                    pst1.setString(1, IDLabel.getText());
                    pst1.setString(2, rs.getString("course"));
                    pst1.setInt(3, 1);
                    pst1.setString(4, MainSub1.getText());
                    pst1.setString(5, MainSub2.getText());
                    pst1.setString(6, MainSub3.getText());
                    pst1.setString(7, MainSub4.getText());
                    pst1.setString(8, (String)CourseComboBox1.getSelectedItem());
                    pst1.setString(9, (String)CourseComboBox2.getSelectedItem());
                    pst1.setString(10,(String)CourseComboBox3.getSelectedItem());
                    pst1.setString(11,(String)CourseComboBox4.getSelectedItem()); 
                    pst1.execute();
                    
                    pst1 = conn.prepareStatement(sql1);
                    pst1.setString(1, IDLabel.getText());
                    pst1.setString(2, rs.getString("course"));
                    pst1.setInt(3, 2);
                    pst1.setString(4, MainSub5.getText());
                    pst1.setString(5, MainSub6.getText());
                    pst1.setString(6, MainSub7.getText());
                    pst1.setString(7, MainSub8.getText());
                    pst1.setString(8, (String)CourseComboBox5.getSelectedItem());
                    pst1.setString(9, (String)CourseComboBox6.getSelectedItem());
                    pst1.setString(10,(String)CourseComboBox7.getSelectedItem());
                    pst1.setString(11,(String)CourseComboBox8.getSelectedItem()); 
                    pst1.execute();
                }
                else if ("July Intake".equals(rs.getString("intake")))
                {
                    System.out.println("July");
                    pst1 = conn.prepareStatement(sql1);
                    pst1.setString(1, IDLabel.getText());
                    pst1.setString(2, rs.getString("course"));
                    pst1.setInt(3, 2);
                    pst1.setString(4, MainSub5.getText());
                    pst1.setString(5, MainSub6.getText());
                    pst1.setString(6, MainSub7.getText());
                    pst1.setString(7, MainSub8.getText());
                    pst1.setString(8, (String)CourseComboBox5.getSelectedItem());
                    pst1.setString(9, (String)CourseComboBox6.getSelectedItem());
                    pst1.setString(10,(String)CourseComboBox7.getSelectedItem());
                    pst1.setString(11,(String)CourseComboBox8.getSelectedItem()); 
                    pst1.execute();
                }
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void totalCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCreditsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalCreditsActionPerformed

    private void mainSem1CreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainSem1CreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainSem1CreditActionPerformed

    private void optSem1CreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optSem1CreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optSem1CreditActionPerformed

    private void mainSem2CreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainSem2CreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainSem2CreditActionPerformed

    private void optSem2CreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optSem2CreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optSem2CreditActionPerformed

    private void AddSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddSubjectMouseClicked
        //ImageIcon click=new ImageIcon(getClass().getResource(""));

        //AddStudent.setIcon(null);

    }//GEN-LAST:event_AddSubjectMouseClicked

    private void AddSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSubjectActionPerformed
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();

        BackPane.add(AddNewSubjectPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_AddSubjectActionPerformed

    private void DeleteSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteSubjectMouseClicked
        //DeleteStudent.setIcon(null);

    }//GEN-LAST:event_DeleteSubjectMouseClicked

    private void DeleteSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSubjectActionPerformed
        BackSmallPane.removeAll();
        BackSmallPane.repaint();
        BackSmallPane.revalidate();

        BackSmallPane.add(DeletePane);
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
    }//GEN-LAST:event_DeleteSubjectActionPerformed

    private void ShowSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowSubjectMouseClicked
        //DeleteStudent.setIcon(null);

    }//GEN-LAST:event_ShowSubjectMouseClicked

    private void ShowSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowSubjectActionPerformed
       
        BackSmallPane.removeAll();
        BackSmallPane.repaint();
        BackSmallPane.revalidate();

        BackSmallPane.add(AddSubjectPane);
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
    }//GEN-LAST:event_ShowSubjectActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_HomeMouseClicked

    private void NameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameLabelActionPerformed

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed

        databaseConnect();

        Subject s=new Subject();

        s.setName(NameLabel.getText());
        s.setC_code(Integer.parseInt(CourseIDLabel.getText()));
        s.setCredit(Integer.parseInt(CreditLabel.getText()));
        s.setType(TypeLabel.getText());
        s.setFee(Integer.parseInt(FeesLabel.getText()));

        try{
            String insert="INSERT INTO subject (name,c_code,credit,type,fee,s_code) VALUES(?,?,?,?,?,?)";
            pst = conn.prepareStatement(insert);
            pst.setString(1,s.getName());
            pst.setString(2,(Integer.toString(s.getC_code())));
            pst.setString(3,(Integer.toString(s.getCredit())));
            pst.setString(4,s.getType());
            pst.setString(5,(Integer.toString(s.getFee())));
            pst.setInt(6, Integer.parseInt(SubjectIDLabel.getText()));
            

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this,"Data row is successfully inserted to the table .");
        }

        catch(SQLException e){
            System.err.print(e);
        }

    }//GEN-LAST:event_Submit1ActionPerformed

    private void CourseIDLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseIDLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseIDLabelActionPerformed

    private void Home4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home4MouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_Home4MouseClicked

    private void Back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back1MouseClicked
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();

        FrontPane.setBackground(new Color(204,255,204));
        BackPane.add(FrontPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_Back1MouseClicked

    private void CreditLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditLabelActionPerformed

    private void FeesLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeesLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeesLabelActionPerformed

    private void TypeLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeLabelActionPerformed

    private void DeleteIdLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteIdLabelActionPerformed

    }//GEN-LAST:event_DeleteIdLabelActionPerformed

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int id=Integer.parseInt(DeleteIdLabel.getText());
        databaseConnect();

        try{

            String delete="DELETE FROM subject WHERE i_id="+id+"";
            pst = conn.prepareStatement(delete);

            pst.execute();
            JOptionPane.showMessageDialog(this,"Data row is deleted successfully.");
        }

        catch(SQLException e){
            System.err.print(e);
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void Back3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back3MouseClicked
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();

        FrontPane.setBackground(new Color(204,255,204));
        BackPane.add(FrontPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_Back3MouseClicked

    private void Home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home1MouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_Home1MouseClicked

    private void SubjectIDLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectIDLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubjectIDLabelActionPerformed

    private void Submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit2ActionPerformed
        int count = 0;
        int mainSem1 = 0;
        int mainSem2 = 0;
        int optSem1 = 0;
        int optSem2 = 0;
        String stu_id = IDLabel.getText();
        String sql = "SELECT course FROM student WHERE s_id=?";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, stu_id);
            rs = pst.executeQuery();
            if (rs.next())
            {
                String sql2 = "SELECT c_code FROM course WHERE name=?";
                pst1 = conn.prepareStatement(sql2);
                pst1.setString(1, rs.getString("course"));
                rs1 = pst1.executeQuery();
                if (rs1.next())
                {
                    
                    String sql3 = "SELECT * FROM subject WHERE c_code=? AND type='Main'";
                    pst1 = conn.prepareStatement(sql3);
                    pst1.setString(1, rs1.getString("c_code"));
                    rs1 = pst1.executeQuery();
                    while(rs1.next())
                    {
                        count++;
                        switch (count) {
                            case 1:
                                MainSub1.setText(rs1.getString("name")+" - "+rs1.getString("credit"));
                                mainSem1 += rs1.getInt("credit");
                                break;
                            case 2:
                                MainSub2.setText(rs1.getString("name")+" - "+rs1.getString("credit"));
                                mainSem1 += rs1.getInt("credit");
                                break;
                            case 3:
                                MainSub3.setText(rs1.getString("name")+" - "+rs1.getString("credit"));
                                mainSem1 += rs1.getInt("credit");
                                break;
                            case 4:
                                MainSub4.setText(rs1.getString("name"+" - "+rs1.getString("credit")));
                                mainSem1 += rs1.getInt("credit");
                                break;
                            case 5:
                                MainSub5.setText(rs1.getString("name")+" - "+rs1.getString("credit"));
                                mainSem2 += rs1.getInt("credit");
                                break;
                            case 6:
                                MainSub6.setText(rs1.getString("name")+" - "+rs1.getString("credit"));
                                mainSem2 += rs1.getInt("credit");
                                break;
                            case 7:
                                MainSub7.setText(rs1.getString("name")+" - "+rs1.getString("credit"));
                                mainSem2 += rs1.getInt("credit");
                                break;
                            case 8:
                                MainSub8.setText(rs1.getString("name")+" - "+rs1.getString("credit"));
                                mainSem2 += rs1.getInt("credit");
                                break; 
                            default:
                                break;
                        }
                    }
                }
            }
            mainSem1Credit.setText(Integer.toString(mainSem1));
            mainSem2Credit.setText(Integer.toString(mainSem2));
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_Submit2ActionPerformed

    private void Submit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit3ActionPerformed
        int optSem1 = 0;
        int optSem2 = 0;
        int total = 0;
        String sel1 = (String)CourseComboBox1.getSelectedItem();
        String sel2 = (String)CourseComboBox2.getSelectedItem();
        String sel3 = (String)CourseComboBox3.getSelectedItem();
        String sel4 = (String)CourseComboBox4.getSelectedItem();
        String sel5 = (String)CourseComboBox5.getSelectedItem();
        String sel6 = (String)CourseComboBox6.getSelectedItem();
        String sel7 = (String)CourseComboBox7.getSelectedItem();
        String sel8 = (String)CourseComboBox8.getSelectedItem();
        
        if (!sel1.equals("None"))
        {
            String[] selVal = sel1.split(" - ");
            int sel1Val = Integer.parseInt(selVal[1]);
            optSem1 += sel1Val;
        }
        if (!sel2.equals("None"))
        {
            String[] selVal = sel2.split(" - ");
            int sel2Val = Integer.parseInt(selVal[1]);
            optSem1 += sel2Val;
        }
        if (!sel3.equals("None"))
        {
            String[] selVal = sel3.split(" - ");
            int sel3Val = Integer.parseInt(selVal[1]);
            optSem1 += sel3Val;
        }
        if (!sel4.equals("None"))
        {
            String[] selVal = sel4.split(" - ");
            int sel4Val = Integer.parseInt(selVal[1]);
            optSem1 += sel4Val;
        }
        if (!sel5.equals("None"))
        {
            String[] selVal = sel5.split(" - ");
            int sel5Val = Integer.parseInt(selVal[1]);
            optSem2 += sel5Val;
        }
        if (!sel6.equals("None"))
        {
            String[] selVal = sel6.split(" - ");
            int sel6Val = Integer.parseInt(selVal[1]);
            optSem2 += sel6Val;
        }
        if (!sel7.equals("None"))
        {
            String[] selVal = sel7.split(" - ");
            int sel7Val = Integer.parseInt(selVal[1]);
            optSem2 += sel7Val;
        }
        if (!sel8.equals("None"))
        {
            String[] selVal = sel8.split(" - ");
            int sel8Val = Integer.parseInt(selVal[1]);
            optSem2 += sel8Val;
        } 
        optSem1Credit.setText(Integer.toString(optSem1));
        optSem2Credit.setText(Integer.toString(optSem2));
        total = optSem1 + optSem2 + Integer.parseInt(mainSem1Credit.getText()) + Integer.parseInt(mainSem2Credit.getText());
        totalCredits.setText(Integer.toString(total));
    }//GEN-LAST:event_Submit3ActionPerformed

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
            java.util.logging.Logger.getLogger(SubjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new SubjectForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddNewSubjectPane;
    private javax.swing.JButton AddSubject;
    private javax.swing.JPanel AddSubjectPane;
    private javax.swing.JLabel AddTitle;
    private javax.swing.JLabel AddTitle1;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Back1;
    private javax.swing.JLabel Back3;
    private javax.swing.JLabel BackImage;
    private javax.swing.JPanel BackPane;
    private javax.swing.JPanel BackSmallPane;
    private javax.swing.JComboBox<String> CourseComboBox1;
    private javax.swing.JComboBox<String> CourseComboBox2;
    private javax.swing.JComboBox<String> CourseComboBox3;
    private javax.swing.JComboBox<String> CourseComboBox4;
    private javax.swing.JComboBox<String> CourseComboBox5;
    private javax.swing.JComboBox<String> CourseComboBox6;
    private javax.swing.JComboBox<String> CourseComboBox7;
    private javax.swing.JComboBox<String> CourseComboBox8;
    private javax.swing.JLabel CourseID;
    private javax.swing.JTextField CourseIDLabel;
    private javax.swing.JLabel Credit;
    private javax.swing.JTextField CreditLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel DeleteId;
    public javax.swing.JTextField DeleteIdLabel;
    private javax.swing.JPanel DeletePane;
    private javax.swing.JButton DeleteSubject;
    private javax.swing.JLabel DeleteTitle;
    private javax.swing.JLabel Fees;
    public javax.swing.JTextField FeesLabel;
    private javax.swing.JPanel FrontPane;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home1;
    private javax.swing.JLabel Home3;
    private javax.swing.JLabel Home4;
    private javax.swing.JLabel ID1;
    private javax.swing.JLabel ID2;
    public javax.swing.JTextField IDLabel;
    private javax.swing.JLabel MainSub1;
    private javax.swing.JLabel MainSub2;
    private javax.swing.JLabel MainSub3;
    private javax.swing.JLabel MainSub4;
    private javax.swing.JLabel MainSub5;
    private javax.swing.JLabel MainSub6;
    private javax.swing.JLabel MainSub7;
    private javax.swing.JLabel MainSub8;
    private javax.swing.JLabel MainSubjects;
    private javax.swing.JLabel MainSubjects1;
    private javax.swing.JLabel MainSubjects2;
    private javax.swing.JLabel MainSubjects3;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    public javax.swing.JTextField NameLabel;
    private javax.swing.JLabel Sem1;
    private javax.swing.JPanel Sem1Pane;
    private javax.swing.JLabel Sem2;
    private javax.swing.JPanel Sem2Pane;
    private javax.swing.JButton ShowSubject;
    public javax.swing.JTextField SubjectIDLabel;
    private javax.swing.JLabel SubjectImage;
    private javax.swing.JButton Submit;
    private javax.swing.JButton Submit1;
    private javax.swing.JButton Submit2;
    private javax.swing.JButton Submit3;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Type;
    private javax.swing.JTextField TypeLabel;
    public javax.swing.JTextField mainSem1Credit;
    public javax.swing.JTextField mainSem2Credit;
    public javax.swing.JTextField optSem1Credit;
    public javax.swing.JTextField optSem2Credit;
    public javax.swing.JTextField totalCredits;
    // End of variables declaration//GEN-END:variables
}
