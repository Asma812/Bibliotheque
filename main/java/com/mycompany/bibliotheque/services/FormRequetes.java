/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bibliotheque.services;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class FormRequetes extends javax.swing.JFrame {
private DefaultTableModel tableModel;
    /**
     * Creates new form FormRequetes
     */
    public FormRequetes() {
        initComponents();
         addListeners();
         mettreAJourLivres();
         affichTable();
         tableModel = (DefaultTableModel) jTable1.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel5.setText("Livres empruntés");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Les mains sales" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Chercher");

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Livre_ID", "Livre_Titre", "Emprunteur"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Emprunteur");
        }

        jTable2.setBackground(new java.awt.Color(204, 204, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Emprunteur_ID", "Emprunteu_ Nom", "Emprunteur_Prénom", "Livre_ID", "Livre_Titre"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel4.setText("Livres disponibles");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Les mains sales" }));

        jButton2.setBackground(new java.awt.Color(204, 204, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Vérifier");

        jTable3.setBackground(new java.awt.Color(204, 204, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Livre_ID", "Livre_Titre"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton3.setBackground(new java.awt.Color(204, 204, 0));
        jButton3.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Abonnés");

        jButton4.setBackground(new java.awt.Color(204, 204, 0));
        jButton4.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Emprunt");

        jButton5.setBackground(new java.awt.Color(204, 204, 0));
        jButton5.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Livres");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(45, 45, 45)
                                .addComponent(jButton4)
                                .addGap(50, 50, 50)
                                .addComponent(jButton5))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63)
                            .addComponent(jButton1))))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed
    private void addListeners() {
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Code for button "Insertion"
                    String bookTitle = jComboBox2.getSelectedItem().toString();
                chercheMet(bookTitle);
            }
        });

        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                    String bookTitle = jComboBox3.getSelectedItem().toString();
                verifMet(bookTitle);
            }
        });

        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Code for button "Requetes"
                abonnésMet();
            }
        });

        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Code for button "Emprunt"
                emprunteMet(); 
            }
        });

        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Code for button "Modification"
               livreMet();
            }
        });

    }
    
    /**
     * @param args the command line arguments
     */
        public void chercheMet(String Titre) {
    Connection conn = null;
    PreparedStatement stmt1 = null;
    PreparedStatement stmt2 = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;

    try {
        // Open a connection to the database
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "root", "Classroom123");

        // Check if the book exists in the library
        String sql1 = "SELECT id, Titre FROM Livres WHERE Titre = ?";
        stmt1 = conn.prepareStatement(sql1);
        stmt1.setString(1, Titre);
        rs1 = stmt1.executeQuery();

        // Create the table model
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Titre");
        tableModel.addColumn("id");
        tableModel.addColumn("Nom");

        if (rs1.next()) {
            String idL = rs1.getString("id");
            String titre = rs1.getString("Titre");

            // Check if the book is borrowed
            String sql2 = "SELECT Abonnés.Nom FROM LivresEmpruntés, Abonnés WHERE LivresEmpruntés.Titre = ? AND Abonnés.id = LivresEmpruntés.idA";
            stmt2 = conn.prepareStatement(sql2);
            stmt2.setString(1, Titre);
            rs2 = stmt2.executeQuery();

            if (rs2.next()) {
                String nom = rs2.getString("Nom");
                Object[] row = { titre, idL, nom };
                tableModel.addRow(row);
                System.out.println("Le livre est emprunté par " + rs2.getString("nom"));
                    } else {
                        System.out.println("Le livre est disponible");
                    }
        }

        // Close the result sets and statements for both queries
        rs1.close();
        stmt1.close();
        rs2.close();
        stmt2.close();

        // Close the database connection
        conn.close();

        // Set the table model for display
        jTable1.setModel(tableModel);
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Close the result sets, statements, and database connection in the event of an exception
        try {
            if (rs1 != null) {
                rs1.close();
            }
            if (stmt1 != null) {
                stmt1.close();
            }
            if (rs2 != null) {
                rs2.close();
            }
            if (stmt2 != null) {
                stmt2.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

            
        public void verifMet(String id) {
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            try {
                // Open a connection to the database
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "root", "Classroom123");
                
                // Create a prepared statement to select a row from the Livres table based on titre
                String sql = "SELECT * FROM Livres WHERE Titre = ?";
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, id);
                
                // Execute the statement and get the result set
                rs = stmt.executeQuery();
                
                if (rs.next()) {
                    // Book exists in the database
                    int idL = rs.getInt("id");
                    
                    // Check if the book is available or not
                    String sql1 = "SELECT * FROM LivresEmpruntés WHERE idL = ?";
                    stmt = conn.prepareStatement(sql1);
                    stmt.setInt(1, idL);
                    
                    rs = stmt.executeQuery();
                    mettreAJourLivres();
                    if (rs.next()) {
                        // Book is not available
                        System.out.println("Livre n'est pas disponible.");
                    } else {
                        // Book is available
                        System.out.println("Livre est disponible.");
                    }
                } else {
                    // Book does not exist in the database
                    System.out.println("Livre n'existe pas.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Close the statement, result set, and database connection
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (stmt != null) {
                        stmt.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

public void emprunteMet() {
   
	EmprRetourForm formEmpret = new EmprRetourForm();
	formEmpret.setVisible(true);
}
public void livreMet() {
    
	   FormLivres formLivres = new FormLivres();
	   formLivres.setVisible(true);
}
public void abonnésMet() {
    
 	FormAbonnés formAbonnés = new FormAbonnés();
	formAbonnés.setVisible(true);
}
 public void mettreAJourLivres() {
    try {
        // Connectez-vous à la base de données et récupérez les livres
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "root", "Classroom123");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT Titre FROM Livres");

        // Effacez les anciens éléments du JComboBox
        jComboBox2.removeAllItems();
        jComboBox3.removeAllItems();
        // Ajoutez les nouveaux livres au JComboBox
        while (rs.next()) {
            String titre = rs.getString("Titre");
            jComboBox2.addItem(titre);
            jComboBox3.addItem(titre);
        }

        // Fermez la connexion à la base de données
        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
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
            java.util.logging.Logger.getLogger(FormRequetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRequetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRequetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRequetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRequetes().setVisible(true);
            }
        });
    }
public void affichTable() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "root", "Classroom123");

        // Retrieve data from the "LivresEmpruntés" table
        String selectQuery = "SELECT * FROM LivresEmpruntés";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(selectQuery);

        // Retrieve data from the "Livres" table
        String selectQuery2 = "SELECT * FROM Livres";
        Statement stmt2 = con.createStatement();
        ResultSet rs2 = stmt2.executeQuery(selectQuery2);

        // Populate the table model with the retrieved data for "LivresEmpruntés" table
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("idA");
        tableModel.addColumn("Nom");
        tableModel.addColumn("Prénom");
        tableModel.addColumn("idL");
        tableModel.addColumn("Titre");

        while (rs.next()) {
            String idA = rs.getString("idA");
            String nom = rs.getString("Nom");
            String prenom = rs.getString("Prénom");
            String idL = rs.getString("idL");
            String titre = rs.getString("Titre");
            Object[] row = { idA, nom, prenom, idL, titre };
            tableModel.addRow(row);
        }

        // Populate the table model with the retrieved data for "Livres" table
        DefaultTableModel tableModel2 = new DefaultTableModel();
        tableModel2.addColumn("id");
        tableModel2.addColumn("Titre");

        while (rs2.next()) {
            String id = rs2.getString("id");
            String titre = rs2.getString("Titre");
            Object[] row2 = { id, titre };
            tableModel2.addRow(row2);
        }

        // Close the database connections and resources
        rs.close();
        stmt.close();
        rs2.close();
        stmt2.close();
        con.close();

        // Set the table models for jTable2 and jTable3
        jTable2.setModel(tableModel);
        jTable3.setModel(tableModel2);
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}