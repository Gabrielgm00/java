
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TelaUsuario extends javax.swing.JFrame {

    public static String dbPassword = JOptionPane.showInputDialog(null, "Insira a senha do root do Mysql","Banco de dados", JOptionPane.INFORMATION_MESSAGE);
    Connection c;
    
    public TelaUsuario() {
        try {
            this.c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookpay", "root", dbPassword);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Houve um problema ao se conectar ou senha incorreta.","Banco de dados",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblTitolo = new javax.swing.JLabel();
        btnEntra = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        pswSenha = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblCor = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TelaUsuario");
        setPreferredSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(null);

        pnlLogin.setBackground(new java.awt.Color(0, 0, 255));

        lblNome.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");

        lblSenha.setBackground(new java.awt.Color(255, 255, 255));
        lblSenha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");

        txtNome.setBackground(new java.awt.Color(0, 0, 255));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        lblTitolo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitolo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTitolo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitolo.setText("Livros Book");

        btnEntra.setBackground(new java.awt.Color(51, 51, 51));
        btnEntra.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEntra.setForeground(new java.awt.Color(255, 255, 255));
        btnEntra.setText("Entrar");
        btnEntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntraActionPerformed(evt);
            }
        });

        btnCadastro.setBackground(new java.awt.Color(51, 51, 51));
        btnCadastro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("Cadastro");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        pswSenha.setBackground(new java.awt.Color(0, 0, 255));
        pswSenha.setForeground(new java.awt.Color(255, 255, 255));
        pswSenha.setBorder(null);
        pswSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswSenhaActionPerformed(evt);
            }
        });
        pswSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswSenhaKeyPressed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1)
                    .addComponent(pswSenha)
                    .addComponent(jSeparator2)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(btnEntra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitolo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitolo)
                .addGap(32, 32, 32)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntra)
                    .addComponent(btnCadastro))
                .addGap(20, 20, 20))
        );

        getContentPane().add(pnlLogin);
        pnlLogin.setBounds(100, 10, 225, 300);

        lblCor.setForeground(new java.awt.Color(102, 153, 255));
        getContentPane().add(lblCor);
        lblCor.setBounds(0, 0, 440, 320);

        setSize(new java.awt.Dimension(450, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        TelaCadastro k;
        k = new TelaCadastro();
        k.setVisible(true);

    }//GEN-LAST:event_btnCadastroActionPerformed

    private void pswSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswSenhaActionPerformed

    private void btnEntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntraActionPerformed

        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o nome do usuário");
            txtNome.requestFocus();
            return;
        }
        if (pswSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha a senha");
            pswSenha.requestFocus();
            return;
        }

        try {
            Connection con;
            PreparedStatement ps;
            ResultSet reu;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookpay", "root", dbPassword);

            ps = con.prepareStatement("SELECT * FROM login WHERE nome=? AND senha=?");
            ps.setString(1, txtNome.getText());
            ps.setString(2, pswSenha.getText());
            reu = ps.executeQuery();

            if (reu.next()) { // Se encontrou o usuário na tabela
                txtNome.setText("");
                pswSenha.setText("");

                Telatabela tt;
                tt = new Telatabela();
                tt.setVisible(true);
                dispose();

                
            } else { 
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos");
                txtNome.requestFocus();
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto");
        }

    }//GEN-LAST:event_btnEntraActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            pswSenha.requestFocus();

    }//GEN-LAST:event_txtNomeKeyPressed
    }

    private void pswSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswSenhaKeyPressed

        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnEntra.doClick();
        }

    }//GEN-LAST:event_pswSenhaKeyPressed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEntra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitolo;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
