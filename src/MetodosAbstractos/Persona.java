/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosAbstractos;
/**
 * Una clase Abstracta  Contiene al menos
 * un metodo que no ha sido, especificado es decir, 
 * Este sera heredado para sobreEscribirse
 * Haciendo la clase abstraccion para evitar, que sea instanciada
 */
public abstract class Persona {
    
    String nombre;
    int ed;
    
    Persona(String nom, int ed){
        this.nombre=nom;
        this.ed=ed;
    }
    
    // Creando el metodo abstracto 
    /*Anterior clase 
    public void VerDatos(){
    No lleva cuerpo la clase!    
    }*/
    abstract public void VerDatos();
}
