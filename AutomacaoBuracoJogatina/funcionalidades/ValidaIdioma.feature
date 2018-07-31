
@tag
Feature: Valida Idioma na tela Inicial Home

  Background: 
    Given O aplicativo foi carregado
    And O dispositivo possui conex�o com a internet

  @tag1
  Scenario: Valida Idioma PT
    Given O dispositivo possui l�ngua Portuguesa como padr�o
    When Fecha a tela de an�ncio (mainLayout)
    And O sistema carrega a tela inicial Home (mainScreenLayoutRoot)
    Then Verifica que as labels

  @tag2
  Scenario: Valida Idioma EN
    Given O dispositivo possui l�ngua Inglesa como padr�o
    When Fecha a tela de an�ncio (mainLayout)
    And O sistema carrega a tela inicial Home (mainScreenLayoutRoot)
    Then Verifica que as labels

  @tag3
  Scenario: Valida Troca de Idiomas PT para EN
    Given O dispositivo possui l�ngua Portuguesa como padr�o
    When Fecha a tela de an�ncio (mainLayout)
    And O sistema carrega a tela inicial Home em portugu�s (mainScreenLayoutRoot)
    Then Verifica as labels da tela inicial Home em portugu�s
    When Sem fechar o aplicativo, muda a l�ngua do dispositivo de PT para EN
    And Acessa novamente o aplicativo
    And O sistema carrega a tela inicial Home em ingl�s
    Then Verifica as labels da tela inicial Home em ingl�s