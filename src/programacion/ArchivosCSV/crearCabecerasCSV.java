package programacion.ArchivosCSV;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class crearCabecerasCSV{
    public static void crearCabeceras(){
        try {
            FileWriter escritura = new FileWriter("prueba.csv", false);
            BufferedWriter buffer = new BufferedWriter(escritura);
            buffer.write("nombre,apellidos,numeroTelefono");
            buffer.newLine();
            buffer.close();
            escritura.close();
        } catch (IOException e) {
        e.printStackTrace();
    }  
}
}
