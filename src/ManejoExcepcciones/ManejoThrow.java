/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoExcepcciones;

import javax.swing.JOptionPane;
import jdk.internal.org.objectweb.asm.commons.TryCatchBlockSorter;

/**
 *
 * @author Markitos
 */
public class ManejoThrow {
    public static void main(String []args)
    {
        int x,y;
        try {
          x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Num: ","Solicitando X",3));
          y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Num y","Solicitando Y",3));
          if(y==0){
              throw new ArithmeticException();
              
          }else {
              JOptionPane.showMessageDialog(null,"La Division de: "+ x +" y "+y+" es: "+ (x / y) );
          }
        } catch (ArithmeticException ar) {
            System.out.println(ar.getMessage()+"\nError en la division");
        }
        catch (Exception e){ // generaliza todos los erroes 
            System.out.println(e.getMessage()+"Error");
        }
    }
       
}
