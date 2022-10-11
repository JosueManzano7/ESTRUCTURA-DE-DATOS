/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sigma
 */
public class LinkedList<T extends Comparable<T>> {
    
    private Nodo<T> head;
    private int tamanio;

    public LinkedList(){
        head=null;
        tamanio=0;
    }
    
    public boolean esta_vacia(){
        return this.head==null;
    }
    
    public int get_tamanio(){
        /*int contador=0;
        Nodo<T> aux=head;
        while(aux!=null){
            contador++;
          aux=aux.getSiguiente();
        }
        return contador;*/

        return tamanio;
    }
    
    public void agregar_al_final(T valor) {
        if(head==null){
            agregar_al_inicio(valor);
        }
        
        else{
            Nodo<T> aux=head;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
           }
            Nodo<T> nuevo_nodo=new Nodo(valor);
            aux.setSiguiente(nuevo_nodo);
            tamanio++;
        }
    }
    
    public void agregar_al_inicio(T valor) {
        Nodo<T> nodo_inicio=new Nodo(valor);
        nodo_inicio.setSiguiente(head);
        head=nodo_inicio;
        tamanio++;
    }
    
    public void agregar_después_de(T referencia, T valor) {
        if (buscar(referencia) >= 0) {
            Nodo<T> aux = head;
            while (aux != null && !aux.getDato().equals(referencia)) {
                aux = aux.getSiguiente();
            }
            Nodo<T> nuevo_nodo = new Nodo(valor);
            nuevo_nodo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo_nodo);
            tamanio++;
        }
    }
    
    public void Eliminar(int posicion){
        if(posicion < tamanio) {
            if(posicion == 0){
                Eliminar_el_primero();
            } else {
                int contador = 0;
                Nodo<T> prev = null;
                Nodo<T> aux = head;
                while (aux != null && contador < posicion) {
                    prev = aux;
                    aux = aux.getSiguiente();
                    contador++;
                }
                prev.setSiguiente(aux.getSiguiente());
                tamanio--;
            }
        }
    }
    
    public void Eliminar_el_primero(){
        if(!esta_vacia()){
            head=head.getSiguiente();
            tamanio--;
        }
    }
    
    public void Eliminar_el_final(){
        if(!esta_vacia()){
            //Eliminar(tamanio-1);
            Nodo<T> prev=null;
            Nodo<T>aux=head;
            while(aux.getSiguiente()!=null){
                prev=aux;
                aux=aux.getSiguiente();
            }
            prev.setSiguiente(null);
            tamanio--;       
        }
    }
    
    public int buscar(T valor){
        int posicion = 0;
        Nodo<T> aux = head;
        while(aux != null){
            if(aux.getDato().equals(valor)) {
                return posicion;
            }
            aux = aux.getSiguiente();
            posicion++;
        }
        return -1;
    }
    
    public void actualizar(T a_buscar, T valor){
        if(buscar(a_buscar) >= 0) {
            Nodo<T> aux = head;
            while (aux != null && !aux.getDato().equals(a_buscar)) {
                aux = aux.getSiguiente();
            }
            aux.setDato(valor);
        }
    }
    
    public void transversal(){
        Nodo<T> aux = head;
        while (aux != null) {
            System.out.print(aux + " ");
            aux = aux.getSiguiente();
        }
        System.out.print("null\n");
    }
    
        
    
}
