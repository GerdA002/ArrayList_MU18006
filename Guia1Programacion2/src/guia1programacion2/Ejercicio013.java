package guia1programacion2;

import java.util.ArrayList;

public class Ejercicio013 {

ArrayList<String> Nombres;
ArrayList<String>Nombres1;

    public Ejercicio013() {
        Nombres=new ArrayList<>();
        Nombres1=new ArrayList<>();
    }

    public void GuardadNombre(){
        Nombres.add("Pikachu");
        Nombres.add("Charizrd");
        Nombres.add("Bulbasur");
        Nombres1.add("Bulbasur");
        Nombres1.add("Squirtle");
        Nombres1.add("Jigglypuff");
 }
    
    public void Mostrar(){
   System.out.println("Conjunto de pokemons #1: "+Nombres);
        System.out.println("Conjunto de pokemons #2: "+Nombres1);
    }

    public void Comparar(){
        boolean SonIguales=Nombres.equals(Nombres1);
        if (SonIguales) {
            System.out.println("Los conjuntos son iguales?, SI");
        }else{
            System.out.println("los conjuntos son iguales?, No");
        }
    }

    
}
