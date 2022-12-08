Feature: Obtener Order PetStore

  @test2
  Scenario Outline: obtener order

    When quiero la orden con id <id>
    Then response Code es 200
    And ID: <id>
    Examples:
      | id |
      | 16 |
      | 18 |
      | 19 |
      | 20 |
