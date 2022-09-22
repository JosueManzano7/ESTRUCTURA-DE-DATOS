/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjuntos;


public class Main {
    
        public static void main(String[] args) {
          // creamos 2 conjuntos de tipo integer  
        ConjuntoADT<Integer> conjuntoADT_1 = new ConjuntoADT();
        ConjuntoADT<Integer> conjuntoADT_2 = new ConjuntoADT();

        System.out.println("\n****************************agregar()*****************************\n");
        //agregamos datos al conjunto 1
        conjuntoADT_1.agregar(1);
        conjuntoADT_1.agregar(2);
        conjuntoADT_1.agregar(3);
        conjuntoADT_1.agregar(4);
        conjuntoADT_1.agregar(5);
        conjuntoADT_1.agregar(6);
        conjuntoADT_1.agregar(7);
        conjuntoADT_1.agregar(8);
        conjuntoADT_1.agregar(9);
        conjuntoADT_1.agregar(10);
        
        //agragamos datos al conjunto 2;
        conjuntoADT_2.agregar(3);
        conjuntoADT_2.agregar(4);
        conjuntoADT_2.agregar(5);
        conjuntoADT_2.agregar(6);

        System.out.println("Elementos conjunto 1: "+conjuntoADT_1);
        System.out.println("Elementos conjunto 2: "+conjuntoADT_2);
        
        System.out.println("\n****************************getLongitud()*****************************\n");
        System.out.println("Longitud conjunto 1: "+conjuntoADT_1.getLongitud());
        System.out.println("Longitud conjunto 2: "+conjuntoADT_2.getLongitud());
        
        System.out.println("\n****************************contiene()*****************************\n");
        System.out.println("¿El conjunto 1 contiene el elemento 2?: "+conjuntoADT_1.contiene(2));
        System.out.println("¿El conjunto 2 contiene el elemento 8?: "+conjuntoADT_2.contiene(8));

        System.out.println("\n****************************eliminar()*****************************\n");
        System.out.println("Elementos conjunto 1: "+conjuntoADT_1);
        conjuntoADT_1.eliminar(1);
        System.out.println("Elementos conjunto 1: "+conjuntoADT_1);

        System.out.println("\n****************************esIgual()*****************************\n");
        System.out.println("¿El conjunto 1 es igual al conjunto 1?: "+conjuntoADT_1.esIgual(conjuntoADT_1));
        System.out.println("¿El conjunto 1 es igual al conjunto 2?: "+conjuntoADT_1.esIgual(conjuntoADT_2));

        System.out.println("\n****************************esSubConjunto()*****************************\n");
        System.out.println("¿El conjunto 1 es subconjunto del conjunto 2?: "+conjuntoADT_1.esSubConjunto(conjuntoADT_2));
        System.out.println("¿El conjunto 2 es subconjunto del conjunto 1?: "+conjuntoADT_2.esSubConjunto(conjuntoADT_1));

        System.out.println("\n****************************interseccion()*****************************\n");
        System.out.println("Elementos conjunto 1: "+conjuntoADT_1);
        System.out.println("Elementos conjunto 2: "+conjuntoADT_2);
        ConjuntoADT<Integer> conjuntoADT_interseccion = conjuntoADT_1.Interseccion(conjuntoADT_2);
        System.out.println("Elementos que estan en conjunto 1 y en conjunto 2: "+conjuntoADT_interseccion);

        System.out.println("\n****************************diferencia()*****************************\n");
        System.out.println("Elementos conjunto 1: "+conjuntoADT_1);
        System.out.println("Elementos conjunto 2: "+conjuntoADT_2);
        ConjuntoADT<Integer> conjuntoADT_diferencia = conjuntoADT_1.Diferencia(conjuntoADT_2);
        System.out.println("Elementos de conjunto 1 que no estan en conjunto 2: "+conjuntoADT_diferencia);

        System.out.println("\n****************************union()*****************************\n");
        System.out.println("Elementos conjunto 1: "+conjuntoADT_1);
        System.out.println("Elementos conjunto 2: "+conjuntoADT_2);
        conjuntoADT_1.union(conjuntoADT_2);
        System.out.println("Elementos de conjunto 1 + conjunto 2: "+conjuntoADT_1);
            
           
    }
    
}
