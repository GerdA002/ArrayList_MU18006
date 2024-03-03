package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio003 {

    ArrayList<String> nombres;

    public Ejercicio003() {
        nombres=new ArrayList<>();
    }
    
    
    public void GuardaNombre(String nombre){
        nombres.add(nombre);
        System.out.print("Entrada:");
        System.out.println(nombre);
       
    }
    
    public void AgregarPsosicion1(String NUevoNombre){
        nombres.add(0, NUevoNombre);
        System.out.println("Nuevo pokemon insertado: "+NUevoNombre);
    }
    
    public void mostrar(){
        System.out.println("Lista despues de la insercion ");
            System.out.println(nombres+"\n");
        
    }


    
}
