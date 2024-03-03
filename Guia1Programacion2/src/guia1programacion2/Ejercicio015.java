package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio015 {

ArrayList<String> Nombres;
ArrayList<String> Nombres1;

    public Ejercicio015() {
        Nombres=new ArrayList<>();
        Nombres1=new ArrayList<>();
    }

 public void GuardadNombre(){
        Nombres.add("Pikachu");
        Nombres.add("Chrizard");
        Nombres.add("Bulbasur");
        Nombres1.add("Squirtle");
        Nombres1.add("Jigglypuff");
 }
    
    public void Mostrar(){
   System.out.println("Primer conjunto de pokemos"+Nombres);
        System.out.println("Segundo conjunto de pokemos: "+Nombres1);
    }   
    
    public void UnirdosArrayLists(){
        Nombres.addAll(Nombres1);
        System.out.println("Lista despues de unin los dos conjuntos:\n"+Nombres);
    }
}
