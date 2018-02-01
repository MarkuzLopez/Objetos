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
public class EjecutableDatos {
    String nombre, sexo;
    int altura, peso, edad;
        public void general(String nombre, String sexo, int altura, int peso, int edad){
            if(peso > 100){
                JOptionPane.showMessageDialog(null,"Tu peso es muy alto");
            } if( peso >= 80){
                JOptionPane.showMessageDialog(null, "Tu peso es ideal");
            }if(peso <= 30) {
                JOptionPane.showMessageDialog(null,"Tu sufres de peso bajo");
            }
            
            if(edad > 18){
                JOptionPane.showMessageDialog(null,"Tu eres mayor de Edad");
            }else {
                JOptionPane.showMessageDialog(null,"Tu Eres menor de Edad");
            }
        }
        
        public void segundo(String nombre, String sexo, int edad){
            JOptionPane.showMessageDialog(null, "Segundo Metodo");
            if(peso > 100){
                JOptionPane.showMessageDialog(null,"Tu peso es muy alto");
            } if( peso >= 80){
                JOptionPane.showMessageDialog(null, "Tu peso es ideal");
            }if(peso <= 30) {
                JOptionPane.showMessageDialog(null,"Tu sufres de peso bajo");
            }
            
            if(edad > 18){
                JOptionPane.showMessageDialog(null,"Tu eres mayor de Edad");
            }else {
                JOptionPane.showMessageDialog(null,"Tu Eres menor de Edad");
            }
        }
        
        public void setGeneral(String  nombre, String sexo, int altura, int peso, int edad){
            this.nombre=nombre;
            this.sexo=sexo;
            this.altura=altura;
            this.peso=peso;
            this.edad=edad;
        }
        
        public void setSegundo(String nombre, String sexo, int edad){
            this.nombre=nombre;
            this.sexo=sexo;
            this.edad=edad;
        }
        
        public void VerDatos(){
            JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\n Sexo: "+sexo+"\n Altura: "+altura+"\n Peso: "+peso+"\n Edad: "+edad);
        }
    
}
