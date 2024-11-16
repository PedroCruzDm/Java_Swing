/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notas;

import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class Notas {

    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado com média: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado com média: " + media);
        }
    }
}