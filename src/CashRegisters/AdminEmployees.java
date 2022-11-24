package CashRegisters;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Simeon Nikolov
 */
public class AdminEmployees extends javax.swing.JFrame {

    public Connect query = new Connect();
    DefaultTableModel tableModel;

    public AdminEmployees() {
        initComponents();
        this.setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) jTable1.getModel();
        fillFilterOptions();
        fillTable();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/CashRegisters/images/favicon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ЕМСИ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CashRegisters/images/plus.png"))); // NOI18N
        jButton1.setText("Добавяне");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CashRegisters/images/delete.png"))); // NOI18N
        jButton2.setText("Изтриване");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Избери---", "Покажи имена", "Покажи телефони", "Покажи имейли", "Покажи градове", "Покажи адреси" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Филтрирай:");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CashRegisters/images/edit.png"))); // NOI18N
        jButton3.setText("Редактиране");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Служители:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CashRegisters/images/team-big.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel3)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(58, 58, 58))
            .addComponent(jScrollPane1)
        );

        jMenu1.setText("Начало");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CashRegisters/images/cash-register.png"))); // NOI18N
        jMenuItem1.setText("Касови апарати");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CashRegisters/images/x-button.png"))); // NOI18N
        jMenuItem2.setText("Изход");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Желаете ли да излезете?", "Изход", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void fillTable() {
        tableModel.setNumRows(0);
        tableModel.setColumnCount(6);

        String headerValues[] = {"ID", "Име", "Телефон", "Имейл", "Град", "Адрес"};
        setHeaderValues(headerValues);

        String[] columnsNames = {"EmployeeID", "Name", "Telephone", "Email", "City", "Address"};

        ArrayList<String> data = query.select(columnsNames, "Employees");

        addRows(data);
    }

    private void fillFilterOptions() {
        jComboBox2.removeAllItems();

        jComboBox2.addItem("None");

        ArrayList<String> data = query.selectDistinct("City", "Employees");

        for (String item : data) {
            jComboBox2.addItem(item);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        AddEmployee form = new AddEmployee();
        form.setVisible(true);
        this.dispose();
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        AdminCashRegisters form = new AdminCashRegisters();
        form.setVisible(true);
        this.dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Избери ред от таблицата!", "Грешка", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = Integer.parseInt(tableModel.getValueAt(selectedRow, 0).toString());

        query.delete("EmployeeID", id, "Employees");

        tableModel.removeRow(selectedRow);
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        String filterValue = String.valueOf(jComboBox1.getSelectedItem());

        if (filterValue.contains("Избери")) {
            fillTable();
            return;
        }

        tableModel.setColumnCount(2);
        tableModel.setRowCount(0);

        String[] columnsNames = null;

        if ("Покажи имена".equals(filterValue)) {
            String headerValues[] = {"Id", "Name"};
            setHeaderValues(headerValues);

            columnsNames = new String[]{"EmployeeID", "Name"};
        } else if ("Покажи телефони".equals(filterValue)) {
            String headerValues[] = {"Id", "Telephone"};
            setHeaderValues(headerValues);

            columnsNames = new String[]{"EmployeeID", "Telephone"};
        } else if ("Покажи имейли".equals(filterValue)) {
            String headerValues[] = {"Id", "Email"};
            setHeaderValues(headerValues);

            columnsNames = new String[]{"EmployeeID", "Email"};
        } else if ("Покажи градове".equals(filterValue)) {
            String headerValues[] = {"Id", "City"};
            setHeaderValues(headerValues);

            columnsNames = new String[]{"EmployeeID", "City"};
        } else if ("Покажи адреси".equals(filterValue)) {
            String headerValues[] = {"Id", "Address"};
            setHeaderValues(headerValues);

            columnsNames = new String[]{"EmployeeID", "Address"};
        }

        ArrayList<String> data = query.select(columnsNames, "Employees");
        addRows(data);
    }

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
        tableModel.setNumRows(0);

        String headerValues[] = {"ID", "Име", "Телефон", "Имейл", "Град", "Адрес"};
        setHeaderValues(headerValues);

        String filterValue = String.valueOf(jComboBox2.getSelectedItem());

        String[] columnsNames = {"EmployeeID", "Name", "Telephone", "Email", "City", "Address"};

        if ("None".equals(filterValue)) {
            fillTable();
        } else {
            ArrayList<String> data = query.selectWhere(columnsNames, "Employees", "City", filterValue);
            addRows(data);
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        UpdateEmployee form = new UpdateEmployee();
        form.setVisible(true);
        this.dispose();
    }

    private void setHeaderValues(String[] title) {
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            TableColumn tableColumn = jTable1.getTableHeader().getColumnModel().getColumn(i);
            tableColumn.setHeaderValue(title[i]);
        }
    }

    private void addRows(ArrayList<String> data) {
        for (String row : data) {
            String[] tokens = row.split("---");
            tableModel.addRow(tokens);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEmployees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
