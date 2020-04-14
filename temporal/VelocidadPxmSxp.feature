Feature: Test press
Velocidad
  
  Scenario: pasar Pie por minuto a Segundo por pie
  Given iniciar app
    Then presionar menu principal
    Then esperar 1
    Then Scroll al item Velocidad
    Then presionar opcion Velocidad
    Then esperar 1
    Then Seleccionar Unidad Inicial
    Then Scroll al item Pie por minuto
    Then presionar opcion Pie por minuto
    Then Seleccionar Unidad final
    Then Scroll al item Segundos por pie
    Then presionar opcion Segundos por pie
    Then presionar numero 1
    Then presionar numero 1
    Then presionar numero 1
    Then Tomar screenshot Velocidad
    