/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaPrioridadAcotada;

import java.util.ArrayList;

/**
 *
 * @author sigma
 */
public class ColaPrioridadAcotadaADT <T> {
    
    private ArrayList<T>[] data; //arreglo de ArrayList
 
    private int longitud;
    
    public ColaPrioridadAcotadaADT(int niveles){
        data=new ArrayList[niveles+1];
        longitud=0;
    }
    
    public boolean isEmpty(){
        return data.length==0;
    }
    
    public int length(){
        return longitud;
    }
    
    public void enqueue(int prioridad, T elemento) {
        if( prioridad<0 || prioridad>=data.length){
            System.out.println("Fuera de los limites");
            return;
        }
        if(data[prioridad]==null){
            data[prioridad]=new ArrayList<>();
        }
        
        data[prioridad].add(elemento);
        longitud++;
        
    }
    
    public T dequeue(){
         for (int i = 0; i < data.length; i++) {
            if (data[i] != null && !data[i].isEmpty()) {
                return data[i].remove(0);
            }
        }
        return null;
    }
    
    @Override
        public String toString(){
            String e="";
            for (ArrayList<T> dato : data) {
                e+=dato+" >> ";
            }
            return e;
        }

    
}
