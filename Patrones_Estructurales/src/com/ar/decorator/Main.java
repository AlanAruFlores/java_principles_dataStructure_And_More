package com.ar.decorator;


/**
 *Se puede utilizar un patrón Decorator para asignar responsabilidades adicionales a un objeto, 
 * ya sea de forma estática o dinámica.
 * 
 * Para lograr estos, el objeto debe estar contenido en sus decoradores y asi sucesivamente
 * 
 * Por ejemplo en un arbol de navidad, podemos tener varios decoradores como las estrellas, esferas
 * y tambien luces. Para lograr estos sus decoradores deben encapsular al objeto principal
 * el cual es el arbol de navidad
 * 
 */


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolNavidad arbolNavidadConDecoraciones = new BulbaLuz(
                new EsferazNavidad(
                        new ArbolNavidadImpl()
                )
        );
        
        System.out.println(arbolNavidadConDecoraciones.decorar());
    
    }
    
}