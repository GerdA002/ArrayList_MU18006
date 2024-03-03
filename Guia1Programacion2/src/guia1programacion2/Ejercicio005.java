package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio005 {
    ArrayList<String> Nombres;

    public Ejercicio005() {
        Nombres=new ArrayList<>();
    }
    
    
    public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);
    }
    
    public void Mostrar(){
     System.out.println("Pokemons:"+Nombres);
    } 
   
    public void Actualizar(int indice,String NuevoPoke){
        System.out.println("Pokemon ha actualizar: "+Nombres.get(indice));
        Nombres.set(indice, NuevoPoke);
        System.out.println("Lista Actualizada:\n"+Nombres);
       
    }
    
}
