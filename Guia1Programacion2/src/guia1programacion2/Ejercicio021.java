package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio021 {
    
    ArrayList<String>Nombres;

    public Ejercicio021() {
        Nombres=new ArrayList<>();
            }
    
      public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);
 }
    
    public void Mostrar(){
   System.out.println(Nombres);
    }
    
    public void Remplazar(int indice,String NuevoPoke){
        System.out.println("Pokemon ha actualizar: "+Nombres.get(indice));
        Nombres.set(indice, NuevoPoke);
        System.out.println("Lista Actualizada:\n"+Nombres);
       
    }
    
    
    
}
