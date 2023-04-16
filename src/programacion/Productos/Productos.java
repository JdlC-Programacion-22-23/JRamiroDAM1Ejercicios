package programacion.Productos;
import java.util.Scanner;
public abstract class Productos {
    String nombre;
    int fechaCaducidad;
    int numeroLote;
    public Productos(String nombre, int fechaCaducidad2, int numeroLote) {
    }
    @Override
    public String toString() {
        return "nombre: " + nombre + " " + "fechaCaducidad es " + fechaCaducidad + " " + "Su numero de lote es "
                + numeroLote;
    }
    public void setDatos(String Nombre, int fechaCaducidad, int numeroLote) {
        this.nombre = Nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
}
