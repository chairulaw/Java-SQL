/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.usas.semester.pkg2_2221026;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.*;
/**
 *
 * @author CHAIRULAW
 */
public class quiz_karyawan_2221026 extends javax.swing.JFrame {
public Connection conn;
public Statement cn;
    /**
     * Creates new form quiz_karyawan_2221026
     */
    public quiz_karyawan_2221026() {
        initComponents();
        tampil();
        bersih();
        cbdivisi.removeAllItems();
        cbdivisi.addItem("Marketing");
        cbdivisi.addItem("Keuangan");
        cbdivisi.addItem("Pemasaran");
        cbdivisi.addItem("IT");
    }
    
    public void koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/quiz_uas_2221026","root","");
            cn=conn.createStatement();
        }catch (Exception e){JOptionPane.showMessageDialog(null,"koneksi gagal.." + e);
        System.out.println(e.getMessage());
        }
    }
    
    void tampil(){
    DefaultTableModel tabelnyo = new DefaultTableModel();
    tabelnyo.addColumn("ID KARYAWAN");
    tabelnyo.addColumn("NAMA KARYAWAN");
    tabelnyo.addColumn("DIVISI");
    tabelnyo.addColumn("POSISI JABATAN");
    tabelnyo.addColumn("GAJI POKOK");
    tabelnyo.addColumn("TANGGAL MASUK");

    try{
        koneksi();
        String sql = "select * from quiz_2221026";
        ResultSet rs= cn.executeQuery(sql);
    while (rs.next()){
    tabelnyo.addRow(new Object[]{
    rs.getString(1),
    rs.getString(2),
    rs.getString(3),
    rs.getString(4),
    rs.getString(5),
    rs.getString(6),
    });
    }
    tabel.setModel(tabelnyo);

    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Terjadi Kesalahan!" + e);
        }
    }
    
    void bersih(){
    txtid.setText("");
    txtnama.setText("");
    cbdivisi.setSelectedItem("");
    txtjabatan.setText("");
    txtgapok.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtjabatan = new javax.swing.JTextField();
        txtgapok = new javax.swing.JTextField();
        txtcari = new javax.swing.JTextField();
        cbdivisi = new javax.swing.JComboBox<>();
        dtmasuk = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btsimpan = new javax.swing.JButton();
        btupdate = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();
        btkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DATA KARYAWAN");

        jLabel2.setText("ID KARYAWAN");

        jLabel3.setText("NAMA KARYAWAN");

        jLabel4.setText("DIVISI");

        jLabel5.setText("POSISI JABATAN");

        jLabel6.setText("GAJI POKOK");

        jLabel7.setText("TANGGAL MASUK");

        jLabel8.setText("CARI ID KARYAWAN");

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });

        cbdivisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        btsimpan.setText("SIMPAN");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        btupdate.setText("UPDATE");
        btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateActionPerformed(evt);
            }
        });

        bthapus.setText("HAPUS");
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });

        btkeluar.setText("KELUAR");
        btkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(jLabel1)
                .addContainerGap(443, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(128, 128, 128)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                            .addComponent(cbdivisi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(107, 107, 107)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtgapok, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                            .addComponent(dtmasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bthapus)
                    .addComponent(btsimpan)
                    .addComponent(btupdate)
                    .addComponent(btkeluar))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btsimpan))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btupdate)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbdivisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(bthapus)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtgapok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btkeluar))))
                    .addComponent(dtmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        try{
        koneksi();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        if (dtmasuk.getDate() != null) {
            String tanggal = dateFormat.format(dtmasuk.getDate());
            
        String sql= "insert into quiz_2221026 values ('"+ txtid.getText() +"','"+ 
                txtnama.getText() +"','"+ cbdivisi.getSelectedItem() +"','"+ txtjabatan.getText() +"','"+ 
                txtgapok.getText() +"','"+ tanggal +"')";
        cn.executeUpdate(sql);
        conn.close();
        tampil();
        bersih();
        }else{
        
        }
        JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Proses Penyimpanan Data Gagal" + e);
        }
    }//GEN-LAST:event_btsimpanActionPerformed

    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
        try{
        koneksi();
        String sql="Delete from quiz_2221026 where idkaryawan='"+ txtid.getText() +"'";
        cn.executeUpdate(sql);
        conn.close();
        tampil();
        bersih();
        
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Succes To Delete");
        }
    }//GEN-LAST:event_bthapusActionPerformed

    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateActionPerformed
try{
            koneksi();
            String sql="update quiz_2221026 set tanggalmasuk='"+ ((JTextField)dtmasuk.getDateEditor().getUiComponent()).getText()+"',namakaryawan='"+ txtnama.getText()+"',divisi='"+ 
                    cbdivisi.getSelectedItem()+"',posisi='"+ txtjabatan.getText()+"',gajipokok='"+ txtgapok.getText()+"' where idkaryawan='"+ 
                    txtid.getText()+"'";
            cn.executeUpdate(sql);
            conn.close();
            tampil();
            bersih();
            
            btsimpan.setEnabled(true);
            
      
            JOptionPane.showMessageDialog(null,"Data Berhasil Di Update");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Proses Update Gagal" + e);
        }
    }//GEN-LAST:event_btupdateActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int row = 0;
        if(evt.getClickCount ()==1){
        row = tabel.getSelectedRow();
        txtid.setText(tabel.getValueAt(row,0).toString());
        txtnama.setText(tabel.getValueAt(row,1).toString());
        cbdivisi.setSelectedItem(tabel.getValueAt(row,2).toString());
        txtjabatan.setText(tabel.getValueAt(row,3).toString());
        txtgapok.setText(tabel.getValueAt(row,4).toString());
        dtmasuk.setDateFormatString(tabel.getValueAt(row,5).toString());
        
        txtid.setEnabled(true);
        btsimpan.setEnabled(false);
        btupdate.setEnabled(true);
        bthapus.setEnabled(true);
        
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void btkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btkeluarActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        DefaultTableModel tabelnyo=new DefaultTableModel();
    tabelnyo.addColumn("ID KARYAWAN");
    tabelnyo.addColumn("NAMA KARYAWAN");
    tabelnyo.addColumn("DIVISI");
    tabelnyo.addColumn("POSISI JABATAN");
    tabelnyo.addColumn("GAJI POKOK");
    tabelnyo.addColumn("TANGGAL MASUK");

            
            try{
            koneksi();
            String sql = "Select * from quiz_2221026 where " +"idkaryawan ='" + txtcari.getText() + "' or " 
                    +"idkaryawan like '%" + txtcari.getText() + "%'";
        ResultSet rs = cn.executeQuery(sql);
        while (rs.next()) {
            tabelnyo.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
            });
        }
        tabel.setModel(tabelnyo);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan " + e);
        }
    }//GEN-LAST:event_txtcariActionPerformed

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
            java.util.logging.Logger.getLogger(quiz_karyawan_2221026.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz_karyawan_2221026.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz_karyawan_2221026.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz_karyawan_2221026.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz_karyawan_2221026().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btkeluar;
    private javax.swing.JButton btsimpan;
    private javax.swing.JButton btupdate;
    private javax.swing.JComboBox<String> cbdivisi;
    private com.toedter.calendar.JDateChooser dtmasuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtgapok;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtjabatan;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
