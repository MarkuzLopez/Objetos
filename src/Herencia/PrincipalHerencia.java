/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Markitos
 */
public class PrincipalHerencia {
    public static void main(String[]args){
         ClasePadre cp = new ClasePadre();
        cp.HagoCerveza();
        
        ClaseHija ch = new ClaseHija();
        ch.HagoCerveza();
        JOptionPane.showMessageDialog(null, "Oficio clase hija: "+ch.oficio);
       ch.Hola();
    }
}
