package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio004 {

    ArrayList<String> nombres;

    public Ejercicio004() {
        nombres=new ArrayList<>();
    }
    
    public void GuardarNombre(String nombre){
        nombres.add(nombre);  
    }
     public void IndiceRecuperado(int indice){
         indice=2;
         String IndiceRecuperado=nombres.get(indice);
         System.out.println("Indice especificado: "+indice);
         System.out.println("Pokemon en el indice "+indice+":"+IndiceRecuperado);
         }
     
     public void Mostar(){
         System.out.println(nombres);
     }

    
}
