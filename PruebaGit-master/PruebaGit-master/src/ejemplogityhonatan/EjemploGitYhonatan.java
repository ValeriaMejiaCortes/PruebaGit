/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogityhonatan;

import javax.swing.JOptionPane;

/**
 *
 * @author salas
 */
public class EjemploGitYhonatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        //
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        System.out.println("La suma de " + num1 + " + " +  num2 + " = " + (num1+num2));
    }
    
}
