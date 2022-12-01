package tablasHash;

import java.util.ArrayList;

/**
 *
 * @author sigma
 */
public class HashTableADT <T>{
    private ArrayList<T> [] hash;
    private int tamanio_tabla_hash;
    
    public void HashTableADT(int table_size){
        
        if(table_size%2==1){
            hash=new ArrayList[table_size];
            tamanio_tabla_hash=table_size;
        }
        else{System.out.println("DEBE DE USAR UN NÚMERO PAR");}
    }
    
    public void add(int key, T value){
        int posicion=key%tamanio_tabla_hash;
        if(posicion>tamanio_tabla_hash){
            System.out.println("LLAVE FUERA DEL RANGO ESTABLECIDO");
        }
        if(hash[posicion]==null){
            hash[posicion]=new ArrayList();
        }
        hash[posicion].add(value);
    }
    
    public ArrayList<T> valueOf( int key){
        return hash[key%tamanio_tabla_hash];
    }
    
    public T remove(int key){
        T a=hash[key%tamanio_tabla_hash].remove(hash[key%tamanio_tabla_hash].size()-1);
        return a;
    }
    
    public void mostrar(){
        for (int i = 0; i < hash.length; i++) {
            System.out.println(i+" "+hash[i]);
        }
    }
}
