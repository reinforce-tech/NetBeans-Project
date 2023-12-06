/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package buildGUI;

/**
 *
 * @author john clarence
 */
public class new_calculator extends javax.swing.JFrame {

     
    double firstNum;
    double secondNum;
    double result;
    String Operation;
    
    
    /**
     * Creates new form NewJFrame
     */
    public new_calculator() {
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

        jTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnMultiplication = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtnDivision = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnSum = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jBtnNegativeNum = new javax.swing.JButton();
        jBtnMinus = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        jBtnResult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("SIMPLE CALCULATOR");

        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtnMultiplication.setText("*");
        jBtnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMultiplicationActionPerformed(evt);
            }
        });

        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtnDivision.setText("÷");
        jBtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivisionActionPerformed(evt);
            }
        });

        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnSum.setText("+");
        jBtnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSumActionPerformed(evt);
            }
        });

        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnDot.setText(".");
        jBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });

        jBtnNegativeNum.setText("+/-");
        jBtnNegativeNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNegativeNumActionPerformed(evt);
            }
        });

        jBtnMinus.setText("-");
        jBtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinusActionPerformed(evt);
            }
        });

        jBtnClear.setText("C");
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        jBtnResult.setText("=");
        jBtnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnNegativeNum, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnSum, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jBtnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1))
                    .addComponent(jTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jBtn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnMultiplication, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jBtnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jBtnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnNegativeNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        // TODO add your handling code here:
        String newNumber = jTextField.getText() + jBtn1.getText();
         jTextField.setText(newNumber);
        
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        // TODO add your handling code here:
          String newNumber = jTextField.getText() + jBtn2.getText();
         jTextField.setText(newNumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        // TODO add your handling code here:
         String newNumber = jTextField.getText() + jBtn3.getText();
         jTextField.setText(newNumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMultiplicationActionPerformed
        // TODO add your handling code here:
       firstNum = Double.parseDouble(jTextField.getText());
       jTextField.setText("");
       Operation = "*";
        
    }//GEN-LAST:event_jBtnMultiplicationActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        // TODO add your handling code here:
         String newNumber = jTextField.getText() + jBtn4.getText();
         jTextField.setText(newNumber);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        // TODO add your handling code here:
         String newNumber = jTextField.getText() + jBtn5.getText();
         jTextField.setText(newNumber);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        // TODO add your handling code here:
         String newNumber = jTextField.getText() + jBtn6.getText();
         jTextField.setText(newNumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivisionActionPerformed
        // TODO add your handling code here:
        firstNum = Double.parseDouble(jTextField.getText());
       jTextField.setText(" ");
       Operation = "/";
        
    }//GEN-LAST:event_jBtnDivisionActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        // TODO add your handling code here:
         String newNumber = jTextField.getText() + jBtn7.getText();
         jTextField.setText(newNumber);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        // TODO add your handling code here:
         String newNumber = jTextField.getText() + jBtn8.getText();
         jTextField.setText(newNumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        // TODO add your handling code here:
         String newNumber = jTextField.getText() + jBtn9.getText();
         jTextField.setText(newNumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSumActionPerformed
        // TODO add your handling code here:
        firstNum = Double.parseDouble(jTextField.getText());
       jTextField.setText(" ");
       Operation = "+";
    }//GEN-LAST:event_jBtnSumActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        // TODO add your handling code here:
        String newNumber = jTextField.getText() + jBtn0.getText();
         jTextField.setText(newNumber);
         
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDotActionPerformed
        // TODO add your handling code here:
         String dotNew = jTextField.getText() + jBtnDot.getText();
        jTextField.setText(dotNew); 
    }//GEN-LAST:event_jBtnDotActionPerformed

    private void jBtnNegativeNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNegativeNumActionPerformed
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jTextField.getText()));
        ops = ops * (-1);
        jTextField.setText(String.valueOf(ops));
       
        
        
    }//GEN-LAST:event_jBtnNegativeNumActionPerformed

    private void jBtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMinusActionPerformed
        // TODO add your handling code here:
        firstNum = Double.parseDouble(jTextField.getText());
       jTextField.setText(" ");
       Operation = "-";
    }//GEN-LAST:event_jBtnMinusActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        // TODO add your handling code here:
        jTextField.setText(" ");
        
        
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResultActionPerformed
        // TODO add your handling code here:
        
        
        String answer;
        secondNum = Double.parseDouble(jTextField.getText());

        try {
        if (null != Operation)
            switch (Operation) {
                case "*":
                    result = firstNum * secondNum;
                    answer = String.format("%.0f", result);
                    jTextField.setText(answer);
                    break;
                case "/":
                    if (secondNum == 0) {
                        if (firstNum == 0) {
                            // Both numerator and denominator are zero, result is undefined
                            jTextField.setText("Result undefined");
                        } else {
                            // Numerator is not zero, cannot divide by zero
                            jTextField.setText("Cannot divide by zero");
                        }
                    } else {
                        // Normal division when denominator is not zero
                        result = firstNum / secondNum;
                        answer = String.format("%.0f", result);
                        jTextField.setText(answer);
                    }
                    break;
                case "+":
                    result = firstNum + secondNum;
                    answer = String.format("%.0f", result);
                    jTextField.setText(answer);
                    break;
                case "-":
                    result = firstNum - secondNum;
                    answer = String.format("%.0f", result);
                    jTextField.setText(answer);
                    break;
                  }
             } catch (NumberFormatException e) {
                  jTextField.setText("Error");
             }      
    }//GEN-LAST:event_jBtnResultActionPerformed

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
            java.util.logging.Logger.getLogger(new_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnDivision;
    private javax.swing.JButton jBtnDot;
    private javax.swing.JButton jBtnMinus;
    private javax.swing.JButton jBtnMultiplication;
    private javax.swing.JButton jBtnNegativeNum;
    private javax.swing.JButton jBtnResult;
    private javax.swing.JButton jBtnSum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables
}
