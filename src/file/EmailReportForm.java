//Package
package file;

//Imports
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
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

public class EmailReportForm extends javax.swing.JFrame {

    private static void setContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Close Window
    public void close(){
        WindowEvent winClose=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }
    
    public EmailReportForm() {
        initComponents();
        BackPane.setBackground(new Color(255,255,255,0));
        BackSmallPane.setBackground(new Color(255,255,255,150));
        ReportPane.setBackground(new Color(255,255,255,150));
        FillStudent();
        
    }
    private static String emailMsgTxt = "";
    private static String emailSubjectTxt = "";
    private static String emailFromAddress = "";
    // Add List of Email address to who email needs to be sent to
    private static String[] emailList = new String[10];

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
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackPane = new javax.swing.JPanel();
        BackSmallPane = new javax.swing.JPanel();
        ReportPane = new javax.swing.JPanel();
        AddTitle = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        NameLabel = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Room = new javax.swing.JLabel();
        Home3 = new javax.swing.JLabel();
        Name1 = new javax.swing.JLabel();
        Subject1 = new javax.swing.JLabel();
        MainSubjects = new javax.swing.JLabel();
        MainSubjects3 = new javax.swing.JLabel();
        Subject2 = new javax.swing.JLabel();
        Subject3 = new javax.swing.JLabel();
        Subject4 = new javax.swing.JLabel();
        Subject5 = new javax.swing.JLabel();
        Subject6 = new javax.swing.JLabel();
        Subject7 = new javax.swing.JLabel();
        Subject8 = new javax.swing.JLabel();
        StudentComboBox = new javax.swing.JComboBox<>();
        SemesterComboBox = new javax.swing.JComboBox<>();
        TotalLabel = new javax.swing.JTextField();
        Name2 = new javax.swing.JLabel();
        Name4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MainSubTextBox1 = new javax.swing.JTextField();
        MainSubTextBox2 = new javax.swing.JTextField();
        MainSubTextBox3 = new javax.swing.JTextField();
        MainSubTextBox4 = new javax.swing.JTextField();
        OpSubTextBox1 = new javax.swing.JTextField();
        OpSubTextBox2 = new javax.swing.JTextField();
        OpSubTextBox3 = new javax.swing.JTextField();
        OpSubTextBox4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtareaMessage = new javax.swing.JTextArea();
        Name5 = new javax.swing.JLabel();
        txtto = new javax.swing.JTextField();
        BackImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 440));
        getContentPane().setLayout(null);

        BackPane.setMinimumSize(new java.awt.Dimension(600, 400));
        BackPane.setLayout(new java.awt.CardLayout());

        BackSmallPane.setMinimumSize(new java.awt.Dimension(400, 300));
        BackSmallPane.setPreferredSize(new java.awt.Dimension(400, 300));
        BackSmallPane.setLayout(new java.awt.CardLayout());

        ReportPane.setBackground(new java.awt.Color(204, 255, 204));
        ReportPane.setMaximumSize(new java.awt.Dimension(600, 400));
        ReportPane.setMinimumSize(new java.awt.Dimension(600, 400));
        ReportPane.setPreferredSize(new java.awt.Dimension(600, 400));

        AddTitle.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        AddTitle.setForeground(new java.awt.Color(0, 153, 102));
        AddTitle.setText("STUDENT REPORT");

        Name.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(102, 102, 102));
        Name.setText("Name :");

        NameLabel.setBorder(null);
        NameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameLabelActionPerformed(evt);
            }
        });

        Submit.setBackground(new java.awt.Color(153, 153, 153));
        Submit.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        Submit.setForeground(new java.awt.Color(0, 153, 102));
        Submit.setText("OK");
        Submit.setBorder(null);
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Room.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Room.setForeground(new java.awt.Color(102, 102, 102));
        Room.setText("Semester :");

        Home3.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Home3.setForeground(new java.awt.Color(0, 153, 102));
        Home3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home3.setText("Home");
        Home3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home3MouseClicked(evt);
            }
        });

        Name1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Name1.setForeground(new java.awt.Color(102, 102, 102));
        Name1.setText("Student ID :");

        Subject1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject1.setForeground(new java.awt.Color(102, 102, 102));
        Subject1.setText("Subject 01 :");

        MainSubjects.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        MainSubjects.setForeground(new java.awt.Color(102, 102, 102));
        MainSubjects.setText("Main Subjects");

        MainSubjects3.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        MainSubjects3.setForeground(new java.awt.Color(102, 102, 102));
        MainSubjects3.setText("Optional Subjects");

        Subject2.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject2.setForeground(new java.awt.Color(102, 102, 102));
        Subject2.setText("Subject 02 :");

        Subject3.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject3.setForeground(new java.awt.Color(102, 102, 102));
        Subject3.setText("Subject 03 :");

        Subject4.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject4.setForeground(new java.awt.Color(102, 102, 102));
        Subject4.setText("Subject 04 :");

        Subject5.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject5.setForeground(new java.awt.Color(102, 102, 102));
        Subject5.setText("Subject 01 :");

        Subject6.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject6.setForeground(new java.awt.Color(102, 102, 102));
        Subject6.setText("Subject 02 :");

        Subject7.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject7.setForeground(new java.awt.Color(102, 102, 102));
        Subject7.setText("Subject 03 :");

        Subject8.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject8.setForeground(new java.awt.Color(102, 102, 102));
        Subject8.setText("Subject 04 :");

        StudentComboBox.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        StudentComboBox.setForeground(new java.awt.Color(102, 102, 102));
        StudentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentComboBoxActionPerformed(evt);
            }
        });

        SemesterComboBox.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        SemesterComboBox.setForeground(new java.awt.Color(102, 102, 102));
        SemesterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2" }));
        SemesterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemesterComboBoxActionPerformed(evt);
            }
        });

        TotalLabel.setBorder(null);
        TotalLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalLabelActionPerformed(evt);
            }
        });

        Name2.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Name2.setForeground(new java.awt.Color(102, 102, 102));
        Name2.setText("Total :");

        Name4.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        Name4.setForeground(new java.awt.Color(0, 153, 102));
        Name4.setText("Email Report ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/email.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        MainSubTextBox1.setBorder(null);
        MainSubTextBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainSubTextBox1ActionPerformed(evt);
            }
        });

        MainSubTextBox2.setBorder(null);
        MainSubTextBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainSubTextBox2ActionPerformed(evt);
            }
        });

        MainSubTextBox3.setBorder(null);
        MainSubTextBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainSubTextBox3ActionPerformed(evt);
            }
        });

        MainSubTextBox4.setBorder(null);
        MainSubTextBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainSubTextBox4ActionPerformed(evt);
            }
        });

        OpSubTextBox1.setBorder(null);
        OpSubTextBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpSubTextBox1ActionPerformed(evt);
            }
        });

        OpSubTextBox2.setBorder(null);
        OpSubTextBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpSubTextBox2ActionPerformed(evt);
            }
        });

        OpSubTextBox3.setBorder(null);
        OpSubTextBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpSubTextBox3ActionPerformed(evt);
            }
        });

        OpSubTextBox4.setBorder(null);
        OpSubTextBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpSubTextBox4ActionPerformed(evt);
            }
        });

        TxtareaMessage.setColumns(20);
        TxtareaMessage.setRows(5);
        jScrollPane1.setViewportView(TxtareaMessage);

        Name5.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Name5.setForeground(new java.awt.Color(102, 102, 102));
        Name5.setText("Email :");

        txtto.setBorder(null);
        txtto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReportPaneLayout = new javax.swing.GroupLayout(ReportPane);
        ReportPane.setLayout(ReportPaneLayout);
        ReportPaneLayout.setHorizontalGroup(
            ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportPaneLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportPaneLayout.createSequentialGroup()
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ReportPaneLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ReportPaneLayout.createSequentialGroup()
                                        .addComponent(MainSubjects)
                                        .addGap(149, 149, 149))
                                    .addGroup(ReportPaneLayout.createSequentialGroup()
                                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportPaneLayout.createSequentialGroup()
                                                .addComponent(Name2)
                                                .addGap(37, 37, 37))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportPaneLayout.createSequentialGroup()
                                                .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Subject1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(Subject2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(Subject3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(Subject4, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(MainSubTextBox4, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                            .addComponent(MainSubTextBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                            .addComponent(MainSubTextBox3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                            .addComponent(MainSubTextBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                            .addComponent(TotalLabel))
                                        .addGap(58, 58, 58))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReportPaneLayout.createSequentialGroup()
                                .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReportPaneLayout.createSequentialGroup()
                                        .addComponent(Room)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SemesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReportPaneLayout.createSequentialGroup()
                                        .addComponent(Name1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(StudentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReportPaneLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Name4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(91, 91, 91))
                            .addGroup(ReportPaneLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ReportPaneLayout.createSequentialGroup()
                                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ReportPaneLayout.createSequentialGroup()
                                                    .addGap(2, 2, 2)
                                                    .addComponent(Subject5))
                                                .addComponent(Subject6, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(Subject7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Subject8, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(OpSubTextBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(OpSubTextBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(OpSubTextBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(OpSubTextBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(MainSubjects3))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(ReportPaneLayout.createSequentialGroup()
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReportPaneLayout.createSequentialGroup()
                                .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ReportPaneLayout.createSequentialGroup()
                                        .addComponent(Name)
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ReportPaneLayout.createSequentialGroup()
                                        .addComponent(Name5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(111, 111, 111))
                            .addGroup(ReportPaneLayout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddTitle)
                        .addGap(173, 173, 173)
                        .addComponent(Home3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        ReportPaneLayout.setVerticalGroup(
            ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportPaneLayout.createSequentialGroup()
                .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportPaneLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(AddTitle))
                    .addComponent(Home3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportPaneLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name1)
                            .addComponent(Name4)
                            .addComponent(jLabel1)))
                    .addGroup(ReportPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StudentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportPaneLayout.createSequentialGroup()
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReportPaneLayout.createSequentialGroup()
                                .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Room)
                                    .addComponent(SemesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Name))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Name5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MainSubjects))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subject1)
                            .addComponent(MainSubTextBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subject2)
                            .addComponent(MainSubTextBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subject3)
                            .addComponent(MainSubTextBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subject4)
                            .addComponent(MainSubTextBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Name2)
                            .addComponent(TotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ReportPaneLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(MainSubjects3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subject5)
                            .addComponent(OpSubTextBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subject6)
                            .addComponent(OpSubTextBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subject7)
                            .addComponent(OpSubTextBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subject8)
                            .addComponent(OpSubTextBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        BackSmallPane.add(ReportPane, "card3");

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

   
   
    private void NameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameLabelActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        int id=Integer.parseInt((String)StudentComboBox.getSelectedItem());
        String sem=(String)SemesterComboBox.getSelectedItem();
        databaseConnect();
        try
        {
            String sql = "SELECT `firstName`, `lastName`, `email` FROM student where s_id="+id+"";
            Statement stmt=conn.createStatement();

            ResultSet rS =stmt.executeQuery(sql);    
        
        while (rS.next())
            {
            NameLabel.setText(rS.getString("firstName")+" "+(rS.getString("lastName")));
            txtto.setText(rS.getString("email"));
            
            //Display Report Content
            TxtareaMessage.setText("STUDENT REPORT \nStudent Id : "+id+" \nName : "+rS.getString("firstName")+" "+(rS.getString("lastName"))+"\n");
            
            }
            
            String sql4="SELECT `s_code` ,`mark` FROM `marks` WHERE s_id="+id+"";
            stmt=conn.createStatement();
            rS =stmt.executeQuery(sql4);  
            int total = 0;
            double average;

            while (rS.next())
            {
                TxtareaMessage.append(rS.getString("s_code")+" - "+rS.getString("mark")+"\n");
                total+=Integer.parseInt(rS.getString("mark"));
            }
            TxtareaMessage.append("Total : "+Integer.toString(total));
            TotalLabel.setText(Integer.toString(total));
            //Fill the subject textboxes
            if(sem.equals("Semester 1")){
                String sql2="SELECT `subject1_main`, `subject2_main`, `subject3_main`, `subject4_main`, `subject1_op`, `subject2_op`, `subject3_op`, `subject4_op` FROM `student_subject` WHERE semester=1";
                stmt=conn.createStatement();

                rS =stmt.executeQuery(sql2);    
        
                while (rS.next())
                {
                    MainSubTextBox1.setText(rS.getString("subject1_main"));
                    MainSubTextBox2.setText(rS.getString("subject2_main"));
                    MainSubTextBox3.setText(rS.getString("subject3_main"));
                    MainSubTextBox4.setText(rS.getString("subject4_main"));
                    OpSubTextBox1.setText(rS.getString("subject1_op"));
                    OpSubTextBox2.setText(rS.getString("subject2_op"));
                    OpSubTextBox3.setText(rS.getString("subject3_op"));
                    OpSubTextBox4.setText(rS.getString("subject4_op"));

                }
            
            }
            else if(sem.equals("Semester 2")){
                //Fill the subject textboxes
                String sql2="SELECT `subject1_main`, `subject2_main`, `subject3_main`, `subject4_main`, `subject1_op`, `subject2_op`, `subject3_op`, `subject4_op` FROM `student_subject` WHERE semester=2";
                stmt=conn.createStatement();

                rS =stmt.executeQuery(sql2);    
                while (rS.next())
                {
                    MainSubTextBox1.setText(rS.getString("subject1_main"));
                    MainSubTextBox2.setText(rS.getString("subject2_main"));
                    MainSubTextBox3.setText(rS.getString("subject3_main"));
                    MainSubTextBox4.setText(rS.getString("subject4_main"));
                    OpSubTextBox1.setText(rS.getString("subject1_op"));
                    OpSubTextBox2.setText(rS.getString("subject2_op"));
                    OpSubTextBox3.setText(rS.getString("subject3_op"));
                    OpSubTextBox4.setText(rS.getString("subject4_op"));

                }
            }
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_SubmitActionPerformed

    private void Home3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home3MouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_Home3MouseClicked

    private void StudentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentComboBoxActionPerformed

    private void SemesterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemesterComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemesterComboBoxActionPerformed

    private void TotalLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalLabelActionPerformed

    private void MainSubTextBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainSubTextBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainSubTextBox1ActionPerformed

    private void MainSubTextBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainSubTextBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainSubTextBox2ActionPerformed

    private void MainSubTextBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainSubTextBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainSubTextBox3ActionPerformed

    private void MainSubTextBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainSubTextBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainSubTextBox4ActionPerformed

    private void OpSubTextBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpSubTextBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpSubTextBox1ActionPerformed

    private void OpSubTextBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpSubTextBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpSubTextBox2ActionPerformed

    private void OpSubTextBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpSubTextBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpSubTextBox3ActionPerformed

    private void OpSubTextBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpSubTextBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpSubTextBox4ActionPerformed

    //To send the email
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        emailMsgTxt = TxtareaMessage.getText(); //Content of the email
        emailSubjectTxt = "Student Report";//Subject of the email
        emailFromAddress = SendMailUsingAuthentication.SMTP_AUTH_USER;

         //Add List of Email address to who email needs to be sent to
        StringBuffer sb = new StringBuffer(txtto.getText());
        StringTokenizer st = new StringTokenizer(txtto.getText());
        int i = 0;
        while (st.hasMoreTokens()) {
            emailList[i] = st.nextToken(",");
            System.err.println(emailList[i]);
            i++;
        }
        String emailReceipeint[] = new String[i];
        for (int j = 0; j < i; j++) {
            emailReceipeint[j] = emailList[j];
            
        }

        SendMailUsingAuthentication smtpMailSender = new SendMailUsingAuthentication();
        try {
            //Call the method to send email
            smtpMailSender.postMail(emailReceipeint, emailSubjectTxt, emailMsgTxt, emailFromAddress);
        } catch (MessagingException ex) {
            Logger.getLogger(EmailReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this,"Sucessfully Sent mail to All Users");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txttoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttoActionPerformed

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
            java.util.logging.Logger.getLogger(EmailReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmailReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmailReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmailReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EmailReportForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddTitle;
    private javax.swing.JLabel BackImage;
    private javax.swing.JPanel BackPane;
    private javax.swing.JPanel BackSmallPane;
    private javax.swing.JLabel Home3;
    public javax.swing.JTextField MainSubTextBox1;
    public javax.swing.JTextField MainSubTextBox2;
    public javax.swing.JTextField MainSubTextBox3;
    public javax.swing.JTextField MainSubTextBox4;
    private javax.swing.JLabel MainSubjects;
    private javax.swing.JLabel MainSubjects3;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name4;
    private javax.swing.JLabel Name5;
    public javax.swing.JTextField NameLabel;
    public javax.swing.JTextField OpSubTextBox1;
    public javax.swing.JTextField OpSubTextBox2;
    public javax.swing.JTextField OpSubTextBox3;
    public javax.swing.JTextField OpSubTextBox4;
    private javax.swing.JPanel ReportPane;
    private javax.swing.JLabel Room;
    private javax.swing.JComboBox<String> SemesterComboBox;
    private javax.swing.JComboBox<String> StudentComboBox;
    private javax.swing.JLabel Subject1;
    private javax.swing.JLabel Subject2;
    private javax.swing.JLabel Subject3;
    private javax.swing.JLabel Subject4;
    private javax.swing.JLabel Subject5;
    private javax.swing.JLabel Subject6;
    private javax.swing.JLabel Subject7;
    private javax.swing.JLabel Subject8;
    private javax.swing.JButton Submit;
    public javax.swing.JTextField TotalLabel;
    private javax.swing.JTextArea TxtareaMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtto;
    // End of variables declaration//GEN-END:variables
}
