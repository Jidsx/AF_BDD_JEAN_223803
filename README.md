# Testes de Sistema de Locação de Carros com BDD com Gherkin

## Descrição
Este projeto utiliza BDD (Behavior-Driven Development) para criar cenários de teste para um sistema de locação de carros. O objetivo é validar o comportamento do sistema em diferentes situações, garantindo que ele atenda às necessidades dos clientes para reservas antecipadas e demandas de última hora. Os testes são escritos em Gherkin e implementados usando Cucumber e Java no Eclipse.

## Tecnologias Utilizadas
- Linguagem de Programação: Java
- Framework de Teste BDD: Cucumber, Junit
- IDE: Eclipse

## Funcionalidades Testadas
- Aluguel de carros de luxo com antecedência de pelo menos uma semana, aplicando desconto especial.
- Aluguel de carros utilitários de última hora, sem reserva prévia, com processamento rápido e custo ajustado conforme a demanda.

## Cenários de Teste
~~~java
@tag
Feature: Sistema de Locação de Carros
  Para garantir uma experiência satisfatória de locação
  Como um cliente
  Eu quero alugar diferentes tipos de carros em diferentes circunstâncias

  # Cenário: Cliente realiza uma reserva de uma semana antecipada de um carro de luxo
  @tag1
  Scenario: Cliente reserva um carro de luxo com uma semana de antecedência
    Given que o cliente deseja alugar um carro de luxo
    And o cliente realiza a reserva com antecedência de pelo menos uma semana
    When o cliente confirma a reserva
    Then o sistema deve oferecer um desconto especial no valor total da locação
    And o valor original da locação é de R$ 2000,00
    And o desconto especial é de 15%
    Then o valor total da locação após o desconto deve ser R$ 1700,00

  # Cenário: Cliente realiza uma locação de última hora de um carro utilitário
  @tag3
  Scenario: Cliente aluga um carro utilitário sem reserva prévia
    Given que o cliente deseja alugar um carro utilitário
    And o cliente não possui uma reserva prévia
    When o cliente solicita a locação do carro utilitário
    Then o sistema deve encontrar um veículo disponível
    And o sistema deve processar a locação rapidamente
    And o custo da locação deve ser um pouco mais elevado devido à demanda urgente e inesperada
    And o valor original da locação é de R$ 800,00
    And o aumento de custo devido à urgência é de 20%
    Then o valor total da locação deve ser R$ 960,00
~~~
No resultado abaixo, temos os cenários e os passos que forma compilados. Temos 2 Cenários e 16 passos indefinidos.

![cucumber_1](https://github.com/Jidsx/AF_BDD_JEAN_223803/assets/113401757/ae60bbfa-2ec4-4685-8099-97394a3a96af)


Nesta outra parte temos a orientação do cucumber no que deve ser implementado dentro do projeto.

![cucumber_2](https://github.com/Jidsx/AF_BDD_JEAN_223803/assets/113401757/a3e0d8fb-e54e-4dc2-a8af-825d764a842d)


Após a criação das classe e utilizar os métodos indicados pelo cucumber. Temos esse resultado

![cucumber_3](https://github.com/Jidsx/AF_BDD_JEAN_223803/assets/113401757/77a90e50-7de0-4ae5-9597-ed8c93fb4d1f)


Utilizando a dependência Cucumber JVM: Junit com a anotação @RunWith

![cucumber_4](https://github.com/Jidsx/AF_BDD_JEAN_223803/assets/113401757/2b2003e4-16ce-497b-ac4a-e252123d0ea7)
