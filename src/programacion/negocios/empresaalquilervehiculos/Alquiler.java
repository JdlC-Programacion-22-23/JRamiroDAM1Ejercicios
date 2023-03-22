package programacion.negocios.empresaalquilervehiculos;
import java.util.Date;

public class Alquiler extends AbstractAlquiler {

  public Alquiler(AbstractCliente cliente, AbstractVehiculoAlquiler vehiculo) {
    super(cliente, vehiculo);
    //TODO Auto-generated constructor stub
  }

  @Override
  public String toString() {
    return this.vehiculo.matricula + "/" + this.vehiculo.fabricante + "-"
        + this.vehiculo.modelo + " -> " + this.cliente.nif + "/" + this.cliente.nombre
        + " (" + (finAlquiler == null ? "EN CURSO" : "FINALIZADO") + ")";
  }

  @Override
  void comenzarAlquiler() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'comenzarAlquiler'");
  }

  @Override
  void terminarAlquiler() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'terminarAlquiler'");
  }

}
