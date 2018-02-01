/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercisiosPOO;

import javax.swing.JOptionPane;

/**
 *
 * @author Markitos
 */
public class Principal {
    public static void main(String[]args){
        cuenta em = new cuenta("Markitos");
        cuenta em2 =  new cuenta("Saul", 300);
        
        em.ingresar(500);
        em.retirar(400);
        em.ToString();
        
        em2.retirar(100);
        em2.ToString();
      
    }
}
