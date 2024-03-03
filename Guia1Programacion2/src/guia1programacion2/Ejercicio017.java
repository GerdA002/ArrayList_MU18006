package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio017 {

ArrayList<String> Nombres;

    public Ejercicio017() {
        Nombres=new ArrayList<>();
    }
public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);
 }
    
    public void Mostrar(){
   System.out.println(Nombres);
    }
    
    public void vaciar(){
        Nombres.clear();
        System.out.println("Lista despues de ser vaciada: "+Nombres);
    }

    
}
