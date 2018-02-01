/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Markitos
 */
public abstract class Persona {
    int ed;
    String nombre;
    Persona(String nombre, int ed){
        this.nombre=nombre;
        this.ed=ed;
    }
    
    abstract public void VerDatos();
        
    
}
