package com.mycompany.impar_par;
import javax.swing.JOptionPane;

/**
 * Erros:
 * @author ApenasPedro
 */
public class Impar_par {
    public static void main(String[] args) {
        String N1 = JOptionPane.showInputDialog("Digite um número");
        
        int n1 = Integer.parseInt(N1);
       if (n1 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é Par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é Ímpar.");
        }
    }
}