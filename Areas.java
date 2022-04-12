public class Areas{
  int cantidad;
  String nombreArea;
  int disponible;

  public Areas(int cantidad, String nombreArea, int disponible){
    this.cantidad = cantidad;
    this.nombreArea= nombreArea;
    this.disponible= disponible;
  }
  public int getCantidad(){
    return this.cantidad;
  }
  public String getNombreArea(){
    return this.nombreArea;
  }
}