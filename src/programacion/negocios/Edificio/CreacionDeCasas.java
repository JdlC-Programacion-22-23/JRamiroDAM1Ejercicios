package programacion.negocios.Edificio;
import java.util.ArrayList;
public class CreacionDeCasas {

    public static void CrearCasas() {
        int count=0;
        ArrayList<String>Casas=new ArrayList<String>();
        if(count==0){
        Casas.add("Calle del Topacio, Los Rosales, Bajo, 49m2 ");
        Casas.add("Calle San Sebastián, El Boalo, chalet, 160m2 ");
        Casas.add("Calle Antonio Machado, Griñón, chalet, 330m2");
        }
        System.out.println("Estas son las casas disponibles: ");
        for(int contador=0;contador<Casas.size();contador++){
            System.out.println(Casas.get(contador));
        }
        count++;
    }
}
