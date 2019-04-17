
Feature: Rental Cars

  Background:Acesso a aplicação Rental Cars
  Given O usuário acessa à aplicação

    @projeto_final @Scenario1
    Scenario: Pesquisar por carros pequenos
      Given A página inicial está carregada com sucesso
      And  preencho o local de retirada com "Recife"
      And  data de retirada igual à "28" do mês atual e data de devolução igual à "30" do próximo mês
      And  idade do contudor com "25" anos
      And clico em pesquisar
      When A página de pesquisa está carregada com sucesso
      And filtro por depósito de retirada abaixo de "1,250" reais
      And filtro por "Carros Pequenos"
      Then Verifico se a pesquisa retornou resultados

    @projeto_final @Scenario2
    Scenario: Efetuar login na aplicação
      Given A página inicial está carregada com sucesso
      And clico em Login
      And preencho o campo e-mail com "testes.sistemas.cesar@gmail.com", senha com "testesdesistemas123" e clico em Login
      And valido a mensagem informando que estou logado com o usuário "Testes Sistemas"
      And clico em Minha Conta
      And clico em Painel de Controle
      When a página da minha conta está carregada com sucesso
      Then Verifico se é apresentada Minha Conta

    @projeto_final @Scenario3
    Scenario: Acessar a página de pagamento sem o usuário está logado
      Given A página inicial está carregada com sucesso
      And clico em destinos mais buscados
      And seleciono a opção "Lisboa"
      And clico em pesquisar
      When A página de pesquisa está carregada com sucesso
      And seleciono Continuar no carro "Peugeot 208" da lista de resultados
      And A página de opções está carregada com sucesso
      And clico em Prosseguir ao pagamento sem cobertura superior
      And A página do condutor do veículo carregada com sucesso
      And preencho os dados do condutor onde Título é: "Sr", Nome: "Testes", Sobrenome: "Sistemas", email: "testes.sistemas.cesar@gmail.com", Telefone: "81999080544"
      And clico em reservar
      Then A página de pagamento está carregada com sucesso
      And Valido apresentação dos campos necessários para informar os dados de pagamento

    @projeto_final @Scenario4
    Scenario: Solicito um orçamento por email
      Given A página inicial está carregada com sucesso
      And clico em destinos mais buscados
      And seleciono a opção "Porto"
      And clico em pesquisar
      When A página de pesquisa está carregada com sucesso
      And clico em Salvar Orçamento no carro "Seat Leon" da lista de resultados
      Then A página de orçamento está carregada com sucesso
      And preencho os dados do condutor onde Nome: "Testes", Sobrenome: "Sistemas", email: "testes.sistemas.cesar@gmail.com", Telefone: "81999080544"
      And clico em Enviar Email
      And Verifico a mensagem de sucesso

    @projeto_final @Scenario5
    Scenario: Realizar uma pergunta no Rental Cars
      Given A página inicial está carregada com sucesso
      And  clico em Contato
      When  A página de ajuda e suporte está carregada com sucesso
      And informo a pergunta: "Eu posso fazer um upgrade de carro?" e clico em Pesquisar
      Then abro a descrição da pergunta feita
      And efetuo like na resposta
      And Verifico a mensagem de exibida
