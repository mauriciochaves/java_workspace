
Feature: Cesar School

  Background:
  Given O usuario acessa a url do cesar

    @primeiroExercicio
    Scenario: Pesquisa por Especialização
      Given Seleciono a opção saiba mais da especialização
      Given na lateral da tela, clicar na categoria especialização
      When No campo de procura,pesquisar pela especialização "testes"
      When Seleciono uma especialização
      Then Valido se a especialização selecionada apareceu
