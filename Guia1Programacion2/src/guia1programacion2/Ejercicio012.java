package guia1programacion2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio012 {

ArrayList<String> Nombres;

    public Ejercicio012() {
        Nombres=new ArrayList<>();
    }
    
    public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);
 }
    
    public void Mostrar(){
   System.out.println(Nombres);
    }

   public void Extraer(int IndiceInicio,int Indicefinal){
       
     List<String>SubNombres= Nombres.subList(IndiceInicio, Indicefinal);
       System.out.println("Indice de Inicio: "+IndiceInicio);
       System.out.println("Indice Final: "+Indicefinal);
       System.out.println("Porcion extraida:\n"+SubNombres);
           
   }
    

    
}
