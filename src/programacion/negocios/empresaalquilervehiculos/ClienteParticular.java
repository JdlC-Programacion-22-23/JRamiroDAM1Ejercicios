package programacion.negocios.empresaalquilervehiculos;
public class ClienteParticular {
  
  private static String nif;
  private static String nombre;
  private static String telefono;
  private static String correoElectronico;

  public ClienteParticular(String nombre, String nif, String telefono, String correoElectronico ) {
  
  }

  @Override
  public String toString(){
    String cadena = "";
    cadena += ClienteParticular.nif + " " + nombre + " (" + telefono + ", " + correoElectronico + ")";
    return cadena;
  }

}
