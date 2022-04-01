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
class Anfitrion extends Persona{
    int mesasUtilizadas;

}
class Metre extends Persona{
    
}
class Runner extends Persona{
    String platos;
    String bebestibles;
public void tomarComanda(){

}
public void entregarComanda(){
    
}
}
class Coperos extends Persona{
    
}
class Auxiliares extends Persona{
    
}
class Bar extends Persona{
    
}
class Cocineros extends Persona{
    
}
class Chef extends Persona{
    String menuEspecial;
    int costoMenuEspecial;
}
