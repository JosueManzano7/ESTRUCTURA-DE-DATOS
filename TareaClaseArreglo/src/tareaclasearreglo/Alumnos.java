
package tareaclasearreglo;


public class Alumnos {
    private String nombre;
    private int edad;
    private int numerocuenta;

    public Alumnos() {
    }

    public Alumnos(String nombre, int edad, int numerocuenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.numerocuenta = numerocuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    @Override
    public String toString() {
        return "{"+"nombre=" + nombre + ", edad=" + edad + ", numerocuenta=" + numerocuenta + '}';
    }
    
    
    
}
