/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import QLTHONGTIN.Benh;
import QLTHONGTIN.Thuoc;
import QKKHAMBENH.BenhNhan;
import QKKHAMBENH.PhieuKham;
import QLTHONGTIN.CachDung;
import QLTHONGTIN.DonVi;
import QLTHONGTIN.TienKham;
import THONGKE.BaoCaoSuDungThuoc;
import THONGKE.BaoCaoDoanhThu;
import THONGKE.TraCuuBenhNhan;
import TTBANQUYEN.HDSD;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Maid
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
         setExtendedState(MAXIMIZED_BOTH);
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src/Imagi/NEN.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            } };
            jMenuBar1 = new javax.swing.JMenuBar();
            jMenu1 = new javax.swing.JMenu();
            jMenuBenhNhan = new javax.swing.JMenuItem();
            jMenuPhieuKham = new javax.swing.JMenuItem();
            jMenu3 = new javax.swing.JMenu();
            jMenuThuoc = new javax.swing.JMenuItem();
            jMenuBenh = new javax.swing.JMenuItem();
            jMenu5 = new javax.swing.JMenu();
            jMenuItemDV = new javax.swing.JMenuItem();
            jMenuItemCD = new javax.swing.JMenuItem();
            jMenuItem4 = new javax.swing.JMenuItem();
            jMenu2 = new javax.swing.JMenu();
            jMenuTraCuu = new javax.swing.JMenuItem();
            jMenu6 = new javax.swing.JMenu();
            jMenuBCSDThuoc = new javax.swing.JMenuItem();
            jMenuBCDoanhThu = new javax.swing.JMenuItem();
            jMenu4 = new javax.swing.JMenu();
            jMenuHDSD = new javax.swing.JMenuItem();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("QUẢN LÝ PHÒNG MẠCH TƯ");
            setBackground(new java.awt.Color(255, 255, 255));
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setToolTipText("");
            jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

            jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 712, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 511, Short.MAX_VALUE)
            );

            jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

            javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
            jDesktopPane1.setLayout(jDesktopPane1Layout);
            jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1)
            );

            jMenu1.setText("Quản Lý Khám Chữa Bệnh");

            jMenuBenhNhan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
            jMenuBenhNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagi/Accounting.png"))); // NOI18N
            jMenuBenhNhan.setText("Quản Lý Thông Tin Bệnh Nhân");
            jMenuBenhNhan.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuBenhNhanActionPerformed(evt);
                }
            });
            jMenu1.add(jMenuBenhNhan);

            jMenuPhieuKham.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
            jMenuPhieuKham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagi/Accounting.png"))); // NOI18N
            jMenuPhieuKham.setText("Lập Phiếu Khám ");
            jMenuPhieuKham.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuPhieuKhamActionPerformed(evt);
                }
            });
            jMenu1.add(jMenuPhieuKham);

            jMenuBar1.add(jMenu1);

            jMenu3.setText("Quản Lý Thông Tin");

            jMenuThuoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
            jMenuThuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagi/Database.png"))); // NOI18N
            jMenuThuoc.setText("Quản Lý Thuốc");
            jMenuThuoc.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuThuocActionPerformed(evt);
                }
            });
            jMenu3.add(jMenuThuoc);

            jMenuBenh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
            jMenuBenh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagi/Database.png"))); // NOI18N
            jMenuBenh.setText("Thông Tin Bệnh");
            jMenuBenh.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuBenhActionPerformed(evt);
                }
            });
            jMenu3.add(jMenuBenh);

            jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagi/Equipment.png"))); // NOI18N
            jMenu5.setText("Quản Lý Quy Định");

            jMenuItemDV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
            jMenuItemDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagi/About.png"))); // NOI18N
            jMenuItemDV.setText("Đơn Vị Thuốc");
            jMenuItemDV.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItemDVActionPerformed(evt);
                }
            });
            jMenu5.add(jMenuItemDV);

            jMenuItemCD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
            jMenuItemCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagi/About.png"))); // NOI18N
            jMenuItemCD.setText("Cách Dùng Thuốc");
            jMenuItemCD.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItemCDActionPerformed(evt);
                }
            });
            jMenu5.add(jMenuItemCD);

            jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
            jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagi/About.png"))); // NOI18N
            jMenuItem4.setText("Tiền Khám");
            jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem4ActionPerformed(evt);
                }
            });
            jMenu5.add(jMenuItem4);

            jMenu3.add(jMenu5);

            jMenuBar1.add(jMenu3);

            jMenu2.setText("Thống Kê");
            jMenu2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenu2ActionPerformed(evt);
                }
            });

            jMenuTraCuu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
            jMenuTraCuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagi/Find.png"))); // NOI18N
            jMenuTraCuu.setText("Tra Cứu Bệnh Nhân");
            jMenuTraCuu.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuTraCuuActionPerformed(evt);
                }
            });
            jMenu2.add(jMenuTraCuu);

            jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagi/Find.png"))); // NOI18N
            jMenu6.setText("Báo Cáo");

            jMenuBCSDThuoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
            jMenuBCSDThuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagi/Find.png"))); // NOI18N
            jMenuBCSDThuoc.setText("Báo Cáo Doanh Thu");
            jMenuBCSDThuoc.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuBCSDThuocActionPerformed(evt);
                }
            });
            jMenu6.add(jMenuBCSDThuoc);

            jMenuBCDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
            jMenuBCDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagi/Find.png"))); // NOI18N
            jMenuBCDoanhThu.setText("Báo Cáo Sử Dụng Thuốc");
            jMenuBCDoanhThu.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuBCDoanhThuActionPerformed(evt);
                }
            });
            jMenu6.add(jMenuBCDoanhThu);

            jMenu2.add(jMenu6);

            jMenuBar1.add(jMenu2);

            jMenu4.setText("Thông Tin Phần Mềm");

            jMenuHDSD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
            jMenuHDSD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagi/Help.png"))); // NOI18N
            jMenuHDSD.setText("HD Sử Dụng");
            jMenuHDSD.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuHDSDActionPerformed(evt);
                }
            });
            jMenu4.add(jMenuHDSD);

            jMenuBar1.add(jMenu4);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jMenuBCSDThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBCSDThuocActionPerformed
        // TODO add your handling code here:
        BaoCaoDoanhThu BCT = new BaoCaoDoanhThu();
        BCT.setVisible(true);
        jPanel2.add(BCT);
    }//GEN-LAST:event_jMenuBCSDThuocActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuBCDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBCDoanhThuActionPerformed
        // TODO add your handling code here:
        BaoCaoSuDungThuoc BCDT = new BaoCaoSuDungThuoc();
        BCDT.setVisible(true);
        jPanel2.add(BCDT);
    }//GEN-LAST:event_jMenuBCDoanhThuActionPerformed

    private void jMenuTraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTraCuuActionPerformed
        // TODO add your handling code here:
        TraCuuBenhNhan TC = new TraCuuBenhNhan();
        TC.setVisible(true);
        jPanel2.add(TC);
    }//GEN-LAST:event_jMenuTraCuuActionPerformed

    private void jMenuBenhNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBenhNhanActionPerformed
        // TODO add your handling code here:
        BenhNhan BN = new BenhNhan();
        BN.setVisible(true);
        jPanel2.add(BN);
    }//GEN-LAST:event_jMenuBenhNhanActionPerformed

    private void jMenuPhieuKhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPhieuKhamActionPerformed
        // TODO add your handling code here:
        PhieuKham PK = new PhieuKham();
        PK.setVisible(true);
        jPanel2.add(PK);
    }//GEN-LAST:event_jMenuPhieuKhamActionPerformed

    private void jMenuBenhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBenhActionPerformed
        // TODO add your handling code here:
        Benh B = new Benh();
        B.setVisible(true);
        jPanel2.add(B);
    }//GEN-LAST:event_jMenuBenhActionPerformed

    private void jMenuHDSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHDSDActionPerformed
        // TODO add your handling code here:
        HDSD HD = new HDSD();
        HD.setVisible(true);
    }//GEN-LAST:event_jMenuHDSDActionPerformed

    private void jMenuThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuThuocActionPerformed
        // TODO add your handling code here:
        Thuoc T;
        T = new Thuoc();
        T.setVisible(true);
        jPanel2.add(T);
    }//GEN-LAST:event_jMenuThuocActionPerformed

    private void jMenuItemCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCDActionPerformed
        // TODO add your handling code here:
        CachDung CD = new CachDung();
        CD.setVisible(true);
        jPanel2.add(CD);
    }//GEN-LAST:event_jMenuItemCDActionPerformed

    private void jMenuItemDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDVActionPerformed
        // TODO add your handling code here:
        DonVi DV = new DonVi();
        DV.setVisible(true);
        jPanel2.add(DV);
    }//GEN-LAST:event_jMenuItemDVActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        TienKham TK = new TienKham();
        TK.setVisible(true);
        jPanel2.add(TK);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuBCDoanhThu;
    private javax.swing.JMenuItem jMenuBCSDThuoc;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBenh;
    private javax.swing.JMenuItem jMenuBenhNhan;
    private javax.swing.JMenuItem jMenuHDSD;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemCD;
    private javax.swing.JMenuItem jMenuItemDV;
    private javax.swing.JMenuItem jMenuPhieuKham;
    private javax.swing.JMenuItem jMenuThuoc;
    private javax.swing.JMenuItem jMenuTraCuu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}