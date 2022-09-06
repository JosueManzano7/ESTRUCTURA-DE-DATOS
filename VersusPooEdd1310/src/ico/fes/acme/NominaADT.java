
package ico.fes.acme;
import java.util.*;
import adts.Arreglo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class NominaADT {
    String nombreEmpresa;
    private String linea;
    int contador=0;
    String contenido="";
    int i=0;
    private Arreglo<Empleado> empleados;


    public void NominaADT() {
        
        try{
        BufferedReader lector=new BufferedReader(new FileReader("C:\\Users\\sigma\\Downloads\\junio.dat"));
        lector.readLine();
        while((linea=lector.readLine())!=null){
            contenido+=linea+"\r";
            contador++;
        }
        
        lector.close();
        
        String[] ArregloParrafo=contenido.split("\r");
        
       // Arreglo<Empleado> empleados=new Arreglo<>(contador);
        empleados=new Arreglo<>(contador);
        for(int i=0; i<ArregloParrafo.length;i++){
            String [] ArregloRenglon=ArregloParrafo[i].split(",");
            Empleado datos=new Empleado();
            datos.setId(parseInt(ArregloRenglon[0]));
            datos.setNombre(ArregloRenglon[1]);
            datos.setPaterno(ArregloRenglon[2]);
            datos.setMaterno(ArregloRenglon[3]);
            datos.setHorasExtra(parseInt(ArregloRenglon[4]));
            datos.setSueldoBase(parseDouble(ArregloRenglon[5]));
            datos.setAnioIngreso(parseInt(ArregloRenglon[6]));
            empleados.setElemento(i,datos);    
            }
        
          //  System.out.println(empleados.getElemento(0));           System.out.println(ArregloParrafo.length);           
          /*  for (i=0; i<ArregloParrafo.length;i++) {
                System.out.println((i+1)+" "+empleados.getElemento(i));   
                 }*/
          }  
        catch(IOException e){
        e.printStackTrace();
        }
       // System.out.println(empleados.getElemento(1));
        
}
    
     public void calcularSueldos() {
         System.out.println("************************************************CALCULO DE SUELDOS************************************************\n");
        for(int i = 0; i <empleados.getTamanio(); i++){
            System.out.println((i+1)+" "+empleados.getElemento(i));
            System.out.println(" Sueldo total de "+empleados.getElemento(i).getNombre()+" "+empleados.getElemento(i).getPaterno()+" "+empleados.getElemento(i).getMaterno()+ ": $" + empleados.getElemento(i).calcularSueldo()+"\n");
        }
    }
     
     
         public void obtener_Max_Min() {
             int min=2999999;
             int max=0;
             Empleado trabMax=new Empleado();
             Empleado trabMin=new Empleado();
 
        for(i=0; i<empleados.getTamanio(); i++) {
            if(empleados.getElemento(i).getAnioIngreso()>max){
                max=empleados.getElemento(i).getAnioIngreso(); 
                trabMax=empleados.getElemento(i);
            }
            
            if(empleados.getElemento(i).getAnioIngreso()<min){
                min=empleados.getElemento(i).getAnioIngreso(); 
                trabMin=empleados.getElemento(i);
            }
            
        }

        System.out.println("\n************************************************TRABAJADORES CON MAYOR Y MENOR ANTIGUEDAD************************************************" );
        System.out.println("\nTRABAJADOR CON MAYOR ANTIGUEDAD: "+trabMin.getNombre()+" "+trabMin.getPaterno()+" "+trabMin.getMaterno()+ ", Antiguedad: "+(2022-trabMin.getAnioIngreso())+" Años");
        System.out.println(trabMin);
        System.out.println("\nTRABAJADOR CON MENOR ANTIGUEDAD: "+trabMax.getNombre()+" "+trabMax.getPaterno()+" "+trabMax.getMaterno()+ ", Antiguedad: "+(2022-trabMax.getAnioIngreso())+" Años");
        System.out.println(trabMax);
    }
     
     

}
 
