import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import programacion.Correo.*;
import java.util.ArrayList;

public class mainCorreos {
  public static void main(String[] args) {
    ArrayList<GestorCorreo> listaDatos = new ArrayList<>();
    GestorCorreo nuevoCorreo = new GestorCorreo("javierramiro@DAM1V.es", "FernandoCampos@DAM1V.es",
        "Tutoria Personalizada en el bar", "Buenos dias, me gustaria tomarme unas cañas contigo fer",
        LocalDate.of(2023, 4, 26), Time.valueOf("07:45:00"));
    listaDatos.add(nuevoCorreo);
    GestorCorreo nuevoCorreoBases = new GestorCorreo("javierramiro@DAM1V.es", "Alfonso@DAM1V.es",
        "Bases Examen", "Buenos dias, tremendo examen nos has puesto",
        LocalDate.of(2023, 4, 26), Time.valueOf("07:45:00"));
    listaDatos.add(nuevoCorreoBases);
    GestorCorreo nuevoCorreoPrograma = new GestorCorreo("javierramiro@DAM1V.es", "mAngeles@DAM1V.es",
        "Clases Refuerzo", "Buenos dias, vamonos ha hacer una clase de refuerzo, te espero en el bar :D",
        LocalDate.of(2023, 4, 26), Time.valueOf("07:45:00"));
    listaDatos.add(nuevoCorreoPrograma);
    GestorCorreo nuevoCorreoPrueba = new GestorCorreo("javierramiro@DAM1V.es", "javierramiro@DAM1V.es",
        "Prueba", "Prueba",
        LocalDate.of(2023, 4, 26), Time.valueOf("07:45:00"));
    listaDatos.add(nuevoCorreoPrueba);
    
  }
}