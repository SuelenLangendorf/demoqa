
@cadastro
Feature: cadastrar um novo formulario
  Como usuario
  Quero preencher todos os dados do formulario
  Para realizar o envio e cadastro

  
  Scenario: enviar formulario preenchido
    Given que o usuario esteja no formulario de cadastro
    When preencher todos os campos obrigatorios
    And enviar os dados
    Then validamos os dados cadastrados
    

 
