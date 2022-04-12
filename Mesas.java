import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Mesas{
  Boolean ocupadas;
  int numeroMesa;
  int espacioMesa;

  public Mesas(int numeroMesa, int espacioMesa,Boolean ocupadas){
    this.numeroMesa = numeroMesa;
    this.espacioMesa = espacioMesa;
    this.ocupadas = ocupadas;
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
  public static void crearMesas() throws IOException{
    int i;
    File archivoMesas = new File("ArchivoMesas.txt");
    if(!archivoMesas.exists()){try (FileWriter escribirMesas = new FileWriter("ArchivoMesas.txt")) {
      for(i=1;i<=95;i++){
          if(i<=50){escribirMesas.write(i + ";" + "3" + ";" + "false\n");
            Mesas x = new Mesas(i, 3, false);
            add(i, x);}
          if(i>50 && i<=70){escribirMesas.write(i + ";" + "5" + ";" + "false\n");
            Mesas x = new Mesas(i, 5, false);
            add(i, x);}
          if(i>70){escribirMesas.write(i + ";" + "2" + ";" + "false\n");
            Mesas x = new Mesas(i, 2, false);
            add(i, x);}
        }
      }
    }
  }
  public static void add(int index, Mesas x){
    ArrayList<Mesas> str=new ArrayList<Mesas>();
    str.add(x);
  }
    
}