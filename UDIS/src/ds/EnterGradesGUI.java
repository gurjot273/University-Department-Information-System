package ds;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gurjot273
 */
import java.sql.*;
import student.Student;
import student.StudentCourseInformation;

//GUI window for entering Roll nuber,course id and course grades
public class EnterGradesGUI extends javax.swing.JFrame {

    /**
     * Creates new form EnterGradesGUI
     */
    private static final String rootUsername="root";
    private static final String rootPassword="password";
    private static final String conn_string="jdbc:mysql://localhost:3306/UDIS";
    private Connection conn;
    private String[] grades={"EX","A","B","C","D","P","F"};
    
    //opens enter grades GUI
    public EnterGradesGUI() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(137, 196, 244));
    }

    public boolean IsAnyFieldEmpty(){
        return jTextField1.getText().trim().length()==0 || jTextField2.getText().trim().length()==0 || jTextField3.getText().trim().length()==0; 
    }
    
    //checsks correctness of grade
    public boolean isGradeCorrect(){
        String temp=jTextField3.getText();
        boolean var=temp.equals("EX")||temp.equals("A")||temp.equals("B")||temp.equals("C")||temp.equals("D")||temp.equals("P")||temp.equals("F");
        return var;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("ENTER STUDENT GRADES");

        jLabel3.setText("Roll Number");

        jLabel5.setText("Course ID");

        jLabel6.setText("Grade");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel5, jLabel6});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel5, jLabel6});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //enters the grades
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.conn=null;
        try{
            conn= DriverManager.getConnection(conn_string, rootUsername, rootPassword);
            Statement st=(Statement) conn.createStatement();
            if(!IsAnyFieldEmpty())
            {
                if(this.isGradeCorrect()){
                    String query="SELECT * FROM ds";
                    ResultSet rs=st.executeQuery(query);
                    rs.next();
                    int semester=rs.getInt("semester");
                    int year=rs.getInt("ongoingYear");
                    query="SELECT * FROM students WHERE rollNumber='"+jTextField1.getText()+"'";
                    rs=st.executeQuery(query);
                    if(!rs.next()){
                        javax.swing.JOptionPane.showMessageDialog(getContentPane(),"Invalid Roll Number");
                    }else{
                        int studentId=rs.getInt("id");
                        query="SELECT * FROM courses WHERE courseId='"+jTextField2.getText()+"' AND studentId='"+studentId+"' AND year='"+year+"' AND semester='"+semester+"'";
                        rs=st.executeQuery(query);
                        if(!rs.next()){
                            javax.swing.JOptionPane.showMessageDialog(getContentPane(),"Invalid input for current semester");
                        }else{
                            query="UPDATE courses SET grade='"+jTextField3.getText().trim()+"' WHERE courseId='"+jTextField2.getText()+"' AND studentId='"+studentId+"' AND year='"+year+"' AND semester='"+semester+"'"; 
                            try{
                                st.executeUpdate(query);
                                query="SELECT * FROM students WHERE rollNumber='"+jTextField1.getText()+"'";
                                rs=st.executeQuery(query);
                                rs.next();
                                Student student=new Student();
                                student.rollNumber=rs.getString("rollNumber");
                                student.name=rs.getString("name");
                                student.ongoingSemester=rs.getInt("ongoingSemester");
                                student.emailAddress=rs.getString("email");
                                student.yearOfJoining=rs.getInt("yearOfJoining");
                                student.hallName=rs.getString("hall");
                                student.dateOfBirth=rs.getDate("dateOfBirth");
                                student.CGPA=rs.getFloat("CGPA");
                                student.address=rs.getString("address");
                                student.mobileNumber=rs.getString("mobileNumber");
                                new StudentCourseInformation(student).calculateGPA();
                                javax.swing.JOptionPane.showMessageDialog(getContentPane(),"Grade submitted successfully");
                            }catch(SQLException e){
                                javax.swing.JOptionPane.showMessageDialog(getContentPane(),"Error occurred.Try again");
                            }
                        }
                    }
                }else{
                    javax.swing.JOptionPane.showMessageDialog(getContentPane(),"Grade should be EX,A,B,C,D,P or F");
                }
                
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(getContentPane(),"Input fields cannot be empty or contain only spaces");
            }
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new DepartmentSecretaryGui().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(EnterGradesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterGradesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterGradesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterGradesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterGradesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
