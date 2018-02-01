/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolimorfismoEjercisioPractico;

import javax.swing.JOptionPane;

/**
 *
 * @author Markitos
 */
public class Programador extends Informatico{
        
        public void sueldo(int horas, double pagoH){
            JOptionPane.showMessageDialog(null, "El pago es: "+ (horas*pagoH));
        }
        
        public void sueldo(){
            
        }
        
        public void sueldo1(int pro){
            
        }
        public void datos(String nom, String ape){
            JOptionPane.showMessageDialog(null,"Nombre: "+nom+"\n Apellidos: "+ape);
        }
        
        public void labores(String lab){
            JOptionPane.showMessageDialog(null,"Soy Programador y me dedico a Desarollar: : "+lab);
        }
}
