package programacion.productos;

import java.io.FileWriter;
import java.io.IOException;

public abstract class Producto {
    String nombre;
    String fechaCaducidad;
    String numeroLote;
    int minLote=400;
    int maxLote=900;
    
    public Producto(String nombre, int fechaCaducidad, int numeroLote) {
      this.nombre = nombre;
      this.fechaCaducidad = fechaCaducidad;
      this.numeroLote = numeroLote;
    }

    public Producto() {}

    @Override
    public String toString() {
        return "nombre: " + nombre + " " + "fechaCaducidad es " + fechaCaducidad + " " + "Su numero de lote es "
                + numeroLote;
    }
    public void setDatos(String Nombre, String fechaCaducidad, String numeroLote) {
        this.nombre = Nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
    public abstract boolean escribirCabecera(FileWriter escritor) throws IOException;
    public abstract boolean escribirProducto(FileWriter escritor) throws IOException;
}
