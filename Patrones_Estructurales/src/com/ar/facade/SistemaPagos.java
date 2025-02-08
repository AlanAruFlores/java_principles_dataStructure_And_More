package com.ar.facade;

public class SistemaPagos {
    final int MAX_PAGOS= 1000;
    Pago[] pagos = new Pago[MAX_PAGOS];
    
    
    public void procesarPago(Pago pago){
        for(int i = 0 ; i < pagos.length; i++){
            if(pagos[i] == null){
               pagos[i] = pago;
                System.out.println("Pago procesado!!");
               break;
            }
        }
    }
}