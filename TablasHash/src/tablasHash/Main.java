package tablasHash;

/**
 *
 * @author sigma
 */
public class Main {
    public static void main(String[] args) {
        //Creación HastTableADT
        HashTableADT <Integer> prueba=new HashTableADT();
        
        //Tamanio de la Tabla Hash
        prueba.HashTableADT(9);
        
        //Agregamos elementos add(key, value)
        prueba.add(8245, 10000);//1
        prueba.add(1111, 32000);//4
        prueba.add(4565, 28000);//2
        prueba.add(8987, 12);//5
        prueba.add(1224, 10);//0
        prueba.add(2528, 50);//8
        prueba.add(2536, 7);//7
        prueba.add(2578, 888);//7
        prueba.mostrar();
        
        //mostrar elemento a partir de key valueOf(key)
        System.out.println("\nElemento en llave 1224: "+prueba.valueOf(1224));
        
        //Elimina elemento a partir de key remove(key)
        System.out.println("\nElemento eliminando: "+prueba.remove(8987));
        
        //Muestra estado actual d ela tabla
        System.out.println("\nEstado actual de la tabla:");
        prueba.mostrar();

    }
    
}
