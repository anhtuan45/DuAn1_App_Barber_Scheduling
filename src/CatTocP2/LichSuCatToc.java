/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatTocP2;

import Conn.MyConnect;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Duc Thao
 */
public class LichSuCatToc extends javax.swing.JPanel {

    /**
     * Creates new form LichSuCatToc
     */
    DefaultTableModel model;
    Connection cn;
    String USER;
    int index;
    String UseST = "";

    public LichSuCatToc(String U) {
        initComponents();
        cn = MyConnect.ketnoi("DATLICH_HAIRS");
        USER = U;
        model = (DefaultTableModel) Table.getModel();

        Table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        Table.getTableHeader().setOpaque(false);
        Table.getTableHeader().setBackground(new Color(197, 225, 165));
        Table.getTableHeader().setForeground(new Color(221, 44, 0));
        Table.setRowHeight(25);
        Table.setBackground(new Color(197, 225, 165));

        model.setColumnIdentifiers(new Object[]{"Cơ Sở", "Style List", "Dịch Vụ", "Giờ Cắt", "Ngày Cắt", "Tổng Tiền", "Trạng Thái"});

        loadCbb();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbb = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(197, 225, 165));

        Table.setBackground(new java.awt.Color(197, 225, 165));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table.setFocusable(false);
        Table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Table.setRowHeight(25);
        Table.setSelectionBackground(new java.awt.Color(255, 102, 102));
        Table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Table.setShowVerticalLines(false);
        Table.getTableHeader().setReorderingAllowed(false);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LỊCH SỬ CẮT TÓC");

        jPanel1.setBackground(new java.awt.Color(197, 225, 165));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("BỘ LỌC"));
        jPanel1.setForeground(new java.awt.Color(102, 255, 255));

        cbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn ngày" }));
        cbb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbItemStateChanged(evt);
            }
        });

        jButton1.setText("Hủy Lịch");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbb, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cbb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbItemStateChanged

        try {
            model.setRowCount(0);
            PreparedStatement ps = cn.prepareStatement("SELECT COSO.DIACHI,STYLELIST.HOTEN,TENDV,GIO,NGAY,TONGTIEN,STATUSS FROM KHACHHANG INNER JOIN DATLICH ON\n"
                    + "KHACHHANG.USENAMES=DATLICH.USENAMES INNER JOIN STYLELIST ON\n"
                    + "DATLICH.USENAMEST=STYLELIST.USENAMES INNER JOIN COSO ON\n"
                    + "STYLELIST.MACS=COSO.MACS WHERE KHACHHANG.USENAMES=? AND NGAY=?");
            ps.setString(1, USER);
            ps.setString(2, String.valueOf(cbb.getSelectedItem()));

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getFloat(6), rs.getString(7)});
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbbItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            int e = JOptionPane.showConfirmDialog(this, "Bạn có muốn hủy lịch?", "Hủy lịch", JOptionPane.YES_OPTION);
            if (e == JOptionPane.YES_OPTION) {
                PreparedStatement ps = cn.prepareStatement("UPDATE DATLICH SET STATUSS=? WHERE USENAMEST=? AND GIO=? AND NGAY=?");
                ps.setString(1, "Hủy");
                ps.setString(2, UseST);
                ps.setString(3, Table.getValueAt(index, 3).toString());
                ps.setString(4, Table.getValueAt(index, 4).toString());

                if (ps.executeUpdate() > 0) {
                    PreparedStatement pss = cn.prepareStatement("DELETE FROM GIOCAT WHERE USENAMESst=? AND GIO=? AND NGAY=?");

                    pss.setString(1, UseST);
                    pss.setString(2, Table.getValueAt(index, 3).toString());
                    pss.setString(3, Table.getValueAt(index, 4).toString());
                    if (pss.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(this, "Bạn đã hủy lịch thành công!");
                        loadToTable();
                    }

                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        try {

            int row = Table.getSelectedRow();
            if (row >= 0) {
                index = row;
                if (Table.getValueAt(index, 1).toString().equalsIgnoreCase("LÊ QUỐC ANH")) {
                    UseST = "AnhQL";
                } else if (Table.getValueAt(index, 1).toString().equalsIgnoreCase("TRẦN TUẤN ANH")) {
                    UseST = "AnhTT";
                } else if (Table.getValueAt(index, 1).toString().equalsIgnoreCase("NGUYỄN VĂN KHANG")) {
                    UseST = "KhangNV";
                } else if (Table.getValueAt(index, 1).toString().equalsIgnoreCase("NGUYỄN KHÁNH LINH")) {
                    UseST = "LinhNK";
                } else if (Table.getValueAt(index, 1).toString().equalsIgnoreCase("TRẦN VĂN QUÝ")) {
                    UseST = "QuyTV";
                } else if (Table.getValueAt(index, 1).toString().equalsIgnoreCase("NGUYỄN ANH TIẾN")) {
                    UseST = "TienNA";
                } else if (Table.getValueAt(index, 1).toString().equalsIgnoreCase("NGUYỄN VĂN VŨ")) {
                    UseST = "VuNV";
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_TableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JComboBox<String> cbb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void loadCbb() {
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT NGAY FROM KHACHHANG INNER JOIN DATLICH ON\n"
                    + "KHACHHANG.USENAMES=DATLICH.USENAMES INNER JOIN STYLELIST ON\n"
                    + "DATLICH.USENAMEST=STYLELIST.USENAMES INNER JOIN COSO ON\n"
                    + "STYLELIST.MACS=COSO.MACS WHERE KHACHHANG.USENAMES=?");
            ps.setString(1, USER);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cbb.addItem(rs.getString(1));
            }
        } catch (Exception e) {
        }

    }

    private void loadToTable() {
        try {
            model.setRowCount(0);
            PreparedStatement ps = cn.prepareStatement("SELECT COSO.DIACHI,STYLELIST.HOTEN,TENDV,GIO,NGAY,TONGTIEN,STATUSS FROM KHACHHANG INNER JOIN DATLICH ON\n"
                    + "KHACHHANG.USENAMES=DATLICH.USENAMES INNER JOIN STYLELIST ON\n"
                    + "DATLICH.USENAMEST=STYLELIST.USENAMES INNER JOIN COSO ON\n"
                    + "STYLELIST.MACS=COSO.MACS WHERE KHACHHANG.USENAMES=?");
            ps.setString(1, USER);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getFloat(6), rs.getString(7)});
            }

        } catch (Exception e) {
        }

    }
}
