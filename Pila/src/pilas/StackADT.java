/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

import java.util.ArrayList;

/**
 *
 * @author sigma
 */
public class StackADT <T>{
    ArrayList<T> datos;
    //private int tamanio=0;
    int tope=0;
    
     public StackADT(){
        datos=new ArrayList();
    }
     
     public boolean isEmpty(){
         return datos.size()==0;
     }
     
     public int length(){
         return datos.size();
     }
     
     public T pop(){
         T elemento_sacado=datos.remove(tope-1);
         tope--;
         return elemento_sacado;
     }
     
     public T peek(){
         return datos.get(tope-1);
     }
     
     public void push(T valor){
         datos.add(valor);
         tope++;
     }
     
    @Override
     public String toString(){
         String e="";
         for (int i=tope-1; i>=0; i--) {
             e+=String.valueOf(datos.get(i))+"\n";
        }
         return e;
     }
     
    
}
