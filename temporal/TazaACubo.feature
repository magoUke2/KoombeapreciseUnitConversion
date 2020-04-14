Feature: Test press
Volumen
  
  Scenario: pasar Taza a cubo 600
  Given iniciar app
    Then presionar menu principal
    Then esperar 1
    Then presionar opcion Volumen
    Then esperar 1
    Then Seleccionar Unidad Inicial
    Then presionar opcion Taza
    Then Seleccionar Unidad final
    Then presionar opcion Cubo
    Then presionar numero 6
    Then presionar numero 0
    Then presionar numero 0
    Then Tomar screenshot Volumen