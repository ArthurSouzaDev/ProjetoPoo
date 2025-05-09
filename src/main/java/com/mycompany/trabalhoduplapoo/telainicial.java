/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalhoduplapoo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class telainicial extends javax.swing.JFrame {

    Conta conta;
    //Criação de nova lista, lista clientes
    ArrayList<Conta> listaContas = new ArrayList();
    
    public telainicial() {
        initComponents();
    }
    
    //Alteração de valor e situação de conta
    public boolean alterar(int mes, int ano){
        
        for (Conta conta : listaContas){
            if (conta.getMes() ==  mes && conta.getAno() == ano ) {
                JOptionPane.showMessageDialog(null,"Conta encontrada");
                String situ = JOptionPane.showInputDialog(("A conta foi paga?: [sim ou não]"));
                if(situ.equalsIgnoreCase("sim")){
                    conta.setPaga(true);
                }
                else {
                    conta.setPaga(false);
                }
                
                conta.setKw(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de kw gasto no mês:")));
                conta.setValorKw(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de kw cobrado pela empresa:")));
                
                return true;
            }
        }
        return false; 
    }
    
    //Iprimir contas em aberto
    public String imprimeContasAberto(){
        String strContas = "Contas em aberto:\n";
        for (Conta conta : listaContas){
            if (conta.isPaga() == false){
                strContas += conta.getInfo() + "\n";
            }
        }
        return strContas;
    }
    
    //Imprimir contas pagas
    public String imprimeContasPagas(){
        String strContas = "Contas pagas:\n";
        for (Conta conta : listaContas){
            if (conta.isPaga() == true){
                strContas += conta.getInfo() + "\n";
            }
        }
        return strContas;
    }
    
    //Imprimir contas de um ano especifico
    public String imprimeContasAno(int ano){
        String strContas = "Contas do ano de " + ano + "\n";
        for (Conta conta : listaContas){
            if (conta.getAno() == ano){
                strContas += conta.getInfo() + "\n";
            }
        }
        return strContas;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        else{
            int local_mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês:"));
            int local_ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
            if (!alterar(local_mes,local_ano)){
                JOptionPane.showMessageDialog(null,"A conta não foi encontrada!");
            }
            
        }
    }
        
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
            java.util.logging.Logger.getLogger(telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telainicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
;