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
public class DatosPersona {
    public static void main(String[]args){
        String nombre, sexo;
        int edad, peso, altura;
        nombre =  JOptionPane.showInputDialog(null, "Ingresa nombre");
        sexo=JOptionPane.showInputDialog(null, "Ingresa Masculino/Femennino");
        edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa Edad"));
        peso=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa Peso"));
        altura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa Altura"));
        
        EjecutableDatos p1 = new EjecutableDatos();
        p1.setGeneral(nombre, sexo, altura, peso, edad);
        p1.general(nombre, sexo, altura, peso, edad);
        p1.VerDatos();
        
        EjecutableDatos p2 = new EjecutableDatos();
        p2.setSegundo(nombre, sexo, edad);
       p2.segundo(nombre, sexo, edad);
       p2.VerDatos();
    }
}
