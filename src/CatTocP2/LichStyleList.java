/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatTocP2;

import Conn.MyConnect;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import static sun.net.www.MimeTable.loadTable;

/**
 *
 * @author Nguyen Duc Thao
 */
public class LichStyleList extends javax.swing.JPanel {

    /**
     * Creates new form LichStyleList
     */
    Connection cn;
    DefaultTableModel model;
    String User;
    Calendar cal = Calendar.getInstance();
    int d = cal.get(Calendar.DAY_OF_MONTH);
    int m = (cal.get(Calendar.MONTH) + 1);
    int y = cal.get(Calendar.YEAR);
    public LichStyleList(String U) {
        initComponents();
        cn = MyConnect.ketnoi("DATLICH_HAIRS");
        User = U;
        model = (DefaultTableModel) jTable1.getModel();
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(46, 125, 50));
        jTable1.getTableHeader().setForeground(new Color(221, 44, 0));
        jTable1.setRowHeight(25);
        model.setColumnIdentifiers(new Object[]{"Tên Khách Hàng", "Dịch Vụ", "Cơ Sở", "Giờ Cắt", "Ngày Cắt"});
        loadToTable();

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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnNgaymai = new javax.swing.JButton();
        btnHomnay = new javax.swing.JButton();
        btnNgaykia = new javax.swing.JButton();

        setBackground(new java.awt.Color(197, 225, 165));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LỊCH LÀM STYLE LIST");

        jPanel1.setBackground(new java.awt.Color(197, 225, 165));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(197, 225, 165));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(102, 153, 0));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        btnNgaymai.setBackground(new java.awt.Color(255, 102, 102));
        btnNgaymai.setText("Ngày mai");
        btnNgaymai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNgaymaiActionPerformed(evt);
            }
        });

        btnHomnay.setBackground(new java.awt.Color(255, 102, 102));
        btnHomnay.setText("Hôm nay");
        btnHomnay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomnayActionPerformed(evt);
            }
        });

        btnNgaykia.setBackground(new java.awt.Color(255, 102, 102));
        btnNgaykia.setText("Ngày kia");
        btnNgaykia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNgaykiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnHomnay)
                        .addGap(18, 18, 18)
                        .addComponent(btnNgaymai)
                        .addGap(18, 18, 18)
                        .addComponent(btnNgaykia)
                        .addGap(293, 293, 293))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHomnay)
                    .addComponent(btnNgaymai)
                    .addComponent(btnNgaykia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomnayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomnayActionPerformed
        // TODO add your handling code here:
        try {
                model.setRowCount(0);
                PreparedStatement ps = cn.prepareStatement("SELECT KHACHHANG.HOTEN,TENDV,COSO.DIACHI,GIO,NGAY FROM KHACHHANG INNER JOIN DATLICH ON\n"
                        + "KHACHHANG.USENAMES=DATLICH.USENAMES INNER JOIN STYLELIST ON\n"
                        + "DATLICH.USENAMEST=STYLELIST.USENAMES INNER JOIN COSO ON\n"
                        + "STYLELIST.MACS=COSO.MACS WHERE USENAMEST=? AND NGAY=? AND STATUSS=?");
                ps.setString(1, User);
                ps.setString(2, d+"-"+m+"-"+y);
                ps.setString(3, "Chưa Hoàn Thành");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                }

            } catch (Exception e) {
            }
    }//GEN-LAST:event_btnHomnayActionPerformed

    private void btnNgaymaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNgaymaiActionPerformed
        // TODO add your handling code here:
        try {
                model.setRowCount(0);
                PreparedStatement ps = cn.prepareStatement("SELECT KHACHHANG.HOTEN,TENDV,COSO.DIACHI,GIO,NGAY FROM KHACHHANG INNER JOIN DATLICH ON\n"
                        + "KHACHHANG.USENAMES=DATLICH.USENAMES INNER JOIN STYLELIST ON\n"
                        + "DATLICH.USENAMEST=STYLELIST.USENAMES INNER JOIN COSO ON\n"
                        + "STYLELIST.MACS=COSO.MACS WHERE USENAMEST=? AND NGAY=? AND STATUSS=?");
                ps.setString(1, User);
                ps.setString(2, d+1+"-"+m+"-"+y);
                ps.setString(3, "Chưa Hoàn Thành");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                }

            } catch (Exception e) {
            }
    }//GEN-LAST:event_btnNgaymaiActionPerformed

    private void btnNgaykiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNgaykiaActionPerformed
        // TODO add your handling code here:
        try {
                model.setRowCount(0);
                PreparedStatement ps = cn.prepareStatement("SELECT KHACHHANG.HOTEN,TENDV,COSO.DIACHI,GIO,NGAY FROM KHACHHANG INNER JOIN DATLICH ON\n"
                        + "KHACHHANG.USENAMES=DATLICH.USENAMES INNER JOIN STYLELIST ON\n"
                        + "DATLICH.USENAMEST=STYLELIST.USENAMES INNER JOIN COSO ON\n"
                        + "STYLELIST.MACS=COSO.MACS WHERE USENAMEST=? AND NGAY=? AND STATUSS=?");
                ps.setString(1, User);
                ps.setString(2, d+2+"-"+m+"-"+y);
                ps.setString(3, "Chưa Hoàn Thành");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                }

            } catch (Exception e) {
            }
    }//GEN-LAST:event_btnNgaykiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHomnay;
    private javax.swing.JButton btnNgaykia;
    private javax.swing.JButton btnNgaymai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void loadToTable() {
        try {
            try {
                model.setRowCount(0);
                PreparedStatement ps = cn.prepareStatement("SELECT KHACHHANG.HOTEN,TENDV,COSO.DIACHI,GIO,NGAY FROM KHACHHANG INNER JOIN DATLICH ON\n"
                        + "KHACHHANG.USENAMES=DATLICH.USENAMES INNER JOIN STYLELIST ON\n"
                        + "DATLICH.USENAMEST=STYLELIST.USENAMES INNER JOIN COSO ON\n"
                        + "STYLELIST.MACS=COSO.MACS WHERE USENAMEST=? AND STATUSS=?");
                ps.setString(1, User);
                ps.setString(2, "Chưa Hoàn Thành");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                }

            } catch (Exception e) {
            }
        } catch (Exception e) {
        }

    }
}
