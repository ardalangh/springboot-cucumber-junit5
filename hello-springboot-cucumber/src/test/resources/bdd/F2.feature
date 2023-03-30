Feature: F2
  Scenario Outline: An invalid module code does not return properties 2
    Given Service code is not "<ServiceCode>"
    Then do not return properties
    Examples:
      | ServiceCode |
      | BAD        |

