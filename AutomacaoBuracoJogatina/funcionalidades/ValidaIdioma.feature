
@tag
Feature: Valida Idioma na tela Inicial Home

  Background: 
    Given O aplicativo foi carregado
    And O dispositivo possui conexão com a internet

  @tag1
  Scenario: Valida Idioma PT
    Given O dispositivo possui língua Portuguesa como padrão
    When Fecha a tela de anúncio (mainLayout)
    And O sistema carrega a tela inicial Home (mainScreenLayoutRoot)
    Then Verifica que as labels

  @tag2
  Scenario: Valida Idioma EN
    Given O dispositivo possui língua Inglesa como padrão
    When Fecha a tela de anúncio (mainLayout)
    And O sistema carrega a tela inicial Home (mainScreenLayoutRoot)
    Then Verifica que as labels

  @tag3
  Scenario: Valida Troca de Idiomas PT para EN
    Given O dispositivo possui língua Portuguesa como padrão
    When Fecha a tela de anúncio (mainLayout)
    And O sistema carrega a tela inicial Home em português (mainScreenLayoutRoot)
    Then Verifica as labels da tela inicial Home em português
    When Sem fechar o aplicativo, muda a língua do dispositivo de PT para EN
    And Acessa novamente o aplicativo
    And O sistema carrega a tela inicial Home em inglês
    Then Verifica as labels da tela inicial Home em inglês