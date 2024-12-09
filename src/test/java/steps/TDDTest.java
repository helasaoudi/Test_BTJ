package steps;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TDDTest {

    // Déclaration de l'objet Etudiant
    etudiant e;

    @Before
    public void setUp() {
        // Initialisation des résultats pour l'étudiant
        ArrayList<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(15);

        // Créer un objet Etudiant avant chaque test
        e = new etudiant();
        e.setLogedin(true);  // Simuler l'étudiant connecté
        e.setListeNote(l);   // Ajouter des résultats pour cet étudiant
    }

    @Test
    public void letudiant_est_connecte_et_dispose_de_resultats_enregistres() {
        // Vérifier si l'étudiant est connecté et dispose de résultats
        boolean res = e.isLogedin() && !e.getListeNote().isEmpty();
        assertTrue("L'étudiant doit être connecté et avoir des résultats enregistrés", res);
    }

   @Test
    public void letudiant_est_connecte_sans_resultats() {
        // Simuler un étudiant connecté mais sans résultats
        etudiant e2 = new etudiant();
        e2.setLogedin(true);  // L'étudiant est connecté, mais n'a pas de notes
        e2.setListeNote(new ArrayList<>());  // Liste vide pour simuler aucun résultat

        // Vérifier si l'étudiant est connecté et ne dispose pas de résultats
        boolean res = e2.isLogedin() && e2.getListeNote().isEmpty();  // Vérification si la liste est vide
        assertTrue("L'étudiant est connecté mais n'a pas de résultats", res);
    }
}
