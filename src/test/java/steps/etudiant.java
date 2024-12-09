package steps;

import java.util.ArrayList;

public class etudiant {
private boolean  logedin ;


private ArrayList<Integer> ListeNote ;
public boolean isLogedin() {
	return logedin;
}
public etudiant() {
	super();
	ListeNote=new ArrayList<>();
}
public void setLogedin(boolean logedin) {
	this.logedin = logedin;
}
public ArrayList<Integer> getListeNote() {
	return ListeNote;
}
public void setListeNote(ArrayList<Integer> listeNote) {
	ListeNote = listeNote;
}
public etudiant(boolean logedin, ArrayList<Integer> listeNote) {
	super();
	this.logedin = logedin;
	ListeNote = listeNote;
}


}
