/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosGetYSet;
import java.util.*;
/**
 *
 * @author Markitos
 */
public class Principal {
    public static void main(String[]args){
        Scanner dame = new Scanner(System.in);
        int control;
        String name, apellidos;
               
        
        System.out.println("Ingresa El nombre");
        name =  dame.next();
        System.out.println("ingresa el numero control: ");
        control =  dame.nextInt();
        
        
        Alumnos alu1 = new Alumnos(control,name,"Lopez");
        Alumnos alu2 =  new Alumnos(2312,"Eliseo","Arzate");
        alu1.verAlumno();
        alu2.verAlumno();
        
        System.out.println("Obteniendo el nombre del Alumno1 "+alu1.getNombre());
        alu1.setNoControl(15048);
        alu2.setNombre("Sharon");
        System.out.println("El nuevo No Control del alumno1 es "+alu1.getNoControl());
        System.out.println("El nuevo no,bre del alumno2  es"+alu2.getNombre());
        alu2.verAlumno();
        alu1.verAlumno();
    }
}
