package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio002 {

ArrayList<String> nombres;

    public Ejercicio002() {
        nombres=new ArrayList<>();
    }

    public void GuardarNombre(String nombre){
        nombres.add(nombre);    
    }
    
    public void Mostar(){
        System.out.println(nombres);
        
    }
    
    public void posicion(){
        for(int posi=0;posi<nombres.size();posi++){
            //System.out.print(nombres.get(posi));
            System.out.print((posi+1)+"\t");
           
           
    }     
        }
    
    public void Letra(){
        for (String nombre : nombres) {
            if (!nombre.isEmpty()) {
                char PrimeraLetra=nombre.charAt(0);
                System.out.print(PrimeraLetra+"\t");
            }
        }
        
    }
        
        

    }

