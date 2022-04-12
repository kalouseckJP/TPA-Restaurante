import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
            new Mesas(i, 3, false);}
          if(i>50 && i<=70){escribirMesas.write(i + ";" + "5" + ";" + "false\n");
            new Mesas(i, 5, false);}
          if(i>70){escribirMesas.write(i + ";" + "2" + ";" + "false\n");
            new Mesas(i, 2, false);}
        }
      }
    }
  }
}