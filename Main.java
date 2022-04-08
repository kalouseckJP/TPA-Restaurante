import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Areas salaVaras = new Areas(30,30,"Sala Varas");
        Areas salaMontt = new Areas(30,30,"Sala Montt");
        Areas terraza = new Areas(40,40,"Terraza");
        Areas central = new Areas(200,200,"Central");

        Trabajador anfitrion = new Trabajador("","",0,0, true, "Anfitrion");
        Trabajador metre = new Trabajador("","", 1,1, true, "Metre");
        Trabajador runner = new Trabajador("","", 2,2, true, "Runner");
        Trabajador copero = new Trabajador("","", 3,3, true, "Copero");
        Trabajador auxiliar = new Trabajador("","", 4,4, true, "Auxiliar");
        Trabajador bar = new Trabajador("","", 5,5, true, "Bar");
        Trabajador cocinero = new Trabajador("","", 6,6, true, "Cocinero");
        Trabajador chef = new Trabajador("","", 7,7, true, "Chef");
    }
    
    Scanner sc = new Scanner(System.in);
    

    public void nuevoCliente(){
        String nombre = sc.nextLine();
        String apellido = sc.nextLine();
        int rut = sc.nextInt();
        int edad = sc.nextInt();
        Boolean visitHotel = sc.nextBoolean();
        Boolean reserva = sc.nextBoolean();
        Cliente x = new Cliente(nombre, apellido, rut, edad, visitHotel,reserva);
        if(reserva){
            nuevaReserva();
        }
    }

    public void nuevaReserva(){
        int fecha = sc.nextInt();
        int horaInicio = sc.nextInt();
        int horaFin = sc.nextInt();
        int cantidad = sc.nextInt();
        int dinero = sc.nextInt();
        String planComida = sc.nextLine();
        String planDegustacion = sc.nextLine();
        String tipoReserva = sc.nextLine();
        String area = sc.nextLine();
        Reservas reservaNueva = new Reservas(fecha, horaInicio, horaFin, cantidad, dinero, planComida, planDegustacion, tipoReserva, area);
    }
}