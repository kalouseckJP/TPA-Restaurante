public class Trabajador extends Persona {
    Boolean enTurno;
    String trabajo;

    Trabajador(String nombre,int rut, Boolean enTurno, String trabajo){
        super(nombre,rut);
        this.enTurno=enTurno;
        this.trabajo=trabajo;
    }
}

/*}
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
*/