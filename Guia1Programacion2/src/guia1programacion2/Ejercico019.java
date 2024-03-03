package guia1programacion2;

import java.util.ArrayList;

public class Ejercico019 {

    ArrayList<String>Nombres;

    public Ejercico019() {
        Nombres=new ArrayList<>();
    }
    
    public void GuardadNombre(String Nombre){
        Nombres.add(Nombre);
 }
    
    public void Mostrar(){
   System.out.println(Nombres);
    }
    
    public void Reducir(int CapacidadDeseada){
        ArrayList<String> NuevaLista=new ArrayList<>(CapacidadDeseada);
        for (int ca = 0; ca<Nombres.size() && ca <CapacidadDeseada;ca++) {
            NuevaLista.add(Nombres.get(ca));
        }
       Nombres=NuevaLista;
        System.out.println("Lista despues de la reduccion: "+Nombres);
    }
    
    
}
