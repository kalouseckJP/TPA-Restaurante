import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Areas salaVaras = new Areas(30,30,"Sala Varas");
        Areas salaMontt = new Areas(30,30,"Sala Montt");
        Areas terraza = new Areas(40,40,"Terraza");
        Areas central = new Areas(200,200,"Central");

        Trabajador anfitrion = new Trabajador("",0, true, "Anfitrion");
        Trabajador metre = new Trabajador("", 1, true, "Metre");
        Trabajador runner = new Trabajador("", 2, true, "Runner");
        Trabajador copero = new Trabajador("", 4, true, "Copero");
        Trabajador auxiliar = new Trabajador("", 5, true, "Auxiliar");
        Trabajador bar = new Trabajador("", 6, true, "Bar");
        Trabajador cocinero = new Trabajador("", 3, true, "Cocinero");
        Trabajador chef = new Trabajador("", 7, true, "Chef");

    }
    Scanner sc = new Scanner(System.in);
    
    public void nuevoCliente(){
        String nombre = sc.nextLine();
        int rut = sc.nextInt();
        Boolean visitHotel = sc.nextBoolean();
        Boolean reserva = sc.nextBoolean();
        Cliente x = new Cliente(nombre, rut, visitHotel,reserva);
        if(reserva){
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
}