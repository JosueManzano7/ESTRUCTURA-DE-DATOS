/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author sigma
 */
public class Main {
    public static void main(String[] args) {
        //creacion de pila Stack()
        StackADT<Integer> pila=new StackADT();
        
        //Agragamos elementos pop()
        pila.push(10);
        pila.push(8);
        pila.push(1000);
        pila.push(7);
        pila.push(505);
        pila.push(12);
        System.out.println("Pila: ");
        System.out.println(pila.toString());
        
        //Esta vacia isEmpty()
        System.out.println("La pila esta vacia?: "+pila.isEmpty());
        
        //Tamanio de la pila length()
        System.out.println("Tamanio de la pila: "+pila.length());

        //saca elemento de la pila pop()
        System.out.println("Elemento sacado: "+pila.pop());
 
        //consulta ultimo elemento peek()
        System.out.println("Ultimo elemento de la pila: "+pila.peek());
        
        //elementos de la pila toString()
        System.out.println("Pila: ");
        System.out.println(pila.toString());

        
        
    }
    
}
