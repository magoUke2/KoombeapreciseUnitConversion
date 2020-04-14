Feature: Test press
Longitud
  
  Scenario: pasar Mil a Cadena longitud
  Given iniciar app
    Then presionar menu principal
    Then esperar 1
    Then presionar opcion Longitud
    Then esperar 1
    Then Seleccionar Unidad Inicial
    Then presionar opcion Mil
    Then Seleccionar Unidad final
    Then presionar opcion Cadena
    Then presionar numero 9
    Then presionar numero 2
    Then presionar numero 4
    Then Tomar screenshot Longitud