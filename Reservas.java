public class Reservas{
    int fecha;
    int horaInicio;
    int horaFin;
    int cantidad;
    int dinero;
    String planComida;
    String planDegustacion;
    String tipoReserva;
    String area;

    Reservas(int fecha, int horaInicio, int horaFin, int cantidad,int dinero, String planComida, String planDegustacion, String tipoReserva, String area){
        this.fecha = fecha;
        this.horaFin = horaFin;
        this.cantidad = cantidad;
        this.planComida = planComida;
        this.planDegustacion = planDegustacion;
    }

    public void guardarDatos(){

    }
}