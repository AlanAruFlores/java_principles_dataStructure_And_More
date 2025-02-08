package com.ar.facade;

public class GestorPedidos {
    SistemaPedidos sistemaPedidos;
    SistemaPagos sistemaPagos;
    SistemaCocina sistemaCocina;
    SistemaNotificaciones sistemaNotificaciones;
    
    public  GestorPedidos(){
        sistemaPedidos = new SistemaPedidos();
        sistemaPagos = new SistemaPagos();
        sistemaCocina = new SistemaCocina();
        sistemaNotificaciones = new SistemaNotificaciones();        
    }
    
    
    public void realizarPedido(Cliente cliente, Pedido pedido, Pago pago){
        sistemaPedidos.crearPedido(pedido);
        sistemaPagos.procesarPago(pago);
        sistemaCocina.procesarComida();
        sistemaNotificaciones.enviarNotificacion();
    }
}