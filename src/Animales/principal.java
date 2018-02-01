/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

import javax.swing.JOptionPane;

/**
 *
 * @author Markitos
 */
public class principal {
    public static void main(String[]args){
        // int patas, String ojos, String Ocico, String cola, String relincha, String Noble
        int pats;
        String ojs, Ocic, col, relinch, noble;
        
        pats=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa numero Patas"));
        ojs=JOptionPane.showInputDialog(null,"Tamaños Ojos");
        Ocic=JOptionPane.showInputDialog(null,"Tamaño Ocico: ");
        col=JOptionPane.showInputDialog(null,"Tamaño de la Cola del animlal");
        relinch=JOptionPane.showInputDialog(null, "El Caballo Relincha:");
        noble=JOptionPane.showInputDialog(null,"El Caballo es noble(SI/NO) ");
        
        Perros perro =  new Perros(4, "Grandes", "Mediano","Mediana", "Fuerte","Olato moderado");         
        perro.VerDatos();
        
        Caballo caba = new Caballo(pats, ojs, Ocic, col, relinch, noble);
        caba.VerDatos();
        
    }
}
