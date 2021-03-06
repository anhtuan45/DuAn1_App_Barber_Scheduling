/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatTocP2;

import Conn.MyConnect;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Duc Thao
 */
public class DanhSachDatLich extends javax.swing.JPanel {

    /**
     * Creates new form DanhSachDatLich
     */
    Connection cn;
    DefaultTableModel model;
    int index = 0;

    public DanhSachDatLich() {
        initComponents();
        cn = MyConnect.ketnoi("DATLICH_HAIRS");
        model = (DefaultTableModel) Table.getModel();
//        setBackground(new Color(0,0,0,0));
        Table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        Table.getTableHeader().setOpaque(false);
        Table.getTableHeader().setBackground(new Color(197, 225, 165));
        Table.getTableHeader().setForeground(new Color(221, 44, 0));
        Table.setRowHeight(25);
        model.setColumnIdentifiers(new Object[]{"Họ và tên", "Số ĐT", "Dịch vụ", "Cơ sở", "StyleList", "Giờ cắt", "Ngày cắt", "Tổng tiền", "TRẠNG THÁI"});
        fillTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtSODT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbbCoSo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbbGio = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        btnTimKH = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnTVhoanthanh = new javax.swing.JButton();
        btnTVkhongden = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(197, 225, 165));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("DANH SÁCH ĐẶT LỊCH");

        Table.setBackground(new java.awt.Color(197, 225, 165));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        Table.setFocusable(false);
        Table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Table.setRowHeight(50);
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

        jPanel1.setBackground(new java.awt.Color(197, 225, 165));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("TÌM KIẾM"));

        jLabel2.setText("Số ĐT");

        jLabel5.setText("Cơ sở:");

        cbbCoSo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XÃ ĐÀN", "LÁNG HẠ", "CẦU GIẤY" }));

        jLabel6.setText("Giờ:");

        cbbGio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00", "08:00", "09:00", "10:00", "14:00", "15:00", "16:00", "17:00", "18:00" }));

        jLabel7.setText("Ngày:");

        btnTimKH.setText("Tìm");
        btnTimKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(txtSODT, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbCoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbbGio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTimKH)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(cbbCoSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbbGio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKH))
                .addContainerGap())
        );

        jLabel4.setText("Tác vụ: ");

        btnTVhoanthanh.setText("Hoàn thành");
        btnTVhoanthanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTVhoanthanhActionPerformed(evt);
            }
        });

        btnTVkhongden.setText("Không đến");
        btnTVkhongden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTVkhongdenActionPerformed(evt);
            }
        });

        jButton1.setText("Xuất hóa đơn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Quét mã Qr Code");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1)
                        .addGap(0, 344, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addGap(47, 47, 47)
                .addComponent(btnTVhoanthanh)
                .addGap(42, 42, 42)
                .addComponent(btnTVkhongden)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnTVhoanthanh)
                    .addComponent(btnTVkhongden)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKHActionPerformed
        try {
            model.setRowCount(0);
            PreparedStatement ps = cn.prepareStatement("SELECT KHACHHANG.HOTEN,KHACHHANG.SODT,TENDV,COSO.DIACHI,USENAMEST,GIO,NGAY,TONGTIEN,STATUSS FROM KHACHHANG INNER JOIN DATLICH ON\n"
                    + "KHACHHANG.USENAMES=DATLICH.USENAMES INNER JOIN STYLELIST ON\n"
                    + "DATLICH.USENAMEST=STYLELIST.USENAMES INNER JOIN COSO ON\n"
                    + "STYLELIST.MACS=COSO.MACS WHERE KHACHHANG.SODT=? AND COSO.DIACHI=? AND GIO=? AND NGAY=?");
            ps.setString(1, txtSODT.getText());
            ps.setString(2, cbbCoSo.getSelectedItem().toString());
            ps.setString(3, cbbGio.getSelectedItem().toString());
            ps.setString(4, txtNgay.getText());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), Math.round(rs.getFloat(8)), rs.getString(9)});
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnTimKHActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int row = Table.getSelectedRow();
        if (row >= 0) {
            index = row;
        }

    }//GEN-LAST:event_TableMouseClicked

    private void btnTVhoanthanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTVhoanthanhActionPerformed
//            String st = Table.getValueAt(index, 4).toString();
//            String gio = Table.getValueAt(index, 5).toString();
//            String ngay = Table.getValueAt(index, 6).toString();
//            JOptionPane.showMessageDialog(this, st+"-"+gio+"-"+ngay);
        String R = Table.getValueAt(index, 4).toString();
        String U = Table.getValueAt(index, 0).toString();
     
        new Ratting(R, U).setVisible(true);
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE DATLICH SET STATUSS=? WHERE USENAMEST=? AND GIO=? AND NGAY=?");
            ps.setString(1, "Hoàn Thành");
            ps.setString(2, Table.getValueAt(index, 4).toString());
            ps.setString(3, Table.getValueAt(index, 5).toString());
            ps.setString(4, Table.getValueAt(index, 6).toString());

            if (ps.executeUpdate() > 0) {
                PreparedStatement pss = cn.prepareStatement("DELETE FROM GIOCAT WHERE USENAMESst=? AND GIO=? AND NGAY=?");

                pss.setString(1, Table.getValueAt(index, 4).toString());
                pss.setString(2, Table.getValueAt(index, 5).toString());
                pss.setString(3, Table.getValueAt(index, 6).toString());
                if (pss.executeUpdate() > 0) {
                   
                    fillTable();
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnTVhoanthanhActionPerformed

    private void btnTVkhongdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTVkhongdenActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE DATLICH SET STATUSS=? WHERE USENAMEST=? AND GIO=? AND NGAY=?");
            ps.setString(1, "Không Đến");
            ps.setString(2, Table.getValueAt(index, 4).toString());
            ps.setString(3, Table.getValueAt(index, 5).toString());
            ps.setString(4, Table.getValueAt(index, 6).toString());

            if (ps.executeUpdate() > 0) {
                PreparedStatement pss = cn.prepareStatement("DELETE FROM GIOCAT WHERE USENAMESst=? AND GIO=? AND NGAY=?");

                pss.setString(1, Table.getValueAt(index, 4).toString());
                pss.setString(2, Table.getValueAt(index, 5).toString());
                pss.setString(3, Table.getValueAt(index, 6).toString());
                if (pss.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(this, "Thành công");
                    fillTable();
                    
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnTVkhongdenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Document d = new Document();
        File fontFile = new File("E:\\DU AN 1\\22222\\DLCT\\vuArial.ttf");
        File fontFile2 = new File("D:\\DatLichCatToc\\DLCT\\vuTimesBold.ttf");

        try {
            PdfWriter.getInstance(d, new FileOutputStream("E:\\DU AN 1\\22222\\DLCT\\HoaDon.pdf"));
            BaseFont bf = BaseFont.createFont(fontFile.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            com.itextpdf.text.Font font = new com.itextpdf.text.Font(bf, 15);
            com.itextpdf.text.Font font2 = new com.itextpdf.text.Font(bf, 25);
            com.itextpdf.text.Font font3 = new com.itextpdf.text.Font(bf, 10);
            d.open();
            d.add(new Paragraph("              XUẤT HÓA ĐƠN\n", font2));
            d.add(new Paragraph("\n         Khách hàng:   " + "\t" + Table.getValueAt(index, 0)
                    + "          " + "Số ĐT: " + Table.getValueAt(index, 1), font));
            d.add(new Paragraph("\n         Dịch vụ:   " + "\t" + Table.getValueAt(index, 2)
                    + "          " + "Cơ sở: " + Table.getValueAt(index, 3), font));
            d.add(new Paragraph("\n         Style List:   " + "\t" + Table.getValueAt(index, 4)
                    + "          " + "Ngày cắt: " + Table.getValueAt(index, 5), font));
            d.add(new Paragraph("\n         Giờ cắt:   " + "\t" + Table.getValueAt(index, 6)
                    + "          " + "Tổng tiền: " + Table.getValueAt(index, 7) + "\n", font));
            d.add(new Paragraph("\n                SALON HAIR - NHOM 08", font3));
            d.close();
            JOptionPane.showMessageDialog(this, "Xuất hóa đơn thành công!");
        } catch (FileNotFoundException ex) {
//            Logger.getLogger(DatLich.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(DatLich.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DatLich.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new QrCodeWebcam().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btnTVhoanthanh;
    private javax.swing.JButton btnTVkhongden;
    private javax.swing.JButton btnTimKH;
    private javax.swing.JComboBox<String> cbbCoSo;
    private javax.swing.JComboBox<String> cbbGio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtSODT;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        try {
            model.setRowCount(0);
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT KHACHHANG.HOTEN,KHACHHANG.SODT,TENDV,COSO.DIACHI,USENAMEST,GIO,NGAY,TONGTIEN,STATUSS FROM KHACHHANG INNER JOIN DATLICH ON\n"
                    + "KHACHHANG.USENAMES=DATLICH.USENAMES INNER JOIN STYLELIST ON\n"
                    + "DATLICH.USENAMEST=STYLELIST.USENAMES INNER JOIN COSO ON\n"
                    + "STYLELIST.MACS=COSO.MACS");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), Math.round(rs.getFloat(8)), rs.getString(9)});
            }

        } catch (Exception e) {
        }

    }
}
