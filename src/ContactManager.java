
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author workstation
 */
public class ContactManager extends javax.swing.JFrame {
    
    /**
     * Creates new form NewJFrame
     */
    public ContactManager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jFName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMinit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jNumber = new javax.swing.JTextField();
        jSearchButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jNotes = new javax.swing.JTextArea();
        jSaveButton = new javax.swing.JButton();
        jAddButton = new javax.swing.JButton();
        jEditButton = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jSchedule = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contact Manager");

        jLabel1.setText("FName");

        jLabel2.setText("MI");

        jLabel3.setText("LName");

        jLabel4.setText("Email");

        jLabel5.setText("Number");

        jSearchButton.setText("Search");
        jSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Notes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Contact_id", "FName", "MI", "LName", "Email", "Number", "Notes"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane3.setViewportView(jTable1);

        jNotes.setColumns(20);
        jNotes.setRows(5);
        jScrollPane4.setViewportView(jNotes);

        jSaveButton.setText("Save");
        jSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveButtonActionPerformed(evt);
            }
        });

        jAddButton.setText("Add");
        jAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddButtonActionPerformed(evt);
            }
        });

        jEditButton.setText("Edit");
        jEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditButtonActionPerformed(evt);
            }
        });

        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jClear.setText("Clear");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });

        jSchedule.setText("Add Schedule");
        jSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jScheduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(jEmail)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(8, 8, 8)
                                .addComponent(jFName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMinit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSearchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAddButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEditButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSaveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSchedule)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jMinit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearchButton)
                    .addComponent(jSaveButton)
                    .addComponent(jAddButton)
                    .addComponent(jEditButton)
                    .addComponent(jDelete)
                    .addComponent(jClear)
                    .addComponent(jSchedule))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchButtonActionPerformed
        // TODO add your handling code here:
        DBConnection conn = null;
        Connection connection = null;
        Statement statement = null;
            
        String fname = jFName.getText();
        String minit = jMinit.getText();
        String lname = jLName.getText();
        String notes = jNotes.getText();
        String phone_number = jNumber.getText();
        String email_id = jEmail.getText();
        
        HashMap HM = new HashMap();
        HM.put("fname",fname);
        HM.put("minit",minit);
        HM.put("lname",lname);
        HM.put("notes",notes);
        HM.put("phone_number", phone_number);
        HM.put("email_id", email_id);
        
        try
        {
            // method written to reduce code repetition
            conn = new DBConnection();
            connection = conn.connectDB();
            statement = connection.createStatement();

            String queryString = "select Contact.contact_id,fname,minit,lname,email_id,phone_number,notes "
                    + "from Contact,Phone_Number,Email_Address "
                    + "WHERE Contact.contact_id = Phone_Number.contact_id AND "
                    + "Contact.contact_id = Email_Address.contact_id";
            if(!"".equals(HM.get("fname")))
            {
                queryString += " AND fname="+"'"+HM.get("fname")+"'";
            }
            if(!"".equals(HM.get("minit")))
            {
                queryString += " AND minit="+"'"+HM.get("minit")+"'";
            }
            if(!"".equals(HM.get("lname")))
            {
                queryString += " AND lname="+"'"+HM.get("lname")+"'";
            }
            if(!"".equals(HM.get("notes")))
            {
                queryString += " AND notes="+"'"+HM.get("notes")+"'";
            }
            if(!"".equals(HM.get("phone_number")))
            {
                queryString += " AND phone_number="+"'"+HM.get("phone_number")+"'";
            }
            if(!"".equals(HM.get("email_id")))
            {
                queryString += " AND email_id="+"'"+HM.get("email_id")+"'";
            }

            ResultSet rs = statement.executeQuery(queryString);
            
            // It creates and displays the table
            jTable1 = new JTable(buildTableModel(rs));
            jScrollPane3.getViewport().add(jTable1);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jSearchButtonActionPerformed

/**
 * Something magical happens inside
*/  
public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);
}
    
/**
 * Another Magical Method
 * Not using anymore, but nice code. So keeping it
*/    
public static Statement getConnectionObject() {
    String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=Contact_Manager;integratedSecurity=true";
    Statement statement = null;
    try
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(url);
        System.out.println("connected");
        statement = conn.createStatement();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return statement;
}

    private void jSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveButtonActionPerformed
        // TODO add your handling code here:
     DBConnection conn = null;
     Connection connection = null;
     Statement statement = null;
     try{
        String fname = jFName.getText();
        String minit = jMinit.getText();
        String lname = jLName.getText();
        String notes = jNotes.getText();
        String phone_number = jNumber.getText();
        String email_id = jEmail.getText();
        if("".equals(fname) || "".equals(phone_number)){
            throw new NullPointerException();
        }

        conn = new DBConnection();
        connection = conn.connectDB();
        statement = connection.createStatement();
        int[] row_indexes=jTable1.getSelectedRows();
        if(row_indexes.length != 1){
                throw new ArrayIndexOutOfBoundsException();
        }
        int sequence = Integer.parseInt(jTable1.getValueAt(row_indexes[0], 0).toString());

        String queryString1 = "UPDATE Contact SET fname=?,minit=?,lname=?,notes=? WHERE contact_id=?";
        String queryString2 = "UPDATE Email_Address SET email_id=? WHERE contact_id=?";
        String queryString3 = "UPDATE Phone_Number SET phone_number=? WHERE contact_id=?";

        PreparedStatement pstmt1 = connection.prepareStatement(queryString1);
        pstmt1.setString(1, fname);
        pstmt1.setString(2, minit); 
        pstmt1.setString(3, lname);
        pstmt1.setString(4, notes);
        pstmt1.setInt(5, sequence);
        pstmt1.executeUpdate();
            
        PreparedStatement pstmt2 = connection.prepareStatement(queryString2);
        pstmt2.setString(1, email_id);
        pstmt2.setInt(2, sequence);
        pstmt2.executeUpdate();

        PreparedStatement pstmt3 = connection.prepareStatement(queryString3);
        pstmt3.setString(1, phone_number);
        pstmt3.setInt(2, sequence);
        pstmt3.executeUpdate();
        
        // Clearing the FORM
        clear();
        
        // Update Table
        refreshView(statement);

        }

        catch (NullPointerException ne)
        {
            // e.printStackTrace();
            JOptionPane.showMessageDialog(null, "FName or Mobile cannot be empty");
        }
        catch (ArrayIndexOutOfBoundsException oobe)
        {
            // e.printStackTrace();
            // TODO: Something
            JOptionPane.showMessageDialog(null, "Select only 1 row to Edit first then Save");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jSaveButtonActionPerformed

    private void jAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddButtonActionPerformed
        DBConnection conn = null;
        Connection connection = null;
        Statement statement = null;
        String querySequence = "SELECT NEXT VALUE FOR dbo.cmsequence;";
        int sequence = 0;
        try{
            // Reading values from UI
            String fname = jFName.getText();
            String minit = jMinit.getText();
            String lname = jLName.getText();
            String notes = jNotes.getText();
            String phone_number = jNumber.getText();
            String email_id = jEmail.getText();

            if("".equals(fname) || "".equals(phone_number)){
                throw new NullPointerException();
            }
            
            conn = new DBConnection();
            connection = conn.connectDB();
            statement = connection.createStatement();
            
            ResultSet rs = statement.executeQuery(querySequence);
            //int sequence = rs.getInt(1);
            //System.out.println(sequence);
            while (rs.next())
            {
                sequence = rs.getInt(1);
                System.out.println("sequence:"+sequence);
            }
            
            java.util.Date utilDate = new java.util.Date();
            java.sql.Date sqlDOB = new java.sql.Date(utilDate.getTime());
            
            String queryString1 = "INSERT INTO Contact VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt1 = connection.prepareStatement(queryString1);
            pstmt1.setInt(1, sequence);
            pstmt1.setString(2, sqlDOB.toString()); 
            pstmt1.setString(3, notes);
            pstmt1.setNull(4, Types.INTEGER);
            pstmt1.setNull(5, Types.DATE);
            pstmt1.setString(6, fname);
            pstmt1.setString(7, minit);
            pstmt1.setString(8, lname);
            pstmt1.executeUpdate();
                
            String queryString2 = "INSERT INTO Email_Address VALUES(?,?,?)";
            PreparedStatement pstmt2 = connection.prepareStatement(queryString2);
            pstmt2.setString(1, email_id);
            pstmt2.setInt(2,sequence); 
            pstmt2.setString(3, "");
            pstmt2.executeUpdate();
           
            String queryString3 = "INSERT INTO Phone_Number VALUES(?,?,?)";
            PreparedStatement pstmt3 = connection.prepareStatement(queryString3);
            pstmt3.setString(1, phone_number);
            pstmt3.setString(2,"");
            pstmt3.setInt(3, sequence);
            pstmt3.executeUpdate();
            
            // Clearing the FORM
            clear();
        
            // Update Table
            refreshView(statement);
        }
        
        catch (NullPointerException ne)
        {
            // e.printStackTrace();
            JOptionPane.showMessageDialog(null, "FName or Mobile cannot be empty");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jAddButtonActionPerformed

    private void jEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditButtonActionPerformed
        int[] row_indexes=jTable1.getSelectedRows();
        try{
            if(row_indexes.length != 1){
                throw new NullPointerException();
            }
            jFName.setText(String.valueOf(jTable1.getValueAt(row_indexes[0], 1)));
            jMinit.setText(String.valueOf(jTable1.getValueAt(row_indexes[0], 2)));
            jLName.setText(String.valueOf(jTable1.getValueAt(row_indexes[0], 3)));
            jEmail.setText(String.valueOf(jTable1.getValueAt(row_indexes[0], 4)));
            jNumber.setText(String.valueOf(jTable1.getValueAt(row_indexes[0], 5)));
            jNotes.setText(String.valueOf(jTable1.getValueAt(row_indexes[0], 6)));
            //jTextField2.setText(jTable1.getValueAt(row_indexes[0], 6).toString());
        }
        
        catch (NullPointerException ne)
        {
            // e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Select only 1 row to edit");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            // TODO: Something
        }
    }//GEN-LAST:event_jEditButtonActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        DBConnection conn = null;
        Connection connection = null;
        Statement statement = null;
        
        try{
            int[] row_indexes=jTable1.getSelectedRows();
            int sequence = Integer.parseInt(jTable1.getValueAt(row_indexes[0], 0).toString());
            System.out.println("sequence:"+sequence);
            if(row_indexes.length != 1){
                throw new NullPointerException();
            }
            conn = new DBConnection();
            connection = conn.connectDB();
            statement = connection.createStatement();

            String queryString1 = "DELETE FROM Email_Address WHERE contact_id = ?";
            PreparedStatement pstmt1 = connection.prepareStatement(queryString1); 
            pstmt1.setInt(1, sequence);
            pstmt1.executeUpdate();
            
            String queryString2 = "DELETE FROM Phone_Number WHERE contact_id = ?";
            PreparedStatement pstmt2 = connection.prepareStatement(queryString2); 
            pstmt2.setInt(1, sequence);
            pstmt2.executeUpdate(); 
            
            String queryString3 = "DELETE FROM Contact WHERE contact_id = ?";
            PreparedStatement pstmt3 = connection.prepareStatement(queryString3); 
            pstmt3.setInt(1, sequence);
            pstmt3.executeUpdate(); 
            
            String queryString4 = "DELETE FROM Schedule WHERE contact_id = ?";
            PreparedStatement pstmt4 = connection.prepareStatement(queryString4); 
            pstmt4.setInt(1, sequence);
            pstmt4.executeUpdate(); 
            
            // Clearing the FORM
            clear();

            // Update Table
            refreshView(statement);
        }
        catch (NullPointerException ne)
        {
            // e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Select only 1 row to delete");
        }
        catch (ArrayIndexOutOfBoundsException oobe)
        {
            // e.printStackTrace();
            // TODO: Something
            JOptionPane.showMessageDialog(null, "Select only 1 row to delete");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            // TODO: Something
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        clear();
    }//GEN-LAST:event_jClearActionPerformed

    private void jScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jScheduleActionPerformed
        // TODO add your handling code here:
        try{
            int[] row_indexes=jTable1.getSelectedRows();
            if(row_indexes.length != 1){
                throw new NullPointerException();
            }
            int sequence = Integer.parseInt(jTable1.getValueAt(row_indexes[0], 0).toString());
            System.out.println("sequence:"+sequence);
            Schedule sch = new Schedule(sequence);
            sch.setVisible(true);
        }
        catch (NullPointerException ne)
        {
            // e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Select only 1 row to add a schedule");
        }
        catch (ArrayIndexOutOfBoundsException oobe)
        {
            // e.printStackTrace();
            // TODO: Something
            JOptionPane.showMessageDialog(null, "Select only 1 row to delete");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            // TODO: Something
        }
    }//GEN-LAST:event_jScheduleActionPerformed

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
            java.util.logging.Logger.getLogger(ContactManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactManager().setVisible(true);
            }
        });
    }
    
    // Method to clear the Form
    public void clear(){
        jFName.setText("");
        jMinit.setText("");
        jLName.setText("");
        jEmail.setText("");
        jNumber.setText("");
        jNotes.setText("");
    }
    
    // Method to display fresh data
    public void refreshView(Statement statement){
        try{
            String queryString = "select Contact.contact_id,fname,minit,lname,email_id,phone_number,notes "
                    + "from Contact,Phone_Number,Email_Address "
                    + "WHERE Contact.contact_id = Phone_Number.contact_id AND "
                    + "Contact.contact_id = Email_Address.contact_id";
            ResultSet rs = statement.executeQuery(queryString);
            jTable1 = new JTable(buildTableModel(rs));
            jScrollPane3.getViewport().add(jTable1);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            // TODO: Something
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddButton;
    private javax.swing.JButton jClear;
    private javax.swing.JButton jDelete;
    private javax.swing.JButton jEditButton;
    private javax.swing.JTextField jEmail;
    private javax.swing.JTextField jFName;
    private javax.swing.JTextField jLName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jMinit;
    private javax.swing.JTextArea jNotes;
    private javax.swing.JTextField jNumber;
    private javax.swing.JButton jSaveButton;
    private javax.swing.JButton jSchedule;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jSearchButton;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
