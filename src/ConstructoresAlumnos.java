/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Markitos
 */
public class ConstructoresAlumnos {
    int NoControl; 
    String nombre, apellidos;
    
    //Contructor

    ConstructoresAlumnos(int NoControl, String nombre, String apellidos) {
        this.NoControl=NoControl;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }
    
    
    void verDatos(){
        System.out.println("No Control: "+NoControl);
        System.out.println("No,bre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
    }
}
