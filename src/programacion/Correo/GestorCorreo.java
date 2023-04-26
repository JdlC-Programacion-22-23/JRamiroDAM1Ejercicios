package programacion.Correo;
import java.sql.Time;
import java.time.LocalDate;

public class GestorCorreo {
    private String origen;
    private String destino;
    private String asunto;
    private String cuerpoMensaje;
    private LocalDate fecha=LocalDate.of(2023,04,30);
    private Time horaLlegada=Time.valueOf("17:45:00");

    public GestorCorreo(String origen, String destino, String asunto, String cuerpoMensaje, LocalDate fecha, Time horaLlegada){
        this.origen = origen;
        this.destino = destino;
        this.asunto = asunto;
        this.cuerpoMensaje = cuerpoMensaje;
        this.fecha = fecha;
        this.horaLlegada = horaLlegada;
    }

    public String toString(){
        return fecha+""+ horaLlegada +" de "+origen+ " para "+destino+"\nAsunto "+asunto+"\n"+cuerpoMensaje;
    }
}
