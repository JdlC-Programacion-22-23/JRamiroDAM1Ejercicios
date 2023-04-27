package programacion.Correo;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;

// Según el enunciado: "Diseña la clase Correo necesaria para gestionar la información de los correos
// teniendo en cuenta la información que se proporciona a continuación."
// Es decir, la información de cada correo, como el origen, destino, asunto, cuerpo, fecha y hora de llegada,
// se debe guardar en la clase Correo.
public class GestorCorreo {
  /*
   * String origen;
   * String destino;
   * String asunto;
   * String cuerpoMensaje;
   * // Por qué usas Time del package java.sql? No estamos haciendo nada con SQL.
   * El package java.time tiene
   * // el tipo LocalDateTime, que te permite guardar la fecha y la hora juntas.
   * // Por qué le das estos valores por defecto? Los va a sobreescribir el
   * constructor...
   * LocalDate fecha; //=LocalDate.of(2023,04,30);
   * // Por qué le das estos valores por defecto? Los va a sobreescribir el
   * constructor...
   * Time horaLlegada; //=Time.valueOf("17:45:00");
   * 
   * public GestorCorreo(String origen, String destino, String asunto, String
   * cuerpoMensaje, LocalDate fecha, Time horaLlegada){
   * this.origen = origen;
   * this.destino = destino;
   * this.asunto = asunto;
   * this.cuerpoMensaje = cuerpoMensaje;
   * this.fecha = fecha;
   * this.horaLlegada = horaLlegada;
   * }
   * 
   * public String toString(){
   * return fecha+""+ horaLlegada +" de "+origen+
   * " para "+destino+"\nAsunto "+asunto+"\n"+cuerpoMensaje;
   * }
   */

  // La clase GestorCorreo tiene que gestionar una lista de correos, así que le
  // declaramos un
  // ArrayList de Correo:
  ArrayList<Correo> listaCorreos;

  public GestorCorreo() {
    listaCorreos = new ArrayList<>();
  }

  // Además, el enunciado pide que pueda ejecutar las siguientes acciones:

  // 1. Bandeja de entrada: Muestra un resumen de todos los correos de
  // la lista, incluyendo el origen, el asunto y la fecha y hora de llegada.
  public String bandejaDeEntrada() {
    // TODO:
    return "";
  }

  // 2. Añadir correo: Añade un nuevo correo electrónico al final de la
  // lista.
  public boolean addCorreo(Correo correo) {
    // TODO:
    return true;
  }

  // 3. Eliminar correo: Elimina un correo de una posición dada de la
  // lista.
  public boolean deleteCorreo(int posicionCorreo) {
    // TODO:
    return true;
  }

  // 4. Mostrar correo: Muestra el cuerpo de un mensaje concreto dada
  // su posición en la lista.
  public String mostrarCorreo(int posicionCorreo) {
    // TODO:
    return "";
  }

  // 5. Mostrar todos los correos: Muestra el contenido de todos los
  // mensajes de la lista por orden de llegada.
  public String mostrarTodosLosCorreos() {
    // TODO:
    return "";
  }

  // 6. Mostrar correos a partir de su origen: Muestra los correos de un
  // origen determinado.
  public String mostrarTodosLosCorreosOrigen(String origen) {
    // TODO:
    return "";
  }

}
