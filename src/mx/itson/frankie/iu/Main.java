/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.frankie.iu;

import java.util.ArrayList;
import java.util.List;
import mx.itson.frankie.entidades.Ingrediente;
import mx.itson.frankie.entidades.Receta;
import mx.itson.frankie.enumeradores.Dificultad;

/**
 *
 * @author alumnog
 */
public class Main {
    
   public static void main (String[] args) {
       
       Receta receta = new Receta();
       receta.setNombre("Frankie brownie");
       receta.setDescripción("Hornea una receta divertida para este hallowheen");
       receta.setNumeroPorciones(6);
       receta.setDuracion(62);
       
       List<Ingrediente> ingredientes = new ArrayList<>();
       
       Ingrediente ingrediente1 = new Ingrediente();
       ingrediente1.setNombre("Caja de harina");
       
       Ingrediente ingrediente2 = new Ingrediente();
       ingrediente2.setNombre("3 Cucharadas de agua");
       
       ingredientes.add(ingrediente1);
       ingredientes.add(ingrediente2);
       
       receta.setIngredientes(ingredientes);
       
       //agregas pasos
       
       receta.setDificultad(Dificultad.FACIL);
       
   }
    
}
