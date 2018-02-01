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
public class AdministradorOverride extends InformaticosOverride{
    @Override    
    public void sueldo(double sueldo){            
       JOptionPane.showMessageDialog(null, "Soy Administrador BD y mi sueldo es:"+sueldo);
    }
   @Override
   public void datos(String nom){
       JOptionPane.showMessageDialog(null, "Soy Administrador BD mi nombre es:"+nom);
    }
   @Override 
   public void labores(String lab){
       JOptionPane.showMessageDialog(null,"Soy Administrador y mi labor es: "+lab);
   }
}
