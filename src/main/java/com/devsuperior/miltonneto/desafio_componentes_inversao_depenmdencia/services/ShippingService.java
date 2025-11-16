package com.devsuperior.miltonneto.desafio_componentes_inversao_depenmdencia.services;

import com.devsuperior.miltonneto.desafio_componentes_inversao_depenmdencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    private static final double VALOR_100 = 100.0;
    private static final double VALOR_200 = 200.0;

    private static final double FRETE_100 =  20.0;
    private static final double FRETE_200 =  12.0;
    private static final double FRETE_GRATIS=  0.0;

    public double shipment(Order order){
        double frete = FRETE_GRATIS;
        if (order.valorLiquido() < VALOR_100){
            frete = FRETE_100;
        } else if (order.valorLiquido() < VALOR_200){
            frete = FRETE_200;
        }
        return frete;
    }
}
