
package cola;

import java.util.ArrayList;

/**
 *
 * @author sigma
 */
public class Main {
    public static void main(String[] args) {

        //Creamos la cola ColaADT()
        ColaADT<String> cola=new ColaADT();
        
        //agragamos datos al final de la cola enqueue()
        cola.enqueue("JOSUE");
        cola.enqueue("MARIA");
        cola.enqueue("NOE");
        cola.enqueue("ABRAHAM");
        cola.enqueue("MAYRA");
        
        //Estado actual de la cola toString()
        System.out.println("Estado actual de la cola: ");
        System.out.println( cola.toString());
        
        //La pila esta Vacia? isEmpty()
        System.out.println("\nLa Cola esta vacia: "+cola.isEmpty());
        
        //Numero de elementos de la cola legth()
        System.out.println("\n# elementos de la cola: "+cola.length());
        
        //quitya primer elemento de la cola dequeue()
        System.out.println("\nelemento quitado: "+cola.dequeue());
        
        //Estado actual de la cola toString()
        System.out.println("\nEstado actual de la cola: ");
        System.out.println( cola.toString());
       
                
        
    }
}
