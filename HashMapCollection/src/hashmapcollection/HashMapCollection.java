package hashmapcollection;
import java.util.*;
/**
 * @author sigma
 */
public class HashMapCollection {

    public static void main(String[] args) {
        //Creamos el HashMap
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        
        //Agregamos elementos
        map.put(1,"Mango"); 
        map.put(2,"Manzana");    
        map.put(3,"Uva");   
        map.put(4,"Sandia");   
        map.put(5,"Melon");   
        
        //Imprimimos el HashMap
        System.out.println(map);
        
        //Eliminamos elemento 4
        map.remove(4);
        System.out.println(map);
        
        //Reemplazamos elemento Papaya por Mango
        map.replace(1, "Papaya");
        System.out.println(map);
        
        //Hay elemento con la llave 8?
        System.out.println(map.containsKey(8));
        
        //Hay el elemento Uva?
        System.out.println(map.containsValue("Uva"));

        //Reemplaza todos los elementos a un valor
        map.replaceAll((k,v) -> "Fresa");  
        System.out.println(map);      
    }   
}
