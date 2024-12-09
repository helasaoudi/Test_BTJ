package steps;

import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentBehaviorTest {
	
    @Given("l'étudiant est connecté et dispose de résultats enregistrés")
    public void letudiant_est_connecte_et_dispose_de_resultats_enregistres() {
        System.out.println("L'étudiant est connecté et dispose de résultats enregistrés.");
    }

    @When("il navigue vers la page des résultats")
    public void il_navigue_vers_la_page_des_resultats() {
        System.out.println("L'étudiant navigue vers la page des résultats.");
    }

    @Then("un tableau affichant les résultats est visible")
    public void un_tableau_affichant_les_resultats_est_visible() {
        System.out.println("Un tableau affichant les résultats est visible.");
    }
    
    @Given("l'étudiant est connecté mais ne dispose pas de résultats enregistrés")
    public void letudiant_est_connecte_mais_ne_dispose_pas_de_resultats_enregistres() {
        System.out.println("L'étudiant est connecté mais ne dispose pas de résultats enregistrés.");
    }

    @When("il navigue vers la page des résultats invalid")
    public void il_navigue_vers_la_page_des_resultats_invalides() {
        // Code pour simuler la navigation vers la page des résultats lorsque l'étudiant n'a pas de résultats
        System.out.println("L'étudiant navigue vers la page des résultats, mais il n'y a pas de résultats.");
    }

    @Then("un message indiquant {string} est affiché")
    public void un_message_indiquant_est_affiche(String message) {
        // Code pour vérifier que le message est affiché
        System.out.println("Message affiché: " + message);
    }
}
