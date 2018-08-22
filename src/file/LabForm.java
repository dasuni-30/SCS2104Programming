//Package
package file;

//Imports
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
@author Dasuni Geeganage
 */

public class LabForm extends javax.swing.JFrame {

    
    private static void setContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void close(){
        WindowEvent winClose=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }
    
    public LabForm() {
        initComponents();
        FrontPane.setBackground(new Color(255,255,255,150));
        BackPane.setBackground(new Color(255,255,255,0));
        BackSmallPane.setBackground(new Color(255,255,255,150));
        databaseConnect();
        updateSubjectPickerComboBox();
        updateLabPickerComboBox();

        
    }
    
    //Database Connection
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/university";
    Connection conn=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
   private void databaseConnect(){
       try{
            conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("CONNECTED");
            
        }
        
        catch(SQLException e){
            System.err.print(e);
        }
   }
   
   public void updateLabPickerComboBox()
   {
       LabPicker.removeAllItems();
       String sql = "SELECT * from lab";
        try
        {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                LabPicker.addItem(rs.getString("lab_id"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
   }
   
   public void updateSubjectPickerComboBox()
   {
       SubjectPicker.removeAllItems();
       String sql = "SELECT * from subject";
        try
        {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                SubjectPicker.addItem(rs.getString("s_code"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
   }
   
   public void show_lab_schedule(String day)
    {
        String sql = "SELECT * FROM lab_assign WHERE date=? ORDER BY time ASC";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, day);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel)LabsTable.getModel();
            model.setRowCount(0);
            String[] row;
            row = new String[3];
            while(rs.next())
            {
                row[0] = rs.getTime("time").toString();
                row[1] = rs.getString("lab_id");
                row[2] = rs.getString("s_code"); 
                model.addRow(row);
                }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
   
   public void show_lab(String lab_id)
    {
        String sql = "SELECT * FROM lab WHERE lab_id=?";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, lab_id);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel)LabsTable1.getModel();
            model.setRowCount(0);
            String[] row;
            row = new String[3];
            while(rs.next())
            {
                row[0] = rs.getString("lab_id");
                row[1] = rs.getString("lab_building");
                row[2] = rs.getString("Lab_floor"); 
                model.addRow(row);
                }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeleteButton1 = new javax.swing.JButton();
        BackPane = new javax.swing.JPanel();
        BackSmallPane = new javax.swing.JPanel();
        FrontPane = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        LecturerImage = new javax.swing.JLabel();
        AddLab = new javax.swing.JButton();
        DeleteLab = new javax.swing.JButton();
        ShowLab = new javax.swing.JButton();
        Home = new javax.swing.JLabel();
        AssignLab = new javax.swing.JButton();
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
        showLecturersPane = new javax.swing.JScrollPane();
        LabsTable = new javax.swing.JTable();
        Back2 = new javax.swing.JLabel();
        Home2 = new javax.swing.JLabel();
        showLecturerPane = new javax.swing.JScrollPane();
        LabsTable1 = new javax.swing.JTable();
        DayPicker1 = new javax.swing.JComboBox<>();
        dateSelectButton = new javax.swing.JButton();
        AddLabPane = new javax.swing.JPanel();
        AddTitle = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        LabIdLabel = new javax.swing.JTextField();
        SubmitNewLab = new javax.swing.JButton();
        Room = new javax.swing.JLabel();
        LabBuildingLabel = new javax.swing.JTextField();
        Home3 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        Location = new javax.swing.JLabel();
        LabFloorLabel = new javax.swing.JTextField();
        AssignLabPane = new javax.swing.JPanel();
        AddTitle1 = new javax.swing.JLabel();
        Home4 = new javax.swing.JLabel();
        Back3 = new javax.swing.JLabel();
        LabPicker = new javax.swing.JComboBox<>();
        SubjectPicker = new javax.swing.JComboBox<>();
        DeleteId1 = new javax.swing.JLabel();
        DeleteId2 = new javax.swing.JLabel();
        DayPicker = new javax.swing.JComboBox<>();
        DeleteId3 = new javax.swing.JLabel();
        DeleteId4 = new javax.swing.JLabel();
        timePicker = new com.github.lgooddatepicker.components.TimePicker();
        AssignLabButton = new javax.swing.JButton();
        BackImage = new javax.swing.JLabel();

        DeleteButton1.setBackground(new java.awt.Color(153, 153, 153));
        DeleteButton1.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        DeleteButton1.setForeground(new java.awt.Color(0, 153, 102));
        DeleteButton1.setText("OK");
        DeleteButton1.setBorder(null);
        DeleteButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButton1MouseClicked(evt);
            }
        });
        DeleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButton1ActionPerformed(evt);
            }
        });

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

        Title.setText("LABS");
        Title.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 153, 102));

        LecturerImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/labMid.jpg"))); // NOI18N

        AddLab.setText("New  Labs");
        AddLab.setActionCommand("New Lecturer");
        AddLab.setBackground(new java.awt.Color(153, 153, 153));
        AddLab.setBorder(null);
        AddLab.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        AddLab.setForeground(new java.awt.Color(0, 153, 102));
        AddLab.setToolTipText("");
        AddLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddLabMouseClicked(evt);
            }
        });
        AddLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLabActionPerformed(evt);
            }
        });

        DeleteLab.setText("Delete");
        DeleteLab.setBackground(new java.awt.Color(153, 153, 153));
        DeleteLab.setBorder(null);
        DeleteLab.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        DeleteLab.setForeground(new java.awt.Color(0, 153, 102));
        DeleteLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteLabMouseClicked(evt);
            }
        });
        DeleteLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteLabActionPerformed(evt);
            }
        });

        ShowLab.setText("View");
        ShowLab.setBackground(new java.awt.Color(153, 153, 153));
        ShowLab.setBorder(null);
        ShowLab.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        ShowLab.setForeground(new java.awt.Color(0, 153, 102));
        ShowLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowLabMouseClicked(evt);
            }
        });
        ShowLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowLabActionPerformed(evt);
            }
        });

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home.setText("Home");
        Home.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Home.setForeground(new java.awt.Color(0, 153, 102));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        AssignLab.setText("Assign Labs");
        AssignLab.setActionCommand("New Lecturer");
        AssignLab.setBackground(new java.awt.Color(153, 153, 153));
        AssignLab.setBorder(null);
        AssignLab.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        AssignLab.setForeground(new java.awt.Color(0, 153, 102));
        AssignLab.setToolTipText("");
        AssignLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AssignLabMouseClicked(evt);
            }
        });
        AssignLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignLabActionPerformed(evt);
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
                        .addComponent(LecturerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DeleteLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddLab, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(ShowLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(FrontPaneLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(Title))
                            .addComponent(AssignLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addGap(109, 109, 109))))
        );
        FrontPaneLayout.setVerticalGroup(
            FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrontPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home)
                .addGap(53, 53, 53)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LecturerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FrontPaneLayout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(31, 31, 31)
                        .addComponent(ShowLab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(AddLab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteLab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AssignLab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        BackSmallPane.add(FrontPane, "card2");

        DeletePane.setBackground(new java.awt.Color(204, 255, 204));
        DeletePane.setMaximumSize(new java.awt.Dimension(600, 400));
        DeletePane.setMinimumSize(new java.awt.Dimension(600, 400));
        DeletePane.setPreferredSize(new java.awt.Dimension(600, 400));

        DeleteTitle.setText("DELETE LAB");
        DeleteTitle.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        DeleteTitle.setForeground(new java.awt.Color(0, 153, 102));

        DeleteId.setText("Lab Id :");
        DeleteId.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        DeleteId.setForeground(new java.awt.Color(102, 102, 102));

        DeleteIdLabel.setBorder(null);
        DeleteIdLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteIdLabelActionPerformed(evt);
            }
        });

        DeleteButton.setText("OK");
        DeleteButton.setBackground(new java.awt.Color(153, 153, 153));
        DeleteButton.setBorder(null);
        DeleteButton.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(0, 153, 102));
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

        Back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        Back1.setText("Back");
        Back1.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Back1.setForeground(new java.awt.Color(0, 153, 102));
        Back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back1MouseClicked(evt);
            }
        });

        Home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home1.setText("Home");
        Home1.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Home1.setForeground(new java.awt.Color(0, 153, 102));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        ShowTitle1.setText("VIEW LABS");
        ShowTitle1.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        ShowTitle1.setForeground(new java.awt.Color(0, 153, 102));

        ShowId1.setText("Lab Id :");
        ShowId1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        ShowId1.setForeground(new java.awt.Color(102, 102, 102));

        ShowIdLabel1.setBorder(null);
        ShowIdLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowIdLabel1ActionPerformed(evt);
            }
        });

        OkButton1.setText("OK");
        OkButton1.setBackground(new java.awt.Color(153, 153, 153));
        OkButton1.setBorder(null);
        OkButton1.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        OkButton1.setForeground(new java.awt.Color(0, 153, 102));
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

        LabsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "Lab ID", "Subject"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        showLecturersPane.setViewportView(LabsTable);

        Back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        Back2.setText("Back");
        Back2.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Back2.setForeground(new java.awt.Color(0, 153, 102));
        Back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back2MouseClicked(evt);
            }
        });

        Home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home2.setText("Home");
        Home2.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Home2.setForeground(new java.awt.Color(0, 153, 102));
        Home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home2MouseClicked(evt);
            }
        });

        LabsTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lab ID", "Building", "Floor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        showLecturerPane.setViewportView(LabsTable1);

        DayPicker1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday" }));

        dateSelectButton.setText("OK");
        dateSelectButton.setBackground(new java.awt.Color(153, 153, 153));
        dateSelectButton.setBorder(null);
        dateSelectButton.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        dateSelectButton.setForeground(new java.awt.Color(0, 153, 102));
        dateSelectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateSelectButtonMouseClicked(evt);
            }
        });
        dateSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateSelectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShowPaneLayout = new javax.swing.GroupLayout(ShowPane);
        ShowPane.setLayout(ShowPaneLayout);
        ShowPaneLayout.setHorizontalGroup(
            ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(showLecturersPane, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(ShowPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowPaneLayout.createSequentialGroup()
                        .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ShowPaneLayout.createSequentialGroup()
                                .addComponent(showLecturerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowPaneLayout.createSequentialGroup()
                                .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(OkButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ShowPaneLayout.createSequentialGroup()
                                        .addComponent(ShowId1)
                                        .addGap(29, 29, 29)
                                        .addComponent(ShowIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(133, 133, 133)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShowPaneLayout.createSequentialGroup()
                        .addComponent(DayPicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateSelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(5, 5, 5)
                .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateSelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DayPicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showLecturersPane, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowPaneLayout.createSequentialGroup()
                        .addGroup(ShowPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ShowIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ShowId1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OkButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(showLecturerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        BackSmallPane.add(ShowPane, "card3");

        BackPane.add(BackSmallPane, "card2");

        AddLabPane.setBackground(new java.awt.Color(204, 255, 204));
        AddLabPane.setMaximumSize(new java.awt.Dimension(600, 400));
        AddLabPane.setMinimumSize(new java.awt.Dimension(600, 400));
        AddLabPane.setPreferredSize(new java.awt.Dimension(600, 400));

        AddTitle.setText("ADD LAB");
        AddTitle.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        AddTitle.setForeground(new java.awt.Color(0, 153, 102));

        Name.setText("Lab ID :");
        Name.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(102, 102, 102));

        LabIdLabel.setBorder(null);
        LabIdLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabIdLabelActionPerformed(evt);
            }
        });

        SubmitNewLab.setText("Submit");
        SubmitNewLab.setBackground(new java.awt.Color(153, 153, 153));
        SubmitNewLab.setBorder(null);
        SubmitNewLab.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        SubmitNewLab.setForeground(new java.awt.Color(0, 153, 102));
        SubmitNewLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitNewLabActionPerformed(evt);
            }
        });

        Room.setText("Building :");
        Room.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Room.setForeground(new java.awt.Color(102, 102, 102));

        LabBuildingLabel.setBorder(null);
        LabBuildingLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabBuildingLabelActionPerformed(evt);
            }
        });

        Home3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home3.setText("Home");
        Home3.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Home3.setForeground(new java.awt.Color(0, 153, 102));
        Home3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home3MouseClicked(evt);
            }
        });

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        Back.setText("Back");
        Back.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 153, 102));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        Location.setText("Floor :");
        Location.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Location.setForeground(new java.awt.Color(102, 102, 102));

        LabFloorLabel.setBorder(null);
        LabFloorLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabFloorLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddLabPaneLayout = new javax.swing.GroupLayout(AddLabPane);
        AddLabPane.setLayout(AddLabPaneLayout);
        AddLabPaneLayout.setHorizontalGroup(
            AddLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLabPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home3)
                .addGap(18, 18, 18)
                .addComponent(Back)
                .addGap(21, 21, 21))
            .addGroup(AddLabPaneLayout.createSequentialGroup()
                .addGroup(AddLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddLabPaneLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(AddLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SubmitNewLab, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddLabPaneLayout.createSequentialGroup()
                                .addGroup(AddLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddLabPaneLayout.createSequentialGroup()
                                        .addGroup(AddLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Room)
                                            .addComponent(Name))
                                        .addGap(50, 50, 50))
                                    .addGroup(AddLabPaneLayout.createSequentialGroup()
                                        .addComponent(Location)
                                        .addGap(34, 34, 34)))
                                .addGroup(AddLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabFloorLabel)
                                    .addComponent(LabIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(LabBuildingLabel)))))
                    .addGroup(AddLabPaneLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(AddTitle)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        AddLabPaneLayout.setVerticalGroup(
            AddLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLabPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Home3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(AddTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AddLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Name)
                    .addComponent(LabIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(AddLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Location, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddLabPaneLayout.createSequentialGroup()
                        .addGroup(AddLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabBuildingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Room))
                        .addGap(18, 18, 18)
                        .addComponent(LabFloorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(SubmitNewLab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        BackPane.add(AddLabPane, "card3");

        AssignLabPane.setBackground(new java.awt.Color(204, 255, 204));
        AssignLabPane.setMaximumSize(new java.awt.Dimension(600, 400));
        AssignLabPane.setMinimumSize(new java.awt.Dimension(600, 400));

        AddTitle1.setText("ASSIGN LAB");
        AddTitle1.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        AddTitle1.setForeground(new java.awt.Color(0, 153, 102));

        Home4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home4.setText("Home");
        Home4.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Home4.setForeground(new java.awt.Color(0, 153, 102));
        Home4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home4MouseClicked(evt);
            }
        });

        Back3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        Back3.setText("Back");
        Back3.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        Back3.setForeground(new java.awt.Color(0, 153, 102));
        Back3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back3MouseClicked(evt);
            }
        });

        LabPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        SubjectPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        SubjectPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectPickerActionPerformed(evt);
            }
        });

        DeleteId1.setText("Lab Id :");
        DeleteId1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        DeleteId1.setForeground(new java.awt.Color(102, 102, 102));

        DeleteId2.setText("Subject :");
        DeleteId2.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        DeleteId2.setForeground(new java.awt.Color(102, 102, 102));

        DayPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday" }));

        DeleteId3.setText("Day of week :");
        DeleteId3.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        DeleteId3.setForeground(new java.awt.Color(102, 102, 102));

        DeleteId4.setText("Time :");
        DeleteId4.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        DeleteId4.setForeground(new java.awt.Color(102, 102, 102));

        AssignLabButton.setText("Submit");
        AssignLabButton.setBackground(new java.awt.Color(153, 153, 153));
        AssignLabButton.setBorder(null);
        AssignLabButton.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        AssignLabButton.setForeground(new java.awt.Color(0, 153, 102));
        AssignLabButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AssignLabButtonMouseClicked(evt);
            }
        });
        AssignLabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignLabButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AssignLabPaneLayout = new javax.swing.GroupLayout(AssignLabPane);
        AssignLabPane.setLayout(AssignLabPaneLayout);
        AssignLabPaneLayout.setHorizontalGroup(
            AssignLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssignLabPaneLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(AddTitle1)
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AssignLabPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Home4)
                .addGap(18, 18, 18)
                .addComponent(Back3)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AssignLabPaneLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(AssignLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AssignLabButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AssignLabPaneLayout.createSequentialGroup()
                        .addGroup(AssignLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AssignLabPaneLayout.createSequentialGroup()
                                .addComponent(DeleteId1)
                                .addGap(18, 18, 18))
                            .addGroup(AssignLabPaneLayout.createSequentialGroup()
                                .addGroup(AssignLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DeleteId2)
                                    .addComponent(DeleteId3)
                                    .addComponent(DeleteId4))
                                .addGap(18, 18, 18)))
                        .addGroup(AssignLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SubjectPicker, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabPicker, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DayPicker, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addGap(188, 188, 188))
        );
        AssignLabPaneLayout.setVerticalGroup(
            AssignLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssignLabPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AssignLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back3)
                    .addComponent(Home4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(AddTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AssignLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteId1))
                .addGap(18, 18, 18)
                .addGroup(AssignLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubjectPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteId2))
                .addGap(18, 18, 18)
                .addGroup(AssignLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DayPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteId3))
                .addGap(18, 18, 18)
                .addGroup(AssignLabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteId4)
                    .addComponent(timePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(AssignLabButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        BackPane.add(AssignLabPane, "card3");

        getContentPane().add(BackPane);
        BackPane.setBounds(0, 0, 600, 400);

        BackImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        BackImage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        getContentPane().add(BackImage);
        BackImage.setBounds(0, 0, 600, 405);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void AddLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLabActionPerformed
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();
        
        BackPane.add(AddLabPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_AddLabActionPerformed

    private void DeleteLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteLabActionPerformed
        BackSmallPane.removeAll();
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
        
        BackSmallPane.add(DeletePane);
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
    }//GEN-LAST:event_DeleteLabActionPerformed

    private void AddLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLabMouseClicked
        //ImageIcon click=new ImageIcon(getClass().getResource(""));
     
        //AddStudent.setIcon(null);
       
        
    }//GEN-LAST:event_AddLabMouseClicked

   
    private void ShowLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowLabActionPerformed

        BackSmallPane.removeAll();
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
        
        BackSmallPane.add(ShowPane);
        BackSmallPane.repaint();
        BackSmallPane.revalidate();
    }//GEN-LAST:event_ShowLabActionPerformed

    private void DeleteLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteLabMouseClicked
        //DeleteStudent.setIcon(null);
       
    }//GEN-LAST:event_DeleteLabMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_HomeMouseClicked

    private void ShowLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowLabMouseClicked
        //DeleteStudent.setIcon(null);
        
    }//GEN-LAST:event_ShowLabMouseClicked

    private void ShowIdLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowIdLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowIdLabel1ActionPerformed

    private void OkButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OkButton1MouseClicked

    private void OkButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButton1ActionPerformed
        show_lab(ShowIdLabel1.getText());
    }//GEN-LAST:event_OkButton1ActionPerformed

    private void LabIdLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabIdLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabIdLabelActionPerformed

    private void SubmitNewLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitNewLabActionPerformed

       databaseConnect();

        Lab l=new Lab();

            
            l.setLabId(LabIdLabel.getText());
            l.setLabBuilding(LabBuildingLabel.getText());
            l.setLabFloor(LabFloorLabel.getText());
            
            
            try{
            String insert="INSERT INTO lab (lab_id,lab_building,lab_floor) VALUES(?,?,?)";
            pst = conn.prepareStatement(insert);
            pst.setString(1,l.getLabId());
            pst.setString(2,l.getLabBuilding());
            pst.setString(3,l.getLabFloor());
          
            
            pst.executeUpdate();

            
            JOptionPane.showMessageDialog(this,"Data row is successfully inserted to the table .");
            updateLabPickerComboBox();
            }
        
            catch(SQLException e){
                System.err.print(e);
            }
 
      
        
    }//GEN-LAST:event_SubmitNewLabActionPerformed

    private void DeleteIdLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteIdLabelActionPerformed
       
    }//GEN-LAST:event_DeleteIdLabelActionPerformed

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
       String id=DeleteIdLabel.getText();
       databaseConnect();
       
        try{
            
           
            String delete="DELETE FROM lab WHERE lab_id=?";
            pst = conn.prepareStatement(delete);
            pst.setString(1, id);
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

    private void LabBuildingLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabBuildingLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabBuildingLabelActionPerformed

    private void LabFloorLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabFloorLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabFloorLabelActionPerformed

    private void AssignLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssignLabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AssignLabMouseClicked

    private void AssignLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignLabActionPerformed
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();
       
        BackPane.add(AssignLabPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_AssignLabActionPerformed

    private void Home4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home4MouseClicked
        close();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_Home4MouseClicked

    private void Back3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back3MouseClicked
        BackPane.removeAll();
        BackPane.repaint();
        BackPane.revalidate();
       
        FrontPane.setBackground(new Color(204,255,204));
        BackPane.add(FrontPane);
        BackPane.repaint();
        BackPane.revalidate();
    }//GEN-LAST:event_Back3MouseClicked

    private void DeleteButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButton1MouseClicked

    private void DeleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButton1ActionPerformed

    private void AssignLabButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssignLabButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AssignLabButtonMouseClicked

    private void AssignLabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignLabButtonActionPerformed
        try
        {
            String sql = "INSERT INTO lab_assign(lab_id, s_code, date, time) VALUES(?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, (String)LabPicker.getSelectedItem());
            pst.setInt(2, Integer.parseInt((String)SubjectPicker.getSelectedItem()));
            pst.setString(3, (String)DayPicker.getSelectedItem());
            LocalTime time;
            time = timePicker.getTime();
            pst.setTime(4, java.sql.Time.valueOf(time));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Lab assigned successfully");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_AssignLabButtonActionPerformed

    private void SubjectPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectPickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubjectPickerActionPerformed

    private void dateSelectButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateSelectButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateSelectButtonMouseClicked

    private void dateSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateSelectButtonActionPerformed
       show_lab_schedule((String)DayPicker1.getSelectedItem());
    }//GEN-LAST:event_dateSelectButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LabForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new LabForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLab;
    private javax.swing.JPanel AddLabPane;
    private javax.swing.JLabel AddTitle;
    private javax.swing.JLabel AddTitle1;
    private javax.swing.JButton AssignLab;
    private javax.swing.JButton AssignLabButton;
    private javax.swing.JPanel AssignLabPane;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Back1;
    private javax.swing.JLabel Back2;
    private javax.swing.JLabel Back3;
    private javax.swing.JLabel BackImage;
    private javax.swing.JPanel BackPane;
    private javax.swing.JPanel BackSmallPane;
    private javax.swing.JComboBox<String> DayPicker;
    private javax.swing.JComboBox<String> DayPicker1;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton DeleteButton1;
    private javax.swing.JLabel DeleteId;
    private javax.swing.JLabel DeleteId1;
    private javax.swing.JLabel DeleteId2;
    private javax.swing.JLabel DeleteId3;
    private javax.swing.JLabel DeleteId4;
    public javax.swing.JTextField DeleteIdLabel;
    private javax.swing.JButton DeleteLab;
    private javax.swing.JPanel DeletePane;
    private javax.swing.JLabel DeleteTitle;
    private javax.swing.JPanel FrontPane;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home1;
    private javax.swing.JLabel Home2;
    private javax.swing.JLabel Home3;
    private javax.swing.JLabel Home4;
    private javax.swing.JTextField LabBuildingLabel;
    private javax.swing.JTextField LabFloorLabel;
    public javax.swing.JTextField LabIdLabel;
    private javax.swing.JComboBox<String> LabPicker;
    private javax.swing.JTable LabsTable;
    private javax.swing.JTable LabsTable1;
    private javax.swing.JLabel LecturerImage;
    private javax.swing.JLabel Location;
    private javax.swing.JLabel Name;
    private javax.swing.JButton OkButton1;
    private javax.swing.JLabel Room;
    private javax.swing.JLabel ShowId1;
    public javax.swing.JTextField ShowIdLabel1;
    private javax.swing.JButton ShowLab;
    private javax.swing.JPanel ShowPane;
    private javax.swing.JLabel ShowTitle1;
    private javax.swing.JComboBox<String> SubjectPicker;
    private javax.swing.JButton SubmitNewLab;
    private javax.swing.JLabel Title;
    private javax.swing.JButton dateSelectButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane showLecturerPane;
    private javax.swing.JScrollPane showLecturersPane;
    private com.github.lgooddatepicker.components.TimePicker timePicker;
    // End of variables declaration//GEN-END:variables
}
