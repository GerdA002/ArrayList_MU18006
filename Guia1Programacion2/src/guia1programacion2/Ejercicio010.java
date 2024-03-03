package guia1programacion2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio010 {

    ArrayList<String> Nombres;

    public Ejercicio010() {
        Nombres=new ArrayList<>();
    }
    
    public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);
 }
    
    public void Mostrar(){
   System.out.println(Nombres);
    }
    
    public void Mezaclar(){
         Collections.sort(Nombres);
         System.out.println("Lista desordenada:\n"+Nombres);
    }
    
}
