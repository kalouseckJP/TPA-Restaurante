public class Mesas{
  Boolean ocupadas;
  int numeroMesa;

  public Mesas(Boolean ocupadas, int numeroMesa){
    this.ocupadas = ocupadas;
    this.numeroMesa = numeroMesa;
  }

  public boolean getOcupadas(){
    return this.ocupadas;
  }

  public int getNumeroMesa(){
    return this.numeroMesa;
  }

  public void setNumeroMesa(int numeroMesa){
    this.numeroMesa = numeroMesa;
  }
}