/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolimorfismoEjercisioPractico;

/**
 *
 * @author Markitos
 * 
 * Polimorfismo 
 * Overload(Sobre carga)  Porlimorfismo  con respuestas de acuerdo a los parametros pudiendo agregar o quitar parametros 
 * 
 * Overrides(Sobre Escritura) Polimorfismo sobre escribirneo los metodos tal cual
 */
public class PrincipalPoli {
    public static void main(String[]args){
        Programador p1 =  new Programador();
        Analista a1 =  new Analista();
        AdministradirBD ad1 =  new AdministradirBD();
        p1.datos("Markitos", "Lopez");
        p1.sueldo(24,1900.01);
        p1.labores("Progrmamo en Java");
        
        a1.datos("Saul", "Gomez", "SantaMaria");
        a1.sueldo(8, 100.1, 400);
        a1.labores("Lider Proyecto", 10);
        
        ad1.datos("Efren");
        ad1.sueldo(15000);
        ad1.labores("BAse datos Oracle");
    }
}
