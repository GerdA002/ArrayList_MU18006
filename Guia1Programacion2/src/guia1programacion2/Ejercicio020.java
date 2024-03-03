package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio020 {

ArrayList<String>Nombres;

    public Ejercicio020() {
        Nombres=new ArrayList<>(); 
    }

  public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);
 }
    
    public void Mostrar(){
   System.out.println(Nombres);
    }
    
    public void aumentar(int CapacidadDeseada){
    
        while (Nombres.size() < 5) {
           Nombres.add(null);
        }
        System.out.println("Listades despues de aumentar: "+Nombres);
    
    }
}
