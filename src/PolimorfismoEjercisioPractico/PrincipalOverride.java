/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolimorfismoEjercisioPractico;

/**
 *
 * @author Markitos
 */
public class PrincipalOverride {
    public static void main(String[]args){
        ProgramadorOverride p1 = new ProgramadorOverride();
        AnalistaOverride an1 =  new AnalistaOverride();
        AdministradirBD ad1 =  new AdministradirBD();
        p1.labores("Programo en Java");
        p1.datos("Saul");
        p1.sueldo(15000.01);
        
        an1.labores("Desarolo Ciclos de software");
        an1.datos("Markitos Lopez");
        an1.sueldo(5000);
        
        ad1.labores("Mineria de Datos");
        ad1.datos("Efren");
        ad1.sueldo(16000);
    }
}
