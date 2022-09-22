
package conjuntos;

import java.util.ArrayList;
import java.util.Iterator;


public class ConjuntoADT<T> implements Iterable<T>{   
   // ArrayList<T>set=new ArrayList();
    ArrayList<T>conjunto;
    
    ConjuntoADT(){
    conjunto=new ArrayList();
   }    
    
    public int getLongitud(){
        return conjunto.size();
    }
    
    public boolean contiene(T elemento){
        boolean resultado=false;
        
        for (T elemento_conjunto : conjunto) {
            if(elemento_conjunto==elemento){
                resultado=true;
            }
        }
        return resultado;
       
    }
    
    public void agregar(T elemento){
       if(contiene(elemento)==false){
           conjunto.add(elemento);
       }
    }
    
    public void eliminar(T elemento){
      if(contiene(elemento)==true){
          conjunto.remove(elemento);
      }
      else{
          System.out.println("El elemento no existe");
      }
    }
    
    public boolean esIgual(ConjuntoADT<T> otroConjunto){
        return this.conjunto.equals(otroConjunto.conjunto);
    }
    
    
    public boolean esSubConjunto(ConjuntoADT<T> otroConjunto){
        boolean resultado=true;
        for (T elemento_conjunto : conjunto) {
            if(otroConjunto.contiene(elemento_conjunto)==false){
                resultado=false;
            }
        }
        return resultado;
    }
    
    
    public void union(ConjuntoADT<T> otroConjunto){
       for (T elemento_conjunto : otroConjunto) {
            agregar(elemento_conjunto);
        }
    }
    
    
    public ConjuntoADT<T> Interseccion(ConjuntoADT<T> otroConjunto){
        ConjuntoADT<T> conjunto_interseccion=new ConjuntoADT();
        for (T elemento_otroConjunto : otroConjunto.conjunto) {
            if(contiene(elemento_otroConjunto)==true){
                conjunto_interseccion.agregar(elemento_otroConjunto);
            }
        }
        return conjunto_interseccion;
    }
    
    
    public ConjuntoADT<T> Diferencia (ConjuntoADT<T> otroConjunto){
        ConjuntoADT<T> conjunto_diferencia=new ConjuntoADT();
        for (T elemento_otroConjunto : otroConjunto.conjunto) {
            if(contiene(elemento_otroConjunto)==false){
                conjunto_diferencia.agregar(elemento_otroConjunto);
            }
        }
        for (T elemento_conjunto : conjunto) {
            if(!otroConjunto.contiene(elemento_conjunto)){
                conjunto_diferencia.agregar(elemento_conjunto);
            }
        }

        return conjunto_diferencia;
    }

    
    @Override
    public String toString() {
        return conjunto.toString();
    }
    
    

    @Override
    public Iterator<T> iterator() {
        
         return new Iterator<T>() {
             int indice=0;
             @Override
             public boolean hasNext() { //tiene un siguente elemento?
                 return indice<conjunto.size();
             }

             @Override
             public T next() {   //Si si, echalo
                  return conjunto.get(indice++);  //++indice   hace el de uno, 
             }
         };
    }
    
    
}//fin 
