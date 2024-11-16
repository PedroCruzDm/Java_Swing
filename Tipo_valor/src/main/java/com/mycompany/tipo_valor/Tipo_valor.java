/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tipo_valor;

import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class Tipo_valor {

    public static void main(String[] args) {
          int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número é Positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número é Negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é Zero.");
        }
    }
}