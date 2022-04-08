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
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.cantidad = cantidad;
        this.planComida = planComida;
        this.dinero = dinero;
        this.planDegustacion = planDegustacion;
        this.tipoReserva = tipoReserva;
        this.area = area;
    }
}