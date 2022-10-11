/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sigma
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> listaLigada = new LinkedList<>();

        //esta_vacia()
        System.out.println("\n¿ESTA VACIA?: " + listaLigada.esta_vacia());
        
        //get_tamanio()
        System.out.println("\nTAMANIO : " + listaLigada.get_tamanio());

         // agregar_al_final()
        System.out.println("\nAGREGAMOS VALORES AL FINAL 80->90->100");
        listaLigada.agregar_al_final(80);
        listaLigada.agregar_al_final(90);
        listaLigada.agregar_al_final(100);
        listaLigada.transversal();

        // agregar_al_inicio()
        System.out.println("\nAGREGAMOS VALORES AL INICIO 9->10->11");
        listaLigada.agregar_al_inicio(11);
        listaLigada.agregar_al_inicio(10);
        listaLigada.agregar_al_inicio(9);
        listaLigada.transversal();

        //esta_vacia()
        System.out.println("\n¿ESTA VACIA?: " + listaLigada.esta_vacia());
        
        //get_tamanio()
        System.out.println("\nTAMANIO: " + listaLigada.get_tamanio());

        //agregar_después_de(T referencia, T valor)
        System.out.println("\nAGREGAMOS DESPUES DEL 11 EL 10001");
        listaLigada.agregar_después_de(11, 10001);
        listaLigada.transversal();

        //Eliminar(int posicion)
        System.out.println("\nELIMINAMOS EL ELEMENTO EN LA POSICION 3 (10001)");
        listaLigada.Eliminar(3);
        listaLigada.transversal();

        //Eliminar_el_primero()
        System.out.println("\nELIMINAMOS EL PRIMER ELEMENTO");
        listaLigada.Eliminar_el_primero();
        listaLigada.transversal();

        //Eliminar_el_final()
        System.out.println("\nELIMINAMOS EL ULTIMO ELEMENTO");
        listaLigada.Eliminar_el_final();
        listaLigada.transversal();

        //buscar(T valor)
        System.out.println("\nBUSCA LA POSICION DEL ELEMENTO 80: " + listaLigada.buscar(80));

        //actualizar(T a_buscar, T valor)
        System.out.println("\nACTUALIZA EL VALOR 10 AL VALOR 777");
        listaLigada.actualizar(10, 9);
        listaLigada.transversal();
        
        System.out.println("");

    }
}

