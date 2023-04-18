package programacion.productos;

import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class ProductoFresco extends Producto {
  String paisOrigen;
  String fechaEnvasado;

  public ProductoFresco(String nombre, int fechaCaducidad, int numeroLote) {
    super(nombre, fechaCaducidad, numeroLote);
  }

  public ProductoFresco(){
    super();
  }

  public void DatosExtendidos(String fechaEnvasado, String paisOrigen) {
    this.fechaEnvasado = fechaEnvasado;
    this.paisOrigen = paisOrigen;
  }

  /*public boolean comprobarEntradasCorrectas() {
    if (nombre.isEmpty()) {
      return false;
    }

    if (fechaCaducidad != 0) {
      return false;
    }

    if (fechaEnvasado != 0) {
      return false;
    }
    if (numeroLote < minLote && numeroLote > maxLote) {
      return false;
    }
    if (fechaEnvasado > fechaCaducidad) {
      return false;
    }

    return true;
  }
  */

  @Override
  public String toString() {
    return super.toString() + "fecha de envasado: " + fechaEnvasado + " " + "Pais Origen: "
        + paisOrigen;
  }

  public boolean escribirCabecera(FileWriter escritor) throws IOException{
      escritor.write("nombre,fechaCaducidad,numeroLote,fechaEnvasado,paisOrigen\n");
    return true;
  }
  public boolean escribirProducto(FileWriter escritor) throws IOException{
    escritor.write(nombre + "," + fechaCaducidad + "," + numeroLote + "," + fechaEnvasado + "," + paisOrigen + "\n" );
  return true;
}

}
