public class Cliente extends Persona{
    Boolean visitHotel;

    Boolean reserva;

    Cliente(String nombre,String apellido, int rut, int edad, Boolean visitHotel, Boolean reserva){
        super(nombre, apellido, rut, edad);
        this.visitHotel=visitHotel;
        this.reserva=reserva;
    }
}
