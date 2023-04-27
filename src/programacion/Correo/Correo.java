package programacion.Correo;

import java.time.LocalDateTime;

// Los nombres de las clases son UpperCamelCase
public class Correo {
  String origen;
  String destino;
  String asunto;
  String cuerpoMensaje;
  LocalDateTime fechaYHoraRecepcion;

  /*
   * public Correo(String origen, String destino, String asunto, String
   * cuerpoMensaje, LocalDateTime fechaYHoraRecepcion) {
   * this.origen = origen;
   * this.destino = destino;
   * this.asunto = asunto;
   * this.cuerpoMensaje = cuerpoMensaje;
   * this.fechaYHoraRecepcion = fechaYHoraRecepcion;
   * }
   * 
   * Quería crear un constructor que recibiese la fechaYHoraRecepcion en formato
   * String y en formato LocalDateTime.
   * Así, el que recibe el String, lo convierte a LocalDateTime con el método
   * parse, y después llama al constructor
   * que lo recibe en ese format.
   * 
   * Pero el constructor que hay aquí abajo no compila porque, si se llama a otro
   * constructor con this, debe ser
   * lo primero que se haga. Java no me deja convertir fechaYHoraRecepcion de
   * String a LocalDateTime antes de llamar
   * al otro constructor con this(...).
   * 
   * Así que voy a crear un constructor privado que inicialice todos los atributos
   * menos fechaYHoraRecepcion, y lo
   * voy a utilizar como constructor auxiliar.
   * public Correo(String origen, String destino, String asunto, String
   * cuerpoMensaje, String fechaYHoraRecepcion) {
   * LocalDateTime fechaYHoraRecepcionDateTime =
   * LocalDateTime.parse(fechaYHoraRecepcion);
   * this(origen, destino, asunto, cuerpoMensaje, fechaYHoraRecepcionDateTime);
   * }
   */

  // Constructor privado (sólo lo puedo llamar desde dentro de la clase, desde otro 
  // constructor) que inicializa todos los atributos menos fechaYHoraRecepcion:
  private Correo(String origen, String destino, String asunto, String cuerpoMensaje) {
    this.origen = origen;
    this.destino = destino;
    this.asunto = asunto;
    this.cuerpoMensaje = cuerpoMensaje;
  }

  // Constructor que recibe fechaYHoraRecepcion de tipo LocalDateTime
  public Correo(String origen, String destino, String asunto, String cuerpoMensaje,
      LocalDateTime fechaYHoraRecepcion) {
    this(origen, destino, asunto, cuerpoMensaje);
    this.fechaYHoraRecepcion = fechaYHoraRecepcion;
  }

  // Constructor que recibe fechaYHoraRecepcion de tipo String
  public Correo(String origen, String destino, String asunto, String cuerpoMensaje,
      String fechaYHoraRecepcion) {
    this(origen, destino, asunto, cuerpoMensaje);
    this.fechaYHoraRecepcion = LocalDateTime.parse(fechaYHoraRecepcion);
  }


}
