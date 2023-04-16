package programacion.Productos;
public abstract class Productos {
    String nombre;
    int fechaCaducidad;
    int numeroLote;
    int minLote=400;
    int maxLote=900;
    public Productos(String nombre, int fechaCaducidad, int numeroLote) {
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
