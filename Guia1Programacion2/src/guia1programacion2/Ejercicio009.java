package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio009 {

ArrayList<String> Nombres;

    public Ejercicio009() {
        Nombres=new ArrayList<>();
    }

 public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);
 }
    
    public void Mostrar(){
   System.out.println(Nombres);
    }
    
    public void CopiarArrList(){
     
        ArrayList<String> CopiarNombres=new ArrayList<>();
        CopiarNombres.addAll(Nombres);
        System.out.println("Original ArrayList:\n"+Nombres);
        System.out.println("ArrayList Copiado:\n"+CopiarNombres);
        
    }
}
