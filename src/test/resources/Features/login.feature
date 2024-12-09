@loginFeature
Feature: Test de la fonctionnalité de connexion
 @validCredentials
  Scenario: Vérifier l'affichage du tableau des résultats
    Given l'étudiant est connecté et dispose de résultats enregistrés
    When il navigue vers la page des résultats
    Then un tableau affichant les résultats est visible
@invalidCredentials
  Scenario: Vérifier l'affichage du message d'absence de résultats
    Given l'étudiant est connecté mais ne dispose pas de résultats enregistrés
    When il navigue vers la page des résultats
    Then un message indiquant "Aucun résultat disponible" est affiché

