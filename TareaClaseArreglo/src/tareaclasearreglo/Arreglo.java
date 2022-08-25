
package tareaclasearreglo;

import java.util.Scanner;


public class Arreglo {


    public static void main(String[] args) {
        int e=0;
        
        Scanner ent= new Scanner(System.in);
        Scanner str= new Scanner(System.in);
  
       Alumnos []alumno=new Alumnos[58];
        alumno[0]=new Alumnos("Josué Manzano Ponce", 5, 422789645);
        alumno[1]=new Alumnos("Javier Hernández Ponce", 5, 422789645);
        alumno[2]=new Alumnos("Abraham Nodal Sanchez", 15, 422784596);
        alumno[3]=new Alumnos("Mayra Guzman Sanchéz", 43, 422854632);
        alumno[4]=new Alumnos("Alberto Dominguez Alavez", 8, 422123456);

       int longitud=alumno.length;
       
        System.out.println("BIENVENIDO ¿QUÉ DESEAS HACER?\n");
        System.out.println("1. SABER EL TAMAÑO DEL ARREGLO\n");
        System.out.println("2. AGREGAR UN ALUMNO EN UNA POSICIÓN DEL ARREGLO\n");
        System.out.println("3. INDICAR UNA POSICIÓN Y SABER QUIÉN ESTA AHÍ\n");
        System.out.println("4. LIMPIAR CAMPOS\n");
        System.out.println("5. ESTADO ACTUAL DE LOS ALUMNOS\n");
       
        System.out.println("Respuesta: ");
        int opcion=ent.nextInt();
        
        
        switch (opcion)
        {
            case 1: 
                
                System.out.println("LA LONGITUD DEL ARRAY ES DE: "+longitud);
                break;
             
            case 2:
                
                System.out.println("\nDAME EL NOMBRE DEL ALUMNO: ");
                String nombre=str.nextLine();
                System.out.println("\nDAME LA EDAD DEL ALUMNO: ");
                int edad=ent.nextInt();
                System.out.println("\nDAME EL NÚMERO DE CUENTA DEL ALUMNO: ");
                int numerocuenta=ent.nextInt();
                System.out.println("\nDAME LA POSICION DONDE QUIERES AL ALUMNO EN EL ARREGLO: ");
                int posicion=ent.nextInt()-1;

                if (posicion+1>longitud || posicion <0){
                    System.out.println("DEBES DE PONER UN UN NUMERO ENTRE 0 Y "+ longitud);
                }
               else if(alumno[posicion]!=null){
                    System.out.println("UN ALUMNO YA ESTA OCUPANDO ESA POSICIÓN, USA OTRA\n");
                
                }
                else{
               
                   alumno[posicion]=new Alumnos(nombre,edad,numerocuenta);
                    System.out.println("ALUMNO COLOCADO CORRECTAMENTE: ");
                    System.out.println(alumno[posicion]+"\n");
                     
                      for(Alumnos i:alumno){
          
                        e++;
                      System.out.println(e+"  "+i);
                      }             
                }
                break;
            
            case 3:
                System.out.println("\nDAME LA POSICION DONDE QUIERES AL ALUMNO EN EL ARREGLO: ");
                int indice=ent.nextInt()-1;
                if (indice+1>longitud || indice<0){
                    System.out.println("DEBES DE PONER UN UN NUMERO ENTRE 0 Y "+ longitud);
                }
                else if(alumno[indice]==null){
                    System.out.println("\nNO HAY NADIE EN EL INDICE DADO: ");
                    System.out.println(alumno[indice]);
                }
                else{
                    System.out.println("\nEl ALUMNO QUE SE ENCUENTRA EN ESA POSICIÓN ES: ");
                    System.out.println(alumno[indice]);
                }
                break;
                
            case 4:   
                
                for(int a=0; a<longitud; a++){
   
                alumno[a]= new Alumnos(" ", 0, 0);         
                    System.out.println(a+1+" "+alumno[a]);          
                }
                System.out.println("\n ARREGLO ALUMNO LIMPIO\n");
                break;
                
            case 5:
                System.out.println(" \nALUMNOS REGISTRADOS: \n");
                for(Alumnos i:alumno){
                    e++;
                    System.out.println(e+" "+i);
                   }
                break;
            default:
                System.out.println(" \nDEBES DE INGRESAR UN NÚMERO DEL 1 AL 5 INTENTA DE NUEVO \n");      
  
        }
 
    }

    }




     
