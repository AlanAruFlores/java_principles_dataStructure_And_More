package com.ar.decorator;


public abstract class ArbolDecorador implements ArbolNavidad{

    ArbolNavidad arbolNavidad;
    
    public ArbolDecorador(ArbolNavidad arbolNavidad){
        this.arbolNavidad = arbolNavidad;
    }
    
    @Override
    public String decorar() {
        return this.arbolNavidad.decorar();
    }
    
}