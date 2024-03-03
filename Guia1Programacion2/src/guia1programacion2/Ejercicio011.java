package guia1programacion2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio011 {


ArrayList<String> Nombres;

    public Ejercicio011() {
        Nombres=new ArrayList<>();
    }

public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);
 }
    
    public void Mostrar(){
   System.out.println(Nombres);
    }
    
    public void Invertir(){
        Collections.reverse(Nombres);
        System.out.println("Lista despues de invertir los elementos:\n"+Nombres);
    }
}
