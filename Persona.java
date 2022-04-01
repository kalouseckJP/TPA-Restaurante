public class Persona {
    String nombre;

}

class Cliente extends Persona{
    Boolean visitHotel;

    public void reservar(){

    }
}
class Trabajador extends Persona{
    Boolean enTurno;
    int Horarios;

}
class Anfitrion extends Trabajador{
    int mesasUtilizadas;

}
class Metre extends Trabajador{
    
}
class Runner extends Trabajador{
    String platos;
    String bebestibles;
public void tomarComanda(){

}
public void entregarComanda(){
    
}
}
class Coperos extends Trabajador{
    
}
class Auxiliares extends Trabajador{
    
}
class Bar extends Trabajador{
    
}
class Cocineros extends Trabajador{
    
}
class Chef extends Trabajador{
    String menuEspecial;
    int costoMenuEspecial;
}
