public class Cliente extends Persona{
    Boolean visitHotel;

    Boolean reserva;

    Cliente(String nombre, int rut, Boolean visitHotel, Boolean reserva){
        super(nombre, rut);
        this.visitHotel=visitHotel;
        this.reserva=reserva;
    }
}
