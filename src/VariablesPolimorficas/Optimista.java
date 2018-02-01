/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariablesPolimorficas;

import javax.swing.JOptionPane;

/**
 *
 * @author Markitos
 */
public class Optimista extends Personalidad{
    @Override
    public void hablar(){
        JOptionPane.showMessageDialog(null, "Yo soy el optimista");
    }
}
