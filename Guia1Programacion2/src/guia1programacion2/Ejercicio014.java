package guia1programacion2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio014 {

ArrayList<String>Nombres;

    public Ejercicio014() {
        Nombres=new ArrayList<>();
    }

    public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);
 }
    
    public void Mostrar(){
   System.out.println(Nombres);
    }
    
    public void Invertir(int Indi1,int Indi2){
       Collections.swap(Nombres, Indi1, Indi2);
        System.out.println("Indice #1: "+Indi1);
        System.out.println("Indice #2: "+Indi2);
        System.out.println("Lista despues del Intercambio:\n"+Nombres);
     
           
   }

}
