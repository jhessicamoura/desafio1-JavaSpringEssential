# Desafio 1 - Componentes e Injeção de Dependência

Este repositório contém a solução do **Desafio: Componentes e Injeção de Dependência**, proposto no curso **Java Spring Professional** do **Prof. Dr. Nelio Alves** – [DevSuperior](https://devsuperior.com.br).

## 📚 Descrição do Desafio

O objetivo do desafio é construir um sistema para calcular o valor total de um pedido, aplicando desconto e frete conforme regras pré-definidas. A lógica foi dividida entre serviços especializados, aplicando os conceitos de **componentes**, **injeção de dependência**, e **responsabilidade única**.

---

## 🧰 Tecnologias Utilizadas

- Java
- Spring Boot
- Maven

## 🛠️ Estrutura do Projeto

- `Order`: representa um pedido com código, valor básico e desconto.
- `ShippingService`: calcula o valor do frete com base no valor do pedido.
- `OrderService`: calcula o valor total do pedido, aplicando desconto e adicionando o frete.

A saída do cálculo é exibida no console da aplicação.

---

> Projeto desenvolvido como parte do curso Java Spring Professional da DevSuperior.
