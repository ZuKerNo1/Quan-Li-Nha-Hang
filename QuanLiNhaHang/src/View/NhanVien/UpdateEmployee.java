/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.NhanVien;

<<<<<<< HEAD
<<<<<<< HEAD
import Service.EmployeeService;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Employee;
=======
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
>>>>>>> DatBan
=======
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
>>>>>>> DangNhap

/**
 *
 * @author AD
 */
public class UpdateEmployee extends javax.swing.JFrame {
    Employee employee;
    EmployeeService serviceEmployee;
    /**
     * Creates new form UpdateEmployee
     */
    public UpdateEmployee(String id) throws SQLException {
        initComponents();
        serviceEmployee = new EmployeeService();
        employee = serviceEmployee.getEmployeeById(id);
        id_354.setText(employee.getId_354());
        name_354.setText(employee.getName_354());
        address_354.setText(employee.getAddress_354());
        dob_354.setText(employee.getDob_354());
        phone_354.setText(employee.getPhone_354());
        salary_354.setText(String.valueOf(employee.getSalary_354()));
        if("Nam".equals(employee.getGender_354())){
            male_354.isSelected();
        }else{
            female_354.isSelected();
        }
        if("Đang làm việc".equals(employee.getStatus_354())){
            working_354.isSelected();
        }else{
            leave_354.isSelected();
        }
        if("Phục vụ".equals(employee.getRole_354())){
            phucVu_354.isSelected();
        }else if("Đầu bếp".equals(employee.getRole_354())){
            dauBep_354.isSelected();
        }else if("Quản lí".equals(employee.getRole_354())){
            quanLy_354.isSelected();
        }else if("Bảo vệ".equals(employee.getRole_354())){
            baoVe_354.isSelected();
        }else if("Thu ngân".equals(employee.getRole_354())){
            thuNgan_354.isSelected();
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

        groupGender = new javax.swing.ButtonGroup();
        groupStatus = new javax.swing.ButtonGroup();
        groupRole = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        phone_354 = new com.raven.suportSwing.TextField();
        name_354 = new com.raven.suportSwing.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_354 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        salary_354 = new com.raven.suportSwing.TextField();
        jLabel3 = new javax.swing.JLabel();
        male_354 = new com.raven.suportSwing.RadioButtonCustom();
        female_354 = new com.raven.suportSwing.RadioButtonCustom();
        quanLy_354 = new com.raven.suportSwing.RadioButtonCustom();
        thuNgan_354 = new com.raven.suportSwing.RadioButtonCustom();
        jLabel4 = new javax.swing.JLabel();
        dob_354 = new com.raven.suportSwing.TextField();
        jLabel5 = new javax.swing.JLabel();
        working_354 = new com.raven.suportSwing.RadioButtonCustom();
        leave_354 = new com.raven.suportSwing.RadioButtonCustom();
        lblBirth = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        id_354 = new com.raven.suportSwing.TextField();
        jLabel1 = new javax.swing.JLabel();
        submitBtn_354 = new javax.swing.JButton();
        backBtn_354 = new javax.swing.JButton();
        phucVu_354 = new com.raven.suportSwing.RadioButtonCustom();
        baoVe_354 = new com.raven.suportSwing.RadioButtonCustom();
        dauBep_354 = new com.raven.suportSwing.RadioButtonCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        phone_354.setLabelText("Điện thoại");
        phone_354.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phone_354FocusGained(evt);
            }
        });

        name_354.setLabelText("Tên");
        name_354.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name_354FocusGained(evt);
            }
        });

        address_354.setColumns(20);
        address_354.setRows(5);
        jScrollPane1.setViewportView(address_354);

        jLabel2.setText("Địa chỉ");

        salary_354.setLabelText("Lương");
        salary_354.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                salary_354FocusGained(evt);
            }
        });

        jLabel3.setText("Giới tính");

        groupGender.add(male_354);
        male_354.setSelected(true);
        male_354.setText("Nam");

        groupGender.add(female_354);
        female_354.setText("Nữ");

        groupRole.add(quanLy_354);
        quanLy_354.setText("Quản lý");

        groupRole.add(thuNgan_354);
        thuNgan_354.setSelected(true);
        thuNgan_354.setText("Thu ngân");

        jLabel4.setText("Chức vụ");

        dob_354.setLabelText("Ngày sinh");
        dob_354.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dob_354FocusGained(evt);
            }
        });

        jLabel5.setText("Tình trạng");

        groupStatus.add(working_354);
        working_354.setSelected(true);
        working_354.setText("Đang làm việc");

        groupStatus.add(leave_354);
        leave_354.setText("Nghỉ làm");

        lblBirth.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblBirth.setForeground(new java.awt.Color(255, 51, 51));

        lblName.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 51, 51));

        lblPhone.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 51, 51));

        lblSalary.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblSalary.setForeground(new java.awt.Color(255, 51, 51));

        id_354.setEditable(false);
        id_354.setEnabled(false);
        id_354.setLabelText("ID");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/employee.png"))); // NOI18N
        jLabel1.setText("CHỈNH SỬA NHÂN VIÊN");

        submitBtn_354.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/submit.png"))); // NOI18N
        submitBtn_354.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn_354ActionPerformed(evt);
            }
        });

        backBtn_354.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        backBtn_354.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn_354ActionPerformed(evt);
            }
        });

        groupRole.add(phucVu_354);
        phucVu_354.setText("Phục vụ");

        groupRole.add(baoVe_354);
        baoVe_354.setText("Bảo vệ");

        groupRole.add(dauBep_354);
        dauBep_354.setText("Đầu bếp");

<<<<<<< HEAD
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(working_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(47, 47, 47)
                                .addComponent(leave_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(thuNgan_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(quanLy_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(phucVu_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1))
                        .addGap(0, 126, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(salary_354, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(lblSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(backBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(name_354, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phone_354, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_354, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(male_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(female_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(submitBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dob_354, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBirth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(86, 86, 86))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dauBep_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(baoVe_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
=======
        position_354.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        position_354.setForeground(new java.awt.Color(51, 51, 51));
        position_354.setText("CHỨC VỤ");

        salary_354.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salary_354.setForeground(new java.awt.Color(51, 51, 51));
        salary_354.setText("LƯƠNG");

        salaryText_354.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButton1.setText("Nam");

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButton2.setText("Nữ");

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đầu bếp", "Thu ngân", "Phục vụ", "Giữ xe", "Lao công", "Quản lí" }));

        javax.swing.GroupLayout mainPanel_354Layout = new javax.swing.GroupLayout(mainPanel_354);
        mainPanel_354.setLayout(mainPanel_354Layout);
        mainPanel_354Layout.setHorizontalGroup(
            mainPanel_354Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel_354Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(mainPanel_354Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel_354Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(mainPanel_354Layout.createSequentialGroup()
                            .addComponent(backBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submitBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(address_354)
                        .addGroup(mainPanel_354Layout.createSequentialGroup()
                            .addGroup(mainPanel_354Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idKH_354)
                                .addComponent(phoneNum_354))
                            .addGroup(mainPanel_354Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel_354Layout.createSequentialGroup()
                                    .addGap(0, 69, Short.MAX_VALUE)
                                    .addComponent(idKHText_354, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(name_354)
                                    .addGap(18, 18, 18)
                                    .addComponent(nameText_354, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(mainPanel_354Layout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addComponent(addressText_354))
                                .addGroup(mainPanel_354Layout.createSequentialGroup()
                                    .addGap(303, 303, 303)
                                    .addComponent(position_354)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel_354Layout.createSequentialGroup()
                            .addComponent(salary_354)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salaryText_354, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanel_354Layout.createSequentialGroup()
                        .addGroup(mainPanel_354Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneNumText_354, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanel_354Layout.createSequentialGroup()
                                .addComponent(dateOfBirth_354)
                                .addGap(18, 18, 18)
                                .addComponent(dateOfBirthText_354, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(sex_354)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)))
                .addContainerGap(46, Short.MAX_VALUE))
<<<<<<< HEAD
>>>>>>> DatBan
=======
>>>>>>> DangNhap
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dob_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(male_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(female_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(id_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(name_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(phone_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salary_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(thuNgan_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quanLy_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phucVu_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(leave_354, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(working_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(baoVe_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dauBep_354, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(backBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(submitBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
<<<<<<< HEAD
    private void phone_354FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phone_354FocusGained
        // TODO add your handling code here:
        lblPhone.setText("");
    }//GEN-LAST:event_phone_354FocusGained

    private void name_354FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_354FocusGained
        // TODO add your handling code here:
        lblName.setText("");
    }//GEN-LAST:event_name_354FocusGained

    private void salary_354FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_salary_354FocusGained
        // TODO add your handling code here:
        lblSalary.setText("");
    }//GEN-LAST:event_salary_354FocusGained

    private void dob_354FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dob_354FocusGained
        // TODO add your handling code here:
        lblBirth.setText("");
    }//GEN-LAST:event_dob_354FocusGained

    private void submitBtn_354ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn_354ActionPerformed
        // TODO add your handling code here:
        employee.setId_354(id_354.getText());
        employee.setName_354(name_354.getText());
        employee.setAddress_354(address_354.getText());
        employee.setPhone_354(phone_354.getText());
        employee.setDob_354(dob_354.getText());
        employee.setSalary_354(Double.valueOf(salary_354.getText()));
        // lay ra gia tri cho gender
        String gender = "";
        if(male_354.isSelected()){
            gender += "Nam";
        }else if(female_354.isSelected()){
            gender += "Nữ";
        }
        employee.setGender_354(gender);
        // lay ra gia tri cho role
        String role = "";
        if(phucVu_354.isSelected()){
            role += "Phục vụ";
        }else if(dauBep_354.isSelected()){
            role += "Đầu bếp";
        }else if(baoVe_354.isSelected()){
            role += "Bảo vệ";
        }else if(quanLy_354.isSelected()){
            role += "Quản lí";
        }else if(thuNgan_354.isSelected()){
            role += "Thu ngân";
        }
        employee.setRole_354(role);
        // lay ra gia  tri cho status
        String status = "";
        if(working_354.isSelected()){
            status += "Đang làm việc";
        }else if(leave_354.isSelected()){
            status += "Nghỉ làm";
        }
        employee.setStatus_354(status);
        try {
            serviceEmployee.updateEmployee(employee);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(UpdateEmployee.this, "Thay đổi thông tin nhân viên k thành công", "Lỗi", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(UpdateEmployee.this, "Thay đổi thông tin nhân viên thành công", "Thành công", JOptionPane.CLOSED_OPTION);
        try {
            new ViewEmployee().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_submitBtn_354ActionPerformed

=======
>>>>>>> DatBan
=======
>>>>>>> DangNhap
    private void backBtn_354ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn_354ActionPerformed

        try {
            // TODO add your handling code here:
            new ViewEmployee().setVisible(true);
        } catch (SQLException ex) {
<<<<<<< HEAD
<<<<<<< HEAD
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
=======
            Logger.getLogger(UpdateEmployee.class.getName()).log(Level.SEVERE, null, ex);
>>>>>>> DatBan
=======
            Logger.getLogger(UpdateEmployee.class.getName()).log(Level.SEVERE, null, ex);
>>>>>>> DangNhap
        }
        this.dispose();
    }//GEN-LAST:event_backBtn_354ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address_354;
    private javax.swing.JButton backBtn_354;
    private com.raven.suportSwing.RadioButtonCustom baoVe_354;
    private com.raven.suportSwing.RadioButtonCustom dauBep_354;
    private com.raven.suportSwing.TextField dob_354;
    private com.raven.suportSwing.RadioButtonCustom female_354;
    private javax.swing.ButtonGroup groupGender;
    private javax.swing.ButtonGroup groupRole;
    private javax.swing.ButtonGroup groupStatus;
    private com.raven.suportSwing.TextField id_354;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBirth;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSalary;
    private com.raven.suportSwing.RadioButtonCustom leave_354;
    private com.raven.suportSwing.RadioButtonCustom male_354;
    private com.raven.suportSwing.TextField name_354;
    private com.raven.suportSwing.TextField phone_354;
    private com.raven.suportSwing.RadioButtonCustom phucVu_354;
    private com.raven.suportSwing.RadioButtonCustom quanLy_354;
    private com.raven.suportSwing.TextField salary_354;
    private javax.swing.JButton submitBtn_354;
    private com.raven.suportSwing.RadioButtonCustom thuNgan_354;
    private com.raven.suportSwing.RadioButtonCustom working_354;
    // End of variables declaration//GEN-END:variables
}
