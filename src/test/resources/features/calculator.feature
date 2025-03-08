Feature: Calculator support sum
  I want to do sum with my calculator

  Scenario Outline: Add two numbers
    Given I have a sum function
    When I add <operandA> and <operandB>
    Then the result should be <result>

  Examples:
    | operandA | operandB | result |
    | 1        | 2        | 3      |
    | 3        | 4        | 7      |
    | 7        | -2       | 5      |
