
@tag
Feature: Inscription Assurance
  je veux m inscrire pour une assurance

  @inscri
  Scenario: Inscription valide
    Given accerder a l URL "https://www.ornikar.com/assurance-auto"
    When cliquer sur le boutton obtient tarif
    When selectionner la recherche par plaque
    And saisir la plaque d immatriculation "DQ325HS"
    Then verifier que la vehicule trouve "MINI MINI"

   