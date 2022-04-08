public class Cliente extends Persona{
    Boolean visitHotel;

    public void reservar(){
        //AQUI SE AÑADIRIA AL DOCUMENTO DE RESERVAS
    }

    Cliente(String nombre, int rut, Boolean visitHotel){
        super(nombre, rut);
        this.visitHotel=visitHotel;
    }
}
