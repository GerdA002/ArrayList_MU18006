package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio018 {

ArrayList<String>Nombres;

    public Ejercicio018() {
        Nombres=new ArrayList<>();
    }
    public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);
 }
    
    public void Mostrar(){
   System.out.println(Nombres);
    }
    
    public void VerificarSiestaVacio(){
        if (Nombres.isEmpty()) {
            System.out.println("El Arraylist esta vacio");
        }else{
            System.out.println("El Arraylis no esta vacio y cuenta con los siguientes valores");
            System.out.println(Nombres);
        }
    }


    
}
