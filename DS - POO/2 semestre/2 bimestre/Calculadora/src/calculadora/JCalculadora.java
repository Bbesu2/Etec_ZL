/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

/**
 *
 * @author nicholas
 */
public class JCalculadora extends javax.swing.JFrame {
    
    private double res; 
    private double ent; 
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JCalculadora.class.getName());


    public JCalculadora() {
        initComponents();
        res = 0;
        ent = 0;
        resultado.setText(Double.toString(res)); 
        entrada.setText(""); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        entrada = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        but0 = new javax.swing.JButton();
        butMultiplicar = new javax.swing.JButton();
        butPonto = new javax.swing.JButton();
        butIgual = new javax.swing.JButton();
        butDividir = new javax.swing.JButton();
        butSubtrair = new javax.swing.JButton();
        butSoma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        entrada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        but1.setBackground(new java.awt.Color(0, 102, 204));
        but1.setText("1");
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        but2.setBackground(new java.awt.Color(0, 102, 204));
        but2.setText("2");
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });

        but3.setBackground(new java.awt.Color(0, 102, 204));
        but3.setText("3");
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });

        but4.setBackground(new java.awt.Color(0, 102, 204));
        but4.setText("4");
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });

        but5.setBackground(new java.awt.Color(0, 102, 204));
        but5.setText("5");
        but5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but5ActionPerformed(evt);
            }
        });

        but6.setBackground(new java.awt.Color(0, 102, 204));
        but6.setText("6");
        but6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but6ActionPerformed(evt);
            }
        });

        but7.setBackground(new java.awt.Color(0, 102, 204));
        but7.setText("7");
        but7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but7ActionPerformed(evt);
            }
        });

        but8.setBackground(new java.awt.Color(0, 102, 204));
        but8.setText("8");
        but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but8ActionPerformed(evt);
            }
        });

        but9.setBackground(new java.awt.Color(0, 102, 204));
        but9.setText("9");
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });

        but0.setBackground(new java.awt.Color(0, 102, 204));
        but0.setText("0");
        but0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but0ActionPerformed(evt);
            }
        });

        butMultiplicar.setBackground(new java.awt.Color(255, 204, 0));
        butMultiplicar.setText("*");
        butMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMultiplicarActionPerformed(evt);
            }
        });

        butPonto.setBackground(new java.awt.Color(255, 204, 0));
        butPonto.setText(".");
        butPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPontoActionPerformed(evt);
            }
        });

        butIgual.setBackground(new java.awt.Color(255, 102, 0));
        butIgual.setText("=");
        butIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butIgualActionPerformed(evt);
            }
        });

        butDividir.setBackground(new java.awt.Color(255, 204, 0));
        butDividir.setText("/");
        butDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDividirActionPerformed(evt);
            }
        });

        butSubtrair.setBackground(new java.awt.Color(255, 204, 0));
        butSubtrair.setText("-");
        butSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSubtrairActionPerformed(evt);
            }
        });

        butSoma.setBackground(new java.awt.Color(255, 204, 0));
        butSoma.setText("+");
        butSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entrada)
                    .addComponent(resultado))
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(but1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butDividir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(but4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butSubtrair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(but7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(butPonto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but0)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(but9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butMultiplicar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(butIgual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butSoma)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(resultado)
                .addGap(9, 9, 9)
                .addComponent(entrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but1)
                    .addComponent(but2)
                    .addComponent(but3)
                    .addComponent(butDividir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but4)
                    .addComponent(but5)
                    .addComponent(but6)
                    .addComponent(butSubtrair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but7)
                    .addComponent(but8)
                    .addComponent(but9)
                    .addComponent(butMultiplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but0)
                    .addComponent(butPonto)
                    .addComponent(butIgual)
                    .addComponent(butSoma))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        String temp = entrada.getText();
        entrada.setText(temp + "1"); 
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        String temp = entrada.getText();
        entrada.setText(temp + "2"); 
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
        String temp = entrada.getText();
        entrada.setText(temp + "3"); 
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
        String temp = entrada.getText();
        entrada.setText(temp + "4");
    }//GEN-LAST:event_but4ActionPerformed

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed
        String temp = entrada.getText();
        entrada.setText(temp + "5");
    }//GEN-LAST:event_but5ActionPerformed

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed
        String temp = entrada.getText();
        entrada.setText(temp + "6"); 
    }//GEN-LAST:event_but6ActionPerformed

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed
        String temp = entrada.getText();
        entrada.setText(temp + "7"); 
    }//GEN-LAST:event_but7ActionPerformed

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed
        String temp = entrada.getText();
        entrada.setText(temp + "8"); 
    }//GEN-LAST:event_but8ActionPerformed

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
        String temp = entrada.getText();
        entrada.setText(temp + "9"); 
    }//GEN-LAST:event_but9ActionPerformed

    private void but0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but0ActionPerformed
        String temp = entrada.getText();
        if (!temp.isEmpty()) {
        entrada.setText(temp + "0");
        }
    }//GEN-LAST:event_but0ActionPerformed

    private void butPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPontoActionPerformed
        String temp = entrada.getText();
        if (temp.isEmpty()) {
        entrada.setText("."); 
        } else if (!temp.contains(".")) {
        entrada.setText(temp + "."); 
        }
    }//GEN-LAST:event_butPontoActionPerformed

    private void butSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSomaActionPerformed
        try {
ent = Double.parseDouble(entrada.getText());
res = res + ent;
entrada.setText("");
resultado.setText(Double.toString(res));
} catch (NumberFormatException e) {
}
    }//GEN-LAST:event_butSomaActionPerformed

    private void butSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSubtrairActionPerformed
        try {
ent = Double.parseDouble(entrada.getText());
res = res - ent;
entrada.setText("");
resultado.setText(Double.toString(res));
} catch (NumberFormatException e) {
}
    }//GEN-LAST:event_butSubtrairActionPerformed

    private void butMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMultiplicarActionPerformed
        try {
ent = Double.parseDouble(entrada.getText());
res = res * ent;
entrada.setText("");
resultado.setText(Double.toString(res));
} catch (NumberFormatException e) {
}
    }//GEN-LAST:event_butMultiplicarActionPerformed

    private void butDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDividirActionPerformed
        try {
ent = Double.parseDouble(entrada.getText());
if (ent != 0) { res = res / ent; } else {
resultado.setText("Erro!"); res = 0; }
entrada.setText("");
resultado.setText(Double.toString(res));
} catch (NumberFormatException e) {
}
    }//GEN-LAST:event_butDividirActionPerformed

    private void butIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butIgualActionPerformed
        try {
ent = Double.parseDouble(entrada.getText());
res = ent;
entrada.setText("");
resultado.setText(Double.toString(res));
} catch (NumberFormatException e) {
}
    }//GEN-LAST:event_butIgualActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JCalculadora().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but0;
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.JButton but5;
    private javax.swing.JButton but6;
    private javax.swing.JButton but7;
    private javax.swing.JButton but8;
    private javax.swing.JButton but9;
    private javax.swing.JButton butDividir;
    private javax.swing.JButton butIgual;
    private javax.swing.JButton butMultiplicar;
    private javax.swing.JButton butPonto;
    private javax.swing.JButton butSoma;
    private javax.swing.JButton butSubtrair;
    private javax.swing.JLabel entrada;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
