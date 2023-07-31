package com.devsuperior.desafio.main;

import com.devsuperior.desafio.entities.Order;
import com.devsuperior.desafio.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {


		SpringApplication.run(DesafioApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do seu pedido.");
		System.out.print("Código: ");
		int code = sc.nextInt();
		System.out.print("Valor básico: ");
		double basic = sc.nextDouble();
		System.out.print("Valor da porcentagem do desconto: ");
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);
		System.out.println("Pedido código " + code);
		System.out.printf("Valor total: R$ %.2f", orderService.total(order));

		sc.close();
	}
}
