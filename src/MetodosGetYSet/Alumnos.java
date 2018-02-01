/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosGetYSet;

/**
 *
 * @author Markitos
 */
public class Alumnos {
    int noControl;
    String nombre, apellidos;
   
    Alumnos(int NoControl, String nombre, String apellidos){
        this.noControl=NoControl;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }
    
    void verAlumno(){
        System.out.println("No. Control es: "+noControl);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
    }

    public int getNoControl() {
        return noControl;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;        
    }
    
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
        
}
