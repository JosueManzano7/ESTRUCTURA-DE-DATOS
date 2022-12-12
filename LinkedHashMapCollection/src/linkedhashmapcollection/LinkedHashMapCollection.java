package linkedhashmapcollection;
import java.util.*;
/**
 * @author sigma        
 */
public class LinkedHashMapCollection {

    public static void main(String[] args) {
        //Creación del LinkedHashMap
        LinkedHashMap<Integer, String> Hashmap =  new  LinkedHashMap<Integer, String>();           
        Hashmap.put(1000,"Josue");    
        Hashmap.put(1001,"Rose");    
        Hashmap.put(1002,"Jennie");    
        Hashmap.put(1003,"Joel");    
        Hashmap.put(1004,"Armando"); 
        
        //Imprimimos LinkedHashMap
        System.out.println(Hashmap);
        
       //Regresa clave de los elementos del HashMap
       System.out.println( "Claves: " +Hashmap.keySet());  
       
       //Regresa el  valor  de los elementos del HashMap
       System.out.println("Values: "+Hashmap.values());  
       
       //Regresa el par clave-valor  del HashMap
       System.out.println( "Pares clave-valor: " +Hashmap.entrySet());  
       
       //Existe elemento con la llave 1000?
        System.out.println(Hashmap.containsKey(1000));
        
        //Existe el elemento Rose?
        System.out.println(Hashmap.containsValue("Rose"));
        
        //Elimina elemento con llave 1004
        Hashmap.remove(1004);  
        System.out.println(Hashmap);
    }
}
