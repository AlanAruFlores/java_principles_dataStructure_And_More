package com.ar.decorator;


public class BulbaLuz extends ArbolDecorador{
    
    public BulbaLuz(ArbolNavidad arbolNavidad) {
        super(arbolNavidad);
    }
    
    @Override
    public String decorar() {
        return this.arbolNavidad.decorar() + " "+decorarConBulbasLuz();
    }
    
    public String decorarConBulbasLuz(){
        return "con bulbas de luz";
    }
    
    
}