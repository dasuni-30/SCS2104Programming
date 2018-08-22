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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class StudentForm extends javax.swing.JFrame {

    private static void setContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Close Window
    public void close(){
        WindowEvent winClose=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }
    
    public StudentForm() {
        initComponents();
        //To make a panel transparent
        FrontPane.setBackground(new Color(255,255,255,150));
        BackPane.setBackground(new Color(255,255,255,0));
        BackSmallPane.setBackground(new Color(255,255,255,150));
        
    }
    
    //Variables to connect database
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
   
   
   public ArrayList<Student> showStudentTable() //Display students in the table
   {
       databaseConnect();
       ArrayList<Student> studentData= new ArrayList<>();
        
        try
        {
            String sql = "SELECT * FROM student";
            Statement stmt=conn.createStatement();
            ResultSet rS =stmt.executeQuery(sql);
            Student input;
        
        while (rS.next())
        {
            input = new Student();//Create new student bject
            input.setStudentId(rS.getInt("s_id")); //Set values to student variables
            input.setNIC(rS.getString("NIC"));
            input.setFirstName(rS.getString("firstName"));
            input.setLastName(rS.getString("lastName"));
            input.setAge(rS.getInt("age"));
            input.setEmail(rS.getString("email"));
            input.setCity(rS.getString("city"));
            input.setFaculty(rS.getString("faculty"));
            input.setCourse(rS.getString("course"));
            input.setIntake(rS.getString("intake"));
            
            studentData.add(input);// Add student object to student object array
        }
        
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
       return studentData;
       
   }
   
   public void show_student() 
    {
        ArrayList<Student> list = showStudentTable();
        DefaultTableModel model = (DefaultTableModel)studentTable.getModel();//Fill Student table row by row
        model.setRowCount(0);
        
        Object[] row = new Object[10];
        for (int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getStudentId();
            row[1] = list.get(i).getNIC();
            row[2] = list.get(i).getFirstName();
            row[3] = list.get(i).getLastName();
            row[4] = list.get(i).getAge();
            row[5] = list.get(i).getEmail();
            row[6] = list.get(i).getCity();
            row[7] = list.get(i).getFaculty();
            row[8] = list.get(i).getCourse();
            row[9] = list.get(i).getIntake();
            model.addRow(row);
        }
    }
   
   public void FillStudent(){ 
       try{
          databaseConnect();
          Statement stat=conn.createStatement();
          String SelectSql1="SELECT `name` FROM `course`"; //Fill the Course combobox
          ResultSet rs=stat.executeQuery(SelectSql1);
          while(rs.next()){
              CourseComboBox1.addItem(rs.getString("name"));
           
          }

          String SelectSql="SELECT `name` FROM `faculty`"; //Fill the faculty combobox 
          ResultSet rs2=stat.executeQuery(SelectSql);
          while(rs2.next()){
              FacultyComboBox1.addItem(rs2.getString("name"));
           
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
        StudentImage = new javax.swing.JLabel();
        AddStudent = new javax.swing.JButton();
        DeleteStudent = new javax.swing.JButton();
        ShowStudent = new javax.swing.JButton();
        UpdateStudent = new javax.swing.JButton();
        Home = new javax.swing.JLabel();
        DeletePane = new javax.swing.JPanel();
        DeleteTitle = new javax.swing.JLabel();
        DeleteId = new javax.swing.JLabel();
        DeleteIdLabel = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        Back1 = new javax.swing.JLabel();
        Home1 = new javax.swing.JLabel();
        ShowPane = new javax.swing.JPanel();
        ShowTitle1 = new javax.swing.JLabel();
        ShowId1 = new javax.swing.JLabel();
        ShowIdLabel1 = new javax.swing.JTextField();
        OkButton1 = new javax.swing.JButton();
        StudentDetail1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        showStudentsPane = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        showStudentPane = new javax.swing.JScrollPane();
        studentTable1 = new javax.swing.JTable();
        Back2 = new javax.swing.JLabel();
        Home2 = new javax.swing.JLabel();
        UpdatePane = new javax.swing.JPanel();
        AddTitle1 = new javax.swing.JLabel();
        FacultyLabel = new javax.swing.JTextField();
        Firstname1 = new javax.swing.JLabel();
        FirstNameLabel1 = new javax.swing.JTextField();
        Submit1 = new javax.swing.JButton();
        Lastname1 = new javax.swing.JLabel();
        LastNameLabel1 = new javax.swing.JTextField();
        CityLabel1 = new javax.swing.JTextField();
        Age1 = new javax.swing.JLabel();
        AgeLabel1 = new javax.swing.JTextField();
        City1 = new javax.swing.JLabel();
        Faculty1 = new javax.swing.JLabel();
        Intake1 = new javax.swing.JLabel();
        Course1 = new javax.swing.JLabel();
        NIC1 = new javax.swing.JLabel();
        NICLabel1 = new javax.swing.JTextField();
        Home4 = new javax.swing.JLabel();
        Email1 = new javax.swing.JLabel();
        EmailLabel1 = new javax.swing.JTextField();
        DetailPane1 = new javax.swing.JPanel();
        UndergraduatePane1 = new javax.swing.JPanel();
        StreamLabel1 = new javax.swing.JTextField();
        Stream1 = new javax.swing.JLabel();
        Rank1 = new javax.swing.JLabel();
        RankLabel1 = new javax.swing.JTextField();
        Subject4 = new javax.swing.JLabel();
        Subject1Label1 = new javax.swing.JTextField();
        Subject5 = new javax.swing.JLabel();
        Subject2Label1 = new javax.swing.JTextField();
        Subject3Label1 = new javax.swing.JTextField();
        Subject6 = new javax.swing.JLabel();
        EnglishLabel1 = new javax.swing.JTextField();
        English1 = new javax.swing.JLabel();
        GKLabel1 = new javax.swing.JTextField();
        GK1 = new javax.swing.JLabel();
        PostgraduatePane1 = new javax.swing.JPanel();
        QualificationLabel1 = new javax.swing.JTextField();
        Qualification1 = new javax.swing.JLabel();
        Institute1 = new javax.swing.JLabel();
        InstituteLabel1 = new javax.swing.JTextField();
        YearLabel1 = new javax.swing.JTextField();
        Year1 = new javax.swing.JLabel();
        Back3 = new javax.swing.JLabel();
        CourseLabel = new javax.swing.JTextField();
        CourseLabel1 = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        IDLabel = new javax.swing.JTextField();
        Submit2 = new javax.swing.JButton();
        IntakeLabel = new javax.swing.JTextField();
        AddStudentPane = new javax.swing.JPanel();
        AddTitle = new javax.swing.JLabel();
        Firstname = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Lastname = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JTextField();
        CityLabel = new javax.swing.JTextField();
        Age = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JTextField();
        City = new javax.swing.JLabel();
        Faculty = new javax.swing.JLabel();
        FacultyComboBox1 = new javax.swing.JComboBox<>();
        Intake = new javax.swing.JLabel();
        IntakeComboBox1 = new javax.swing.JComboBox<>();
        Course = new javax.swing.JLabel();
        CourseComboBox1 = new javax.swing.JComboBox<>();
        NIC = new javax.swing.JLabel();
        NICLabel = new javax.swing.JTextField();
        Home3 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JTextField();
        DetailPane = new javax.swing.JPanel();
        UndergraduatePane = new javax.swing.JPanel();
        StreamLabel = new javax.swing.JTextField();
        Stream = new javax.swing.JLabel();
        Rank = new javax.swing.JLabel();
        RankLabel = new javax.swing.JTextField();
        Subject1 = new javax.swing.JLabel();
        Subject1Label = new javax.swing.JTextField();
        Subject2 = new javax.swing.JLabel();
        Subject2Label = new javax.swing.JTextField();
        Subject3Label = new javax.swing.JTextField();
        Subject3 = new javax.swing.JLabel();
        EnglishLabel = new javax.swing.JTextField();
        English = new javax.swing.JLabel();
        GKLabel = new javax.swing.JTextField();
        GK = new javax.swing.JLabel();
        PostgraduatePane = new javax.swing.JPanel();
        QualificationLabel = new javax.swing.JTextField();
        Qualification = new javax.swing.JLabel();
        Institute = new javax.swing.JLabel();
        InstituteLabel = new javax.swing.JTextField();
        YearLabel = new javax.swing.JTextField();
        Year = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
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
        Title.setText("STUDENT");

        StudentImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/womanMid.jpg"))); // NOI18N

        AddStudent.setBackground(new java.awt.Color(153, 153, 153));
        AddStudent.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        AddStudent.setForeground(new java.awt.Color(0, 153, 102));
        AddStudent.setText("New Student");
        AddStudent.setBorder(null);
        AddStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStudentMouseClicked(evt);
            }
        });
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });

        DeleteStudent.setBackground(new java.awt.Color(153, 153, 153));
        DeleteStudent.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        DeleteStudent.setForeground(new java.awt.Color(0, 153, 102));
        DeleteStudent.setText("Delete");
        DeleteStudent.setBorder(null);
        DeleteStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteStudentMouseClicked(evt);
            }
        });
        DeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteStudentActionPerformed(evt);
            }
        });

        ShowStudent.setBackground(new java.awt.Color(153, 153, 153));
        ShowStudent.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        ShowStudent.setForeground(new java.awt.Color(0, 153, 102));
        ShowStudent.setText("Show");
        ShowStudent.setBorder(null);
        ShowStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowStudentMouseClicked(evt);
            }
        });
        ShowStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowStudentActionPerformed(evt);
            }
        });

        UpdateStudent.setBackground(new java.awt.Color(153, 153, 153));
        UpdateStudent.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        UpdateStudent.setForeground(new java.awt.Color(0, 153, 102));
        UpdateStudent.setText("Update");
        UpdateStudent.setBorder(null);
        UpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudentActionPerformed(evt);
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
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(FrontPaneLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(StudentImage, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeleteStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ShowStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UpdateStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        FrontPaneLayout.setVerticalGroup(
            FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrontPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentImage, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FrontPaneLayout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(18, 18, 18)
                        .addComponent(AddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShowStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        BackSmallPane.add(FrontPane, "card2");

        DeletePane.setBackground(new java.awt.Color(204, 255, 204));
        DeletePane.setMaximumSize(new java.awt.Dimension(600, 400));
        DeletePane.setMinimumSize(new java.awt.Dimension(600, 400));
        DeletePane.setPreferredSize(new java.awt.Dimension(600, 400));

        DeleteTitle.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        DeleteTitle.setForeground(new java.awt.Color(0, 153, 102));
        DeleteTitle.setText("DELETE STUDENT");

        DeleteId.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        DeleteId.setForeground(new java.awt.Color(102, 102, 102));
        DeleteId.setText("Student Id :");

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

        Back1.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Back1.setForeground(new java.awt.Color(0, 153, 102));
        Back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        Back1.setText("Back");
        Back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back1MouseClicked(evt);
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
                .addGap(201, 201, 201)
                .addComponent(DeleteTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletePaneLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(DeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletePaneLayout.createSequentialGroup()
                        .addGroup(DeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DeletePaneLayout.createSequentialGroup()
                                .addComponent(DeleteId)
                                .addGap(58, 58, 58)
                                .addComponent(DeleteIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletePaneLayout.createSequentialGroup()
                        .addComponent(Home1)
                        .addGap(18, 18, 18)
                        .addComponent(Back1)
                        .addContainerGap())))
        );
        DeletePaneLayout.setVerticalGroup(
            DeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletePaneLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(DeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back1)
                    .addComponent(Home1))
                .addGap(18, 18, 18)
                .addComponent(DeleteTitle)
                .addGap(42, 42, 42)
                .addGroup(DeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteId)
                    .addComponent(DeleteIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        BackSmallPane.add(DeletePane, "card5");

        ShowPane.setBackground(new java.awt.Color(204, 255, 204));
        ShowPane.setMaximumSize(new java.awt.Dimension(600, 400));
        ShowPane.setMinimumSize(new java.awt.Dimension(600, 400));
        ShowPane.setPreferredSize(new java.awt.Dimension(600, 400));

        ShowTitle1.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        ShowTitle1.setForeground(new java.awt.Color(0, 153, 102));
        ShowTitle1.setText("SHOW STUDENT");

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

        studentTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        studentTable.setForeground(new java.awt.Color(0, 153, 102));
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "NIC", "First Name", "Last Name", "Age", "Email", "City", "Faculty", "Course", "Intake"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        studentTable.setToolTipText("");
        showStudentsPane.setViewportView(studentTable);

        studentTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        studentTable1.setForeground(new java.awt.Color(0, 153, 102));
        studentTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "NIC", "First Name", "Last Name", "Age", "Email", "City", "Faculty", "Course", "Intake"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        showStudentPane.setViewportView(studentTable1);

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
                .addGap(108, 108, 108)
                .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowPaneLayout.createSequentialGroup()
                        .addComponent(StudentDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(OkButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ShowPaneLayout.createSequentialGroup()
                            .addComponent(ShowId1)
                            .addGap(97, 97, 97)
                            .addComponent(ShowIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(ShowPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showStudentPane, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ShowPaneLayout.createSequentialGroup()
                    .addGap(203, 203, 203)
                    .addComponent(ShowTitle1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Home2)
                    .addGap(18, 18, 18)
                    .addComponent(Back2))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ShowPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(showStudentsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addComponent(showStudentsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShowIdLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowId1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowPaneLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShowPaneLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(OkButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showStudentPane, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StudentDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        BackSmallPane.add(ShowPane, "card3");

        UpdatePane.setBackground(new java.awt.Color(204, 255, 204));
        UpdatePane.setMaximumSize(new java.awt.Dimension(600, 400));
        UpdatePane.setMinimumSize(new java.awt.Dimension(600, 400));

        AddTitle1.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        AddTitle1.setForeground(new java.awt.Color(0, 153, 102));
        AddTitle1.setText("UPDATE STUDENT DETAILS");

        FacultyLabel.setBorder(null);
        FacultyLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacultyLabelActionPerformed(evt);
            }
        });

        Firstname1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Firstname1.setForeground(new java.awt.Color(102, 102, 102));
        Firstname1.setText("First Name :");

        FirstNameLabel1.setBorder(null);
        FirstNameLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameLabel1ActionPerformed(evt);
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

        Lastname1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Lastname1.setForeground(new java.awt.Color(102, 102, 102));
        Lastname1.setText("Last Name :");

        LastNameLabel1.setBorder(null);
        LastNameLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameLabel1ActionPerformed(evt);
            }
        });

        CityLabel1.setBorder(null);
        CityLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityLabel1ActionPerformed(evt);
            }
        });

        Age1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Age1.setForeground(new java.awt.Color(102, 102, 102));
        Age1.setText("Age :");

        AgeLabel1.setBorder(null);
        AgeLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeLabel1ActionPerformed(evt);
            }
        });

        City1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        City1.setForeground(new java.awt.Color(102, 102, 102));
        City1.setText("City :");

        Faculty1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Faculty1.setForeground(new java.awt.Color(102, 102, 102));
        Faculty1.setText("Faculty :");

        Intake1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Intake1.setForeground(new java.awt.Color(102, 102, 102));
        Intake1.setText("Intake :");

        Course1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Course1.setForeground(new java.awt.Color(102, 102, 102));
        Course1.setText("Courses :");

        NIC1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        NIC1.setForeground(new java.awt.Color(102, 102, 102));
        NIC1.setText("NIC :");

        NICLabel1.setBorder(null);
        NICLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NICLabel1ActionPerformed(evt);
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

        Email1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Email1.setForeground(new java.awt.Color(102, 102, 102));
        Email1.setText("Email :");

        EmailLabel1.setBorder(null);
        EmailLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailLabel1ActionPerformed(evt);
            }
        });

        DetailPane1.setLayout(new java.awt.CardLayout());

        UndergraduatePane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        UndergraduatePane1.setPreferredSize(new java.awt.Dimension(524, 126));

        StreamLabel1.setBorder(null);
        StreamLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreamLabel1ActionPerformed(evt);
            }
        });

        Stream1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Stream1.setForeground(new java.awt.Color(102, 102, 102));
        Stream1.setText("Stream :");

        Rank1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Rank1.setForeground(new java.awt.Color(102, 102, 102));
        Rank1.setText("Rank :");

        RankLabel1.setBorder(null);
        RankLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankLabel1ActionPerformed(evt);
            }
        });

        Subject4.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject4.setForeground(new java.awt.Color(102, 102, 102));
        Subject4.setText("Subject 01 :");

        Subject1Label1.setBorder(null);
        Subject1Label1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subject1Label1ActionPerformed(evt);
            }
        });

        Subject5.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject5.setForeground(new java.awt.Color(102, 102, 102));
        Subject5.setText("Subject 02:");

        Subject2Label1.setBorder(null);
        Subject2Label1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subject2Label1ActionPerformed(evt);
            }
        });

        Subject3Label1.setBorder(null);
        Subject3Label1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subject3Label1ActionPerformed(evt);
            }
        });

        Subject6.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject6.setForeground(new java.awt.Color(102, 102, 102));
        Subject6.setText("Subject 03 :");

        EnglishLabel1.setBorder(null);
        EnglishLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnglishLabel1ActionPerformed(evt);
            }
        });

        English1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        English1.setForeground(new java.awt.Color(102, 102, 102));
        English1.setText("English Lan:");

        GKLabel1.setBorder(null);
        GKLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GKLabel1ActionPerformed(evt);
            }
        });

        GK1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        GK1.setForeground(new java.awt.Color(102, 102, 102));
        GK1.setText("GK :");

        javax.swing.GroupLayout UndergraduatePane1Layout = new javax.swing.GroupLayout(UndergraduatePane1);
        UndergraduatePane1.setLayout(UndergraduatePane1Layout);
        UndergraduatePane1Layout.setHorizontalGroup(
            UndergraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UndergraduatePane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UndergraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Subject4)
                    .addComponent(Subject6)
                    .addComponent(GK1)
                    .addComponent(Stream1))
                .addGap(18, 18, 18)
                .addGroup(UndergraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StreamLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(Subject3Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subject1Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GKLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UndergraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UndergraduatePane1Layout.createSequentialGroup()
                        .addComponent(Rank1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RankLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(UndergraduatePane1Layout.createSequentialGroup()
                        .addGroup(UndergraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(UndergraduatePane1Layout.createSequentialGroup()
                                .addComponent(English1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EnglishLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UndergraduatePane1Layout.createSequentialGroup()
                                .addComponent(Subject5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Subject2Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(140, 140, 140))))
        );
        UndergraduatePane1Layout.setVerticalGroup(
            UndergraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UndergraduatePane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UndergraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(UndergraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Stream1)
                        .addComponent(StreamLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Rank1))
                    .addComponent(RankLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UndergraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UndergraduatePane1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Subject4))
                    .addComponent(Subject1Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(UndergraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Subject5)
                        .addComponent(Subject2Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UndergraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subject3Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subject6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UndergraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GKLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GK1)
                    .addComponent(English1)
                    .addComponent(EnglishLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
        );

        DetailPane1.add(UndergraduatePane1, "card2");

        PostgraduatePane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        QualificationLabel1.setBorder(null);
        QualificationLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QualificationLabel1ActionPerformed(evt);
            }
        });

        Qualification1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Qualification1.setForeground(new java.awt.Color(102, 102, 102));
        Qualification1.setText("Qualification :");

        Institute1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Institute1.setForeground(new java.awt.Color(102, 102, 102));
        Institute1.setText("Institute :");

        InstituteLabel1.setBorder(null);
        InstituteLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstituteLabel1ActionPerformed(evt);
            }
        });

        YearLabel1.setBorder(null);
        YearLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearLabel1ActionPerformed(evt);
            }
        });

        Year1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Year1.setForeground(new java.awt.Color(102, 102, 102));
        Year1.setText("Year :");

        javax.swing.GroupLayout PostgraduatePane1Layout = new javax.swing.GroupLayout(PostgraduatePane1);
        PostgraduatePane1.setLayout(PostgraduatePane1Layout);
        PostgraduatePane1Layout.setHorizontalGroup(
            PostgraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostgraduatePane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PostgraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Institute1)
                    .addComponent(Year1)
                    .addComponent(Qualification1))
                .addGap(18, 18, 18)
                .addGroup(PostgraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QualificationLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(InstituteLabel1)
                    .addComponent(YearLabel1))
                .addGap(140, 140, 140))
        );
        PostgraduatePane1Layout.setVerticalGroup(
            PostgraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostgraduatePane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PostgraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Qualification1)
                    .addComponent(QualificationLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PostgraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PostgraduatePane1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Institute1))
                    .addComponent(InstituteLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PostgraduatePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Year1))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        DetailPane1.add(PostgraduatePane1, "card2");

        Back3.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Back3.setForeground(new java.awt.Color(0, 153, 102));
        Back3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        Back3.setText("Back");
        Back3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back3MouseClicked(evt);
            }
        });

        CourseLabel.setBorder(null);
        CourseLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseLabelActionPerformed(evt);
            }
        });

        CourseLabel1.setBorder(null);

        ID.setFont(new java.awt.Font("Raleway Medium", 1, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(102, 102, 102));
        ID.setText("Student ID :");

        IDLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        IDLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDLabelActionPerformed(evt);
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

        IntakeLabel.setBorder(null);
        IntakeLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntakeLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpdatePaneLayout = new javax.swing.GroupLayout(UpdatePane);
        UpdatePane.setLayout(UpdatePaneLayout);
        UpdatePaneLayout.setHorizontalGroup(
            UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdatePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdatePaneLayout.createSequentialGroup()
                        .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UpdatePaneLayout.createSequentialGroup()
                                .addGap(429, 429, 429)
                                .addComponent(Home4)
                                .addGap(18, 18, 18)
                                .addComponent(Back3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(UpdatePaneLayout.createSequentialGroup()
                                .addComponent(CourseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(UpdatePaneLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(Intake1)
                                        .addGap(65, 65, 65)
                                        .addComponent(IntakeLabel)
                                        .addGap(302, 302, 302))
                                    .addGroup(UpdatePaneLayout.createSequentialGroup()
                                        .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Lastname1)
                                            .addComponent(Firstname1)
                                            .addComponent(NIC1)
                                            .addComponent(Faculty1)
                                            .addComponent(ID))
                                        .addGap(18, 18, 18)
                                        .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(UpdatePaneLayout.createSequentialGroup()
                                                .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(FirstNameLabel1)
                                                    .addComponent(LastNameLabel1)
                                                    .addComponent(FacultyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                                    .addComponent(NICLabel1))
                                                .addGap(42, 42, 42)
                                                .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(UpdatePaneLayout.createSequentialGroup()
                                                        .addComponent(Course1)
                                                        .addGap(7, 7, 7)
                                                        .addComponent(CourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(UpdatePaneLayout.createSequentialGroup()
                                                        .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(Age1)
                                                            .addComponent(Email1)
                                                            .addComponent(City1))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(CityLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                                            .addComponent(AgeLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(EmailLabel1, javax.swing.GroupLayout.Alignment.LEADING)))))
                                            .addGroup(UpdatePaneLayout.createSequentialGroup()
                                                .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Submit2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(DetailPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdatePaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdatePaneLayout.createSequentialGroup()
                                .addComponent(AddTitle1)
                                .addGap(218, 218, 218))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdatePaneLayout.createSequentialGroup()
                                .addComponent(Submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))))
        );
        UpdatePaneLayout.setVerticalGroup(
            UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdatePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back3)
                    .addComponent(Home4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddTitle1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID)
                    .addComponent(Submit2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdatePaneLayout.createSequentialGroup()
                        .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Age1)
                            .addComponent(AgeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Email1)
                            .addComponent(EmailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(City1)
                            .addComponent(CityLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(UpdatePaneLayout.createSequentialGroup()
                            .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FirstNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Firstname1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LastNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lastname1)))
                        .addGroup(UpdatePaneLayout.createSequentialGroup()
                            .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NICLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NIC1))
                            .addGap(54, 54, 54))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Faculty1)
                    .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Course1))
                    .addComponent(FacultyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdatePaneLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(DetailPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdatePaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CourseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)))
                .addGroup(UpdatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Intake1)
                    .addComponent(IntakeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(Submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BackSmallPane.add(UpdatePane, "card3");

        BackPane.add(BackSmallPane, "card2");

        AddStudentPane.setBackground(new java.awt.Color(204, 255, 204));
        AddStudentPane.setMaximumSize(new java.awt.Dimension(600, 400));
        AddStudentPane.setMinimumSize(new java.awt.Dimension(600, 400));
        AddStudentPane.setPreferredSize(new java.awt.Dimension(600, 400));

        AddTitle.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        AddTitle.setForeground(new java.awt.Color(0, 153, 102));
        AddTitle.setText("ADD NEW STUDENT");

        Firstname.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Firstname.setForeground(new java.awt.Color(102, 102, 102));
        Firstname.setText("First Name :");

        FirstNameLabel.setBorder(null);
        FirstNameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameLabelActionPerformed(evt);
            }
        });

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

        Lastname.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Lastname.setForeground(new java.awt.Color(102, 102, 102));
        Lastname.setText("Last Name :");

        LastNameLabel.setBorder(null);
        LastNameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameLabelActionPerformed(evt);
            }
        });

        CityLabel.setBorder(null);
        CityLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityLabelActionPerformed(evt);
            }
        });

        Age.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Age.setForeground(new java.awt.Color(102, 102, 102));
        Age.setText("Age :");

        AgeLabel.setBorder(null);
        AgeLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeLabelActionPerformed(evt);
            }
        });

        City.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        City.setForeground(new java.awt.Color(102, 102, 102));
        City.setText("City :");

        Faculty.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Faculty.setForeground(new java.awt.Color(102, 102, 102));
        Faculty.setText("Faculty :");

        FacultyComboBox1.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        FacultyComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        FacultyComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacultyComboBox1ActionPerformed(evt);
            }
        });

        Intake.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Intake.setForeground(new java.awt.Color(102, 102, 102));
        Intake.setText("Intake :");

        IntakeComboBox1.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        IntakeComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        IntakeComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "February Intake", "July Intake", " " }));

        Course.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Course.setForeground(new java.awt.Color(102, 102, 102));
        Course.setText("Courses :");

        CourseComboBox1.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        CourseComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        CourseComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBox1ActionPerformed(evt);
            }
        });

        NIC.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        NIC.setForeground(new java.awt.Color(102, 102, 102));
        NIC.setText("NIC :");

        NICLabel.setBorder(null);
        NICLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NICLabelActionPerformed(evt);
            }
        });

        Home3.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Home3.setForeground(new java.awt.Color(0, 153, 102));
        Home3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home3.setText("Home");
        Home3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home3MouseClicked(evt);
            }
        });

        Email.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(102, 102, 102));
        Email.setText("Email :");

        EmailLabel.setBorder(null);
        EmailLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailLabelActionPerformed(evt);
            }
        });

        DetailPane.setPreferredSize(new java.awt.Dimension(524, 126));
        DetailPane.setLayout(new java.awt.CardLayout());

        UndergraduatePane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        UndergraduatePane.setPreferredSize(new java.awt.Dimension(524, 126));

        StreamLabel.setBorder(null);
        StreamLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreamLabelActionPerformed(evt);
            }
        });

        Stream.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Stream.setForeground(new java.awt.Color(102, 102, 102));
        Stream.setText("Stream :");

        Rank.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Rank.setForeground(new java.awt.Color(102, 102, 102));
        Rank.setText("Rank :");

        RankLabel.setBorder(null);
        RankLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankLabelActionPerformed(evt);
            }
        });

        Subject1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject1.setForeground(new java.awt.Color(102, 102, 102));
        Subject1.setText("Subject 01 :");

        Subject1Label.setBorder(null);
        Subject1Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subject1LabelActionPerformed(evt);
            }
        });

        Subject2.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject2.setForeground(new java.awt.Color(102, 102, 102));
        Subject2.setText("Subject 02:");

        Subject2Label.setBorder(null);
        Subject2Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subject2LabelActionPerformed(evt);
            }
        });

        Subject3Label.setBorder(null);
        Subject3Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subject3LabelActionPerformed(evt);
            }
        });

        Subject3.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Subject3.setForeground(new java.awt.Color(102, 102, 102));
        Subject3.setText("Subject 03 :");

        EnglishLabel.setBorder(null);
        EnglishLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnglishLabelActionPerformed(evt);
            }
        });

        English.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        English.setForeground(new java.awt.Color(102, 102, 102));
        English.setText("English Lan:");

        GKLabel.setBorder(null);
        GKLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GKLabelActionPerformed(evt);
            }
        });

        GK.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        GK.setForeground(new java.awt.Color(102, 102, 102));
        GK.setText("GK :");

        javax.swing.GroupLayout UndergraduatePaneLayout = new javax.swing.GroupLayout(UndergraduatePane);
        UndergraduatePane.setLayout(UndergraduatePaneLayout);
        UndergraduatePaneLayout.setHorizontalGroup(
            UndergraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UndergraduatePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UndergraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Subject1)
                    .addComponent(Subject3)
                    .addComponent(GK)
                    .addComponent(Stream))
                .addGap(18, 18, 18)
                .addGroup(UndergraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StreamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(Subject3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subject1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GKLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UndergraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UndergraduatePaneLayout.createSequentialGroup()
                        .addComponent(Rank)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(UndergraduatePaneLayout.createSequentialGroup()
                        .addGroup(UndergraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(UndergraduatePaneLayout.createSequentialGroup()
                                .addComponent(English)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EnglishLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UndergraduatePaneLayout.createSequentialGroup()
                                .addComponent(Subject2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Subject2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(140, 140, 140))))
        );
        UndergraduatePaneLayout.setVerticalGroup(
            UndergraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UndergraduatePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UndergraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(UndergraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Stream)
                        .addComponent(StreamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Rank))
                    .addComponent(RankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UndergraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UndergraduatePaneLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Subject1))
                    .addComponent(Subject1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(UndergraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Subject2)
                        .addComponent(Subject2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UndergraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subject3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subject3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UndergraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GKLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GK)
                    .addComponent(English)
                    .addComponent(EnglishLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
        );

        DetailPane.add(UndergraduatePane, "card2");

        PostgraduatePane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        QualificationLabel.setBorder(null);
        QualificationLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QualificationLabelActionPerformed(evt);
            }
        });

        Qualification.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Qualification.setForeground(new java.awt.Color(102, 102, 102));
        Qualification.setText("Qualification :");

        Institute.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Institute.setForeground(new java.awt.Color(102, 102, 102));
        Institute.setText("Institute :");

        InstituteLabel.setBorder(null);
        InstituteLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstituteLabelActionPerformed(evt);
            }
        });

        YearLabel.setBorder(null);
        YearLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearLabelActionPerformed(evt);
            }
        });

        Year.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Year.setForeground(new java.awt.Color(102, 102, 102));
        Year.setText("Year :");

        javax.swing.GroupLayout PostgraduatePaneLayout = new javax.swing.GroupLayout(PostgraduatePane);
        PostgraduatePane.setLayout(PostgraduatePaneLayout);
        PostgraduatePaneLayout.setHorizontalGroup(
            PostgraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostgraduatePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PostgraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Institute)
                    .addComponent(Year)
                    .addComponent(Qualification))
                .addGap(18, 18, 18)
                .addGroup(PostgraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QualificationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(InstituteLabel)
                    .addComponent(YearLabel))
                .addGap(140, 140, 140))
        );
        PostgraduatePaneLayout.setVerticalGroup(
            PostgraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostgraduatePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PostgraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Qualification)
                    .addComponent(QualificationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PostgraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PostgraduatePaneLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Institute))
                    .addComponent(InstituteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PostgraduatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Year))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        DetailPane.add(PostgraduatePane, "card2");

        Back.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 153, 102));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AddStudentPaneLayout = new javax.swing.GroupLayout(AddStudentPane);
        AddStudentPane.setLayout(AddStudentPaneLayout);
        AddStudentPaneLayout.setHorizontalGroup(
            AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddStudentPaneLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(AddTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home3)
                .addGap(18, 18, 18)
                .addComponent(Back)
                .addGap(21, 21, 21))
            .addGroup(AddStudentPaneLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddStudentPaneLayout.createSequentialGroup()
                        .addComponent(DetailPane, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddStudentPaneLayout.createSequentialGroup()
                        .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddStudentPaneLayout.createSequentialGroup()
                                .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lastname)
                                    .addComponent(Firstname)
                                    .addComponent(NIC))
                                .addGap(18, 18, 18))
                            .addGroup(AddStudentPaneLayout.createSequentialGroup()
                                .addComponent(Faculty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FirstNameLabel)
                            .addComponent(LastNameLabel)
                            .addComponent(NICLabel)
                            .addComponent(FacultyComboBox1, 0, 157, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AddStudentPaneLayout.createSequentialGroup()
                                .addComponent(City)
                                .addGap(28, 28, 28)
                                .addComponent(CityLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddStudentPaneLayout.createSequentialGroup()
                                .addComponent(Email)
                                .addGap(18, 18, 18)
                                .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddStudentPaneLayout.createSequentialGroup()
                                .addComponent(Age)
                                .addGap(28, 28, 28)
                                .addComponent(AgeLabel))
                            .addGroup(AddStudentPaneLayout.createSequentialGroup()
                                .addComponent(Course)
                                .addGap(18, 18, 18)
                                .addComponent(CourseComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(46, 46, 46))
                    .addGroup(AddStudentPaneLayout.createSequentialGroup()
                        .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddStudentPaneLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IntakeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Intake))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        AddStudentPaneLayout.setVerticalGroup(
            AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddStudentPaneLayout.createSequentialGroup()
                .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddStudentPaneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(AddTitle))
                    .addGroup(AddStudentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Back)
                            .addComponent(Home3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(AddStudentPaneLayout.createSequentialGroup()
                            .addComponent(NIC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Firstname)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Lastname))
                        .addGroup(AddStudentPaneLayout.createSequentialGroup()
                            .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Age)
                                .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Email)
                                .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(City))))
                    .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(AddStudentPaneLayout.createSequentialGroup()
                            .addComponent(FirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(AddStudentPaneLayout.createSequentialGroup()
                            .addComponent(NICLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Faculty)
                    .addComponent(FacultyComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddStudentPaneLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Course)
                            .addComponent(CourseComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DetailPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddStudentPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddStudentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Intake)
                            .addComponent(IntakeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddStudentPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        BackPane.add(AddStudentPane, "card3");

        getContentPane().add(BackPane);
        BackPane.setBounds(0, 0, 600, 400);

        BackImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        BackImage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        getContentPane().add(BackImage);
        BackImage.setBounds(0, 0, 600, 405);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed
        FillStudent();
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();
        
        BackPane.add(AddStudentPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_AddStudentActionPerformed

    private void DeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteStudentActionPerformed
        BackSmallPane.removeAll();
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
        
        BackSmallPane.add(DeletePane);
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
    }//GEN-LAST:event_DeleteStudentActionPerformed

    private void AddStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStudentMouseClicked
 
    }//GEN-LAST:event_AddStudentMouseClicked

   
    private void ShowStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowStudentActionPerformed
        show_student();
        BackSmallPane.removeAll();
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
        
        BackSmallPane.add(ShowPane);
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
    }//GEN-LAST:event_ShowStudentActionPerformed

    private void UpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudentActionPerformed
        BackSmallPane.removeAll();
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
        
        BackSmallPane.add(UpdatePane);
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
    }//GEN-LAST:event_UpdateStudentActionPerformed

    private void DeleteStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteStudentMouseClicked
 
    }//GEN-LAST:event_DeleteStudentMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_HomeMouseClicked

    private void ShowStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowStudentMouseClicked

        
    }//GEN-LAST:event_ShowStudentMouseClicked

    private void ShowIdLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowIdLabel1ActionPerformed

    }//GEN-LAST:event_ShowIdLabel1ActionPerformed

    private void OkButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkButton1MouseClicked
  
    }//GEN-LAST:event_OkButton1MouseClicked

    private void OkButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButton1ActionPerformed
        int id=Integer.parseInt(ShowIdLabel1.getText());
        databaseConnect();
        System.out.println(id);
        ArrayList<Student> studentData= new ArrayList<>();
        
        // Display details of a filtered student with student ID
        try
        {
            String sql = "SELECT * FROM student where s_id="+id+"";
            Statement stmt=conn.createStatement();
            ResultSet rS =stmt.executeQuery(sql);
            Student input;
   
            while (rS.next())
            {
                input = new Student();
                input.setStudentId(rS.getInt("s_id"));
                input.setNIC(rS.getString("NIC"));
                input.setFirstName(rS.getString("firstName"));
                input.setLastName(rS.getString("lastName"));
                input.setAge(rS.getInt("age"));
                input.setEmail(rS.getString("email"));
                input.setCity(rS.getString("city"));
                input.setFaculty(rS.getString("faculty"));
                input.setCourse(rS.getString("course"));
                input.setIntake(rS.getString("intake"));

                studentData.add(input);

            }
        }
        
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

        ArrayList<Student> list = studentData;
        DefaultTableModel model = (DefaultTableModel)studentTable1.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[10];
        for (int i = 0; i < list.size(); i++)
        {
            
            row[0] = list.get(i).getStudentId();
            row[1] = list.get(i).getNIC();
            row[2] = list.get(i).getFirstName();
            row[3] = list.get(i).getLastName();
            row[4] = list.get(i).getAge();
            row[5] = list.get(i).getEmail();
            row[6] = list.get(i).getCity();
            row[7] = list.get(i).getFaculty();
            row[8] = list.get(i).getCourse();
            row[9] = list.get(i).getIntake();
            model.addRow(row);
        }
    
    }//GEN-LAST:event_OkButton1ActionPerformed

    private void FirstNameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameLabelActionPerformed

    }//GEN-LAST:event_FirstNameLabelActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

        databaseConnect();
        String c=(String) CourseComboBox1.getSelectedItem();
        
        if(c.equals("Bachelor Course")){
            UndergraduateStudent s = new UndergraduateStudent();
            s.setNIC(NICLabel.getText());
            s.setFirstName(FirstNameLabel.getText());
            s.setLastName(LastNameLabel.getText());
            s.setAge(Integer.parseInt(AgeLabel.getText()));
            s.setEmail(EmailLabel.getText());
            s.setCity(CityLabel.getText());
            s.setFaculty((String)FacultyComboBox1.getSelectedItem());
            s.setCourse((String)CourseComboBox1.getSelectedItem());
            s.setEnglish(EnglishLabel.getText());
            s.setSubject1(Subject1Label.getText());
            s.setSubject2(Subject2Label.getText());
            s.setSubject3(Subject3Label.getText());
            s.setGK(GKLabel.getText());
            s.setRank(Integer.parseInt(RankLabel.getText()));
            s.setStream(StreamLabel.getText());
            s.setIntake((String)IntakeComboBox1.getSelectedItem());
            
            try{
            String insert="INSERT INTO student (NIC,firstName,lastName,age,email,city,faculty,course,intake) VALUES(?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(insert);
            pst.setString(1,s.getNIC());
            pst.setString(2,s.getFirstName());
            pst.setString(3,s.getLastName());
            pst.setInt(4,s.getAge());
            pst.setString(5,s.getEmail());
            pst.setString(6,s.getCity());
            pst.setString(7,s.getFaculty());
            pst.setString(8,s.getCourse());
            pst.setString(9,s.getIntake());
            
            pst.executeUpdate();
            
            String ni=s.getNIC();
            String select="SELECT s_id from student WHERE NIC=ni";
            int s_idSelected = 0;
            ResultSet res=pst.executeQuery(select);
            while(res.next()){
              s_idSelected=Integer.parseInt(res.getString(1));
            }
            String insertUndergraduate="INSERT INTO undergraduate (s_id, stream,rank,subject1,subject2,subject3,GK,english) VALUES (?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(insertUndergraduate);
            pst.setInt(1,s_idSelected);
            pst.setString(2,s.getStream());
            pst.setInt(3,s.getRank());
            pst.setString(4,s.getSubject1());
            pst.setString(5,s.getSubject2());
            pst.setString(6,s.getSubject3());
            pst.setString(7,s.getGK());
            pst.setString(8,s.getEnglish());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Data row is successfully inserted to the table .");
            }
        
            catch(SQLException e){
                System.err.print(e);
            }
        }
        
        else if(c.equals("Master Course")){
            PostgraduateStudent s = new PostgraduateStudent();
            s.setNIC(NICLabel.getText());
            s.setFirstName(FirstNameLabel.getText());
            s.setLastName(LastNameLabel.getText());
            s.setAge(Integer.parseInt(AgeLabel.getText()));
            s.setEmail(EmailLabel.getText());
            s.setCity(CityLabel.getText());
            s.setFaculty((String)FacultyComboBox1.getSelectedItem());
            s.setCourse((String)CourseComboBox1.getSelectedItem());
            s.setQualification(QualificationLabel.getText());
            s.setInstitute(InstituteLabel.getText());           
            s.setYear(Integer.parseInt(YearLabel.getText()));
            s.setIntake((String)IntakeComboBox1.getSelectedItem());
            
            
            try{
            String insert="INSERT INTO student (NIC,firstName,lastName,age,email,city,faculty,course,intake) VALUES(?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(insert);
            pst.setString(1,s.getNIC());
            pst.setString(2,s.getFirstName());
            pst.setString(3,s.getLastName());
            pst.setInt(4,s.getAge());
            pst.setString(5,s.getEmail());
            pst.setString(6,s.getCity());
            pst.setString(7,s.getFaculty());
            pst.setString(8,s.getCourse());
            pst.setString(9,s.getIntake());
            
            pst.executeUpdate();
            
            String ni=s.getNIC();
            String select="SELECT s_id from student WHERE NIC="+ni+"";
            int s_idSelected = 0;
            ResultSet res=pst.executeQuery(select);
            while(res.next()){
              s_idSelected=Integer.parseInt(res.getString(1));
            }
            
            //Insert new student
            String insertUndergraduate="INSERT INTO postgraduate (s_id,qualification,institute,year) VALUES (?,?,?,?)";
            pst = conn.prepareStatement(insertUndergraduate);
            pst.setInt(1,s_idSelected);
            pst.setString(2,s.getQualification());
            pst.setString(3,s.getInstitute());
            pst.setInt(4,s.getYear());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Data row is successfully inserted to the table .");
            }
        
            catch(SQLException e){
                System.err.print(e);
            }

        }
      
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void LastNameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameLabelActionPerformed

    private void CityLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityLabelActionPerformed

    private void AgeLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeLabelActionPerformed

    private void DeleteIdLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteIdLabelActionPerformed
       
    }//GEN-LAST:event_DeleteIdLabelActionPerformed

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
       int id=Integer.parseInt(DeleteIdLabel.getText());
       databaseConnect();
       
        try{
            String delete="DELETE FROM student WHERE s_id="+id+"";
            pst = conn.prepareStatement(delete);
            
            pst.execute();
            JOptionPane.showMessageDialog(this,"Data row is deleted successfully.");
        }
        
        catch(SQLException e){
            System.err.print(e);
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void NICLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NICLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NICLabelActionPerformed

    private void EmailLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailLabelActionPerformed

    private void CourseComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBox1ActionPerformed
        String c=(String) CourseComboBox1.getSelectedItem();
        //Make the visibility of undergraduate panel
        if(c.equals("Bachelor Course")){
            DetailPane.removeAll();
            DetailPane.repaint();
            DetailPane.revalidate();
        
            DetailPane.add(UndergraduatePane);
            DetailPane.repaint();
            DetailPane.revalidate();
        }
        //Make the visibility of postgraduate panel
        else if(c.equals("Master Course")){
            DetailPane.removeAll();
            DetailPane.repaint();
            DetailPane.revalidate();
        
            DetailPane.add(PostgraduatePane);
            DetailPane.repaint();
            DetailPane.revalidate();
        }
    }//GEN-LAST:event_CourseComboBox1ActionPerformed

    private void RankLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RankLabelActionPerformed

    private void StreamLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreamLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreamLabelActionPerformed

    private void Subject1LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subject1LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Subject1LabelActionPerformed

    private void Subject2LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subject2LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Subject2LabelActionPerformed

    private void Subject3LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subject3LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Subject3LabelActionPerformed

    private void EnglishLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnglishLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnglishLabelActionPerformed

    private void GKLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GKLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GKLabelActionPerformed

    private void QualificationLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QualificationLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QualificationLabelActionPerformed

    private void InstituteLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstituteLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InstituteLabelActionPerformed

    private void YearLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearLabelActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();
       
        FrontPane.setBackground(new Color(204,255,204));
        BackPane.add(FrontPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_BackMouseClicked

    private void Back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back1MouseClicked
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();
       
        FrontPane.setBackground(new Color(204,255,204));
        BackPane.add(FrontPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_Back1MouseClicked

    private void Back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back2MouseClicked
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();
       
        FrontPane.setBackground(new Color(204,255,204));
        BackPane.add(FrontPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_Back2MouseClicked

    private void Home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home1MouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_Home1MouseClicked

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

    private void FirstNameLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameLabel1ActionPerformed

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed
//Update

int id=Integer.parseInt(IDLabel.getText());
        databaseConnect();
         try
            {
            String sql1 = "UPDATE student SET `NIC`=?,`firstName`=?,`lastName`=?,`age`=?,`email`=?,`city`=?,`faculty`=?,`course`=?,`intake`=? WHERE s_id="+id+"";
            pst = conn.prepareStatement(sql1);
            pst.setString(1,NICLabel1.getText());
            pst.setString(2,FirstNameLabel1.getText());
            pst.setString(3,LastNameLabel1.getText());
            pst.setString(4,AgeLabel1.getText());
            pst.setString(5,EmailLabel1.getText());
            pst.setString(6,CityLabel1.getText());
            pst.setString(7,FacultyLabel.getText());
            pst.setString(8,CourseLabel.getText());
            pst.setString(9,IntakeLabel.getText());

            pst.executeUpdate();
            
            String sql2 = "UPDATE undergraduate SET stream=?, rank=?, subject1=?, subject2=?, subject3=?, GK=?, English=? WHERE s_id="+id+"";
            pst = conn.prepareStatement(sql2);
            pst.setString(1,StreamLabel1.getText());
            pst.setString(2,RankLabel1.getText());
            pst.setString(3,Subject1Label1.getText());
            pst.setString(4,Subject2Label1.getText());
            pst.setString(5,Subject3Label1.getText());
            pst.setString(6,GKLabel1.getText());
            pst.setString(7,EnglishLabel1.getText());
            
            pst.executeUpdate();
            
            
            String sql3 = "UPDATE postgraduate SET `qualification`=?,`institute`=?,`year`=? WHERE s_id="+id+"";
            pst = conn.prepareStatement(sql3);
            pst.setString(1,QualificationLabel1.getText());
            pst.setString(2,InstituteLabel1.getText());
            pst.setString(3,YearLabel1.getText());
      
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"The table is updated.");
            }
         catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }     
    }//GEN-LAST:event_Submit1ActionPerformed

    private void LastNameLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameLabel1ActionPerformed

    private void CityLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityLabel1ActionPerformed

    private void AgeLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeLabel1ActionPerformed

    private void NICLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NICLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NICLabel1ActionPerformed

    private void Home4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Home4MouseClicked

    private void EmailLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailLabel1ActionPerformed

    private void StreamLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreamLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreamLabel1ActionPerformed

    private void RankLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RankLabel1ActionPerformed

    private void Subject1Label1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subject1Label1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Subject1Label1ActionPerformed

    private void Subject2Label1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subject2Label1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Subject2Label1ActionPerformed

    private void Subject3Label1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subject3Label1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Subject3Label1ActionPerformed

    private void EnglishLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnglishLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnglishLabel1ActionPerformed

    private void GKLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GKLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GKLabel1ActionPerformed

    private void QualificationLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QualificationLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QualificationLabel1ActionPerformed

    private void InstituteLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstituteLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InstituteLabel1ActionPerformed

    private void YearLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearLabel1ActionPerformed

    private void Back3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Back3MouseClicked

    private void CourseLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseLabelActionPerformed
        
        
    }//GEN-LAST:event_CourseLabelActionPerformed

    private void FacultyLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacultyLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FacultyLabelActionPerformed

    private void IDLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDLabelActionPerformed

    private void Submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit2ActionPerformed
        int id=Integer.parseInt(IDLabel.getText());
        databaseConnect();
        //System.out.println(id);
       ArrayList<Student> studentData= new ArrayList<>();
        
        try
        {
            String sql = "SELECT * FROM student where s_id="+id+"";
            Statement stmt=conn.createStatement();
            //pst = conn.createStatement(sql);
            
            ResultSet rS =stmt.executeQuery(sql);
            Student input;
            
        
        while (rS.next())
        {
            input = new Student();
            input.setStudentId(rS.getInt("s_id"));
            input.setNIC(rS.getString("NIC"));
            input.setFirstName(rS.getString("firstName"));
            input.setLastName(rS.getString("lastName"));
            input.setAge(rS.getInt("age"));
            input.setEmail(rS.getString("email"));
            input.setCity(rS.getString("city"));
            input.setFaculty(rS.getString("faculty"));
            input.setCourse(rS.getString("course"));
            input.setIntake(rS.getString("intake"));
            
            studentData.add(input);
            
           
        }
        
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

  
        ArrayList<Student> list = studentData;

        for (int i = 0; i < list.size(); i++)
        {
            
            NICLabel1.setText(list.get(i).getNIC());
            FirstNameLabel1.setText(list.get(i).getFirstName());
            LastNameLabel1.setText(list.get(i).getLastName());
            AgeLabel1.setText(Integer.toString(list.get(i).getAge()));
            EmailLabel1.setText(list.get(i).getEmail());
            CityLabel1.setText(list.get(i).getCity());
            FacultyLabel.setText(list.get(i).getFaculty());
            CourseLabel.setText(list.get(i).getCourse());
            IntakeLabel.setText(list.get(i).getIntake());
            
            //IntakeLabel.setText(list.get(i).getNIC());
            
        }
        
        if(CourseLabel.getText().equalsIgnoreCase("Bachelor Course")){
            DetailPane1.removeAll();
            DetailPane1.repaint();
            DetailPane1.revalidate();
        
            DetailPane1.add(UndergraduatePane1);
            DetailPane1.repaint();
            DetailPane1.revalidate();
            
            ArrayList<UndergraduateStudent> UndstudentData= new ArrayList<>();
        
        try
        {
            String sql = "SELECT `stream`, `rank`, `subject1`, `subject2`, `subject3`, `GK`, `English` FROM undergraduate where s_id="+id+"";
            Statement stmt=conn.prepareStatement(sql);
            
            ResultSet rS =stmt.executeQuery(sql);
            UndergraduateStudent input;
            
        
        while (rS.next())
        {
            input = new UndergraduateStudent();
            input.setStream(rS.getString("stream"));
            input.setRank(rS.getInt("rank"));
            input.setSubject1(rS.getString("subject1"));
            input.setSubject2(rS.getString("subject2"));
            input.setSubject3(rS.getString("subject3"));
            input.setGK(rS.getString("GK"));
            input.setEnglish(rS.getString("English"));
            System.out.println(rS.getString("rank"));
            UndstudentData.add(input);

        }
        
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

  
        ArrayList<UndergraduateStudent> list1 = UndstudentData;

        for (int i = 0; i < list1.size(); i++)
        {
            
            StreamLabel1.setText(list1.get(i).getStream());
            RankLabel1.setText(Integer.toString(list1.get(i).getRank()));
            Subject1Label1.setText(list1.get(i).getSubject1());
            Subject2Label1.setText(list1.get(i).getSubject2());
            Subject3Label1.setText(list1.get(i).getSubject3());
            GKLabel1.setText(list1.get(i).getGK());
            EnglishLabel1.setText(list1.get(i).getEnglish());

            
        }
        }
            
        
        
        else if(CourseLabel.getText().equalsIgnoreCase("Master Course")){
            DetailPane1.removeAll();
            DetailPane1.repaint();
            DetailPane1.revalidate();
        
            DetailPane1.add(PostgraduatePane1);
            DetailPane1.repaint();
            DetailPane1.revalidate(); 
            
            ArrayList<PostgraduateStudent> PoststudentData= new ArrayList<>();
        
        try
        {
            String sql = "SELECT `qualification`, `institute`, `year` FROM postgraduate where s_id="+id+"";
            Statement stmt=conn.createStatement(); 
            ResultSet rS =stmt.executeQuery(sql);
            PostgraduateStudent input1;
            
        
            while (rS.next())
            {
                input1 = new PostgraduateStudent();
                input1.setQualification(rS.getString("qualification"));
                input1.setInstitute(rS.getString("institute"));
                input1.setYear(rS.getInt("year"));


                PoststudentData.add(input1);

            }
        
        ArrayList<PostgraduateStudent> list1 = PoststudentData;

        for (int i = 0; i < list1.size(); i++)
        {
            
            QualificationLabel1.setText(list1.get(i).getQualification());
            InstituteLabel1.setText(list1.get(i).getInstitute());
            YearLabel1.setText(Integer.toString(list1.get(i).getYear()));

        }
        
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

        }
  
    }//GEN-LAST:event_Submit2ActionPerformed

    private void IntakeLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntakeLabelActionPerformed

    }//GEN-LAST:event_IntakeLabelActionPerformed

    private void FacultyComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacultyComboBox1ActionPerformed

    }//GEN-LAST:event_FacultyComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStudent;
    private javax.swing.JPanel AddStudentPane;
    private javax.swing.JLabel AddTitle;
    private javax.swing.JLabel AddTitle1;
    private javax.swing.JLabel Age;
    private javax.swing.JLabel Age1;
    private javax.swing.JTextField AgeLabel;
    private javax.swing.JTextField AgeLabel1;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Back1;
    private javax.swing.JLabel Back2;
    private javax.swing.JLabel Back3;
    private javax.swing.JLabel BackImage;
    private javax.swing.JPanel BackPane;
    private javax.swing.JPanel BackSmallPane;
    private javax.swing.JLabel City;
    private javax.swing.JLabel City1;
    private javax.swing.JTextField CityLabel;
    private javax.swing.JTextField CityLabel1;
    private javax.swing.JLabel Course;
    private javax.swing.JLabel Course1;
    private javax.swing.JComboBox<String> CourseComboBox1;
    private javax.swing.JTextField CourseLabel;
    private javax.swing.JTextField CourseLabel1;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel DeleteId;
    public javax.swing.JTextField DeleteIdLabel;
    private javax.swing.JPanel DeletePane;
    private javax.swing.JButton DeleteStudent;
    private javax.swing.JLabel DeleteTitle;
    private javax.swing.JPanel DetailPane;
    private javax.swing.JPanel DetailPane1;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JTextField EmailLabel;
    private javax.swing.JTextField EmailLabel1;
    private javax.swing.JLabel English;
    private javax.swing.JLabel English1;
    private javax.swing.JTextField EnglishLabel;
    private javax.swing.JTextField EnglishLabel1;
    private javax.swing.JLabel Faculty;
    private javax.swing.JLabel Faculty1;
    private javax.swing.JComboBox<String> FacultyComboBox1;
    private javax.swing.JTextField FacultyLabel;
    public javax.swing.JTextField FirstNameLabel;
    public javax.swing.JTextField FirstNameLabel1;
    private javax.swing.JLabel Firstname;
    private javax.swing.JLabel Firstname1;
    private javax.swing.JPanel FrontPane;
    private javax.swing.JLabel GK;
    private javax.swing.JLabel GK1;
    private javax.swing.JTextField GKLabel;
    private javax.swing.JTextField GKLabel1;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home1;
    private javax.swing.JLabel Home2;
    private javax.swing.JLabel Home3;
    private javax.swing.JLabel Home4;
    private javax.swing.JLabel ID;
    public javax.swing.JTextField IDLabel;
    private javax.swing.JLabel Institute;
    private javax.swing.JLabel Institute1;
    private javax.swing.JTextField InstituteLabel;
    private javax.swing.JTextField InstituteLabel1;
    private javax.swing.JLabel Intake;
    private javax.swing.JLabel Intake1;
    private javax.swing.JComboBox<String> IntakeComboBox1;
    private javax.swing.JTextField IntakeLabel;
    private javax.swing.JTextField LastNameLabel;
    private javax.swing.JTextField LastNameLabel1;
    private javax.swing.JLabel Lastname;
    private javax.swing.JLabel Lastname1;
    private javax.swing.JLabel NIC;
    private javax.swing.JLabel NIC1;
    public javax.swing.JTextField NICLabel;
    public javax.swing.JTextField NICLabel1;
    private javax.swing.JButton OkButton1;
    private javax.swing.JPanel PostgraduatePane;
    private javax.swing.JPanel PostgraduatePane1;
    private javax.swing.JLabel Qualification;
    private javax.swing.JLabel Qualification1;
    private javax.swing.JTextField QualificationLabel;
    private javax.swing.JTextField QualificationLabel1;
    private javax.swing.JLabel Rank;
    private javax.swing.JLabel Rank1;
    private javax.swing.JTextField RankLabel;
    private javax.swing.JTextField RankLabel1;
    private javax.swing.JLabel ShowId1;
    public javax.swing.JTextField ShowIdLabel1;
    private javax.swing.JPanel ShowPane;
    private javax.swing.JButton ShowStudent;
    private javax.swing.JLabel ShowTitle1;
    private javax.swing.JLabel Stream;
    private javax.swing.JLabel Stream1;
    private javax.swing.JTextField StreamLabel;
    private javax.swing.JTextField StreamLabel1;
    private javax.swing.JLabel StudentDetail1;
    private javax.swing.JLabel StudentImage;
    private javax.swing.JLabel Subject1;
    private javax.swing.JTextField Subject1Label;
    private javax.swing.JTextField Subject1Label1;
    private javax.swing.JLabel Subject2;
    private javax.swing.JTextField Subject2Label;
    private javax.swing.JTextField Subject2Label1;
    private javax.swing.JLabel Subject3;
    private javax.swing.JTextField Subject3Label;
    private javax.swing.JTextField Subject3Label1;
    private javax.swing.JLabel Subject4;
    private javax.swing.JLabel Subject5;
    private javax.swing.JLabel Subject6;
    private javax.swing.JButton Submit;
    private javax.swing.JButton Submit1;
    private javax.swing.JButton Submit2;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel UndergraduatePane;
    private javax.swing.JPanel UndergraduatePane1;
    private javax.swing.JPanel UpdatePane;
    private javax.swing.JButton UpdateStudent;
    private javax.swing.JLabel Year;
    private javax.swing.JLabel Year1;
    private javax.swing.JTextField YearLabel;
    private javax.swing.JTextField YearLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane showStudentPane;
    private javax.swing.JScrollPane showStudentsPane;
    private javax.swing.JTable studentTable;
    private javax.swing.JTable studentTable1;
    // End of variables declaration//GEN-END:variables
}
