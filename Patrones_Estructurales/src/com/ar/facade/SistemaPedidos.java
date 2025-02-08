package com.ar.facade;

public class SistemaPedidos {
    final int MAX_PEDIDOS = 1000;
    Pedido[] pedidos  = new Pedido[MAX_PEDIDOS];
    
    public void crearPedido(Pedido pedido){
        
        for(int i = 0 ; i < pedidos.length; i++){
            if(pedidos[i] == null){
               pedidos[i] = pedido;
                System.out.println("Pedido agregado!!");
               break;
            }
        }
    }
    
}