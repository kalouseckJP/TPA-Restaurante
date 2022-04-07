public class Reservas{
    int horaInicio;
    int horaFin;
    int cantidad;
    String planComida;
    String planDegustacion;
public void guardarDatos(){

}
}
class Normal extends Reservas{
    int dinero;
    String area;

}
class Evento extends Reservas{
    String servicioExtra;
    String Especial;
}