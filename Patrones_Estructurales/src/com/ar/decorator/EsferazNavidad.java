package com.ar.decorator;

public class EsferazNavidad extends ArbolDecorador {
    
    public EsferazNavidad(ArbolNavidad arbolNavidad) {
        super(arbolNavidad);
    }
    
        @Override
    public String decorar() {
        return this.arbolNavidad.decorar() + " "+decorarConEsferas();
    }
    
    public String decorarConEsferas(){
        
        return "con esferas de navidad";
    }
    
}