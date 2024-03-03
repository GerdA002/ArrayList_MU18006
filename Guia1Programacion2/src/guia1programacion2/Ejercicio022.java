package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio022 {

ArrayList<String>Nombres;

    public Ejercicio022() {
        Nombres=new ArrayList<>();
    }
    
    public void GuardarNombre(String Nombre){
        Nombres.add(Nombre);
 }
    
    
    public void MostrarSegunPosicion(){
        for ( int posi = 0; posi <Nombres.size(); posi++) {
            //System.out.println("Lista segun posiciones:");
            System.out.println("Posicion "+posi+":"+Nombres.get(posi));
        }
    }




    
}
