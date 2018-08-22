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



public class PaymentForm extends javax.swing.JFrame {

    
    private static void setContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void close(){
        WindowEvent winClose=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }
    
    public PaymentForm() {
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
   
//   public void FillSubect(){
//       try{
//          databaseConnect();
//          Statement stat=conn.createStatement();
//          String SelectSql="SELECT name, credit FROM `subject` where type='Optional' ";
//          ResultSet rs2=stat.executeQuery(SelectSql);
//          while(rs2.next()){
//              CourseComboBox1.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
//              CourseComboBox2.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
//              CourseComboBox3.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
//              CourseComboBox4.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
//              CourseComboBox5.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
//              CourseComboBox6.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
//              CourseComboBox7.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
//              CourseComboBox8.addItem(rs2.getString("name")+" - "+(rs2.getString("credit")));
//           
//          }
//          String SelectSql1="SELECT name, credit FROM `subject` where type='Main' ";
//          ResultSet rs3=stat.executeQuery(SelectSql1);
//          while(rs3.next()){
//              MainSub1.setText(rs3.getString("name")+" - "+(rs3.getString("credit")));
//           
//           
//          }
//         
//          
//          
//       }
//       
//       catch(Exception e){
//           System.out.println(e);
//       }
//   
//   
//   }
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackPane = new javax.swing.JPanel();
        BackSmallPane = new javax.swing.JPanel();
        FrontPane = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        SubjectImage = new javax.swing.JLabel();
        ViewPayment = new javax.swing.JButton();
        AddPayment = new javax.swing.JButton();
        Home = new javax.swing.JLabel();
        NewPaymentPane = new javax.swing.JPanel();
        AddTitle1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Submit1 = new javax.swing.JButton();
        CourseID = new javax.swing.JLabel();
        PaymentLabel = new javax.swing.JTextField();
        Home4 = new javax.swing.JLabel();
        Back1 = new javax.swing.JLabel();
        Credit = new javax.swing.JLabel();
        StudentComboBox = new javax.swing.JComboBox<>();
        SubjectComboBox = new javax.swing.JComboBox<>();
        SubjectLabel = new javax.swing.JTextField();
        ShowPane = new javax.swing.JPanel();
        ShowTitle1 = new javax.swing.JLabel();
        ShowId1 = new javax.swing.JLabel();
        ShowIdLabel1 = new javax.swing.JTextField();
        OkButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        showLecturersPane = new javax.swing.JScrollPane();
        PaymentTable = new javax.swing.JTable();
        Back2 = new javax.swing.JLabel();
        Home2 = new javax.swing.JLabel();
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
        Title.setText("PAYMENT");

        SubjectImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/moneyMid.jpg"))); // NOI18N

        ViewPayment.setBackground(new java.awt.Color(153, 153, 153));
        ViewPayment.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        ViewPayment.setForeground(new java.awt.Color(0, 153, 102));
        ViewPayment.setText("View");
        ViewPayment.setToolTipText("");
        ViewPayment.setActionCommand("New Instructor");
        ViewPayment.setBorder(null);
        ViewPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewPaymentMouseClicked(evt);
            }
        });
        ViewPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPaymentActionPerformed(evt);
            }
        });

        AddPayment.setBackground(new java.awt.Color(153, 153, 153));
        AddPayment.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        AddPayment.setForeground(new java.awt.Color(0, 153, 102));
        AddPayment.setText("Make Payment");
        AddPayment.setBorder(null);
        AddPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddPaymentMouseClicked(evt);
            }
        });
        AddPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPaymentActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                        .addComponent(Home)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                        .addComponent(SubjectImage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ViewPayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Title))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(32, 32, 32)
                        .addComponent(AddPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(ViewPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        BackSmallPane.add(FrontPane, "card2");

        NewPaymentPane.setBackground(new java.awt.Color(204, 255, 204));
        NewPaymentPane.setMaximumSize(new java.awt.Dimension(600, 400));
        NewPaymentPane.setMinimumSize(new java.awt.Dimension(600, 400));

        AddTitle1.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        AddTitle1.setForeground(new java.awt.Color(0, 153, 102));
        AddTitle1.setText("NEW PAYMENT");

        Name.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(102, 102, 102));
        Name.setText("Student ID :");

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
        CourseID.setText("Subject");

        PaymentLabel.setBorder(null);
        PaymentLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentLabelActionPerformed(evt);
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
        Credit.setText("Payment :");

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

        javax.swing.GroupLayout NewPaymentPaneLayout = new javax.swing.GroupLayout(NewPaymentPane);
        NewPaymentPane.setLayout(NewPaymentPaneLayout);
        NewPaymentPaneLayout.setHorizontalGroup(
            NewPaymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewPaymentPaneLayout.createSequentialGroup()
                .addContainerGap(439, Short.MAX_VALUE)
                .addComponent(Home4)
                .addGap(18, 18, 18)
                .addComponent(Back1)
                .addGap(21, 21, 21))
            .addGroup(NewPaymentPaneLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(AddTitle1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(NewPaymentPaneLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(NewPaymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NewPaymentPaneLayout.createSequentialGroup()
                        .addGroup(NewPaymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewPaymentPaneLayout.createSequentialGroup()
                                .addGroup(NewPaymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CourseID)
                                    .addComponent(Name))
                                .addGap(50, 50, 50))
                            .addGroup(NewPaymentPaneLayout.createSequentialGroup()
                                .addComponent(Credit)
                                .addGap(34, 34, 34)))
                        .addGroup(NewPaymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StudentComboBox, 0, 171, Short.MAX_VALUE)
                            .addComponent(PaymentLabel)
                            .addComponent(SubjectLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(154, 154, Short.MAX_VALUE))
            .addGroup(NewPaymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NewPaymentPaneLayout.createSequentialGroup()
                    .addGap(276, 276, 276)
                    .addComponent(SubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(281, Short.MAX_VALUE)))
        );
        NewPaymentPaneLayout.setVerticalGroup(
            NewPaymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewPaymentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewPaymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back1)
                    .addComponent(Home4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddTitle1)
                .addGap(36, 36, 36)
                .addGroup(NewPaymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(StudentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(NewPaymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseID)
                    .addComponent(SubjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(NewPaymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Credit)
                    .addComponent(PaymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(Submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(NewPaymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NewPaymentPaneLayout.createSequentialGroup()
                    .addGap(174, 174, 174)
                    .addComponent(SubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(202, Short.MAX_VALUE)))
        );

        BackSmallPane.add(NewPaymentPane, "card3");

        ShowPane.setBackground(new java.awt.Color(204, 255, 204));
        ShowPane.setMaximumSize(new java.awt.Dimension(600, 400));
        ShowPane.setMinimumSize(new java.awt.Dimension(600, 400));

        ShowTitle1.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        ShowTitle1.setForeground(new java.awt.Color(0, 153, 102));
        ShowTitle1.setText("VIEW PAYMENTS");

        ShowId1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        ShowId1.setForeground(new java.awt.Color(102, 102, 102));
        ShowId1.setText("Student ID");

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

        PaymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Course ID", "Payment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        showLecturersPane.setViewportView(PaymentTable);

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
                .addGap(87, 87, 87)
                .addComponent(Home2)
                .addGap(18, 18, 18)
                .addComponent(Back2))
            .addGroup(ShowPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showLecturersPane, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ShowPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ShowId1)
                .addGap(29, 29, 29)
                .addComponent(ShowIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OkButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(22, 22, 22)
                .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowId1)
                    .addComponent(OkButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShowPaneLayout.createSequentialGroup()
                        .addComponent(showLecturersPane, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 54, Short.MAX_VALUE))))
        );

        BackSmallPane.add(ShowPane, "card3");

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

   
   
    private void ViewPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewPaymentMouseClicked
        //ImageIcon click=new ImageIcon(getClass().getResource(""));

        //AddStudent.setIcon(null);

    }//GEN-LAST:event_ViewPaymentMouseClicked

    private void ViewPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPaymentActionPerformed
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();

        BackPane.add(ShowPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_ViewPaymentActionPerformed

    private void AddPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPaymentMouseClicked
        //DeleteStudent.setIcon(null);

    }//GEN-LAST:event_AddPaymentMouseClicked

    private void AddPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPaymentActionPerformed
       
        BackSmallPane.removeAll();
        BackSmallPane.repaint();
        BackSmallPane.revalidate();

        BackSmallPane.add(NewPaymentPane);
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
    }//GEN-LAST:event_AddPaymentActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_HomeMouseClicked

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed

        databaseConnect();

        Payment p=new Payment();

        p.setStudentId(Integer.parseInt((String) StudentComboBox.getSelectedItem()));
        p.setS_code(Integer.parseInt((String) SubjectComboBox.getSelectedItem()));
        p.setPayment(Double.parseDouble(PaymentLabel.getText()));    

        try{
            String insert="INSERT INTO `payment`(`s_id`, `s_code`, `paid`) VALUES(?,?,?)";
            pst = conn.prepareStatement(insert);
            pst.setInt(1,p.getStudentId());
            pst.setInt(2,(p.getS_code()));
            pst.setDouble(3,(p.getPayment()));

            

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this,"Data row is successfully inserted to the table .");
        }

        catch(SQLException e){
            System.err.print(e);
        }

    }//GEN-LAST:event_Submit1ActionPerformed

    private void PaymentLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentLabelActionPerformed

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

    private void StudentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentComboBoxActionPerformed

    private void ShowIdLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowIdLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowIdLabel1ActionPerformed

    private void OkButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OkButton1MouseClicked

    private void OkButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButton1ActionPerformed
        int id=Integer.parseInt(ShowIdLabel1.getText());
        databaseConnect();
        //System.out.println(id);
       ArrayList<Payment> paymentData= new ArrayList<>();
        
        try
        {
            String sql = "SELECT * FROM payment where s_id="+id+"";
            Statement stmt=conn.createStatement();
            //pst = conn.createStatement(sql);
            
            ResultSet rS =stmt.executeQuery(sql);
            Payment input;
            
        
        while (rS.next())
        {
            input = new Payment();
            input.setStudentId(rS.getInt("s_id"));
            input.setS_code(rS.getInt("s_code"));
            input.setPayment(rS.getDouble("paid"));

            paymentData.add(input);
 
        }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

        ArrayList<Payment> list = paymentData;
        DefaultTableModel model = (DefaultTableModel)PaymentTable.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[3];
        for (int i = 0; i < list.size(); i++)
        {
            
            row[0] = list.get(i).getStudentId();
            row[1] = list.get(i).getS_code();
            row[2] = list.get(i).getPayment();
          
            model.addRow(row);
        }
    }//GEN-LAST:event_OkButton1ActionPerformed

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

    private void SubjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectComboBoxActionPerformed
       String s=(String) SubjectComboBox.getSelectedItem();
        
       try{
          Statement stat=conn.createStatement();
          String SelectSql2="SELECT `fee`,`name` FROM `subject` where s_code="+s+"";
          
                    
          ResultSet rs2=stat.executeQuery(SelectSql2);
        
        if(rs2.next()){
            PaymentLabel.setText(rs2.getString("fee"));
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
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PaymentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPayment;
    private javax.swing.JLabel AddTitle1;
    private javax.swing.JLabel Back1;
    private javax.swing.JLabel Back2;
    private javax.swing.JLabel BackImage;
    private javax.swing.JPanel BackPane;
    private javax.swing.JPanel BackSmallPane;
    private javax.swing.JLabel CourseID;
    private javax.swing.JLabel Credit;
    private javax.swing.JPanel FrontPane;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home2;
    private javax.swing.JLabel Home4;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel NewPaymentPane;
    private javax.swing.JButton OkButton1;
    private javax.swing.JTextField PaymentLabel;
    private javax.swing.JTable PaymentTable;
    private javax.swing.JLabel ShowId1;
    public javax.swing.JTextField ShowIdLabel1;
    private javax.swing.JPanel ShowPane;
    private javax.swing.JLabel ShowTitle1;
    private javax.swing.JComboBox<String> StudentComboBox;
    private javax.swing.JComboBox<String> SubjectComboBox;
    private javax.swing.JLabel SubjectImage;
    private javax.swing.JTextField SubjectLabel;
    private javax.swing.JButton Submit1;
    private javax.swing.JLabel Title;
    private javax.swing.JButton ViewPayment;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane showLecturersPane;
    // End of variables declaration//GEN-END:variables
}
