/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaPrioridadAcotada;

/**
 *
 * @author sigma
 */
public class Main {
    public static void main(String[] args) {
        

         //Creamos la cola ColaADT()
        ColaPrioridadAcotadaADT<String> cola=new ColaPrioridadAcotadaADT(8);
        
        //agragamos datos al final de la cola enqueue()
        cola.enqueue(0,"PEPE");
        cola.enqueue(1,"MARIA");
        cola.enqueue(9,"JAIME");
        cola.enqueue(2,"ABRAHAM");
        cola.enqueue(1,"NEYELI");
        cola.enqueue(3,"ROSA");
        cola.enqueue(4,"YAYO");
        cola.enqueue(7,"JOSUE");
        cola.enqueue(8,"AARON");
        cola.enqueue(5,"NOE");
        cola.enqueue(2,"FER");
        cola.enqueue(6,"NAYEON");
        cola.enqueue(5,"NANCY");
        cola.enqueue(0,"AHIN");
        cola.enqueue(7,"JOOE");
        
        //Esta vacia isempty()
        System.out.println("\nLa Cola esta vacia: "+cola.isEmpty());
        
        //Numero de elementos de la cola legth()
        System.out.println("\n# elementos de la cola: "+cola.length());
        
        //Estado actual de la cola toString()
        System.out.println("\nEstado actual de la cola: ");
        System.out.println( cola.toString());
        
        //Qutar elemento dequeue()
        System.out.println("\nElemento quitado: "+cola.dequeue());
        
        //Estado actual de la cola toString()
        System.out.println("\nEstado actual de la cola: ");
        System.out.println( cola.toString());
        
        
        
    }
    
}
