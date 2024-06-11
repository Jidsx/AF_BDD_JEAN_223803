#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

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
