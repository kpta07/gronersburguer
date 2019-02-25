/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicativogronersdesktop;

import javax.swing.JOptionPane;

/**
 *
 * @author sala302b
 */
public class AplicativoGronersDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String condicao, numero, nome, cadastro, telefone, endereco, finalizacao ="";
        
        int input = JOptionPane.showConfirmDialog(null,"Possui cadastro?");
        
        if(input == 0){
        condicao = JOptionPane.showInputDialog(null, "Informe o numero de telefone");    
        }
        if(input == 1) {
        nome = JOptionPane.showInputDialog("Nome");
        telefone = JOptionPane.showInputDialog("telefone"); 
        endereco = JOptionPane.showInputDialog("endereco");
           JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
    
    } if (input == 2){
    
}
    }
}