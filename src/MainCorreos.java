import java.util.Scanner;

import programacion.Correo.Correo;
// Es importante que los imports se ordenen alfabéticamente. Si añades los import a mano es
// más difícil y puedes incluir varias veces el mismo, como te ha pasado con ArrayList.
// Si pones el cursor en una línea de import y haces click en la bombilla, 
// te ofrece "Organice imports". Úsalo! ;)
// import java.util.ArrayList;
// Aquí he limpiado todos los imports menos el del Scanner. Revisa la ocpión 
// "Organice imports" en el fichero GestorCorreo.java
import programacion.Correo.GestorCorreo;

// Los nombres de las clases son UpperCamelCase
public class MainCorreos {
  // Se permite crear un scanner static en la clase Main
  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    GestorCorreo gestorEmail = new GestorCorreo();

    // La lista de correos la gestiona la clase GestorCorreo
    // ArrayList<GestorCorreo> listaCorreos = new ArrayList<>();

    Correo referenciaCorreo = new Correo(
        "javierramiro@DAM1V.es",
        "FernandoCampos@DAM1V.es",
        "Tutoria Personalizada en el bar",
        "Buenos dias, me gustaria tomarme unas cañas contigo fer",
        "2023-04-26T07:45:00");
    gestorEmail.addCorreo(referenciaCorreo);

    referenciaCorreo = new Correo(
        "javierramiro@DAM1V.es",
        "Alfonso@DAM1V.es",
        "Bases Examen",
        "Buenos dias, tremendo examen nos has puesto",
        "2023-04-26T07:45:00");
    gestorEmail.addCorreo(referenciaCorreo);

    referenciaCorreo = new Correo(
        "javierramiro@DAM1V.es",
        "mAngeles@DAM1V.es",
        "Clases Refuerzo",
        "Buenos dias, vamonos ha hacer una clase de refuerzo, te espero en el bar :D",
        "2023-04-26T07:45:00");
    gestorEmail.addCorreo(referenciaCorreo);

    referenciaCorreo = new Correo(
        "javierramiro@DAM1V.es",
        "javierramiro@DAM1V.es",
        "Prueba",
        "Esto es una prueba de correo",
        "2023-04-26T07:45:00");
    gestorEmail.addCorreo(referenciaCorreo);

    int opcion = 0;
    do {
      imprimirMenu();
      opcion = in.nextInt();
      in.nextLine();// Limpiamos el buffer
      switch(opcion){
        //TODO
      }
      // Si la opción de salir es 7, la condición del do/while debería ser que opcion
      // != 7
    } while (opcion != 7);
  }

  public static void imprimirMenu() {
    System.out.println("#### Menú Gestor de Correos ####");
    System.out.println("Elige una de las opciones");
    System.out.println("1) Bandeja de Entrada");
    System.out.println("2) Añadir correo");
    System.out.println("3) Eliminar Correo");
    System.out.println("4) Mostrar un correo");
    System.out.println("5) Mostrar todos los correos");
    System.out.println("6) Mostrar correos a partir de su origen");
    System.out.println("7) salir");
    System.out.print("> Introduce tu opción: ");

  }

}