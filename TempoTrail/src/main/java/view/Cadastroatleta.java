/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author gabri
 */
public class Cadastroatleta extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastroatleta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlNome = new javax.swing.JLabel();
        JlIdade = new javax.swing.JLabel();
        JlCpf = new javax.swing.JLabel();
        JtNomeAtleta = new javax.swing.JTextField();
        JtIdadeAtleta = new javax.swing.JTextField();
        JtCpfAtleta = new javax.swing.JTextField();
        JbCadastrar = new javax.swing.JButton();
        JlPeso = new javax.swing.JLabel();
        JlAltura = new javax.swing.JLabel();
        JlCategoria = new javax.swing.JLabel();
        JcbCategoria = new javax.swing.JComboBox<>();
        JtPeso = new javax.swing.JTextField();
        JtAltura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JlNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JlNome.setText("Nome:");

        JlIdade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JlIdade.setText("Idade:");

        JlCpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JlCpf.setText("CPF:");

        JtNomeAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtNomeAtletaActionPerformed(evt);
            }
        });

        JbCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        JbCadastrar.setText("Cadastrar");
        JbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCadastrarActionPerformed(evt);
            }
        });

        JlPeso.setText("Peso:");

        JlAltura.setText("Altura Atleta:");

        JlCategoria.setText("Categoria:");

        JcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JlPeso)
                            .addComponent(JlAltura)
                            .addComponent(JlCategoria))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JtAltura)
                            .addComponent(JcbCategoria, 0, 235, Short.MAX_VALUE)))
                    .addComponent(JbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JlIdade)
                            .addComponent(JlCpf)
                            .addComponent(JlNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JtCpfAtleta, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(JtIdadeAtleta)
                                .addComponent(JtNomeAtleta)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlNome)
                    .addComponent(JtNomeAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JtIdadeAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlIdade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JtCpfAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlPeso)
                    .addComponent(JtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlAltura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlCategoria))
                .addGap(22, 22, 22)
                .addComponent(JbCadastrar)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtNomeAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtNomeAtletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtNomeAtletaActionPerformed

    private void JbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCadastrarActionPerformed
        new LoginAtleta().setVisible(true);
    }//GEN-LAST:event_JbCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastroatleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastroatleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastroatleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastroatleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastroatleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbCadastrar;
    private javax.swing.JComboBox<String> JcbCategoria;
    private javax.swing.JLabel JlAltura;
    private javax.swing.JLabel JlCategoria;
    private javax.swing.JLabel JlCpf;
    private javax.swing.JLabel JlIdade;
    private javax.swing.JLabel JlNome;
    private javax.swing.JLabel JlPeso;
    private javax.swing.JTextField JtAltura;
    private javax.swing.JTextField JtCpfAtleta;
    private javax.swing.JTextField JtIdadeAtleta;
    private javax.swing.JTextField JtNomeAtleta;
    private javax.swing.JTextField JtPeso;
    // End of variables declaration//GEN-END:variables
}
