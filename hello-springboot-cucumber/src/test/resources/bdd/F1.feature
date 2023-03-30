Feature: F1
  Scenario Outline: An invalid module code does not return properties
    Given Module code is not "<ModuleCode>"
    Then do not return properties
    Examples:
      | ModuleCode |
      | BAD        |

  Scenario Outline: An invalid module code does not return properties 2
    Given Module code is not "<ModuleCode>"
    Then do not return properties
    Examples:
      | ModuleCode |
      | BAD2        |

