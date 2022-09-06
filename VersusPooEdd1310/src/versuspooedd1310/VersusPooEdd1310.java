/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package versuspooedd1310;

import adts.Arreglo;
import ico.fes.acme.NominaADT;


public class VersusPooEdd1310 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro1 = new Perro("Fido", "Poddle", 5);
        Perro perro2 = new Perro("castroso", "Chichuahua", 2);
        Perro perro3 = new Perro("Firulais", "Akita", 3);
        Arreglo<Perro> lista = new Arreglo(5);
        System.out.println( lista );
        lista.setElemento(0, perro1);
        lista.setElemento(1, perro2);
        lista.setElemento(2, perro3);
        
        NominaADT nomina=new NominaADT();
        nomina.NominaADT();
        nomina.calcularSueldos();
        nomina.obtener_Max_Min();
        
        
    }
    
}




    //   System.out.println( lista.getElemento(1)); // getElement
       
     /*  System.out.println(lista);
        lista.limpiar(new Perro());
        System.out.println(lista);
        lista.limpiar(new Perro());
        System.out.println(lista);
        lista.limpiar(new Perro("Odin","Chihuaha",6));
        System.out.println(lista);*/
