package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio006 {
ArrayList<String> Nombres;

    public Ejercicio006() {
        Nombres=new ArrayList<>();
    }

     public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);
 }
    
    public void Mostrar(){
    System.out.println("Pokemons:"+Nombres);
    }
    
    public void Eliminar(int indiceEliminar){
        Nombres.remove(indiceEliminar);
        System.out.println("Lista actualizda:\n"+Nombres);
        
    }

}
