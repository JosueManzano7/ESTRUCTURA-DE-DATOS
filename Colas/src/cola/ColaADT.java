
package cola;

import java.util.ArrayList;

/**
 *
 * @author sigma
 */
public class ColaADT <T>{
    
        ArrayList<T> datos;
        
        public ColaADT(){
        datos=new ArrayList();
        }
    
        public boolean isEmpty(){
            return datos.size()==0;
        }
        
        public int length(){
            return datos.size();
        }
        
        public void enqueue(T elem){
            datos.add(elem);
        }
        
        public T dequeue(){
            T sacado=null;
            if (datos.isEmpty()==false) {
                 sacado= datos.remove(0);
            }
            return sacado;
        }
        
        @Override
        public String toString(){
            String e="";
            for (T dato : datos) {
                e+=dato+" >> ";
            }
            return e;
        }
    
}
