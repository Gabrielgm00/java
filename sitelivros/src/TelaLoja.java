
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaLoja extends javax.swing.JFrame {

    public TelaLoja() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        pnlTelaPrincipal = new javax.swing.JPanel();
        lblTelaPrincipal = new javax.swing.JLabel();
        pnlAventura = new javax.swing.JPanel();
        pnlFiccao = new javax.swing.JPanel();
        pnlTerro = new javax.swing.JPanel();
        pnlRomance = new javax.swing.JPanel();
        pnlDrama = new javax.swing.JPanel();
        pnlAcao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mnuTelaPrincipal = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setTitle("TelaLoja");
        getContentPane().setLayout(null);

        pnlTelaPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlTelaPrincipal.setDoubleBuffered(false);
        pnlTelaPrincipal.setFocusCycleRoot(true);
        pnlTelaPrincipal.setLayout(null);

        lblTelaPrincipal.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lblTelaPrincipal.setText("Livros book");
        pnlTelaPrincipal.add(lblTelaPrincipal);
        lblTelaPrincipal.setBounds(220, 10, 150, 40);

        getContentPane().add(pnlTelaPrincipal);
        pnlTelaPrincipal.setBounds(0, 0, 600, 60);

        pnlAventura.setLayout(null);
        getContentPane().add(pnlAventura);
        pnlAventura.setBounds(210, 70, 201, 150);

        pnlFiccao.setLayout(null);
        getContentPane().add(pnlFiccao);
        pnlFiccao.setBounds(400, 70, 200, 150);

        pnlTerro.setLayout(null);
        getContentPane().add(pnlTerro);
        pnlTerro.setBounds(0, 220, 200, 150);

        pnlRomance.setLayout(null);
        getContentPane().add(pnlRomance);
        pnlRomance.setBounds(210, 220, 200, 150);

        pnlDrama.setLayout(null);
        getContentPane().add(pnlDrama);
        pnlDrama.setBounds(410, 210, 200, 150);

        pnlAcao.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\T-Gamer\\Documents\\NetBeansProjects\\aula7padaria\\src\\imagens\\acao.jpg")); // NOI18N
        pnlAcao.add(jLabel1);
        jLabel1.setBounds(0, 0, 200, 150);

        getContentPane().add(pnlAcao);
        pnlAcao.setBounds(0, 70, 200, 150);

        mnuTelaPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuTelaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuTelaPrincipal.setPreferredSize(new java.awt.Dimension(66, 40));

        jMenu2.setText("Ação");
        jMenu2.setPreferredSize(new java.awt.Dimension(100, 21));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        mnuTelaPrincipal.add(jMenu2);

        jMenu5.setText("Aventura");
        jMenu5.setPreferredSize(new java.awt.Dimension(100, 21));
        mnuTelaPrincipal.add(jMenu5);

        jMenu6.setText("Ficção");
        jMenu6.setPreferredSize(new java.awt.Dimension(100, 21));
        mnuTelaPrincipal.add(jMenu6);

        jMenu7.setText("Terro");
        jMenu7.setPreferredSize(new java.awt.Dimension(100, 21));
        mnuTelaPrincipal.add(jMenu7);

        jMenu3.setText("Romance");
        jMenu3.setPreferredSize(new java.awt.Dimension(100, 21));
        mnuTelaPrincipal.add(jMenu3);

        jMenu4.setText("Drama");
        jMenu4.setPreferredSize(new java.awt.Dimension(40, 21));
        mnuTelaPrincipal.add(jMenu4);

        setJMenuBar(mnuTelaPrincipal);

        setSize(new java.awt.Dimension(612, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        acao ac;
     ac = new acao();
     ac.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JLabel lblTelaPrincipal;
    private javax.swing.JMenuBar mnuTelaPrincipal;
    private javax.swing.JPanel pnlAcao;
    private javax.swing.JPanel pnlAventura;
    private javax.swing.JPanel pnlDrama;
    private javax.swing.JPanel pnlFiccao;
    private javax.swing.JPanel pnlRomance;
    private javax.swing.JPanel pnlTelaPrincipal;
    private javax.swing.JPanel pnlTerro;
    // End of variables declaration//GEN-END:variables
}
