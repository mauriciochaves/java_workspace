
Feature: Rental Cars

  Background:Acesso a aplicação
  Given O usuário acessa à aplicação

    @projeto_final @Scenario1
    Scenario: Pesquisa por carros pequenos
      Given Eu acesso a HomePage
      And  Preencho o local de retirada com "Recife"
      And  Preencho a data de retirada igual à "28" do proximo mês
      And Preencho a data de devolução igual à "28" do proximo mês, referente a data de retirada
      And Preencho a idade do contudor com "25" anos
      And Clico em pesquisar
      When Eu acesso a SearchPage
      And Seleciono a opção "Centro de Recife" para pesquisa
      And Filtro por Depósito de Retirada abaixo de "1250" reais
      And Filtro por "Carros Pequenos"
      Then Valido se a pesquisa retornou resultados

    @projeto_final @Scenario2
    Scenario: Efetuar login na aplicação
      Given Eu acesso a HomePage
      And Clico em Login
      And Preencho o campo email com "testes.sistemas.cesar@gmail.com", senha com "testesdesistemas123" e clico em Login
      And Eu valido a mensagem informando que estou logado com o usuario "Testes Sistemas"
      And Eu clico em Minha Conta
      And Clico em Painel de Controle
      When Eu acesso a MyAccountPage
      Then Valido se estou na Minha Conta

    @projeto_final @Scenario3
    Scenario: Acessar a pagina para efetuar o pagamento
      Given Eu acesso a HomePage
      And Clico em Login
      And Preencho o campo email com "testes.sistemas.cesar@gmail.com", senha com "testesdesistemas123" e clico em Login
      And Eu valido a mensagem informando que estou logado com o usuario "Testes Sistemas"
      And Eu clico em Minha Conta
      When Eu acesso a MyAccountPage
      And Clico em Painel de Controle
      And Clico em Procurar Carro
      And Eu acesso a HomePage
      And Clico em destinos mais buscados
      And Seleciono a opção "Lisboa"
      And Clico em Pesquisar
      And Eu acesso a SearchPage
      And Seleciono Continuar no carro "1" da lista
      And Eu acesso a optionPage
      And Clico em prosseguir o pagamento sem cobertura
      And Eu sou ConductorPage
      And Eu preencho os dados do condutor com Titulo com "Sr", Nome "Testes", Sobrenome "Sistemas", email "testes.sistemas.cesar@gmail.com", telefone "81999080544"
      And clico em reservar
      Then Eu sou PaymentPage
      And Valido se é apresentado os campos para informar os dados de pagamento

    @projeto_final @Scenario4
    Scenario: Solicito um orçamento por email
      Given Eu acesso a HomePage
      And Clico em Login
      And Preencho o campo email com "testes.sistemas.cesar@gmail.com", senha com "testesdesistemas123" e clico em Login
      And Eu valido a mensagem informando que estou logado com o usuario "Testes Sistemas"
      And Eu clico em Minha Conta
      And Eu acesso a MyAccountPage
      And Clico em Painel de Controle
      When Clico em Procurar Carro
      And Eu acesso a HomePage
      And Clico em destinos mais buscados
      And Seleciono a opção "Lisboa"
      And Clico em Pesquisar
      And Eu acesso a SearchPage
      And Clico em Salvar Orçamento
      Then Eu sou BudgetPage
      And Eu preencho o campo Titulo com "Sr", Nome "Testes", Sobrenome "Sistemas", email "testes.sistemas.cesar@gmail.com", telefone "81999080544"
      And clico em enviar email
      And valido a mensagem de sucesso

    @projeto_final @Scenario5
    Scenario: Realizar uma pergunta no Rental Cars
      Given Eu acesso a HomePage
      And  clico em Contato
      When  Eu acesso ContactPage
      And Digito a pergunta "Eu posso fazer um upgrade de carro?" e clico em Pesquisar
      Then Abro a descrição da pergunta feita
      And efetuo like na resposta
      And Valido a mensagem de sucesso é igual à "Obrigado, iremos utilizar sua avaliação para melhorar nossas respostas."







