package treemapcollection;
import java.util.*;
/**
 * @author sigma
 */
public class TreeMapCollection {

    public static void main(String[] args) {
        //Creamos el TreeMap
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
        
        //Agregamos elementos
        map.put(100,"Josue");    
        map.put(101,"Nayeon");    
        map.put(102,"Nancy");    
        map.put(103,"Jooe");    
        map.put(104,"Miguel");    
        
        //Imprimimos el TreeMap
        System.out.println(map);
        
        //Ordenamos de forma descendente
        System.out.println("Orden Descendente: "+map.descendingMap());  
        
        //Regresa elementos con llave menor o igual a 102
        System.out.println("headMap: "+map.headMap(102,true)); 
        
        //Regresa elementos con llave mayor o igual a102
        System.out.println("tailMap: "+map.tailMap(102,true));  
        
        //Regresa elementos con llave mayor 100 y menor o igual a 102 
        System.out.println("subMap: "+map.subMap(100, false, 102, true)); 
        
        //Elminamos elemento con llave 104
        map.remove(104);
        System.out.println(map);
        
    }
    
}
