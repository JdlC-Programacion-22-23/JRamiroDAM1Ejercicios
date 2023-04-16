package programacion.Productos;

public class productosFrescos extends Productos{
    String paisOrigen;
    int FechaEnvasado;

    public productosFrescos(String nombre, int fechaCaducidad, int numeroLote){
        super(nombre, fechaCaducidad, numeroLote);
        this.paisOrigen = paisOrigen;
        this.FechaEnvasado = FechaEnvasado;
    }

    public void DatosExtendidos(int fechaEnvasado, String paisOrigen) {
        this.FechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    public boolean EntradasCorrectas(){
        int minLote=400;
        int maxLote=900;
        if (nombre.isEmpty()) return false;
        else if (fechaCaducidad!=0)return false;
        else if (numeroLote<minLote && numeroLote>maxLote) return false;
        else if(FechaEnvasado>fechaCaducidad)return false;
        else return true;
    }

    @Override
    public String toString() {
        return super.toString()+"fecha de envasado: "+ FechaEnvasado+ " "+"Pais Origen: "
        +paisOrigen;
    }
}
