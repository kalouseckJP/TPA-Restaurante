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

    // Constructor reserva EVENTO
    public reserva(){

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

    // Area
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    // Guardar datos de reserva NORMAL
    public void guardarReservaNormal() throws IOException{
        File archivoReservas = new File("ReservasNormales.txt");
        FileWriter escribirReserva = new FileWriter("ReservasNormales.txt", true);
        escribirReserva.append("NOMBRE: "+ getNombre()+" - RUT: "+getRut()+" - HORA INICIO: "+getHoraInicio()+" - HORA FIN: "+getHoraFin()+
        " - TOTAL PERSONAS: "+getInvitados()+" - MESAS USADAS: "+getMesas()+ " - TIPO RESERVA: "+getTipoReserva()+" - AREA: "+getArea());
        escribirReserva.close();
    }

    // Guardar datos de reserva EVENTO
    public void guardarReservaEvento(){

    }





}
