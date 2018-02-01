/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Markitos
 */
public class ConsPrincipalAlumnos {
    public static void main(String[]args){
        ConstructoresAlumnos alumno1 =  new ConstructoresAlumnos(12345,"Markitoss","Lopezito");
        ConstructoresAlumnos alu2 = new ConstructoresAlumnos(2012150,"Saul","Gomez");
     
        alumno1.verDatos();
        alu2.verDatos();
    }
}
