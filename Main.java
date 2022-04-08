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
}