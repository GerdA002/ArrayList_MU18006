package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio007 {

ArrayList<String> Nombres;

    public Ejercicio007() {
        Nombres=new ArrayList<>();
    }

     public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);

    }
    
    public void Mostrar(){
   
        System.out.println(Nombres);
    }
    
    public void NombreBuscar(String Nombre){
        
        int Posicion=Nombres.indexOf(Nombre);
        if (Posicion!=-1) {
            System.out.println("El pokemon: "+Nombre+" se encontro"+"\nSecuentra eb la posicion: "+Posicion);
            }else{
            System.out.println("El pokemon: "+Nombre+" no existe");
        }
    }


}
