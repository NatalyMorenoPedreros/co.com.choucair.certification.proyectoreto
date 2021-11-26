@Regresion
Feature: UText Creation User
  As I user, i want get into to the form de UText to create a new user

  @scenario1
  Scenario: creation a new user
    Given than Nataly wants check in in the page UText
      | strFirstName | strLastName | strEmail                  | strBirthMonth | strBirthDay | strBirthYear | strCity | strPostal | strCountry | strSOComputer | strVersionComputer | strLanguage | strMobileDevice | strMobileModel | strOperatingSystemMobile | strPassword |
      | Nataly       | Moreno      | nmorenop@uqvirtual.edu.co | September     | 06          | 1999         | Armenia | 630001    | Colombia   | Windows       | 10                 | Spanish     | Motorola        | Moto G5         | Android 7.0             | 020408NmP*  |
    When  she login
      | strEmail                    | strPassword |
      | nmorenop@qvirtual.edu.co    | 020408NmP*  |
    Then she creates her new user
      | strMessage |
      | Nataly     |


 # @scenario2
  #Scenario: creation a new user
   # Given than Nataly wants check in in the page UText
    #  | strFirstName | strLastName | strEmail                  | strBirthMonth | strBirthDay | strBirthYear | strCity | strPostal | strCountry | strSOComputer | strVersionComputer | strLanguage | strMobileDevice | strMobileModel | strOperatingSystemMobile | strPassword |
     # | Nataly       | Moreno      | nmorenop@uqvirtual.edu.co | September     | 06          | 1999         | Armenia | 630001    | Colombia   | Windows       | 10                 | Spanish     | Motorola        | Moto G5         | Android 7.0             | 020408NmP*  |
    #When  she login
     # | strEmail                    | strPassword |
      #| nmorenop@qvirtual.edu.co    | 020408NmP*  |
    #Then she creates her new user
     # | strMessage |
      #| Welcome    |