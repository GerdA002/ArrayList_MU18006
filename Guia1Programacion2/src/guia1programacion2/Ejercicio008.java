package guia1programacion2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio008 {

ArrayList<String> Nombres;

    public Ejercicio008() {
        Nombres=new ArrayList<>();
    }

 public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);
 }
    
    public void Mostrar(){
   System.out.println(Nombres);
    }
    
    public void OrdenarAlfabeticamnete(){
        Collections.sort(Nombres);
        System.out.println("Lista Actualizada depues de ordenarla alfabeticamente:\n"+Nombres);
    }
    
}
