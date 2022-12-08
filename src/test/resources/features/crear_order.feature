Feature: Crear order PetStore

  @test1
  Scenario Outline: Crear Order

    When creo la orden con id <id>, petId <petId>, quantity <quantity>
    Then el código de respuesta es 200
    And el id es <id>
    Examples:
      | id | petId | quantity|
      | 16 | 5     | 3       |
      | 18 | 7     | 2       |
      | 19 | 4     | 1       |
      | 20 | 6     | 3       |
