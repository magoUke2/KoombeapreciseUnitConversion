Feature: Test press
Area
  
  Scenario: pasar Acre a Rood
  Given iniciar app
    Then presionar menu principal
    Then esperar 1
    Then presionar opcion Area
    Then esperar 1
    Then Seleccionar Unidad Inicial
    Then presionar opcion Acre
    Then Seleccionar Unidad final
    Then presionar opcion Rood
    Then presionar numero 3
    Then presionar numero 1
    Then presionar numero 1
    Then Tomar screenshot area