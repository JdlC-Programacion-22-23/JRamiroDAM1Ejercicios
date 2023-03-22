package programacion.negocios.empresaalquilervehiculos;

public class EmpresaAlquilerVehiculos extends AbstractEmpresaAlquilerVehiculos
    implements InterfazEmpresaAlquilerVehiculos {

  public EmpresaAlquilerVehiculos(String nombre, String nif) {
    super(nombre, nif);
  }

  @Override
  public String toString() {
    final int numberSpecialChars = 5;
    String cadena = "#".repeat(2 * numberSpecialChars) + " Empresa Alquiler de Vehículos '"
        + nombre + "' (" + nif + ") " + "#".repeat(2 * numberSpecialChars);

    cadena += "\n" + "=".repeat(numberSpecialChars) + "> Vehiculos (" + vehiculos.size() + "):";
    cadena += listadoVehiculos();

    cadena += "\n" + "=".repeat(numberSpecialChars) + "> Clientes (" + clientes.size() + "):";
    cadena += listadoClientes();

    cadena += "\n" + "=".repeat(numberSpecialChars) + "> Alquileres (" + alquileres.size() + "):";
    cadena += listadoAlquileres();

    return cadena;
  }

  @Override
  public String listadoAlquileres() {
    String cadena = "";
    int i = 1;
    for (AbstractAlquiler alquiler : alquileres) {
      cadena += "\n" + i + ") " + alquiler;
      i++;
    }
    return cadena;
  }

  @Override
  public String listadoClientes() {
    String cadena = "";
    int i = 1;
    for (AbstractCliente cliente : clientes) {
      cadena += "\n" + i + ") " + cliente;
    }
    return cadena;
  }

  @Override
  public String listadoVehiculos() {
    String cadena = "";
    int i = 1;
    for (AbstractVehiculoAlquiler vehiculoAlquiler : vehiculos) {
      cadena += "\n" + i + ") " + vehiculoAlquiler;
    }
    return cadena;
  }

  @Override
  public boolean alquilarVehiculo(AbstractCliente cliente, AbstractVehiculoAlquiler vehiculo) {
    return true;
}

  public void alquilarVehiculo(ClienteParticular alan, Turismo kiaCeed) {
  }

  @Override
  public boolean devolverVehiculo(AbstractVehiculoAlquiler vehiculo) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'devolverVehiculo'");
  }

  @Override
  public boolean registrarCliente(ClienteParticular fer) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'registrarCliente'");
  }

  @Override
  public boolean registrarVehiculo(AbstractVehiculoAlquiler vehiculo) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'registrarVehiculo'");
  }
}
