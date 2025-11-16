package com.devsuperior.miltonneto.desafio_componentes_inversao_depenmdencia.services;

import com.devsuperior.miltonneto.desafio_componentes_inversao_depenmdencia.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;
    public  double total(Order order){
        Double valor = 0.0;
        valor = order.valorLiquido() + shippingService.shipment(order);
        return valor;
    }
}
