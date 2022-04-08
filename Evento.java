public class Evento extends Reservas{
    String servicioExtra;
    String especial;

    Evento(int fecha, int horaInicio, int horaFin, int cantidad, int dinero, String planComida, String planDegustacion, String tipoReserva, String area, String servicioExtra, String especial){
        super(fecha, horaInicio, horaFin, cantidad, dinero, planComida, planDegustacion, tipoReserva, area);
        this.servicioExtra = servicioExtra;
        this.especial = especial;
    }
}