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

public class CourseForm extends javax.swing.JFrame {

    
    private static void setContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void close(){
        WindowEvent winClose=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }
    
    public CourseForm() {
        initComponents();
        FrontPane.setBackground(new Color(255,255,255,150));
        BackPane.setBackground(new Color(255,255,255,0));
        BackSmallPane.setBackground(new Color(255,255,255,150));

        
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
   
   public ArrayList<file.Course> showCourseTable()
   {
       databaseConnect();
       ArrayList<Course> courseData= new ArrayList<>();
        
        try
        {
            String sql = "SELECT * FROM course";
            Statement stmt=conn.createStatement();
            //pst = conn.createStatement(sql);
            
            ResultSet rS =stmt.executeQuery(sql);
            Course input;
        
        while (rS.next())
        {
            input = new Course();
            input.setC_code(rS.getInt("c_code"));
            input.setName(rS.getString("name"));
            input.setCredit(rS.getInt("credit"));
            
            
            courseData.add(input);
            
           
        }
        
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
       return courseData;
       
   }
   
   public void show_Course()
    {
        ArrayList<Course> list = showCourseTable();
        DefaultTableModel model = (DefaultTableModel)coursesTable.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[3];
        for (int i = 0; i < list.size(); i++)
        {
            
            row[0] = list.get(i).getC_code();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getCredit();
            
            model.addRow(row);
        }
    }
   
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackPane = new javax.swing.JPanel();
        BackSmallPane = new javax.swing.JPanel();
        FrontPane = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        CourseImage = new javax.swing.JLabel();
        AddCourse = new javax.swing.JButton();
        DeleteCourse = new javax.swing.JButton();
        ShowCourse = new javax.swing.JButton();
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
        jPanel1 = new javax.swing.JPanel();
        showCoursesPane = new javax.swing.JScrollPane();
        coursesTable = new javax.swing.JTable();
        showCoursePane = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        Back2 = new javax.swing.JLabel();
        Home2 = new javax.swing.JLabel();
        AddCoursePane = new javax.swing.JPanel();
        AddTitle = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        NameLabel = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Credit = new javax.swing.JLabel();
        CreditLabel = new javax.swing.JTextField();
        Home3 = new javax.swing.JLabel();
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
        Title.setText("COURSE");

        CourseImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/presentationMid.jpg"))); // NOI18N

        AddCourse.setBackground(new java.awt.Color(153, 153, 153));
        AddCourse.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        AddCourse.setForeground(new java.awt.Color(0, 153, 102));
        AddCourse.setText("New Course");
        AddCourse.setBorder(null);
        AddCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCourseMouseClicked(evt);
            }
        });
        AddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCourseActionPerformed(evt);
            }
        });

        DeleteCourse.setBackground(new java.awt.Color(153, 153, 153));
        DeleteCourse.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        DeleteCourse.setForeground(new java.awt.Color(0, 153, 102));
        DeleteCourse.setText("Delete");
        DeleteCourse.setBorder(null);
        DeleteCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteCourseMouseClicked(evt);
            }
        });
        DeleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCourseActionPerformed(evt);
            }
        });

        ShowCourse.setBackground(new java.awt.Color(153, 153, 153));
        ShowCourse.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        ShowCourse.setForeground(new java.awt.Color(0, 153, 102));
        ShowCourse.setText("View");
        ShowCourse.setBorder(null);
        ShowCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowCourseMouseClicked(evt);
            }
        });
        ShowCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowCourseActionPerformed(evt);
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
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                        .addComponent(Home)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                        .addComponent(CourseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DeleteCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ShowCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))))
        );
        FrontPaneLayout.setVerticalGroup(
            FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrontPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home)
                .addGap(53, 53, 53)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CourseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FrontPaneLayout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(31, 31, 31)
                        .addComponent(ShowCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(AddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        BackSmallPane.add(FrontPane, "card2");

        DeletePane.setBackground(new java.awt.Color(204, 255, 204));
        DeletePane.setMaximumSize(new java.awt.Dimension(600, 400));
        DeletePane.setMinimumSize(new java.awt.Dimension(600, 400));
        DeletePane.setPreferredSize(new java.awt.Dimension(600, 400));

        DeleteTitle.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        DeleteTitle.setForeground(new java.awt.Color(0, 153, 102));
        DeleteTitle.setText("DELETE COURSE");

        DeleteId.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        DeleteId.setForeground(new java.awt.Color(102, 102, 102));
        DeleteId.setText("Course Id :");

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
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(DeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletePaneLayout.createSequentialGroup()
                        .addComponent(Home1)
                        .addGap(18, 18, 18)
                        .addComponent(Back1)
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
                    .addComponent(Back1)
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

        ShowPane.setBackground(new java.awt.Color(204, 255, 204));
        ShowPane.setMaximumSize(new java.awt.Dimension(600, 400));
        ShowPane.setMinimumSize(new java.awt.Dimension(600, 400));
        ShowPane.setPreferredSize(new java.awt.Dimension(600, 400));

        ShowTitle1.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        ShowTitle1.setForeground(new java.awt.Color(0, 153, 102));
        ShowTitle1.setText("VIEW COURSE");

        ShowId1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        ShowId1.setForeground(new java.awt.Color(102, 102, 102));
        ShowId1.setText("Course Id :");

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

        coursesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Name", "Credit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        showCoursesPane.setViewportView(coursesTable);

        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Name", "Credit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        showCoursePane.setViewportView(courseTable);

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
                        .addGap(490, 490, 490)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(OkButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ShowPaneLayout.createSequentialGroup()
                            .addComponent(ShowId1)
                            .addGap(97, 97, 97)
                            .addComponent(ShowIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(ShowPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showCoursePane, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(showCoursesPane, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(showCoursesPane, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(showCoursePane, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        BackSmallPane.add(ShowPane, "card3");

        BackPane.add(BackSmallPane, "card2");

        AddCoursePane.setBackground(new java.awt.Color(204, 255, 204));
        AddCoursePane.setMaximumSize(new java.awt.Dimension(600, 400));
        AddCoursePane.setMinimumSize(new java.awt.Dimension(600, 400));
        AddCoursePane.setPreferredSize(new java.awt.Dimension(600, 400));

        AddTitle.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        AddTitle.setForeground(new java.awt.Color(0, 153, 102));
        AddTitle.setText("ADD COURSE");

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
        Submit.setText("Submit");
        Submit.setBorder(null);
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
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

        javax.swing.GroupLayout AddCoursePaneLayout = new javax.swing.GroupLayout(AddCoursePane);
        AddCoursePane.setLayout(AddCoursePaneLayout);
        AddCoursePaneLayout.setHorizontalGroup(
            AddCoursePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCoursePaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home3)
                .addGap(18, 18, 18)
                .addComponent(Back)
                .addGap(21, 21, 21))
            .addGroup(AddCoursePaneLayout.createSequentialGroup()
                .addGroup(AddCoursePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddCoursePaneLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(AddCoursePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddCoursePaneLayout.createSequentialGroup()
                                .addGroup(AddCoursePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Credit)
                                    .addComponent(Name))
                                .addGap(50, 50, 50)
                                .addGroup(AddCoursePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(CreditLabel)))))
                    .addGroup(AddCoursePaneLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(AddTitle)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        AddCoursePaneLayout.setVerticalGroup(
            AddCoursePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCoursePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddCoursePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Home3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(AddTitle)
                .addGap(41, 41, 41)
                .addGroup(AddCoursePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(AddCoursePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Credit)
                    .addComponent(CreditLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        BackPane.add(AddCoursePane, "card3");

        getContentPane().add(BackPane);
        BackPane.setBounds(0, 0, 600, 400);

        BackImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        BackImage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        getContentPane().add(BackImage);
        BackImage.setBounds(0, 0, 600, 405);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void AddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCourseActionPerformed
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();
        
        BackPane.add(AddCoursePane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_AddCourseActionPerformed

    private void DeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCourseActionPerformed
        BackSmallPane.removeAll();
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
        
        BackSmallPane.add(DeletePane);
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
    }//GEN-LAST:event_DeleteCourseActionPerformed

    private void AddCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCourseMouseClicked
        //ImageIcon click=new ImageIcon(getClass().getResource(""));
     
        //AddStudent.setIcon(null);
       
        
    }//GEN-LAST:event_AddCourseMouseClicked

   
    private void ShowCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowCourseActionPerformed
        show_Course();
        BackSmallPane.removeAll();
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
        
        BackSmallPane.add(ShowPane);
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
    }//GEN-LAST:event_ShowCourseActionPerformed

    private void DeleteCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteCourseMouseClicked
        //DeleteStudent.setIcon(null);
       
    }//GEN-LAST:event_DeleteCourseMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_HomeMouseClicked

    private void ShowCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowCourseMouseClicked
        //DeleteStudent.setIcon(null);
        
    }//GEN-LAST:event_ShowCourseMouseClicked

    private void ShowIdLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowIdLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowIdLabel1ActionPerformed

    private void OkButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OkButton1MouseClicked

    private void OkButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButton1ActionPerformed
        //Show Course
        int id=Integer.parseInt(ShowIdLabel1.getText());
        databaseConnect();
        //System.out.println(id);
       ArrayList<Course> courseData= new ArrayList<>();
        
        try
        {
            String sql = "SELECT * FROM course where c_code="+id+"";
            Statement stmt=conn.createStatement();
            //pst = conn.createStatement(sql);
            
            ResultSet rS =stmt.executeQuery(sql);
            Course input;
            
        
        while (rS.next())
        {
            input = new Course();
            input.setC_code(rS.getInt("c_code"));
            input.setName(rS.getString("name"));
            input.setCredit(rS.getInt("credit"));
            
            
            courseData.add(input);
            
           
        }
        
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

  
        ArrayList<Course> list = courseData;
        DefaultTableModel model = (DefaultTableModel)courseTable.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[3];
        for (int i = 0; i < list.size(); i++)
        {
            
            row[0] = list.get(i).getC_code();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getCredit();
          
            model.addRow(row);
        }
    
    }//GEN-LAST:event_OkButton1ActionPerformed

    private void NameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameLabelActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

       databaseConnect();
       
        
        Course c=new Course();
            //c.setNIC(NICLabel.getText());
            
            c.setName(NameLabel.getText());
            c.setCredit(Integer.parseInt(CreditLabel.getText()));
            
            
            try{
            String insert="INSERT INTO course (Name,credit) VALUES(?,?)";
            pst = conn.prepareStatement(insert);
            pst.setString(1,c.getName());
            pst.setInt(2,c.getCredit());
          
            
            pst.executeUpdate();
            
//            String ni=s.getNIC();
//            String select="SELECT s_id from student WHERE NIC="+ni+"";
//            int s_idSelected = 0;
//            ResultSet res=pst.executeQuery(select);
//            while(res.next()){
//              s_idSelected=Integer.parseInt(res.getString(1));
//            }
         
            
            JOptionPane.showMessageDialog(this,"Data row is successfully inserted to the table .");
            }
        
            catch(SQLException e){
                System.err.print(e);
            }
 
      
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void DeleteIdLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteIdLabelActionPerformed
       
    }//GEN-LAST:event_DeleteIdLabelActionPerformed

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
       int id=Integer.parseInt(DeleteIdLabel.getText());
       databaseConnect();
       
        try{
            
           
            String delete="DELETE FROM course WHERE c_code="+id+"";
            pst = conn.prepareStatement(delete);
            
            pst.execute();
            JOptionPane.showMessageDialog(this,"Data row is deleted successfully.");
        }
        
        catch(SQLException e){
            System.err.print(e);
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

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

    private void CreditLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditLabelActionPerformed

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
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCourse;
    private javax.swing.JPanel AddCoursePane;
    private javax.swing.JLabel AddTitle;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Back1;
    private javax.swing.JLabel Back2;
    private javax.swing.JLabel BackImage;
    private javax.swing.JPanel BackPane;
    private javax.swing.JPanel BackSmallPane;
    private javax.swing.JLabel CourseImage;
    private javax.swing.JLabel Credit;
    private javax.swing.JTextField CreditLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton DeleteCourse;
    private javax.swing.JLabel DeleteId;
    public javax.swing.JTextField DeleteIdLabel;
    private javax.swing.JPanel DeletePane;
    private javax.swing.JLabel DeleteTitle;
    private javax.swing.JPanel FrontPane;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home1;
    private javax.swing.JLabel Home2;
    private javax.swing.JLabel Home3;
    private javax.swing.JLabel Name;
    public javax.swing.JTextField NameLabel;
    private javax.swing.JButton OkButton1;
    private javax.swing.JButton ShowCourse;
    private javax.swing.JLabel ShowId1;
    public javax.swing.JTextField ShowIdLabel1;
    private javax.swing.JPanel ShowPane;
    private javax.swing.JLabel ShowTitle1;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel Title;
    private javax.swing.JTable courseTable;
    private javax.swing.JTable coursesTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane showCoursePane;
    private javax.swing.JScrollPane showCoursesPane;
    // End of variables declaration//GEN-END:variables
}
