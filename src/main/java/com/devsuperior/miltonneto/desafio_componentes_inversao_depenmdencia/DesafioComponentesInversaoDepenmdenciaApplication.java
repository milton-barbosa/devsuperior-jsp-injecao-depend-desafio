package com.devsuperior.miltonneto.desafio_componentes_inversao_depenmdencia;

import com.devsuperior.miltonneto.desafio_componentes_inversao_depenmdencia.entities.Order;
import com.devsuperior.miltonneto.desafio_componentes_inversao_depenmdencia.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioComponentesInversaoDepenmdenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioComponentesInversaoDepenmdenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		pedido(1034, 150.0, 20.0);
		pedido(2282, 800.0, 10.0);
		pedido(1309, 95.90, 0.0);
	}

	private void pedido(Integer code, Double basic, Double discount){
		Order order = new Order(code, basic, discount);
		System.out.printf("Pedido: %d \nValor: R$ %.2f \n", order.getCode(), orderService.total(order));
	}
}
