package com.ar.facade;

/**
 * Facade:
 * El patron facade consiste en la implementacion de una clase el cual sirva como interfaz
 * simple hacia un sistema.
 * 
 * En resumidas palabras, encapsula la funcionalidad compleja. Esto permite que el código cliente 
 * no tenga que preocuparse por los detalles de implementación y solo llame a un método simple y claro. 🚀
 * 
 * 
 * 
*/
public class Main {
    public static void main(String[] args) {
        GestorPedidos gp = new GestorPedidos();
        Pedido pedido = new Pedido(1, "Pizza");
        Cliente cliente = new Cliente(1,"Diaz","Laguna 1234");
        Pago pago = new Pago(1, cliente, 1000);
            
        gp.realizarPedido(cliente, pedido, pago);
    
    }
}