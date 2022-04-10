import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class reserva extends cliente {
    private float horaInicio;
    private float horaFin;
    private int invitados;
    private int mesas;
    private String tipoReserva;
    private String planComida;
    private String planDegustacion;
    private String area;
    private String area2;
    private String modalidad;

    // Constructor reserva NORMAL
    public reserva(String nombre, int rut, float horaInicio, float horaFin, int invitados, int mesas, String tipoReserva, String area){
        this.nombre = nombre;
        this.rut = rut;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.invitados = invitados;
        this.mesas = mesas;
        this.tipoReserva = tipoReserva;
        this.area = area;
    }

    // Constructor reserva EVENTO ABIERTO y CERRADO
    public reserva(String nombre, int rut, float horaInicio, float horaFin, String tipoReserva, String modalidad, int invitados, String area){
        this.nombre = nombre;
        this.rut = rut;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tipoReserva = tipoReserva;
        this.modalidad = modalidad;
        this.invitados = invitados;
        this.area = area;
    }

    // Constructor reserva EVENTO SEMICERRADO
    public reserva(String nombre, int rut, float horaInicio, float horaFin, String tipoReserva, String modalidad, int invitados, String area, String area2){
        this.nombre = nombre;
        this.rut = rut;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tipoReserva = tipoReserva;
        this.modalidad = modalidad;
        this.invitados = invitados;
        this.area = area;
    }


    // GETTERS Y SETTERS

    // Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Rut
    public int getRut() {
        return rut;
    }
    public void setNombre(int rut) {
        this.rut = rut;
    }

    // Hora inicio
    public float getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(float horaInicio) {
        this.horaInicio = horaInicio;
    }

    // Hora fin
    public float getHoraFin() {
        return horaFin;
    }
    public void setHoraFin(float horaFin) {
        this.horaFin = horaFin;
    }

    // Invitados
    public int getInvitados() {
        return invitados;
    }
    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }

    // Mesas
    public int getMesas() {
        return mesas;
    }
    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    // Reserva
    public String getTipoReserva() {
        return tipoReserva;
    }
    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    // Plan de comida
    public String getPlanComida() {
        return planComida;
    }
    public void setPlanComida(String planComida) {
        this.planComida = planComida;
    }

    // Plan de degustacion
    public String getPlanDegustacion() {
        return planDegustacion;
    }
    public void setPlanDegustacion(String planDegustacion) {
        this.planDegustacion = planDegustacion;
    }
    // Modalidad
    public String getModalidad() {
        return modalidad;
    }
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    // Area
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    // Area
    public String getArea2() {
        return area2;
    }
    public void setArea2(String area2) {
        this.area2 = area2;
    }

    // Guardar datos de reserva NORMAL
    public void guardarReservaNormal() throws IOException{
        File archivoReservasNormales = new File("ReservasNormales.txt");
        FileWriter escribirReserva = new FileWriter("ReservasNormales.txt", true);
        escribirReserva.append("\nNOMBRE: "+ getNombre()+" - RUT: "+getRut()+" - HORA INICIO: "+getHoraInicio()+" - HORA FIN: "+getHoraFin()+
        " - TOTAL PERSONAS: "+getInvitados()+" - MESAS USADAS: "+getMesas()+ " - TIPO RESERVA: "+getTipoReserva()+" - AREA: "+getArea());
        escribirReserva.close();
    }

    // Guardar datos de reserva EVENTO ABIERTO
    public void guardarReservaEventoAbiertoyCerrado() throws IOException{
        File archivoReservasEvento = new File("ReservasEvento.txt");
        FileWriter escribirReserva = new FileWriter("ReservasEvento.txt", true);
        escribirReserva.append("\nNOMBRE: "+ getNombre()+" - RUT: "+getRut()+" - HORA INICIO: "+getHoraInicio()+" - HORA FIN: "+getHoraFin()+
        " - TOTAL PERSONAS: "+getInvitados()+" - TIPO RESERVA: "+getTipoReserva()+" - MODALIDAD: "+getModalidad()+" - AREA: "+getArea());
        escribirReserva.close();

    }

    // Guardar datos de reserva EVENTO SEMICERRADO
    public void guardarReservaEventoSemicerrado() throws IOException{
        File archivoReservasEvento = new File("ReservasEvento.txt");
        FileWriter escribirReserva = new FileWriter("ReservasEvento.txt", true);
        escribirReserva.append("\nNOMBRE: "+ getNombre()+" - RUT: "+getRut()+" - HORA INICIO: "+getHoraInicio()+" - HORA FIN: "+getHoraFin()+
        " - TOTAL PERSONAS: "+getInvitados()+" - TIPO RESERVA: "+getTipoReserva()+" - MODALIDAD: "+getModalidad()+" - AREA 1: "+getArea()+" - AREA 2: "+getArea2());
        escribirReserva.close();
    }
}
