/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package mandioperator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vegetabletrading.ParabitDB;

/**
 *
 * @author HARSHIT
 */
public class PanchayatLinking extends javax.swing.JDialog {
    ParabitDB db1,db2;
    String id,mcode,state;

    /**
     * Creates new form VegetableSource
     */
    public PanchayatLinking(java.awt.Frame parent, boolean modal,String a, String b) {
        super(parent, modal);
        initComponents();
        id= a;
        mcode = b;
        
        db1 = new ParabitDB();
        try
        {
            db1.rs = db1.stm.executeQuery("select statename from statecode order by statename");
            
            while(db1.rs.next())
            {
                pstate.addItem(db1.rs.getString(1));
            }
        }catch(Exception e)
        {
            System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pcode = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        pgid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        poid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        poname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pno = new javax.swing.JTextField();
        pvillage = new javax.swing.JTextField();
        pstate = new javax.swing.JComboBox<>();
        pstreet = new javax.swing.JTextField();
        pblock = new javax.swing.JTextField();
        pdistrict = new javax.swing.JComboBox<>();
        pcolony = new javax.swing.JTextField();
        ptehsil = new javax.swing.JTextField();
        ppincode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vstable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pomobno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        poemail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel11.setText(" VEGETABLE SOURCE");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Panchayat ID");

        pcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcodeActionPerformed(evt);
            }
        });

        jLabel20.setText("Panchayat Government ID");

        jLabel5.setText("Panchayat Name");

        jLabel6.setText("Panchayat Operator ID");

        poid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poidActionPerformed(evt);
            }
        });

        jLabel7.setText("Panchayat Operator Name");

        jLabel3.setText("Panchayat No.");

        jLabel4.setText("City/Village");

        jLabel12.setText("State");

        jLabel16.setText("Street");

        jLabel17.setText("Block");

        jLabel21.setText("District");

        jLabel14.setText("Colony");

        jLabel15.setText("Tehsil");

        jLabel19.setText("PinCode");

        pstate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose State" }));
        pstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pstateActionPerformed(evt);
            }
        });

        pblock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pblockActionPerformed(evt);
            }
        });

        pdistrict.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose District" }));
        pdistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdistrictActionPerformed(evt);
            }
        });

        vstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mandi Id", "Panchayat ID", "Panchayat Govrenment ID", "Panchayat Name", "Panchayat Opt ID", "Panchayat Opt Name", "Panchayat Opt Mob No", "Panchayat Opt Email", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vstable);
        if (vstable.getColumnModel().getColumnCount() > 0) {
            vstable.getColumnModel().getColumn(0).setPreferredWidth(30);
            vstable.getColumnModel().getColumn(1).setPreferredWidth(45);
            vstable.getColumnModel().getColumn(8).setPreferredWidth(50);
        }

        jButton1.setText("Add More");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Panchayat Operator No.");

        jLabel8.setText("Panchayat Operator Email ID");

        poemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poemailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pcode, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(pstate, 0, 170, Short.MAX_VALUE)
                            .addComponent(pvillage)
                            .addComponent(pno)
                            .addComponent(poid, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(poemail, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pgid, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(pblock)
                            .addComponent(pstreet, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(poname)
                            .addComponent(pdistrict, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pname, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(pcolony)
                            .addComponent(ptehsil)
                            .addComponent(ppincode)
                            .addComponent(pomobno))))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(pgid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(poid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(poname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(pomobno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(poemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel16)
                    .addComponent(pstreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(pcolony, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pvillage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(pblock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(ptehsil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(pstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(pdistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(ppincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcodeActionPerformed

    private void poidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poidActionPerformed

    private void pstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pstateActionPerformed
        
        state = pstate.getSelectedItem().toString();
                
        db1 = new ParabitDB();
        try
        {
            db1.rs = db1.stm.executeQuery("select distinct distname from districtcode where statecode = (select statecode from statecode where statename = '" + state + "') order by distname");
            
            while(db1.rs.next())
            {
                pdistrict.addItem(db1.rs.getString(1));  
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_pstateActionPerformed

    private void pblockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pblockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pblockActionPerformed

    private void pdistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pdistrictActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String s0,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,add;
            
        s0 = mcode;        
        s1 = pcode.getText();
        s2 = pgid.getText();
        s3 = pname.getText();
        s4 = poid.getText();
        s5 = poname.getText();
        s6 = pomobno.getText();
        s7 = poemail.getText();
        s8 = pno.getText();
        s9 = pstreet.getText();
        s10 = pcolony.getText();
        s11 = pvillage.getText();
        s12 = pblock.getText();
        s13 = ptehsil.getText();
        s14 = (String)pstate.getSelectedItem();
        s15 = (String)pdistrict.getSelectedItem();
        s16 = ppincode.getText();
        add = s8 +","+ s9 +","+ s10 +","+ s11 +","+ s12 +","+ s13 +","+ s14 +","+ s15 +","+ s16;
        
        DefaultTableModel model = (DefaultTableModel)vstable.getModel();
        model.addRow(new Object[]{s0,s1,s2,s3,s4,s5,s6,s7,add});

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel model = (DefaultTableModel)vstable.getModel();
        
        try{            
            String att = "`MCode`, `PCode`, `PGovID`, `PName`, `POID`, `POName`, `POMobNo`, `PanchayatNo`, `POEmailID`, `Street`, `Colony`, `CityVillage`, `Block`, `Tehsil`, `Dist`, `State`, `Pincode`";   
            
            for(int i =0; i<model.getRowCount(); i++){
                String mancode = model.getValueAt(i, 0).toString();
                String pancode = model.getValueAt(i, 1).toString();
                String pangovid = model.getValueAt(i, 2).toString();
                String panname = model.getValueAt(i, 3).toString();
                String panoid = model.getValueAt(i, 4).toString();
                String panoname = model.getValueAt(i, 5).toString();
                String panomobno = model.getValueAt(i, 6).toString();
                String panoemailid = model.getValueAt(i, 7).toString();
                String address = model.getValueAt(i, 8).toString();
                
                String[] add = address.split(",");
                
                db2 = new ParabitDB();
                db2.rs = db2.stm.executeQuery("SELECT * FROM `vegetablesource` WHERE PCode = '"+ pancode +"'");
                boolean check = db2.rs.next();
                if(check){
                    JOptionPane.showMessageDialog(this,"Panchayat Code "+pancode+" Already registered...");    
                }else{
                    String val = mancode+"','"+pancode+"','"+pangovid+"','"+panname+"','"+panoid+"','"+panoname+"','"+panomobno+"','"+panoemailid+"','"+add[0]+"','"+add[1]+"','"+add[2]+"','"+add[3]+"','"+add[4]+"','"+add[5]+"','"+add[6]+"','"+add[7]+"','"+add[8];               
                    String query = "insert into vegetablesource ("+att+") values('"+val+"')";
                    System.out.println(query);
                    db1 = new ParabitDB();
                    db1.pst = db1.con.prepareStatement(query);
                    db1.pst.executeUpdate();
                }
            }
            JOptionPane.showMessageDialog(this,"Panchayat Linked Successfully..."); 
            this.setVisible(false);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"Fill All The Details...");
        }         

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void poemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poemailActionPerformed

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
            java.util.logging.Logger.getLogger(PanchayatLinking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanchayatLinking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanchayatLinking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanchayatLinking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String a = null;
                String b = null;
                PanchayatLinking dialog = new PanchayatLinking(new javax.swing.JFrame(), true,a,b);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pblock;
    private javax.swing.JTextField pcode;
    private javax.swing.JTextField pcolony;
    private javax.swing.JComboBox<String> pdistrict;
    private javax.swing.JTextField pgid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pno;
    private javax.swing.JTextField poemail;
    private javax.swing.JTextField poid;
    private javax.swing.JTextField pomobno;
    private javax.swing.JTextField poname;
    private javax.swing.JTextField ppincode;
    private javax.swing.JComboBox<String> pstate;
    private javax.swing.JTextField pstreet;
    private javax.swing.JTextField ptehsil;
    private javax.swing.JTextField pvillage;
    private javax.swing.JTable vstable;
    // End of variables declaration//GEN-END:variables
}
